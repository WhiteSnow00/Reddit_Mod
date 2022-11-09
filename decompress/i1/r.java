// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.ConcurrentModificationException;
import ah2.f;
import bh2.d$a;
import java.util.Map;

public final class r implements Entry<Object, Object>, d$a
{
    public final Object f;
    public Object g;
    public final /* synthetic */ s<Object, Object> h;
    
    public r(final s<Object, Object> h) {
        this.h = h;
        final Entry i = ((t)h).i;
        ah2.f.c((Object)i);
        this.f = i.getKey();
        final Entry j = ((t)h).i;
        ah2.f.c((Object)j);
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
        if (((t)h).f.b().d == ((t)h).h) {
            final Object g2 = this.g;
            ((t)h).f.put(this.f, g);
            this.g = g;
            return g2;
        }
        throw new ConcurrentModificationException();
    }
}
