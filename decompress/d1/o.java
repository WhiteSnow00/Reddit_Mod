// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Iterator;
import b1.b;
import qg2.f;

public final class o<K, V> extends f<K> implements b<K>
{
    public final c<K, V> f;
    
    public o(final c<K, V> f) {
        ah2.f.f((Object)f, "map");
        this.f = f;
    }
    
    public final int a() {
        final c<K, V> f = this.f;
        f.getClass();
        return f.g;
    }
    
    public final boolean contains(final Object o) {
        return this.f.containsKey(o);
    }
    
    public final Iterator<K> iterator() {
        return (Iterator<K>)new p((d1.s<Object, Object>)this.f.f);
    }
}
