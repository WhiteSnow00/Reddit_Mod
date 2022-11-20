// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.zzacf;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.p;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.n;
import com.google.android.gms.internal.firebase-auth-api.o;

public final class r3 extends e6
{
    public r3(final s3 s3) {
        super((Class)o.class);
    }
    
    public static final n e(final o o) throws GeneralSecurityException {
        final o7 s = com.google.android.gms.internal.firebase_auth_api.n.s();
        final p w = ((com.google.android.gms.internal.firebase_auth_api.o)o).w();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        com.google.android.gms.internal.firebase_auth_api.n.z((n)((z)s).g, w);
        final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(ca.a(((com.google.android.gms.internal.firebase_auth_api.o)o).r()));
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        com.google.android.gms.internal.firebase_auth_api.n.A((n)((z)s).g, zzn);
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        com.google.android.gms.internal.firebase_auth_api.n.y((n)((z)s).g);
        return (n)((z)s).c();
    }
    
    public final /* bridge */ w0 a(final w0 w0) throws GeneralSecurityException {
        return (w0)e((o)w0);
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.o.v(zzaau, r.a());
    }
    
    public final void d(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.o o = (com.google.android.gms.internal.firebase_auth_api.o)w0;
        ea.b(o.r());
        final p w2 = o.w();
        if (((com.google.android.gms.internal.firebase_auth_api.p)w2).r() >= 12 && ((com.google.android.gms.internal.firebase_auth_api.p)w2).r() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}
