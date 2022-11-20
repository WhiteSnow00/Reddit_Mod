// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import com.apollographql.apollo.interceptor.ApolloInterceptor$c;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;

public final class e implements Runnable
{
    public final ApolloInterceptor$b f;
    public final ApolloInterceptor$c g;
    public final i h;
    
    public e(final i h, final ApolloInterceptor$b f, final ApolloInterceptor$c g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.h.c(this.f, this.g);
    }
}
