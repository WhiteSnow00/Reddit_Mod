// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;

public final class j implements Iterator
{
    public final /* synthetic */ Iterator f;
    
    public j(final Iterator f) {
        this.f = f;
    }
    
    @Override
    public final boolean hasNext() {
        return this.f.hasNext();
    }
}
