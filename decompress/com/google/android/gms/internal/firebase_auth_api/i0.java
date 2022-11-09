// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.p8;
import com.google.android.gms.internal.firebase-auth-api.j0;
import ie.y0;

public final class i0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.i0 zzb;
    private j0 zze;
    private int zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.i0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.i0)new i0()));
    }
    
    public static p8 s() {
        return (p8)((e)i0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i0 u() {
        return i0.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.i0 v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.i0)e.p((com.google.android.gms.internal.firebase-auth-api.e)i0.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)i0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new i0();
        }
        if (n == 4) {
            return new p8(0);
        }
        if (n != 5) {
            return null;
        }
        return i0.zzb;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final j0 w() {
        j0 j0;
        if ((j0 = this.zze) == null) {
            j0 = com.google.android.gms.internal.firebase_auth_api.j0.u();
        }
        return j0;
    }
}
