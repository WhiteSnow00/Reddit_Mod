// 
// Decompiled by Procyon v0.6.0
// 

package hm2;

import dl2.c;
import java.util.Collections;
import java.util.HashMap;
import ok2.m;
import java.util.Map;

public final class i
{
    public static final Map<Integer, i> i;
    public final b a;
    public final int b;
    public final int c;
    public final m d;
    public final int e;
    public final String f;
    public final int g;
    public final e h;
    
    static {
        final HashMap hashMap = new HashMap();
        final m a = vk2.b.a;
        hashMap.put(1, new i(10, a));
        hashMap.put(2, new i(16, a));
        hashMap.put(3, new i(20, a));
        final m c = vk2.b.c;
        hashMap.put(4, new i(10, c));
        hashMap.put(5, new i(16, c));
        hashMap.put(6, new i(20, c));
        final m g = vk2.b.g;
        hashMap.put(7, new i(10, g));
        hashMap.put(8, new i(16, g));
        hashMap.put(9, new i(20, g));
        final m h = vk2.b.h;
        hashMap.put(10, new i(10, h));
        hashMap.put(11, new i(16, h));
        hashMap.put(12, new i(20, h));
        i = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public i(final int n, final c c) {
        this(n, hm2.c.b(((dl2.b)c).e()));
    }
    
    public i(final int b, final m d) {
        if (b < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (d == null) {
            throw new NullPointerException("digest == null");
        }
        this.b = b;
        int c = 2;
        while (true) {
            final int b2 = this.b;
            if (c > b2) {
                throw new IllegalStateException("should never happen...");
            }
            if ((b2 - c) % 2 == 0) {
                this.c = c;
                final String f = hm2.c.b.get(d);
                if (f != null) {
                    this.f = f;
                    this.d = d;
                    final e h = new e(d);
                    this.h = h;
                    final int a = h.a;
                    this.g = a;
                    final int b3 = h.b;
                    this.e = b3;
                    this.a = hm2.b.c.get(hm2.b.a(f, a, b3, h.c, b));
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("unrecognized digest oid: ");
                sb.append(d);
                throw new IllegalArgumentException(sb.toString());
            }
            else {
                ++c;
            }
        }
    }
}
