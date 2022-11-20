// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.y8;
import com.google.android.gms.internal.firebase-auth-api.p0;
import he.x0;

public final class s0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.s0 zzb;
    private p0 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.s0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.s0)new s0()));
    }
    
    public static void A(final com.google.android.gms.internal.firebase-auth-api.s0 s0, final int n) {
        if (n != 1) {
            ((s0)s0).zzh = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static void B(final com.google.android.gms.internal.firebase-auth-api.s0 s0) {
        ((s0)s0).zzf = 1;
    }
    
    public static y8 t() {
        return (y8)((e)s0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.s0 u() {
        return s0.zzb;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.s0 s0, final p0 zze) {
        zze.getClass();
        ((s0)s0).zze = zze;
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.s0 s0, final int zzg) {
        ((s0)s0).zzg = zzg;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)s0.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new s0();
        }
        if (n == 4) {
            return new y8(0);
        }
        if (n != 5) {
            return null;
        }
        return s0.zzb;
    }
    
    public final int r() {
        return this.zzg;
    }
    
    public final p0 s() {
        p0 p0;
        if ((p0 = this.zze) == null) {
            p0 = com.google.android.gms.internal.firebase_auth_api.p0.t();
        }
        return p0;
    }
    
    public final boolean x() {
        return this.zze != null;
    }
    
    public final int y() {
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
    
    public final int z() {
        final int zzh = this.zzh;
        int n = 2;
        final int n2 = 1;
        if (zzh != 0) {
            if (zzh != 1) {
                if (zzh != 2) {
                    if (zzh != 3) {
                        if (zzh != 4) {
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
