// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.z8;
import com.google.android.gms.internal.firebase-auth-api.o0;
import ie.y0;

public final class r0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.r0 zzb;
    private o0 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.r0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.r0)new r0()));
    }
    
    public static void A(final com.google.android.gms.internal.firebase-auth-api.r0 r0, final int n) {
        if (n != 1) {
            ((r0)r0).zzh = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public static void B(final com.google.android.gms.internal.firebase-auth-api.r0 r0) {
        ((r0)r0).zzf = 1;
    }
    
    public static z8 t() {
        return (z8)((e)r0.zzb).k();
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)r0.zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[] { "zze", "zzf", "zzg", "zzh" });
        }
        if (n == 3) {
            return new r0();
        }
        if (n == 4) {
            return new z8(0);
        }
        if (n != 5) {
            return null;
        }
        return r0.zzb;
    }
    
    public final int r() {
        return this.zzg;
    }
    
    public final o0 s() {
        o0 o0;
        if ((o0 = this.zze) == null) {
            o0 = com.google.android.gms.internal.firebase_auth_api.o0.t();
        }
        return o0;
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
