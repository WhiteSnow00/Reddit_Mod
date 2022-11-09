// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import com.google.android.gms.internal.firebase_auth_api.a;
import com.google.android.gms.internal.firebase_auth_api.l;
import com.google.android.gms.internal.firebase_auth_api.j0;
import com.google.android.gms.internal.firebase_auth_api.i0;
import com.google.android.gms.internal.firebase_auth_api.o;
import com.google.android.gms.internal.firebase_auth_api.n;
import com.google.android.gms.internal.firebase_auth_api.t;
import com.google.android.gms.internal.firebase_auth_api.r;
import com.google.android.gms.internal.firebase_auth_api.q;
import com.google.android.gms.internal.firebase-auth-api.p0;

@Deprecated
public final class j3
{
    public static final p0 a;
    public static final p0 b;
    
    static {
        a = b(16);
        b(32);
        a(16);
        a(32);
        b = c(16, 16);
        c(32, 32);
        final x8 r = com.google.android.gms.internal.firebase_auth_api.p0.r();
        new r3(2);
        r.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        r.o(3);
        final com.google.android.gms.internal.firebase_auth_api.p0 p0 = (com.google.android.gms.internal.firebase_auth_api.p0)r.d();
        final x8 r2 = com.google.android.gms.internal.firebase_auth_api.p0.r();
        new o3(2);
        r2.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        r2.o(3);
        final com.google.android.gms.internal.firebase_auth_api.p0 p2 = (com.google.android.gms.internal.firebase_auth_api.p0)r2.d();
    }
    
    public static void a(final int n) {
        final v7 s = q.s();
        if (s.h) {
            s.f();
            s.h = false;
        }
        q.x((com.google.android.gms.internal.firebase-auth-api.q)s.g, n);
        final w7 s2 = r.s();
        if (s2.h) {
            s2.f();
            s2.h = false;
        }
        r.v((com.google.android.gms.internal.firebase-auth-api.r)s2.g);
        final r r = (r)s2.d();
        if (s.h) {
            s.f();
            s.h = false;
        }
        q.w((com.google.android.gms.internal.firebase-auth-api.q)s.g, (com.google.android.gms.internal.firebase-auth-api.r)r);
        final q q = (q)s.d();
        final x8 r2 = com.google.android.gms.internal.firebase_auth_api.p0.r();
        r2.k(((a)q).g());
        new u3(0);
        r2.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
        r2.o(3);
        final com.google.android.gms.internal.firebase_auth_api.p0 p = (com.google.android.gms.internal.firebase_auth_api.p0)r2.d();
    }
    
    public static p0 b(final int n) {
        final y7 s = t.s();
        if (s.h) {
            s.f();
            s.h = false;
        }
        t.v((com.google.android.gms.internal.firebase-auth-api.t)s.g, n);
        final t t = (t)s.d();
        final x8 r = com.google.android.gms.internal.firebase_auth_api.p0.r();
        r.k(((a)t).g());
        new r3(1);
        r.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
        r.o(3);
        return (p0)r.d();
    }
    
    public static p0 c(final int n, final int n2) {
        final s7 s = n.s();
        final t7 s2 = o.s();
        if (s2.h) {
            s2.f();
            s2.h = false;
        }
        o.v((com.google.android.gms.internal.firebase-auth-api.o)s2.g);
        final o o = (o)s2.d();
        if (s.h) {
            s.f();
            s.h = false;
        }
        n.x((com.google.android.gms.internal.firebase-auth-api.n)s.g, (com.google.android.gms.internal.firebase-auth-api.o)o);
        if (s.h) {
            s.f();
            s.h = false;
        }
        n.y((com.google.android.gms.internal.firebase-auth-api.n)s.g, n);
        final n n3 = (n)s.d();
        final p8 s3 = i0.s();
        final q8 s4 = j0.s();
        s4.k(5);
        s4.h(n2);
        s3.k((com.google.android.gms.internal.firebase-auth-api.j0)s4.d());
        s3.h(32);
        final i0 i0 = (i0)s3.d();
        final q7 r = l.r();
        if (r.h) {
            r.f();
            r.h = false;
        }
        l.w((com.google.android.gms.internal.firebase-auth-api.l)r.g, (com.google.android.gms.internal.firebase-auth-api.n)n3);
        if (r.h) {
            r.f();
            r.h = false;
        }
        l.x((com.google.android.gms.internal.firebase-auth-api.l)r.g, (com.google.android.gms.internal.firebase-auth-api.i0)i0);
        final l l = (l)r.d();
        final x8 r2 = com.google.android.gms.internal.firebase_auth_api.p0.r();
        r2.k(((a)l).g());
        new o3(0);
        r2.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        r2.o(3);
        return (p0)r2.d();
    }
}
