// 
// Decompiled by Procyon v0.6.0
// 

package w8;

import ml0.a;
import q8.l;

public class c<T> implements l<T>
{
    public final T f;
    
    public c(final T f) {
        a.l((Object)f);
        this.f = f;
    }
    
    public final T get() {
        return this.f;
    }
    
    public final Class<T> getResourceClass() {
        return (Class<T>)this.f.getClass();
    }
    
    public final int getSize() {
        return 1;
    }
    
    public final void recycle() {
    }
}
