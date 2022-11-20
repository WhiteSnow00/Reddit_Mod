// 
// Decompiled by Procyon v0.6.0
// 

package ih2;

import rh2.a;
import mg2.l;
import kotlin.collections.EmptyList;
import java.util.Collection;
import ng2.e;
import yh2.c;

public final class t extends m implements rh2.t
{
    public final c a;
    
    public t(final c a) {
        e.f((Object)a, "fqName");
        this.a = a;
    }
    
    public final c d() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o instanceof t && e.a((Object)this.a, (Object)((t)o).a);
    }
    
    public final Collection getAnnotations() {
        return (Collection)EmptyList.INSTANCE;
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final EmptyList i(final l l) {
        e.f((Object)l, "nameFilter");
        return EmptyList.INSTANCE;
    }
    
    public final a l(final c c) {
        e.f((Object)c, "fqName");
        return null;
    }
    
    public final EmptyList p() {
        return EmptyList.INSTANCE;
    }
    
    public final void t() {
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        android.support.v4.media.a.B((Class)t.class, sb, ": ");
        sb.append(this.a);
        return sb.toString();
    }
}
