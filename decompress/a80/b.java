// 
// Decompiled by Procyon v0.6.0
// 

package a80;

import javax.inject.Inject;
import com.reddit.devplatform.features.contextactions.ContextActionsImpl;
import com.reddit.devplatform.features.ContextActions;

public final class b implements a
{
    public final ContextActions a;
    
    @Inject
    public b(final ContextActionsImpl a) {
        this.a = (ContextActions)a;
    }
    
    public final ContextActions a() {
        return this.a;
    }
}
