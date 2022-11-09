// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Map;
import java.util.Iterator;

public final class q7 implements Iterator
{
    public int f = -1;
    public boolean g;
    public Iterator h;
    public final /* synthetic */ s7 i;
    
    public final Iterator a() {
        if (this.h == null) {
            this.h = this.i.h.entrySet().iterator();
        }
        return this.h;
    }
    
    @Override
    public final boolean hasNext() {
        final int f = this.f;
        boolean b = true;
        if (f + 1 >= this.i.g.size()) {
            if (!this.i.h.isEmpty()) {
                if (!this.a().hasNext()) {
                    return false;
                }
                b = b;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public final void remove() {
        if (!this.g) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.g = false;
        final s7 i = this.i;
        final int l = s7.l;
        i.h();
        if (this.f < this.i.g.size()) {
            this.i.d(this.f--);
            return;
        }
        this.a().remove();
    }
}
