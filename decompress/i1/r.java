// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.ConcurrentModificationException;
import ng2.e;
import og2.d$a;
import java.util.Map;

public final class r implements Entry<Object, Object>, d$a
{
    public final Object f;
    public Object g;
    public final s<Object, Object> h;
    
    public r(final s<Object, Object> h) {
        this.h = h;
        final Entry i = h.i;
        e.c((Object)i);
        this.f = i.getKey();
        final Entry j = h.i;
        e.c((Object)j);
        this.g = j.getValue();
    }
    
    @Override
    public final Object getKey() {
        return this.f;
    }
    
    @Override
    public final Object getValue() {
        return this.g;
    }
    
    @Override
    public final Object setValue(final Object g) {
        final s<Object, Object> h = this.h;
        if (((o.a)h.f.b()).d == h.h) {
            final Object g2 = this.g;
            h.f.put(this.f, g);
            this.g = g;
            return g2;
        }
        throw new ConcurrentModificationException();
    }
}
