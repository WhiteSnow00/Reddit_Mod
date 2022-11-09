// 
// Decompiled by Procyon v0.6.0
// 

package u7;

import java.util.concurrent.Executor;
import w7.o;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import dg.d;
import p7.a;

public final class b implements p7.a
{
    @Override
    public final ApolloInterceptor a(final d d) {
        return new a();
    }
    
    public static final class a implements ApolloInterceptor
    {
        public volatile boolean a;
        
        @Override
        public final void a(final ApolloInterceptor.b b, final o o, final Executor executor, final ApolloInterceptor.a a) {
            final ApolloInterceptor.b.a a2 = b.a();
            a2.d = true;
            o.a(a2.a(), executor, (ApolloInterceptor.a)new u7.a(this, a, b, o, executor));
        }
        
        @Override
        public final void dispose() {
            this.a = true;
        }
    }
}
