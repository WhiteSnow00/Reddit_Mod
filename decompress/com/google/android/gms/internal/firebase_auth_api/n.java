// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.r7;
import com.google.android.gms.internal.firebase-auth-api.o;
import ge.y0;

public final class n extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.n zzb;
    private o zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.n.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.n)new n()));
    }
    
    public static r7 s() {
        return (r7)((e)n.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n u() {
        return n.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.n v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.n)e.p((com.google.android.gms.internal.firebase-auth-api.e)n.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)n.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new n();
        }
        if (n == 4) {
            return new r7(0);
        }
        if (n != 5) {
            return null;
        }
        return n.zzb;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final o w() {
        o o;
        if ((o = this.zze) == null) {
            o = com.google.android.gms.internal.firebase_auth_api.o.u();
        }
        return o;
    }
}
