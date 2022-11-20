// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import java.util.List;
import he.g1;
import com.google.android.gms.internal.firebase-auth-api.s0;
import he.r;
import he.x8;
import he.f1;
import he.e0;
import he.x0;

public final class t0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.t0 zzb;
    private int zze;
    private e0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.t0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.t0)new t0()));
    }
    
    public t0() {
        this.zzf = (e0)f1.i;
    }
    
    public static x8 t() {
        return (x8)((e)t0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.t0 v() {
        return t0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.t0 w(final byte[] array, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.t0)e.q((com.google.android.gms.internal.firebase-auth-api.e)t0.zzb, array, r);
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.t0 t0, final int zze) {
        ((t0)t0).zze = zze;
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.t0 t0, final s0 s0) {
        final e0 zzf = ((t0)t0).zzf;
        if (!zzf.s()) {
            final int size = ((List)zzf).size();
            int n;
            if (size == 0) {
                n = 10;
            }
            else {
                n = size + size;
            }
            ((t0)t0).zzf = zzf.h(n);
        }
        ((List<s0>)((t0)t0).zzf).add(s0);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)t0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "zze", "zzf", s0.class });
        }
        if (n == 3) {
            return new t0();
        }
        if (n == 4) {
            return new x8(0);
        }
        if (n != 5) {
            return null;
        }
        return t0.zzb;
    }
    
    public final int r() {
        return ((List)this.zzf).size();
    }
    
    public final int s() {
        return this.zze;
    }
    
    public final s0 u(final int n) {
        return (s0)((List<com.google.android.gms.internal.firebase_auth_api.s0>)this.zzf).get(n);
    }
    
    public final e0 x() {
        return this.zzf;
    }
}
