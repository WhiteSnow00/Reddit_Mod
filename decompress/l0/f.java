// 
// Decompiled by Procyon v0.6.0
// 

package l0;

public final class f extends i
{
    public float a;
    public final int b;
    
    public f(final float a) {
        this.a = a;
        this.b = 1;
    }
    
    public final float a(final int n) {
        if (n == 0) {
            return this.a;
        }
        return 0.0f;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final i c() {
        return new f(0.0f);
    }
    
    public final void d() {
        this.a = 0.0f;
    }
    
    public final void e(final float a, final int n) {
        if (n == 0) {
            this.a = a;
        }
    }
    
    public final boolean equals(final Object o) {
        final boolean b = o instanceof f;
        boolean b2 = true;
        if (!b || ((f)o).a != this.a) {
            b2 = false;
        }
        return b2;
    }
    
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    public final String toString() {
        final StringBuilder t = a.t("AnimationVector1D: value = ");
        t.append(this.a);
        return t.toString();
    }
}
