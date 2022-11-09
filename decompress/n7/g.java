// 
// Decompiled by Procyon v0.6.0
// 

package n7;

import java.util.ArrayList;
import kotlin.collections.c;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.Pair;
import java.util.Comparator;
import qg2.y;
import java.util.Map;
import h7.o;
import j7.f;
import pg2.j;
import zg2.l;
import j7.d;
import java.io.IOException;
import j7.e$a;
import j7.e$b;
import java.util.LinkedHashMap;
import j7.e;

public final class g implements e
{
    public final LinkedHashMap a;
    
    public g() {
        this.a = new LinkedHashMap();
    }
    
    public final void a(final String s, final e$b e$b) throws IOException {
        if (e$b == null) {
            this.a.put(s, null);
        }
        else {
            final a a = new a();
            e$b.a((e$a)a);
            this.a.put(s, a.a);
        }
    }
    
    public final void b(final Boolean b, final String s) {
        this.a.put(s, b);
    }
    
    public final void c(final String s, final d d) throws IOException {
        if (d == null) {
            this.a.put(s, null);
        }
        else {
            final g g = new g();
            d.a((e)g);
            this.a.put(s, g.h());
        }
    }
    
    public final void d(final String s, final Integer n) {
        this.a.put(s, n);
    }
    
    public final void e(final String s, final l<? super e$a, j> l) {
        this.a(s, (e$b)new f(l));
    }
    
    public final void f(final String s, final o o, final Object o2) {
        ah2.f.g((Object)o, "scalarType");
        this.a.put(s, o2);
    }
    
    public final void g(final String s, final String s2) {
        this.a.put(s, s2);
    }
    
    public final Map<String, Object> h() {
        return c.X1(CollectionsKt___CollectionsKt.W1((Iterable)y.c2(this.a), (Comparator)new Comparator() {
            @Override
            public final int compare(final T t, final T t2) {
                return mk2.e.t((Comparable)((Pair)t).getFirst(), (Comparable)((Pair)t2).getFirst());
            }
        }));
    }
    
    public static final class a implements e$a
    {
        public final ArrayList<Object> a;
        
        public a() {
            this.a = new ArrayList<Object>();
        }
        
        public final void a(final String s) {
            if (s != null) {
                this.a.add(s);
            }
        }
        
        public final void b(final Integer n) {
            if (n != null) {
                this.a.add(n);
            }
        }
        
        public final void c(final d d) throws IOException {
            final g g = new g();
            d.a((e)g);
            this.a.add(g.h());
        }
        
        public final void d(final o o, final Object o2) {
            ah2.f.g((Object)o, "scalarType");
            if (o2 != null) {
                this.a.add(o2);
            }
        }
    }
}
