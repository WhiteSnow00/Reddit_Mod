// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.internal.firebase_auth_api.o0;
import java.util.Iterator;
import com.google.android.gms.internal.firebase_auth_api.t0;
import com.google.android.gms.internal.firebase_auth_api.r0;
import com.google.android.gms.internal.firebase-auth-api.u0;
import com.google.android.gms.internal.firebase-auth-api.s0;
import java.nio.charset.Charset;

public final class h3
{
    static {
        Charset.forName("UTF-8");
    }
    
    public static u0 a(final s0 s0) {
        final z8 r = com.google.android.gms.internal.firebase_auth_api.u0.r();
        final int s2 = ((com.google.android.gms.internal.firebase_auth_api.s0)s0).s();
        if (r.h) {
            r.f();
            r.h = false;
        }
        com.google.android.gms.internal.firebase_auth_api.u0.u((u0)r.g, s2);
        for (final r0 r2 : ((com.google.android.gms.internal.firebase_auth_api.s0)s0).x()) {
            final a9 s3 = t0.s();
            final String v = ((o0)r2.s()).v();
            if (s3.h) {
                s3.f();
                s3.h = false;
            }
            t0.u((com.google.android.gms.internal.firebase-auth-api.t0)s3.g, v);
            final int y = r2.y();
            if (s3.h) {
                s3.f();
                s3.h = false;
            }
            t0.x((com.google.android.gms.internal.firebase-auth-api.t0)s3.g, y);
            final int z = r2.z();
            if (s3.h) {
                s3.f();
                s3.h = false;
            }
            t0.w((com.google.android.gms.internal.firebase-auth-api.t0)s3.g, z);
            final int r3 = r2.r();
            if (s3.h) {
                s3.f();
                s3.h = false;
            }
            t0.v((com.google.android.gms.internal.firebase-auth-api.t0)s3.g, r3);
            final t0 t0 = (t0)s3.d();
            if (r.h) {
                r.f();
                r.h = false;
            }
            com.google.android.gms.internal.firebase_auth_api.u0.v((u0)r.g, (com.google.android.gms.internal.firebase-auth-api.t0)t0);
        }
        return (u0)r.d();
    }
}
