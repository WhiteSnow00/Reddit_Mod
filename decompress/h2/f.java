// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import yg2.d;
import yg2.e;

public final class f
{
    public static final f d;
    public final float a;
    public final e<Float> b;
    public final int c;
    
    static {
        d = new f(0.0f, (e<Float>)new d(0.0f, 0.0f), 0);
    }
    
    public f(final float a, final e<Float> b, final int c) {
        sg2.e.f((Object)b, "range");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final float a = this.a;
        final f f = (f)o;
        return a == f.a && sg2.e.a((Object)this.b, (Object)f.b) && this.c == f.c;
    }
    
    @Override
    public final int hashCode() {
        return (this.b.hashCode() + Float.hashCode(this.a) * 31) * 31 + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ProgressBarRangeInfo(current=");
        r.append(this.a);
        r.append(", range=");
        r.append(this.b);
        r.append(", steps=");
        return d.l(r, this.c, ')');
    }
}
