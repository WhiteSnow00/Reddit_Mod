// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.i8;
import com.google.android.gms.internal.firebase-auth-api.a0;
import com.google.android.gms.internal.firebase-auth-api.f0;
import ie.y0;

public final class c0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.c0 zzb;
    private f0 zze;
    private a0 zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.c0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.c0)new c0()));
    }
    
    public static i8 s() {
        return (i8)((e)c0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.c0 u() {
        return c0.zzb;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.c0 c0, final int n) {
        if (n != 1) {
            ((c0)c0).zzg = n - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)c0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new c0();
        }
        if (n == 4) {
            return new i8(0);
        }
        if (n != 5) {
            return null;
        }
        return c0.zzb;
    }
    
    public final a0 r() {
        a0 a0;
        if ((a0 = this.zzf) == null) {
            a0 = com.google.android.gms.internal.firebase_auth_api.a0.t();
        }
        return a0;
    }
    
    public final f0 v() {
        f0 f0;
        if ((f0 = this.zze) == null) {
            f0 = com.google.android.gms.internal.firebase_auth_api.f0.t();
        }
        return f0;
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
