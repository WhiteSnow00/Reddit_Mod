// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import zg2.p;
import s0.c$a;
import gh2.g;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import z0.d;
import q0.e;
import zg2.l;
import java.util.HashMap;
import ah2.f;
import s0.j;
import java.util.Map;
import java.util.List;
import q0.i;
import s0.c;

public final class LazyListItemsSnapshot
{
    public final c<i> a;
    public final List<Integer> b;
    public final Map<Object, Integer> c;
    
    public LazyListItemsSnapshot(final j a, final List b, final gh2.i i) {
        f.f((Object)a, "intervals");
        f.f((Object)b, "headerIndexes");
        f.f((Object)i, "nearestItemsRange");
        this.a = (c<i>)a;
        this.b = b;
        final int f = ((g)i).f;
        if (f >= 0) {
            final int min = Math.min(((g)i).g, a.b - 1);
            Map n1;
            if (min < f) {
                n1 = kotlin.collections.c.N1();
            }
            else {
                final HashMap hashMap = new HashMap();
                a.c(f, min, (l)new LazyListItemProviderImplKt$generateKeyToIndexMap$1$1(f, min, hashMap));
                n1 = hashMap;
            }
            this.c = n1;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void a(final e e, final int n, final d d, final int n2) {
        f.f((Object)e, "scope");
        final ComposerImpl r = d.r(1922528915);
        final c.c$a<i> value = this.a.get(n);
        ((i)((c$a)value).c).c.invoke((Object)e, (Object)(n - ((c$a)value).a), (Object)r, (Object)(n2 & 0xE));
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, pg2.j>)new LazyListItemsSnapshot$Item.LazyListItemsSnapshot$Item$1(this, e, n, n2);
        }
    }
}
