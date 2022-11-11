// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import java.util.Iterator;

public final class q implements Iterator
{
    public final Iterator f;
    
    public q(final r r) {
        this.f = ((BaseBundle)r.f).keySet().iterator();
    }
    
    @Override
    public final boolean hasNext() {
        return this.f.hasNext();
    }
    
    @Override
    public final Object next() {
        return this.f.next();
    }
    
    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
