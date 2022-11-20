// 
// Decompiled by Procyon v0.6.0
// 

package tb0;

import p1.h;
import ng2.e;

public final class a
{
    public final String a;
    public final String b;
    
    public a(final String a, final String b) {
        this.a = a;
        this.b = b;
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
        return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ContentLanguage(translatedDisplayName=");
        t.append(this.a);
        t.append(", isoCode=");
        return h.c(t, this.b, ')');
    }
}
