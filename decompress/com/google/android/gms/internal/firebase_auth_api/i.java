// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.n7;
import com.google.android.gms.internal.firebase-auth-api.j;
import ie.y0;

public final class i extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.i zzb;
    private int zze;
    private j zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.i.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.i)new i()));
    }
    
    public static n7 s() {
        return (n7)((e)i.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.i)e.p((com.google.android.gms.internal.firebase-auth-api.e)i.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)i.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new i();
        }
        if (n == 4) {
            return new n7(0);
        }
        if (n != 5) {
            return null;
        }
        return i.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final j v() {
        j j;
        if ((j = this.zzf) == null) {
            j = com.google.android.gms.internal.firebase_auth_api.j.u();
        }
        return j;
    }
}
