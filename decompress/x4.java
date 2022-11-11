// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.List;
import java.util.Map;
import java.util.Iterator;
import java.util.ArrayList;

public final class x4
{
    public static o a(final c4 c4) {
        if (c4 == null) {
            return (o)o.f3;
        }
        final int n = c4.A() - 1;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        final h6 v = c4.v();
                        final ArrayList list = new ArrayList();
                        final Iterator<Object> iterator = v.iterator();
                        while (iterator.hasNext()) {
                            list.add(a(iterator.next()));
                        }
                        return (o)new p(c4.t(), list);
                    }
                    throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
                }
                else {
                    if (c4.x()) {
                        return (o)new f(Boolean.valueOf(c4.w()));
                    }
                    return (o)new f((Boolean)null);
                }
            }
            else {
                if (c4.y()) {
                    return (o)new h(Double.valueOf(c4.r()));
                }
                return (o)new h((Double)null);
            }
        }
        else {
            if (c4.z()) {
                return (o)new s(c4.u());
            }
            return (o)o.m3;
        }
    }
    
    public static o b(Object string) {
        if (string == null) {
            return (o)o.g3;
        }
        if (string instanceof String) {
            return (o)new s((String)string);
        }
        if (string instanceof Double) {
            return (o)new h((Double)string);
        }
        if (string instanceof Long) {
            return (o)new h(Double.valueOf((double)string));
        }
        if (string instanceof Integer) {
            return (o)new h(Double.valueOf((double)string));
        }
        if (string instanceof Boolean) {
            return (o)new f((Boolean)string);
        }
        if (string instanceof Map) {
            final l l = new l();
            final Map map = (Map)string;
            for (final Object next : map.keySet()) {
                final o b = b(map.get(next));
                if (next != null) {
                    string = next;
                    if (!(next instanceof String)) {
                        string = next.toString();
                    }
                    l.a((String)string, b);
                }
            }
            return (o)l;
        }
        if (string instanceof List) {
            final e e = new e();
            final Iterator iterator2 = ((List)string).iterator();
            while (iterator2.hasNext()) {
                e.p(e.i(), b(iterator2.next()));
            }
            return (o)e;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
}
