// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Collections;
import java.util.Map;
import com.google.android.gms.internal.firebase-auth-api.m0;
import com.google.android.gms.internal.firebase_auth_api.v;
import com.google.android.gms.internal.firebase_auth_api.w;
import com.google.android.gms.internal.firebase_auth_api.y0;
import com.google.android.gms.internal.firebase_auth_api.z0;
import java.security.InvalidKeyException;
import com.google.android.gms.internal.firebase_auth_api.n0;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.o0;
import com.google.android.gms.internal.firebase_auth_api.l0;

public final class w3 extends e6
{
    public final int b;
    
    public w3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final w0 a(final w0 w0) {
        switch (this.b) {
            default: {
                final l0 l0 = (l0)w0;
                final byte[] a = ca.a(32);
                a[0] |= 0x7;
                final int n = a[31] & 0x3F;
                a[31] = (byte)n;
                a[31] = (byte)(n | 0x80);
                if (a.length == 32) {
                    final byte[] array = new byte[32];
                    array[0] = 9;
                    final byte[] e = fa.e(a, array);
                    final t8 t = o0.t();
                    if (((z)t).h) {
                        ((z)t).f();
                        ((z)t).h = false;
                    }
                    o0.y((com.google.android.gms.internal.firebase-auth-api.o0)((z)t).g);
                    final m0 u = l0.u();
                    if (((z)t).h) {
                        ((z)t).f();
                        ((z)t).h = false;
                    }
                    o0.z((com.google.android.gms.internal.firebase-auth-api.o0)((z)t).g, u);
                    final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(e);
                    if (((z)t).h) {
                        ((z)t).f();
                        ((z)t).h = false;
                    }
                    o0.A((com.google.android.gms.internal.firebase-auth-api.o0)((z)t).g, zzn);
                    final o0 o0 = (o0)((z)t).c();
                    final s8 s = n0.s();
                    if (((z)s).h) {
                        ((z)s).f();
                        ((z)s).h = false;
                    }
                    n0.x((com.google.android.gms.internal.firebase-auth-api.n0)((z)s).g);
                    if (((z)s).h) {
                        ((z)s).f();
                        ((z)s).h = false;
                    }
                    n0.y((com.google.android.gms.internal.firebase-auth-api.n0)((z)s).g, (com.google.android.gms.internal.firebase-auth-api.o0)o0);
                    final com.google.android.gms.internal.firebase-auth-api.zzaau zzn2 = zzaau.zzn(a);
                    if (((z)s).h) {
                        ((z)s).f();
                        ((z)s).h = false;
                    }
                    n0.z((com.google.android.gms.internal.firebase-auth-api.n0)((z)s).g, zzn2);
                    return (w0)((z)s).c();
                }
                throw new InvalidKeyException("Private key must have 32 bytes.");
            }
            case 1: {
                final z0 z0 = (z0)w0;
                final c9 s2 = y0.s();
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                y0.x((com.google.android.gms.internal.firebase-auth-api.y0)((z)s2).g, (com.google.android.gms.internal.firebase-auth-api.z0)z0);
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                y0.w((com.google.android.gms.internal.firebase-auth-api.y0)((z)s2).g);
                return (w0)((z)s2).c();
            }
            case 0: {
                final w w2 = (w)w0;
                final x7 s3 = v.s();
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn3 = zzaau.zzn(ca.a(w2.r()));
                if (((z)s3).h) {
                    ((z)s3).f();
                    ((z)s3).h = false;
                }
                v.x((com.google.android.gms.internal.firebase-auth-api.v)((z)s3).g, zzn3);
                if (((z)s3).h) {
                    ((z)s3).f();
                    ((z)s3).h = false;
                }
                v.w((com.google.android.gms.internal.firebase-auth-api.v)((z)s3).g);
                return (w0)((z)s3).c();
            }
        }
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) {
        switch (this.b) {
            default: {
                return (w0)l0.t(zzaau, r.a());
            }
            case 1: {
                return (w0)z0.u(zzaau, r.a());
            }
            case 0: {
                return (w0)w.u(zzaau, r.a());
            }
        }
    }
    
    public final Map c() {
        switch (this.b) {
            default: {
                return Collections.emptyMap();
            }
            case 2: {
                final HashMap hashMap = new HashMap();
                hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", m5.i(3, 3, 3, 1));
                hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", m5.i(3, 3, 3, 3));
                hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", m5.i(3, 3, 4, 1));
                hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", m5.i(3, 3, 4, 3));
                hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", m5.i(3, 3, 5, 1));
                hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", m5.i(3, 3, 5, 3));
                hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", m5.i(4, 3, 3, 1));
                hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", m5.i(4, 3, 3, 3));
                hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", m5.i(4, 3, 4, 1));
                hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", m5.i(4, 3, 4, 3));
                hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", m5.i(5, 4, 3, 1));
                hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", m5.i(5, 4, 3, 3));
                hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", m5.i(5, 4, 4, 1));
                hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", m5.i(5, 4, 4, 3));
                hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", m5.i(6, 5, 3, 1));
                hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", m5.i(6, 5, 3, 3));
                hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", m5.i(6, 5, 4, 1));
                hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", m5.i(6, 5, 4, 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap);
            }
            case 0: {
                final HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM_SIV", x3.h(16, 1));
                hashMap2.put("AES128_GCM_SIV_RAW", x3.h(16, 3));
                hashMap2.put("AES256_GCM_SIV", x3.h(32, 1));
                hashMap2.put("AES256_GCM_SIV_RAW", x3.h(32, 3));
                return Collections.unmodifiableMap((Map<?, ?>)hashMap2);
            }
        }
    }
    
    public final void d(final w0 w0) {
        switch (this.b) {
            default: {
                n5.a(((l0)w0).u());
                return;
            }
            case 1: {
                final z0 z0 = (z0)w0;
                if (!z0.v().isEmpty() && z0.w()) {
                    return;
                }
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
            case 0: {
                ea.b(((w)w0).r());
            }
        }
    }
}
