// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import ge.q7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.o;
import ge.y0;

public final class m extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.m zzb;
    private int zze;
    private o zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.m.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.m)new m()));
    }
    
    public m() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static q7 s() {
        return (q7)((e)m.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.m u() {
        return m.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.m v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.m)e.p((com.google.android.gms.internal.firebase-auth-api.e)m.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)m.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new m();
        }
        if (n == 4) {
            return new q7(0);
        }
        if (n != 5) {
            return null;
        }
        return m.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final o w() {
        o o;
        if ((o = this.zzf) == null) {
            o = com.google.android.gms.internal.firebase_auth_api.o.u();
        }
        return o;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
}
