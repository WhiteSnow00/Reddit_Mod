// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import sg2.e;
import java.util.ArrayList;
import x82.l0;
import x82.h;
import kotlin.Pair;
import java.util.List;

public final class t extends v
{
    public final List<Pair<h, l0>> a;
    
    public t(final ArrayList a) {
        this.a = a;
    }
    
    public final boolean a(final v v) {
        e.f((Object)v, "item");
        return v instanceof t;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof t && e.a((Object)this.a, (Object)((t)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return d.o(a.r("TransactionsItem(transactions="), (List)this.a, ')');
    }
}
