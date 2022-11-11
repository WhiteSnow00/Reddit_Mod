// 
// Decompiled by Procyon v0.6.0
// 

package vg2;

import sg2.e;
import zg2.k;

public abstract class b<V> implements d<Object, V>
{
    public V f;
    
    public b(final V f) {
        this.f = f;
    }
    
    public void a(final Object o, final k k, final Object o2) {
        e.f((Object)k, "property");
    }
    
    public void b(final k k) {
        e.f((Object)k, "property");
    }
    
    @Override
    public final V getValue(final Object o, final k<?> k) {
        e.f((Object)k, "property");
        return this.f;
    }
    
    @Override
    public final void setValue(Object f, final k<?> k, final V f2) {
        e.f((Object)k, "property");
        f = this.f;
        this.b(k);
        this.a(f, k, this.f = f2);
    }
}
