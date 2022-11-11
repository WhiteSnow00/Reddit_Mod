// 
// Decompiled by Procyon v0.6.0
// 

package rb;

import pb.a$b;
import java.nio.ByteBuffer;
import pb.d;
import java.util.Arrays;
import ad.s;
import android.support.v4.media.c;

public final class b extends c
{
    public static a Z0(final s s) {
        final String l = s.l();
        l.getClass();
        final String i = s.l();
        i.getClass();
        return new a(l, i, s.k(), s.k(), Arrays.copyOfRange(s.a, s.b, s.c));
    }
    
    public final pb.a c0(final d d, final ByteBuffer byteBuffer) {
        return new pb.a(new a$b[] { (a$b)Z0(new s(byteBuffer.array(), byteBuffer.limit())) });
    }
}
