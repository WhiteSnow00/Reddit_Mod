// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import ge.w7;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.y0;

public final class s extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.s zzb;
    private int zze;
    private zzaau zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.s.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.s)new s()));
    }
    
    public s() {
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static w7 s() {
        return (w7)((e)s.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.s u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.s)e.p((com.google.android.gms.internal.firebase-auth-api.e)s.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)s.zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new s();
        }
        if (n == 4) {
            return new w7(0);
        }
        if (n != 5) {
            return null;
        }
        return s.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
    
    public final zzaau v() {
        return this.zzf;
    }
}
