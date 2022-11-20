// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.g8;
import com.google.android.gms.internal.firebase-auth-api.b0;
import com.google.android.gms.internal.firebase-auth-api.g0;
import he.x0;

public final class d0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.d0 zzb;
    private g0 zze;
    private b0 zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.d0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.d0)new d0()));
    }
    
    public static g8 s() {
        return (g8)((e)d0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.d0 t() {
        return d0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.d0 u() {
        return d0.zzb;
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.d0 d0, final g0 zze) {
        ((d0)d0).zze = zze;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.d0 d0, final b0 zzf) {
        ((d0)d0).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.d0 d0, final int n) {
        if (n != 1) {
            ((d0)d0).zzg = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)d0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new d0();
        }
        if (n == 4) {
            return new g8(0);
        }
        if (n != 5) {
            return null;
        }
        return d0.zzb;
    }
    
    public final b0 r() {
        b0 b0;
        if ((b0 = this.zzf) == null) {
            b0 = com.google.android.gms.internal.firebase_auth_api.b0.t();
        }
        return b0;
    }
    
    public final g0 v() {
        g0 g0;
        if ((g0 = this.zze) == null) {
            g0 = com.google.android.gms.internal.firebase_auth_api.g0.t();
        }
        return g0;
    }
    
    public final int y() {
        final int zzg = this.zzg;
        int n = 3;
        if (zzg != 0) {
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        n = 0;
                    }
                    else {
                        n = 5;
                    }
                }
                else {
                    n = 4;
                }
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
