// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import java.util.HashSet;
import java.util.Set;

public final class h implements Runnable
{
    public final Set f;
    public final i g;
    
    public h(final i g, final HashSet f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        try {
            this.g.a.b(this.f);
        }
        catch (final Exception ex) {
            this.g.e.P(ex, "Failed to publish cache changes", new Object[0]);
        }
    }
}
