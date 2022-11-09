// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import com.reddit.type.CustomType;
import kotlin.TypeCastException;
import ah2.c;
import s7.c$d;
import j7.i;
import pg2.j;
import zg2.p;
import com.apollographql.apollo.api.ResponseField$d;
import java.math.BigDecimal;
import com.apollographql.apollo.api.ResponseField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ah2.f;
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
        new a();
    }
    
    public b(final k$b a, final ScalarTypeAdapters b) {
        f.g((Object)a, "operationVariables");
        f.g((Object)b, "scalarTypeAdapters");
        this.a = a;
        this.b = b;
        this.c = new LinkedHashMap();
    }
    
    public static LinkedHashMap i(final Map map) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            final String s = entry.getKey();
            final Object b = ((b)entry.getValue()).b;
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
    
    @Override
    public final void a(final ResponseField responseField, final String s) {
        f.g((Object)responseField, "field");
        this.n(responseField, s);
    }
    
    @Override
    public final void b(final ResponseField responseField, final Integer n) {
        f.g((Object)responseField, "field");
        BigDecimal value;
        if (n != null) {
            value = BigDecimal.valueOf(n);
        }
        else {
            value = null;
        }
        this.n(responseField, value);
    }
    
    @Override
    public final void c(final ResponseField responseField, final Boolean b) {
        f.g((Object)responseField, "field");
        this.n(responseField, b);
    }
    
    @Override
    public final void d(final ResponseField responseField, final Double n) {
        f.g((Object)responseField, "field");
        BigDecimal value;
        if (n != null) {
            value = BigDecimal.valueOf(n);
        }
        else {
            value = null;
        }
        this.n(responseField, value);
    }
    
    @Override
    public final void e(final ResponseField$d responseField$d, Object a) {
        final b<Object> a2 = this.b.a(responseField$d.g);
        if (a != null) {
            a = a2.b(a).a;
        }
        else {
            a = null;
        }
        this.n((ResponseField)responseField$d, a);
    }
    
    @Override
    public final <T> void f(final ResponseField responseField, final List<? extends T> list, final p<? super List<? extends T>, ? super o.a, j> p3) {
        f.g((Object)responseField, "field");
        f.g((Object)p3, "block");
        this.m(responseField, list, new j7.p((p<? super List<Object>, ? super o.a, j>)p3));
    }
    
    @Override
    public final void g(final i i) {
        if (i != null) {
            i.a((o)this);
        }
    }
    
    @Override
    public final void h(final ResponseField responseField, final i i) {
        f.g((Object)responseField, "field");
        x7.b.a.a(responseField, i);
        if (i == null) {
            this.c.put(responseField.b, new b(responseField, null));
            return;
        }
        final b b = new b(this.a, this.b);
        i.a((o)b);
        this.c.put(responseField.b, new b(responseField, b.c));
    }
    
    public final void k(final k$b k$b, final c$d c$d, final Map map) {
        final LinkedHashMap i = i(map);
        for (final String s : map.keySet()) {
            final b b = map.get(s);
            final Object value = i.get(s);
            if (b == null) {
                f.m();
                throw null;
            }
            ((n7.f)c$d).h(b.a, k$b);
            final int n = d.a[b.a.a.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (value == null) {
                        ((n7.f)c$d).g();
                    }
                    else {
                        ((n7.f)c$d).d(value);
                    }
                }
                else {
                    this.l(b.a, (List)b.b, (List)value, c$d);
                }
            }
            else {
                final Map map2 = (Map)value;
                ((n7.f<Map>)c$d).b(b.a, map2);
                final Object b2 = b.b;
                if (b2 == null) {
                    ((n7.f)c$d).g();
                }
                else {
                    this.k(this.a, c$d, (Map)b2);
                }
                ((n7.f<Map>)c$d).i(b.a, map2);
            }
            ((n7.f)c$d).a(b.a, k$b);
        }
    }
    
    public final void l(final ResponseField responseField, final List list, final List list2, final c$d c$d) {
        if (list == null) {
            ((n7.f)c$d).g();
            return;
        }
        int n = 0;
        for (final Object next : list) {
            if (n < 0) {
                ah2.c.x0();
                throw null;
            }
            ((n7.f)c$d).e(n);
            if (next instanceof Map) {
                if (list2 == null) {
                    f.m();
                    throw null;
                }
                ((n7.f<Object>)c$d).b(responseField, list2.get(n));
                final k$b a = this.a;
                if (next == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.apollographql.apollo.internal.response.RealResponseWriter.FieldDescriptor>");
                }
                this.k(a, c$d, (Map)next);
                ((n7.f<Object>)c$d).i(responseField, list2.get(n));
            }
            else if (next instanceof List) {
                final List list3 = (List)next;
                if (list2 == null) {
                    f.m();
                    throw null;
                }
                this.l(responseField, list3, list2.get(n), c$d);
            }
            else {
                if (list2 == null) {
                    f.m();
                    throw null;
                }
                ((n7.f)c$d).d(list2.get(n));
            }
            ((n7.f)c$d).f();
            ++n;
        }
        if (list2 != null) {
            ((n7.f)c$d).c(list2);
            return;
        }
        f.m();
        throw null;
    }
    
    public final void m(final ResponseField responseField, final List list, final j7.p p3) {
        f.g((Object)responseField, "field");
        x7.b.a.a(responseField, list);
        if (list == null) {
            this.c.put(responseField.b, new b(responseField, null));
            return;
        }
        final ArrayList list2 = new ArrayList();
        p3.a.invoke((Object)list, (Object)new c(this.a, this.b, list2));
        this.c.put(responseField.b, new b(responseField, list2));
    }
    
    public final void n(final ResponseField responseField, final Object o) {
        x7.b.a.a(responseField, o);
        this.c.put(responseField.b, new b(responseField, o));
    }
    
    public static final class a
    {
        public static final void a(final ResponseField responseField, final Object o) {
            if (!responseField.e && o == null) {
                throw new NullPointerException(a2.b.l(new Object[] { responseField.b }, 1, "Mandatory response field `%s` resolved with null value", "java.lang.String.format(format, *args)"));
            }
        }
    }
    
    public static final class b
    {
        public final ResponseField a;
        public final Object b;
        
        public b(final ResponseField a, final Object b) {
            f.g((Object)a, "field");
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c implements o.a
    {
        public final k$b a;
        public final ScalarTypeAdapters b;
        public final List<Object> c;
        
        public c(final k$b a, final ScalarTypeAdapters b, final ArrayList c) {
            f.g((Object)a, "operationVariables");
            f.g((Object)b, "scalarTypeAdapters");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final void a(final String s) {
            this.c.add(s);
        }
        
        @Override
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
        
        @Override
        public final void c(final i i) {
            final b b = new b(this.a, this.b);
            if (i != null) {
                i.a((o)b);
                this.c.add(b.c);
                return;
            }
            f.m();
            throw null;
        }
        
        @Override
        public final void d(final CustomType customType, final Object o) {
            f.g((Object)customType, "scalarType");
            final b<Object> a = this.b.a((h7.o)customType);
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
