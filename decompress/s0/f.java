// 
// Decompiled by Procyon v0.6.0
// 

package s0;

import java.util.Iterator;
import c2.m0$a;
import ng2.e;
import java.util.LinkedHashMap;
import androidx.compose.foundation.lazy.layout.b;
import c2.m0;

public final class f implements m0
{
    public final b f;
    public final LinkedHashMap g;
    
    public f(final b f) {
        e.f((Object)f, "factory");
        this.f = f;
        this.g = new LinkedHashMap();
    }
    
    @Override
    public final void c(final m0$a m0$a) {
        e.f((Object)m0$a, "slotIds");
        this.g.clear();
        final Iterator iterator = m0$a.iterator();
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
    
    @Override
    public final boolean g(final Object o, final Object o2) {
        return e.a(this.f.b(o), this.f.b(o2));
    }
}
