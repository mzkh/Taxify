package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.support.v4.widget.ExploreByTouchHelper;
import android.support.v7.appcompat.C0093R;
import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.gms.cast.TextTrackStyle;

abstract class AbsActionBarView extends ViewGroup {
    private static final int FADE_DURATION = 200;
    private static final Interpolator sAlphaInterpolator;
    protected ActionMenuPresenter mActionMenuPresenter;
    protected int mContentHeight;
    protected ActionMenuView mMenuView;
    protected final Context mPopupContext;
    protected boolean mSplitActionBar;
    protected ViewGroup mSplitView;
    protected boolean mSplitWhenNarrow;
    protected final VisibilityAnimListener mVisAnimListener;
    protected ViewPropertyAnimatorCompat mVisibilityAnim;

    /* renamed from: android.support.v7.internal.widget.AbsActionBarView.1 */
    class C00951 implements Runnable {
        C00951() {
        }

        public void run() {
            AbsActionBarView.this.showOverflowMenu();
        }
    }

    protected class VisibilityAnimListener implements ViewPropertyAnimatorListener {
        private boolean mCanceled;
        int mFinalVisibility;

        protected VisibilityAnimListener() {
            this.mCanceled = false;
        }

        public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat animation, int visibility) {
            AbsActionBarView.this.mVisibilityAnim = animation;
            this.mFinalVisibility = visibility;
            return this;
        }

        public void onAnimationStart(View view) {
            AbsActionBarView.this.setVisibility(0);
            this.mCanceled = false;
        }

        public void onAnimationEnd(View view) {
            if (!this.mCanceled) {
                AbsActionBarView.this.mVisibilityAnim = null;
                AbsActionBarView.this.setVisibility(this.mFinalVisibility);
                if (AbsActionBarView.this.mSplitView != null && AbsActionBarView.this.mMenuView != null) {
                    AbsActionBarView.this.mMenuView.setVisibility(this.mFinalVisibility);
                }
            }
        }

        public void onAnimationCancel(View view) {
            this.mCanceled = true;
        }
    }

    static {
        sAlphaInterpolator = new DecelerateInterpolator();
    }

    AbsActionBarView(Context context) {
        this(context, null);
    }

    AbsActionBarView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    AbsActionBarView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.mVisAnimListener = new VisibilityAnimListener();
        TypedValue tv = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0093R.attr.actionBarPopupTheme, tv, true) || tv.resourceId == 0) {
            this.mPopupContext = context;
        } else {
            this.mPopupContext = new ContextThemeWrapper(context, tv.resourceId);
        }
    }

    protected void onConfigurationChanged(Configuration newConfig) {
        if (VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(newConfig);
        }
        TypedArray a = getContext().obtainStyledAttributes(null, C0093R.styleable.ActionBar, C0093R.attr.actionBarStyle, 0);
        setContentHeight(a.getLayoutDimension(C0093R.styleable.ActionBar_height, 0));
        a.recycle();
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.onConfigurationChanged(newConfig);
        }
    }

    public void setSplitToolbar(boolean split) {
        this.mSplitActionBar = split;
    }

    public void setSplitWhenNarrow(boolean splitWhenNarrow) {
        this.mSplitWhenNarrow = splitWhenNarrow;
    }

    public void setContentHeight(int height) {
        this.mContentHeight = height;
        requestLayout();
    }

    public int getContentHeight() {
        return this.mContentHeight;
    }

    public void setSplitView(ViewGroup splitView) {
        this.mSplitView = splitView;
    }

    public int getAnimatedVisibility() {
        if (this.mVisibilityAnim != null) {
            return this.mVisAnimListener.mFinalVisibility;
        }
        return getVisibility();
    }

    public void animateToVisibility(int visibility) {
        if (this.mVisibilityAnim != null) {
            this.mVisibilityAnim.cancel();
        }
        ViewPropertyAnimatorCompat anim;
        if (visibility == 0) {
            if (getVisibility() != 0) {
                ViewCompat.setAlpha(this, 0.0f);
                if (!(this.mSplitView == null || this.mMenuView == null)) {
                    ViewCompat.setAlpha(this.mMenuView, 0.0f);
                }
            }
            anim = ViewCompat.animate(this).alpha(TextTrackStyle.DEFAULT_FONT_SCALE);
            anim.setDuration(200);
            anim.setInterpolator(sAlphaInterpolator);
            if (this.mSplitView == null || this.mMenuView == null) {
                anim.setListener(this.mVisAnimListener.withFinalVisibility(anim, visibility));
                anim.start();
                return;
            }
            ViewPropertyAnimatorCompatSet set = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat splitAnim = ViewCompat.animate(this.mMenuView).alpha(TextTrackStyle.DEFAULT_FONT_SCALE);
            splitAnim.setDuration(200);
            set.setListener(this.mVisAnimListener.withFinalVisibility(anim, visibility));
            set.play(anim).play(splitAnim);
            set.start();
            return;
        }
        anim = ViewCompat.animate(this).alpha(0.0f);
        anim.setDuration(200);
        anim.setInterpolator(sAlphaInterpolator);
        if (this.mSplitView == null || this.mMenuView == null) {
            anim.setListener(this.mVisAnimListener.withFinalVisibility(anim, visibility));
            anim.start();
            return;
        }
        set = new ViewPropertyAnimatorCompatSet();
        splitAnim = ViewCompat.animate(this.mMenuView).alpha(0.0f);
        splitAnim.setDuration(200);
        set.setListener(this.mVisAnimListener.withFinalVisibility(anim, visibility));
        set.play(anim).play(splitAnim);
        set.start();
    }

    public boolean showOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.showOverflowMenu();
        }
        return false;
    }

    public void postShowOverflowMenu() {
        post(new C00951());
    }

    public boolean hideOverflowMenu() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.hideOverflowMenu();
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.isOverflowMenuShowing();
        }
        return false;
    }

    public boolean isOverflowMenuShowPending() {
        if (this.mActionMenuPresenter != null) {
            return this.mActionMenuPresenter.isOverflowMenuShowPending();
        }
        return false;
    }

    public boolean isOverflowReserved() {
        return this.mActionMenuPresenter != null && this.mActionMenuPresenter.isOverflowReserved();
    }

    public boolean canShowOverflowMenu() {
        return isOverflowReserved() && getVisibility() == 0;
    }

    public void dismissPopupMenus() {
        if (this.mActionMenuPresenter != null) {
            this.mActionMenuPresenter.dismissPopupMenus();
        }
    }

    protected int measureChildView(View child, int availableWidth, int childSpecHeight, int spacing) {
        child.measure(MeasureSpec.makeMeasureSpec(availableWidth, ExploreByTouchHelper.INVALID_ID), childSpecHeight);
        return Math.max(0, (availableWidth - child.getMeasuredWidth()) - spacing);
    }

    protected static int next(int x, int val, boolean isRtl) {
        return isRtl ? x - val : x + val;
    }

    protected int positionChild(View child, int x, int y, int contentHeight, boolean reverse) {
        int childWidth = child.getMeasuredWidth();
        int childHeight = child.getMeasuredHeight();
        int childTop = y + ((contentHeight - childHeight) / 2);
        if (reverse) {
            child.layout(x - childWidth, childTop, x, childTop + childHeight);
        } else {
            child.layout(x, childTop, x + childWidth, childTop + childHeight);
        }
        return reverse ? -childWidth : childWidth;
    }
}
