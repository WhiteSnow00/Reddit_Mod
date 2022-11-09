// 
// Decompiled by Procyon v0.6.0
// 

package n;

import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.Map;

public class b<K, V> implements Iterable<Map.Entry<K, V>>
{
    public c<K, V> f;
    public c<K, V> g;
    public WeakHashMap<f<K, V>, Boolean> h;
    public int i;
    
    public b() {
        this.h = new WeakHashMap<f<K, V>, Boolean>();
        this.i = 0;
    }
    
    public c<K, V> a(final K k) {
        c<K, V> c;
        for (c = this.f; c != null && !c.f.equals(k); c = c.h) {}
        return c;
    }
    
    public V b(final K k, final V v) {
        final c<K, V> a = this.a(k);
        if (a != null) {
            return a.g;
        }
        final c c = new c((K)k, (V)v);
        ++this.i;
        final c<K, V> g = this.g;
        if (g == null) {
            this.f = c;
            this.g = c;
        }
        else {
            g.h = c;
            c.i = (c<K, V>)g;
            this.g = c;
        }
        return null;
    }
    
    public V c(final K k) {
        final c<K, V> a = this.a(k);
        if (a == null) {
            return null;
        }
        --this.i;
        if (!this.h.isEmpty()) {
            final Iterator<f<K, V>> iterator = this.h.keySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().a((c)a);
            }
        }
        final c<K, V> i = (c<K, V>)a.i;
        if (i != null) {
            i.h = (c<K, V>)a.h;
        }
        else {
            this.f = a.h;
        }
        final c<K, V> h = (c<K, V>)a.h;
        if (h != null) {
            h.i = i;
        }
        else {
            this.g = (c<K, V>)i;
        }
        a.h = null;
        a.i = null;
        return a.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (this.i != b2.i) {
            return false;
        }
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        final Iterator iterator2 = b2.iterator();
        Map.Entry entry;
        Object next;
        do {
            final e e = (e)iterator;
            if (e.hasNext()) {
                final e e2 = (e)iterator2;
                if (e2.hasNext()) {
                    entry = (Map.Entry)e.next();
                    next = e2.next();
                    continue;
                }
            }
            if (e.hasNext() || ((e)iterator2).hasNext()) {
                b = false;
            }
            return b;
        } while ((entry != null || next == null) && (entry == null || entry.equals(next)));
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        int n = 0;
        while (true) {
            final e e = (e)iterator;
            if (!e.hasNext()) {
                break;
            }
            n += ((Map.Entry)e.next()).hashCode();
        }
        return n;
    }
    
    @Override
    public final Iterator<Map.Entry<K, V>> iterator() {
        final a a = new a<K, V>(this.f, this.g);
        this.h.put((f<K, V>)a, Boolean.FALSE);
        return (Iterator<Map.Entry<K, V>>)a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("[");
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        while (true) {
            final e e = (e)iterator;
            if (!e.hasNext()) {
                break;
            }
            k.append(e.next().toString());
            if (!e.hasNext()) {
                continue;
            }
            k.append(", ");
        }
        k.append("]");
        return k.toString();
    }
    
    public static final class a<K, V> extends e<K, V>
    {
        public a(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        public final c<K, V> b(final c<K, V> c) {
            return c.i;
        }
        
        @Override
        public final c<K, V> c(final c<K, V> c) {
            return c.h;
        }
    }
    
    public static final class b<K, V> extends e<K, V>
    {
        public b(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        public final c<K, V> b(final c<K, V> c) {
            return c.h;
        }
        
        @Override
        public final c<K, V> c(final c<K, V> c) {
            return c.i;
        }
    }
    
    public static final class c<K, V> implements Entry<K, V>
    {
        public final K f;
        public final V g;
        public c<K, V> h;
        public c<K, V> i;
        
        public c(final K f, final V g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o == this) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            if (!this.f.equals(c.f) || !this.g.equals(c.g)) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final K getKey() {
            return this.f;
        }
        
        @Override
        public final V getValue() {
            return this.g;
        }
        
        @Override
        public final int hashCode() {
            return this.f.hashCode() ^ this.g.hashCode();
        }
        
        @Override
        public final V setValue(final V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.f);
            sb.append("=");
            sb.append(this.g);
            return sb.toString();
        }
    }
    
    public final class d implements Iterator<Map.Entry<K, V>>, f<K, V>
    {
        public c<K, V> f;
        public boolean g;
        
        public d() {
            this.g = true;
        }
        
        @Override
        public final void a(final c<K, V> c) {
            final c<K, V> f = this.f;
            if (c == f) {
                final c<K, V> i = f.i;
                this.f = i;
                this.g = (i == null);
            }
        }
        
        @Override
        public final boolean hasNext() {
            final boolean g = this.g;
            final boolean b = true;
            boolean b2 = true;
            if (g) {
                if (n.b.this.f == null) {
                    b2 = false;
                }
                return b2;
            }
            final c<K, V> f = this.f;
            return f != null && f.h != null && b;
        }
        
        @Override
        public final Object next() {
            if (this.g) {
                this.g = false;
                this.f = b.this.f;
            }
            else {
                final c<K, V> f = this.f;
                c<K, V> h;
                if (f != null) {
                    h = f.h;
                }
                else {
                    h = null;
                }
                this.f = h;
            }
            return this.f;
        }
    }
    
    public abstract static class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V>
    {
        public c<K, V> f;
        public c<K, V> g;
        
        public e(final c<K, V> g, final c<K, V> f) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final void a(final c<K, V> c) {
            final c<K, V> f = this.f;
            final c<K, V> c2 = null;
            if (f == c && c == this.g) {
                this.g = null;
                this.f = null;
            }
            final c<K, V> f2 = this.f;
            if (f2 == c) {
                this.f = this.b(f2);
            }
            final c<K, V> g = this.g;
            if (g == c) {
                final c<K, V> f3 = this.f;
                c<K, V> c3 = c2;
                if (g != f3) {
                    if (f3 == null) {
                        c3 = c2;
                    }
                    else {
                        c3 = this.c(g);
                    }
                }
                this.g = c3;
            }
        }
        
        public abstract c<K, V> b(final c<K, V> p0);
        
        public abstract c<K, V> c(final c<K, V> p0);
        
        @Override
        public final boolean hasNext() {
            return this.g != null;
        }
        
        @Override
        public final Object next() {
            final c<K, V> g = this.g;
            final c<K, V> f = this.f;
            c<K, V> c;
            if (g != f && f != null) {
                c = this.c(g);
            }
            else {
                c = null;
            }
            this.g = c;
            return g;
        }
    }
    
    public interface f<K, V>
    {
        void a(final c<K, V> p0);
    }
}
