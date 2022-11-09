// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import zg2.p;
import s0.c$a;
import gh2.g;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import r0.k;
import z0.d;
import zg2.l;
import java.util.HashMap;
import gh2.i;
import s0.j;
import java.util.Map;
import r0.f;
import s0.c;

public final class LazyGridItemsSnapshot
{
    public final c<f> a;
    public final boolean b;
    public final LazyGridSpanLayoutProvider c;
    public final Map<Object, Integer> d;
    
    public LazyGridItemsSnapshot(final j a, final boolean b, final i i) {
        ah2.f.f((Object)a, "intervals");
        ah2.f.f((Object)i, "nearestItemsRange");
        this.a = (c<f>)a;
        this.b = b;
        this.c = new LazyGridSpanLayoutProvider(this);
        final int f = ((g)i).f;
        if (f >= 0) {
            final int min = Math.min(((g)i).g, a.b - 1);
            Map n1;
            if (min < f) {
                n1 = kotlin.collections.c.N1();
            }
            else {
                final HashMap hashMap = new HashMap();
                a.c(f, min, (l)new LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1(f, min, hashMap));
                n1 = hashMap;
            }
            this.d = n1;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void a(final int n, final d d, final int n2) {
        final ComposerImpl r = d.r(-405085610);
        final c.c$a<f> value = this.a.get(n);
        ((f)((c$a)value).c).d.invoke((Object)k.a, (Object)(n - ((c$a)value).a), (Object)r, (Object)6);
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, pg2.j>)new LazyGridItemsSnapshot$Item.LazyGridItemsSnapshot$Item$1(this, n, n2);
        }
    }
}
