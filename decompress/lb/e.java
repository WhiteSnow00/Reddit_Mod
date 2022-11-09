// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import bd.d0;
import java.io.IOException;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import bd.s;

public final class e
{
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final s g;
    
    public e() {
        this.f = new int[255];
        this.g = new s(255);
    }
    
    public final boolean a(final db.e e, boolean h) throws IOException {
        int i = 0;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.g.y(27);
        final byte[] a = this.g.a;
        boolean h2;
        try {
            h2 = e.h(a, 0, 27, h);
        }
        catch (final EOFException ex) {
            if (!h) {
                throw ex;
            }
            h2 = false;
        }
        if (!h2 || this.g.s() != 1332176723L) {
            return false;
        }
        if (this.g.r() == 0) {
            this.a = this.g.r();
            this.b = this.g.f();
            this.g.h();
            this.g.h();
            this.g.h();
            final int r = this.g.r();
            this.c = r;
            this.d = r + 27;
            this.g.y(r);
            final byte[] a2 = this.g.a;
            final int c = this.c;
            try {
                h = e.h(a2, 0, c, h);
            }
            catch (final EOFException ex2) {
                if (!h) {
                    throw ex2;
                }
                h = false;
            }
            if (!h) {
                return false;
            }
            while (i < this.c) {
                this.f[i] = this.g.r();
                this.e += this.f[i];
                ++i;
            }
            return true;
        }
        if (h) {
            return false;
        }
        throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
    }
    
    public final boolean b(final db.e e, final long n) throws IOException {
        d0.c(e.d == e.k());
        this.g.y(4);
        long n2;
        while (true) {
            n2 = lcmp(n, -1L);
            if (n2 != 0 && e.d + 4L >= n) {
                break;
            }
            final byte[] a = this.g.a;
            boolean h;
            try {
                h = e.h(a, 0, 4, true);
            }
            catch (final EOFException ex) {
                h = false;
            }
            if (!h) {
                break;
            }
            this.g.B(0);
            if (this.g.s() == 1332176723L) {
                e.f = 0;
                return true;
            }
            e.n(1);
        }
        while ((n2 == 0 || e.d < n) && e.r(1) != -1) {}
        return false;
    }
}
