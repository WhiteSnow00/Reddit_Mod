// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import java.util.List;
import he.g1;
import com.google.android.gms.internal.firebase-auth-api.u0;
import he.z8;
import he.f1;
import he.e0;
import he.x0;

public final class v0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.v0 zzb;
    private int zze;
    private e0 zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.v0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.v0)new v0()));
    }
    
    public v0() {
        this.zzf = (e0)f1.i;
    }
    
    public static z8 r() {
        return (z8)((e)v0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.v0 t() {
        return v0.zzb;
    }
    
    public static void u(final com.google.android.gms.internal.firebase-auth-api.v0 v0, final int zze) {
        ((v0)v0).zze = zze;
    }
    
    public static void v(final com.google.android.gms.internal.firebase-auth-api.v0 v0, final u0 u0) {
        final e0 zzf = ((v0)v0).zzf;
        if (!zzf.s()) {
            final int size = ((List)zzf).size();
            int n;
            if (size == 0) {
                n = 10;
            }
            else {
                n = size + size;
            }
            ((v0)v0).zzf = zzf.h(n);
        }
        ((List<u0>)((v0)v0).zzf).add(u0);
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)v0.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[] { "zze", "zzf", u0.class });
        }
        if (n == 3) {
            return new v0();
        }
        if (n == 4) {
            return new z8(0);
        }
        if (n != 5) {
            return null;
        }
        return v0.zzb;
    }
    
    public final u0 s() {
        return (u0)((List<com.google.android.gms.internal.firebase_auth_api.u0>)this.zzf).get(0);
    }
}
