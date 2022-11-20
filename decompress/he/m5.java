// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.o0;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.l0;
import com.google.android.gms.internal.firebase_auth_api.m0;
import com.google.android.gms.internal.firebase-auth-api.n0;

public final class m5 extends o6
{
    public m5() {
        super(n0.class, new n6[] { new v3(i2.class, 2) });
    }
    
    public static c6 i(final int n, final int n2, final int n3, final int n4) {
        final r8 r = m0.r();
        if (((z)r).h) {
            ((z)r).f();
            ((z)r).h = false;
        }
        m0.x((com.google.android.gms.internal.firebase-auth-api.m0)((z)r).g, n);
        if (((z)r).h) {
            ((z)r).f();
            ((z)r).h = false;
        }
        m0.y((com.google.android.gms.internal.firebase-auth-api.m0)((z)r).g, n2);
        if (((z)r).h) {
            ((z)r).f();
            ((z)r).h = false;
        }
        m0.z((com.google.android.gms.internal.firebase-auth-api.m0)((z)r).g, n3);
        final m0 m0 = (m0)((z)r).c();
        final p8 r2 = l0.r();
        if (((z)r2).h) {
            ((z)r2).f();
            ((z)r2).h = false;
        }
        l0.v((com.google.android.gms.internal.firebase-auth-api.l0)((z)r2).g, (com.google.android.gms.internal.firebase-auth-api.m0)m0);
        return new c6((e)((z)r2).c(), n4);
    }
    
    public final e6 a() {
        return new w3(com.google.android.gms.internal.firebase-auth-api.l0.class, 2);
    }
    
    public final w0 b(final zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.n0.u(zzaau, r.a());
    }
    
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }
    
    public final /* bridge */ void d(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.n0 n0 = (com.google.android.gms.internal.firebase_auth_api.n0)w0;
        if (((com.google.android.gms.internal.firebase_auth_api.zzaau)n0.w()).zzs()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (n0.A()) {
            ea.c(n0.r());
            n5.a(((o0)n0.v()).s());
            return;
        }
        throw new GeneralSecurityException("Missing public key.");
    }
    
    public final int f() {
        return 4;
    }
    
    @Override
    public final w0 h(final w0 w0) throws GeneralSecurityException {
        return (w0)((com.google.android.gms.internal.firebase_auth_api.n0)w0).v();
    }
}
