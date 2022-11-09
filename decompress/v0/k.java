// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import i2.c;
import mj2.c0;
import i2.m;
import ah2.f;
import i2.n;
import kotlin.collections.EmptyList;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import i2.j;
import i2.a$b;
import java.util.List;
import n2.g;
import u2.b;
import i2.p;
import i2.a;

public final class k
{
    public final a a;
    public final p b;
    public final int c;
    public final boolean d;
    public final int e;
    public final b f;
    public final g.a g;
    public final List<a$b<j>> h;
    public MultiParagraphIntrinsics i;
    public LayoutDirection j;
    
    public k(final a a, final p p8, int n, boolean b, int n2, final b b2, final g.a a2, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            n = Integer.MAX_VALUE;
        }
        if ((n3 & 0x8) != 0x0) {
            b = true;
        }
        if ((n3 & 0x10) != 0x0) {
            n2 = 1;
        }
        Object instance;
        if ((n3 & 0x80) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        else {
            instance = null;
        }
        this(a, p8, n, b, n2, b2, a2, (List)instance);
    }
    
    public k(final a a, final p b, int c, final boolean d, final int e, final b f, final g.a g, final List h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        if (c > 0) {
            c = 1;
        }
        else {
            c = 0;
        }
        if (c != 0) {
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final n a(long u, final LayoutDirection layoutDirection, final n n) {
        ah2.f.f((Object)layoutDirection, "layoutDirection");
        if (n != null) {
            final a a = this.a;
            final p b = this.b;
            final List<a$b<j>> h = this.h;
            final int c = this.c;
            final boolean d = this.d;
            final int e = this.e;
            final b f = this.f;
            final g.a g = this.g;
            ah2.f.f((Object)a, "text");
            ah2.f.f((Object)b, "style");
            ah2.f.f((Object)h, "placeholders");
            ah2.f.f((Object)f, "density");
            ah2.f.f((Object)g, "fontFamilyResolver");
            final m a2 = n.a;
            boolean b3 = false;
            Label_0380: {
                Label_0377: {
                    if (!n.b.a.a()) {
                        if (ah2.f.a((Object)a2.a, (Object)a)) {
                            final p b2 = a2.b;
                            b2.getClass();
                            if ((b2 == b || (ah2.f.a((Object)b2.b, (Object)b.b) && b2.a.c(b.a))) && ah2.f.a((Object)a2.c, (Object)h) && a2.d == c && a2.e == d && a2.f == e && ah2.f.a((Object)a2.g, (Object)f) && a2.h == layoutDirection) {
                                if (ah2.f.a((Object)a2.i, (Object)g)) {
                                    if (u2.a.j(u) == u2.a.j(a2.j)) {
                                        if (d || e == 2) {
                                            if (u2.a.h(u) != u2.a.h(a2.j) || u2.a.g(u) != u2.a.g(a2.j)) {
                                                break Label_0377;
                                            }
                                        }
                                        b3 = true;
                                        break Label_0380;
                                    }
                                }
                            }
                        }
                    }
                }
                b3 = false;
            }
            if (b3) {
                final m a3 = n.a;
                final m m = new m(a3.a, this.b, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, u);
                u = c0.u(u, yl.a.c((int)(float)Math.ceil(n.b.d), (int)(float)Math.ceil(n.b.e)));
                return new n(m, n.b, u);
            }
        }
        this.b(layoutDirection);
        final int j = u2.a.j(u);
        int n2;
        if ((this.d || this.e == 2) && u2.a.d(u)) {
            n2 = u2.a.h(u);
        }
        else {
            n2 = Integer.MAX_VALUE;
        }
        int c2;
        if (!this.d && this.e == 2) {
            c2 = 1;
        }
        else {
            c2 = this.c;
        }
        if (j != n2) {
            final MultiParagraphIntrinsics i = this.i;
            if (i == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            n2 = yl.a.K((int)(float)Math.ceil(i.c()), j, n2);
        }
        final MultiParagraphIntrinsics k = this.i;
        if (k != null) {
            final c c3 = new c(k, c0.b(n2, u2.a.g(u), 5), c2, this.e == 2);
            return new n(new m(this.a, this.b, (List)this.h, this.c, this.d, this.e, this.f, layoutDirection, this.g, u), c3, c0.u(u, yl.a.c((int)(float)Math.ceil(c3.d), (int)(float)Math.ceil(c3.e))));
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
    
    public final void b(final LayoutDirection j) {
        ah2.f.f((Object)j, "layoutDirection");
        final MultiParagraphIntrinsics i = this.i;
        MultiParagraphIntrinsics k = null;
        Label_0079: {
            if (i != null && j == this.j) {
                k = i;
                if (!i.a()) {
                    break Label_0079;
                }
            }
            this.j = j;
            k = new MultiParagraphIntrinsics(this.a, androidx.compose.ui.text.a.a(this.b, j), this.h, this.f, this.g);
        }
        this.i = k;
    }
}
