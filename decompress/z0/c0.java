// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import zg2.a;
import pg2.f;

public final class c0<T> implements e1<T>
{
    public final f f;
    
    public c0(final a<? extends T> a) {
        ah2.f.f((Object)a, "valueProducer");
        this.f = kotlin.a.b((a)a);
    }
    
    @Override
    public final T getValue() {
        return (T)this.f.getValue();
    }
}
