// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.v8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class q0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.q0 zzb;
    private String zze;
    private zzaau zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.q0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.q0)new q0()));
    }
    
    public q0() {
        this.zze = "";
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static v8 r() {
        return (v8)((e)q0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.q0 s() {
        return q0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.q0 t() {
        return q0.zzb;
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.q0 q0, final String zze) {
        zze.getClass();
        ((q0)q0).zze = zze;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.q0 q0, final zzaau zzf) {
        ((q0)q0).zzf = zzf;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.q0 q0, final int n) {
        if (n != 1) {
            ((q0)q0).zzg = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)q0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new q0();
        }
        if (n == 4) {
            return new v8(0);
        }
        if (n != 5) {
            return null;
        }
        return q0.zzb;
    }
    
    public final zzaau u() {
        return this.zzf;
    }
    
    public final String v() {
        return this.zze;
    }
    
    public final int y() {
        final int zzg = this.zzg;
        int n = 2;
        final int n2 = 1;
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
                else {
                    n = 4;
                }
            }
            else {
                n = 3;
            }
        }
        if (n == 0) {
            n = n2;
        }
        return n;
    }
}
