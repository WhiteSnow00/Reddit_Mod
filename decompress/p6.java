// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import x6.h;

public final class p6 extends l
{
    public final b g;
    
    public p6(final b g) {
        this.g = g;
    }
    
    public final o f(String s, final h h, final ArrayList list) {
        int n = 0;
        Label_0160: {
            switch (s.hashCode()) {
                case 1570616835: {
                    if (s.equals("setEventName")) {
                        n = 4;
                        break Label_0160;
                    }
                    break;
                }
                case 920706790: {
                    if (s.equals("setParamValue")) {
                        n = 5;
                        break Label_0160;
                    }
                    break;
                }
                case 700587132: {
                    if (s.equals("getParams")) {
                        n = 2;
                        break Label_0160;
                    }
                    break;
                }
                case 146575578: {
                    if (s.equals("getParamValue")) {
                        n = 1;
                        break Label_0160;
                    }
                    break;
                }
                case 45521504: {
                    if (s.equals("getTimestamp")) {
                        n = 3;
                        break Label_0160;
                    }
                    break;
                }
                case 21624207: {
                    if (s.equals("getEventName")) {
                        n = 0;
                        break Label_0160;
                    }
                    break;
                }
            }
            n = -1;
        }
        if (n == 0) {
            f4.h("getEventName", 0, list);
            return (o)new s(this.g.b.a);
        }
        if (n == 1) {
            f4.h("getParamValue", 1, list);
            s = h.b(list.get(0)).c();
            final a b = this.g.b;
            Object value;
            if (b.c.containsKey(s)) {
                value = b.c.get(s);
            }
            else {
                value = null;
            }
            return x4.b(value);
        }
        if (n == 2) {
            f4.h("getParams", 0, list);
            final HashMap c = this.g.b.c;
            final l l = new l();
            for (final String s2 : c.keySet()) {
                l.a(s2, x4.b(c.get(s2)));
            }
            return (o)l;
        }
        if (n == 3) {
            f4.h("getTimestamp", 0, list);
            return (o)new ke.h(Double.valueOf(this.g.b.b));
        }
        if (n != 4) {
            if (n != 5) {
                return super.f(s, h, list);
            }
            f4.h("setParamValue", 2, list);
            s = h.b(list.get(0)).c();
            final o b2 = h.b(list.get(1));
            final a b3 = this.g.b;
            final Object f = f4.f(b2);
            if (f == null) {
                b3.c.remove(s);
            }
            else {
                b3.c.put(s, f);
            }
            return b2;
        }
        else {
            f4.h("setEventName", 1, list);
            final o b4 = h.b(list.get(0));
            if (!o.f3.equals((Object)b4) && !o.g3.equals((Object)b4)) {
                this.g.b.a = b4.c();
                return (o)new s(b4.c());
            }
            throw new IllegalArgumentException("Illegal event name");
        }
    }
}
