// 
// Decompiled by Procyon v0.6.0
// 

package tb0;

import ph0.a;
import ng2.e;
import java.util.ArrayList;
import com.reddit.domain.model.UserLocation;
import java.util.List;

public final class b
{
    public final List<d> a;
    public final List<d> b;
    public final UserLocation c;
    
    public b(final ArrayList a, final ArrayList b, final UserLocation c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
        return e.a((Object)this.a, (Object)b.a) && e.a((Object)this.b, (Object)b.b) && e.a((Object)this.c, (Object)b.c);
    }
    
    @Override
    public final int hashCode() {
        final int b = ph0.a.b((List)this.b, this.a.hashCode() * 31, 31);
        final UserLocation c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return b + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ContentLanguageData(suggestedLanguages=");
        t.append(this.a);
        t.append(", topLanguages=");
        t.append(this.b);
        t.append(", userLocation=");
        t.append(this.c);
        t.append(')');
        return t.toString();
    }
}
