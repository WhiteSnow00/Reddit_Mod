// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;

public final class x7 implements Iterator
{
    public final Iterator f;
    
    public x7(final y7 y7) {
        this.f = y7.f.iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.f.hasNext();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
