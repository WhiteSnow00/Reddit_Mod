// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import tg2.a;
import java.util.Map;
import java.util.Iterator;

public final class h<K, V> implements Iterator<Map.Entry<K, V>>, a
{
    public final f<K, V, Map.Entry<K, V>> f;
    
    public h(final e<K, V> e) {
        sg2.e.f((Object)e, "builder");
        final t[] array = new t[8];
        for (int i = 0; i < 8; ++i) {
            array[i] = (t)new w(this);
        }
        this.f = (f<K, V, Map.Entry<K, V>>)new f((e)e, array);
    }
    
    @Override
    public final boolean hasNext() {
        return ((d)this.f).h;
    }
    
    @Override
    public final Object next() {
        return this.f.next();
    }
    
    @Override
    public final void remove() {
        this.f.remove();
    }
}
