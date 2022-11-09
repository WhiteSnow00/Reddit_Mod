// 
// Decompiled by Procyon v0.6.0
// 

package d1;

import java.util.Map;
import java.util.NoSuchElementException;
import ah2.f;
import bh2.d$a;

public final class b<K, V> extends a<K, V> implements d$a
{
    public final h<K, V> h;
    public V i;
    
    public b(final h<K, V> h, final K k, final V i) {
        ah2.f.f((Object)h, "parentIterator");
        super(k, i);
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final V getValue() {
        return this.i;
    }
    
    @Override
    public final V setValue(final V i) {
        final V j = this.i;
        this.i = i;
        final h<K, V> h = this.h;
        final K f = (K)super.f;
        final d1.f<K, V, Entry<K, V>> f2 = h.f;
        if (f2.i.containsKey(f)) {
            final boolean h2 = f2.h;
            if (h2) {
                if (!h2) {
                    throw new NoSuchElementException();
                }
                final t<K, V, T> t = (t<K, V, T>)f2.f[f2.g];
                final Object o = t.f[t.h];
                f2.i.put(f, i);
                int hashCode;
                if (o != null) {
                    hashCode = o.hashCode();
                }
                else {
                    hashCode = 0;
                }
                f2.c(hashCode, f2.i.h, (K)o, 0);
            }
            else {
                f2.i.put(f, i);
            }
            f2.l = f2.i.j;
        }
        return j;
    }
}
