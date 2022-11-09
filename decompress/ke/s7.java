// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

public class s7 extends AbstractMap
{
    public final int f = f;
    public List g = Collections.emptyList();
    public Map h = Collections.emptyMap();
    public boolean i;
    public volatile r7 j;
    public Map k = Collections.emptyMap();
    
    public void a() {
        if (!this.i) {
            Map<Object, Object> h;
            if (this.h.isEmpty()) {
                h = Collections.emptyMap();
            }
            else {
                h = Collections.unmodifiableMap((Map<?, ?>)this.h);
            }
            this.h = h;
            Map<Object, Object> k;
            if (this.k.isEmpty()) {
                k = Collections.emptyMap();
            }
            else {
                k = Collections.unmodifiableMap((Map<?, ?>)this.k);
            }
            this.k = k;
            this.i = true;
        }
    }
    
    public final Object b(final Comparable comparable, final Object value) {
        this.h();
        final int c = this.c(comparable);
        if (c >= 0) {
            return ((p7)this.g.get(c)).setValue(value);
        }
        this.h();
        if (this.g.isEmpty() && !(this.g instanceof ArrayList)) {
            this.g = new ArrayList(this.f);
        }
        final int n = -(c + 1);
        if (n >= this.f) {
            return this.g().put(comparable, value);
        }
        final int size = this.g.size();
        final int f = this.f;
        if (size == f) {
            final p7 p2 = this.g.remove(f - 1);
            this.g().put(p2.f, p2.g);
        }
        this.g.add(n, new p7(this, comparable, value));
        return null;
    }
    
    public final int c(final Comparable comparable) {
        final int n = this.g.size() - 1;
        final int n2 = 0;
        int n3 = n;
        int i = n2;
        if (n >= 0) {
            final int compareTo = comparable.compareTo(this.g.get(n).f);
            if (compareTo > 0) {
                return -(n + 2);
            }
            if (compareTo == 0) {
                return n;
            }
            n3 = n;
            i = n2;
        }
        while (i <= n3) {
            final int n4 = (i + n3) / 2;
            final int compareTo2 = comparable.compareTo(this.g.get(n4).f);
            if (compareTo2 < 0) {
                n3 = n4 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n4;
                }
                i = n4 + 1;
            }
        }
        return -(i + 1);
    }
    
    @Override
    public final void clear() {
        this.h();
        if (!this.g.isEmpty()) {
            this.g.clear();
        }
        if (!this.h.isEmpty()) {
            this.h.clear();
        }
    }
    
    @Override
    public final boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        return this.c(comparable) >= 0 || this.h.containsKey(comparable);
    }
    
    public final Object d(final int n) {
        this.h();
        final Object g = this.g.remove(n).g;
        if (!this.h.isEmpty()) {
            final Iterator iterator = this.g().entrySet().iterator();
            final List g2 = this.g;
            final Map.Entry<Comparable, V> entry = (Map.Entry<Comparable, V>)iterator.next();
            g2.add(new p7(this, entry.getKey(), entry.getValue()));
            iterator.remove();
        }
        return g;
    }
    
    @Override
    public final Set entrySet() {
        if (this.j == null) {
            this.j = new r7(this);
        }
        return this.j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s7)) {
            return super.equals(o);
        }
        final s7 s7 = (s7)o;
        final int size = this.size();
        if (size != s7.size()) {
            return false;
        }
        final int size2 = this.g.size();
        if (size2 == s7.g.size()) {
            for (int i = 0; i < size2; ++i) {
                if (!((Map.Entry<?, ?>)this.g.get(i)).equals(s7.g.get(i))) {
                    return false;
                }
            }
            return size2 == size || this.h.equals(s7.h);
        }
        return this.entrySet().equals(s7.entrySet());
    }
    
    public final SortedMap g() {
        this.h();
        if (this.h.isEmpty() && !(this.h instanceof TreeMap)) {
            final TreeMap h = new TreeMap();
            this.h = h;
            final TreeMap treeMap = h;
            this.k = h.descendingMap();
        }
        return (SortedMap)this.h;
    }
    
    @Override
    public final Object get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int c = this.c(comparable);
        if (c >= 0) {
            return ((p7)this.g.get(c)).g;
        }
        return this.h.get(comparable);
    }
    
    public final void h() {
        if (!this.i) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final int hashCode() {
        final int size = this.g.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            n += this.g.get(i).hashCode();
            ++i;
        }
        if (this.h.size() > 0) {
            return this.h.hashCode() + n;
        }
        return n;
    }
    
    @Override
    public final Object remove(final Object o) {
        this.h();
        final Comparable comparable = (Comparable)o;
        final int c = this.c(comparable);
        if (c >= 0) {
            return this.d(c);
        }
        if (this.h.isEmpty()) {
            return null;
        }
        return this.h.remove(comparable);
    }
    
    @Override
    public final int size() {
        return this.h.size() + this.g.size();
    }
}
