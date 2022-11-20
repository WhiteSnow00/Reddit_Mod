// 
// Decompiled by Procyon v0.6.0
// 

package dm2;

import java.io.IOException;
import java.io.PrintStream;
import ai2.h;
import fl2.c;

public final class k extends c implements nm2.c
{
    public final j g;
    public final int h;
    public final byte[] i;
    public final byte[] j;
    
    public k(final k.k$a k$a) {
        final j a = k$a.a;
        super(false, a.f);
        this.g = a;
        final int g = a.g;
        final byte[] d = k$a.d;
        if (d != null) {
            if (d.length == g + g) {
                this.h = 0;
                this.i = l.f(0, g, d);
                this.j = l.f(g + 0, g, d);
            }
            else {
                final int length = d.length;
                final int n = g + 4;
                final int n2 = n + g;
                if (length != n2) {
                    final PrintStream err = System.err;
                    final StringBuilder sb = new StringBuilder();
                    sb.append(d.length);
                    sb.append(" ");
                    sb.append(n2);
                    err.println(sb.toString());
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.h = ai2.h.o(0, d);
                this.i = l.f(4, g, d);
                this.j = l.f(n, g, d);
            }
        }
        else {
            final b a2 = a.a;
            if (a2 != null) {
                this.h = a2.a;
            }
            else {
                this.h = 0;
            }
            final byte[] b = k$a.b;
            if (b != null) {
                if (b.length != g) {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                this.i = b;
            }
            else {
                this.i = new byte[g];
            }
            final byte[] c = k$a.c;
            if (c != null) {
                if (c.length != g) {
                    throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
                }
                this.j = c;
            }
            else {
                this.j = new byte[g];
            }
        }
    }
    
    public final byte[] getEncoded() throws IOException {
        final int g = this.g.g;
        int n = 0;
        final int h = this.h;
        byte[] array;
        if (h != 0) {
            array = new byte[g + 4 + g];
            ai2.h.G(h, 0, array);
            n = 4;
        }
        else {
            array = new byte[g + g];
        }
        l.d(array, n, this.i);
        l.d(array, n + g, this.j);
        return array;
    }
}
