// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import x6.h;
import java.util.TreeMap;

public final class ha
{
    public final TreeMap a;
    public final TreeMap b;
    
    public ha() {
        this.a = new TreeMap();
        this.b = new TreeMap();
    }
    
    public final void a(final h h, final b b) {
        final p6 p2 = new p6(b);
        for (final Integer n : this.a.keySet()) {
            final a a = b.b.a();
            final o h2 = this.a.get(n).h(h, Collections.singletonList(p2));
            int b2;
            if (h2 instanceof ke.h) {
                b2 = f4.b(h2.v());
            }
            else {
                b2 = -1;
            }
            if (b2 == 2 || b2 == -1) {
                b.b = a;
            }
        }
        final Iterator iterator2 = this.b.keySet().iterator();
        while (iterator2.hasNext()) {
            final o h3 = this.b.get(iterator2.next()).h(h, Collections.singletonList(p2));
            if (h3 instanceof ke.h) {
                f4.b(h3.v());
            }
        }
    }
}
