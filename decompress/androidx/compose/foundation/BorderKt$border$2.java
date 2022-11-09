// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.unit.LayoutDirection;
import o1.z;
import q1.h;
import kotlin.NoWhenBranchMatchedException;
import o1.z$b;
import o1.z$c;
import o1.w;
import o1.s;
import q1.e;
import o1.r;
import mj2.c0;
import u2.i;
import o1.x;
import kotlin.jvm.internal.Ref$ObjectRef;
import o1.b0;
import o1.s$a;
import o1.m0;
import o1.z$a;
import yd.a;
import pg2.j;
import q1.c;
import l1.g;
import l1.b;
import zg2.l;
import e2.p;
import z0.d$a;
import ah2.f;
import o1.l0;
import o1.n;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class BorderKt$border$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ n $brush;
    public final /* synthetic */ l0 $shape;
    public final /* synthetic */ float $width;
    
    public BorderKt$border$2(final float $width, final l0 $shape, final n $brush) {
        this.$width = $width;
        this.$shape = $shape;
        this.$brush = $brush;
        super(3);
    }
    
    public final d invoke(d f0, final z0.d d, final int n) {
        f.f((Object)f0, "$this$composed");
        d.A(-1498088849);
        d.A(-492369756);
        Object b;
        if ((b = d.B()) == d$a.a) {
            b = new p();
            d.v(b);
        }
        d.I();
        f0 = f0.f0(DrawModifierKt.b((d)j1.d.a.f, (l)new l<b, g>() {
            public final /* synthetic */ p<m0.d> $borderCacheRef = (p)b;
            public final /* synthetic */ n $brush = BorderKt$border$2.this.$brush;
            public final /* synthetic */ l0 $shape = BorderKt$border$2.this.$shape;
            public final /* synthetic */ float $width = BorderKt$border$2.this.$width;
            
            public final g invoke(final b a) {
                f.f((Object)a, "$this$drawWithCache");
                g g;
                if (a.getDensity() * this.$width < 0.0f || n1.f.d(a.b()) <= 0.0f) {
                    g = a.c((l<? super c, j>)BorderKt$drawContentWithoutBorder$1.INSTANCE);
                }
                else {
                    float n;
                    if (u2.d.a(this.$width, 0.0f)) {
                        n = 1.0f;
                    }
                    else {
                        n = (float)Math.ceil(a.getDensity() * this.$width);
                    }
                    final float d = n1.f.d(a.b());
                    final float n2 = 2;
                    final float min = Math.min(n, (float)Math.ceil(d / n2));
                    final float n3 = min / n2;
                    long n4 = a.y0(n3, n3);
                    long n5 = a80.a.f(n1.f.e(a.b()) - min, n1.f.c(a.b()) - min);
                    final float n6 = min * n2;
                    final boolean b = n6 > n1.f.d(a.b());
                    final z e = this.$shape.e(a.b(), a.f.getLayoutDirection(), (u2.b)a);
                    if (e instanceof z$a) {
                        final p<m0.d> $borderCacheRef = this.$borderCacheRef;
                        final n $brush = this.$brush;
                        final z$a z$a = (z$a)e;
                        if (b) {
                            g = a.c((l<? super c, j>)new BorderKt$drawGenericBorder$1(z$a, $brush));
                        }
                        else {
                            s a2;
                            int n7;
                            if ($brush instanceof m0) {
                                a2 = s$a.a(5, ((m0)$brush).a);
                                n7 = 1;
                            }
                            else {
                                n7 = 0;
                                a2 = null;
                            }
                            final n1.d bounds = z$a.a.getBounds();
                            m0.d a3;
                            if ((a3 = (m0.d)$borderCacheRef.a) == null) {
                                a3 = new m0.d(0);
                                $borderCacheRef.a = a3;
                            }
                            Object d2;
                            if ((d2 = a3.d) == null) {
                                d2 = gn.a.F();
                                a3.d = (b0)d2;
                            }
                            ((b0)d2).reset();
                            ((b0)d2).g(bounds);
                            ((b0)d2).j((b0)d2, z$a.a, 0);
                            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                            final long c = yl.a.c((int)(float)Math.ceil(bounds.c - bounds.a), (int)(float)Math.ceil(bounds.d - bounds.b));
                            final w a4 = a3.a;
                            Object o = a3.b;
                            x x;
                            if (a4 != null) {
                                x = new x(a4.b());
                            }
                            else {
                                x = null;
                            }
                            boolean b2 = false;
                            Label_0513: {
                                if (x != null) {
                                    if (x.a == 0) {
                                        b2 = true;
                                        break Label_0513;
                                    }
                                }
                                b2 = false;
                            }
                            boolean b3 = false;
                            Label_0591: {
                                if (!b2) {
                                    x x2;
                                    if (a4 != null) {
                                        x2 = new x(a4.b());
                                    }
                                    else {
                                        x2 = null;
                                    }
                                    if (!(x2 instanceof x) || n7 != x2.a) {
                                        b3 = false;
                                        break Label_0591;
                                    }
                                }
                                b3 = true;
                            }
                            Object e2 = null;
                            Label_0688: {
                                if (a4 != null && o != null && n1.f.e(a.b()) <= a4.getWidth() && n1.f.c(a.b()) <= a4.getHeight()) {
                                    e2 = a4;
                                    if (b3) {
                                        break Label_0688;
                                    }
                                }
                                e2 = c0.e((int)(c >> 32), i.b(c), n7, 24);
                                a3.a = (w)e2;
                                o = gn.a.B((o1.d)e2);
                                a3.b = (o1.p)o;
                            }
                            q1.a c2;
                            if ((c2 = a3.c) == null) {
                                c2 = new q1.a();
                                a3.c = c2;
                            }
                            final long x3 = yl.a.x1(c);
                            final LayoutDirection layoutDirection = a.f.getLayoutDirection();
                            final q1.a.a f = c2.f;
                            final u2.b a5 = f.a;
                            final LayoutDirection b4 = f.b;
                            final o1.p c3 = f.c;
                            final long d3 = f.d;
                            f.a = a;
                            f.a(layoutDirection);
                            f.c = (o1.p)o;
                            f.d = x3;
                            ((o1.p)o).save();
                            q1.e.P0(c2, r.b, 0L, x3, 0.0f, null, 58);
                            final float n8 = -bounds.a;
                            final float n9 = -bounds.b;
                            c2.g.a.g(n8, n9);
                            q1.e.T(c2, z$a.a, $brush, 0.0f, new q1.i(n6, 0.0f, 0, 0, 30), 52);
                            final float e3 = n1.f.e(c2.b());
                            final float n10 = 1;
                            final float n11 = (e3 + n10) / n1.f.e(c2.b());
                            final float n12 = (n1.f.c(c2.b()) + n10) / n1.f.c(c2.b());
                            final long z = c2.Z();
                            final q1.d g2 = c2.g;
                            final long b5 = g2.b();
                            g2.a().save();
                            g2.a.e(n11, n12, z);
                            q1.e.T(c2, (b0)d2, $brush, 0.0f, null, 28);
                            g2.a().restore();
                            g2.c(b5);
                            c2.g.a.g(-n8, -n9);
                            ((o1.p)o).restore();
                            final q1.a.a f2 = c2.f;
                            f2.getClass();
                            ah2.f.f((Object)a5, "<set-?>");
                            f2.a = a5;
                            f2.a(b4);
                            ah2.f.f((Object)c3, "<set-?>");
                            f2.c = c3;
                            f2.d = d3;
                            ((w)e2).a();
                            ref$ObjectRef.element = e2;
                            g = a.c((l<? super c, j>)new BorderKt$drawGenericBorder$3(bounds, (Ref$ObjectRef<w>)ref$ObjectRef, c, a2));
                        }
                    }
                    else if (e instanceof z$c) {
                        final p<m0.d> $borderCacheRef2 = this.$borderCacheRef;
                        final n $brush2 = this.$brush;
                        final z$c z$c = (z$c)e;
                        if (at1.a.a1(z$c.a)) {
                            g = a.c((l<? super c, j>)new BorderKt$drawRoundRectBorder$1(b, $brush2, z$c.a.e, n3, min, n4, n5, new q1.i(min, 0.0f, 0, 0, 30)));
                        }
                        else {
                            m0.d a6;
                            if ((a6 = (m0.d)$borderCacheRef2.a) == null) {
                                a6 = new m0.d(0);
                                $borderCacheRef2.a = a6;
                            }
                            Object d4;
                            if ((d4 = a6.d) == null) {
                                d4 = gn.a.F();
                                a6.d = (b0)d4;
                            }
                            final n1.e a7 = z$c.a;
                            ((b0)d4).reset();
                            ((b0)d4).h(a7);
                            if (!b) {
                                final o1.h f3 = gn.a.F();
                                f3.h(new n1.e(min, min, a7.c - a7.a - min, a7.d - a7.b - min, a.c(min, a7.e), a.c(min, a7.f), a.c(min, a7.g), a.c(min, a7.h)));
                                ((b0)d4).j((b0)d4, (b0)f3, 0);
                            }
                            g = a.c((l<? super c, j>)new BorderKt$drawRoundRectBorder$2((b0)d4, $brush2));
                        }
                    }
                    else {
                        if (!(e instanceof z$b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        final n $brush3 = this.$brush;
                        if (b) {
                            n4 = n1.c.b;
                        }
                        if (b) {
                            n5 = a.b();
                        }
                        q1.f a8;
                        if (b) {
                            a8 = h.a;
                        }
                        else {
                            a8 = new q1.i(min, 0.0f, 0, 0, 30);
                        }
                        g = a.c((l<? super c, j>)new BorderKt$drawRectBorder$1($brush3, n4, n5, a8));
                    }
                }
                return g;
            }
        }));
        d.I();
        return f0;
    }
}
