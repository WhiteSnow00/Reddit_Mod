// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import com.apollographql.apollo.interceptor.ApolloInterceptor$c;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType;
import java.util.concurrent.Executor;
import com.apollographql.apollo.interceptor.d;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;

public final class b implements Runnable
{
    public final ApolloInterceptor$b f;
    public final ApolloInterceptor$a g;
    public final d h;
    public final Executor i;
    public final i j;
    
    public b(final i j, final ApolloInterceptor$b f, final ApolloInterceptor$a g, final n h, final Executor i) {
        this.j = j;
        this.f = f;
        this.g = g;
        this.h = (d)h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        if (this.j.f) {
            return;
        }
        final ApolloInterceptor$b f = this.f;
        if (f.e) {
            this.g.b(ApolloInterceptor$FetchSourceType.CACHE);
            try {
                this.g.c(this.j.d(this.f));
                this.g.onCompleted();
            }
            catch (final ApolloException ex) {
                this.g.a(ex);
            }
        }
        else {
            final i j = this.j;
            j.c.execute(new f(j, f));
            ((n)this.h).a(this.f, this.i, (ApolloInterceptor$a)new ApolloInterceptor$a(this) {
                public final b a;
                
                public final void a(final ApolloException ex) {
                    final b a = this.a;
                    final i j = a.j;
                    j.c.execute(new g(j, a.f));
                    this.a.g.a(ex);
                }
                
                public final void b(final ApolloInterceptor$FetchSourceType apolloInterceptor$FetchSourceType) {
                    this.a.g.b(apolloInterceptor$FetchSourceType);
                }
                
                public final void c(final ApolloInterceptor$c apolloInterceptor$c) {
                    if (this.a.j.f) {
                        return;
                    }
                    final b a = this.a;
                    final i j = a.j;
                    final ApolloInterceptor$b f = a.f;
                    if (j.d) {
                        j.c.execute(new e(j, f, apolloInterceptor$c));
                    }
                    else {
                        j.c(f, apolloInterceptor$c);
                    }
                    this.a.g.c(apolloInterceptor$c);
                    this.a.g.onCompleted();
                }
                
                public final void onCompleted() {
                }
            });
        }
    }
}
