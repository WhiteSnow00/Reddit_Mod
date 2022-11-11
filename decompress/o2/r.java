// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import lg.e0;
import sg2.e;

public final class r implements d
{
    public final int a;
    public final int b;
    
    public r(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final f f) {
        e.f((Object)f, "buffer");
        if (f.d != -1) {
            f.d = -1;
            f.e = -1;
        }
        final int v = e0.v(this.a, 0, f.c());
        final int v2 = e0.v(this.b, 0, f.c());
        if (v != v2) {
            if (v < v2) {
                f.e(v, v2);
            }
            else {
                f.e(v2, v);
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof r)) {
            return false;
        }
        final int a = this.a;
        final r r = (r)o;
        return a == r.a && this.b == r.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SetComposingRegionCommand(start=");
        r.append(this.a);
        r.append(", end=");
        return d.l(r, this.b, ')');
    }
}
