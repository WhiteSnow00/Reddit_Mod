// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import java.util.Iterator;
import mj2.g;

public final class e implements j0, g
{
    public final int f = f;
    
    public void a() {
    }
    
    public int b() {
        return this.f;
    }
    
    public void f(final j0.a a) {
        sg2.e.f((Object)a, "slotIds");
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
    
    public boolean h(final Object o, final Object o2) {
        return true;
    }
}
