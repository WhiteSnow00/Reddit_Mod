// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sg2.e;

public final class f
{
    public static final void a(final Object o, final d d) throws IOException {
        e.g((Object)d, "jsonWriter");
        if (o == null) {
            d.t();
        }
        else if (o instanceof Map) {
            d.h();
            for (final Map.Entry<Object, V> entry : ((Map)o).entrySet()) {
                final Object key = entry.getKey();
                final V value = entry.getValue();
                d.s(String.valueOf(key));
                a(value, d);
            }
            d.r();
        }
        else if (o instanceof List) {
            d.b();
            final Iterator iterator2 = ((Iterable)o).iterator();
            while (iterator2.hasNext()) {
                a(iterator2.next(), d);
            }
            d.q();
        }
        else if (o instanceof Boolean) {
            d.w((Boolean)o);
        }
        else if (o instanceof Number) {
            d.y((Number)o);
        }
        else if (o instanceof h7.e) {
            d.A(((h7.e)o).getRawValue());
        }
        else {
            d.A(o.toString());
        }
    }
}
