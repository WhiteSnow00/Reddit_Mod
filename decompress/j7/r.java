// 
// Decompiled by Procyon v0.6.0
// 

package j7;

import h7.o;
import com.reddit.type.CustomType;
import java.util.Iterator;
import com.apollographql.apollo.api.ResponseField$c;
import java.util.ArrayList;
import java.util.List;
import mg2.l;
import java.math.BigDecimal;
import h7.c$a;
import ng2.h;
import ng2.e;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import java.util.Map;

public final class r implements k
{
    public final Map<String, Object> a;
    public final Map<String, Object> b;
    public final ScalarTypeAdapters c;
    
    public r(final Map<String, ?> a, final Map<String, ?> b, final ScalarTypeAdapters c) {
        this.a = (Map<String, Object>)a;
        this.b = (Map<String, Object>)b;
        this.c = c;
    }
    
    public static void i(final ResponseField responseField, final Object o) {
        if (!responseField.e && o == null) {
            throw new NullPointerException(e.l((Object)responseField.c, "corrupted response reader, expected non null value for "));
        }
    }
    
    public final Boolean a(final ResponseField responseField) {
        e.g((Object)responseField, "field");
        final boolean m = this.m(responseField);
        final Boolean b = null;
        if (m) {
            return null;
        }
        Boolean value = this.a.get(responseField.b);
        if (value == null) {
            value = b;
        }
        else if (!(value instanceof Boolean)) {
            final StringBuilder t = a.t("The value for \"");
            t.append(responseField.b);
            t.append("\" expected to be of type \"");
            t.append((Object)h.a((Class)Boolean.class).n());
            t.append("\" but was \"");
            t.append((Object)h.a((Class)value.getClass()).n());
            t.append('\"');
            throw new ClassCastException(t.toString());
        }
        final Boolean b2 = value;
        i(responseField, b2);
        return b2;
    }
    
    public final <T> T b(final ResponseField.d d) {
        final boolean m = this.m(d);
        final T t = null;
        if (m) {
            return null;
        }
        Object value;
        if ((value = this.a.get(d.b)) == null) {
            value = null;
        }
        i(d, value);
        Object a;
        if (value == null) {
            a = t;
        }
        else {
            a = this.c.a(d.g).a(c$a.a(value));
        }
        return (T)a;
    }
    
    public final Double c(final ResponseField responseField) {
        e.g((Object)responseField, "field");
        final boolean m = this.m(responseField);
        final Double n = null;
        if (m) {
            return null;
        }
        BigDecimal value = this.a.get(responseField.b);
        if (value == null) {
            value = null;
        }
        else if (!(value instanceof BigDecimal)) {
            final StringBuilder t = a.t("The value for \"");
            t.append(responseField.b);
            t.append("\" expected to be of type \"");
            t.append((Object)h.a((Class)BigDecimal.class).n());
            t.append("\" but was \"");
            t.append((Object)h.a((Class)value.getClass()).n());
            t.append('\"');
            throw new ClassCastException(t.toString());
        }
        final BigDecimal bigDecimal = value;
        i(responseField, bigDecimal);
        Double value2;
        if (bigDecimal == null) {
            value2 = n;
        }
        else {
            value2 = bigDecimal.doubleValue();
        }
        return value2;
    }
    
    public final String d(final ResponseField responseField) {
        e.g((Object)responseField, "field");
        final boolean m = this.m(responseField);
        final String s = null;
        if (m) {
            return null;
        }
        String value = this.a.get(responseField.b);
        if (value == null) {
            value = s;
        }
        else if (!(value instanceof String)) {
            final StringBuilder t = a.t("The value for \"");
            t.append(responseField.b);
            t.append("\" expected to be of type \"");
            t.append((Object)h.a((Class)String.class).n());
            t.append("\" but was \"");
            t.append((Object)h.a((Class)value.getClass()).n());
            t.append('\"');
            throw new ClassCastException(t.toString());
        }
        final String s2 = value;
        i(responseField, s2);
        return s2;
    }
    
    public final Integer e(final ResponseField responseField) {
        e.g((Object)responseField, "field");
        final boolean m = this.m(responseField);
        final Integer n = null;
        if (m) {
            return null;
        }
        BigDecimal value = this.a.get(responseField.b);
        if (value == null) {
            value = null;
        }
        else if (!(value instanceof BigDecimal)) {
            final StringBuilder t = a.t("The value for \"");
            t.append(responseField.b);
            t.append("\" expected to be of type \"");
            t.append((Object)h.a((Class)BigDecimal.class).n());
            t.append("\" but was \"");
            t.append((Object)h.a((Class)value.getClass()).n());
            t.append('\"');
            throw new ClassCastException(t.toString());
        }
        final BigDecimal bigDecimal = value;
        i(responseField, bigDecimal);
        Integer value2;
        if (bigDecimal == null) {
            value2 = n;
        }
        else {
            value2 = bigDecimal.intValue();
        }
        return value2;
    }
    
    public final <T> T f(final ResponseField responseField, final l<? super k, ? extends T> l) {
        e.g((Object)responseField, "field");
        e.g((Object)l, "block");
        return (T)this.l(responseField, new n((l)l));
    }
    
    public final <T> List<T> g(final ResponseField responseField, final l<? super k$a, ? extends T> l) {
        e.g((Object)responseField, "field");
        e.g((Object)l, "block");
        return this.k(responseField, new m((l)l));
    }
    
    public final <T> T h(final ResponseField responseField, final l<? super k, ? extends T> l) {
        e.g((Object)responseField, "field");
        e.g((Object)l, "block");
        return (T)this.j(responseField, new j7.l((l)l));
    }
    
    public final Object j(final ResponseField responseField, final j7.l l) {
        e.g((Object)responseField, "field");
        final boolean m = this.m(responseField);
        final Object o = null;
        if (m) {
            return null;
        }
        String value = this.a.get(responseField.b);
        if (value == null) {
            value = null;
        }
        else if (!(value instanceof String)) {
            final StringBuilder t = a.t("The value for \"");
            t.append(responseField.b);
            t.append("\" expected to be of type \"");
            t.append((Object)h.a((Class)String.class).n());
            t.append("\" but was \"");
            t.append((Object)h.a((Class)value.getClass()).n());
            t.append('\"');
            throw new ClassCastException(t.toString());
        }
        final String s = value;
        i(responseField, s);
        Object a;
        if (s == null) {
            a = o;
        }
        else {
            final List f = responseField.f;
            final ArrayList list = new ArrayList();
            for (final ResponseField$c responseField$c : f) {
                ResponseField.e e;
                if (responseField$c instanceof ResponseField.e) {
                    e = (ResponseField.e)responseField$c;
                }
                else {
                    e = null;
                }
                if (e != null) {
                    list.add(e);
                }
            }
            final boolean empty = list.isEmpty();
            final boolean b = true;
            int n = 0;
            Label_0218: {
                if (empty) {
                    n = (b ? 1 : 0);
                }
                else {
                    final Iterator iterator2 = list.iterator();
                    do {
                        n = (b ? 1 : 0);
                        if (iterator2.hasNext()) {
                            continue;
                        }
                        break Label_0218;
                    } while (((ResponseField.e)iterator2.next()).a.contains(s));
                    n = 0;
                }
            }
            a = o;
            if (n != 0) {
                a = l.a((k)this);
            }
        }
        return a;
    }
    
    public final List k(final ResponseField responseField, final m m) {
        e.g((Object)responseField, "field");
        final boolean i = this.m(responseField);
        final List list = null;
        if (i) {
            return null;
        }
        List value = this.a.get(responseField.b);
        if (value == null) {
            value = null;
        }
        else if (!(value instanceof List)) {
            final StringBuilder t = a.t("The value for \"");
            t.append(responseField.b);
            t.append("\" expected to be of type \"");
            t.append((Object)h.a((Class)List.class).n());
            t.append("\" but was \"");
            t.append((Object)h.a((Class)value.getClass()).n());
            t.append('\"');
            throw new ClassCastException(t.toString());
        }
        final List list2 = value;
        i(responseField, list2);
        List<Object> list3;
        if (list2 == null) {
            list3 = list;
        }
        else {
            final ArrayList list4 = new ArrayList<Object>(dg2.m.u4((Iterable)list2, 10));
            for (final Object next : list2) {
                Object invoke;
                if (next == null) {
                    invoke = null;
                }
                else {
                    invoke = m.a.invoke((Object)new a(responseField, next));
                }
                list4.add(invoke);
            }
            list3 = (List<Object>)list4;
        }
        return list3;
    }
    
    public final Object l(final ResponseField responseField, final n n) {
        e.g((Object)responseField, "field");
        final boolean m = this.m(responseField);
        final Object o = null;
        if (m) {
            return null;
        }
        Map value = this.a.get(responseField.b);
        if (value == null) {
            value = null;
        }
        else if (!(value instanceof Map)) {
            final StringBuilder t = a.t("The value for \"");
            t.append(responseField.b);
            t.append("\" expected to be of type \"");
            t.append((Object)h.a((Class)Map.class).n());
            t.append("\" but was \"");
            t.append((Object)h.a((Class)value.getClass()).n());
            t.append('\"');
            throw new ClassCastException(t.toString());
        }
        final Map map = value;
        i(responseField, map);
        Object a;
        if (map == null) {
            a = o;
        }
        else {
            a = n.a((k)new r(map, this.b, this.c));
        }
        return a;
    }
    
    public final boolean m(final ResponseField responseField) {
        for (final ResponseField$c responseField$c : responseField.f) {
            if (responseField$c instanceof ResponseField.a) {
                final Map<String, Object> b = this.b;
                final ResponseField.a a = (ResponseField.a)responseField$c;
                final Boolean b2 = b.get(a.a);
                if (a.b) {
                    if (e.a((Object)b2, (Object)Boolean.TRUE)) {
                        return true;
                    }
                    continue;
                }
                else {
                    if (e.a((Object)b2, (Object)Boolean.FALSE)) {
                        return true;
                    }
                    continue;
                }
            }
        }
        return false;
    }
    
    public final class a implements k$a
    {
        public final Object a;
        public final r b;
        
        public a(final r b, final ResponseField responseField, final Object a) {
            e.g((Object)b, "this$0");
            e.g((Object)responseField, "field");
            this.b = b;
            this.a = a;
        }
        
        public final String a() {
            return (String)this.a;
        }
        
        public final <T> T b(final l<? super k, ? extends T> l) {
            e.g((Object)l, "block");
            return (T)this.d(new j((l)l));
        }
        
        public final Object c(final CustomType customType) {
            e.g((Object)customType, "scalarType");
            return this.b.c.a((o)customType).a(c$a.a(this.a));
        }
        
        public final Object d(final j j) {
            final Map map = (Map)this.a;
            final r b = this.b;
            return j.a((k)new r(map, b.b, b.c));
        }
        
        public final int readInt() {
            final BigDecimal bigDecimal = (BigDecimal)this.a;
            e.g((Object)bigDecimal, "<this>");
            return bigDecimal.intValue();
        }
    }
}
