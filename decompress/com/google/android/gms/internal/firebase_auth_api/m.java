// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.n7;
import com.google.android.gms.internal.firebase-auth-api.j0;
import com.google.android.gms.internal.firebase-auth-api.o;
import he.x0;

public final class m extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.m zzb;
    private o zze;
    private j0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.m.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.m)new m()));
    }
    
    public static n7 r() {
        return (n7)((e)m.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.m s() {
        return m.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.m t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.m)e.p((com.google.android.gms.internal.firebase-auth-api.e)m.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.m m, final o zze) {
        ((m)m).zze = zze;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.m m, final j0 zzf) {
        ((m)m).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)m.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new m();
        }
        if (n == 4) {
            return new n7(0);
        }
        if (n != 5) {
            return null;
        }
        return m.zzb;
    }
    
    public final o u() {
        o o;
        if ((o = this.zze) == null) {
            o = com.google.android.gms.internal.firebase_auth_api.o.u();
        }
        return o;
    }
    
    public final j0 v() {
        j0 j0;
        if ((j0 = this.zzf) == null) {
            j0 = com.google.android.gms.internal.firebase_auth_api.j0.u();
        }
        return j0;
    }
}
