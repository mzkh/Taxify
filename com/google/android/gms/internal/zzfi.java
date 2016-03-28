package com.google.android.gms.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import java.util.LinkedList;
import java.util.List;

@zzgi
public class zzfi {
    private static final Object zznh;
    private static final String zzvs;
    private static zzfi zzvu;
    private final zza zzvt;

    public class zza extends SQLiteOpenHelper {
        final /* synthetic */ zzfi zzvv;

        public zza(zzfi com_google_android_gms_internal_zzfi, Context context, String str) {
            this.zzvv = com_google_android_gms_internal_zzfi;
            super(context, str, null, 4);
        }

        public void onCreate(SQLiteDatabase db) {
            db.execSQL(zzfi.zzvs);
        }

        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            zzhx.zzaa("Database updated from version " + oldVersion + " to version " + newVersion);
            db.execSQL("DROP TABLE IF EXISTS InAppPurchase");
            onCreate(db);
        }
    }

    static {
        zzvs = String.format("CREATE TABLE IF NOT EXISTS %s ( %s INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, %s TEXT NOT NULL, %s TEXT NOT NULL, %s INTEGER)", new Object[]{"InAppPurchase", "purchase_id", "product_id", "developer_payload", "record_time"});
        zznh = new Object();
    }

    zzfi(Context context) {
        this.zzvt = new zza(this, context, "google_inapp_purchase.db");
    }

    public static zzfi zzm(Context context) {
        zzfi com_google_android_gms_internal_zzfi;
        synchronized (zznh) {
            if (zzvu == null) {
                zzvu = new zzfi(context);
            }
            com_google_android_gms_internal_zzfi = zzvu;
        }
        return com_google_android_gms_internal_zzfi;
    }

    public int getRecordCount() {
        Cursor cursor = null;
        int i = 0;
        synchronized (zznh) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
            } else {
                try {
                    cursor = writableDatabase.rawQuery("select count(*) from InAppPurchase", null);
                    if (cursor.moveToFirst()) {
                        i = cursor.getInt(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                    } else {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (SQLiteException e) {
                    zzhx.zzac("Error getting record count" + e.getMessage());
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
        return i;
    }

    public SQLiteDatabase getWritableDatabase() {
        try {
            return this.zzvt.getWritableDatabase();
        } catch (SQLiteException e) {
            zzhx.zzac("Error opening writable conversion tracking database");
            return null;
        }
    }

    public zzfg zza(Cursor cursor) {
        return cursor == null ? null : new zzfg(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
    }

    public void zza(zzfg com_google_android_gms_internal_zzfg) {
        if (com_google_android_gms_internal_zzfg != null) {
            synchronized (zznh) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                writableDatabase.delete("InAppPurchase", String.format("%s = %d", new Object[]{"purchase_id", Long.valueOf(com_google_android_gms_internal_zzfg.zzvm)}), null);
            }
        }
    }

    public void zzb(zzfg com_google_android_gms_internal_zzfg) {
        if (com_google_android_gms_internal_zzfg != null) {
            synchronized (zznh) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("product_id", com_google_android_gms_internal_zzfg.zzvo);
                contentValues.put("developer_payload", com_google_android_gms_internal_zzfg.zzvn);
                contentValues.put("record_time", Long.valueOf(SystemClock.elapsedRealtime()));
                com_google_android_gms_internal_zzfg.zzvm = writableDatabase.insert("InAppPurchase", null, contentValues);
                if (((long) getRecordCount()) > 20000) {
                    zzdz();
                }
            }
        }
    }

    public void zzdz() {
        SQLiteException e;
        synchronized (zznh) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            Cursor query;
            try {
                query = writableDatabase.query("InAppPurchase", null, null, null, null, null, "record_time ASC", "1");
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            zza(zza(query));
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        try {
                            zzhx.zzac("Error remove oldest record" + e.getMessage());
                            if (query != null) {
                                query.close();
                            }
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            if (query != null) {
                                query.close();
                            }
                            throw th2;
                        }
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                zzhx.zzac("Error remove oldest record" + e.getMessage());
                if (query != null) {
                    query.close();
                }
            } catch (Throwable th3) {
                th2 = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th2;
            }
        }
    }

    public List<zzfg> zze(long j) {
        Cursor query;
        SQLiteException e;
        Throwable th;
        synchronized (zznh) {
            List<zzfg> linkedList = new LinkedList();
            if (j <= 0) {
                return linkedList;
            }
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return linkedList;
            }
            try {
                query = writableDatabase.query("InAppPurchase", null, null, null, null, null, "record_time ASC", String.valueOf(j));
                try {
                    if (query.moveToFirst()) {
                        do {
                            linkedList.add(zza(query));
                        } while (query.moveToNext());
                    }
                    if (query != null) {
                        query.close();
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    try {
                        zzhx.zzac("Error extracing purchase info: " + e.getMessage());
                        if (query != null) {
                            query.close();
                        }
                        return linkedList;
                    } catch (Throwable th2) {
                        th = th2;
                        if (query != null) {
                            query.close();
                        }
                        throw th;
                    }
                }
            } catch (SQLiteException e3) {
                e = e3;
                query = null;
                zzhx.zzac("Error extracing purchase info: " + e.getMessage());
                if (query != null) {
                    query.close();
                }
                return linkedList;
            } catch (Throwable th3) {
                th = th3;
                query = null;
                if (query != null) {
                    query.close();
                }
                throw th;
            }
            return linkedList;
        }
    }
}
