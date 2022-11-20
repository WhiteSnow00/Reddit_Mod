// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import com.apollographql.apollo.interceptor.ApolloInterceptor$b;

public final class g implements Runnable
{
    public final ApolloInterceptor$b f;
    public final i g;
    
    public g(final i g, final ApolloInterceptor$b f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        try {
            this.g.a.i(this.f.a).a();
        }
        catch (final Exception ex) {
            this.g.e.P(ex, "failed to rollback operation optimistic updates, for: %s", this.f.b);
        }
    }
}
