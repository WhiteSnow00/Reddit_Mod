// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase_auth_api.z0;
import com.google.android.gms.internal.firebase_auth_api.o0;
import com.google.android.gms.internal.firebase_auth_api.k;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import com.google.android.gms.internal.firebase-auth-api.m0;
import com.google.android.gms.internal.firebase_auth_api.v;
import com.google.android.gms.internal.firebase_auth_api.y0;
import com.google.android.gms.internal.firebase_auth_api.h;
import java.security.InvalidKeyException;
import java.security.GeneralSecurityException;
import com.google.android.gms.internal.firebase_auth_api.n0;
import com.google.android.gms.internal.firebase_auth_api.i;

public final class v3 extends n6
{
    public final int b;
    
    public v3(final Class clazz, final int b) {
        this.b = b;
        super(clazz);
    }
    
    public final Object a(final w0 w0) {
        switch (this.b) {
            default: {
                final i i = (i)w0;
                return new ba((i7)new y9(((zzaau)i.w()).zzt()), ((k)i.v()).r());
            }
            case 2: {
                final n0 n0 = (n0)w0;
                if (!n0.A()) {
                    throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
                }
                if (!((o0)n0.v()).B()) {
                    throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
                }
                if (((zzaau)n0.w()).zzs()) {
                    throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
                }
                final m0 s = ((o0)n0.v()).s();
                final k5 f = g2.f(s);
                final f5 j = g2.i(s);
                final g5 b = g2.b(s);
                final int w2 = ((com.google.android.gms.internal.firebase_auth_api.m0)s).w();
                if (w2 - 2 == 1) {
                    final int n2 = ((com.google.android.gms.internal.firebase_auth_api.m0)((o0)n0.v()).s()).w() - 2;
                    Object o;
                    if (n2 != 1) {
                        int n3 = 3;
                        if (n2 != 2 && n2 != 3 && n2 != 4) {
                            throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
                        }
                        final byte[] zzt = ((zzaau)n0.w()).zzt();
                        final byte[] zzt2 = ((zzaau)((o0)n0.v()).x()).zzt();
                        final int n4 = ((com.google.android.gms.internal.firebase_auth_api.m0)((o0)n0.v()).s()).w() - 2;
                        if (n4 != 2) {
                            if (n4 != 3) {
                                if (n4 != 4) {
                                    throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
                                }
                            }
                            else {
                                n3 = 2;
                            }
                        }
                        else {
                            n3 = 1;
                        }
                        final ECPublicKey g = q9.g(q9.h(n3), 1, zzt2);
                        final ECPrivateKey f2 = q9.f(n3, zzt);
                        q9.d(f2, g);
                        q9.c(g.getW(), f2.getParams().getCurve());
                        o = new p5(zzt, zzt2);
                    }
                    else {
                        final byte[] zzt3 = ((zzaau)n0.w()).zzt();
                        if (zzt3.length != 32) {
                            throw new InvalidKeyException("Private key must have 32 bytes.");
                        }
                        final byte[] array = new byte[32];
                        array[0] = 9;
                        o = new h(zzt3, fa.e(zzt3, array));
                    }
                    return new i5((l5)o, f, j, b);
                }
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(u9.b(w2)));
            }
            case 1: {
                final y0 y0 = (y0)w0;
                final String v = ((z0)y0.v()).v();
                return new b4(((z0)y0.v()).r(), (e2)y2.a(v).a(v));
            }
            case 0: {
                return new m4(((zzaau)((v)w0).v()).zzt());
            }
        }
    }
}
