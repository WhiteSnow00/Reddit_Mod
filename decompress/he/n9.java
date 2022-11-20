// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.security.spec.EllipticCurve;
import com.google.android.gms.internal.firebase_auth_api.x;
import com.google.android.gms.internal.firebase_auth_api.l;
import com.google.android.gms.internal.firebase_auth_api.i0;
import com.google.android.gms.internal.firebase_auth_api.n;
import com.google.android.gms.internal.firebase_auth_api.zzaau;
import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.t;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.util.Arrays;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

public final class n9 implements i2
{
    public static final byte[] g;
    public final ECPrivateKey a;
    public final p9 b;
    public final String c;
    public final byte[] d;
    public final m9 e;
    public final int f;
    
    static {
        g = new byte[0];
    }
    
    public n9(final ECPrivateKey a, final byte[] d, final String c, final int f, final c5 e) throws GeneralSecurityException {
        this.a = a;
        this.b = new p9(a);
        this.d = d;
        this.c = c;
        this.f = f;
        this.e = (m9)e;
    }
    
    public final byte[] a(byte[] array) throws GeneralSecurityException {
        final EllipticCurve curve = this.a.getParams().getCurve();
        final int f = this.f;
        int n = (q9.a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        final int n2 = f - 1;
        int n3 = 1;
        Label_0075: {
            if (n2 != 0) {
                if (n2 == 2) {
                    n += n;
                    break Label_0075;
                }
            }
            else {
                n += n;
            }
            ++n;
        }
        final int length = array.length;
        if (length < n) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        final byte[] copyOfRange = Arrays.copyOfRange(array, 0, n);
        final p9 b = this.b;
        final String c = this.c;
        final byte[] d = this.d;
        final int b2 = ((c5)this.e).b;
        final byte[] j = g2.j(new byte[][] { copyOfRange, q9.e((ECPrivateKey)b.f, q9.g(((ECPrivateKey)b.f).getParams(), this.f, copyOfRange)) });
        final Mac mac = (Mac)s9.f.a(c);
        if (b2 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (d != null && d.length != 0) {
            mac.init(new SecretKeySpec(d, c));
        }
        else {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], c));
        }
        final byte[] doFinal = mac.doFinal(j);
        final byte[] array2 = new byte[b2];
        mac.init(new SecretKeySpec(doFinal, c));
        byte[] doFinal2 = new byte[0];
        int n4 = 0;
        while (true) {
            mac.update(doFinal2);
            mac.update((byte[])null);
            mac.update((byte)n3);
            doFinal2 = mac.doFinal();
            final int length2 = doFinal2.length;
            final int n5 = n4 + length2;
            if (n5 >= b2) {
                break;
            }
            System.arraycopy(doFinal2, 0, array2, n4, length2);
            ++n3;
            n4 = n5;
        }
        System.arraycopy(doFinal2, 0, array2, n4, b2 - n4);
        final c5 c2 = (c5)this.e;
        c2.getClass();
        if (b2 == c2.b) {
            r5 r5;
            if (c2.a.equals(j3.b)) {
                final v7 s = t.s();
                ((z)s).b((e)c2.c);
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzo = zzaau.zzo(array2, 0, c2.b);
                if (((z)s).h) {
                    ((z)s).f();
                    ((z)s).h = false;
                }
                t.x((com.google.android.gms.internal.firebase-auth-api.t)((z)s).g, zzo);
                r5 = new r5((e2)h3.c(c2.a, (e)((z)s).c(), (Class)e2.class));
            }
            else if (c2.a.equals(j3.a)) {
                final byte[] copyOfRange2 = Arrays.copyOfRange(array2, 0, c2.e);
                final byte[] copyOfRange3 = Arrays.copyOfRange(array2, c2.e, c2.b);
                final o7 s2 = com.google.android.gms.internal.firebase_auth_api.n.s();
                ((z)s2).b((e)((l)c2.d).v());
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn = zzaau.zzn(copyOfRange2);
                if (((z)s2).h) {
                    ((z)s2).f();
                    ((z)s2).h = false;
                }
                com.google.android.gms.internal.firebase_auth_api.n.A((com.google.android.gms.internal.firebase-auth-api.n)((z)s2).g, zzn);
                final n n6 = (n)((z)s2).c();
                final m8 s3 = i0.s();
                ((z)s3).b((e)((l)c2.d).w());
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzn2 = zzaau.zzn(copyOfRange3);
                if (((z)s3).h) {
                    ((z)s3).f();
                    ((z)s3).h = false;
                }
                i0.A((com.google.android.gms.internal.firebase-auth-api.i0)((z)s3).g, zzn2);
                final i0 i0 = (i0)((z)s3).c();
                final m7 s4 = l.s();
                final int r6 = ((l)c2.d).r();
                if (((z)s4).h) {
                    ((z)s4).f();
                    ((z)s4).h = false;
                }
                l.x((com.google.android.gms.internal.firebase-auth-api.l)((z)s4).g, r6);
                if (((z)s4).h) {
                    ((z)s4).f();
                    ((z)s4).h = false;
                }
                l.y((com.google.android.gms.internal.firebase-auth-api.l)((z)s4).g, (com.google.android.gms.internal.firebase-auth-api.n)n6);
                if (((z)s4).h) {
                    ((z)s4).f();
                    ((z)s4).h = false;
                }
                l.z((com.google.android.gms.internal.firebase-auth-api.l)((z)s4).g, (com.google.android.gms.internal.firebase-auth-api.i0)i0);
                r5 = new r5((e2)h3.c(c2.a, (e)((z)s4).c(), (Class)e2.class));
            }
            else {
                if (!c2.a.equals(q4.a)) {
                    throw new GeneralSecurityException("unknown DEM key type");
                }
                final z7 s5 = x.s();
                ((z)s5).b((e)c2.f);
                final com.google.android.gms.internal.firebase-auth-api.zzaau zzo2 = zzaau.zzo(array2, 0, c2.b);
                if (((z)s5).h) {
                    ((z)s5).f();
                    ((z)s5).h = false;
                }
                x.x((com.google.android.gms.internal.firebase-auth-api.x)((z)s5).g, zzo2);
                r5 = new r5((h2)h3.c(c2.a, (e)((z)s5).c(), (Class)h2.class));
            }
            array = Arrays.copyOfRange(array, n, length);
            final byte[] g = n9.g;
            final e2 e2 = (e2)r5.f;
            if (e2 != null) {
                array = e2.a(array, g);
            }
            else {
                array = ((h2)r5.g).a(array, g);
            }
            return array;
        }
        throw new GeneralSecurityException("Symmetric key has incorrect length");
    }
}
