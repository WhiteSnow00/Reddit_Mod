// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import zd.b;
import com.apollographql.apollo.exception.ApolloException;
import cg2.j;
import java.util.concurrent.ScheduledFuture;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import java.util.concurrent.Executor;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import t7.e;
import com.apollographql.apollo.interceptor.ApolloInterceptor;

public final class a implements ApolloInterceptor
{
    public final com.apollographql.apollo.internal.batch.a a;
    public e b;
    
    public a(final com.apollographql.apollo.internal.batch.a a) {
        ng2.e.g((Object)a, "batcher");
        this.a = a;
    }
    
    public final void a(ApolloInterceptor$b a, final n n, final Executor executor, final ApolloInterceptor$a apolloInterceptor$a) {
        ng2.e.g((Object)a, "request");
        ng2.e.g((Object)executor, "dispatcher");
        ng2.e.g((Object)apolloInterceptor$a, "callBack");
        final e b = new e(a, apolloInterceptor$a);
        a = (ApolloInterceptor$b)this.a;
        a.getClass();
        if (((com.apollographql.apollo.internal.batch.a)a).e.h != null) {
            synchronized (a) {
                ((com.apollographql.apollo.internal.batch.a)a).f.add(b);
                final b d = ((com.apollographql.apollo.internal.batch.a)a).d;
                final StringBuilder sb = new StringBuilder();
                sb.append("Enqueued Query: ");
                sb.append(b.a.b.name().name());
                sb.append(" for batching");
                d.L(sb.toString(), new Object[0]);
                if (((com.apollographql.apollo.internal.batch.a)a).f.size() >= ((com.apollographql.apollo.internal.batch.a)a).a.c) {
                    ((com.apollographql.apollo.internal.batch.a)a).b();
                }
                final j a2 = j.a;
                monitorexit(a);
                this.b = b;
                return;
            }
        }
        throw new ApolloException("Trying to batch queries without calling ApolloClient.startBatchPoller() first");
    }
    
    public final void dispose() {
        final e b = this.b;
        if (b == null) {
            return;
        }
        final com.apollographql.apollo.internal.batch.a a = this.a;
        a.getClass();
        synchronized (a) {
            a.f.remove(b);
        }
    }
}
