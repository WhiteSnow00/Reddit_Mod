// 
// Decompiled by Procyon v0.6.0
// 

package cb0;

import java.util.Iterator;
import com.reddit.domain.model.Link;
import javax.inject.Inject;
import ah2.f;
import java.util.Set;

public final class n
{
    public final Set<m> a;
    
    @Inject
    public n(final Set<m> a) {
        f.f((Object)a, "mergeLinkDelegates");
        this.a = a;
    }
    
    public final Link a(final Link link, Link a) {
        f.f((Object)link, "oldLink");
        f.f((Object)a, "newLink");
        final Iterator<Object> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            a = iterator.next().a(link, a);
        }
        return a;
    }
}
