// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.x0;
import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.u;
import com.google.android.gms.internal.firebase-auth-api.o0;
import com.google.android.gms.internal.firebase-auth-api.t;
import com.google.android.gms.internal.firebase-auth-api.f0;
import com.google.android.gms.internal.firebase-auth-api.w0;

public final class u3 extends f6
{
    public final int d;
    
    public u3(final int d) {
        this.d = d;
        if (d == 1) {
            super((Class)w0.class, new n6[] { new q3(e2.class, 2) });
            return;
        }
        if (d == 2) {
            super((Class)f0.class, new n6[] { new y3(j2.class, 2) });
            return;
        }
        if (d != 3) {
            super((Class)t.class, new n6[] { new q3(e2.class, 1) });
            return;
        }
        super((Class)o0.class, new n6[] { new y3(j2.class, 3) });
    }
    
    public static c6 h(final int n, final int n2) {
        final w7 s = u.s();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        u.v((com.google.android.gms.internal.firebase-auth-api.u)((z)s).g, n);
        return new c6((e)((z)s).c(), n2);
    }
    
    public final e6 a() {
        switch (this.d) {
            default: {
                throw new UnsupportedOperationException("Creating keys is not supported.");
            }
            case 1: {
                return new t3(x0.class, 1);
            }
            case 0: {
                return new t3(com.google.android.gms.internal.firebase-auth-api.u.class, 0);
            }
        }
    }
    
    public final he.w0 b(final zzaau zzaau) {
        switch (this.d) {
            default: {
                return (he.w0)com.google.android.gms.internal.firebase_auth_api.o0.w(zzaau, r.a());
            }
            case 2: {
                return (he.w0)com.google.android.gms.internal.firebase_auth_api.f0.w(zzaau, r.a());
            }
            case 1: {
                return (he.w0)com.google.android.gms.internal.firebase_auth_api.w0.u(zzaau, r.a());
            }
            case 0: {
                return (he.w0)com.google.android.gms.internal.firebase_auth_api.t.u(zzaau, r.a());
            }
        }
    }
    
    public final String c() {
        switch (this.d) {
            default: {
                return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
            }
            case 2: {
                return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
            }
            case 1: {
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            }
            case 0: {
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            }
        }
    }
    
    public final /* bridge */ void d(final he.w0 w0) {
        switch (this.d) {
            default: {
                final com.google.android.gms.internal.firebase_auth_api.o0 o0 = (com.google.android.gms.internal.firebase_auth_api.o0)w0;
                ea.c(o0.r());
                if (o0.B()) {
                    n5.a(o0.s());
                    return;
                }
                throw new GeneralSecurityException("Missing HPKE key params.");
            }
            case 2: {
                final com.google.android.gms.internal.firebase_auth_api.f0 f0 = (com.google.android.gms.internal.firebase_auth_api.f0)w0;
                ea.c(f0.r());
                b5.a(f0.s());
                return;
            }
            case 1: {
                ea.c(((com.google.android.gms.internal.firebase_auth_api.w0)w0).r());
                return;
            }
            case 0: {
                final com.google.android.gms.internal.firebase_auth_api.t t = (com.google.android.gms.internal.firebase_auth_api.t)w0;
                ea.c(t.r());
                ea.b(((com.google.android.gms.internal.firebase_auth_api.zzaau)t.v()).zzd());
            }
        }
    }
    
    public final int e() {
        switch (this.d) {
            default: {
                return 1;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    public final int f() {
        switch (this.d) {
            default: {
                return 5;
            }
            case 1: {
                return 6;
            }
            case 0: {
                return 3;
            }
        }
    }
}
