// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import kotlin.collections.EmptyList;
import n1.c;
import java.util.List;

public final class p
{
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;
    public final int h;
    public final long i;
    public Float j;
    public List<e> k;
    public d l;
    
    public p() {
        throw null;
    }
    
    public p(final long n, final long n2, final long n3, final boolean b, final float n4, final long n5, final long n6, final boolean b2, final int n7, final List k, final long n8) {
        this(n, n2, n3, b, n4, n5, n6, b2, false, n7, n8);
        this.k = k;
    }
    
    public p(final long a, final long b, final long c, final boolean d, final float n, final long e, final long f, final boolean g, final boolean b2, final int h, final long i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.l = new d(b2, b2);
        this.j = n;
    }
    
    public final void a() {
        final d l = this.l;
        l.b = true;
        l.a = true;
    }
    
    public final boolean b() {
        final d l = this.l;
        return l.b || l.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PointerInputChange(id=");
        t.append((Object)o.b(this.a));
        t.append(", uptimeMillis=");
        t.append(this.b);
        t.append(", position=");
        t.append((Object)n1.c.j(this.c));
        t.append(", pressed=");
        t.append(this.d);
        t.append(", pressure=");
        final Float j = this.j;
        float floatValue;
        if (j != null) {
            floatValue = j;
        }
        else {
            floatValue = 0.0f;
        }
        t.append(floatValue);
        t.append(", previousUptimeMillis=");
        t.append(this.e);
        t.append(", previousPosition=");
        t.append((Object)n1.c.j(this.f));
        t.append(", previousPressed=");
        t.append(this.g);
        t.append(", isConsumed=");
        t.append(this.b());
        t.append(", type=");
        final int h = this.h;
        String s;
        if (h != 1) {
            if (h != 2) {
                if (h != 3) {
                    if (h != 4) {
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
        t.append(", historical=");
        Object o;
        if ((o = this.k) == null) {
            o = EmptyList.INSTANCE;
        }
        t.append(o);
        t.append(",scrollDelta=");
        t.append((Object)n1.c.j(this.i));
        t.append(')');
        return t.toString();
    }
}
