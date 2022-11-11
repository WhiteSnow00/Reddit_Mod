// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import ge.s8;
import ge.y0;

public final class l0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.l0 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.l0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.l0)new l0()));
    }
    
    public static s8 r() {
        return (s8)((e)l0.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.l0 t() {
        return l0.zzb;
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)l0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new l0();
        }
        if (n == 4) {
            return new s8(0);
        }
        if (n != 5) {
            return null;
        }
        return l0.zzb;
    }
    
    public final int u() {
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
    
    public final int v() {
        final int zzf = this.zzf;
        int n = 3;
        if (zzf != 0) {
            if (zzf != 1) {
                if (zzf != 2) {
                    if (zzf != 3) {
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
    
    public final int w() {
        final int zze = this.zze;
        int n = 4;
        if (zze != 0) {
            if (zze != 1) {
                if (zze != 2) {
                    if (zze != 3) {
                        if (zze != 4) {
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
