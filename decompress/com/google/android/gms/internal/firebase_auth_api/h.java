// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import ie.m7;
import com.google.android.gms.internal.firebase-auth-api.j;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.y0;

public final class h extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.h zzb;
    private int zze;
    private zzaau zzf;
    private j zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.h.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.h)new h()));
    }
    
    public h() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static m7 s() {
        return (m7)((e)h.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.h u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.h)e.p((com.google.android.gms.internal.firebase-auth-api.e)h.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)h.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new h();
        }
        if (n == 4) {
            return new m7(0);
        }
        if (n != 5) {
            return null;
        }
        return h.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final j v() {
        j j;
        if ((j = this.zzg) == null) {
            j = com.google.android.gms.internal.firebase_auth_api.j.u();
        }
        return j;
    }
    
    public final zzaau w() {
        return this.zzf;
    }
}
