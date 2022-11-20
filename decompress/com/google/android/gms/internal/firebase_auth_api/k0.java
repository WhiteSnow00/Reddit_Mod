// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.o8;
import he.x0;

public final class k0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.k0 zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.k0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.k0)new k0()));
    }
    
    public static o8 s() {
        return (o8)((e)k0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.k0 t() {
        return k0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.k0 u() {
        return k0.zzb;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.k0 k0, final int zzf) {
        ((k0)k0).zzf = zzf;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.k0 k0, final int n) {
        if (n != 1) {
            ((k0)k0).zze = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)k0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new k0();
        }
        if (n == 4) {
            return new o8(0);
        }
        if (n != 5) {
            return null;
        }
        return k0.zzb;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final int w() {
        final int zze = this.zze;
        int n = 2;
        final int n2 = 1;
        if (zze != 0) {
            if (zze != 1) {
                if (zze != 2) {
                    n = 5;
                    if (zze != 3) {
                        if (zze != 4) {
                            if (zze != 5) {
                                n = 0;
                            }
                            else {
                                n = 7;
                            }
                        }
                        else {
                            n = 6;
                        }
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
