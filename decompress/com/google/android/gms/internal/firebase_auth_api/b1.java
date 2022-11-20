// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import he.e9;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.x0;

public final class b1 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.b1 zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.b1.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.b1)new b1()));
    }
    
    public b1() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static e9 s() {
        return (e9)((e)b1.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.b1 t() {
        return b1.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.b1 u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.b1)e.p((com.google.android.gms.internal.firebase-auth-api.e)b1.zzb, zzaau, r);
    }
    
    public static void w(final com.google.android.gms.internal.firebase-auth-api.b1 b1) {
        ((b1)b1).zze = 0;
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.b1 b1, final zzaau zzf) {
        ((b1)b1).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)b1.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new b1();
        }
        if (n == 4) {
            return new e9(0);
        }
        if (n != 5) {
            return null;
        }
        return b1.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
