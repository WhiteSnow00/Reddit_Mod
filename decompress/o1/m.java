// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import sg2.e;
import android.graphics.RenderEffect;

public final class m extends g0
{
    public final g0 b;
    public final float c;
    public final float d;
    public final int e;
    
    public m(final float c, final float d, final int e) {
        this.b = null;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final RenderEffect a() {
        return h0.a.a(this.b, this.c, this.d, this.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final float c = this.c;
        final m m = (m)o;
        return c == m.c && this.d == m.d && this.e == m.e && sg2.e.a((Object)this.b, (Object)m.b);
    }
    
    @Override
    public final int hashCode() {
        final g0 b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Integer.hashCode(this.e) + d.d(this.d, d.d(this.c, hashCode * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("BlurEffect(renderEffect=");
        r.append(this.b);
        r.append(", radiusX=");
        r.append(this.c);
        r.append(", radiusY=");
        r.append(this.d);
        r.append(", edgeTreatment=");
        r.append((Object)np.a.f0(this.e));
        r.append(')');
        return r.toString();
    }
}
