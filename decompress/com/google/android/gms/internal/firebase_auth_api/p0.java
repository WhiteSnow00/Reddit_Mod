// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.u8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class p0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.p0 zzb;
    private String zze;
    private zzaau zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.p0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.p0)new p0()));
    }
    
    public p0() {
        this.zze = "";
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static u8 r() {
        return (u8)((e)p0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.p0 s() {
        return p0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.p0 t() {
        return p0.zzb;
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.p0 p2, final String zze) {
        ((p0)p2).zze = zze;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.p0 p2, final zzaau zzf) {
        ((p0)p2).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.p0 p2, final int n) {
        ((p0)p2).zzg = n - 2;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)p0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new p0();
        }
        if (n == 4) {
            return new u8(0);
        }
        if (n != 5) {
            return null;
        }
        return p0.zzb;
    }
    
    public final zzaau u() {
        return this.zzf;
    }
    
    public final String v() {
        return this.zze;
    }
    
    public final int y() {
        final int zzg = this.zzg;
        int n = 4;
        if (zzg != 0) {
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            n = 0;
                        }
                        else {
                            n = 6;
                        }
                    }
                    else {
                        n = 5;
                    }
                }
            }
            else {
                n = 3;
            }
        }
        else {
            n = 2;
        }
        if (n == 0) {
            return 1;
        }
        return n;
    }
}
