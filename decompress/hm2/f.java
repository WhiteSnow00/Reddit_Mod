// 
// Decompiled by Procyon v0.6.0
// 

package hm2;

import dl2.c;
import ok2.m;
import java.util.Collections;
import al0.f0;
import vk2.b;
import java.util.HashMap;
import java.util.Map;

public final class f
{
    public static final Map<Integer, f> e;
    public final a a;
    public final i b;
    public final int c;
    public final int d;
    
    static {
        final HashMap hashMap = new HashMap();
        final m a = b.a;
        hashMap.put(1, new f(20, 2, a));
        f0.s(20, 4, a, hashMap, Integer.valueOf(2));
        f0.s(40, 2, a, hashMap, Integer.valueOf(3));
        f0.s(40, 4, a, hashMap, Integer.valueOf(4));
        f0.s(40, 8, a, hashMap, Integer.valueOf(5));
        f0.s(60, 3, a, hashMap, Integer.valueOf(6));
        f0.s(60, 6, a, hashMap, Integer.valueOf(7));
        f0.s(60, 12, a, hashMap, Integer.valueOf(8));
        final m c = b.c;
        hashMap.put(9, new f(20, 2, c));
        f0.s(20, 4, c, hashMap, Integer.valueOf(10));
        f0.s(40, 2, c, hashMap, Integer.valueOf(11));
        f0.s(40, 4, c, hashMap, Integer.valueOf(12));
        f0.s(40, 8, c, hashMap, Integer.valueOf(13));
        f0.s(60, 3, c, hashMap, Integer.valueOf(14));
        f0.s(60, 6, c, hashMap, Integer.valueOf(15));
        f0.s(60, 12, c, hashMap, Integer.valueOf(16));
        final m g = b.g;
        hashMap.put(17, new f(20, 2, g));
        f0.s(20, 4, g, hashMap, Integer.valueOf(18));
        f0.s(40, 2, g, hashMap, Integer.valueOf(19));
        f0.s(40, 4, g, hashMap, Integer.valueOf(20));
        f0.s(40, 8, g, hashMap, Integer.valueOf(21));
        f0.s(60, 3, g, hashMap, Integer.valueOf(22));
        f0.s(60, 6, g, hashMap, Integer.valueOf(23));
        f0.s(60, 12, g, hashMap, Integer.valueOf(24));
        final m h = b.h;
        hashMap.put(25, new f(20, 2, h));
        f0.s(20, 4, h, hashMap, Integer.valueOf(26));
        f0.s(40, 2, h, hashMap, Integer.valueOf(27));
        f0.s(40, 4, h, hashMap, Integer.valueOf(28));
        f0.s(40, 8, h, hashMap, Integer.valueOf(29));
        f0.s(60, 3, h, hashMap, Integer.valueOf(30));
        f0.s(60, 6, h, hashMap, Integer.valueOf(31));
        f0.s(60, 12, h, hashMap, Integer.valueOf(32));
        e = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public f(final int n, final int n2, final c c) {
        this(n, n2, hm2.c.b(((dl2.b)c).e()));
    }
    
    public f(final int c, final int d, final m m) {
        this.c = c;
        this.d = d;
        if (c < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (c % d != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        final int n = c / d;
        if (n == 1) {
            throw new IllegalArgumentException("height / layers must be greater than 1");
        }
        final i b = new i(n, m);
        this.b = b;
        final String f = b.f;
        final int g = b.g;
        final int e = b.e;
        final int c2 = b.h.c;
        if (f != null) {
            this.a = hm2.a.c.get(hm2.a.a(f, g, e, c2, c, d));
            return;
        }
        final Map<String, a> c3 = hm2.a.c;
        throw new NullPointerException("algorithmName == null");
    }
}
