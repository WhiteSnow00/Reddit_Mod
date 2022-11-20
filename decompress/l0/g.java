// 
// Decompiled by Procyon v0.6.0
// 

package l0;

public final class g extends i
{
    public float a;
    public float b;
    public final int c;
    
    public g(final float a, final float b) {
        this.a = a;
        this.b = b;
        this.c = 2;
    }
    
    public final float a(final int n) {
        float n2;
        if (n != 0) {
            if (n != 1) {
                n2 = 0.0f;
            }
            else {
                n2 = this.b;
            }
        }
        else {
            n2 = this.a;
        }
        return n2;
    }
    
    public final int b() {
        return this.c;
    }
    
    public final i c() {
        return new g(0.0f, 0.0f);
    }
    
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }
    
    public final void e(final float n, final int n2) {
        if (n2 != 0) {
            if (n2 == 1) {
                this.b = n;
            }
        }
        else {
            this.a = n;
        }
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof g;
        boolean b2 = true;
        if (b) {
            final g g = (g)o;
            if (g.a == this.a && g.b == this.b) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    public final String toString() {
        final StringBuilder t = a.t("AnimationVector2D: v1 = ");
        t.append(this.a);
        t.append(", v2 = ");
        t.append(this.b);
        return t.toString();
    }
}
