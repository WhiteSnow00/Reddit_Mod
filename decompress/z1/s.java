// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import aq2.a;
import n1.c;
import java.util.ArrayList;
import java.util.List;

public final class s
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List<e> i;
    public final long j;
    
    public s() {
        throw null;
    }
    
    public s(final long a, final long b, final long c, final long d, final boolean e, final float f, final int g, final boolean h, final ArrayList i, final long j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s)) {
            return false;
        }
        final s s = (s)o;
        return o.a(this.a, s.a) && this.b == s.b && n1.c.c(this.c, s.c) && n1.c.c(this.d, s.d) && this.e == s.e && ng2.e.a((Object)this.f, (Object)s.f) && this.g == s.g && this.h == s.h && ng2.e.a((Object)this.i, (Object)s.i) && n1.c.c(this.j, s.j);
    }
    
    @Override
    public final int hashCode() {
        final int b = b.b(this.b, Long.hashCode(this.a) * 31, 31);
        final long c = this.c;
        final int e = n1.c.e;
        final int b2 = b.b(this.d, b.b(c, b, 31), 31);
        final int e2 = this.e ? 1 : 0;
        final int n = 1;
        int n2 = e2;
        if (e2 != 0) {
            n2 = 1;
        }
        final int c2 = aq2.a.c(this.g, aq2.a.b(this.f, (b2 + n2) * 31, 31), 31);
        int h = this.h ? 1 : 0;
        if (h != 0) {
            h = n;
        }
        return Long.hashCode(this.j) + ph0.a.b((List)this.i, (c2 + h) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PointerInputEventData(id=");
        t.append((Object)o.b(this.a));
        t.append(", uptime=");
        t.append(this.b);
        t.append(", positionOnScreen=");
        t.append((Object)n1.c.j(this.c));
        t.append(", position=");
        t.append((Object)n1.c.j(this.d));
        t.append(", down=");
        t.append(this.e);
        t.append(", pressure=");
        t.append(this.f);
        t.append(", type=");
        final int g = this.g;
        String s;
        if (g != 1) {
            if (g != 2) {
                if (g != 3) {
                    if (g != 4) {
                        s = "Unknown";
                    }
                    else {
                        s = "Eraser";
                    }
                }
                else {
                    s = "Stylus";
                }
            }
            else {
                s = "Mouse";
            }
        }
        else {
            s = "Touch";
        }
        t.append((Object)s);
        t.append(", issuesEnterExit=");
        t.append(this.h);
        t.append(", historical=");
        t.append(this.i);
        t.append(", scrollDelta=");
        t.append((Object)n1.c.j(this.j));
        t.append(')');
        return t.toString();
    }
}
