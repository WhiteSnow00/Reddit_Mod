// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.t7;
import com.google.android.gms.internal.firebase-auth-api.s;
import he.x0;

public final class r extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.r zzb;
    private s zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.r.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.r)new r()));
    }
    
    public static t7 s() {
        return (t7)((e)r.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.r t() {
        return r.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.r u(final zzaau zzaau, final he.r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.r)e.p((com.google.android.gms.internal.firebase-auth-api.e)r.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.r r, final s zze) {
        ((r)r).zze = zze;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.r r, final int zzf) {
        ((r)r).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)r.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new r();
        }
        if (n == 4) {
            return new t7(0);
        }
        if (n != 5) {
            return null;
        }
        return r.zzb;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final s v() {
        s s;
        if ((s = this.zze) == null) {
            s = com.google.android.gms.internal.firebase_auth_api.s.u();
        }
        return s;
    }
}
