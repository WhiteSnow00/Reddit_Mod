// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import java.util.List;
import java.util.LinkedHashMap;

public final class p
{
    public final LinkedHashMap a;
    
    public p() {
        this.a = new LinkedHashMap();
    }
    
    public final f a(final q q, final w w) {
        ah2.f.f((Object)w, "positionCalculator");
        final LinkedHashMap linkedHashMap = new LinkedHashMap(q.a.size());
        final List<r> a = q.a;
        for (int size = a.size(), i = 0; i < size; ++i) {
            final r r = a.get(i);
            final a a2 = this.a.get(new n(r.a));
            long n;
            long n2;
            boolean c;
            if (a2 == null) {
                n = r.b;
                n2 = r.d;
                c = false;
            }
            else {
                n = a2.a;
                c = a2.c;
                n2 = w.i(a2.b);
            }
            final long a3 = r.a;
            linkedHashMap.put(new n(a3), new o(a3, r.b, r.d, r.e, n, n2, c, r.f, r.h, r.i));
            final boolean e = r.e;
            if (e) {
                this.a.put(new n(r.a), new a(r.b, r.c, e));
            }
            else {
                this.a.remove(new n(r.a));
            }
        }
        return new f(linkedHashMap, q);
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
