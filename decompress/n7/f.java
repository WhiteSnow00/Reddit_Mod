// 
// Decompiled by Procyon v0.6.0
// 

package n7;

import m7.e;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.UUID;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import h7.k;
import kotlin.collections.EmptyList;
import m7.j;
import java.util.Collection;
import kotlin.collections.EmptySet;
import java.util.Set;
import m7.d;
import h7.k$b;
import com.apollographql.apollo.api.ResponseField;
import java.util.HashSet;
import h.s;
import m7.j$a;
import java.util.List;
import z0.m0;
import j7.g;

public abstract class f<R> implements g<R>
{
    public static final f$a h;
    public m0 a;
    public m0 b;
    public m0 c;
    public List<String> d;
    public j$a e;
    public s f;
    public HashSet g;
    
    static {
        h = new f<Object>() {
            @Override
            public final void a(final ResponseField responseField, final k$b k$b) {
                ah2.f.g((Object)responseField, "field");
                ah2.f.g((Object)k$b, "variables");
            }
            
            @Override
            public final void b(final ResponseField responseField, final Object o) {
                ah2.f.g((Object)responseField, "objectField");
            }
            
            @Override
            public final void c(final List<?> list) {
                ah2.f.g((Object)list, "array");
            }
            
            @Override
            public final void d(final Object o) {
            }
            
            @Override
            public final void e(final int n) {
            }
            
            @Override
            public final void f() {
            }
            
            @Override
            public final void g() {
            }
            
            @Override
            public final void h(final ResponseField responseField, final k$b k$b) {
                ah2.f.g((Object)responseField, "field");
                ah2.f.g((Object)k$b, "variables");
            }
            
            @Override
            public final void i(final ResponseField responseField, final Object o) {
                ah2.f.g((Object)responseField, "objectField");
            }
            
            @Override
            public final b j() {
                return new b() {
                    @Override
                    public final String c(final ResponseField responseField, final k$b k$b) {
                        ah2.f.g((Object)responseField, "field");
                        ah2.f.g((Object)k$b, "variables");
                        return m7.d.b.a;
                    }
                };
            }
            
            @Override
            public final Set<String> k() {
                return (Set<String>)EmptySet.INSTANCE;
            }
            
            @Override
            public final Collection<j> l() {
                return (Collection<j>)EmptyList.INSTANCE;
            }
            
            @Override
            public final d m(final ResponseField responseField, final Object o) {
                ah2.f.g((Object)responseField, "field");
                return m7.d.b;
            }
            
            @Override
            public final void n(final k<?, ?, ?> k) {
                ah2.f.g((Object)k, "operation");
            }
        };
    }
    
    public f() {
        this.f = new s(2, 0);
        this.g = new LinkedHashSet();
    }
    
    public void a(final ResponseField responseField, final k$b k$b) {
        ah2.f.g((Object)responseField, "field");
        ah2.f.g((Object)k$b, "variables");
        final List<String> d = this.d;
        if (d == null) {
            ah2.f.n("path");
            throw null;
        }
        d.remove(d.size() - 1);
        final m0 c = this.c;
        if (c == null) {
            ah2.f.n("valueStack");
            throw null;
        }
        final Object b = c.b();
        final String c2 = this.j().c(responseField, k$b);
        final StringBuilder sb = new StringBuilder();
        final j$a e = this.e;
        if (e == null) {
            ah2.f.n("currentRecordBuilder");
            throw null;
        }
        sb.append(e.a);
        sb.append('.');
        sb.append(c2);
        this.g.add(sb.toString());
        final j$a e2 = this.e;
        if (e2 == null) {
            ah2.f.n("currentRecordBuilder");
            throw null;
        }
        ah2.f.g((Object)c2, "key");
        e2.c.put(c2, b);
        final m0 b2 = this.b;
        if (b2 != null) {
            if (b2.a.isEmpty()) {
                final s f = this.f;
                final j$a e3 = this.e;
                if (e3 == null) {
                    ah2.f.n("currentRecordBuilder");
                    throw null;
                }
                f.j(e3.a());
            }
            return;
        }
        ah2.f.n("recordStack");
        throw null;
    }
    
    public void b(final ResponseField responseField, final R r) {
        ah2.f.g((Object)responseField, "objectField");
        final m0 a = this.a;
        if (a == null) {
            ah2.f.n("pathStack");
            throw null;
        }
        final List<String> d = this.d;
        if (d == null) {
            ah2.f.n("path");
            throw null;
        }
        a.c(d);
        d m;
        if (r == null) {
            m = null;
        }
        else {
            m = this.m(responseField, r);
        }
        d b = m;
        if (m == null) {
            b = m7.d.b;
        }
        String s = b.a;
        if (b.equals((Object)m7.d.b)) {
            final StringBuilder sb = new StringBuilder();
            final List<String> d2 = this.d;
            if (d2 == null) {
                ah2.f.n("path");
                throw null;
            }
            for (int size = d2.size(), i = 0; i < size; ++i) {
                final List<String> d3 = this.d;
                if (d3 == null) {
                    ah2.f.n("path");
                    throw null;
                }
                sb.append(d3.get(i));
                if (i < size - 1) {
                    sb.append(".");
                }
            }
            s = sb.toString();
            ah2.f.b((Object)s, "stringBuilder.toString()");
        }
        else {
            ((ArrayList<String>)(this.d = new ArrayList<String>())).add(s);
        }
        final m0 b2 = this.b;
        if (b2 == null) {
            ah2.f.n("recordStack");
            throw null;
        }
        final j$a e = this.e;
        if (e != null) {
            b2.c(e.a());
            ah2.f.g((Object)s, "key");
            this.e = new j$a(s, (Map)new LinkedHashMap(), (UUID)null);
            return;
        }
        ah2.f.n("currentRecordBuilder");
        throw null;
    }
    
    public void c(final List<?> list) {
        ah2.f.g((Object)list, "array");
        final ArrayList list2 = new ArrayList(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            final m0 c = this.c;
            if (c == null) {
                ah2.f.n("valueStack");
                throw null;
            }
            list2.add(0, c.b());
        }
        final m0 c2 = this.c;
        if (c2 != null) {
            c2.c(list2);
            return;
        }
        ah2.f.n("valueStack");
        throw null;
    }
    
    public void d(final Object o) {
        final m0 c = this.c;
        if (c != null) {
            c.c(o);
            return;
        }
        ah2.f.n("valueStack");
        throw null;
    }
    
    public void e(final int n) {
        final List<String> d = this.d;
        if (d != null) {
            d.add(String.valueOf(n));
            return;
        }
        ah2.f.n("path");
        throw null;
    }
    
    public void f() {
        final List<String> d = this.d;
        if (d != null) {
            d.remove(d.size() - 1);
            return;
        }
        ah2.f.n("path");
        throw null;
    }
    
    public void g() {
        final m0 c = this.c;
        if (c != null) {
            c.c(null);
            return;
        }
        ah2.f.n("valueStack");
        throw null;
    }
    
    public void h(final ResponseField responseField, final k$b k$b) {
        ah2.f.g((Object)responseField, "field");
        ah2.f.g((Object)k$b, "variables");
        final String c = this.j().c(responseField, k$b);
        final List<String> d = this.d;
        if (d != null) {
            d.add(c);
            return;
        }
        ah2.f.n("path");
        throw null;
    }
    
    public void i(final ResponseField responseField, final R r) {
        ah2.f.g((Object)responseField, "objectField");
        final m0 a = this.a;
        if (a == null) {
            ah2.f.n("pathStack");
            throw null;
        }
        this.d = (List)a.b();
        if (r != null) {
            final j$a e = this.e;
            if (e == null) {
                ah2.f.n("currentRecordBuilder");
                throw null;
            }
            final j a2 = e.a();
            final m0 c = this.c;
            if (c == null) {
                ah2.f.n("valueStack");
                throw null;
            }
            c.c(new m7.f(a2.a));
            this.g.add(a2.a);
            this.f.j(a2);
        }
        final m0 b = this.b;
        if (b != null) {
            this.e = ((j)b.b()).b();
            return;
        }
        ah2.f.n("recordStack");
        throw null;
    }
    
    public abstract b j();
    
    public Set<String> k() {
        return this.g;
    }
    
    public Collection<j> l() {
        return CollectionsKt___CollectionsKt.h2((Iterable)((Map)this.f.g).values());
    }
    
    public abstract d m(final ResponseField p0, final R p1);
    
    public void n(final k<?, ?, ?> k) {
        ah2.f.g((Object)k, "operation");
        final d a = m7.e.a;
        ah2.f.g((Object)a, "cacheKey");
        this.a = new m0();
        this.b = new m0();
        this.c = new m0();
        this.g = new HashSet();
        this.d = new ArrayList<String>();
        final String a2 = a.a;
        ah2.f.g((Object)a2, "key");
        this.e = new j$a(a2, (Map)new LinkedHashMap(), (UUID)null);
        this.f = new s(2, 0);
    }
}
