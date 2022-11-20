// 
// Decompiled by Procyon v0.6.0
// 

package q1;

import o1.o0;
import o1.n0;
import aq2.a;
import ng2.e;

public final class i extends f
{
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    
    public i(float a, float b, int c, int d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            b = 4.0f;
        }
        if ((n & 0x4) != 0x0) {
            c = 0;
        }
        if ((n & 0x8) != 0x0) {
            d = 0;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final float a = this.a;
        final i i = (i)o;
        if (a != i.a) {
            return false;
        }
        if (this.b != i.b) {
            return false;
        }
        if (this.c != i.c) {
            return false;
        }
        if (this.d != i.d) {
            return false;
        }
        i.getClass();
        return e.a((Object)null, (Object)null);
    }
    
    public final int hashCode() {
        return aq2.a.c(this.d, aq2.a.c(this.c, aq2.a.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31) + 0;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("Stroke(width=");
        t.append(this.a);
        t.append(", miter=");
        t.append(this.b);
        t.append(", cap=");
        t.append((Object)n0.a(this.c));
        t.append(", join=");
        t.append((Object)o0.a(this.d));
        t.append(", pathEffect=");
        t.append((Object)null);
        t.append(')');
        return t.toString();
    }
}
