// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.c9;
import ge.h1;
import com.google.android.gms.internal.firebase-auth-api.q0;
import ge.g1;
import ge.e0;
import ge.y0;

@Deprecated
public final class z0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.z0 zzb;
    private String zze;
    private e0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.z0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.z0)new z0()));
    }
    
    public z0() {
        this.zze = "";
        this.zzf = (e0)g1.i;
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)z0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[] { "zze", "zzf", q0.class });
        }
        if (n == 3) {
            return new z0();
        }
        if (n == 4) {
            return new c9(0);
        }
        if (n != 5) {
            return null;
        }
        return z0.zzb;
    }
}
