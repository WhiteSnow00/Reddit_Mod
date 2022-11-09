// 
// Decompiled by Procyon v0.6.0
// 

package h1;

import java.util.Iterator;
import java.util.ArrayList;
import kj2.j;
import zg2.a;
import ah2.f;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import zg2.l;

public final class c implements b
{
    public final l<Object, Boolean> a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    
    public c(final Map<String, ? extends List<?>> map, final l<Object, Boolean> a) {
        f.f((Object)a, "canBeSaved");
        this.a = a;
        LinkedHashMap a2;
        if (map != null) {
            a2 = kotlin.collections.c.a2((Map)map);
        }
        else {
            a2 = new LinkedHashMap();
        }
        this.b = a2;
        this.c = new LinkedHashMap();
    }
    
    public final boolean a(final Object o) {
        f.f(o, "value");
        return (boolean)this.a.invoke(o);
    }
    
    public final b$a b(final String s, final a<?> a) {
        f.f((Object)s, "key");
        if (j.X1((CharSequence)s) ^ true) {
            final LinkedHashMap c = this.c;
            Object value;
            if ((value = c.get(s)) == null) {
                value = new ArrayList<a<?>>();
                c.put(s, value);
            }
            ((List<a<?>>)value).add(a);
            return (b$a)new b$a() {
                public final /* synthetic */ c a;
                
                public final void a() {
                    final List list = (List)this.a.c.remove(s);
                    if (list != null) {
                        list.remove(a);
                    }
                    if (list != null && (list.isEmpty() ^ true)) {
                        this.a.c.put(s, list);
                    }
                }
            };
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }
    
    public final Map<String, List<Object>> c() {
        final LinkedHashMap a2 = kotlin.collections.c.a2((Map)this.b);
        for (final Map.Entry<String, V> entry : this.c.entrySet()) {
            final String s = entry.getKey();
            final List list = (List)entry.getValue();
            final int size = list.size();
            int i = 0;
            if (size == 1) {
                final Object invoke = list.get(0).invoke();
                if (invoke == null) {
                    continue;
                }
                if (!this.a(invoke)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                a2.put(s, ah2.c.o(new Object[] { invoke }));
            }
            else {
                final int size2 = list.size();
                final ArrayList list2 = new ArrayList<Object>(size2);
                while (i < size2) {
                    final Object invoke2 = list.get(i).invoke();
                    if (invoke2 != null && !this.a(invoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    list2.add(invoke2);
                    ++i;
                }
                a2.put(s, list2);
            }
        }
        return a2;
    }
    
    public final Object d(final String s) {
        f.f((Object)s, "key");
        final List list = (List)this.b.remove(s);
        Object value;
        if (list != null && (list.isEmpty() ^ true)) {
            if (list.size() > 1) {
                this.b.put(s, list.subList(1, list.size()));
            }
            value = list.get(0);
        }
        else {
            value = null;
        }
        return value;
    }
}
