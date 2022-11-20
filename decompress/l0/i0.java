// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import ng2.e;
import mg2.l;

public final class i0<T, V extends i> implements h0<T, V>
{
    public final l<T, V> a;
    public final l<V, T> b;
    
    public i0(final l<? super T, ? extends V> a, final l<? super V, ? extends T> b) {
        e.f((Object)a, "convertToVector");
        e.f((Object)b, "convertFromVector");
        this.a = (l<T, V>)a;
        this.b = (l<V, T>)b;
    }
    
    public final l<T, V> a() {
        return this.a;
    }
    
    public final l<V, T> b() {
        return this.b;
    }
}
