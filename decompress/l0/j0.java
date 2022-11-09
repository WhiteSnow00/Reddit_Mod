// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import qg2.v;
import gh2.g;
import gh2.h;
import androidx.compose.animation.core.b;
import qg2.m;
import yl.a;
import java.util.ArrayList;

public final class j0 implements j
{
    public final ArrayList a;
    
    public j0(final float n, final float n2, final i i) {
        final gh2.i c1 = yl.a.C1(0, i.b());
        final ArrayList a = new ArrayList<b>(m.P0((Iterable)c1, 10));
        final h g = ((g)c1).g();
        while (g.h) {
            a.add(new b(n, n2, i.a(((v)g).nextInt())));
        }
        this.a = a;
    }
    
    @Override
    public final t get(final int n) {
        return (t)this.a.get(n);
    }
}
