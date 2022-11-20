// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import dg2.w;
import tg2.g;
import tg2.h;
import dg2.m;
import zd.b;
import java.util.ArrayList;

public final class k0 implements j
{
    public final ArrayList a;
    
    public k0() {
        this.a = new ArrayList();
    }
    
    public k0(final float n, final float n2, final i i) {
        final tg2.i w1 = b.w1(0, i.b());
        final ArrayList a = new ArrayList<androidx.compose.animation.core.b>(m.u4((Iterable)w1, 10));
        final h f = ((g)w1).f();
        while (f.h) {
            a.add(new androidx.compose.animation.core.b(n, n2, i.a(((w)f).nextInt())));
        }
        this.a = a;
    }
    
    public u get(final int n) {
        return this.a.get(n);
    }
}
