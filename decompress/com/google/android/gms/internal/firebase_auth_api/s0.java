// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.r0;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import ie.y8;
import ie.g1;
import ie.e0;
import ie.y0;

public final class s0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.s0 zzb;
    private int zze;
    private e0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.s0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.s0)new s0()));
    }
    
    public s0() {
        this.zzf = (e0)g1.i;
    }
    
    public static y8 t() {
        return (y8)((e)s0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.s0 w(final byte[] array, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.s0)e.q((com.google.android.gms.internal.firebase-auth-api.e)s0.zzb, array, r);
    }
    
    public static void z(final com.google.android.gms.internal.firebase-auth-api.s0 s0, final r0 r0) {
        final e0 zzf = ((s0)s0).zzf;
        if (!zzf.s()) {
            final int size = zzf.size();
            int n;
            if (size == 0) {
                n = 10;
            }
            else {
                n = size + size;
            }
            ((s0)s0).zzf = zzf.h(n);
        }
        ((s0)s0).zzf.add(r0);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)s0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "zze", "zzf", r0.class });
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
        return this.zzf.size();
    }
    
    public final int s() {
        return this.zze;
    }
    
    public final r0 u(final int n) {
        return (r0)this.zzf.get(n);
    }
    
    public final e0 x() {
        return this.zzf;
    }
}
