// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation.core;

import ak0.m;
import zg2.l;
import zg2.a;
import z0.s;
import z0.d$a;
import ah2.f;
import l0.h0;
import l0.x;

public final class d
{
    public static final InfiniteTransition.a a(final InfiniteTransition infiniteTransition, final float n, final float n2, final x x, final z0.d d, final int n3) {
        d.A(469472752);
        final InfiniteTransition.a b = b(infiniteTransition, n, n2, VectorConvertersKt.a, x, d);
        d.I();
        return b;
    }
    
    public static final InfiniteTransition.a b(final InfiniteTransition infiniteTransition, final Comparable comparable, final Comparable comparable2, final h0 h0, final x x, final z0.d d) {
        f.f((Object)h0, "typeConverter");
        d.A(-1695411770);
        d.A(-492369756);
        Object b;
        if ((b = d.B()) == d$a.a) {
            b = infiniteTransition.new a(comparable, comparable2, h0, x);
            d.v(b);
        }
        d.I();
        final InfiniteTransition.a a = (InfiniteTransition.a)b;
        s.h((a)new InfiniteTransitionKt$animateValue$1((Object)comparable, a, (Object)comparable2, x), d);
        s.c(a, (l)new InfiniteTransitionKt$animateValue$2(infiniteTransition, a), d);
        d.I();
        return a;
    }
    
    public static final InfiniteTransition c(final z0.d d) {
        Object i;
        if ((i = m.i(d, -840193660, -492369756)) == d$a.a) {
            i = new InfiniteTransition();
            d.v(i);
        }
        d.I();
        final InfiniteTransition infiniteTransition = (InfiniteTransition)i;
        infiniteTransition.a(d, 8);
        d.I();
        return infiniteTransition;
    }
}
