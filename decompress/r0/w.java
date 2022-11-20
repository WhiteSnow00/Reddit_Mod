// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider$c;
import cg2.j;
import u2.a$a;
import aq2.a;
import androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import java.util.List;

public final class w
{
    public final boolean a;
    public final List<Integer> b;
    public final int c;
    public final int d;
    public final int e;
    public final u f;
    public final LazyGridSpanLayoutProvider g;
    public final z h;
    
    public w(final boolean a, final List b, final int c, final int d, final int e, final u f, final LazyGridSpanLayoutProvider g, final LazyGridKt$rememberLazyGridMeasurePolicy$1$1$b h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = (z)h;
    }
    
    public final long a(int n, final int n2) {
        final int intValue = this.b.get(n + n2 - 1).intValue();
        final int n3 = 0;
        if (n == 0) {
            n = 0;
        }
        else {
            n = this.b.get(n - 1).intValue();
        }
        n = aq2.a.d(n2, -1, this.c, intValue - n);
        if (n < 0) {
            n = n3;
        }
        long n4;
        if (this.a) {
            n4 = a$a.e(n);
        }
        else {
            n4 = a$a.d(n);
        }
        return n4;
    }
    
    public final v b(final int n) {
        final LazyGridSpanLayoutProvider$c b = this.g.b(n);
        final int size = b.b.size();
        int i = 0;
        int e;
        if (size != 0 && b.a + size != this.d) {
            e = this.e;
        }
        else {
            e = 0;
        }
        final t[] array = new t[size];
        int n2 = 0;
        while (i < size) {
            final int n3 = (int)b.b.get(i).a;
            final t a = this.f.a(b.a + i, e, this.a(n2, n3));
            n2 += n3;
            final j a2 = j.a;
            array[i] = a;
            ++i;
        }
        return this.h.a(n, array, b.b, e);
    }
}
