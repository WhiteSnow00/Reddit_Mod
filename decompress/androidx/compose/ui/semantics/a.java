// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.semantics;

import hh2.k;
import h2.q;
import ah2.f;
import zg2.p;

public final class a<T>
{
    public final String a;
    public final p<T, T, T> b;
    
    public a(final String a, final p<? super T, ? super T, ? extends T> b) {
        f.f((Object)b, "mergePolicy");
        this.a = a;
        this.b = (p<T, T, T>)b;
    }
    
    public final void a(final q q, final k<?> k, final T t) {
        f.f((Object)q, "thisRef");
        f.f((Object)k, "property");
        q.a(this, (Object)t);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SemanticsPropertyKey: ");
        k.append(this.a);
        return k.toString();
    }
}
