// 
// Decompiled by Procyon v0.6.0
// 

package cb0;

import java.util.ArrayList;
import ah2.f;
import java.util.List;
import com.reddit.domain.model.ILink;

public abstract class b<T extends ILink> implements i<T>
{
    @Override
    public final List<T> a(final List<? extends T> list, final j<T> j) {
        f.f((Object)list, "items");
        return new a<T>().a(this.b(list, j), j);
    }
    
    public abstract ArrayList b(final List p0, final j p1);
}
