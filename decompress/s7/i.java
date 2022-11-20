// 
// Decompiled by Procyon v0.6.0
// 

package s7;

import java.util.Set;
import com.apollographql.apollo.internal.d;
import s6.h;

public final class i implements Runnable
{
    public final h f;
    public final d g;
    
    public i(final d g, final h f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        try {
            final Set set = (Set)this.g.c.c((n7.h)new i$a(this));
            try {
                this.g.c.b(set);
            }
            catch (final Exception ex) {
                final d g = this.g;
                g.f.P(ex, "Failed to publish cache changes for subscription `%s`", g.a);
            }
        }
        catch (final Exception ex2) {
            final d g2 = this.g;
            g2.f.P(ex2, "Failed to cache response for subscription `%s`", g2.a);
        }
    }
}
