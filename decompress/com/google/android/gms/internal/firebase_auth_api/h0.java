// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import ie.o8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.j0;
import ie.y0;

public final class h0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.h0 zzb;
    private int zze;
    private j0 zzf;
    private zzaau zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.h0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.h0)new h0()));
    }
    
    public h0() {
        this.zzg = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static o8 s() {
        return (o8)((e)h0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.h0 u() {
        return h0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.h0 v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.h0)e.p((com.google.android.gms.internal.firebase-auth-api.e)h0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)h0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new h0();
        }
        if (n == 4) {
            return new o8(0);
        }
        if (n != 5) {
            return null;
        }
        return h0.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final j0 w() {
        j0 j0;
        if ((j0 = this.zzf) == null) {
            j0 = com.google.android.gms.internal.firebase_auth_api.j0.u();
        }
        return j0;
    }
    
    public final zzaau x() {
        return this.zzg;
    }
}
