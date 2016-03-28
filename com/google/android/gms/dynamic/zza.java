package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class zza<T extends LifecycleDelegate> {
    private T zzXN;
    private Bundle zzXO;
    private LinkedList<zza> zzXP;
    private final zzf<T> zzXQ;

    /* renamed from: com.google.android.gms.dynamic.zza.5 */
    static class C01545 implements OnClickListener {
        final /* synthetic */ int zzXY;
        final /* synthetic */ Context zznK;

        C01545(Context context, int i) {
            this.zznK = context;
            this.zzXY = i;
        }

        public void onClick(View v) {
            this.zznK.startActivity(GooglePlayServicesUtil.zzan(this.zzXY));
        }
    }

    private interface zza {
        int getState();

        void zzb(LifecycleDelegate lifecycleDelegate);
    }

    /* renamed from: com.google.android.gms.dynamic.zza.1 */
    class C03621 implements zzf<T> {
        final /* synthetic */ zza zzXR;

        C03621(zza com_google_android_gms_dynamic_zza) {
            this.zzXR = com_google_android_gms_dynamic_zza;
        }

        public void zza(T t) {
            this.zzXR.zzXN = t;
            Iterator it = this.zzXR.zzXP.iterator();
            while (it.hasNext()) {
                ((zza) it.next()).zzb(this.zzXR.zzXN);
            }
            this.zzXR.zzXP.clear();
            this.zzXR.zzXO = null;
        }
    }

    /* renamed from: com.google.android.gms.dynamic.zza.2 */
    class C03632 implements zza {
        final /* synthetic */ zza zzXR;
        final /* synthetic */ Activity zzXS;
        final /* synthetic */ Bundle zzXT;
        final /* synthetic */ Bundle zzXU;

        C03632(zza com_google_android_gms_dynamic_zza, Activity activity, Bundle bundle, Bundle bundle2) {
            this.zzXR = com_google_android_gms_dynamic_zza;
            this.zzXS = activity;
            this.zzXT = bundle;
            this.zzXU = bundle2;
        }

        public int getState() {
            return 0;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            this.zzXR.zzXN.onInflate(this.zzXS, this.zzXT, this.zzXU);
        }
    }

    /* renamed from: com.google.android.gms.dynamic.zza.3 */
    class C03643 implements zza {
        final /* synthetic */ zza zzXR;
        final /* synthetic */ Bundle zzXU;

        C03643(zza com_google_android_gms_dynamic_zza, Bundle bundle) {
            this.zzXR = com_google_android_gms_dynamic_zza;
            this.zzXU = bundle;
        }

        public int getState() {
            return 1;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            this.zzXR.zzXN.onCreate(this.zzXU);
        }
    }

    /* renamed from: com.google.android.gms.dynamic.zza.4 */
    class C03654 implements zza {
        final /* synthetic */ zza zzXR;
        final /* synthetic */ Bundle zzXU;
        final /* synthetic */ FrameLayout zzXV;
        final /* synthetic */ LayoutInflater zzXW;
        final /* synthetic */ ViewGroup zzXX;

        C03654(zza com_google_android_gms_dynamic_zza, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.zzXR = com_google_android_gms_dynamic_zza;
            this.zzXV = frameLayout;
            this.zzXW = layoutInflater;
            this.zzXX = viewGroup;
            this.zzXU = bundle;
        }

        public int getState() {
            return 2;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            this.zzXV.removeAllViews();
            this.zzXV.addView(this.zzXR.zzXN.onCreateView(this.zzXW, this.zzXX, this.zzXU));
        }
    }

    /* renamed from: com.google.android.gms.dynamic.zza.6 */
    class C03666 implements zza {
        final /* synthetic */ zza zzXR;

        C03666(zza com_google_android_gms_dynamic_zza) {
            this.zzXR = com_google_android_gms_dynamic_zza;
        }

        public int getState() {
            return 4;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            this.zzXR.zzXN.onStart();
        }
    }

    /* renamed from: com.google.android.gms.dynamic.zza.7 */
    class C03677 implements zza {
        final /* synthetic */ zza zzXR;

        C03677(zza com_google_android_gms_dynamic_zza) {
            this.zzXR = com_google_android_gms_dynamic_zza;
        }

        public int getState() {
            return 5;
        }

        public void zzb(LifecycleDelegate lifecycleDelegate) {
            this.zzXR.zzXN.onResume();
        }
    }

    public zza() {
        this.zzXQ = new C03621(this);
    }

    private void zza(Bundle bundle, zza com_google_android_gms_dynamic_zza_zza) {
        if (this.zzXN != null) {
            com_google_android_gms_dynamic_zza_zza.zzb(this.zzXN);
            return;
        }
        if (this.zzXP == null) {
            this.zzXP = new LinkedList();
        }
        this.zzXP.add(com_google_android_gms_dynamic_zza_zza);
        if (bundle != null) {
            if (this.zzXO == null) {
                this.zzXO = (Bundle) bundle.clone();
            } else {
                this.zzXO.putAll(bundle);
            }
        }
        zza(this.zzXQ);
    }

    public static void zzb(FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        int isGooglePlayServicesAvailable = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        CharSequence zze = GooglePlayServicesUtil.zze(context, isGooglePlayServicesAvailable);
        CharSequence zzf = GooglePlayServicesUtil.zzf(context, isGooglePlayServicesAvailable);
        View linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        View textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new LayoutParams(-2, -2));
        textView.setText(zze);
        linearLayout.addView(textView);
        if (zzf != null) {
            View button = new Button(context);
            button.setLayoutParams(new LayoutParams(-2, -2));
            button.setText(zzf);
            linearLayout.addView(button);
            button.setOnClickListener(new C01545(context, isGooglePlayServicesAvailable));
        }
    }

    private void zzdd(int i) {
        while (!this.zzXP.isEmpty() && ((zza) this.zzXP.getLast()).getState() >= i) {
            this.zzXP.removeLast();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        zza(savedInstanceState, new C03643(this, savedInstanceState));
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FrameLayout frameLayout = new FrameLayout(inflater.getContext());
        zza(savedInstanceState, new C03654(this, frameLayout, inflater, container, savedInstanceState));
        if (this.zzXN == null) {
            zza(frameLayout);
        }
        return frameLayout;
    }

    public void onDestroy() {
        if (this.zzXN != null) {
            this.zzXN.onDestroy();
        } else {
            zzdd(1);
        }
    }

    public void onDestroyView() {
        if (this.zzXN != null) {
            this.zzXN.onDestroyView();
        } else {
            zzdd(2);
        }
    }

    public void onInflate(Activity activity, Bundle attrs, Bundle savedInstanceState) {
        zza(savedInstanceState, new C03632(this, activity, attrs, savedInstanceState));
    }

    public void onLowMemory() {
        if (this.zzXN != null) {
            this.zzXN.onLowMemory();
        }
    }

    public void onPause() {
        if (this.zzXN != null) {
            this.zzXN.onPause();
        } else {
            zzdd(5);
        }
    }

    public void onResume() {
        zza(null, new C03677(this));
    }

    public void onSaveInstanceState(Bundle outState) {
        if (this.zzXN != null) {
            this.zzXN.onSaveInstanceState(outState);
        } else if (this.zzXO != null) {
            outState.putAll(this.zzXO);
        }
    }

    public void onStart() {
        zza(null, new C03666(this));
    }

    public void onStop() {
        if (this.zzXN != null) {
            this.zzXN.onStop();
        } else {
            zzdd(4);
        }
    }

    protected void zza(FrameLayout frameLayout) {
        zzb(frameLayout);
    }

    protected abstract void zza(zzf<T> com_google_android_gms_dynamic_zzf_T);

    public T zzlg() {
        return this.zzXN;
    }
}
