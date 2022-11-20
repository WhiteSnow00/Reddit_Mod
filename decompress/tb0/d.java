// 
// Decompiled by Procyon v0.6.0
// 

package tb0;

import ng2.e;

public final class d
{
    public final a a;
    public final boolean b;
    
    public d(final a a, final boolean b) {
        e.f((Object)a, "language");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return e.a((Object)this.a, (Object)d.a) && this.b == d.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("SelectableLanguage(language=");
        t.append(this.a);
        t.append(", isSelected=");
        return d.n(t, this.b, ')');
    }
}
