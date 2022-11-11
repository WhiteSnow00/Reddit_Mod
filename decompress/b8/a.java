// 
// Decompiled by Procyon v0.6.0
// 

package b8;

import java.util.Iterator;
import java.util.ArrayDeque;

public final class a implements Iterable<e>, tg2.a
{
    public final ArrayDeque f;
    
    public a() {
        this.f = new ArrayDeque();
    }
    
    public final int a() {
        return this.f.size();
    }
    
    public final e c() {
        return this.f.peek();
    }
    
    public final e d() {
        final e pop = this.f.pop();
        pop.a.zA(false);
        sg2.e.e((Object)pop, "backstack.pop().also {\n \u2026ontroller.destroy()\n    }");
        return pop;
    }
    
    @Override
    public final Iterator<e> iterator() {
        final Iterator iterator = this.f.iterator();
        sg2.e.e((Object)iterator, "backstack.iterator()");
        return iterator;
    }
    
    public final Iterator<e> l0() {
        final Iterator descendingIterator = this.f.descendingIterator();
        sg2.e.e((Object)descendingIterator, "backstack.descendingIterator()");
        return descendingIterator;
    }
}
