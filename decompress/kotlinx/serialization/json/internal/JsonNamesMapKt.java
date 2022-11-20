// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.serialization.json.internal;

import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import pj2.a;
import java.util.Iterator;
import java.lang.annotation.Annotation;
import kotlin.collections.c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import pj2.k;
import java.util.ArrayList;
import mj2.e;
import java.util.Map;
import qj2.g;

public final class JsonNamesMapKt
{
    public static final g.a<Map<String, Integer>> a;
    
    static {
        a = new g.a();
    }
    
    public static final Map<String, Integer> a(final e e) {
        ng2.e.f((Object)e, "<this>");
        final int e2 = e.e();
        Map map = null;
        Map map2;
        for (int i = 0; i < e2; ++i, map = map2) {
            final List<Annotation> g = e.g(i);
            final ArrayList list = new ArrayList();
            for (final Object next : g) {
                if (next instanceof k) {
                    list.add(next);
                }
            }
            final k k = (k)CollectionsKt___CollectionsKt.v5((List)list);
            map2 = map;
            if (k != null) {
                final String[] names = k.names();
                map2 = map;
                if (names != null) {
                    final int length = names.length;
                    int n = 0;
                    while (true) {
                        map2 = map;
                        if (n >= length) {
                            break;
                        }
                        final String s = names[n];
                        Map map3;
                        if ((map3 = map) == null) {
                            map3 = new ConcurrentHashMap(e.e());
                        }
                        if (map3.containsKey(s)) {
                            final StringBuilder r = d.r("The suggested name '", s, "' for property ");
                            r.append(e.f(i));
                            r.append(" is already one of the names for property ");
                            r.append(e.f(((Number)c.v4((Map)map3, (Object)s)).intValue()));
                            r.append(" in ");
                            r.append(e);
                            throw new JsonException(r.toString());
                        }
                        map3.put(s, i);
                        ++n;
                        map = map3;
                    }
                }
            }
        }
        Map u4;
        if ((u4 = map) == null) {
            u4 = c.u4();
        }
        return u4;
    }
    
    public static final int b(final e e, final a a, final String s) {
        ng2.e.f((Object)e, "<this>");
        ng2.e.f((Object)a, "json");
        ng2.e.f((Object)s, "name");
        final int c = e.c(s);
        int intValue = -3;
        if (c != -3) {
            return c;
        }
        if (!a.a.l) {
            return c;
        }
        final Integer n = ((Map)a.c.b(e, (mg2.a)new JsonNamesMapKt$getJsonNameIndex$alternativeNamesMap$1((Object)e))).get(s);
        if (n != null) {
            intValue = n;
        }
        return intValue;
    }
    
    public static final int c(final SerialDescriptorImpl serialDescriptorImpl, final a a, final String s, final String s2) {
        ng2.e.f((Object)serialDescriptorImpl, "<this>");
        ng2.e.f((Object)a, "json");
        ng2.e.f((Object)s, "name");
        ng2.e.f((Object)s2, "suffix");
        final int b = b(serialDescriptorImpl, a, s);
        if (b != -3) {
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(serialDescriptorImpl.a);
        sb.append(" does not contain element with name '");
        sb.append(s);
        sb.append('\'');
        sb.append(s2);
        throw new SerializationException(sb.toString());
    }
}
