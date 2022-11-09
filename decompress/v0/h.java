// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import o2.i;
import n02.r;
import androidx.appcompat.widget.s0;

public final class h
{
    public static final h e;
    public final int a;
    public final boolean b;
    public final int c;
    public final int d;
    
    static {
        e = new h(0, 0, 0, 15);
    }
    
    public h(int a, int c, int d, final int n) {
        boolean b = false;
        if ((n & 0x1) != 0x0) {
            a = 0;
        }
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        if ((n & 0x4) != 0x0) {
            c = 1;
        }
        if ((n & 0x8) != 0x0) {
            d = 1;
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final int a = this.a;
        final h h = (h)o;
        return a == h.a && this.b == h.b && this.c == h.c && this.d == h.d;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + s0.e(this.c, (Boolean.hashCode(this.b) + Integer.hashCode(this.a) * 31) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("KeyboardOptions(capitalization=");
        k.append((Object)r.r0(this.a));
        k.append(", autoCorrect=");
        k.append(this.b);
        k.append(", keyboardType=");
        k.append((Object)yl.a.y1(this.c));
        k.append(", imeAction=");
        k.append((Object)i.a(this.d));
        k.append(')');
        return k.toString();
    }
}
