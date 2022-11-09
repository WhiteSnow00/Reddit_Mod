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
import j1.a$b;
import p0.k$d;
import j1.a$a;
import p0.k;

public final class ColumnKt
{
    public static final RowColumnImplKt$rowColumnMeasurePolicy$1 a;
    
    static {
        final LayoutOrientation vertical = LayoutOrientation.Vertical;
        final a$i a2 = androidx.compose.foundation.layout.a.a;
        final float n = 0;
        final int a3 = k.a;
        a = e.K(n, (k)new k$d((a$b)a$a.m), vertical, SizeMode.Wrap, (s)ColumnKt$DefaultColumnMeasurePolicy$1.INSTANCE);
    }
    
    public static final c2.s a(final a.k k, final b.a a, final d d) {
        f.f((Object)k, "verticalArrangement");
        d.A(1089876336);
        d.A(511388516);
        final boolean l = d.l(k);
        final boolean i = d.l(a);
        final Object b = d.B();
        Object o;
        if ((l | i) || (o = b) == d$a.a) {
            RowColumnImplKt$rowColumnMeasurePolicy$1 rowColumnImplKt$rowColumnMeasurePolicy$1;
            if (f.a((Object)k, (Object)a.c) && f.a((Object)a, (Object)a$a.m)) {
                rowColumnImplKt$rowColumnMeasurePolicy$1 = ColumnKt.a;
            }
            else {
                final LayoutOrientation vertical = LayoutOrientation.Vertical;
                final float a2 = k.a();
                final int a3 = k.a;
                rowColumnImplKt$rowColumnMeasurePolicy$1 = e.K(a2, (k)new k$d((a$b)a), vertical, SizeMode.Wrap, (s)new ColumnKt$columnMeasurePolicy$1$1(k));
            }
            d.v(rowColumnImplKt$rowColumnMeasurePolicy$1);
            o = rowColumnImplKt$rowColumnMeasurePolicy$1;
        }
        d.I();
        final c2.s s = (c2.s)o;
        d.I();
        return s;
    }
}
