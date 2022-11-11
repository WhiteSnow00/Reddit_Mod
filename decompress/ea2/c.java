// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import sg2.e;
import java.util.ArrayList;
import fa2.a;
import java.util.List;

public final class c extends v
{
    public final List<a> a;
    
    public c(final ArrayList a) {
        this.a = a;
    }
    
    public final boolean a(final v v) {
        e.f((Object)v, "item");
        return v instanceof c && e.a((Object)((c)v).a, (Object)this.a);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof c && e.a((Object)this.a, (Object)((c)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return d.o(a.r("CollectibleAvatarsItem(collectibleAvatars="), (List)this.a, ')');
    }
}
