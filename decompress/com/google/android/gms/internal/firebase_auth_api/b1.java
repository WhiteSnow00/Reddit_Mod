// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.f9;
import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.y0;

public final class b1 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.b1 zzb;
    private int zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.b1.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.b1)new b1()));
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.b1 s() {
        return b1.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.b1 t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.b1)e.p((com.google.android.gms.internal.firebase-auth-api.e)b1.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)b1.zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[] { "zze" });
        }
        if (n == 3) {
            return new b1();
        }
        if (n == 4) {
            return new f9(0);
        }
        if (n != 5) {
            return null;
        }
        return b1.zzb;
    }
}
