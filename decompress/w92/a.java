// 
// Decompiled by Procyon v0.6.0
// 

package w92;

import p1.h;
import ng2.e;

public final class a
{
    public final int a;
    public final int b;
    public final String c;
    
    public a(final int a, final int b, final String c) {
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
        return this.a == a.a && this.b == a.b && e.a((Object)this.c, (Object)a.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + aq2.a.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("EducationalItemUiModel(title=");
        t.append(this.a);
        t.append(", description=");
        t.append(this.b);
        t.append(", imageUrl=");
        return h.c(t, this.c, ')');
    }
}
