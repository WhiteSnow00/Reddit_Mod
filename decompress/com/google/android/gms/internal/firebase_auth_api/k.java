// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.o7;
import com.google.android.gms.internal.firebase-auth-api.h0;
import com.google.android.gms.internal.firebase-auth-api.m;
import ge.y0;

public final class k extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.k zzb;
    private int zze;
    private m zzf;
    private h0 zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.k.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.k)new k()));
    }
    
    public static o7 s() {
        return (o7)((e)k.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.k u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.k)e.p((com.google.android.gms.internal.firebase-auth-api.e)k.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)k.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new k();
        }
        if (n == 4) {
            return new o7(0);
        }
        if (n != 5) {
            return null;
        }
        return k.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final m v() {
        m m;
        if ((m = this.zzf) == null) {
            m = com.google.android.gms.internal.firebase_auth_api.m.u();
        }
        return m;
    }
    
    public final h0 w() {
        h0 h0;
        if ((h0 = this.zzg) == null) {
            h0 = com.google.android.gms.internal.firebase_auth_api.h0.u();
        }
        return h0;
    }
}
