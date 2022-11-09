// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import ie.g9;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.y0;

public final class a1 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.a1 zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.a1.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.a1)new a1()));
    }
    
    public a1() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static g9 s() {
        return (g9)((e)a1.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.a1 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.a1)e.p((com.google.android.gms.internal.firebase-auth-api.e)a1.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)a1.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new a1();
        }
        if (n == 4) {
            return new g9(0);
        }
        if (n != 5) {
            return null;
        }
        return a1.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
