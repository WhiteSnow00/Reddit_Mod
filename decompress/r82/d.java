// 
// Decompiled by Procyon v0.6.0
// 

package r82;

import ng2.e;

public final class d
{
    public final CharSequence a;
    public final CharSequence b;
    
    public d(final String a, final String b) {
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
        return e.a((Object)this.a, (Object)d.a) && e.a((Object)this.b, (Object)d.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ClaimCtaCopy(title=");
        t.append((Object)this.a);
        t.append(", body=");
        t.append((Object)this.b);
        t.append(')');
        return t.toString();
    }
}
