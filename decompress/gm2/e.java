// 
// Decompiled by Procyon v0.6.0
// 

package gm2;

import el2.i;
import el2.h;
import el2.f;
import ok2.q;
import dl2.c;
import ok2.m;
import vk2.b;
import java.util.HashMap;
import bl2.a;

public final class e
{
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final HashMap i;
    
    static {
        final m h2 = zl2.e.h;
        a = new a(h2);
        final m j = zl2.e.i;
        b = new a(j);
        c = new a(vk2.b.f);
        d = new a(vk2.b.e);
        e = new a(vk2.b.a);
        f = new a(vk2.b.c);
        g = new a(vk2.b.g);
        h = new a(vk2.b.h);
        final HashMap k = new HashMap();
        (i = k).put(h2, 5);
        k.put(j, 6);
    }
    
    public static c a(final m m) {
        if (((q)m).n((q)vk2.b.a)) {
            return (c)new f();
        }
        if (((q)m).n((q)vk2.b.c)) {
            return (c)new h();
        }
        if (((q)m).n((q)vk2.b.g)) {
            return (c)new i(128);
        }
        if (((q)m).n((q)vk2.b.h)) {
            return (c)new i(256);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unrecognized digest OID: ");
        sb.append(m);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static a b(final int n) {
        if (n == 5) {
            return gm2.e.a;
        }
        if (n == 6) {
            return gm2.e.b;
        }
        throw new IllegalArgumentException(d.h("unknown security category: ", n));
    }
    
    public static a c(final String s) {
        if (s.equals("SHA3-256")) {
            return gm2.e.c;
        }
        if (s.equals("SHA-512/256")) {
            return gm2.e.d;
        }
        throw new IllegalArgumentException(al0.b.h("unknown tree digest: ", s));
    }
    
    public static String d(final zl2.h h) {
        final a g = h.g;
        if (((q)g.f).n((q)gm2.e.c.f)) {
            return "SHA3-256";
        }
        if (((q)g.f).n((q)gm2.e.d.f)) {
            return "SHA-512/256";
        }
        final StringBuilder r = a.r("unknown tree digest: ");
        r.append(g.f);
        throw new IllegalArgumentException(r.toString());
    }
    
    public static a e(final String s) {
        if (s.equals("SHA-256")) {
            return gm2.e.e;
        }
        if (s.equals("SHA-512")) {
            return gm2.e.f;
        }
        if (s.equals("SHAKE128")) {
            return gm2.e.g;
        }
        if (s.equals("SHAKE256")) {
            return gm2.e.h;
        }
        throw new IllegalArgumentException(al0.b.h("unknown tree digest: ", s));
    }
}
