package com.google.android.gms.internal;

import android.support.v4.view.MotionEventCompat;
import com.google.android.gms.drive.FileUploadPreferences;

public class zzwp {
    private final byte[] zzaHo;
    private int zzaHp;
    private int zzaHq;

    public zzwp(byte[] bArr) {
        int i;
        this.zzaHo = new byte[FileUploadPreferences.BATTERY_USAGE_UNRESTRICTED];
        for (i = 0; i < FileUploadPreferences.BATTERY_USAGE_UNRESTRICTED; i++) {
            this.zzaHo[i] = (byte) i;
        }
        i = 0;
        for (int i2 = 0; i2 < FileUploadPreferences.BATTERY_USAGE_UNRESTRICTED; i2++) {
            i = ((i + this.zzaHo[i2]) + bArr[i2 % bArr.length]) & MotionEventCompat.ACTION_MASK;
            byte b = this.zzaHo[i2];
            this.zzaHo[i2] = this.zzaHo[i];
            this.zzaHo[i] = b;
        }
        this.zzaHp = 0;
        this.zzaHq = 0;
    }

    public void zzs(byte[] bArr) {
        int i = this.zzaHp;
        int i2 = this.zzaHq;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) & MotionEventCompat.ACTION_MASK;
            i2 = (i2 + this.zzaHo[i]) & MotionEventCompat.ACTION_MASK;
            byte b = this.zzaHo[i];
            this.zzaHo[i] = this.zzaHo[i2];
            this.zzaHo[i2] = b;
            bArr[i3] = (byte) (bArr[i3] ^ this.zzaHo[(this.zzaHo[i] + this.zzaHo[i2]) & MotionEventCompat.ACTION_MASK]);
        }
        this.zzaHp = i;
        this.zzaHq = i2;
    }
}
