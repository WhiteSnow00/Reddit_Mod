// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import ie.h1;
import ie.w8;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import ie.y0;

public final class o0 extends e implements y0
{
    private static final com.google.android.gms.internal.firebase-auth-api.o0 zzb;
    private String zze;
    private zzaau zzf;
    private int zzg;
    
    static {
        e.d((Class)com.google.android.gms.internal.firebase-auth-api.o0.class, (com.google.android.gms.internal.firebase-auth-api.e)(zzb = (com.google.android.gms.internal.firebase-auth-api.o0)new o0()));
    }
    
    public o0() {
        this.zze = "";
        this.zzf = com.google.android.gms.internal.firebase_auth_api.zzaau.zzb;
    }
    
    public static w8 r() {
        return (w8)((e)o0.zzb).k();
    }
    
    public static com.google.android.gms.internal.firebase-auth-api.o0 t() {
        return o0.zzb;
    }
    
    public final Object h(int n) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return new h1((com.google.android.gms.internal.firebase-auth-api.e)o0.zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[] { "zze", "zzf", "zzg" });
        }
        if (n == 3) {
            return new o0();
        }
        if (n == 4) {
            return new w8(0);
        }
        if (n != 5) {
            return null;
        }
        return o0.zzb;
    }
    
    public final zzaau u() {
        return this.zzf;
    }
    
    public final String v() {
        return this.zze;
    }
    
    public final int y() {
        final int zzg = this.zzg;
        int n = 4;
        if (zzg != 0) {
            if (zzg != 1) {
                if (zzg != 2) {
                    if (zzg != 3) {
                        if (zzg != 4) {
                            n = 0;
                        }
                        else {
                            n = 6;
                        }
                    }
                    else {
                        n = 5;
                    }
                }
            }
            else {
                n = 3;
            }
        }
        else {
            n = 2;
        }
        if (n == 0) {
            return 1;
        }
        return n;
    }
}
