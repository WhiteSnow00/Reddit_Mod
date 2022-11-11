// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractSet;
import android.support.v4.media.a;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

public class r<K extends Comparable<K>, V> extends AbstractMap<K, V>
{
    public static final /* synthetic */ int k = 0;
    public final int f;
    public List<b> g;
    public Map<K, V> h;
    public boolean i;
    public volatile d j;
    
    public r(final int f) {
        this.f = f;
        this.g = Collections.emptyList();
        this.h = Collections.emptyMap();
    }
    
    public final int a(final K k) {
        int n = this.g.size() - 1;
        if (n >= 0) {
            final int compareTo = k.compareTo(this.g.get(n).f);
            if (compareTo > 0) {
                return -(n + 2);
            }
            if (compareTo == 0) {
                return n;
            }
        }
        int i = 0;
        while (i <= n) {
            final int n2 = (i + n) / 2;
            final int compareTo2 = k.compareTo(this.g.get(n2).f);
            if (compareTo2 < 0) {
                n = n2 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n2;
                }
                i = n2 + 1;
            }
        }
        return -(i + 1);
    }
    
    public final void c() {
        if (!this.i) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final void clear() {
        this.c();
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
        return this.a((K)comparable) >= 0 || this.h.containsKey(comparable);
    }
    
    public final Iterable<Entry<K, V>> d() {
        Object o;
        if (this.h.isEmpty()) {
            o = a.b;
        }
        else {
            o = this.h.entrySet();
        }
        return (Iterable<Entry<K, V>>)o;
    }
    
    public final SortedMap<K, V> e() {
        this.c();
        if (this.h.isEmpty() && !(this.h instanceof TreeMap)) {
            this.h = new TreeMap<K, V>();
        }
        return (SortedMap)this.h;
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        if (this.j == null) {
            this.j = new d();
        }
        return this.j;
    }
    
    public final V f(final K k, final V value) {
        this.c();
        final int a = this.a(k);
        if (a >= 0) {
            return this.g.get(a).setValue(value);
        }
        this.c();
        if (this.g.isEmpty() && !(this.g instanceof ArrayList)) {
            this.g = new ArrayList<b>(this.f);
        }
        final int n = -(a + 1);
        if (n >= this.f) {
            return this.e().put(k, value);
        }
        final int size = this.g.size();
        final int f = this.f;
        if (size == f) {
            final b b = this.g.remove(f - 1);
            this.e().put(b.f, b.g);
        }
        this.g.add(n, new b(k, value));
        return null;
    }
    
    public final V g(final int n) {
        this.c();
        final V g = this.g.remove(n).g;
        if (!this.h.isEmpty()) {
            final Iterator<Map.Entry<K, V>> iterator = this.e().entrySet().iterator();
            final List<b> g2 = this.g;
            final Map.Entry<K, V> entry = (Map.Entry<K, V>)iterator.next();
            g2.add(new b(entry.getKey(), (V)entry.getValue()));
            iterator.remove();
        }
        return g;
    }
    
    @Override
    public final V get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int a = this.a((K)comparable);
        if (a >= 0) {
            return this.g.get(a).g;
        }
        return this.h.get(comparable);
    }
    
    @Override
    public final V remove(final Object o) {
        this.c();
        final Comparable comparable = (Comparable)o;
        final int a = this.a((K)comparable);
        if (a >= 0) {
            return this.g(a);
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
    
    public static final class a
    {
        public static final r$a$a a;
        public static final r$a$b b;
        
        static {
            a = new Iterator<Object>() {
                @Override
                public final boolean hasNext() {
                    return false;
                }
                
                @Override
                public final Object next() {
                    throw new NoSuchElementException();
                }
                
                @Override
                public final void remove() {
                    throw new UnsupportedOperationException();
                }
            };
            b = new Iterable<Object>() {
                @Override
                public final Iterator<Object> iterator() {
                    return r.a.a;
                }
            };
        }
    }
    
    public final class b implements Comparable<b>, Entry<K, V>
    {
        public final K f;
        public V g;
        
        public b() {
            throw null;
        }
        
        public b(final K f, final V g) {
            this.f = f;
            this.g = g;
        }
        
        @Override
        public final int compareTo(final Object o) {
            return this.f.compareTo(((b)o).f);
        }
        
        @Override
        public final boolean equals(Object value) {
            final boolean b = true;
            if (value == this) {
                return true;
            }
            if (!(value instanceof Entry)) {
                return false;
            }
            final Entry entry = (Entry)value;
            final Comparable<K> f = this.f;
            final Object key = entry.getKey();
            boolean equals;
            if (f == null) {
                equals = (key == null);
            }
            else {
                equals = f.equals(key);
            }
            if (equals) {
                final V g = this.g;
                value = entry.getValue();
                boolean equals2;
                if (g == null) {
                    equals2 = (value == null);
                }
                else {
                    equals2 = g.equals(value);
                }
                if (equals2) {
                    return b;
                }
            }
            return false;
        }
        
        @Override
        public final Object getKey() {
            return this.f;
        }
        
        @Override
        public final V getValue() {
            return this.g;
        }
        
        @Override
        public final int hashCode() {
            final Comparable<K> f = this.f;
            int hashCode = 0;
            int hashCode2;
            if (f == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = f.hashCode();
            }
            final V g = this.g;
            if (g != null) {
                hashCode = g.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @Override
        public final V setValue(final V g) {
            final r h = r.this;
            final int k = r.k;
            h.c();
            final V g2 = this.g;
            this.g = g;
            return g2;
        }
        
        @Override
        public final String toString() {
            final String value = String.valueOf(this.f);
            final String value2 = String.valueOf(this.g);
            return android.support.v4.media.a.l(new StringBuilder(value2.length() + (value.length() + 1)), value, "=", value2);
        }
    }
    
    public final class c implements Iterator<Entry<K, V>>
    {
        public int f;
        public boolean g;
        public Iterator<Entry<K, V>> h;
        
        public c() {
            this.f = -1;
        }
        
        public final Iterator<Entry<K, V>> a() {
            if (this.h == null) {
                this.h = r.this.h.entrySet().iterator();
            }
            return this.h;
        }
        
        @Override
        public final boolean hasNext() {
            final int f = this.f;
            boolean b = true;
            if (f + 1 >= r.this.g.size()) {
                b = (this.a().hasNext() && b);
            }
            return b;
        }
        
        @Override
        public final Object next() {
            this.g = true;
            final int f = this.f + 1;
            this.f = f;
            Entry entry;
            if (f < r.this.g.size()) {
                entry = r.this.g.get(this.f);
            }
            else {
                entry = this.a().next();
            }
            return entry;
        }
        
        @Override
        public final void remove() {
            if (this.g) {
                this.g = false;
                final r i = r.this;
                final int k = r.k;
                i.c();
                if (this.f < r.this.g.size()) {
                    r.this.g(this.f--);
                }
                else {
                    this.a().remove();
                }
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }
    
    public final class d extends AbstractSet<Entry<K, V>>
    {
        @Override
        public final boolean add(final Object o) {
            final Entry entry = (Entry)o;
            boolean b;
            if (!this.contains(entry)) {
                r.this.f((K)entry.getKey(), entry.getValue());
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        
        @Override
        public final void clear() {
            r.this.clear();
        }
        
        @Override
        public final boolean contains(Object value) {
            final Entry entry = (Entry)value;
            value = r.this.get(entry.getKey());
            final Object value2 = entry.getValue();
            return value == value2 || (value != null && value.equals(value2));
        }
        
        @Override
        public final Iterator<Entry<K, V>> iterator() {
            return new c();
        }
        
        @Override
        public final boolean remove(final Object o) {
            final Entry entry = (Entry)o;
            if (this.contains(entry)) {
                r.this.remove(entry.getKey());
                return true;
            }
            return false;
        }
        
        @Override
        public final int size() {
            return r.this.size();
        }
    }
}
