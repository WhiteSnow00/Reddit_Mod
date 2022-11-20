// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g
{
    public final Map<o, p> a;
    public final r b;
    public boolean c;
    
    public g(final LinkedHashMap a, final r b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final long n) {
        final List<s> a = this.b.a;
        final int size = a.size();
        boolean h = false;
        while (true) {
            for (int i = 0; i < size; ++i) {
                final Object value = a.get(i);
                if (o.a(((s)value).a, n)) {
                    final s s = (s)value;
                    if (s != null) {
                        h = s.h;
                    }
                    return h;
                }
            }
            final Object value = null;
            continue;
        }
    }
}
