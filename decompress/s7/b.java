// 
// Decompiled by Procyon v0.6.0
// 

package s7;

import h7.n;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.internal.a;
import com.apollographql.apollo.internal.c;
import java.util.concurrent.atomic.AtomicInteger;
import com.apollographql.apollo.ApolloCall$b;

public final class b extends ApolloCall$b
{
    public final AtomicInteger a;
    public final c b;
    public final a c;
    
    public b(final a c, final AtomicInteger a, final c b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ApolloException ex) {
        final zd.b a = this.c.a;
        if (a != null) {
            a.P((Throwable)ex, "Failed to fetch query: %s", this.b.a);
        }
        this.a.decrementAndGet();
    }
    
    public final void b(final n n) {
        this.a.decrementAndGet();
    }
}
