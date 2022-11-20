// 
// Decompiled by Procyon v0.6.0
// 

package dm2;

import java.io.IOException;
import ai2.h;
import nm2.c;

public final class i extends f implements c
{
    public final g g;
    public final int h;
    public final byte[] i;
    public final byte[] j;
    
    public i(final i.i$a i$a) {
        final g a = i$a.a;
        final j b = a.b;
        super(false, b.f);
        this.g = a;
        final int g = b.g;
        final byte[] d = i$a.d;
        if (d != null) {
            if (d.length == g + g) {
                this.h = 0;
                this.i = l.f(0, g, d);
                this.j = l.f(g + 0, g, d);
            }
            else {
                final int length = d.length;
                final int n = g + 4;
                if (length != n + g) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.h = ai2.h.o(0, d);
                this.i = l.f(4, g, d);
                this.j = l.f(n, g, d);
            }
        }
        else {
            final a a2 = a.a;
            if (a2 != null) {
                this.h = a2.a;
            }
            else {
                this.h = 0;
            }
            final byte[] b2 = i$a.b;
            if (b2 != null) {
                if (b2.length != g) {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
                this.i = b2;
            }
            else {
                this.i = new byte[g];
            }
            final byte[] c = i$a.c;
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
    
    public final byte[] a() {
        final int g = this.g.b.g;
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
    
    public final byte[] getEncoded() throws IOException {
        return this.a();
    }
}
