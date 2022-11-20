// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.f0;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.d0;
import com.google.android.gms.internal.firebase_auth_api.b0;
import com.google.android.gms.internal.firebase_auth_api.q0;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.g0;
import com.google.android.gms.internal.firebase_auth_api.c0;
import com.google.android.gms.internal.firebase-auth-api.e0;

public final class v4 extends o6
{
    public static final byte[] d;
    
    static {
        d = new byte[0];
    }
    
    public v4() {
        super(e0.class, new n6[] { new t4() });
    }
    
    public static c6 i(final int n, final s2 s2, final byte[] array, final int n2) {
        final f8 r = c0.r();
        final k8 r2 = g0.r();
        if (((z)r2).h) {
            ((z)r2).f();
            ((z)r2).h = false;
        }
        g0.y((com.google.android.gms.internal.firebase-auth-api.g0)((z)r2).g);
        final int n3 = 5;
        if (((z)r2).h) {
            ((z)r2).f();
            ((z)r2).h = false;
        }
        g0.z((com.google.android.gms.internal.firebase-auth-api.g0)((z)r2).g);
        final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(array);
        if (((z)r2).h) {
            ((z)r2).f();
            ((z)r2).h = false;
        }
        g0.v((com.google.android.gms.internal.firebase-auth-api.g0)((z)r2).g, zzn);
        final g0 g0 = (g0)((z)r2).c();
        final v8 r3 = q0.r();
        r3.h(((q0)s2.a).v());
        r3.k(zzaau.zzn(((zzaau)((q0)s2.a).u()).zzt()));
        final int n4 = ((q0)s2.a).y() - 2;
        int n5;
        if (n4 != 1) {
            if (n4 != 2) {
                if (n4 != 3) {
                    if (n4 != 4) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                    n5 = 4;
                }
                else {
                    n5 = 3;
                }
            }
            else {
                n5 = 2;
            }
        }
        else {
            n5 = 1;
        }
        final int n6 = n5 - 1;
        int n7;
        if (n6 != 0) {
            if (n6 != 1) {
                n7 = n3;
                if (n6 != 2) {
                    n7 = 6;
                }
            }
            else {
                n7 = 4;
            }
        }
        else {
            n7 = 3;
        }
        r3.o(n7);
        final q0 q0 = (q0)((z)r3).c();
        final e8 r4 = b0.r();
        if (((z)r4).h) {
            ((z)r4).f();
            ((z)r4).h = false;
        }
        b0.v((com.google.android.gms.internal.firebase-auth-api.b0)((z)r4).g, (com.google.android.gms.internal.firebase-auth-api.q0)q0);
        final b0 b0 = (b0)((z)r4).c();
        final g8 s3 = d0.s();
        if (((z)s3).h) {
            ((z)s3).f();
            ((z)s3).h = false;
        }
        d0.w((com.google.android.gms.internal.firebase-auth-api.d0)((z)s3).g, (com.google.android.gms.internal.firebase-auth-api.g0)g0);
        if (((z)s3).h) {
            ((z)s3).f();
            ((z)s3).h = false;
        }
        d0.x((com.google.android.gms.internal.firebase-auth-api.d0)((z)s3).g, (com.google.android.gms.internal.firebase-auth-api.b0)b0);
        if (((z)s3).h) {
            ((z)s3).f();
            ((z)s3).h = false;
        }
        d0.z((com.google.android.gms.internal.firebase-auth-api.d0)((z)s3).g, n);
        final d0 d0 = (d0)((z)s3).c();
        if (((z)r).h) {
            ((z)r).f();
            ((z)r).h = false;
        }
        c0.v((com.google.android.gms.internal.firebase-auth-api.c0)((z)r).g, (com.google.android.gms.internal.firebase-auth-api.d0)d0);
        return new c6((e)((z)r).c(), n2);
    }
    
    public final e6 a() {
        return new u4();
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.e0.u(zzaau, r.a());
    }
    
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }
    
    public final /* bridge */ void d(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.e0 e0 = (com.google.android.gms.internal.firebase_auth_api.e0)w0;
        if (!((zzaau)e0.w()).zzs()) {
            ea.c(e0.r());
            b5.a(((f0)e0.v()).s());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }
    
    public final int f() {
        return 4;
    }
    
    @Override
    public final w0 h(final w0 w0) throws GeneralSecurityException {
        return (w0)((com.google.android.gms.internal.firebase_auth_api.e0)w0).v();
    }
}
