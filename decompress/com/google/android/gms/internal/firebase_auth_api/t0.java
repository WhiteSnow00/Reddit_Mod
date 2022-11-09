// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.b9;
import ie.y0;

public final class t0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.t0 zzb;
    private String zze;
    private int zzf;
    private int zzg;
    private int zzh;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.t0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.t0)new t0()));
    }
    
    public t0() {
        this.zze = "";
    }
    
    public static b9 s() {
        return (b9)((e)t0.zzb).k();
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.t0 t0, final int n) {
        if (n != 1) {
            ((t0)t0).zzh = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.t0 t0, final int n) {
        if (n != 1) {
            ((t0)t0).zzf = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)t0.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new t0();
        }
        if (n == 4) {
            return new b9(0);
        }
        if (n != 5) {
            return null;
        }
        return t0.zzb;
    }
    
    public final int r() {
        return this.zzg;
    }
}
