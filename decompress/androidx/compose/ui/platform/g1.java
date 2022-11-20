// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import t5.w;
import ng2.e;

public final class g1
{
    public final String a;
    public final Object b;
    
    public g1(final String a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g1)) {
            return false;
        }
        final g1 g1 = (g1)o;
        return e.a((Object)this.a, (Object)g1.a) && e.a(this.b, g1.b);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Object b = this.b;
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
        final StringBuilder t = a.t("ValueElement(name=");
        t.append(this.a);
        t.append(", value=");
        return w.h(t, this.b, ')');
    }
}
