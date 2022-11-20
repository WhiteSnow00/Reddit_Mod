// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.z0;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.k;
import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.w;
import com.google.android.gms.internal.firebase-auth-api.i;
import com.google.android.gms.internal.firebase-auth-api.v;
import com.google.android.gms.internal.firebase-auth-api.y0;

public final class x3 extends f6
{
    public final int d;
    
    public x3(final int d) {
        this.d = d;
        if (d == 1) {
            super((Class)y0.class, new n6[] { new v3(e2.class, 1) });
            return;
        }
        if (d != 2) {
            super((Class)v.class, new n6[] { new v3(e2.class, 0) });
            return;
        }
        super((Class)i.class, new n6[] { new v3(z2.class, 3) });
    }
    
    public static c6 h(final int n, final int n2) {
        final y7 s = w.s();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        w.v((com.google.android.gms.internal.firebase-auth-api.w)((z)s).g, n);
        return new c6((e)((z)s).c(), n2);
    }
    
    public static void i(final k k) throws GeneralSecurityException {
        if (((com.google.android.gms.internal.firebase_auth_api.k)k).r() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (((com.google.android.gms.internal.firebase_auth_api.k)k).r() <= 16) {
            return;
        }
        throw new GeneralSecurityException("tag size too long");
    }
    
    public final e6 a() {
        switch (this.d) {
            default: {
                return new w6();
            }
            case 1: {
                return new w3(z0.class, 1);
            }
            case 0: {
                return new w3(com.google.android.gms.internal.firebase-auth-api.w.class, 0);
            }
        }
    }
    
    public final w0 b(final zzaau zzaau) {
        switch (this.d) {
            default: {
                return (w0)com.google.android.gms.internal.firebase_auth_api.i.u(zzaau, r.a());
            }
            case 1: {
                return (w0)com.google.android.gms.internal.firebase_auth_api.y0.u(zzaau, r.a());
            }
            case 0: {
                return (w0)com.google.android.gms.internal.firebase_auth_api.v.u(zzaau, r.a());
            }
        }
    }
    
    public final String c() {
        switch (this.d) {
            default: {
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            }
            case 1: {
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            }
            case 0: {
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            }
        }
    }
    
    public final void d(final w0 w0) {
        switch (this.d) {
            default: {
                final com.google.android.gms.internal.firebase_auth_api.i i = (com.google.android.gms.internal.firebase_auth_api.i)w0;
                ea.c(i.r());
                if (((com.google.android.gms.internal.firebase_auth_api.zzaau)i.w()).zzd() == 32) {
                    i(i.v());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
            case 1: {
                ea.c(((com.google.android.gms.internal.firebase_auth_api.y0)w0).r());
                return;
            }
            case 0: {
                final com.google.android.gms.internal.firebase_auth_api.v v = (com.google.android.gms.internal.firebase_auth_api.v)w0;
                ea.c(v.r());
                ea.b(((com.google.android.gms.internal.firebase_auth_api.zzaau)v.v()).zzd());
            }
        }
    }
    
    public final int f() {
        switch (this.d) {
            default: {
                return 3;
            }
            case 1: {
                return 6;
            }
        }
    }
}
