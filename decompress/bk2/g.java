// 
// Decompiled by Procyon v0.6.0
// 

package bk2;

import org.jcodec.common.logging.Logger;
import net.sourceforge.jaad.aac.AACException;
import vj2.f;

public final class g extends d
{
    public vj2.d c;
    public f d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final g.g$b[] k;
    public final g.g$b[] l;
    public final g.g$b[] m;
    public final int[] n;
    public final int[] o;
    public final g.g$a[] p;
    public byte[] q;
    
    public g() {
        this.k = new g.g$b[16];
        this.l = new g.g$b[16];
        this.m = new g.g$b[16];
        this.n = new int[4];
        this.o = new int[8];
        this.p = new g.g$a[16];
        this.d = vj2.f.d;
    }
    
    public static void b(final g.g$b[] array, final a a, final int n) throws AACException {
        for (int i = 0; i < n; ++i) {
            a.d();
            a.c(4);
            array[i] = new g.g$b();
        }
    }
    
    public final void a(final a a) throws AACException {
        super.a = a.c(4);
        this.c = vj2.d.a(a.c(2));
        final int c = a.c(4);
        f d;
        if (c >= 0 && c < 12) {
            d = vj2.f.e[c];
        }
        else {
            d = vj2.f.d;
        }
        this.d = d;
        this.e = a.c(4);
        this.f = a.c(4);
        this.g = a.c(4);
        this.h = a.c(2);
        this.i = a.c(3);
        this.j = a.c(4);
        if (a.d()) {
            Logger.warn("mono mixdown present, but not yet supported");
            a.c(4);
        }
        if (a.d()) {
            Logger.warn("stereo mixdown present, but not yet supported");
            a.c(4);
        }
        if (a.d()) {
            Logger.warn("matrix mixdown present, but not yet supported");
            a.c(2);
            a.d();
        }
        b(this.k, a, this.e);
        b(this.l, a, this.f);
        b(this.m, a, this.g);
        final int n = 0;
        for (int i = 0; i < this.h; ++i) {
            this.n[i] = a.c(4);
        }
        for (int j = 0; j < this.i; ++j) {
            this.o[j] = a.c(4);
        }
        for (int k = 0; k < this.j; ++k) {
            final g.g$a[] p = this.p;
            a.d();
            a.c(4);
            p[k] = new g.g$a();
        }
        final int n2 = a.d & 0x7;
        if (n2 > 0) {
            a.g(n2);
        }
        final int c2 = a.c(8);
        this.q = new byte[c2];
        for (int l = n; l < c2; ++l) {
            this.q[l] = (byte)a.c(8);
        }
    }
}
