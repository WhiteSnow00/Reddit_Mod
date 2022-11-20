// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.nio.charset.StandardCharsets;
import javax.crypto.Mac;
import java.security.GeneralSecurityException;

public final class o5 implements k5
{
    public final f5 f;
    public final int g;
    
    public o5(final f5 f, final int g) {
        this.f = f;
        this.g = g;
    }
    
    public static o5 a(int n) throws GeneralSecurityException {
        if (--n == 0) {
            return new o5(new f5((Object)"HmacSha256"), 1);
        }
        if (n != 1) {
            return new o5(new f5((Object)"HmacSha512"), 3);
        }
        return new o5(new f5((Object)"HmacSha384"), 2);
    }
    
    public final byte[] d(byte[] j, final l5 l5) throws GeneralSecurityException {
        final int g = this.g;
        final byte[] a = l5.zza().a;
        final int length = a.length;
        final byte[] array = new byte[length];
        System.arraycopy(a, 0, array, 0, length);
        final byte[] e = q9.e(q9.f(g, array), q9.g(q9.h(this.g), 1, j));
        final byte[] a2 = l5.r().a;
        final int length2 = a2.length;
        final byte[] array2 = new byte[length2];
        System.arraycopy(a2, 0, array2, 0, length2);
        j = g2.j(new byte[][] { j, array2 });
        final byte[] i = g2.j(new byte[][] { n5.m, this.r() });
        final f5 f = this.f;
        final int macLength = Mac.getInstance((String)f.a).getMacLength();
        return f.b(f.c(g2.j(new byte[][] { n5.o, i, "eae_prk".getBytes(StandardCharsets.UTF_8), e }), (byte[])null), macLength, n5.c("shared_secret", j, i, macLength));
    }
    
    public final byte[] r() throws GeneralSecurityException {
        final int n = this.g - 1;
        if (n == 0) {
            return n5.c;
        }
        if (n != 1) {
            return n5.e;
        }
        return n5.d;
    }
}
