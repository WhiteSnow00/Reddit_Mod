// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class e implements Iterator
{
    public int f;
    public final /* synthetic */ f g;
    
    public e(final f g) {
        this.g = g;
        this.f = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f < this.g.m();
    }
}
