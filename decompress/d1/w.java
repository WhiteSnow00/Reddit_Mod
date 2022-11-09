// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import ah2.f;
import java.util.Map;

public final class w<K, V> extends t<K, V, Map.Entry<K, V>>
{
    public final h<K, V> i;
    
    public w(final h<K, V> i) {
        ah2.f.f((Object)i, "parentIterator");
        this.i = i;
    }
    
    @Override
    public final Object next() {
        final int h = super.h + 2;
        super.h = h;
        final h<K, V> i = this.i;
        final Object[] f = super.f;
        return new b((h<Object, Object>)i, f[h - 2], f[h - 1]);
    }
}
