// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class d implements Iterator
{
    public final /* synthetic */ Iterator f;
    public final /* synthetic */ Iterator g;
    
    public d(final Iterator f, final Iterator g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f.hasNext() || this.g.hasNext();
    }
}
