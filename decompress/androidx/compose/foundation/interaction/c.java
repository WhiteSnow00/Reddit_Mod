// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.interaction;

import zg2.p;
import z0.s;
import a80.a;
import z0.d$a;
import ah2.f;
import z0.h0;
import z0.d;
import o0.i;

public final class c
{
    public static final h0 a(final i i, final d d, final int n) {
        f.f((Object)i, "<this>");
        d.A(1206586544);
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == d$a.a) {
            o = a.n0(Boolean.FALSE);
            d.v(o);
        }
        d.I();
        final h0 h0 = (h0)o;
        s.f(i, (p)new HoverInteractionKt$collectIsHoveredAsState$1(i, h0, (tg2.c)null), d);
        d.I();
        return h0;
    }
}
