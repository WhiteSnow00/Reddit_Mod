// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji2.text;

import o4.c;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.ByteOrder;
import o4.b;
import java.nio.MappedByteBuffer;

public final class m
{
    public static b a(final MappedByteBuffer mappedByteBuffer) throws IOException {
        final ByteBuffer duplicate = mappedByteBuffer.duplicate();
        final a a = new a(duplicate);
        a.b(4);
        final int n = duplicate.getShort() & 0xFFFF;
        if (n <= 100) {
            a.b(6);
            final int n2 = 0;
            while (true) {
                for (int i = 0; i < n; ++i) {
                    final int int1 = a.a.getInt();
                    a.b(4);
                    final long a2 = a.a();
                    a.b(4);
                    if (1835365473 == int1) {
                        if (a2 != -1L) {
                            a.b((int)(a2 - a.a.position()));
                            a.b(12);
                            final long a3 = a.a();
                            for (int n3 = n2; n3 < a3; ++n3) {
                                final int int2 = a.a.getInt();
                                final long a4 = a.a();
                                a.a();
                                if (1164798569 == int2 || 1701669481 == int2) {
                                    duplicate.position((int)(a4 + a2));
                                    final b b = new b();
                                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                    ((c)b).b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                                    return b;
                                }
                            }
                        }
                        throw new IOException("Cannot read metadata.");
                    }
                }
                final long a2 = -1L;
                continue;
            }
        }
        throw new IOException("Cannot read metadata.");
    }
    
    public static final class a
    {
        public final ByteBuffer a;
        
        public a(final ByteBuffer a) {
            (this.a = a).order(ByteOrder.BIG_ENDIAN);
        }
        
        public final long a() throws IOException {
            return (long)this.a.getInt() & 0xFFFFFFFFL;
        }
        
        public final void b(final int n) throws IOException {
            final ByteBuffer a = this.a;
            a.position(a.position() + n);
        }
    }
}
