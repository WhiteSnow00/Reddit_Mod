// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import ah0.b;
import r8.m;

public class c<T> implements m<T>
{
    public final T f;
    
    public c(final T f) {
        b.F((Object)f);
        this.f = f;
    }
    
    @Override
    public final T get() {
        return this.f;
    }
    
    @Override
    public final Class<T> getResourceClass() {
        return (Class<T>)this.f.getClass();
    }
    
    @Override
    public final int getSize() {
        return 1;
    }
    
    @Override
    public final void recycle() {
    }
}
