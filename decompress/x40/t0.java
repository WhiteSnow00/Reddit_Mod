// 
// Decompiled by Procyon v0.6.0
// 

package x40;

import ph0.a;
import java.util.ArrayList;
import ng2.e;
import kotlin.collections.EmptyList;
import com.reddit.events.search.SearchStructureType;
import java.util.List;
import com.reddit.data.local.PagedRequestState;

public final class t0<T>
{
    public final PagedRequestState a;
    public final List<T> b;
    public final SearchStructureType c;
    public final String d;
    public final boolean e;
    
    public t0() {
        this(0);
    }
    
    public t0(final int n) {
        this(PagedRequestState.Uninitialized, (List)EmptyList.INSTANCE, SearchStructureType.SEARCH, null, false);
    }
    
    public t0(final PagedRequestState a, final List<? extends T> b, final SearchStructureType c, final String d, final boolean e) {
        ng2.e.f((Object)a, "status");
        ng2.e.f((Object)b, "results");
        ng2.e.f((Object)c, "structureType");
        this.a = a;
        this.b = (List<T>)b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static t0 a(final t0 t0, PagedRequestState a, ArrayList b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = t0.a;
        }
        if ((n & 0x2) != 0x0) {
            b = t0.b;
        }
        SearchStructureType c;
        if ((n & 0x4) != 0x0) {
            c = t0.c;
        }
        else {
            c = null;
        }
        String d;
        if ((n & 0x8) != 0x0) {
            d = t0.d;
        }
        else {
            d = null;
        }
        final boolean b2 = (n & 0x10) != 0x0 && t0.e;
        t0.getClass();
        e.f((Object)a, "status");
        e.f((Object)b, "results");
        e.f((Object)c, "structureType");
        return new t0(a, b, c, d, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t0)) {
            return false;
        }
        final t0 t0 = (t0)o;
        return this.a == t0.a && ng2.e.a((Object)this.b, (Object)t0.b) && this.c == t0.c && ng2.e.a((Object)this.d, (Object)t0.d) && this.e == t0.e;
    }
    
    @Override
    public final int hashCode() {
        final int b = ph0.a.b((List)this.b, this.a.hashCode() * 31, 31);
        final int hashCode = this.c.hashCode();
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return ((hashCode + b) * 31 + hashCode2) * 31 + e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PagedResultsState(status=");
        t.append(this.a);
        t.append(", results=");
        t.append(this.b);
        t.append(", structureType=");
        t.append(this.c);
        t.append(", afterId=");
        t.append(this.d);
        t.append(", contentReloaded=");
        return d.n(t, this.e, ')');
    }
}
