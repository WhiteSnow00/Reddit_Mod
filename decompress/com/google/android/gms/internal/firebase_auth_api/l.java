// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.p7;
import com.google.android.gms.internal.firebase-auth-api.i0;
import com.google.android.gms.internal.firebase-auth-api.n;
import ge.y0;

public final class l extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.l zzb;
    private n zze;
    private i0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.l.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.l)new l()));
    }
    
    public static p7 r() {
        return (p7)((e)l.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.l t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.l)e.p((com.google.android.gms.internal.firebase-auth-api.e)l.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)l.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new l();
        }
        if (n == 4) {
            return new p7(0);
        }
        if (n != 5) {
            return null;
        }
        return l.zzb;
    }
    
    public final n u() {
        n n;
        if ((n = this.zze) == null) {
            n = com.google.android.gms.internal.firebase_auth_api.n.u();
        }
        return n;
    }
    
    public final i0 v() {
        i0 i0;
        if ((i0 = this.zzf) == null) {
            i0 = com.google.android.gms.internal.firebase_auth_api.i0.u();
        }
        return i0;
    }
}
