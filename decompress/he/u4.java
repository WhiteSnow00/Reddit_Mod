// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.g0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase-auth-api.d0;
import java.security.spec.ECPoint;
import java.security.KeyPair;
import java.security.spec.ECParameterSpec;
import com.google.android.gms.internal.firebase_auth_api.e0;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.f0;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.KeyPairGenerator;
import com.google.android.gms.internal.firebase-auth-api.c0;

public final class u4 extends e6
{
    public u4() {
        super((Class)c0.class);
    }
    
    public final w0 a(final w0 w0) throws GeneralSecurityException {
        final com.google.android.gms.internal.firebase_auth_api.c0 c0 = (com.google.android.gms.internal.firebase_auth_api.c0)w0;
        final ECParameterSpec h = q9.h(b5.c(((g0)((com.google.android.gms.internal.firebase_auth_api.d0)c0.u()).v()).w()));
        final KeyPairGenerator keyPairGenerator = (KeyPairGenerator)s9.h.a("EC");
        keyPairGenerator.initialize(h);
        final KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        final ECPublicKey ecPublicKey = (ECPublicKey)generateKeyPair.getPublic();
        final ECPrivateKey ecPrivateKey = (ECPrivateKey)generateKeyPair.getPrivate();
        final ECPoint w2 = ecPublicKey.getW();
        final i8 t = f0.t();
        if (((z)t).h) {
            ((z)t).f();
            ((z)t).h = false;
        }
        f0.z((com.google.android.gms.internal.firebase-auth-api.f0)((z)t).g);
        final d0 u = c0.u();
        if (((z)t).h) {
            ((z)t).f();
            ((z)t).h = false;
        }
        f0.A((com.google.android.gms.internal.firebase-auth-api.f0)((z)t).g, u);
        final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(w2.getAffineX().toByteArray());
        if (((z)t).h) {
            ((z)t).f();
            ((z)t).h = false;
        }
        f0.B((com.google.android.gms.internal.firebase-auth-api.f0)((z)t).g, zzn);
        final com.google.android.gms.internal.firebase-auth-api.zzaau zzn2 = zzaau.zzn(w2.getAffineY().toByteArray());
        if (((z)t).h) {
            ((z)t).f();
            ((z)t).h = false;
        }
        f0.C((com.google.android.gms.internal.firebase-auth-api.f0)((z)t).g, zzn2);
        final f0 f0 = (f0)((z)t).c();
        final h8 s = e0.s();
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        e0.x((com.google.android.gms.internal.firebase-auth-api.e0)((z)s).g);
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        e0.y((com.google.android.gms.internal.firebase-auth-api.e0)((z)s).g, (com.google.android.gms.internal.firebase-auth-api.f0)f0);
        final com.google.android.gms.internal.firebase-auth-api.zzaau zzn3 = zzaau.zzn(ecPrivateKey.getS().toByteArray());
        if (((z)s).h) {
            ((z)s).f();
            ((z)s).h = false;
        }
        e0.z((com.google.android.gms.internal.firebase-auth-api.e0)((z)s).g, zzn3);
        return (w0)((z)s).c();
    }
    
    public final w0 b(final com.google.android.gms.internal.firebase-auth-api.zzaau zzaau) throws zzacf {
        return (w0)com.google.android.gms.internal.firebase_auth_api.c0.t(zzaau, r.a());
    }
    
    public final Map c() throws GeneralSecurityException {
        final HashMap hashMap = new HashMap();
        final s2 a = t2.a("AES128_GCM");
        final byte[] d = v4.d;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", v4.i(3, a, d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", v4.i(3, t2.a("AES128_GCM"), d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", v4.i(4, t2.a("AES128_GCM"), d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", v4.i(4, t2.a("AES128_GCM"), d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", v4.i(4, t2.a("AES128_GCM"), d, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", v4.i(3, t2.a("AES128_CTR_HMAC_SHA256"), d, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", v4.i(3, t2.a("AES128_CTR_HMAC_SHA256"), d, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", v4.i(4, t2.a("AES128_CTR_HMAC_SHA256"), d, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", v4.i(4, t2.a("AES128_CTR_HMAC_SHA256"), d, 3));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public final void d(final w0 w0) throws GeneralSecurityException {
        b5.a(((com.google.android.gms.internal.firebase_auth_api.c0)w0).u());
    }
}
