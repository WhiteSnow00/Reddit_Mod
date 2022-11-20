// 
// Decompiled by Procyon v0.6.0
// 

package qg2;

import ug2.c;
import ng2.e;
import ug2.k;

public final class a<T> implements d<Object, T>
{
    public T f;
    
    public final T getValue(Object f, final k<?> k) {
        e.f((Object)k, "property");
        f = this.f;
        if (f != null) {
            return (T)f;
        }
        final StringBuilder t = a.t("Property ");
        t.append(((c)k).getName());
        t.append(" should be initialized before get.");
        throw new IllegalStateException(t.toString());
    }
    
    public final void setValue(final Object o, final k<?> k, final T f) {
        e.f((Object)k, "property");
        e.f((Object)f, "value");
        this.f = f;
    }
}
