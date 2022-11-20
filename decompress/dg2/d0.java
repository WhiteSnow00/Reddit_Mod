// 
// Decompiled by Procyon v0.6.0
// 

package dg2;

import java.util.ArrayList;
import java.util.List;

public final class d0<T> extends a<T>
{
    public final List<T> f;
    
    public d0(final ArrayList f) {
        this.f = f;
    }
    
    public final int a() {
        return this.f.size();
    }
    
    public final T get(final int n) {
        return this.f.get(o.y4(n, (List)this));
    }
}
