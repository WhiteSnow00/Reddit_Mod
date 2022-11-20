// 
// Decompiled by Procyon v0.6.0
// 

package nb2;

import aq2.a;
import ng2.e;

public final class c
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    
    public c(final float a, final float b, final float c, final float d, final float e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return ng2.e.a((Object)this.a, (Object)c.a) && ng2.e.a((Object)this.b, (Object)c.b) && ng2.e.a((Object)this.c, (Object)c.c) && ng2.e.a((Object)this.d, (Object)c.d) && ng2.e.a((Object)this.e, (Object)c.e);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.e) + aq2.a.b(this.d, aq2.a.b(this.c, aq2.a.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("BubbleParams(translationYMin=");
        t.append(this.a);
        t.append(", translationYMax=");
        t.append(this.b);
        t.append(", translationXMin=");
        t.append(this.c);
        t.append(", translationXMax=");
        t.append(this.d);
        t.append(", scale=");
        return aq2.a.n(t, this.e, ')');
    }
}
