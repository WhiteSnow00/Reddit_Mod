// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import mg2.a;
import java.util.Map;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import mj2.e;
import java.util.concurrent.ConcurrentHashMap;

public final class g
{
    public final ConcurrentHashMap a;
    
    public g() {
        this.a = new ConcurrentHashMap(1);
    }
    
    public final Object a(final e e) {
        final a<Map<String, Integer>> a = JsonNamesMapKt.a;
        ng2.e.f((Object)e, "descriptor");
        final Map map = this.a.get(e);
        final Object o = null;
        Object value;
        if (map != null) {
            value = map.get(a);
        }
        else {
            value = null;
        }
        if (value == null) {
            value = o;
        }
        return value;
    }
    
    public final Object b(final e e, final mg2.a a) {
        final a<Map<String, Integer>> a2 = JsonNamesMapKt.a;
        ng2.e.f((Object)e, "descriptor");
        final Object a3 = this.a(e);
        if (a3 != null) {
            return a3;
        }
        final Object invoke = a.invoke();
        ng2.e.f(invoke, "value");
        final ConcurrentHashMap a4 = this.a;
        Object value;
        if ((value = a4.get(e)) == null) {
            value = new ConcurrentHashMap<a, Object>(1);
            a4.put(e, value);
        }
        ((Map<a, Object>)value).put((a)a2, invoke);
        return invoke;
    }
    
    public static final class a<T>
    {
    }
}
