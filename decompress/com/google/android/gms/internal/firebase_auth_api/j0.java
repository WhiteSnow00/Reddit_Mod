// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.q8;
import ie.y0;

public final class j0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.j0 zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.j0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.j0)new j0()));
    }
    
    public static q8 s() {
        return (q8)((e)j0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.j0 u() {
        return j0.zzb;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.j0 j0, final int n) {
        if (n != 1) {
            ((j0)j0).zze = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)j0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new j0();
        }
        if (n == 4) {
            return new q8(0);
        }
        if (n != 5) {
            return null;
        }
        return j0.zzb;
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
