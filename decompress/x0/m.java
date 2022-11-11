// 
// Decompiled by Procyon v0.6.0
// 

package x0;

public final class m
{
    public final float a;
    public final float b;
    public final float c;
    
    public m(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final float a = this.a;
        final m m = (m)o;
        return a == m.a && this.b == m.b && this.c == m.c;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.c) + d.d(this.b, Float.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ResistanceConfig(basis=");
        r.append(this.a);
        r.append(", factorAtMin=");
        r.append(this.b);
        r.append(", factorAtMax=");
        return b.h(r, this.c, ')');
    }
}
