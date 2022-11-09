// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f
{
    public final Map<n, o> a;
    public final q b;
    public boolean c;
    
    public f(final LinkedHashMap a, final q b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final long n) {
        final List<r> a = this.b.a;
        final int size = a.size();
        boolean g = false;
        while (true) {
            for (int i = 0; i < size; ++i) {
                final Object value = a.get(i);
                if (n.a(((r)value).a, n)) {
                    final r r = (r)value;
                    if (r != null) {
                        g = r.g;
                    }
                    return g;
                }
            }
            final Object value = null;
            continue;
        }
    }
}
