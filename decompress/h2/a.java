// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import sg2.e;
import hg2.d;

public final class a<T extends d<? extends Boolean>>
{
    public final String a;
    public final T b;
    
    public a(final String a, final T b) {
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
        final String a = this.a;
        final a a2 = (a)o;
        return e.a((Object)a, (Object)a2.a) && e.a((Object)this.b, (Object)a2.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final d<? extends Boolean> b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("AccessibilityAction(label=");
        r.append(this.a);
        r.append(", action=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
