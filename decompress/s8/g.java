// 
// Decompiled by Procyon v0.6.0
// 

package s8;

import java.util.ArrayList;
import java.util.HashMap;

public final class g<K extends l, V>
{
    public final a<K, V> a;
    public final HashMap b;
    
    public g() {
        this.a = new a<K, V>();
        this.b = new HashMap();
    }
    
    public final V a(final K k) {
        final a a = this.b.get(k);
        a a3;
        if (a == null) {
            final a a2 = new a((K)k);
            this.b.put(k, a2);
            a3 = a2;
        }
        else {
            k.a();
            a3 = a;
        }
        final a<K, V> d = a3.d;
        d.c = a3.c;
        a3.c.d = d;
        final a<K, V> a4 = this.a;
        a3.d = (a<K, V>)a4;
        final a<K, V> c = a4.c;
        a3.c = (a<K, V>)c;
        c.d = a3;
        a3.d.c = a3;
        final ArrayList b = a3.b;
        int size;
        if (b != null) {
            size = b.size();
        }
        else {
            size = 0;
        }
        Object remove;
        if (size > 0) {
            remove = a3.b.remove(size - 1);
        }
        else {
            remove = null;
        }
        return (V)remove;
    }
    
    public final void b(final K k, final V v) {
        final a a = this.b.get(k);
        a a4;
        if (a == null) {
            final a a2 = new a((K)k);
            final a<K, V> d = a2.d;
            d.c = a2.c;
            a2.c.d = d;
            final a<K, V> a3 = this.a;
            a2.d = (a<K, V>)a3.d;
            a2.c = (a<K, V>)a3;
            a3.d = a2;
            a2.d.c = a2;
            this.b.put(k, a2);
            a4 = a2;
        }
        else {
            k.a();
            a4 = a;
        }
        if (a4.b == null) {
            a4.b = new ArrayList();
        }
        a4.b.add(v);
    }
    
    public final V c() {
        a<K, V> a = this.a.d;
        while (true) {
            final boolean equals = a.equals(this.a);
            Object remove = null;
            if (equals) {
                return null;
            }
            final ArrayList b = a.b;
            int size;
            if (b != null) {
                size = b.size();
            }
            else {
                size = 0;
            }
            if (size > 0) {
                remove = a.b.remove(size - 1);
            }
            if (remove != null) {
                return (V)remove;
            }
            final a<K, V> d = a.d;
            d.c = a.c;
            a.c.d = d;
            this.b.remove(a.a);
            a.a.a();
            a = a.d;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a<K, V> a = this.a.c;
        int n = 0;
        while (!a.equals(this.a)) {
            final int n2 = 1;
            sb.append('{');
            sb.append(a.a);
            sb.append(':');
            final ArrayList b = a.b;
            int size;
            if (b != null) {
                size = b.size();
            }
            else {
                size = 0;
            }
            sb.append(size);
            sb.append("}, ");
            a = a.c;
            n = n2;
        }
        if (n != 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
    
    public static final class a<K, V>
    {
        public final K a;
        public ArrayList b;
        public a<K, V> c;
        public a<K, V> d;
        
        public a() {
            this(null);
        }
        
        public a(final K a) {
            this.d = this;
            this.c = this;
            this.a = a;
        }
    }
}
