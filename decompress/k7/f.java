// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import java.io.IOException;
import java.util.Iterator;
import h7.e;
import java.util.List;
import java.util.Map;

public final class f
{
    public static final void a(Object key, final d d) throws IOException {
        ah2.f.g((Object)d, "jsonWriter");
        if (key == null) {
            d.t();
        }
        else if (key instanceof Map) {
            d.h();
            for (final Map.Entry<Object, V> entry : ((Map)key).entrySet()) {
                key = entry.getKey();
                final V value = entry.getValue();
                d.s(String.valueOf(key));
                a(value, d);
            }
            d.r();
        }
        else if (key instanceof List) {
            d.b();
            final Iterator iterator2 = ((Iterable)key).iterator();
            while (iterator2.hasNext()) {
                a(iterator2.next(), d);
            }
            d.q();
        }
        else if (key instanceof Boolean) {
            d.x((Boolean)key);
        }
        else if (key instanceof Number) {
            d.y((Number)key);
        }
        else if (key instanceof e) {
            d.A(((e)key).getRawValue());
        }
        else {
            d.A(key.toString());
        }
    }
}
