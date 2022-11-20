// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import n7.f;
import com.reddit.type.CustomType;
import kotlin.TypeCastException;
import cg.d;
import s7.c$d;
import j7.i;
import cg2.j;
import j7.o$a;
import mg2.p;
import java.math.BigDecimal;
import com.apollographql.apollo.api.ResponseField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ng2.e;
import java.util.LinkedHashMap;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import h7.k$b;
import j7.o;

public final class b implements o
{
    public final k$b a;
    public final ScalarTypeAdapters b;
    public final LinkedHashMap c;
    
    static {
        new b.b$a();
    }
    
    public b(final k$b a, final ScalarTypeAdapters b) {
        e.g((Object)a, "operationVariables");
        e.g((Object)b, "scalarTypeAdapters");
        this.a = a;
        this.b = b;
        this.c = new LinkedHashMap();
    }
    
    public static LinkedHashMap i(final Map map) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final Object b = ((b.b$b)entry.getValue()).b;
            if (b == null) {
                linkedHashMap.put(s, null);
            }
            else if (b instanceof Map) {
                linkedHashMap.put(s, i((Map)b));
            }
            else if (b instanceof List) {
                linkedHashMap.put(s, j((List)b));
            }
            else {
                linkedHashMap.put(s, b);
            }
        }
        return linkedHashMap;
    }
    
    public static ArrayList j(final List list) {
        final ArrayList list2 = new ArrayList();
        for (final Object next : list) {
            if (next instanceof Map) {
                list2.add(i((Map)next));
            }
            else if (next instanceof List) {
                list2.add(j((List)next));
            }
            else {
                list2.add(next);
            }
        }
        return list2;
    }
    
    public final void a(final ResponseField responseField, final String s) {
        e.g((Object)responseField, "field");
        this.n(responseField, s);
    }
    
    public final void b(final ResponseField responseField, final Integer n) {
        e.g((Object)responseField, "field");
        BigDecimal value;
        if (n != null) {
            value = BigDecimal.valueOf(n);
        }
        else {
            value = null;
        }
        this.n(responseField, value);
    }
    
    public final <T> void c(final ResponseField responseField, final List<? extends T> list, final p<? super List<? extends T>, ? super o$a, j> p3) {
        e.g((Object)responseField, "field");
        e.g((Object)p3, "block");
        this.m(responseField, list, new j7.p((p)p3));
    }
    
    public final void d(final ResponseField responseField, final Boolean b) {
        e.g((Object)responseField, "field");
        this.n(responseField, b);
    }
    
    public final void e(final ResponseField responseField, final Double n) {
        e.g((Object)responseField, "field");
        BigDecimal value;
        if (n != null) {
            value = BigDecimal.valueOf(n);
        }
        else {
            value = null;
        }
        this.n(responseField, value);
    }
    
    public final void f(final ResponseField.d d, Object a) {
        final h7.b a2 = this.b.a(d.g);
        if (a != null) {
            a = a2.b(a).a;
        }
        else {
            a = null;
        }
        this.n(d, a);
    }
    
    public final void g(final i i) {
        if (i != null) {
            i.a((o)this);
        }
    }
    
    public final void h(final ResponseField responseField, final i i) {
        e.g((Object)responseField, "field");
        x7.b.b$a.a(responseField, (Object)i);
        if (i == null) {
            this.c.put(responseField.b, new b.b$b(responseField, (Object)null));
            return;
        }
        final b b = new b(this.a, this.b);
        i.a((o)b);
        this.c.put(responseField.b, new b.b$b(responseField, (Object)b.c));
    }
    
    public final void k(final k$b k$b, final c$d c$d, final Map map) {
        final LinkedHashMap i = i(map);
        for (final String s : map.keySet()) {
            final b.b$b b$b = map.get(s);
            final Object value = i.get(s);
            if (b$b == null) {
                e.m();
                throw null;
            }
            ((f)c$d).h(b$b.a, k$b);
            final int n = x7.b.b$d.a[((Enum)b$b.a.a).ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (value == null) {
                        ((f)c$d).g();
                    }
                    else {
                        ((f)c$d).d(value);
                    }
                }
                else {
                    this.l(b$b.a, (List)b$b.b, (List)value, c$d);
                }
            }
            else {
                final Map map2 = (Map)value;
                ((f)c$d).b(b$b.a, (Object)map2);
                final Object b = b$b.b;
                if (b == null) {
                    ((f)c$d).g();
                }
                else {
                    this.k(this.a, c$d, (Map)b);
                }
                ((f)c$d).i(b$b.a, (Object)map2);
            }
            ((f)c$d).a(b$b.a, k$b);
        }
    }
    
    public final void l(final ResponseField responseField, final List list, final List list2, final c$d c$d) {
        if (list == null) {
            ((f)c$d).g();
            return;
        }
        int n = 0;
        for (final Object next : list) {
            if (n < 0) {
                d.a4();
                throw null;
            }
            ((f)c$d).e(n);
            if (next instanceof Map) {
                if (list2 == null) {
                    e.m();
                    throw null;
                }
                ((f)c$d).b(responseField, (Object)list2.get(n));
                final k$b a = this.a;
                if (next == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.apollographql.apollo.internal.response.RealResponseWriter.FieldDescriptor>");
                }
                this.k(a, c$d, (Map)next);
                ((f)c$d).i(responseField, (Object)list2.get(n));
            }
            else if (next instanceof List) {
                final List list3 = (List)next;
                if (list2 == null) {
                    e.m();
                    throw null;
                }
                this.l(responseField, list3, list2.get(n), c$d);
            }
            else {
                if (list2 == null) {
                    e.m();
                    throw null;
                }
                ((f)c$d).d(list2.get(n));
            }
            ((f)c$d).f();
            ++n;
        }
        if (list2 != null) {
            ((f)c$d).c(list2);
            return;
        }
        e.m();
        throw null;
    }
    
    public final void m(final ResponseField responseField, final List list, final j7.p p3) {
        e.g((Object)responseField, "field");
        x7.b.b$a.a(responseField, (Object)list);
        if (list == null) {
            this.c.put(responseField.b, new b.b$b(responseField, (Object)null));
            return;
        }
        final ArrayList list2 = new ArrayList();
        p3.a.invoke((Object)list, (Object)new c(this.a, this.b, list2));
        this.c.put(responseField.b, new b.b$b(responseField, (Object)list2));
    }
    
    public final void n(final ResponseField responseField, final Object o) {
        x7.b.b$a.a(responseField, o);
        this.c.put(responseField.b, new b.b$b(responseField, o));
    }
    
    public static final class c implements o$a
    {
        public final k$b a;
        public final ScalarTypeAdapters b;
        public final List<Object> c;
        
        public c(final k$b a, final ScalarTypeAdapters b, final ArrayList c) {
            e.g((Object)a, "operationVariables");
            e.g((Object)b, "scalarTypeAdapters");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        public final void a(final String s) {
            this.c.add(s);
        }
        
        public final void b(final Integer n) {
            final List<Object> c = this.c;
            BigDecimal value;
            if (n != null) {
                value = BigDecimal.valueOf(n);
            }
            else {
                value = null;
            }
            c.add(value);
        }
        
        public final void c(final i i) {
            final b b = new b(this.a, this.b);
            if (i != null) {
                i.a((o)b);
                this.c.add(b.c);
                return;
            }
            e.m();
            throw null;
        }
        
        public final void d(final CustomType customType, final Object o) {
            e.g((Object)customType, "scalarType");
            final h7.b a = this.b.a((h7.o)customType);
            final List<Object> c = this.c;
            Object a2;
            if (o != null) {
                a2 = a.b(o).a;
            }
            else {
                a2 = null;
            }
            c.add(a2);
        }
    }
}
