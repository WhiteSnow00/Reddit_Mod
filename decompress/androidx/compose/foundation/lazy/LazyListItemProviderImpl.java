// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy;

import mg2.p;
import z0.p0;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import xd.a;
import tg2.i;
import s0.l;
import androidx.compose.foundation.lazy.layout.DefaultLazyLayoutItemsProvider;
import q0.f;
import java.util.List;
import s0.e;
import q0.m;

public final class LazyListItemProviderImpl implements m, e
{
    public final List<Integer> a;
    public final f b;
    public final DefaultLazyLayoutItemsProvider c;
    
    public LazyListItemProviderImpl(final l l, final i i, final List a, final f b) {
        ng2.e.f((Object)l, "intervals");
        ng2.e.f((Object)i, "nearestItemsRange");
        ng2.e.f((Object)a, "headerIndexes");
        ng2.e.f((Object)b, "itemScope");
        this.a = a;
        this.b = b;
        this.c = new DefaultLazyLayoutItemsProvider(l, xd.a.D((Lambda)new LazyListItemProviderImpl$1(b), -1230121334, true), i);
    }
    
    @Override
    public final int M() {
        return this.c.M();
    }
    
    @Override
    public final Object a(final int n) {
        return this.c.a(n);
    }
    
    @Override
    public final List<Integer> b() {
        return this.a;
    }
    
    @Override
    public final Object c(final int n) {
        return this.c.c(n);
    }
    
    @Override
    public final Map<Object, Integer> d() {
        return this.c.c;
    }
    
    @Override
    public final f f() {
        return this.b;
    }
    
    @Override
    public final void g(final int n, final d d, final int n2) {
        final ComposerImpl s = d.s(-1645068522);
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
            v.d = (p)new LazyListItemProviderImpl$Item.LazyListItemProviderImpl$Item$1(this, n, n2);
        }
    }
}
