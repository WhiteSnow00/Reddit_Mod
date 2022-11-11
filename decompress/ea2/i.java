// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import sg2.e;
import xa2.d;

public final class i extends v
{
    public final d a;
    
    public i(final d a) {
        e.f((Object)a, "infoNotice");
        this.a = a;
    }
    
    public final boolean a(final v v) {
        e.f((Object)v, "item");
        return v instanceof i && e.a((Object)((i)v).a, (Object)this.a);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof i && e.a((Object)this.a, (Object)((i)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        final StringBuilder r = a.r("InfoNoticeCardItem(infoNotice=");
        r.append(this.a);
        r.append(')');
        return r.toString();
    }
}
