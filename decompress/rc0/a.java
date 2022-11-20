// 
// Decompiled by Procyon v0.6.0
// 

package rc0;

import p1.h;
import ng2.e;
import java.util.List;

public final class a
{
    public final List<String> a;
    
    public a(final List<String> a) {
        e.f((Object)a, "selectedSubredditPrefixedNames");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof a && e.a((Object)this.a, (Object)((a)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return h.d(a.t("CommunitySelectionResult(selectedSubredditPrefixedNames="), (List)this.a, ')');
    }
}
