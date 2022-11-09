// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.m8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.y0;

public final class f0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.f0 zzb;
    private int zze;
    private int zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.f0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.f0)new f0()));
    }
    
    public f0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static m8 r() {
        return (m8)((e)f0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.f0 t() {
        return f0.zzb;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.f0 f0) {
        ((f0)f0).zze = 2;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.f0 f0) {
        ((f0)f0).zzf = 3;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)f0.zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new f0();
        }
        if (n == 4) {
            return new m8(0);
        }
        if (n != 5) {
            return null;
        }
        return f0.zzb;
    }
    
    public final zzaau u() {
        return this.zzg;
    }
    
    public final int w() {
        final int zze = this.zze;
        int n = 5;
        if (zze != 0) {
            if (zze != 2) {
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
            n = 2;
        }
        if (n == 0) {
            return 1;
        }
        return n;
    }
    
    public final int x() {
        final int zzf = this.zzf;
        int n = 2;
        final int n2 = 1;
        if (zzf != 0) {
            if (zzf != 1) {
                if (zzf != 2) {
                    n = 5;
                    if (zzf != 3) {
                        if (zzf != 4) {
                            if (zzf != 5) {
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
