// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.e;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.internal.firebase-auth-api.k0;
import com.google.android.gms.internal.firebase_auth_api.z;
import com.google.android.gms.internal.firebase_auth_api.a0;
import com.google.android.gms.internal.firebase_auth_api.b1;
import com.google.android.gms.internal.firebase_auth_api.c1;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.i0;
import com.google.android.gms.internal.firebase_auth_api.j0;

public final class z3 extends e6
{
    public final int b;
    
    public z3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final w0 a(final w0 w0) {
        switch (this.b) {
            default: {
                final j0 j0 = (j0)w0;
                final m8 s = i0.s();
                if (((he.z)s).h) {
                    ((he.z)s).f();
                    ((he.z)s).h = false;
                }
                i0.y((com.google.android.gms.internal.firebase-auth-api.i0)((he.z)s).g);
                final k0 w2 = j0.w();
                if (((he.z)s).h) {
                    ((he.z)s).f();
                    ((he.z)s).h = false;
                }
                i0.z((com.google.android.gms.internal.firebase-auth-api.i0)((he.z)s).g, w2);
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(ca.a(j0.r()));
                if (((he.z)s).h) {
                    ((he.z)s).f();
                    ((he.z)s).h = false;
                }
                i0.A((com.google.android.gms.internal.firebase-auth-api.i0)((he.z)s).g, zzn);
                return (w0)((he.z)s).c();
            }
            case 1: {
                final c1 c1 = (c1)w0;
                final e9 s2 = b1.s();
                if (((he.z)s2).h) {
                    ((he.z)s2).f();
                    ((he.z)s2).h = false;
                }
                b1.w((com.google.android.gms.internal.firebase-auth-api.b1)((he.z)s2).g);
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn2 = zzaau.zzn(ca.a(32));
                if (((he.z)s2).h) {
                    ((he.z)s2).f();
                    ((he.z)s2).h = false;
                }
                b1.x((com.google.android.gms.internal.firebase-auth-api.b1)((he.z)s2).g, zzn2);
                return (w0)((he.z)s2).c();
            }
            case 0: {
                final a0 a0 = (a0)w0;
                final c8 s3 = z.s();
                if (((he.z)s3).h) {
                    ((he.z)s3).f();
                    ((he.z)s3).h = false;
                }
                z.w((com.google.android.gms.internal.firebase-auth-api.z)((he.z)s3).g);
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn3 = zzaau.zzn(ca.a(32));
                if (((he.z)s3).h) {
                    ((he.z)s3).f();
                    ((he.z)s3).h = false;
                }
                z.x((com.google.android.gms.internal.firebase-auth-api.z)((he.z)s3).g, zzn3);
                return (w0)((he.z)s3).c();
            }
        }
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) {
        switch (this.b) {
            default: {
                return (w0)j0.v(zzaau, r.a());
            }
            case 1: {
                return (w0)c1.t(zzaau, r.a());
            }
            case 0: {
                return (w0)a0.t(zzaau, r.a());
            }
        }
    }
    
    public final Map c() {
        switch (this.b) {
            default: {
                final HashMap hashMap = new HashMap();
                hashMap.put("HMAC_SHA256_128BITTAG", a4.i(32, 16, 5, 1));
                hashMap.put("HMAC_SHA256_128BITTAG_RAW", a4.i(32, 16, 5, 3));
                hashMap.put("HMAC_SHA256_256BITTAG", a4.i(32, 32, 5, 1));
                hashMap.put("HMAC_SHA256_256BITTAG_RAW", a4.i(32, 32, 5, 3));
                hashMap.put("HMAC_SHA512_128BITTAG", a4.i(64, 16, 6, 1));
                hashMap.put("HMAC_SHA512_128BITTAG_RAW", a4.i(64, 16, 6, 3));
                hashMap.put("HMAC_SHA512_256BITTAG", a4.i(64, 32, 6, 1));
                hashMap.put("HMAC_SHA512_256BITTAG_RAW", a4.i(64, 32, 6, 3));
                hashMap.put("HMAC_SHA512_512BITTAG", a4.i(64, 64, 6, 1));
                hashMap.put("HMAC_SHA512_512BITTAG_RAW", a4.i(64, 64, 6, 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap);
            }
            case 1: {
                final HashMap hashMap2 = new HashMap();
                hashMap2.put("XCHACHA20_POLY1305", new c6((e)c1.s(), 1));
                hashMap2.put("XCHACHA20_POLY1305_RAW", new c6((e)c1.s(), 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap2);
            }
            case 0: {
                final HashMap hashMap3 = new HashMap();
                hashMap3.put("CHACHA20_POLY1305", new c6((e)a0.s(), 1));
                hashMap3.put("CHACHA20_POLY1305_RAW", new c6((e)a0.s(), 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap3);
            }
        }
    }
    
    public final /* bridge */ void d(final w0 w0) {
        switch (this.b) {
            default: {
                final j0 j0 = (j0)w0;
                if (j0.r() >= 16) {
                    a4.j(j0.w());
                    return;
                }
                throw new GeneralSecurityException("key too short");
            }
            case 1: {
                final c1 c1 = (c1)w0;
                return;
            }
            case 0: {
                final a0 a0 = (a0)w0;
            }
        }
    }
}
