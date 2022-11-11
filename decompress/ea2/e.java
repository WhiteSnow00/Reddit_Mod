// 
// Decompiled by Procyon v0.6.0
// 

package ea2;

import java.util.List;
import androidx.recyclerview.widget.n;

public final class e extends b
{
    public final List<v> c;
    public final List<v> d;
    
    public e(final List<? extends v> c, final List<? extends v> d) {
        sg2.e.f((Object)c, "oldList");
        sg2.e.f((Object)d, "newList");
        this.c = (List<v>)c;
        this.d = (List<v>)d;
    }
    
    @Override
    public final boolean areContentsTheSame(final int n, final int n2) {
        final v v = this.c.get(n);
        final v v2 = this.d.get(n2);
        v.getClass();
        sg2.e.f((Object)v2, "item");
        return sg2.e.a((Object)v2, (Object)v);
    }
    
    @Override
    public final boolean areItemsTheSame(final int n, final int n2) {
        return this.c.get(n).a((v)this.d.get(n2));
    }
    
    @Override
    public final int getNewListSize() {
        return this.d.size();
    }
    
    @Override
    public final int getOldListSize() {
        return this.c.size();
    }
}
