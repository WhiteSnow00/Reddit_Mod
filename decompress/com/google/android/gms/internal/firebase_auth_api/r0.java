// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import he.w8;
import he.g1;
import he.x0;

@Deprecated
public final class r0 extends e implements x0
{
    private static final com.google.android.gms.internal.firebase-auth-api.r0 zzb;
    private String zze;
    private String zzf;
    private int zzg;
    private boolean zzh;
    private String zzi;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.r0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.r0)new r0()));
    }
    
    public r0() {
        this.zze = "";
        this.zzf = "";
        this.zzi = "";
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.r0 r() {
        return r0.zzb;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new g1((com.google.android.gms.internal.firebase-auth-api.e)r0.zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u000b\u0004\u0007\u0005\u0208", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
        }
        if (n == 3) {
            return new r0();
        }
        if (n == 4) {
            return new w8();
        }
        if (n != 5) {
            return null;
        }
        return r0.zzb;
    }
}
