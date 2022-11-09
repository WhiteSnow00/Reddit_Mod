// 
// Decompiled by Procyon v0.6.0
// 

package cb0;

import ak0.m;
import ah2.f;
import kotlin.collections.EmptySet;
import com.reddit.domain.model.ILink;
import zg2.l;
import java.util.Set;
import java.util.List;

public final class j<T>
{
    public final List<T> a;
    public final Set<String> b;
    public final l<ILink, pg2.j> c;
    
    public j() {
        this(null, (Set)EmptySet.INSTANCE, null);
    }
    
    public j(final List<? extends T> a, final Set<String> b, final l<? super ILink, pg2.j> c) {
        f.f((Object)b, "uniqueIds");
        this.a = (List<T>)a;
        this.b = b;
        this.c = (l<ILink, pg2.j>)c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        return f.a((Object)this.a, (Object)j.a) && f.a((Object)this.b, (Object)j.b) && f.a((Object)this.c, (Object)j.c);
    }
    
    @Override
    public final int hashCode() {
        final List<T> a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int g = m.g((Set)this.b, hashCode * 31, 31);
        final l<ILink, pg2.j> c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return g + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("FilterableMetaData(previousItems=");
        k.append(this.a);
        k.append(", uniqueIds=");
        k.append(this.b);
        k.append(", onItemFiltered=");
        return d.n(k, (l)this.c, ')');
    }
}
