// 
// Decompiled by Procyon v0.6.0
// 

package m4;

import s5.c;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import s5.a;
import ej2.c0;
import android.graphics.Typeface;
import s5.b;

public final class h
{
    public final b a;
    public final char[] b;
    public final a c;
    public final Typeface d;
    
    public h(final Typeface d, final b a) {
        this.d = d;
        this.a = a;
        this.c = new a(1024);
        final int a2 = ((c)a).a(6);
        int int1;
        if (a2 != 0) {
            final int n = a2 + ((c)a).a;
            int1 = ((c)a).b.getInt(((c)a).b.getInt(n) + n);
        }
        else {
            int1 = 0;
        }
        this.b = new char[int1 * 2];
        final int a3 = ((c)a).a(6);
        int int2;
        if (a3 != 0) {
            final int n2 = a3 + ((c)a).a;
            int2 = ((c)a).b.getInt(((c)a).b.getInt(n2) + n2);
        }
        else {
            int2 = 0;
        }
        for (int i = 0; i < int2; ++i) {
            final m4.b b = new m4.b(this, i);
            final s5.a c = b.c();
            final int a4 = ((c)c).a(4);
            int int3;
            if (a4 != 0) {
                int3 = ((c)c).b.getInt(a4 + ((c)c).a);
            }
            else {
                int3 = 0;
            }
            Character.toChars(int3, this.b, i * 2);
            c0.D2(b.b() > 0, "invalid metadata codepoint length");
            this.c.a(b, 0, b.b() - 1);
        }
    }
    
    public static h a(final Typeface typeface, final MappedByteBuffer mappedByteBuffer) throws IOException {
        final ByteBuffer duplicate = mappedByteBuffer.duplicate();
        final g g = new g(duplicate);
        g.b(4);
        final int n = duplicate.getShort() & 0xFFFF;
        if (n <= 100) {
            g.b(6);
            final int n2 = 0;
            while (true) {
                for (int i = 0; i < n; ++i) {
                    final int int1 = g.a.getInt();
                    g.b(4);
                    final long a = g.a();
                    g.b(4);
                    if (1835365473 == int1) {
                        if (a != -1L) {
                            g.b((int)(a - g.a.position()));
                            g.b(12);
                            final long a2 = g.a();
                            for (int n3 = n2; n3 < a2; ++n3) {
                                final int int2 = g.a.getInt();
                                final long a3 = g.a();
                                g.a();
                                if (1164798569 == int2 || 1701669481 == int2) {
                                    duplicate.position((int)(a3 + a));
                                    final b b = new b();
                                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                    ((c)b).a = duplicate.position() + duplicate.getInt(duplicate.position());
                                    ((c)b).b = duplicate;
                                    return new h(typeface, b);
                                }
                            }
                        }
                        throw new IOException("Cannot read metadata.");
                    }
                }
                final long a = -1L;
                continue;
            }
        }
        throw new IOException("Cannot read metadata.");
    }
    
    public static final class a
    {
        public final SparseArray<a> a;
        public m4.b b;
        
        public a() {
            this(1);
        }
        
        public a(final int n) {
            this.a = (SparseArray<a>)new SparseArray(n);
        }
        
        public final void a(final m4.b b, final int n, final int n2) {
            final int a = b.a(n);
            final SparseArray<a> a2 = this.a;
            a a3;
            if (a2 == null) {
                a3 = null;
            }
            else {
                a3 = (a)a2.get(a);
            }
            a a4 = a3;
            if (a3 == null) {
                a4 = new a();
                this.a.put(b.a(n), (Object)a4);
            }
            if (n2 > n) {
                a4.a(b, n + 1, n2);
            }
            else {
                a4.b = b;
            }
        }
    }
}
