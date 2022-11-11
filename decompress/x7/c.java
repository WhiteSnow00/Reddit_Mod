// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import com.apollographql.apollo.exception.ApolloNetworkException;

public final class c implements Runnable
{
    public final /* synthetic */ a f;
    
    public c(final a f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.f.e((Throwable)new ApolloNetworkException("Subscription server is not responding"));
    }
}
