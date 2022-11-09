// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import pg2.j;
import r0.c;
import r0.s;
import r0.u;
import java.util.List;
import u2.a;
import zg2.p;
import r0.x;
import r0.t;

public final class b
{
    public final boolean a;
    public final int b;
    public final int c;
    public final t d;
    public final LazyGridSpanLayoutProvider e;
    public final x f;
    public final p<Integer, Integer, a> g;
    
    public b(final boolean a, final List list, final int n, final int b, final int c, final t d, final LazyGridSpanLayoutProvider e, final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (x)f;
        this.g = (p<Integer, Integer, a>)new LazyMeasuredLineProvider$childConstraints$1(list, n, this);
    }
    
    public final u a(final int n) {
        final LazyGridSpanLayoutProvider.c b = this.e.b(n);
        final int size = b.b.size();
        int i = 0;
        int c;
        if (size != 0 && b.a + size != this.b) {
            c = this.c;
        }
        else {
            c = 0;
        }
        final s[] array = new s[size];
        int n2 = 0;
        while (i < size) {
            final int n3 = (int)b.b.get(i).a;
            final s a = this.d.a(b.a + i, c, ((a)this.g.invoke((Object)n2, (Object)n3)).a);
            n2 += n3;
            final j a2 = j.a;
            array[i] = a;
            ++i;
        }
        return this.f.a(n, array, (List)b.b, c);
    }
}
