// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

public class g<T, Y>
{
    public final LinkedHashMap a;
    public long b;
    public long c;
    
    public g(final long b) {
        this.a = new LinkedHashMap(100, 0.75f, true);
        this.b = b;
    }
    
    public final Y a(final T t) {
        synchronized (this) {
            final a a = this.a.get(t);
            Object a2;
            if (a != null) {
                a2 = a.a;
            }
            else {
                a2 = null;
            }
            return (Y)a2;
        }
    }
    
    public int b(final Y y) {
        return 1;
    }
    
    public void c(final T t, final Y y) {
    }
    
    public final Y d(final T t, final Y y) {
        synchronized (this) {
            final int b = this.b(y);
            final long n = b;
            final long b2 = this.b;
            final Y y2 = null;
            if (n >= b2) {
                this.c(t, y);
                return null;
            }
            if (y != null) {
                this.c += n;
            }
            final LinkedHashMap a = this.a;
            Object o;
            if (y == null) {
                o = null;
            }
            else {
                o = new a(y, b);
            }
            final a a2 = (a)a.put(t, o);
            if (a2 != null) {
                this.c -= a2.b;
                if (!a2.a.equals(y)) {
                    this.c(t, a2.a);
                }
            }
            this.e(this.b);
            Object a3 = y2;
            if (a2 != null) {
                a3 = a2.a;
            }
            return (Y)a3;
        }
    }
    
    public final void e(final long n) {
        synchronized (this) {
            while (this.c > n) {
                final Iterator iterator = this.a.entrySet().iterator();
                final Map.Entry<K, a> entry = (Map.Entry<K, a>)iterator.next();
                final a a = entry.getValue();
                this.c -= a.b;
                final K key = entry.getKey();
                iterator.remove();
                this.c((T)key, a.a);
            }
        }
    }
    
    public static final class a<Y>
    {
        public final Y a;
        public final int b;
        
        public a(final Y a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
