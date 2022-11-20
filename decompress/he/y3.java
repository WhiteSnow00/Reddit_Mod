// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.b0;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase_auth_api.k0;
import java.security.spec.ECParameterSpec;
import com.google.android.gms.internal.firebase-auth-api.g0;
import com.google.android.gms.internal.firebase-auth-api.d0;
import com.google.android.gms.internal.firebase-auth-api.m0;
import com.google.android.gms.internal.firebase_auth_api.z;
import com.google.android.gms.internal.firebase_auth_api.b1;
import java.security.spec.KeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.math.BigInteger;
import com.google.android.gms.internal.firebase_auth_api.f0;
import com.google.android.gms.internal.firebase_auth_api.o0;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
import com.google.android.gms.internal.firebase_auth_api.i0;

public final class y3 extends n6
{
    public final int b;
    
    public y3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final Object a(final w0 w0) {
        switch (this.b) {
            default: {
                final i0 i0 = (i0)w0;
                int w2 = ((k0)i0.w()).w();
                final SecretKeySpec secretKeySpec = new SecretKeySpec(((zzaau)i0.x()).zzt(), "HMAC");
                final int r = ((k0)i0.w()).r();
                w2 -= 2;
                ba ba;
                if (w2 != 1) {
                    if (w2 != 2) {
                        if (w2 != 3) {
                            if (w2 != 4) {
                                if (w2 != 5) {
                                    throw new GeneralSecurityException("unknown hash");
                                }
                                ba = new ba((i7)new aa("HMACSHA224", secretKeySpec), r);
                            }
                            else {
                                ba = new ba((i7)new aa("HMACSHA512", secretKeySpec), r);
                            }
                        }
                        else {
                            ba = new ba((i7)new aa("HMACSHA256", secretKeySpec), r);
                        }
                    }
                    else {
                        ba = new ba((i7)new aa("HMACSHA384", secretKeySpec), r);
                    }
                }
                else {
                    ba = new ba((i7)new aa("HMACSHA1", secretKeySpec), r);
                }
                return ba;
            }
            case 3: {
                final o0 o0 = (o0)w0;
                if (!((zzaau)o0.x()).zzs()) {
                    final m0 s = o0.s();
                    return new j5((com.google.android.gms.internal.firebase-auth-api.o0)o0, g2.f(s), g2.i(s), g2.b(s));
                }
                throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
            }
            case 2: {
                final f0 f0 = (f0)w0;
                final d0 s2 = f0.s();
                final g0 v = ((com.google.android.gms.internal.firebase_auth_api.d0)s2).v();
                final int c = b5.c(((com.google.android.gms.internal.firebase_auth_api.g0)v).w());
                final byte[] zzt = ((zzaau)f0.x()).zzt();
                final byte[] zzt2 = ((zzaau)f0.y()).zzt();
                final ECParameterSpec h = q9.h(c);
                final ECPoint ecPoint = new ECPoint(new BigInteger(1, zzt), new BigInteger(1, zzt2));
                q9.c(ecPoint, h.getCurve());
                final ECPublicKey ecPublicKey = (ECPublicKey)((KeyFactory)s9.i.a("EC")).generatePublic(new ECPublicKeySpec(ecPoint, h));
                new c5(((b0)((com.google.android.gms.internal.firebase_auth_api.d0)s2).r()).u());
                ((zzaau)((com.google.android.gms.internal.firebase_auth_api.g0)v).u()).zzt();
                b5.b(((com.google.android.gms.internal.firebase_auth_api.g0)v).x());
                b5.d(((com.google.android.gms.internal.firebase_auth_api.d0)s2).y());
                return new o9(ecPublicKey);
            }
            case 1: {
                return new ga(((zzaau)((b1)w0).v()).zzt());
            }
            case 0: {
                return new k9(((zzaau)((z)w0).v()).zzt());
            }
        }
    }
}
