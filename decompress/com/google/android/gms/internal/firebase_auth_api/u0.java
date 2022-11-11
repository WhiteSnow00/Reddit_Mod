// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.t0;
import ge.z8;
import ge.g1;
import ge.e0;
import ge.y0;

public final class u0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.u0 zzb;
    private int zze;
    private e0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.u0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.u0)new u0()));
    }
    
    public u0() {
        this.zzf = (e0)g1.i;
    }
    
    public static z8 r() {
        return (z8)((e)u0.zzb).i();
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.u0 u0, final t0 t0) {
        final e0 zzf = ((u0)u0).zzf;
        if (!zzf.s()) {
            final int size = zzf.size();
            int n;
            if (size == 0) {
                n = 10;
            }
            else {
                n = size + size;
            }
            ((u0)u0).zzf = zzf.h(n);
        }
        ((u0)u0).zzf.add(t0);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)u0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "zze", "zzf", t0.class });
        }
        if (n == 3) {
            return new u0();
        }
        if (n == 4) {
            return new z8(0);
        }
        if (n != 5) {
            return null;
        }
        return u0.zzb;
    }
    
    public final t0 s() {
        return (t0)this.zzf.get(0);
    }
}
