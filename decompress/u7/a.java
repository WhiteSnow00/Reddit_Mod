// 
// Decompiled by Procyon v0.6.0
// 

package u7;

import com.apollographql.apollo.exception.ApolloException;
import w7.o;
import java.util.concurrent.Executor;
import com.apollographql.apollo.interceptor.d;
import com.apollographql.apollo.interceptor.ApolloInterceptor;

public final class a implements ApolloInterceptor.a
{
    public final /* synthetic */ ApolloInterceptor.a a;
    public final /* synthetic */ b b;
    public final /* synthetic */ d c;
    public final /* synthetic */ Executor d;
    public final /* synthetic */ u7.b.a e;
    
    public a(final u7.b.a e, final ApolloInterceptor.a a, final b b, final o c, final Executor d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = (d)c;
        this.d = d;
    }
    
    @Override
    public final void a(final ApolloException ex) {
        if (!this.e.a) {
            final ApolloInterceptor.b.a a = this.b.a();
            a.d = false;
            ((o)this.c).a(a.a(), this.d, this.a);
        }
    }
    
    @Override
    public final void b(final FetchSourceType fetchSourceType) {
        this.a.b(fetchSourceType);
    }
    
    @Override
    public final void c(final c c) {
        this.a.c(c);
    }
    
    @Override
    public final void onCompleted() {
        this.a.onCompleted();
    }
}
