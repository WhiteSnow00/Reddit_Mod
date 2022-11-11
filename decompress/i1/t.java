// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import hg2.j;
import java.util.ConcurrentModificationException;
import sg2.e;
import java.util.Map;
import java.util.Iterator;

public abstract class t<K, V>
{
    public final o<K, V> f;
    public final Iterator<Map.Entry<K, V>> g;
    public int h;
    public Map.Entry<? extends K, ? extends V> i;
    public Map.Entry<? extends K, ? extends V> j;
    
    public t(final o<K, V> f, final Iterator<? extends Map.Entry<? extends K, ? extends V>> g) {
        e.f((Object)f, "map");
        e.f((Object)g, "iterator");
        this.f = f;
        this.g = (Iterator<Map.Entry<K, V>>)g;
        this.h = f.c().d;
        this.a();
    }
    
    public final void a() {
        this.i = this.j;
        Map.Entry j;
        if (this.g.hasNext()) {
            j = this.g.next();
        }
        else {
            j = null;
        }
        this.j = j;
    }
    
    public final boolean hasNext() {
        return this.j != null;
    }
    
    public final void remove() {
        if (this.f.c().d != this.h) {
            throw new ConcurrentModificationException();
        }
        final Map.Entry<? extends K, ? extends V> i = this.i;
        if (i != null) {
            this.f.remove((Object)i.getKey());
            this.i = null;
            final j a = hg2.j.a;
            this.h = this.f.c().d;
            return;
        }
        throw new IllegalStateException();
    }
}
