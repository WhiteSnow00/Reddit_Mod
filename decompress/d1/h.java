// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import og2.a;
import java.util.Iterator;

public final class h implements Iterator, a
{
    public final int f;
    public final Iterator g;
    
    public h(final e e) {
        int i = 0;
        this.f = 0;
        ng2.e.f((Object)e, "builder");
        final t[] array = new t[8];
        while (i < 8) {
            array[i] = (t)new w(this);
            ++i;
        }
        this.g = (Iterator)new f(e, array);
    }
    
    public h(final Iterator g) {
        this.f = 1;
        ng2.e.f((Object)g, "delegate");
        this.g = g;
    }
    
    @Override
    public final boolean hasNext() {
        switch (this.f) {
            default: {
                return this.g.hasNext();
            }
            case 0: {
                return ((d)this.g).h;
            }
        }
    }
    
    @Override
    public final Object next() {
        switch (this.f) {
            default: {
                return this.g.next();
            }
            case 0: {
                return ((f)this.g).next();
            }
        }
    }
    
    @Override
    public final void remove() {
        switch (this.f) {
            default: {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
            case 0: {
                ((f)this.g).remove();
            }
        }
    }
}
