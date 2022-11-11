// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.HashMap;

public final class p0
{
    public final HashMap<String, l0> a;
    
    public p0() {
        this.a = new HashMap<String, l0>();
    }
    
    public final void a() {
        for (final l0 l0 : this.a.values()) {
            l0.c = true;
            final HashMap a = l0.a;
            if (a != null) {
                synchronized (a) {
                    final Iterator iterator2 = l0.a.values().iterator();
                    while (iterator2.hasNext()) {
                        l0.a(iterator2.next());
                    }
                }
            }
            final LinkedHashSet b = l0.b;
            if (b != null) {
                synchronized (b) {
                    final Iterator iterator3 = l0.b.iterator();
                    while (iterator3.hasNext()) {
                        l0.a(iterator3.next());
                    }
                }
            }
            l0.b();
        }
        this.a.clear();
    }
}
