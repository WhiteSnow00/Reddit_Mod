// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import aq2.a;

public final class h extends i
{
    public float a;
    public float b;
    public float c;
    public float d;
    public final int e;
    
    public h(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = 4;
    }
    
    public final float a(final int n) {
        float n2;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        n2 = 0.0f;
                    }
                    else {
                        n2 = this.d;
                    }
                }
                else {
                    n2 = this.c;
                }
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
        return this.e;
    }
    
    public final i c() {
        return new h(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public final void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }
    
    public final void e(final float n, final int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        this.d = n;
                    }
                }
                else {
                    this.c = n;
                }
            }
            else {
                this.b = n;
            }
        }
        else {
            this.a = n;
        }
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof h;
        boolean b2 = true;
        if (b) {
            final h h = (h)o;
            if (h.a == this.a && h.b == this.b && h.c == this.c && h.d == this.d) {
                return b2;
            }
        }
        b2 = false;
        return b2;
    }
    
    public final int hashCode() {
        return Float.hashCode(this.d) + aq2.a.b(this.c, aq2.a.b(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
    
    public final String toString() {
        final StringBuilder t = a.t("AnimationVector4D: v1 = ");
        t.append(this.a);
        t.append(", v2 = ");
        t.append(this.b);
        t.append(", v3 = ");
        t.append(this.c);
        t.append(", v4 = ");
        t.append(this.d);
        return t.toString();
    }
}
