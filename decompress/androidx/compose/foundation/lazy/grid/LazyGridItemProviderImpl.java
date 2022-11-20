// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import mg2.p;
import z0.p0;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import java.util.Map;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import s0.l;
import androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider;
import r0.f;
import s0.c;
import s0.e;
import r0.i;

public final class LazyGridItemProviderImpl implements i, e
{
    public final c<f> a;
    public final boolean b;
    public final DefaultLazyLayoutItemsProvider c;
    public final LazyGridSpanLayoutProvider d;
    
    public LazyGridItemProviderImpl(final l a, final boolean b, final tg2.i i) {
        ng2.e.f((Object)a, "intervals");
        ng2.e.f((Object)i, "nearestItemsRange");
        this.a = a;
        this.b = b;
        final ComposableLambdaImpl a2 = ComposableSingletons$LazyGridItemProviderKt.a;
        ng2.e.f((Object)a2, "itemContent");
        this.c = new DefaultLazyLayoutItemsProvider(a, a2, i);
        this.d = new LazyGridSpanLayoutProvider((i)this);
    }
    
    public final int M() {
        return this.c.M();
    }
    
    public final Object a(final int n) {
        return this.c.a(n);
    }
    
    public final Object c(final int n) {
        return this.c.c(n);
    }
    
    public final Map<Object, Integer> d() {
        return this.c.c;
    }
    
    public final boolean e() {
        return this.b;
    }
    
    public final void g(final int n, final d d, final int n2) {
        final ComposerImpl s = d.s(1355196996);
        int n4;
        if ((n2 & 0xE) == 0x0) {
            int n3;
            if (s.q(n)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n2);
        }
        else {
            n4 = n2;
        }
        int n5 = n4;
        if ((n2 & 0x70) == 0x0) {
            int n6;
            if (s.m((Object)this)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 = (n4 | n6);
        }
        if ((n5 & 0x5B) == 0x12 && s.d()) {
            s.j();
        }
        else {
            final q a = ComposerKt.a;
            this.c.g(n, (d)s, n5 & 0xE);
        }
        final p0 v = s.V();
        if (v != null) {
            v.d = (p)new LazyGridItemProviderImpl$Item.LazyGridItemProviderImpl$Item$1(this, n, n2);
        }
    }
    
    public final long h(final int n) {
        final LazyGridSpanLayoutProvider$b a = LazyGridSpanLayoutProvider$b.a;
        final c.a<f> value = this.a.get(n);
        return ((r0.c)value.c.b.invoke((Object)a, (Object)(n - value.a))).a;
    }
    
    public final LazyGridSpanLayoutProvider i() {
        return this.d;
    }
}
