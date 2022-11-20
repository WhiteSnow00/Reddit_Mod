// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r8;
import he.x0;

public final class m0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.m0 zzb;
    private int zze;
    private int zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.m0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.m0)new m0()));
    }
    
    public static r8 r() {
        return (r8)((e)m0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.m0 s() {
        return m0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.m0 t() {
        return m0.zzb;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.m0 m0, final int n) {
        ((m0)m0).zze = n - 2;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.m0 m0, final int n) {
        ((m0)m0).zzf = n - 2;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.m0 m0, final int n) {
        ((m0)m0).zzg = n - 2;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)m0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new m0();
        }
        if (n == 4) {
            return new r8(0);
        }
        if (n != 5) {
            return null;
        }
        return m0.zzb;
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
