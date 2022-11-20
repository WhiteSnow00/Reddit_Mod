// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import h7.o;
import com.reddit.type.CustomType;
import j7.j;
import java.util.Collections;
import cg.d;
import java.util.ArrayList;
import java.util.Iterator;
import com.apollographql.apollo.api.ResponseField$c;
import com.apollographql.apollo.api.ResponseField$Type;
import j7.m;
import java.util.List;
import j7.k$a;
import j7.n;
import mg2.l;
import java.math.BigDecimal;
import h7.c$a;
import com.apollographql.apollo.api.ResponseField;
import ng2.e;
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
        ng2.e.g((Object)a, "operationVariables");
        ng2.e.g((Object)c, "fieldValueResolver");
        ng2.e.g((Object)d, "scalarTypeAdapters");
        ng2.e.g((Object)e, "resolveDelegate");
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
        ng2.e.g((Object)responseField, "field");
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
    
    public final <T> T b(final ResponseField.d d) {
        final boolean n = this.n(d);
        Object a = null;
        if (n) {
            return null;
        }
        final Object a2 = this.c.a((ResponseField)d, (Object)this.b);
        i(d, a2);
        this.o(d, a2);
        if (a2 == null) {
            this.e.g();
        }
        else {
            a = this.d.a(d.g).a(c$a.a(a2));
            i(d, a);
            this.e.d(a2);
        }
        this.j(d);
        return (T)a;
    }
    
    public final Double c(final ResponseField responseField) {
        ng2.e.g((Object)responseField, "field");
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
        ng2.e.g((Object)responseField, "field");
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
    
    public final Integer e(final ResponseField responseField) {
        ng2.e.g((Object)responseField, "field");
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
    
    public final <T> T f(final ResponseField responseField, final l<? super k, ? extends T> l) {
        ng2.e.g((Object)responseField, "field");
        ng2.e.g((Object)l, "block");
        return (T)this.m(responseField, new n((l)l));
    }
    
    public final <T> List<T> g(final ResponseField responseField, final l<? super k$a, ? extends T> l) {
        ng2.e.g((Object)responseField, "field");
        ng2.e.g((Object)l, "block");
        return this.l(responseField, new m((l)l));
    }
    
    public final <T> T h(final ResponseField responseField, final l<? super k, ? extends T> l) {
        ng2.e.g((Object)responseField, "field");
        ng2.e.g((Object)l, "block");
        return (T)this.k(responseField, new j7.l((l)l));
    }
    
    public final void j(final ResponseField responseField) {
        this.e.a(responseField, this.a);
    }
    
    public final Object k(final ResponseField responseField, final j7.l l) {
        ng2.e.g((Object)responseField, "field");
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
            if (responseField.a == ResponseField$Type.FRAGMENT) {
                for (final ResponseField$c responseField$c : responseField.f) {
                    if (responseField$c instanceof ResponseField.e && !((ResponseField.e)responseField$c).a.contains(s)) {
                        return null;
                    }
                }
                a = l.a((k)this);
            }
        }
        return a;
    }
    
    public final List l(final ResponseField responseField, final m m) {
        ng2.e.g((Object)responseField, "field");
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
            final ArrayList list3 = new ArrayList<Object>(dg2.m.u4((Iterable)list2, 10));
            int n2 = 0;
            for (final Object next : list2) {
                if (n2 < 0) {
                    cg.d.a4();
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
        ng2.e.g((Object)responseField, "field");
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
        for (final ResponseField$c responseField$c : responseField.f) {
            if (responseField$c instanceof ResponseField.a) {
                final Map<String, Object> f = this.f;
                final ResponseField.a a = (ResponseField.a)responseField$c;
                final Boolean b = f.get(a.a);
                if (a.b) {
                    if (ng2.e.a((Object)b, (Object)Boolean.TRUE)) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (ng2.e.a((Object)b, (Object)Boolean.FALSE)) {
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
        public final x7.a<R> c;
        
        public a(final x7.a c, final ResponseField a, final Object b) {
            ng2.e.g((Object)c, "this$0");
            ng2.e.g((Object)a, "field");
            this.c = c;
            this.a = a;
            this.b = b;
        }
        
        public final String a() {
            this.c.e.d(this.b);
            return (String)this.b;
        }
        
        public final <T> T b(final l<? super k, ? extends T> l) {
            ng2.e.g((Object)l, "block");
            return (T)this.d(new j((l)l));
        }
        
        public final Object c(final CustomType customType) {
            ng2.e.g((Object)customType, "scalarType");
            final h7.b a = this.c.d.a((o)customType);
            this.c.e.d(this.b);
            return a.a(c$a.a(this.b));
        }
        
        public final Object d(final j j) {
            final Object b = this.b;
            this.c.e.b(this.a, b);
            final x7.a<R> c = this.c;
            final Object a = j.a((k)new x7.a(c.a, b, (j7.b<Object>)c.c, c.d, (j7.g<Object>)c.e));
            this.c.e.i(this.a, b);
            return a;
        }
        
        public final int readInt() {
            this.c.e.d(this.b);
            return ((BigDecimal)this.b).intValue();
        }
    }
}
