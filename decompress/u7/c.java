// 
// Decompiled by Procyon v0.6.0
// 

package u7;

import java.util.concurrent.Executor;
import w7.o;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import dg.d;
import p7.a;

public final class c implements p7.a
{
    @Override
    public final ApolloInterceptor a(final d d) {
        return new a();
    }
    
    public static final class a implements ApolloInterceptor
    {
        @Override
        public final void a(final b b, final o o, final Executor executor, final ApolloInterceptor.a a) {
            final b.a a2 = b.a();
            a2.d = false;
            o.a(a2.a(), executor, a);
        }
        
        @Override
        public final void dispose() {
        }
    }
}
