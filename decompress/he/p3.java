// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.n;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.m;
import com.google.android.gms.internal.firebase_auth_api.k0;
import com.google.android.gms.internal.firebase_auth_api.j0;
import com.google.android.gms.internal.firebase_auth_api.p;
import com.google.android.gms.internal.firebase_auth_api.o;
import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.s;
import com.google.android.gms.internal.firebase_auth_api.r;
import com.google.android.gms.internal.firebase-auth-api.q;
import com.google.android.gms.internal.firebase-auth-api.l;

public final class p3 extends f6
{
    public final int d;
    
    public p3(final int d) {
        this.d = d;
        if (d != 1) {
            super((Class)l.class, new n6[] { new n3(e2.class, 0) });
            return;
        }
        super((Class)q.class, new n6[] { new n3(e2.class, 1) });
    }
    
    public static c6 h(final int n, final int n2) {
        final t7 s = r.s();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        r.x((com.google.android.gms.internal.firebase-auth-api.r)((z)s).g, n);
        final u7 s2 = com.google.android.gms.internal.firebase_auth_api.s.s();
        if (((z)s2).h) {
            ((z)s2).f();
            ((z)s2).h = false;
        }
        com.google.android.gms.internal.firebase_auth_api.s.v((com.google.android.gms.internal.firebase-auth-api.s)((z)s2).g);
        final s s3 = (s)((z)s2).c();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        r.w((com.google.android.gms.internal.firebase-auth-api.r)((z)s).g, (com.google.android.gms.internal.firebase-auth-api.s)s3);
        return new c6((e)((z)s).c(), n2);
    }
    
    public static c6 i(final int n, final int n2, final int n3) {
        final p7 s = o.s();
        final r7 s2 = p.s();
        if (((z)s2).h) {
            ((z)s2).f();
            ((z)s2).h = false;
        }
        p.v((com.google.android.gms.internal.firebase-auth-api.p)((z)s2).g);
        final p p3 = (p)((z)s2).c();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        o.x((com.google.android.gms.internal.firebase-auth-api.o)((z)s).g, (com.google.android.gms.internal.firebase-auth-api.p)p3);
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        o.y((com.google.android.gms.internal.firebase-auth-api.o)((z)s).g, n);
        final o o = (o)((z)s).c();
        final n8 s3 = j0.s();
        final o8 s4 = k0.s();
        s4.k(5);
        s4.h(n2);
        s3.k((com.google.android.gms.internal.firebase-auth-api.k0)((z)s4).c());
        s3.h(32);
        final j0 j0 = (j0)((z)s3).c();
        final n7 r = m.r();
        if (((z)r).h) {
            ((z)r).f();
            ((z)r).h = false;
        }
        m.w((com.google.android.gms.internal.firebase-auth-api.m)((z)r).g, (com.google.android.gms.internal.firebase-auth-api.o)o);
        if (((z)r).h) {
            ((z)r).f();
            ((z)r).h = false;
        }
        m.x((com.google.android.gms.internal.firebase-auth-api.m)((z)r).g, (com.google.android.gms.internal.firebase-auth-api.j0)j0);
        return new c6((e)((z)r).c(), n3);
    }
    
    public final e6 a() {
        switch (this.d) {
            default: {
                return new o3(com.google.android.gms.internal.firebase-auth-api.r.class, 1);
            }
            case 0: {
                return new o3(com.google.android.gms.internal.firebase-auth-api.m.class, 0);
            }
        }
    }
    
    public final w0 b(final zzaau zzaau) {
        switch (this.d) {
            default: {
                return (w0)com.google.android.gms.internal.firebase_auth_api.q.u(zzaau, he.r.a());
            }
            case 0: {
                return (w0)com.google.android.gms.internal.firebase_auth_api.l.u(zzaau, he.r.a());
            }
        }
    }
    
    public final String c() {
        switch (this.d) {
            default: {
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            }
            case 0: {
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            }
        }
    }
    
    public final void d(final w0 w0) {
        switch (this.d) {
            default: {
                final com.google.android.gms.internal.firebase_auth_api.q q = (com.google.android.gms.internal.firebase_auth_api.q)w0;
                ea.c(q.r());
                ea.b(((com.google.android.gms.internal.firebase_auth_api.zzaau)q.w()).zzd());
                if (((s)q.v()).r() != 12 && ((s)q.v()).r() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            }
            case 0: {
                final com.google.android.gms.internal.firebase_auth_api.l l = (com.google.android.gms.internal.firebase_auth_api.l)w0;
                ea.c(l.r());
                new s3();
                final n v = l.v();
                ea.c(((com.google.android.gms.internal.firebase_auth_api.n)v).r());
                ea.b(((com.google.android.gms.internal.firebase_auth_api.zzaau)((com.google.android.gms.internal.firebase_auth_api.n)v).x()).zzd());
                final com.google.android.gms.internal.firebase-auth-api.p w2 = ((com.google.android.gms.internal.firebase_auth_api.n)v).w();
                if (((p)w2).r() >= 12 && ((p)w2).r() <= 16) {
                    new a4(2);
                    a4.h(l.w());
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
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
        return 3;
    }
}
