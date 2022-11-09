// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.NoSuchElementException;
import ak0.n;
import java.util.Iterator;

public final class d implements Iterator
{
    public int f;
    public final /* synthetic */ e g;
    
    public d(final e g) {
        this.g = g;
        this.f = 0;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f < this.g.i();
    }
}
