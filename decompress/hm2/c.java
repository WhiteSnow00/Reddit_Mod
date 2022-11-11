// 
// Decompiled by Procyon v0.6.0
// 

package hm2;

import el2.i;
import el2.h;
import el2.f;
import ok2.q;
import ok2.m;
import vk2.b;
import java.util.HashMap;

public final class c
{
    public static HashMap a;
    public static HashMap b;
    
    static {
        c.a = new HashMap();
        c.b = new HashMap();
        final HashMap a = c.a;
        final m a2 = vk2.b.a;
        a.put("SHA-256", a2);
        final HashMap a3 = c.a;
        final m c = vk2.b.c;
        a3.put("SHA-512", c);
        final HashMap a4 = hm2.c.a;
        final m g = vk2.b.g;
        a4.put("SHAKE128", g);
        final HashMap a5 = hm2.c.a;
        final m h = vk2.b.h;
        a5.put("SHAKE256", h);
        hm2.c.b.put(a2, "SHA-256");
        hm2.c.b.put(c, "SHA-512");
        hm2.c.b.put(g, "SHAKE128");
        hm2.c.b.put(h, "SHAKE256");
    }
    
    public static dl2.c a(final m m) {
        if (((q)m).n((q)vk2.b.a)) {
            return (dl2.c)new f();
        }
        if (((q)m).n((q)vk2.b.c)) {
            return (dl2.c)new h();
        }
        if (((q)m).n((q)vk2.b.g)) {
            return (dl2.c)new i(128);
        }
        if (((q)m).n((q)vk2.b.h)) {
            return (dl2.c)new i(256);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unrecognized digest OID: ");
        sb.append(m);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static m b(final String s) {
        final m m = c.a.get(s);
        if (m != null) {
            return m;
        }
        throw new IllegalArgumentException(al0.b.h("unrecognized digest name: ", s));
    }
}
