// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.g8;
import com.google.android.gms.internal.firebase-auth-api.p0;
import ie.y0;

public final class a0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.a0 zzb;
    private p0 zze;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.a0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.a0)new a0()));
    }
    
    public static g8 r() {
        return (g8)((e)a0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.a0 t() {
        return a0.zzb;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)a0.zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[] { "zze" });
        }
        if (n == 3) {
            return new a0();
        }
        if (n == 4) {
            return new g8(0);
        }
        if (n != 5) {
            return null;
        }
        return a0.zzb;
    }
    
    public final p0 u() {
        p0 p0;
        if ((p0 = this.zze) == null) {
            p0 = com.google.android.gms.internal.firebase_auth_api.p0.t();
        }
        return p0;
    }
}
