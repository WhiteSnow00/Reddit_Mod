// 
// Decompiled by Procyon v0.6.0
// 

package u72;

import p1.h;
import ng2.e;

public final class a
{
    public final String a;
    public final String b;
    public final String c;
    
    public a(final String a, final String b, final String c) {
        b.w(a, "title", b, "description", c, "buttonText");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b) && e.a((Object)this.c, (Object)a.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + aq2.a.e(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("InfoBottomSheetUiModel(title=");
        t.append(this.a);
        t.append(", description=");
        t.append(this.b);
        t.append(", buttonText=");
        return h.c(t, this.c, ')');
    }
}
