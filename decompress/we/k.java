// 
// Decompiled by Procyon v0.6.0
// 

package we;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class k implements a<Void, g<List<g<?>>>>
{
    public final Collection f;
    
    public k(final List f) {
        this.f = f;
    }
    
    public final /* bridge */ Object then(final g g) throws Exception {
        final ArrayList list = new ArrayList();
        list.addAll(this.f);
        return j.e((Object)list);
    }
}
