// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import zg2.k;
import h2.q;
import sg2.e;
import rg2.p;

public final class a<T>
{
    public final String a;
    public final p<T, T, T> b;
    
    public a(final String a, final p<? super T, ? super T, ? extends T> b) {
        e.f((Object)b, "mergePolicy");
        this.a = a;
        this.b = (p<T, T, T>)b;
    }
    
    public final void a(final q q, final k<?> k, final T t) {
        e.f((Object)q, "thisRef");
        e.f((Object)k, "property");
        q.a(this, t);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SemanticsPropertyKey: ");
        r.append(this.a);
        return r.toString();
    }
}
