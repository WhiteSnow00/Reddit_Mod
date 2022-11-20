// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import al2.i;
import al2.h;
import al2.f;
import kk2.q;
import zk2.c;
import kk2.m;
import rk2.b;
import java.util.HashMap;

public final class a
{
    public static HashMap a;
    public static HashMap b;
    
    static {
        wl2.a.a = new HashMap();
        wl2.a.b = new HashMap();
        final HashMap a = wl2.a.a;
        final m a2 = rk2.b.a;
        a.put("SHA-256", a2);
        final HashMap a3 = wl2.a.a;
        final m c = rk2.b.c;
        a3.put("SHA-512", c);
        final HashMap a4 = wl2.a.a;
        final m g = rk2.b.g;
        a4.put("SHAKE128", g);
        final HashMap a5 = wl2.a.a;
        final m h = rk2.b.h;
        a5.put("SHAKE256", h);
        wl2.a.b.put(a2, "SHA-256");
        wl2.a.b.put(c, "SHA-512");
        wl2.a.b.put(g, "SHAKE128");
        wl2.a.b.put(h, "SHAKE256");
    }
    
    public static c a(final m m) {
        if (((q)m).n((q)rk2.b.a)) {
            return (c)new f();
        }
        if (((q)m).n((q)rk2.b.c)) {
            return (c)new h();
        }
        if (((q)m).n((q)rk2.b.g)) {
            return (c)new i(128);
        }
        if (((q)m).n((q)rk2.b.h)) {
            return (c)new i(256);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unrecognized digest OID: ");
        sb.append(m);
        throw new IllegalArgumentException(sb.toString());
    }
}
