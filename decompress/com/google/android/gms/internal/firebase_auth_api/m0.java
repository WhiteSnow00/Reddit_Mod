// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import ge.t8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.n0;
import ge.y0;

public final class m0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.m0 zzb;
    private int zze;
    private n0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.m0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.m0)new m0()));
    }
    
    public m0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static t8 s() {
        return (t8)((e)m0.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.m0 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.m0)e.p((com.google.android.gms.internal.firebase-auth-api.e)m0.zzb, zzaau, r);
    }
    
    public final boolean A() {
        return this.zzf != null;
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)m0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new m0();
        }
        if (n == 4) {
            return new t8(0);
        }
        if (n != 5) {
            return null;
        }
        return m0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final n0 v() {
        n0 n0;
        if ((n0 = this.zzf) == null) {
            n0 = com.google.android.gms.internal.firebase_auth_api.n0.v();
        }
        return n0;
    }
    
    public final zzaau w() {
        return this.zzg;
    }
}
