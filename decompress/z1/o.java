// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import kotlin.collections.EmptyList;
import n1.c;
import java.util.List;

public final class o
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
    public List<e> j;
    public d k;
    
    public o() {
        throw null;
    }
    
    public o(final long n, final long n2, final long n3, final boolean b, final long n4, final long n5, final boolean b2, final int n6, final List j, final long n7) {
        this(n, n2, n3, b, n4, n5, b2, false, n6, n7);
        this.j = j;
    }
    
    public o(final long a, final long b, final long c, final boolean d, final long e, final long f, final boolean g, final boolean b2, final int h, final long i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = new d(b2, b2);
    }
    
    public final void a() {
        final d k = this.k;
        k.b = true;
        k.a = true;
    }
    
    public final boolean b() {
        final d k = this.k;
        return k.b || k.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PointerInputChange(id=");
        k.append((Object)n.b(this.a));
        k.append(", uptimeMillis=");
        k.append(this.b);
        k.append(", position=");
        k.append((Object)n1.c.h(this.c));
        k.append(", pressed=");
        k.append(this.d);
        k.append(", previousUptimeMillis=");
        k.append(this.e);
        k.append(", previousPosition=");
        k.append((Object)n1.c.h(this.f));
        k.append(", previousPressed=");
        k.append(this.g);
        k.append(", isConsumed=");
        k.append(this.b());
        k.append(", type=");
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
        k.append((Object)s);
        k.append(", historical=");
        Object o;
        if ((o = this.j) == null) {
            o = EmptyList.INSTANCE;
        }
        k.append(o);
        k.append(",scrollDelta=");
        k.append((Object)n1.c.h(this.i));
        k.append(')');
        return k.toString();
    }
}
