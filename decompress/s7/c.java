// 
// Decompiled by Procyon v0.6.0
// 

package s7;

import java.util.UUID;
import com.apollographql.apollo.api.ResponseField;
import n7.b;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedHashSet;
import h7.n;
import m7.j;
import n7.f;
import j7.h;
import h7.k;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import m7.g;
import a4.a0;
import cg.m0;
import java.util.concurrent.Executor;
import m7.a$a;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import m7.e;
import n7.i;
import n7.d;
import m7.a;

public final class c implements a, d, i
{
    public final m7.i b;
    public final e c;
    public final ScalarTypeAdapters d;
    public final ReentrantReadWriteLock e;
    public final Set<a$a> f;
    public final Executor g;
    public final m0 h;
    public final a0 i;
    
    public c(final g a, final e c, final ScalarTypeAdapters d, final Executor g, final a0 i) {
        if (a == null) {
            throw new NullPointerException("cacheStore == null");
        }
        Object o;
        final m7.i b = (m7.i)(o = new m7.i());
        while (true) {
            final g a2 = ((g)o).a;
            if (a2 == null) {
                break;
            }
            o = a2;
        }
        ((g)o).a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            this.d = d;
            this.g = g;
            this.i = i;
            this.e = new ReentrantReadWriteLock();
            this.f = Collections.newSetFromMap(new WeakHashMap<a$a, Boolean>());
            this.h = new m0();
            return;
        }
        throw new NullPointerException("cacheKeyResolver == null");
    }
    
    public final <D extends k.a, T, V extends k.b> m7.c<n<T>> a(final k<D, T, V> k, final h<D> h, final f<j> f, final l7.a a) {
        if (k == null) {
            throw new NullPointerException("operation == null");
        }
        if (f != null) {
            return (m7.c<n<T>>)new c$f(this, this.g, (k)k, (h)h, (f)f, a);
        }
        throw new NullPointerException("responseNormalizer == null");
    }
    
    public final void b(Set<String> set) {
        if (set != null) {
            if (set.isEmpty()) {
                return;
            }
            synchronized (this) {
                final LinkedHashSet set2 = new LinkedHashSet(this.f);
                monitorexit(this);
                set = null;
                for (final a$a a$a : set2) {
                    try {
                        a$a.a();
                    }
                    catch (final RuntimeException ex) {
                        if (set != null) {
                            continue;
                        }
                        set = (Set<String>)ex;
                    }
                }
                if (set == null) {
                    return;
                }
                throw set;
            }
        }
        throw new NullPointerException("changedKeys == null");
    }
    
    public final <R> R c(final n7.h<i, R> h) {
        this.e.writeLock().lock();
        try {
            return h.execute((i)this);
        }
        finally {
            this.e.writeLock().unlock();
        }
    }
    
    public final f<j> d() {
        return new f<j>() {
            public final b j() {
                return (b)s7.c.this.h;
            }
            
            public final m7.d m(final ResponseField responseField, final Object o) {
                return new m7.d(((j)o).a);
            }
        };
    }
    
    public final j e(final String s, final l7.a a) {
        final m7.i b = this.b;
        if (s != null) {
            return b.a(s, a);
        }
        throw new NullPointerException("key == null");
    }
    
    public final <D extends k.a, T, V extends k.b> m7.c<Boolean> f(final k<D, T, V> k, final D n, final UUID uuid) {
        return (m7.c<Boolean>)new c$a(this, this.g, (k)k, (k.a)n, uuid);
    }
    
    public final f<Map<String, Object>> g() {
        return new f<Map<String, Object>>() {
            public final b j() {
                return (b)s7.c.this.h;
            }
            
            public final m7.d m(final ResponseField responseField, final Object o) {
                return s7.c.this.c.b(responseField, (Map)o);
            }
        };
    }
    
    public final Set<String> h(final Collection<j> collection, final l7.a a) {
        final m7.i b = this.b;
        if (collection != null) {
            return ((g)b).c((Collection)collection, a);
        }
        throw new NullPointerException("recordSet == null");
    }
    
    public final m7.c<Boolean> i(final UUID uuid) {
        return (m7.c<Boolean>)new c$c(this, this.g, uuid);
    }
    
    public final m7.c<Set<String>> j(final UUID uuid) {
        return (m7.c<Set<String>>)new c$b(this, this.g, uuid);
    }
}
