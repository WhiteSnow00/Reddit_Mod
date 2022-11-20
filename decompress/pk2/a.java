// 
// Decompiled by Procyon v0.6.0
// 

package pk2;

import java.math.BigInteger;
import kk2.m;
import nm2.h;
import java.util.Hashtable;

public final class a
{
    public static a$a a;
    public static a$b b;
    public static final Hashtable c;
    public static final Hashtable d;
    
    static {
        pk2.a.a = new a$a();
        pk2.a.b = new a$b();
        final Hashtable hashtable = c = new Hashtable();
        final Hashtable hashtable2 = d = new Hashtable();
        final Hashtable hashtable3 = new Hashtable();
        final m b = pk2.b.b;
        final a$b b2 = pk2.a.b;
        hashtable.put(h.c("wapip192v1"), b);
        hashtable3.put(b, "wapip192v1");
        hashtable2.put(b, b2);
        final m a = pk2.b.a;
        final a$a a2 = pk2.a.a;
        hashtable.put(h.c("sm2p256v1"), a);
        hashtable3.put(a, "sm2p256v1");
        hashtable2.put(a, a2);
    }
    
    public static BigInteger a(final String s) {
        return new BigInteger(1, om2.a.a(s));
    }
}
