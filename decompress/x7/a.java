// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import h7.o;
import com.reddit.type.CustomType;
import j7.j;
import com.apollographql.apollo.api.ResponseField$a;
import java.util.Collections;
import ah2.c;
import java.util.ArrayList;
import java.util.Iterator;
import com.apollographql.apollo.api.ResponseField$e;
import j7.m;
import java.util.List;
import j7.k$a;
import j7.n;
import zg2.l;
import java.math.BigDecimal;
import h7.c$a;
import com.apollographql.apollo.api.ResponseField$d;
import com.apollographql.apollo.api.ResponseField;
import ah2.f;
import java.util.Map;
import j7.g;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import j7.b;
import h7.k$b;
import j7.k;

public final class a<R> implements k
{
    public final k$b a;
    public final R b;
    public final b<R> c;
    public final ScalarTypeAdapters d;
    public final g<R> e;
    public final Map<String, Object> f;
    
    public a(final k$b a, final R b, final b<R> c, final ScalarTypeAdapters d, final g<R> e) {
        ah2.f.g((Object)a, "operationVariables");
        ah2.f.g((Object)c, "fieldValueResolver");
        ah2.f.g((Object)d, "scalarTypeAdapters");
        ah2.f.g((Object)e, "resolveDelegate");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = a.c();
    }
    
    public static void i(final ResponseField responseField, final Object o) {
        if (responseField.e || o != null) {
            return;
        }
        throw new IllegalStateException(f.l((Object)responseField.c, "corrupted response reader, expected non null value for ").toString());
    }
    
    public final Boolean a(final ResponseField responseField) {
        ah2.f.g((Object)responseField, "field");
        if (this.n(responseField)) {
            return null;
        }
        final Boolean b = (Boolean)this.c.a(responseField, (Object)this.b);
        i(responseField, b);
        this.o(responseField, b);
        if (b == null) {
            this.e.g();
        }
        else {
            this.e.d((Object)b);
        }
        this.j(responseField);
        return b;
    }
    
    public final <T> T b(final ResponseField$d responseField$d) {
        final boolean n = this.n((ResponseField)responseField$d);
        Object a = null;
        if (n) {
            return null;
        }
        final Object a2 = this.c.a((ResponseField)responseField$d, (Object)this.b);
        i((ResponseField)responseField$d, a2);
        this.o((ResponseField)responseField$d, a2);
        if (a2 == null) {
            this.e.g();
        }
        else {
            a = this.d.a(responseField$d.g).a(c$a.a(a2));
            i((ResponseField)responseField$d, a);
            this.e.d(a2);
        }
        this.j((ResponseField)responseField$d);
        return (T)a;
    }
    
    public final Double c(final ResponseField responseField) {
        ah2.f.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        final Double n2 = null;
        if (n) {
            return null;
        }
        final BigDecimal bigDecimal = (BigDecimal)this.c.a(responseField, (Object)this.b);
        i(responseField, bigDecimal);
        this.o(responseField, bigDecimal);
        if (bigDecimal == null) {
            this.e.g();
        }
        else {
            this.e.d((Object)bigDecimal);
        }
        this.j(responseField);
        Double value;
        if (bigDecimal == null) {
            value = n2;
        }
        else {
            value = bigDecimal.doubleValue();
        }
        return value;
    }
    
    public final String d(final ResponseField responseField) {
        ah2.f.g((Object)responseField, "field");
        if (this.n(responseField)) {
            return null;
        }
        final String s = (String)this.c.a(responseField, (Object)this.b);
        i(responseField, s);
        this.o(responseField, s);
        if (s == null) {
            this.e.g();
        }
        else {
            this.e.d((Object)s);
        }
        this.j(responseField);
        return s;
    }
    
    public final <T> T e(final ResponseField responseField, final l<? super k, ? extends T> l) {
        ah2.f.g((Object)responseField, "field");
        ah2.f.g((Object)l, "block");
        return (T)this.m(responseField, new n((l<? super k, Object>)l));
    }
    
    public final Integer f(final ResponseField responseField) {
        ah2.f.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        final Integer n2 = null;
        if (n) {
            return null;
        }
        final BigDecimal bigDecimal = (BigDecimal)this.c.a(responseField, (Object)this.b);
        i(responseField, bigDecimal);
        this.o(responseField, bigDecimal);
        if (bigDecimal == null) {
            this.e.g();
        }
        else {
            this.e.d((Object)bigDecimal);
        }
        this.j(responseField);
        Integer value;
        if (bigDecimal == null) {
            value = n2;
        }
        else {
            value = bigDecimal.intValue();
        }
        return value;
    }
    
    public final <T> List<T> g(final ResponseField responseField, final l<? super k$a, ? extends T> l) {
        ah2.f.g((Object)responseField, "field");
        ah2.f.g((Object)l, "block");
        return this.l(responseField, new m((l)l));
    }
    
    public final <T> T h(final ResponseField responseField, final l<? super k, ? extends T> l) {
        ah2.f.g((Object)responseField, "field");
        ah2.f.g((Object)l, "block");
        return (T)this.k(responseField, new j7.l((l)l));
    }
    
    public final void j(final ResponseField responseField) {
        this.e.a(responseField, this.a);
    }
    
    public final Object k(final ResponseField responseField, final j7.l l) {
        ah2.f.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        Object a = null;
        if (n) {
            return null;
        }
        final String s = (String)this.c.a(responseField, (Object)this.b);
        i(responseField, s);
        this.o(responseField, s);
        if (s == null) {
            this.e.g();
            this.j(responseField);
        }
        else {
            this.e.d((Object)s);
            this.j(responseField);
            if (responseField.a == ResponseField.Type.FRAGMENT) {
                for (final ResponseField.c c : responseField.f) {
                    if (c instanceof ResponseField$e && !((ResponseField$e)c).a.contains(s)) {
                        return null;
                    }
                }
                a = l.a((k)this);
            }
        }
        return a;
    }
    
    public final List l(final ResponseField responseField, final m m) {
        ah2.f.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        final List list = null;
        if (n) {
            return null;
        }
        final List list2 = (List)this.c.a(responseField, (Object)this.b);
        i(responseField, list2);
        this.o(responseField, list2);
        Object o;
        if (list2 == null) {
            this.e.g();
            o = null;
        }
        else {
            final ArrayList list3 = new ArrayList<Object>(qg2.m.P0((Iterable)list2, 10));
            int n2 = 0;
            for (final Object next : list2) {
                if (n2 < 0) {
                    ah2.c.x0();
                    throw null;
                }
                this.e.e(n2);
                Object invoke;
                if (next == null) {
                    this.e.g();
                    invoke = null;
                }
                else {
                    invoke = m.a.invoke((Object)new a(responseField, next));
                }
                this.e.f();
                list3.add(invoke);
                ++n2;
            }
            this.e.c(list2);
            o = list3;
        }
        this.j(responseField);
        List<Object> unmodifiableList = list;
        if (o != null) {
            unmodifiableList = Collections.unmodifiableList((List<?>)o);
        }
        return unmodifiableList;
    }
    
    public final Object m(final ResponseField responseField, final n n) {
        ah2.f.g((Object)responseField, "field");
        final boolean n2 = this.n(responseField);
        final Object o = null;
        if (n2) {
            return null;
        }
        final Object a = this.c.a(responseField, (Object)this.b);
        i(responseField, a);
        this.o(responseField, a);
        this.e.b(responseField, a);
        Object a2;
        if (a == null) {
            this.e.g();
            a2 = o;
        }
        else {
            a2 = n.a((k)new a(this.a, a, (j7.b<Object>)this.c, this.d, (j7.g<Object>)this.e));
        }
        this.e.i(responseField, a);
        this.j(responseField);
        return a2;
    }
    
    public final boolean n(final ResponseField responseField) {
        for (final ResponseField.c c : responseField.f) {
            if (c instanceof ResponseField$a) {
                final Map<String, Object> f = this.f;
                final ResponseField$a responseField$a = (ResponseField$a)c;
                final Boolean b = f.get(responseField$a.a);
                if (responseField$a.b) {
                    if (ah2.f.a((Object)b, (Object)Boolean.TRUE)) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (ah2.f.a((Object)b, (Object)Boolean.FALSE)) {
                        return true;
                    }
                    continue;
                }
            }
        }
        return false;
    }
    
    public final void o(final ResponseField responseField, final Object o) {
        this.e.h(responseField, this.a);
    }
    
    public final class a implements k$a
    {
        public final ResponseField a;
        public final Object b;
        
        public a(final ResponseField a, final Object b) {
            ah2.f.g((Object)x7.a.this, "this$0");
            ah2.f.g((Object)a, "field");
            this.a = a;
            this.b = b;
        }
        
        public final String a() {
            x7.a.this.e.d(this.b);
            return (String)this.b;
        }
        
        public final <T> T b(final l<? super k, ? extends T> l) {
            ah2.f.g((Object)l, "block");
            return (T)this.d(new j((l)l));
        }
        
        public final Object c(final CustomType customType) {
            ah2.f.g((Object)customType, "scalarType");
            final h7.b<Object> a = x7.a.this.d.a((o)customType);
            x7.a.this.e.d(this.b);
            return a.a(c$a.a(this.b));
        }
        
        public final Object d(final j j) {
            final Object b = this.b;
            x7.a.this.e.b(this.a, b);
            final x7.a<R> c = x7.a.this;
            final Object a = j.a((k)new x7.a(c.a, b, (j7.b<Object>)c.c, c.d, (j7.g<Object>)c.e));
            x7.a.this.e.i(this.a, b);
            return a;
        }
        
        public final int readInt() {
            x7.a.this.e.d(this.b);
            return ((BigDecimal)this.b).intValue();
        }
    }
}
