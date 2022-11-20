// 
// Decompiled by Procyon v0.6.0
// 

package t2;

public final class i
{
    public static final i c;
    public final float a;
    public final float b;
    
    static {
        c = new i(1.0f, 0.0f);
    }
    
    public i() {
        this(1.0f, 0.0f);
    }
    
    public i(final float a, final float b) {
        this.a = a;
        this.b = b;
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
        return a == i.a && this.b == i.b;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("TextGeometricTransform(scaleX=");
        t.append(this.a);
        t.append(", skewX=");
        return aq2.a.n(t, this.b, ')');
    }
}
