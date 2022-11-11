// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ge.e8;
import ge.h1;
import ge.y0;

@Deprecated
public final class q0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.q0 zzb;
    private String zze;
    private String zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.q0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.q0)new q0()));
    }
    
    public q0() {
        this.zze = "";
        this.zzf = "";
        this.zzi = "";
    }
    
    public final Object g(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)q0.zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new q0();
        }
        if (n == 4) {
            return new e8(0);
        }
        if (n != 5) {
            return null;
        }
        return q0.zzb;
    }
}
