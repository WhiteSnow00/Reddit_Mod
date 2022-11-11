// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.saveable;

import rg2.l;
import z0.s;
import z0.e1;
import z0.d$a;
import java.util.Arrays;
import z0.o0;
import z0.d;
import rg2.a;
import h1.e;

public final class b
{
    public static final Object a(Object[] copy, e a, final a a2, final d d, int g) {
        sg2.e.f((Object)a2, "init");
        d.A(441892779);
        if ((g & 0x2) != 0x0) {
            a = SaverKt.a;
        }
        final Object o = null;
        d.A(1059366469);
        int i = 0;
        g = d.G();
        lw0.b.T(36);
        final String string = Integer.toString(g, 36);
        sg2.e.e((Object)string, "toString(this, checkRadix(radix))");
        d.I();
        if (a != null) {
            final h1.b b = (h1.b)d.u((o0)SaveableStateRegistryKt.a);
            copy = Arrays.copyOf(copy, copy.length);
            d.A(-568225417);
            final int length = copy.length;
            g = 0;
            while (i < length) {
                g |= (d.m(copy[i]) ? 1 : 0);
                ++i;
            }
            final Object b2 = d.B();
            Object o2;
            if (g != 0 || (o2 = b2) == d$a.a) {
                o2 = o;
                if (b != null) {
                    final Object c = b.c(string);
                    o2 = o;
                    if (c != null) {
                        o2 = a.b.invoke(c);
                    }
                }
                if (o2 == null) {
                    o2 = a2.invoke();
                }
                d.w(o2);
            }
            d.I();
            if (b != null) {
                s.b((Object)b, (Object)string, (l)new RememberSaveableKt$rememberSaveable$1(b, string, (e1)bg.d.x0((Object)a, d), (e1)bg.d.x0(o2, d)), d);
            }
            d.I();
            return o2;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
    }
}
