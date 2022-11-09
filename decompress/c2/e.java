// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import java.util.Iterator;
import ah2.f;

public final class e implements j0
{
    public final int f;
    
    public e() {
        this.f = 2;
    }
    
    @Override
    public final void h(final a a) {
        ah2.f.f((Object)a, "slotIds");
        if (a.size() > this.f) {
            int n = 0;
            final Iterator<Object> iterator = a.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                final int n2 = n + 1;
                if ((n = n2) > this.f) {
                    iterator.remove();
                    n = n2;
                }
            }
        }
    }
    
    @Override
    public final boolean i(final Object o, final Object o2) {
        return true;
    }
}
