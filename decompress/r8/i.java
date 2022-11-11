// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import java.util.TreeMap;
import android.util.Log;
import java.util.NavigableMap;
import java.util.HashMap;

public final class i implements r8.b
{
    public final g<a, Object> a;
    public final b b;
    public final HashMap c;
    public final HashMap d;
    public final int e;
    public int f;
    
    public i(final int e) {
        this.a = (g<a, Object>)new g();
        this.b = new b();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = e;
    }
    
    public final <T> void a(final T t) {
        synchronized (this) {
            final Class<?> class1 = t.getClass();
            final r8.a<Object> f = this.f(class1);
            final int a = f.a((Object)t);
            final int n = f.b() * a;
            final int n2 = this.e / 2;
            final int n3 = 1;
            if (n > n2) {
                return;
            }
            final a a2 = (a)this.b.b();
            a2.b = a;
            a2.c = class1;
            this.a.b((l)a2, (Object)t);
            final NavigableMap<Integer, Integer> h = this.h(class1);
            final Integer n4 = h.get(a2.b);
            final int b = a2.b;
            int n5;
            if (n4 == null) {
                n5 = n3;
            }
            else {
                n5 = 1 + n4;
            }
            h.put(b, n5);
            this.f += n;
            this.e(this.e);
        }
    }
    
    public final Object b(final Class clazz, int intValue) {
        synchronized (this) {
            final Integer n = this.h(clazz).ceilingKey(intValue);
            final boolean b = true;
            int n2 = 0;
            Label_0091: {
                if (n != null) {
                    final int f = this.f;
                    final boolean b2 = f == 0 || this.e / f >= 2;
                    n2 = (b ? 1 : 0);
                    if (b2) {
                        break Label_0091;
                    }
                    if (n <= intValue * 8) {
                        n2 = (b ? 1 : 0);
                        break Label_0091;
                    }
                }
                n2 = 0;
            }
            a a;
            if (n2 != 0) {
                final b b3 = this.b;
                intValue = n;
                a = (a)b3.b();
                a.b = intValue;
                a.c = clazz;
            }
            else {
                a = (a)this.b.b();
                a.b = intValue;
                a.c = clazz;
            }
            return this.g(a, (Class<Object>)clazz);
        }
    }
    
    public final Object c() {
        synchronized (this) {
            final a a = (a)this.b.b();
            a.b = 8;
            a.c = byte[].class;
            return this.g(a, byte[].class);
        }
    }
    
    public final void clearMemory() {
        synchronized (this) {
            this.e(0);
        }
    }
    
    public final void d(final Class clazz, final int n) {
        final NavigableMap<Integer, Integer> h = this.h(clazz);
        final Integer n2 = h.get(n);
        if (n2 != null) {
            if (n2 == 1) {
                h.remove(n);
            }
            else {
                h.put(n, n2 - 1);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Tried to decrement empty size, size: ");
        sb.append(n);
        sb.append(", this: ");
        sb.append(this);
        throw new NullPointerException(sb.toString());
    }
    
    public final void e(final int n) {
        while (this.f > n) {
            final Object c = this.a.c();
            ml0.a.l(c);
            final r8.a<?> f = this.f(c.getClass());
            this.f -= f.b() * f.a(c);
            this.d(c.getClass(), f.a(c));
            if (Log.isLoggable(f.getTag(), 2)) {
                final String tag = f.getTag();
                final StringBuilder r = a.r("evicted: ");
                r.append(f.a(c));
                Log.v(tag, r.toString());
            }
        }
    }
    
    public final <T> r8.a<T> f(final Class<T> clazz) {
        Object o;
        if ((o = this.d.get(clazz)) == null) {
            if (clazz.equals(int[].class)) {
                o = new h();
            }
            else {
                if (!clazz.equals(byte[].class)) {
                    final StringBuilder r = a.r("No array pool found for: ");
                    r.append(clazz.getSimpleName());
                    throw new IllegalArgumentException(r.toString());
                }
                o = new f();
            }
            this.d.put(clazz, o);
        }
        return (r8.a<T>)o;
    }
    
    public final <T> T g(final a a, final Class<T> clazz) {
        final r8.a<T> f = this.f(clazz);
        final Object a2 = this.a.a((l)a);
        if (a2 != null) {
            this.f -= f.b() * f.a(a2);
            this.d(clazz, f.a(a2));
        }
        Object array;
        if ((array = a2) == null) {
            if (Log.isLoggable(f.getTag(), 2)) {
                final String tag = f.getTag();
                final StringBuilder r = a.r("Allocated ");
                r.append(a.b);
                r.append(" bytes");
                Log.v(tag, r.toString());
            }
            array = f.newArray(a.b);
        }
        return (T)array;
    }
    
    public final NavigableMap<Integer, Integer> h(final Class<?> clazz) {
        NavigableMap navigableMap;
        if ((navigableMap = this.c.get(clazz)) == null) {
            navigableMap = new TreeMap();
            this.c.put(clazz, navigableMap);
        }
        return navigableMap;
    }
    
    @Deprecated
    public final void put(final Object o) {
        this.a(o);
    }
    
    public final void trimMemory(final int n) {
        monitorenter(this);
        Label_0041: {
            Label_0019: {
                if (n >= 40) {
                    Label_0044: {
                        try {
                            this.clearMemory();
                            break Label_0041;
                        }
                        finally {
                            break Label_0044;
                        }
                        break Label_0019;
                    }
                    monitorexit(this);
                }
            }
            if (n >= 20 || n == 15) {
                this.e(this.e / 2);
            }
        }
        monitorexit(this);
    }
    
    public static final class a implements l
    {
        public final b a;
        public int b;
        public Class<?> c;
        
        public a(final b a) {
            this.a = a;
        }
        
        public final void a() {
            this.a.c((l)this);
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = o instanceof a;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final a a = (a)o;
                b3 = b2;
                if (this.b == a.b) {
                    b3 = b2;
                    if (this.c == a.c) {
                        b3 = true;
                    }
                }
            }
            return b3;
        }
        
        @Override
        public final int hashCode() {
            final int b = this.b;
            final Class<?> c = this.c;
            int hashCode;
            if (c != null) {
                hashCode = c.hashCode();
            }
            else {
                hashCode = 0;
            }
            return b * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Key{size=");
            r.append(this.b);
            r.append("array=");
            r.append(this.c);
            r.append('}');
            return r.toString();
        }
    }
    
    public static final class b extends c
    {
        public final l a() {
            return (l)new a(this);
        }
    }
}
