// 
// Decompiled by Procyon v0.6.0
// 

package wd2;

public final class g
{
    public final int a;
    public final int b;
    
    public g(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return this.a == g.a && this.b == g.b;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + Integer.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("VideoDimensions(width=");
        t.append(this.a);
        t.append(", height=");
        return d.j(t, this.b, ')');
    }
}
