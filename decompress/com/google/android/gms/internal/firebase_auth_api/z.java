// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.f8;
import ie.h1;
import com.google.android.gms.internal.firebase-auth-api.zzacf;
import ie.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.y0;

public final class z extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.z zzb;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.z.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.z)new z()));
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.z s() {
        return z.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.z t(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.z)e.p((com.google.android.gms.internal.firebase-auth-api.e)z.zzb, zzaau, r);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)z.zzb, "\u0000\u0000", (Object[])null);
        }
        if (n == 3) {
            return new z();
        }
        if (n == 4) {
            return new f8();
        }
        if (n != 5) {
            return null;
        }
        return z.zzb;
    }
}
