// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import n7.f;
import com.apollographql.apollo.exception.ApolloException;
import okhttp3.Response;
import java.util.Collection;
import java.util.HashSet;
import com.apollographql.apollo.api.internal.Optional;
import java.util.Collections;
import java.util.Set;
import com.apollographql.apollo.interceptor.ApolloInterceptor$c;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import zd.b;
import java.util.concurrent.Executor;
import j7.h;
import m7.a;
import com.apollographql.apollo.interceptor.ApolloInterceptor;

public final class i implements ApolloInterceptor
{
    public final a a;
    public final h b;
    public final Executor c;
    public final boolean d;
    public final b e;
    public volatile boolean f;
    
    public i(final a a, final h b, final Executor c, final b e, final boolean d) {
        if (a == null) {
            throw new NullPointerException("cache == null");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("responseFieldMapper == null");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("dispatcher == null");
        }
        this.c = c;
        if (e != null) {
            this.e = e;
            this.d = d;
            return;
        }
        throw new NullPointerException("logger == null");
    }
    
    public final void a(final ApolloInterceptor$b apolloInterceptor$b, final n n, final Executor executor, final ApolloInterceptor$a apolloInterceptor$a) {
        executor.execute(new w7.b(this, apolloInterceptor$b, apolloInterceptor$a, n, executor));
    }
    
    public final Set b(final ApolloInterceptor$b apolloInterceptor$b, final ApolloInterceptor$c apolloInterceptor$c) {
        if (apolloInterceptor$c.b.isPresent() && ((h7.n)apolloInterceptor$c.b.get()).a() && !apolloInterceptor$b.c.a.containsKey("store-partial-responses")) {
            return Collections.emptySet();
        }
        final Optional map = apolloInterceptor$c.c.map((j7.c)new c(apolloInterceptor$b));
        if (!map.isPresent()) {
            return Collections.emptySet();
        }
        try {
            return (Set)this.a.c((n7.h)new d(map, apolloInterceptor$b));
        }
        catch (final Exception ex) {
            this.e.O("Failed to cache operation response", ex);
            return Collections.emptySet();
        }
    }
    
    public final void c(final ApolloInterceptor$b apolloInterceptor$b, final ApolloInterceptor$c apolloInterceptor$c) {
        try {
            final Set b = this.b(apolloInterceptor$b, apolloInterceptor$c);
            Set<Object> emptySet;
            try {
                emptySet = (Set)this.a.j(apolloInterceptor$b.a).a();
            }
            catch (final Exception ex) {
                this.e.P(ex, "failed to rollback operation optimistic updates, for: %s", apolloInterceptor$b.b);
                emptySet = Collections.emptySet();
            }
            final HashSet set = new HashSet();
            set.addAll(emptySet);
            set.addAll(b);
            this.c.execute(new w7.h(this, set));
        }
        catch (final Exception ex2) {
            this.c.execute(new g(this, apolloInterceptor$b));
            throw ex2;
        }
    }
    
    public final ApolloInterceptor$c d(final ApolloInterceptor$b apolloInterceptor$b) throws ApolloException {
        final f d = this.a.d();
        final h7.n n = (h7.n)this.a.a(apolloInterceptor$b.b, this.b, d, apolloInterceptor$b.c).a();
        if (n.b != null) {
            this.e.L("Cache HIT for operation %s", apolloInterceptor$b.b.name().name());
            return new ApolloInterceptor$c((Response)null, n, d.l());
        }
        this.e.L("Cache MISS for operation %s", apolloInterceptor$b.b.name().name());
        throw new ApolloException(String.format("Cache miss for operation %s", apolloInterceptor$b.b.name().name()));
    }
    
    public final void dispose() {
        this.f = true;
    }
}
