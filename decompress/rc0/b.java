// 
// Decompiled by Procyon v0.6.0
// 

package rc0;

import p1.h;
import ng2.e;
import java.util.List;

public final class b
{
    public final List<String> a;
    
    public b(final List<String> a) {
        e.f((Object)a, "subredditIds");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof b && e.a((Object)this.a, (Object)((b)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return h.d(a.t("PracticeFeedSelectionResult(subredditIds="), (List)this.a, ')');
    }
}
