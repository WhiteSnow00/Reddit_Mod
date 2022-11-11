// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import lw0.b;
import java.util.Collection;
import sg2.e;
import androidx.paging.PagingSource$b$b;
import java.util.List;

public final class u<Key, Value>
{
    public final List<PagingSource$b$b<Key, Value>> a;
    public final Integer b;
    public final r c;
    public final int d;
    
    public u(final List<PagingSource$b$b<Key, Value>> a, final Integer b, final r c, final int d) {
        e.f((Object)a, "pages");
        e.f((Object)c, "config");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final PagingSource$b$b<Key, Value> a(int n) {
        final List<PagingSource$b$b<Key, Value>> a = this.a;
        final boolean b = a instanceof Collection;
        final int n2 = 0;
        final boolean b2 = true;
        int n3 = 0;
        Label_0079: {
            if (b && a.isEmpty()) {
                n3 = (b2 ? 1 : 0);
            }
            else {
                final Iterator iterator = a.iterator();
                do {
                    n3 = (b2 ? 1 : 0);
                    if (iterator.hasNext()) {
                        continue;
                    }
                    break Label_0079;
                } while (((PagingSource$b$b)iterator.next()).a.isEmpty());
                n3 = 0;
            }
        }
        if (n3 != 0) {
            return null;
        }
        int n4;
        for (n4 = n - this.d, n = n2; n < lw0.b.L0((List)this.a) && n4 > lw0.b.L0(this.a.get(n).a); n4 -= this.a.get(n).a.size(), ++n) {}
        PagingSource$b$b pagingSource$b$b;
        if (n4 < 0) {
            pagingSource$b$b = (PagingSource$b$b)CollectionsKt___CollectionsKt.A3((List)this.a);
        }
        else {
            pagingSource$b$b = this.a.get(n);
        }
        return (PagingSource$b$b<Key, Value>)pagingSource$b$b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof u) {
            final List<PagingSource$b$b<Key, Value>> a = this.a;
            final u u = (u)o;
            if (e.a((Object)a, (Object)u.a) && e.a((Object)this.b, (Object)u.b) && e.a((Object)this.c, (Object)u.c) && this.d == u.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return Integer.hashCode(this.d) + (this.c.hashCode() + (hashCode + hashCode2));
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("PagingState(pages=");
        r.append(this.a);
        r.append(", anchorPosition=");
        r.append(this.b);
        r.append(", config=");
        r.append(this.c);
        r.append(", leadingPlaceholderCount=");
        return d.l(r, this.d, ')');
    }
}
