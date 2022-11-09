// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import a4.u1;
import ah2.f;
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
    
    public final RenderEffect a() {
        return h0.a.a(this.b, this.c, this.d, this.e);
    }
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final float c = this.c;
        final m m = (m)o;
        return c == m.c && this.d == m.d && this.e == m.e && f.a((Object)this.b, (Object)m.b);
    }
    
    public final int hashCode() {
        final g0 b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return Integer.hashCode(this.e) + a.a(this.d, a.a(this.c, hashCode * 31, 31), 31);
    }
    
    public final String toString() {
        final StringBuilder k = a.k("BlurEffect(renderEffect=");
        k.append(this.b);
        k.append(", radiusX=");
        k.append(this.c);
        k.append(", radiusY=");
        k.append(this.d);
        k.append(", edgeTreatment=");
        k.append((Object)u1.B1(this.e));
        k.append(')');
        return k.toString();
    }
}
