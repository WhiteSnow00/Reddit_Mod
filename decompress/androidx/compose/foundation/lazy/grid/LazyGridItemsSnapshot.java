// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import rg2.p;
import yg2.g;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import r0.k;
import z0.d;
import s0.c$a;
import rg2.l;
import java.util.HashMap;
import sg2.e;
import yg2.i;
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
        e.f((Object)a, "intervals");
        e.f((Object)i, "nearestItemsRange");
        this.a = (c<f>)a;
        this.b = b;
        this.c = new LazyGridSpanLayoutProvider(this);
        final int f = ((g)i).f;
        if (f >= 0) {
            final int min = Math.min(((g)i).g, a.b - 1);
            Map v0;
            if (min < f) {
                v0 = kotlin.collections.c.V0();
            }
            else {
                final HashMap hashMap = new HashMap();
                ((c<f>)a).c(f, min, (l<? super s0.c$a<f>, hg2.j>)new LazyGridItemProviderImplKt$generateKeyToIndexMap$1$1(f, min, hashMap));
                v0 = hashMap;
            }
            this.d = v0;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final void a(final int n, final d d, final int n2) {
        final ComposerImpl s = d.s(-405085610);
        final c$a value = this.a.get(n);
        ((f)value.c).d.invoke(k.a, n - value.a, s, 6);
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new LazyGridItemsSnapshot$Item$1(this, n, n2);
        }
    }
}
