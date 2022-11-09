// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import com.google.android.gms.internal.measurement.zzd;
import java.util.List;
import java.util.Collections;
import com.android.billingclient.api.x;
import x6.h;

public final class o0
{
    public final n2 a;
    public h b;
    public final b c;
    public final ha d;
    
    public o0() {
        final n2 a = new n2();
        this.a = a;
        this.b = a.b.a();
        this.c = new b();
        this.d = new ha();
        a.d.a.put("internal.registerCallback", new x(this, 1));
        a.d.a.put("internal.eventLogger", new y(this));
    }
    
    public final void a(final a4 a4) throws zzd {
        try {
            this.b = this.a.b.a();
            if (!(this.a.a(this.b, (c4[])a4.t().toArray(new c4[0])) instanceof g)) {
                for (final z3 z3 : a4.r().u()) {
                    final h6 t = z3.t();
                    final String s = z3.s();
                    final Iterator<Object> iterator2 = t.iterator();
                    while (iterator2.hasNext()) {
                        final o a5 = this.a.a(this.b, iterator2.next());
                        if (!(a5 instanceof l)) {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                        final h b = this.b;
                        i i;
                        if (!b.g(s)) {
                            i = null;
                        }
                        else {
                            final o d = b.d(s);
                            if (!(d instanceof i)) {
                                throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(s)));
                            }
                            i = (i)d;
                        }
                        if (i == null) {
                            throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(s)));
                        }
                        i.h(this.b, (List)Collections.singletonList(a5));
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        }
        finally {
            final Throwable t2;
            throw new zzd(t2);
        }
    }
    
    public final boolean b(final a a) throws zzd {
        try {
            final b c = this.c;
            c.a = a;
            c.b = a.a();
            c.c.clear();
            this.a.c.f("runtime.counter", (o)new ke.h(Double.valueOf(0.0)));
            this.d.a(this.b.a(), this.c);
            final b c2 = this.c;
            return (c2.b.equals(c2.a) ^ true) || (this.c.c.isEmpty() ^ true);
        }
        finally {
            final Throwable t;
            throw new zzd(t);
        }
    }
}
