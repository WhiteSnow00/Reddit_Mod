// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.a9;
import he.x0;

public final class u0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.u0 zzb;
    private String zze;
    private int zzf;
    private int zzg;
    private int zzh;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.u0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.u0)new u0()));
    }
    
    public u0() {
        this.zze = "";
    }
    
    public static a9 s() {
        return (a9)((e)u0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.u0 t() {
        return u0.zzb;
    }
    
    public static void u(final com.google.android.gms.internal.firebase-auth-api.u0 u0, final String zze) {
        zze.getClass();
        ((u0)u0).zze = zze;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.u0 u0, final int zzg) {
        ((u0)u0).zzg = zzg;
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.u0 u0, final int n) {
        if (n != 1) {
            ((u0)u0).zzh = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.u0 u0, final int n) {
        if (n != 1) {
            ((u0)u0).zzf = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)u0.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\f\u0003\u000b\u0004\f", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new u0();
        }
        if (n == 4) {
            return new a9(0);
        }
        if (n != 5) {
            return null;
        }
        return u0.zzb;
    }
    
    public final int r() {
        return this.zzg;
    }
}
