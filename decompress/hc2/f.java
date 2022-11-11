// 
// Decompiled by Procyon v0.6.0
// 

package hc2;

import java.util.Locale;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Currency;
import java.util.UUID;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.BitSet;
import android.support.v4.media.c;
import fc2.l;

public final class f
{
    public static final j A;
    public static final f$w B;
    public static final g a;
    public static final g b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final g g;
    public static final g h;
    public static final g i;
    public static final f$b j;
    public static final g k;
    public static final h l;
    public static final f$h m;
    public static final f$i n;
    public static final g o;
    public static final g p;
    public static final g q;
    public static final g r;
    public static final g s;
    public static final j t;
    public static final g u;
    public static final g v;
    public static final f$r w;
    public static final i x;
    public static final g y;
    public static final f$u z;
    
    static {
        a = new g(Class.class, (c)new l((c)new f$k()));
        b = new g(BitSet.class, (c)new l((c)new f$v()));
        c = new h(Boolean.TYPE, Boolean.class, (c)new f$y());
        d = new h(Byte.TYPE, Byte.class, (c)new f$z());
        e = new h(Short.TYPE, Short.class, (c)new f$a0());
        f = new h(Integer.TYPE, Integer.class, (c)new f$b0());
        g = new g(AtomicInteger.class, (c)new l((c)new f$c0()));
        h = new g(AtomicBoolean.class, (c)new l((c)new f$d0()));
        i = new g(AtomicIntegerArray.class, (c)new l((c)new f$a()));
        j = new f$b();
        new f$c();
        new f$d();
        k = new g(Number.class, (c)new f$e());
        l = new h(Character.TYPE, Character.class, (c)new f$f());
        final f$g f$g = new f$g();
        m = new f$h();
        n = new f$i();
        o = new g(String.class, (c)f$g);
        p = new g(StringBuilder.class, (c)new f$j());
        q = new g(StringBuffer.class, (c)new f$l());
        r = new g(URL.class, (c)new f$m());
        s = new g(URI.class, (c)new f$n());
        t = new j(InetAddress.class, (c)new f$o());
        u = new g(UUID.class, (c)new f$p());
        v = new g(Currency.class, (c)new l((c)new f$q()));
        w = new Object() {};
        x = new i(Calendar.class, GregorianCalendar.class, new f$s());
        y = new g(Locale.class, (c)new f$t());
        A = new j(fc2.g.class, (c)(z = new f$u()));
        B = new Object() {};
    }
}
