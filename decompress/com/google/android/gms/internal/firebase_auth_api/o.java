// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.g1;
import he.r;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import he.p7;
import com.google.android.gms.internal.firebase-auth-api.p;
import he.x0;

public final class o extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.o zzb;
    private p zze;
    private int zzf;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.o.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.o)new o()));
    }
    
    public static p7 s() {
        return (p7)((e)o.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.o t() {
        return o.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.o u() {
        return o.zzb;
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.o v(final zzaau zzaau, final r r) throws zzacf {
        return (com.google.android.gms.internal.firebase-auth-api.o)e.p((com.google.android.gms.internal.firebase-auth-api.e)o.zzb, zzaau, r);
    }
    
    public static void x(final com.google.android.gms.internal.firebase-auth-api.o o, final p zze) {
        ((o)o).zze = zze;
    }
    
    public static void y(final com.google.android.gms.internal.firebase-auth-api.o o, final int zzf) {
        ((o)o).zzf = zzf;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)o.zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[] { "zze", "zzf" });
        }
        if (n == 3) {
            return new o();
        }
        if (n == 4) {
            return new p7(0);
        }
        if (n != 5) {
            return null;
        }
        return o.zzb;
    }
    
    public final int r() {
        return this.zzf;
    }
    
    public final p w() {
        p p;
        if ((p = this.zze) == null) {
            p = com.google.android.gms.internal.firebase_auth_api.p.u();
        }
        return p;
    }
}
