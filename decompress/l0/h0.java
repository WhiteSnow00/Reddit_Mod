// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ah2.f;
import zg2.l;

public final class h0<T, V extends i> implements g0<T, V>
{
    public final l<T, V> a;
    public final l<V, T> b;
    
    public h0(final l<? super T, ? extends V> a, final l<? super V, ? extends T> b) {
        f.f((Object)a, "convertToVector");
        f.f((Object)b, "convertFromVector");
        this.a = (l<T, V>)a;
        this.b = (l<V, T>)b;
    }
    
    @Override
    public final l<T, V> a() {
        return this.a;
    }
    
    @Override
    public final l<V, T> b() {
        return this.b;
    }
}
