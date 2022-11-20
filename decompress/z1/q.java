// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import java.util.List;
import ng2.e;
import java.util.LinkedHashMap;

public final class q
{
    public final LinkedHashMap a;
    
    public q() {
        this.a = new LinkedHashMap();
    }
    
    public final g a(final r r, final y y) {
        e.f((Object)y, "positionCalculator");
        final LinkedHashMap linkedHashMap = new LinkedHashMap(r.a.size());
        final List<s> a = r.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final s s = a.get(i);
            final a a2 = this.a.get(new o(s.a));
            long n;
            long n2;
            boolean c;
            if (a2 == null) {
                n = s.b;
                n2 = s.d;
                c = false;
            }
            else {
                n = a2.a;
                c = a2.c;
                n2 = y.j(a2.b);
            }
            final long a3 = s.a;
            linkedHashMap.put(new o(a3), new p(a3, s.b, s.d, s.e, s.f, n, n2, c, s.g, s.i, s.j));
            final boolean e = s.e;
            if (e) {
                this.a.put(new o(s.a), new a(s.b, s.c, e));
            }
            else {
                this.a.remove(new o(s.a));
            }
        }
        return new g(linkedHashMap, r);
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        public final boolean c;
        
        public a(final long a, final long b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
