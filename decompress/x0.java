// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import androidx.appcompat.widget.s0;
import a2.b;
import java.util.ArrayList;
import ah2.f;
import kotlin.collections.EmptyList;
import com.reddit.events.search.SearchStructureType;
import java.util.List;
import com.reddit.data.local.PagedRequestState;

public final class x0<T>
{
    public final PagedRequestState a;
    public final List<T> b;
    public final SearchStructureType c;
    public final String d;
    public final boolean e;
    
    public x0() {
        this(0);
    }
    
    public x0(final int n) {
        this(PagedRequestState.Uninitialized, (List)EmptyList.INSTANCE, SearchStructureType.SEARCH, null, false);
    }
    
    public x0(final PagedRequestState a, final List<? extends T> b, final SearchStructureType c, final String d, final boolean e) {
        f.f((Object)a, "status");
        f.f((Object)b, "results");
        f.f((Object)c, "structureType");
        this.a = a;
        this.b = (List<T>)b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static x0 a(final x0 x0, PagedRequestState a, ArrayList b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = x0.a;
        }
        if ((n & 0x2) != 0x0) {
            b = x0.b;
        }
        SearchStructureType c;
        if ((n & 0x4) != 0x0) {
            c = x0.c;
        }
        else {
            c = null;
        }
        String d;
        if ((n & 0x8) != 0x0) {
            d = x0.d;
        }
        else {
            d = null;
        }
        final boolean b2 = (n & 0x10) != 0x0 && x0.e;
        x0.getClass();
        f.f((Object)a, "status");
        f.f((Object)b, "results");
        f.f((Object)c, "structureType");
        return new x0(a, b, c, d, b2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x0)) {
            return false;
        }
        final x0 x0 = (x0)o;
        return this.a == x0.a && f.a((Object)this.b, (Object)x0.b) && this.c == x0.c && f.a((Object)this.d, (Object)x0.d) && this.e == x0.e;
    }
    
    @Override
    public final int hashCode() {
        final int a = a2.b.a((List)this.b, this.a.hashCode() * 31, 31);
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
        return ((hashCode + a) * 31 + hashCode2) * 31 + e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PagedResultsState(status=");
        k.append(this.a);
        k.append(", results=");
        k.append(this.b);
        k.append(", structureType=");
        k.append(this.c);
        k.append(", afterId=");
        k.append(this.d);
        k.append(", contentReloaded=");
        return s0.o(k, this.e, ')');
    }
}
