// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import z0.d$a;
import ah2.f;
import z0.d;
import j1.b;
import zg2.s;
import mk2.e;
import j1.a$c;
import p0.k$f;
import j1.a$a;
import p0.k;

public final class RowKt
{
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 a;
    
    static {
        final LayoutOrientation horizontal = LayoutOrientation.Horizontal;
        final a$i a2 = androidx.compose.foundation.layout.a.a;
        final float n = 0;
        final int a3 = k.a;
        a = e.K(n, (k)new k$f((a$c)a$a.j), horizontal, SizeMode.Wrap, (s)RowKt$DefaultRowMeasurePolicy$1.INSTANCE);
    }
    
    public static final c2.s a(final a.d d, final b.b b, final d d2) {
        f.f((Object)d, "horizontalArrangement");
        d2.A(-837807694);
        d2.A(511388516);
        final boolean l = d2.l(d);
        final boolean i = d2.l(b);
        final Object b2 = d2.B();
        Object o;
        if ((l | i) || (o = b2) == d$a.a) {
            RowColumnImplKt$rowColumnMeasurePolicy$1 rowColumnImplKt$rowColumnMeasurePolicy$1;
            if (f.a((Object)d, (Object)androidx.compose.foundation.layout.a.a) && f.a((Object)b, (Object)a$a.j)) {
                rowColumnImplKt$rowColumnMeasurePolicy$1 = RowKt.a;
            }
            else {
                final LayoutOrientation horizontal = LayoutOrientation.Horizontal;
                final float a = d.a();
                final int a2 = k.a;
                rowColumnImplKt$rowColumnMeasurePolicy$1 = e.K(a, (k)new k$f((a$c)b), horizontal, SizeMode.Wrap, (s)new RowKt$rowMeasurePolicy$1$1(d));
            }
            d2.v(rowColumnImplKt$rowColumnMeasurePolicy$1);
            o = rowColumnImplKt$rowColumnMeasurePolicy$1;
        }
        d2.I();
        final c2.s s = (c2.s)o;
        d2.I();
        return s;
    }
}
