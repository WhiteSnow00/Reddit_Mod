// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.AbstractSet;
import java.util.Set;
import java.io.ObjectStreamException;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.io.Serializable;
import java.util.AbstractMap;

public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable
{
    public static final LinkedTreeMap$a f;
    public Comparator<? super K> comparator;
    private b entrySet;
    public final e<K, V> header;
    private c keySet;
    public int modCount;
    public e<K, V> root;
    public int size;
    
    static {
        f = new Comparator<Comparable>() {
            @Override
            public final int compare(final Object o, final Object o2) {
                return ((Comparable)o).compareTo(o2);
            }
        };
    }
    
    public LinkedTreeMap() {
        this((Comparator)LinkedTreeMap.f);
    }
    
    public LinkedTreeMap(Comparator<? super K> f) {
        this.size = 0;
        this.modCount = 0;
        this.header = new e<K, V>();
        if (f == null) {
            f = LinkedTreeMap.f;
        }
        this.comparator = (Comparator<? super K>)f;
    }
    
    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
    
    public final void a(e<K, V> f, final boolean b) {
        while (f != null) {
            final e<K, V> g = f.g;
            final e<K, V> h = f.h;
            final int n = 0;
            final int n2 = 0;
            int m;
            if (g != null) {
                m = g.m;
            }
            else {
                m = 0;
            }
            int i;
            if (h != null) {
                i = h.m;
            }
            else {
                i = 0;
            }
            final int n3 = m - i;
            if (n3 == -2) {
                final e<K, V> g2 = h.g;
                final e<K, V> h2 = h.h;
                int j;
                if (h2 != null) {
                    j = h2.m;
                }
                else {
                    j = 0;
                }
                int k = n2;
                if (g2 != null) {
                    k = g2.m;
                }
                final int n4 = k - j;
                if (n4 != -1 && (n4 != 0 || b)) {
                    this.e(h);
                    this.d(f);
                }
                else {
                    this.d(f);
                }
                if (b) {
                    break;
                }
            }
            else if (n3 == 2) {
                final e<K, V> g3 = g.g;
                final e<K, V> h3 = g.h;
                int l;
                if (h3 != null) {
                    l = h3.m;
                }
                else {
                    l = 0;
                }
                int m2 = n;
                if (g3 != null) {
                    m2 = g3.m;
                }
                final int n5 = m2 - l;
                if (n5 != 1 && (n5 != 0 || b)) {
                    this.d(g);
                    this.e(f);
                }
                else {
                    this.e(f);
                }
                if (b) {
                    break;
                }
            }
            else if (n3 == 0) {
                f.m = m + 1;
                if (b) {
                    break;
                }
            }
            else {
                f.m = Math.max(m, i) + 1;
                if (!b) {
                    break;
                }
            }
            f = f.f;
        }
    }
    
    public final void c(final e<K, V> e, final e<K, V> root) {
        final e<K, V> f = e.f;
        e.f = null;
        if (root != null) {
            root.f = f;
        }
        if (f != null) {
            if (f.g == e) {
                f.g = root;
            }
            else {
                f.h = root;
            }
        }
        else {
            this.root = root;
        }
    }
    
    @Override
    public void clear() {
        this.root = null;
        this.size = 0;
        ++this.modCount;
        final e<K, V> header = this.header;
        header.j = header;
        header.i = header;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.findByObject(o) != null;
    }
    
    public final void d(final e<K, V> e) {
        final e<K, V> g = e.g;
        final e<K, V> h = e.h;
        final e<K, V> g2 = h.g;
        final e<K, V> h2 = h.h;
        e.h = g2;
        if (g2 != null) {
            g2.f = e;
        }
        this.c(e, h);
        h.g = e;
        e.f = h;
        final int n = 0;
        int m;
        if (g != null) {
            m = g.m;
        }
        else {
            m = 0;
        }
        int i;
        if (g2 != null) {
            i = g2.m;
        }
        else {
            i = 0;
        }
        final int j = Math.max(m, i) + 1;
        e.m = j;
        int k = n;
        if (h2 != null) {
            k = h2.m;
        }
        h.m = Math.max(j, k) + 1;
    }
    
    public final void e(final e<K, V> e) {
        final e<K, V> g = e.g;
        final e<K, V> h = e.h;
        final e<K, V> g2 = g.g;
        final e<K, V> h2 = g.h;
        e.g = h2;
        if (h2 != null) {
            h2.f = e;
        }
        this.c(e, g);
        g.h = e;
        e.f = g;
        final int n = 0;
        int m;
        if (h != null) {
            m = h.m;
        }
        else {
            m = 0;
        }
        int i;
        if (h2 != null) {
            i = h2.m;
        }
        else {
            i = 0;
        }
        final int j = Math.max(m, i) + 1;
        e.m = j;
        int k = n;
        if (g2 != null) {
            k = g2.m;
        }
        g.m = Math.max(j, k) + 1;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        b entrySet = this.entrySet;
        if (entrySet == null) {
            entrySet = new b();
            this.entrySet = entrySet;
        }
        return entrySet;
    }
    
    public e<K, V> find(final K k, final boolean b) {
        final Comparator<? super K> comparator = this.comparator;
        e<K, V> root = this.root;
        int n;
        if (root != null) {
            Comparable comparable;
            if (comparator == LinkedTreeMap.f) {
                comparable = (Comparable)k;
            }
            else {
                comparable = null;
            }
            while (true) {
                if (comparable != null) {
                    n = comparable.compareTo(root.k);
                }
                else {
                    n = comparator.compare(k, root.k);
                }
                if (n == 0) {
                    return root;
                }
                e<K, V> e;
                if (n < 0) {
                    e = root.g;
                }
                else {
                    e = root.h;
                }
                if (e == null) {
                    break;
                }
                root = e;
            }
        }
        else {
            n = 0;
        }
        if (!b) {
            return null;
        }
        final e<K, V> header = this.header;
        e h;
        if (root == null) {
            if (comparator == LinkedTreeMap.f && !(k instanceof Comparable)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new ClassCastException(sb.toString());
            }
            h = new e<K, V>((e<Object, Object>)root, k, (e<Object, Object>)header, (e<Object, Object>)header.j);
            this.root = (e<K, V>)h;
        }
        else {
            h = new e<K, V>(root, k, header, header.j);
            if (n < 0) {
                root.g = (e<K, V>)h;
            }
            else {
                root.h = (e<K, V>)h;
            }
            this.a(root, true);
        }
        ++this.size;
        ++this.modCount;
        return (e<K, V>)h;
    }
    
    public e<K, V> findByEntry(final Entry<?, ?> entry) {
        final e<K, V> byObject = this.findByObject(entry.getKey());
        final int n = 1;
        int n2 = 0;
        Label_0076: {
            if (byObject != null) {
                final V l = byObject.l;
                final Object value = entry.getValue();
                if (l == value || (l != null && l.equals(value))) {
                    n2 = n;
                    break Label_0076;
                }
            }
            n2 = 0;
        }
        e<K, V> e;
        if (n2 != 0) {
            e = byObject;
        }
        else {
            e = null;
        }
        return e;
    }
    
    public e<K, V> findByObject(final Object o) {
        Object find;
        final Object o2 = find = null;
        if (o == null) {
            return (e<K, V>)find;
        }
        try {
            find = this.find(o, false);
            return (e<K, V>)find;
        }
        catch (final ClassCastException ex) {
            find = o2;
            return (e<K, V>)find;
        }
    }
    
    @Override
    public V get(Object l) {
        final e<K, V> byObject = this.findByObject(l);
        if (byObject != null) {
            l = byObject.l;
        }
        else {
            l = null;
        }
        return (V)l;
    }
    
    @Override
    public Set<K> keySet() {
        c keySet = this.keySet;
        if (keySet == null) {
            keySet = new c();
            this.keySet = keySet;
        }
        return keySet;
    }
    
    @Override
    public V put(final K k, final V l) {
        if (k != null) {
            final e<K, V> find = this.find(k, true);
            final V i = find.l;
            find.l = l;
            return i;
        }
        throw new NullPointerException("key == null");
    }
    
    @Override
    public V remove(Object l) {
        final e<K, V> removeInternalByKey = this.removeInternalByKey(l);
        if (removeInternalByKey != null) {
            l = removeInternalByKey.l;
        }
        else {
            l = null;
        }
        return (V)l;
    }
    
    public void removeInternal(final e<K, V> e, final boolean b) {
        if (b) {
            final e<K, V> j = e.j;
            j.i = e.i;
            e.i.j = j;
        }
        final e<K, V> g = e.g;
        e<K, V> h = e.h;
        final e<K, V> f = e.f;
        int m = 0;
        if (g != null && h != null) {
            e<K, V> e4;
            if (g.m > h.m) {
                final e<K, V> h2 = g.h;
                e<K, V> e2 = g;
                e<K, V> h3 = h2;
                while (true) {
                    final e<K, V> e3 = e2;
                    e2 = h3;
                    e4 = e3;
                    if (e2 == null) {
                        break;
                    }
                    h3 = e2.h;
                }
            }
            else {
                e<K, V> g3;
                for (e<K, V> g2 = h.g; g2 != null; g2 = g3) {
                    g3 = g2.g;
                    h = g2;
                }
                e4 = h;
            }
            this.removeInternal(e4, false);
            final e<K, V> g4 = e.g;
            int i;
            if (g4 != null) {
                i = g4.m;
                e4.g = g4;
                g4.f = e4;
                e.g = null;
            }
            else {
                i = 0;
            }
            final e<K, V> h4 = e.h;
            if (h4 != null) {
                m = h4.m;
                e4.h = h4;
                h4.f = e4;
                e.h = null;
            }
            e4.m = Math.max(i, m) + 1;
            this.c(e, e4);
            return;
        }
        if (g != null) {
            this.c(e, g);
            e.g = null;
        }
        else if (h != null) {
            this.c(e, h);
            e.h = null;
        }
        else {
            this.c(e, null);
        }
        this.a(f, false);
        --this.size;
        ++this.modCount;
    }
    
    public e<K, V> removeInternalByKey(final Object o) {
        final e<K, V> byObject = this.findByObject(o);
        if (byObject != null) {
            this.removeInternal(byObject, true);
        }
        return byObject;
    }
    
    @Override
    public int size() {
        return this.size;
    }
    
    public final class b extends AbstractSet<Entry<K, V>>
    {
        @Override
        public final void clear() {
            LinkedTreeMap.this.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return o instanceof Entry && LinkedTreeMap.this.findByEntry((Entry<?, ?>)o) != null;
        }
        
        @Override
        public final Iterator<Entry<K, V>> iterator() {
            return (Iterator<Entry<K, V>>)new LinkedTreeMap$b$a(this);
        }
        
        @Override
        public final boolean remove(final Object o) {
            if (!(o instanceof Entry)) {
                return false;
            }
            final e<K, V> byEntry = LinkedTreeMap.this.findByEntry((Entry<?, ?>)o);
            if (byEntry == null) {
                return false;
            }
            LinkedTreeMap.this.removeInternal(byEntry, true);
            return true;
        }
        
        @Override
        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }
    
    public final class c extends AbstractSet<K>
    {
        @Override
        public final void clear() {
            LinkedTreeMap.this.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return LinkedTreeMap.this.containsKey(o);
        }
        
        @Override
        public final Iterator<K> iterator() {
            return (Iterator<K>)new LinkedTreeMap$c$a(this);
        }
        
        @Override
        public final boolean remove(final Object o) {
            return LinkedTreeMap.this.removeInternalByKey(o) != null;
        }
        
        @Override
        public final int size() {
            return LinkedTreeMap.this.size;
        }
    }
    
    public abstract class d<T> implements Iterator<T>
    {
        public e<K, V> f;
        public e<K, V> g;
        public int h;
        
        public d() {
            this.f = LinkedTreeMap.this.header.i;
            this.g = null;
            this.h = LinkedTreeMap.this.modCount;
        }
        
        public final e<K, V> a() {
            final e<K, V> f = this.f;
            final LinkedTreeMap i = LinkedTreeMap.this;
            if (f == i.header) {
                throw new NoSuchElementException();
            }
            if (i.modCount == this.h) {
                this.f = f.i;
                return this.g = f;
            }
            throw new ConcurrentModificationException();
        }
        
        @Override
        public final boolean hasNext() {
            return this.f != LinkedTreeMap.this.header;
        }
        
        @Override
        public final void remove() {
            final e<K, V> g = this.g;
            if (g != null) {
                LinkedTreeMap.this.removeInternal(g, true);
                this.g = null;
                this.h = LinkedTreeMap.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    public static final class e<K, V> implements Entry<K, V>
    {
        public e<K, V> f;
        public e<K, V> g;
        public e<K, V> h;
        public e<K, V> i;
        public e<K, V> j;
        public final K k;
        public V l;
        public int m;
        
        public e() {
            this.k = null;
            this.j = this;
            this.i = this;
        }
        
        public e(final e<K, V> f, final K k, final e<K, V> i, final e<K, V> j) {
            this.f = f;
            this.k = k;
            this.m = 1;
            this.i = i;
            this.j = j;
            j.i = this;
            i.j = this;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Entry entry = (Entry)o;
                final K k = this.k;
                if (k == null) {
                    b3 = b2;
                    if (entry.getKey() != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!k.equals(entry.getKey())) {
                        return b3;
                    }
                }
                final V l = this.l;
                if (l == null) {
                    b3 = b2;
                    if (entry.getValue() != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!l.equals(entry.getValue())) {
                        return b3;
                    }
                }
                b3 = true;
            }
            return b3;
        }
        
        @Override
        public final K getKey() {
            return this.k;
        }
        
        @Override
        public final V getValue() {
            return this.l;
        }
        
        @Override
        public final int hashCode() {
            final K k = this.k;
            int hashCode = 0;
            int hashCode2;
            if (k == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = k.hashCode();
            }
            final V l = this.l;
            if (l != null) {
                hashCode = l.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @Override
        public final V setValue(final V l) {
            final V i = this.l;
            this.l = l;
            return i;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.k);
            sb.append("=");
            sb.append(this.l);
            return sb.toString();
        }
    }
}
