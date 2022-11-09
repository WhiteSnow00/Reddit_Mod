// 
// Decompiled by Procyon v0.6.0
// 

package re;

import j0.i;
import u5.w;
import ke.g2;
import java.util.Iterator;
import java.io.Serializable;
import ke.i3;
import java.util.HashSet;
import java.math.BigDecimal;
import ke.d2;
import android.util.Log;
import com.google.android.gms.internal.measurement.o;
import ke.e3;
import ke.b2;

public final class v7 extends w7
{
    public final b2 g;
    public final /* synthetic */ b h;
    
    public v7(final b h, final String s, final int n, final b2 g) {
        this.h = h;
        super(s, n);
        this.g = g;
    }
    
    public final int a() {
        return this.g.s();
    }
    
    public final boolean b() {
        return this.g.E();
    }
    
    public final boolean c() {
        return false;
    }
    
    public final boolean g(Long value, Long n, e3 e3, long n2, final p p5, boolean b) {
        o.a();
        final boolean h = ((h4)((w)this.h).f).l.H(super.a, q2.W);
        if (this.g.D()) {
            n2 = p5.e;
        }
        final boolean loggable = Log.isLoggable(((h4)((w)this.h).f).f().K(), 2);
        Serializable true = "null";
        Object o = null;
        if (loggable) {
            final a3 s = ((h4)((w)this.h).f).f().s;
            final int b2 = super.b;
            Integer value2;
            if (this.g.F()) {
                value2 = this.g.s();
            }
            else {
                value2 = null;
            }
            s.d(b2, "Evaluating filter. audience, filter, event", value2, ((h4)((w)this.h).f).r.d(this.g.x()));
            final Object o2 = ((h4)((w)this.h).f).f().s;
            final Object o3 = ((a7)this.h).g.l;
            g7.H((b7)o3);
            final b2 g = this.g;
            String string;
            if (g == null) {
                string = "null";
            }
            else {
                final StringBuilder k = a.k("\nevent_filter {\n");
                if (g.F()) {
                    i7.J(k, 0, "filter_id", (Object)g.s());
                }
                i7.J(k, 0, "event_name", (Object)((h4)((w)o3).f).r.d(g.x()));
                final String h2 = i7.H(g.B(), g.C(), g.D());
                if (!h2.isEmpty()) {
                    i7.J(k, 0, "filter_type", (Object)h2);
                }
                if (g.E()) {
                    i7.K(k, 1, "event_count_filter", g.w());
                }
                if (g.r() > 0) {
                    k.append("  filters {\n");
                    final Iterator<Object> iterator = g.y().iterator();
                    while (iterator.hasNext()) {
                        ((i7)o3).F(k, 2, (d2)iterator.next());
                    }
                }
                i7.G(1, k);
                k.append("}\n}\n");
                string = k.toString();
            }
            ((a3)o2).b(string, "Filter definition");
        }
        Label_2025: {
            if (!this.g.F() || this.g.s() > 256) {
                break Label_2025;
            }
            final boolean b3 = this.g.B();
            final boolean c = this.g.C();
            final boolean d = this.g.D();
            int b2;
            if (!b3 && !c && !d) {
                b2 = 0;
            }
            else {
                b2 = 1;
            }
            if (b && b2 == 0) {
                final a3 s2 = ((h4)((w)this.h).f).f().s;
                final int b4 = super.b;
                Object value3 = o;
                if (this.g.F()) {
                    value3 = this.g.s();
                }
                s2.c(b4, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", value3);
                return true;
            }
            Object o3 = this.g;
            o = e3.y();
        Label_1850:
            while (true) {
            Label_1035_Outer:
                while (true) {
                    if (((b2)o3).E()) {
                        final g2 w = ((b2)o3).w();
                        Boolean d2;
                        try {
                            final Object o2 = new BigDecimal(n2);
                            d2 = w7.d((BigDecimal)o2, w, 0.0);
                        }
                        catch (final NumberFormatException ex) {
                            d2 = null;
                        }
                        if (d2 == null) {
                            break Label_1850;
                        }
                        if (!d2) {
                            final Boolean b5 = Boolean.FALSE;
                            break Label_1861;
                        }
                    }
                    final HashSet<String> set = new HashSet<String>();
                    Object o2 = ((b2)o3).y().iterator();
                    while (((Iterator)o2).hasNext()) {
                        final d2 d3 = ((Iterator<d2>)o2).next();
                        if (d3.v().isEmpty()) {
                            ((h4)((w)this.h).f).f().n.b(((h4)((w)this.h).f).r.d((String)o), "null or empty param name in filter. event");
                            break Label_1850;
                        }
                        set.add(d3.v());
                    }
                    o2 = new j0.b();
                    for (final i3 i3 : e3.z()) {
                        if (set.contains(i3.x())) {
                            if (i3.M()) {
                                final String x = i3.x();
                                Long value4;
                                if (i3.M()) {
                                    value4 = i3.u();
                                }
                                else {
                                    value4 = null;
                                }
                                ((i)o2).put((Object)x, (Object)value4);
                            }
                            else if (i3.K()) {
                                final String x2 = i3.x();
                                Double value5;
                                if (i3.K()) {
                                    value5 = i3.r();
                                }
                                else {
                                    value5 = null;
                                }
                                ((i)o2).put((Object)x2, (Object)value5);
                            }
                            else {
                                if (!i3.O()) {
                                    ((h4)((w)this.h).f).f().n.c(((h4)((w)this.h).f).r.d((String)o), "Unknown value for param. event, param", ((h4)((w)this.h).f).r.e(i3.x()));
                                    break Label_1850;
                                }
                                ((i)o2).put((Object)i3.x(), (Object)i3.y());
                            }
                        }
                    }
                    o3 = ((b2)o3).y().iterator();
                Label_1570_Outer:
                    while (true) {
                        Label_1856: {
                            if (!((Iterator)o3).hasNext()) {
                                break Label_1856;
                            }
                            final d2 d4 = (d2)((Iterator)o3).next();
                            if (d4.y() && d4.x()) {
                                b = true;
                            }
                            else {
                                b = false;
                            }
                            final String v = d4.v();
                            if (v.isEmpty()) {
                                ((h4)((w)this.h).f).f().n.b(((h4)((w)this.h).f).r.d((String)o), "Event has empty param name. event");
                                break Label_1850;
                            }
                            final Object orDefault = ((i)o2).getOrDefault((Object)v, (Object)null);
                        Label_1567_Outer:
                            while (true) {
                            Label_2076_Outer:
                                while (true) {
                                    String s3;
                                    g2 t3;
                                    if (orDefault instanceof Long) {
                                        if (!d4.z()) {
                                            ((h4)((w)this.h).f).f().n.c(((h4)((w)this.h).f).r.d((String)o), "No number filter for long param. event, param", ((h4)((w)this.h).f).r.e(v));
                                            break Label_1850;
                                        }
                                        n2 = (long)orDefault;
                                        final g2 t = d4.t();
                                        Boolean d5;
                                        try {
                                            d5 = w7.d(new BigDecimal(n2), t, 0.0);
                                        }
                                        catch (final NumberFormatException ex2) {
                                            d5 = null;
                                        }
                                        if (d5 == null) {
                                            break Label_1850;
                                        }
                                        if (d5 == b) {
                                            final Boolean b5 = Boolean.FALSE;
                                            break Label_1861;
                                        }
                                        break Label_1567_Outer;
                                    }
                                    else if (orDefault instanceof Double) {
                                        if (!d4.z()) {
                                            ((h4)((w)this.h).f).f().n.c(((h4)((w)this.h).f).r.d((String)o), "No number filter for double param. event, param", ((h4)((w)this.h).f).r.e(v));
                                            break Label_1850;
                                        }
                                        final double doubleValue = (double)orDefault;
                                        final g2 t2 = d4.t();
                                        Boolean d6;
                                        try {
                                            d6 = w7.d(new BigDecimal(doubleValue), t2, Math.ulp(doubleValue));
                                        }
                                        catch (final NumberFormatException ex3) {
                                            d6 = null;
                                        }
                                        if (d6 == null) {
                                            break Label_1850;
                                        }
                                        if (d6 == b) {
                                            final Boolean b5 = Boolean.FALSE;
                                            break Label_1861;
                                        }
                                        break Label_1567_Outer;
                                    }
                                    else {
                                        if (!(orDefault instanceof String)) {
                                            break Label_1567_Outer;
                                        }
                                        if (d4.B()) {
                                            final Boolean b6 = w7.e((String)orDefault, d4.u(), ((h4)((w)this.h).f).f());
                                            break Label_1570;
                                        }
                                        if (!d4.z()) {
                                            break Label_2076_Outer;
                                        }
                                        s3 = (String)orDefault;
                                        if (!i7.Z(s3)) {
                                            break Label_2076_Outer;
                                        }
                                        t3 = d4.t();
                                        if (!i7.Z(s3)) {
                                            break Label_1567;
                                        }
                                    }
                                    try {
                                        Boolean b6 = w7.d(new BigDecimal(s3), t3, 0.0);
                                        Boolean b5;
                                        if (b6 == null) {
                                            b5 = null;
                                        }
                                        else {
                                            if (b6 != b) {
                                                continue Label_1570_Outer;
                                            }
                                            b5 = Boolean.FALSE;
                                        }
                                        o = ((h4)((w)this.h).f).f().s;
                                        if (b5 != null) {
                                            true = b5;
                                        }
                                        ((a3)o).b(true, "Event filter result");
                                        if (b5 == null) {
                                            return false;
                                        }
                                        true = Boolean.TRUE;
                                        super.c = (Boolean)true;
                                        if (!b5) {
                                            return true;
                                        }
                                        super.d = (Boolean)true;
                                        if (b2 != 0 && e3.K()) {
                                            e3 = (e3)Long.valueOf(e3.u());
                                            if (this.g.C()) {
                                                n = (Long)e3;
                                                if (h) {
                                                    if (!this.g.E()) {
                                                        n = (Long)e3;
                                                    }
                                                    else {
                                                        n = (Long)value;
                                                    }
                                                }
                                                super.f = n;
                                            }
                                            else {
                                                value = e3;
                                                if (h) {
                                                    value = e3;
                                                    if (this.g.E()) {
                                                        value = n;
                                                    }
                                                }
                                                super.e = (Long)value;
                                            }
                                        }
                                        return true;
                                    Label_2076:
                                        while (true) {
                                            Block_59: {
                                                while (true) {
                                                    value = this.g.s();
                                                    break Label_2076;
                                                    iftrue(Label_1792:)(orDefault != null);
                                                    break Block_59;
                                                    ((h4)((w)this.h).f).f().n.c(((h4)((w)this.h).f).r.d((String)o), "No filter for String param. event, param", ((h4)((w)this.h).f).r.e(v));
                                                    continue Label_1850;
                                                    ((a3)n).c(e3, "Invalid event filter ID. appId, id", String.valueOf(value));
                                                    return false;
                                                    n = (Long)((h4)((w)this.h).f).f().n;
                                                    e3 = (e3)c3.H(super.a);
                                                    iftrue(Label_2074:)(!this.g.F());
                                                    continue Label_2076_Outer;
                                                }
                                                ((h4)((w)this.h).f).f().n.c(((h4)((w)this.h).f).r.d((String)o), "Invalid param value for number filter. event, param", ((h4)((w)this.h).f).r.e(v));
                                                continue Label_1850;
                                            }
                                            ((h4)((w)this.h).f).f().s.c(((h4)((w)this.h).f).r.d((String)o), "Missing param for filter. event, param", ((h4)((w)this.h).f).r.e(v));
                                            b5 = Boolean.FALSE;
                                            continue Label_1035_Outer;
                                            b6 = null;
                                            continue Label_1567_Outer;
                                            b5 = Boolean.TRUE;
                                            continue Label_1035_Outer;
                                            Label_2074: {
                                                value = null;
                                            }
                                            continue Label_2076;
                                        }
                                        Label_1792: {
                                            ((h4)((w)this.h).f).f().n.c(((h4)((w)this.h).f).r.d((String)o), "Unknown param type. event, param", ((h4)((w)this.h).f).r.e(v));
                                        }
                                        continue Label_1850;
                                    }
                                    catch (final NumberFormatException ex4) {
                                        continue;
                                    }
                                    break;
                                }
                                break;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
        }
    }
}
