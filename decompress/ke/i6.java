// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.zzko;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class i6
{
    public static final Charset a;
    public static final byte[] b;
    
    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        ByteBuffer.wrap(b = new byte[0]);
        final k5 k5 = new k5();
        try {
            final int n = k5.a + k5.b;
            k5.a = n;
            if (n > 0) {
                k5.b = n;
                k5.a = 0;
            }
            else {
                k5.b = 0;
            }
        }
        catch (final zzko zzko) {
            throw new IllegalArgumentException((Throwable)zzko);
        }
    }
    
    public static int a(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static c6 b(final Object o, final Object o2) {
        final z5 c = ((z6)o).c();
        final z6 z6 = (z6)o2;
        c.getClass();
        if (c.f.getClass().isInstance(z6)) {
            c.h((c6)z6);
            return c.k();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
