// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.u7;
import com.google.android.gms.internal.firebase-auth-api.r;
import ge.y0;

public final class q extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.q zzb;
    private r zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.q.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.q)new q()));
    }
    
    public static u7 s() {
        return (u7)((e)q.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.q u(final zzaau zzaau, final ge.r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.q)e.p((com.google.android.gms.internal.firebase-auth-api.e)q.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)q.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new q();
        }
        if (n == 4) {
            return new u7(0);
        }
        if (n != 5) {
            return null;
        }
        return q.zzb;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final r v() {
        r r;
        if ((r = this.zze) == null) {
            r = com.google.android.gms.internal.firebase_auth_api.r.u();
        }
        return r;
    }
}