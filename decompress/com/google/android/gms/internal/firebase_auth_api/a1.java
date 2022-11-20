// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.d8;
import he.g1;
import com.google.android.gms.internal.firebase-auth-api.r0;
import he.f1;
import he.e0;
import he.x0;

@Deprecated
public final class a1 extends e implements x0
{
    public static final int f = 0;
    private static final com.google.android.gms.internal.firebase-auth-api.a1 zzb;
    private String zze;
    private e0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.a1.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.a1)new a1()));
    }
    
    public a1() {
        this.zze = "";
        this.zzf = (e0)f1.i;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.a1 r() {
        return a1.zzb;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)a1.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b", new Object[] { "zze", "zzf", r0.class });
        }
        if (n == 3) {
            return new a1();
        }
        if (n == 4) {
            return new d8(0);
        }
        if (n != 5) {
            return null;
        }
        return a1.zzb;
    }
}
