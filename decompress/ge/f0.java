// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import com.google.android.gms.internal.firebase-auth-api.e;
import com.google.android.gms.internal.firebase_auth_api.zzacf;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class f0
{
    public static final Charset a;
    public static final byte[] b;
    
    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        final byte[] b2 = new byte[0];
        ByteBuffer.wrap(b = b2);
        final k k = new k(b2, 0);
        try {
            k.a(0);
        }
        catch (final zzacf zzacf) {
            throw new IllegalArgumentException((Throwable)zzacf);
        }
    }
    
    public static int a(final long n) {
        return (int)(n ^ n >>> 32);
    }
    
    public static e b(final Object o, final Object o2) {
        return ((b)((x0)o).n()).b((x0)o2).e();
    }
}
