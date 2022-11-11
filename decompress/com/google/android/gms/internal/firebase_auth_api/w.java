// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import ge.a8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.y0;

public final class w extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.w zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.w.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.w)new w()));
    }
    
    public w() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static a8 s() {
        return (a8)((e)w.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.w u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.w)e.p((com.google.android.gms.internal.firebase-auth-api.e)w.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)w.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new w();
        }
        if (n == 4) {
            return new a8(0);
        }
        if (n != 5) {
            return null;
        }
        return w.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
