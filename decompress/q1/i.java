// 
// Decompiled by Procyon v0.6.0
// 

package q1;

import o1.o0;
import o1.n0;
import androidx.appcompat.widget.s0;

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
    
    @Override
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
        return ah2.f.a((Object)null, (Object)null);
    }
    
    @Override
    public final int hashCode() {
        return s0.e(this.d, s0.e(this.c, a.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31) + 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Stroke(width=");
        k.append(this.a);
        k.append(", miter=");
        k.append(this.b);
        k.append(", cap=");
        k.append((Object)n0.a(this.c));
        k.append(", join=");
        k.append((Object)o0.a(this.d));
        k.append(", pathEffect=");
        k.append((Object)null);
        k.append(')');
        return k.toString();
    }
}
