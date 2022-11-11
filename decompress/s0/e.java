// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import androidx.compose.foundation.lazy.layout.a;
import c2.j0;

public final class e implements j0
{
    public final a f;
    public final LinkedHashMap g;
    
    public e(final a f) {
        sg2.e.f((Object)f, "factory");
        this.f = f;
        this.g = new LinkedHashMap();
    }
    
    public final void f(final j0.a a) {
        sg2.e.f((Object)a, "slotIds");
        this.g.clear();
        final Iterator<Object> iterator = a.iterator();
        while (iterator.hasNext()) {
            final Object b = this.f.b(iterator.next());
            final Integer n = this.g.get(b);
            int intValue;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            if (intValue == 7) {
                iterator.remove();
            }
            else {
                this.g.put(b, intValue + 1);
            }
        }
    }
    
    public final boolean h(final Object o, final Object o2) {
        return sg2.e.a(this.f.b(o), this.f.b(o2));
    }
}
