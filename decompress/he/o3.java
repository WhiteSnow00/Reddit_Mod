// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.p;
import com.google.android.gms.internal.firebase-auth-api.o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.internal.firebase-auth-api.n;
import com.google.android.gms.internal.firebase-auth-api.s;
import com.google.android.gms.internal.firebase_auth_api.i0;
import com.google.android.gms.internal.firebase_auth_api.l;
import com.google.android.gms.internal.firebase_auth_api.m;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.q;
import com.google.android.gms.internal.firebase_auth_api.r;

public final class o3 extends e6
{
    public final int b;
    
    public o3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final w0 a(final w0 w0) {
        switch (this.b) {
            default: {
                final r r = (r)w0;
                final s7 s = q.s();
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(ca.a(r.r()));
                if (((z)s).h) {
                    ((z)s).f();
                    ((z)s).h = false;
                }
                q.z((com.google.android.gms.internal.firebase-auth-api.q)((z)s).g, zzn);
                final s v = r.v();
                if (((z)s).h) {
                    ((z)s).f();
                    ((z)s).h = false;
                }
                q.y((com.google.android.gms.internal.firebase-auth-api.q)((z)s).g, v);
                if (((z)s).h) {
                    ((z)s).f();
                    ((z)s).h = false;
                }
                q.x((com.google.android.gms.internal.firebase-auth-api.q)((z)s).g);
                return (w0)((z)s).c();
            }
            case 0: {
                final m m = (m)w0;
                new s3();
                final n e = r3.e(m.u());
                final w0 a = new a4(2).a().a((w0)m.v());
                final m7 s2 = l.s();
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                l.y((com.google.android.gms.internal.firebase-auth-api.l)((z)s2).g, e);
                final i0 i0 = (i0)a;
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                l.z((com.google.android.gms.internal.firebase-auth-api.l)((z)s2).g, (com.google.android.gms.internal.firebase-auth-api.i0)i0);
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                l.x((com.google.android.gms.internal.firebase-auth-api.l)((z)s2).g, 0);
                return (w0)((z)s2).c();
            }
        }
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) {
        switch (this.b) {
            default: {
                return (w0)r.u(zzaau, he.r.a());
            }
            case 0: {
                return (w0)m.t(zzaau, he.r.a());
            }
        }
    }
    
    public final Map c() {
        switch (this.b) {
            default: {
                final HashMap hashMap = new HashMap();
                hashMap.put("AES128_EAX", p3.h(16, 1));
                hashMap.put("AES128_EAX_RAW", p3.h(16, 3));
                hashMap.put("AES256_EAX", p3.h(32, 1));
                hashMap.put("AES256_EAX_RAW", p3.h(32, 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap);
            }
            case 0: {
                final HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_CTR_HMAC_SHA256", p3.i(16, 16, 1));
                hashMap2.put("AES128_CTR_HMAC_SHA256_RAW", p3.i(16, 16, 3));
                hashMap2.put("AES256_CTR_HMAC_SHA256", p3.i(32, 32, 1));
                hashMap2.put("AES256_CTR_HMAC_SHA256_RAW", p3.i(32, 32, 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap2);
            }
        }
    }
    
    public final void d(final w0 w0) {
        switch (this.b) {
            default: {
                final r r = (r)w0;
                ea.b(r.r());
                if (((com.google.android.gms.internal.firebase_auth_api.s)r.v()).r() != 12 && ((com.google.android.gms.internal.firebase_auth_api.s)r.v()).r() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            }
            case 0: {
                final m m = (m)w0;
                new s3();
                final o u = m.u();
                ea.b(((com.google.android.gms.internal.firebase_auth_api.o)u).r());
                final p w2 = ((com.google.android.gms.internal.firebase_auth_api.o)u).w();
                if (((com.google.android.gms.internal.firebase_auth_api.p)w2).r() >= 12 && ((com.google.android.gms.internal.firebase_auth_api.p)w2).r() <= 16) {
                    new a4(2).a().d((w0)m.v());
                    ea.b(((com.google.android.gms.internal.firebase_auth_api.o)m.u()).r());
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            }
        }
    }
}
