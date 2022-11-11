// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import h7.o;
import com.reddit.type.CustomType;
import j7.j;
import com.apollographql.apollo.api.ResponseField$a;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import com.apollographql.apollo.api.ResponseField$e;
import com.apollographql.apollo.api.ResponseField$c;
import com.apollographql.apollo.api.ResponseField$Type;
import j7.m;
import java.util.List;
import j7.k$a;
import java.math.BigDecimal;
import h7.c;
import com.apollographql.apollo.api.ResponseField$d;
import j7.n;
import rg2.l;
import com.apollographql.apollo.api.ResponseField;
import sg2.e;
import java.util.Map;
import j7.g;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import j7.b;
import j7.k;

public final class a<R> implements k
{
    public final h7.k.b a;
    public final R b;
    public final b<R> c;
    public final ScalarTypeAdapters d;
    public final g<R> e;
    public final Map<String, Object> f;
    
    public a(final h7.k.b a, final R b, final b<R> c, final ScalarTypeAdapters d, final g<R> e) {
        sg2.e.g((Object)a, "operationVariables");
        sg2.e.g((Object)c, "fieldValueResolver");
        sg2.e.g((Object)d, "scalarTypeAdapters");
        sg2.e.g((Object)e, "resolveDelegate");
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
        throw new IllegalStateException(e.l((Object)responseField.c, "corrupted response reader, expected non null value for ").toString());
    }
    
    public final Boolean a(final ResponseField responseField) {
        sg2.e.g((Object)responseField, "field");
        if (this.n(responseField)) {
            return null;
        }
        final Boolean b = (Boolean)this.c.c(responseField, (Object)this.b);
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
    
    public final <T> T b(final ResponseField responseField, final l<? super k, ? extends T> l) {
        sg2.e.g((Object)responseField, "field");
        sg2.e.g((Object)l, "block");
        return (T)this.k(responseField, new j7.l((l)l));
    }
    
    public final <T> T c(final ResponseField responseField, final l<? super k, ? extends T> l) {
        sg2.e.g((Object)responseField, "field");
        sg2.e.g((Object)l, "block");
        return (T)this.m(responseField, new n((l)l));
    }
    
    public final <T> T d(final ResponseField$d responseField$d) {
        final boolean n = this.n((ResponseField)responseField$d);
        Object a = null;
        if (n) {
            return null;
        }
        final Object c = this.c.c((ResponseField)responseField$d, (Object)this.b);
        i((ResponseField)responseField$d, c);
        this.o((ResponseField)responseField$d, c);
        if (c == null) {
            this.e.g();
        }
        else {
            a = this.d.a(responseField$d.g).a(h7.c.a.a(c));
            i((ResponseField)responseField$d, a);
            this.e.d(c);
        }
        this.j((ResponseField)responseField$d);
        return (T)a;
    }
    
    public final Double e(final ResponseField responseField) {
        sg2.e.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        final Double n2 = null;
        if (n) {
            return null;
        }
        final BigDecimal bigDecimal = (BigDecimal)this.c.c(responseField, (Object)this.b);
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
    
    public final String f(final ResponseField responseField) {
        sg2.e.g((Object)responseField, "field");
        if (this.n(responseField)) {
            return null;
        }
        final String s = (String)this.c.c(responseField, (Object)this.b);
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
    
    public final <T> List<T> g(final ResponseField responseField, final l<? super k$a, ? extends T> l) {
        sg2.e.g((Object)responseField, "field");
        sg2.e.g((Object)l, "block");
        return this.l(responseField, new m((l)l));
    }
    
    public final Integer h(final ResponseField responseField) {
        sg2.e.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        final Integer n2 = null;
        if (n) {
            return null;
        }
        final BigDecimal bigDecimal = (BigDecimal)this.c.c(responseField, (Object)this.b);
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
    
    public final void j(final ResponseField responseField) {
        this.e.a(responseField, this.a);
    }
    
    public final Object k(final ResponseField responseField, final j7.l l) {
        sg2.e.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        Object a = null;
        if (n) {
            return null;
        }
        final String s = (String)this.c.c(responseField, (Object)this.b);
        i(responseField, s);
        this.o(responseField, s);
        if (s == null) {
            this.e.g();
            this.j(responseField);
        }
        else {
            this.e.d((Object)s);
            this.j(responseField);
            if (responseField.a == ResponseField$Type.FRAGMENT) {
                for (final ResponseField$c responseField$c : responseField.f) {
                    if (responseField$c instanceof ResponseField$e && !((ResponseField$e)responseField$c).a.contains(s)) {
                        return null;
                    }
                }
                a = l.a((k)this);
            }
        }
        return a;
    }
    
    public final List l(final ResponseField responseField, final m m) {
        sg2.e.g((Object)responseField, "field");
        final boolean n = this.n(responseField);
        final List list = null;
        if (n) {
            return null;
        }
        final List list2 = (List)this.c.c(responseField, (Object)this.b);
        i(responseField, list2);
        this.o(responseField, list2);
        Object o;
        if (list2 == null) {
            this.e.g();
            o = null;
        }
        else {
            final ArrayList list3 = new ArrayList<Object>(ig2.m.c3((Iterable)list2, 10));
            int n2 = 0;
            for (final Object next : list2) {
                if (n2 < 0) {
                    lw0.b.I2();
                    throw null;
                }
                this.e.e(n2);
                Object invoke;
                if (next == null) {
                    this.e.g();
                    invoke = null;
                }
                else {
                    invoke = m.a.invoke(new a(responseField, next));
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
        sg2.e.g((Object)responseField, "field");
        final boolean n2 = this.n(responseField);
        final Object o = null;
        if (n2) {
            return null;
        }
        final Object c = this.c.c(responseField, (Object)this.b);
        i(responseField, c);
        this.o(responseField, c);
        this.e.b(responseField, c);
        Object a;
        if (c == null) {
            this.e.g();
            a = o;
        }
        else {
            a = n.a((k)new a(this.a, c, (j7.b<Object>)this.c, this.d, (j7.g<Object>)this.e));
        }
        this.e.i(responseField, c);
        this.j(responseField);
        return a;
    }
    
    public final boolean n(final ResponseField responseField) {
        for (final ResponseField$c responseField$c : responseField.f) {
            if (responseField$c instanceof ResponseField$a) {
                final Map<String, Object> f = this.f;
                final ResponseField$a responseField$a = (ResponseField$a)responseField$c;
                final Boolean b = f.get(responseField$a.a);
                if (responseField$a.b) {
                    if (sg2.e.a((Object)b, (Object)Boolean.TRUE)) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (sg2.e.a((Object)b, (Object)Boolean.FALSE)) {
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
            sg2.e.g((Object)w7.a.this, "this$0");
            sg2.e.g((Object)a, "field");
            this.a = a;
            this.b = b;
        }
        
        public final String a() {
            w7.a.this.e.d(this.b);
            return (String)this.b;
        }
        
        public final <T> T b(final l<? super k, ? extends T> l) {
            sg2.e.g((Object)l, "block");
            return (T)this.d(new j((l)l));
        }
        
        public final Object c(final CustomType customType) {
            sg2.e.g((Object)customType, "scalarType");
            final h7.b a = w7.a.this.d.a((o)customType);
            w7.a.this.e.d(this.b);
            return a.a(h7.c.a.a(this.b));
        }
        
        public final Object d(final j j) {
            final Object b = this.b;
            w7.a.this.e.b(this.a, b);
            final w7.a<R> c = w7.a.this;
            final Object a = j.a((k)new w7.a(c.a, b, (j7.b<Object>)c.c, c.d, (j7.g<Object>)c.e));
            w7.a.this.e.i(this.a, b);
            return a;
        }
        
        public final int readInt() {
            w7.a.this.e.d(this.b);
            return ((BigDecimal)this.b).intValue();
        }
    }
}
