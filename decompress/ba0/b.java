// 
// Decompiled by Procyon v0.6.0
// 

package ba0;

import al0.g7;
import sg2.e;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import com.reddit.domain.model.Link;
import java.util.Map;
import com.reddit.discoveryunits.ui.DiscoveryUnit;
import com.reddit.domain.model.Flair;
import com.reddit.listing.model.Listable;
import java.util.List;

public final class b
{
    public final List<Listable> a;
    public final List<Flair> b;
    public final DiscoveryUnit c;
    public final Map<String, Integer> d;
    public final List<Link> e;
    
    public b(final ArrayList a, final ArrayList b, final DiscoveryUnit c, final LinkedHashMap d, final ArrayList e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return sg2.e.a((Object)this.a, (Object)b.a) && sg2.e.a((Object)this.b, (Object)b.b) && sg2.e.a((Object)this.c, (Object)b.c) && sg2.e.a((Object)this.d, (Object)b.d) && sg2.e.a((Object)this.e, (Object)b.e);
    }
    
    @Override
    public final int hashCode() {
        final int c = aw.b.c((List)this.b, this.a.hashCode() * 31, 31);
        final DiscoveryUnit c2 = this.c;
        int hashCode;
        if (c2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = c2.hashCode();
        }
        return this.e.hashCode() + g7.a((Map)this.d, (c + hashCode) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DiscoveryUnitSearchResultMapperResult(models=");
        r.append(this.a);
        r.append(", flairs=");
        r.append(this.b);
        r.append(", flairDiscoveryUnit=");
        r.append(this.c);
        r.append(", linkPositions=");
        r.append(this.d);
        r.append(", links=");
        return d.o(r, (List)this.e, ')');
    }
}
