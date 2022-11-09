// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import ng.f0;
import r8.l;

public class c<T> implements l<T>
{
    public final T f;
    
    public c(final T f) {
        f0.a2(f);
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
