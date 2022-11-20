// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import m7.a;
import h7.k$a;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;

public final class f implements Runnable
{
    public final ApolloInterceptor$b f;
    public final i g;
    
    public f(final i g, final ApolloInterceptor$b f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        try {
            if (this.f.f.isPresent()) {
                final k$a k$a = (k$a)this.f.f.get();
                final a a = this.g.a;
                final ApolloInterceptor$b f = this.f;
                a.f(f.b, k$a, f.a).a();
            }
        }
        catch (final Exception ex) {
            this.g.e.P(ex, "failed to write operation optimistic updates, for: %s", this.f.b);
        }
    }
}
