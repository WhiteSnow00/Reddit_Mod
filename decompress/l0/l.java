// 
// Decompiled by Procyon v0.6.0
// 

package l0;

public final class l implements q
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    public l(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final float a(float b) {
        float n = 0.0f;
        if (b > 0.0f) {
            float n2 = 1.0f;
            if (b < 1.0f) {
                float n3;
                float n4;
                float n5;
                float n6;
                while (true) {
                    n3 = (n + n2) / 2;
                    final float a = this.a;
                    final float c = this.c;
                    n4 = 3;
                    n5 = 1 - n3;
                    n6 = n3 * n3 * n3;
                    final float n7 = c * n4 * n5 * n3 * n3 + a * n4 * n5 * n5 * n3 + n6;
                    if (Math.abs(b - n7) < 0.001f) {
                        break;
                    }
                    if (n7 < b) {
                        n = n3;
                    }
                    else {
                        n2 = n3;
                    }
                }
                b = this.b;
                return n4 * this.d * n5 * n3 * n3 + b * n4 * n5 * n5 * n3 + n6;
            }
        }
        return b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof l;
        boolean b2 = true;
        if (b) {
            final float a = this.a;
            final l l = (l)o;
            if (a == l.a && this.b == l.b && this.c == l.c && this.d == l.d) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + a.a(this.c, a.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
}
