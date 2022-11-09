// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.List;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import com.google.android.gms.internal.measurement.zzbl;
import x6.h;

public final class f4
{
    public static double a(final double n) {
        if (Double.isNaN(n)) {
            return 0.0;
        }
        double n2 = n;
        if (!Double.isInfinite(n)) {
            final double n3 = dcmpl(n, 0.0);
            n2 = n;
            if (n3 != 0) {
                if (n3 == 0) {
                    n2 = n;
                }
                else {
                    int n4;
                    if (n3 > 0) {
                        n4 = 1;
                    }
                    else {
                        n4 = -1;
                    }
                    n2 = Math.floor(Math.abs(n)) * n4;
                }
            }
        }
        return n2;
    }
    
    public static int b(final double n) {
        if (!Double.isNaN(n) && !Double.isInfinite(n)) {
            final double n2 = dcmpl(n, 0.0);
            if (n2 != 0) {
                int n3;
                if (n2 > 0) {
                    n3 = 1;
                }
                else {
                    n3 = -1;
                }
                return (int)(Math.floor(Math.abs(n)) * n3 % 4.294967296E9);
            }
        }
        return 0;
    }
    
    public static void c(final h h) {
        final int b = b(h.d("runtime.counter").v() + 1.0);
        if (b <= 1000000) {
            h.f("runtime.counter", (o)new ke.h(Double.valueOf(b)));
            return;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }
    
    public static long d(final double n) {
        return (long)b(n) & 0xFFFFFFFFL;
    }
    
    public static zzbl e(final String s) {
        zzbl zza;
        final zzbl zzbl = zza = null;
        if (s != null) {
            zza = zzbl;
            if (!s.isEmpty()) {
                zza = com.google.android.gms.internal.measurement.zzbl.zza(Integer.parseInt(s));
            }
        }
        if (zza != null) {
            return zza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", s));
    }
    
    public static Object f(final o o) {
        if (o.g3.equals((Object)o)) {
            return null;
        }
        if (o.f3.equals((Object)o)) {
            return "";
        }
        if (o instanceof l) {
            return g((l)o);
        }
        if (o instanceof e) {
            final ArrayList list = new ArrayList();
            final e e = (e)o;
            e.getClass();
            final d d = new d(e);
            while (d.hasNext()) {
                final Object f = f((o)d.next());
                if (f != null) {
                    list.add(f);
                }
            }
            return list;
        }
        if (!o.v().isNaN()) {
            return o.v();
        }
        return o.c();
    }
    
    public static HashMap g(final l l) {
        final HashMap hashMap = new HashMap();
        l.getClass();
        for (final String s : new ArrayList(l.f.keySet())) {
            final Object f = f(l.b(s));
            if (f != null) {
                hashMap.put(s, f);
            }
        }
        return hashMap;
    }
    
    public static void h(final String s, final int n, final List list) {
        if (list.size() == n) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", s, n, list.size()));
    }
    
    public static void i(final String s, final int n, final List list) {
        if (list.size() >= n) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", s, n, list.size()));
    }
    
    public static void j(final String s, final int n, final ArrayList list) {
        if (list.size() <= n) {
            return;
        }
        throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", s, n, list.size()));
    }
    
    public static boolean k(final o o) {
        if (o == null) {
            return false;
        }
        final Double v = o.v();
        return !v.isNaN() && v >= 0.0 && v.equals(Math.floor(v));
    }
    
    public static boolean l(final o o, final o o2) {
        if (!o.getClass().equals(o2.getClass())) {
            return false;
        }
        if (o instanceof t || o instanceof m) {
            return true;
        }
        if (o instanceof ke.h) {
            return !Double.isNaN(o.v()) && !Double.isNaN(o2.v()) && o.v().equals(o2.v());
        }
        if (o instanceof s) {
            return o.c().equals(o2.c());
        }
        if (o instanceof f) {
            return o.d().equals(o2.d());
        }
        return o == o2;
    }
}
