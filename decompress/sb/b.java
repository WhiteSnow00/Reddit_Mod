// 
// Decompiled by Procyon v0.6.0
// 

package sb;

import qb.a$b;
import java.nio.ByteBuffer;
import qb.d;
import java.util.Arrays;
import bd.t;
import ai2.h;

public final class b extends h
{
    public static a r0(final t t) {
        final String l = t.l();
        l.getClass();
        final String i = t.l();
        i.getClass();
        return new a(l, i, t.k(), t.k(), Arrays.copyOfRange(t.a, t.b, t.c));
    }
    
    @Override
    public final qb.a w(final d d, final ByteBuffer byteBuffer) {
        return new qb.a(new a$b[] { (a$b)r0(new t(byteBuffer.array(), byteBuffer.limit())) });
    }
}
