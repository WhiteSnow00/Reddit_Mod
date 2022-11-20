// 
// Decompiled by Procyon v0.6.0
// 

package g82;

import p1.h;
import ng2.e;

public final class d
{
    public final String a;
    public final String b;
    
    public d(final String a, final String b) {
        e.f((Object)a, "providerKey");
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
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        return hashCode * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("NetworkDataModel(providerKey=");
        t.append(this.a);
        t.append(", txUrl=");
        return h.c(t, this.b, ')');
    }
}
