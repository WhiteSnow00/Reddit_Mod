// 
// Decompiled by Procyon v0.6.0
// 

package j7;

import java.io.IOException;
import k7.e;
import java.util.Iterator;
import h7.k$b;
import com.apollographql.apollo.api.a;
import java.util.Set;
import h7.d;
import kotlin.collections.EmptySet;
import kotlin.collections.c;
import java.util.HashMap;
import kotlin.TypeCastException;
import h7.f$a;
import java.util.LinkedHashMap;
import kotlin.collections.EmptyList;
import java.util.ArrayList;
import qg2.m;
import java.util.List;
import h7.k$a;
import ah2.f;
import h7.n;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import h7.k;
import java.util.Map;

public final class q
{
    public static n a(Map n1, final k k, final ScalarTypeAdapters scalarTypeAdapters) {
        final Object value = n1.get("data");
        Map map;
        if (value instanceof Map) {
            map = (Map)value;
        }
        else {
            map = null;
        }
        k$a k$a;
        if (map == null) {
            k$a = null;
        }
        else {
            final k$b f = k.f();
            ah2.f.g((Object)f, "variables");
            ah2.f.g((Object)scalarTypeAdapters, "scalarTypeAdapters");
            k$a = (k$a)k.g().a((j7.k)new r(map, f.c(), scalarTypeAdapters));
        }
        final Object value2 = n1.get("errors");
        List list;
        if (value2 instanceof List) {
            list = (List)value2;
        }
        else {
            list = null;
        }
        List<h7.f> list2;
        if (list == null) {
            list2 = null;
        }
        else {
            final ArrayList list3 = new ArrayList<h7.f>(m.P0((Iterable)list, 10));
            Iterator iterator = list.iterator();
            while (true) {
                int n2 = 10;
                if (!iterator.hasNext()) {
                    list2 = (List<h7.f>)list3;
                    break;
                }
                final Map map2 = (Map)iterator.next();
                Object o = EmptyList.INSTANCE;
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                final Iterator iterator2 = map2.entrySet().iterator();
            Label_0197:
                while (true) {
                    String string = "";
                    while (iterator2.hasNext()) {
                        final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator2.next();
                        final String s = entry.getKey();
                        final V value3 = entry.getValue();
                        if (f.a((Object)s, (Object)"message")) {
                            if (value3 == null) {
                                continue Label_0197;
                            }
                            if ((string = value3.toString()) == null) {
                                continue Label_0197;
                            }
                            continue;
                        }
                        else {
                            Iterator iterator5;
                            if (f.a((Object)s, (Object)"locations")) {
                                List list4;
                                if (value3 instanceof List) {
                                    list4 = (List)value3;
                                }
                                else {
                                    list4 = null;
                                }
                                ArrayList<f$a> list5;
                                if (list4 == null) {
                                    list5 = null;
                                }
                                else {
                                    list5 = new ArrayList<f$a>(m.P0((Iterable)list4, n2));
                                    for (final Map map3 : list4) {
                                        long n3 = -1L;
                                        long longValue;
                                        if (map3 != null) {
                                            final Iterator iterator4 = map3.entrySet().iterator();
                                            longValue = -1L;
                                            while (iterator4.hasNext()) {
                                                final Map.Entry<String, V> entry2 = (Map.Entry<String, V>)iterator4.next();
                                                final String s2 = entry2.getKey();
                                                final V value4 = entry2.getValue();
                                                long longValue2;
                                                if (f.a((Object)s2, (Object)"line")) {
                                                    if (value4 == null) {
                                                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                                                    }
                                                    longValue2 = ((Number)value4).longValue();
                                                }
                                                else {
                                                    longValue2 = n3;
                                                    if (f.a((Object)s2, (Object)"column")) {
                                                        if (value4 == null) {
                                                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Number");
                                                        }
                                                        longValue = ((Number)value4).longValue();
                                                        longValue2 = n3;
                                                    }
                                                }
                                                n3 = longValue2;
                                            }
                                        }
                                        else {
                                            longValue = -1L;
                                        }
                                        list5.add(new f$a(n3, longValue));
                                    }
                                }
                                o = list5;
                                iterator5 = iterator;
                                if (list5 == null) {
                                    o = EmptyList.INSTANCE;
                                    iterator5 = iterator;
                                }
                            }
                            else {
                                linkedHashMap.put(s, value3);
                                iterator5 = iterator;
                            }
                            iterator = iterator5;
                            n2 = 10;
                        }
                    }
                    list3.add((Object)new h7.f(string, (List)o, (HashMap)linkedHashMap));
                    break;
                }
            }
        }
        final Object a = k.a(k$a);
        final Object value5 = n1.get("extensions");
        if (value5 instanceof Map) {
            n1 = (Map)value5;
        }
        else {
            n1 = null;
        }
        if (n1 == null) {
            n1 = c.N1();
        }
        return new n(k, a, (List)list2, (Set)EmptySet.INSTANCE, false, n1, (a)d.b);
    }
    
    public static final <D extends k$a, W> n<W> b(final rk2.f f, final k<D, W, ?> k, final ScalarTypeAdapters scalarTypeAdapters) throws IOException {
        f.g((Object)f, "source");
        f.g((Object)k, "operation");
        f.g((Object)scalarTypeAdapters, "scalarTypeAdapters");
        final k7.a a = new k7.a(f);
        try {
            a.J1();
            Map<String, Object> map = new e(a).g();
            if (map == null) {
                map = c.N1();
            }
            final n a2 = a(map, k, scalarTypeAdapters);
            a.close();
            return (n<W>)a2;
        }
        finally {
            try {}
            finally {
                try {
                    a.close();
                }
                finally {}
            }
        }
    }
}
