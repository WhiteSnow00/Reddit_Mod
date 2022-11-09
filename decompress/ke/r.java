// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class r implements Iterator
{
    public int f;
    public final /* synthetic */ s g;
    
    public r(final s g) {
        this.g = g;
        this.f = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f < this.g.f.length();
    }
}
