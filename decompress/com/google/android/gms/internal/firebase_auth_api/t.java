// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ge.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ge.x7;
import ge.y0;

public final class t extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.t zzb;
    private int zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.t.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.t)new t()));
    }
    
    public static x7 s() {
        return (x7)((e)t.zzb).i();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.t u(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.t)e.p((com.google.android.gms.internal.firebase-auth-api.e)t.zzb, zzaau, r);
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)t.zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new t();
        }
        if (n == 4) {
            return new x7(0);
        }
        if (n != 5) {
            return null;
        }
        return t.zzb;
    }
    
    public final int r() {
        return this.zze;
    }
}
