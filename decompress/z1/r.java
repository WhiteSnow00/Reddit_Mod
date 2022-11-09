// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import androidx.appcompat.widget.s0;
import ah2.f;
import n1.c;
import java.util.ArrayList;
import java.util.List;

public final class r
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final List<e> h;
    public final long i;
    
    public r() {
        throw null;
    }
    
    public r(final long a, final long b, final long c, final long d, final boolean e, final int f, final boolean g, final ArrayList h, final long i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final r r = (r)o;
        return n.a(this.a, r.a) && this.b == r.b && n1.c.a(this.c, r.c) && n1.c.a(this.d, r.d) && this.e == r.e && this.f == r.f && this.g == r.g && ah2.f.a((Object)this.h, (Object)r.h) && n1.c.a(this.i, r.i);
    }
    
    @Override
    public final int hashCode() {
        final int c = b.c(this.b, Long.hashCode(this.a) * 31, 31);
        final long c2 = this.c;
        final int e = n1.c.e;
        final int c3 = b.c(this.d, b.c(c2, c, 31), 31);
        final int e2 = this.e ? 1 : 0;
        final int n = 1;
        int n2 = e2;
        if (e2 != 0) {
            n2 = 1;
        }
        final int e3 = s0.e(this.f, (c3 + n2) * 31, 31);
        int g = this.g ? 1 : 0;
        if (g != 0) {
            g = n;
        }
        return Long.hashCode(this.i) + a2.b.a((List)this.h, (e3 + g) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PointerInputEventData(id=");
        k.append((Object)n.b(this.a));
        k.append(", uptime=");
        k.append(this.b);
        k.append(", positionOnScreen=");
        k.append((Object)n1.c.h(this.c));
        k.append(", position=");
        k.append((Object)n1.c.h(this.d));
        k.append(", down=");
        k.append(this.e);
        k.append(", type=");
        final int f = this.f;
        String s;
        if (f != 1) {
            if (f != 2) {
                if (f != 3) {
                    if (f != 4) {
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
        k.append((Object)s);
        k.append(", issuesEnterExit=");
        k.append(this.g);
        k.append(", historical=");
        k.append(this.h);
        k.append(", scrollDelta=");
        k.append((Object)n1.c.h(this.i));
        k.append(')');
        return k.toString();
    }
}
