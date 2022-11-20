// 
// Decompiled by Procyon v0.6.0
// 

package p1;

import ng2.e;

public final class j
{
    public final float a;
    public final float b;
    
    public j(final float a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public final float[] a() {
        final float a = this.a;
        final float b = this.b;
        return new float[] { a / b, 1.0f, (1.0f - a - b) / b };
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        return e.a((Object)this.a, (Object)j.a) && e.a((Object)this.b, (Object)j.b);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + Float.hashCode(this.a) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("WhitePoint(x=");
        t.append(this.a);
        t.append(", y=");
        return aq2.a.n(t, this.b, ')');
    }
}
