// 
// Decompiled by Procyon v0.6.0
// 

package vg2;

import zg2.c;
import sg2.e;
import zg2.k;

public final class a<T> implements d<Object, T>
{
    public T f;
    
    @Override
    public final T getValue(Object f, final k<?> k) {
        e.f((Object)k, "property");
        f = this.f;
        if (f != null) {
            return (T)f;
        }
        final StringBuilder r = a.r("Property ");
        r.append(((c)k).getName());
        r.append(" should be initialized before get.");
        throw new IllegalStateException(r.toString());
    }
    
    @Override
    public final void setValue(final Object o, final k<?> k, final T f) {
        e.f((Object)k, "property");
        e.f((Object)f, "value");
        this.f = f;
    }
}
