// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import com.apollographql.apollo.interceptor.ApolloInterceptor;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import java.util.concurrent.Executor;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import java.util.Collection;
import java.util.ArrayList;
import com.apollographql.apollo.interceptor.d;

public final class n implements d
{
    public final ArrayList a;
    public final int b;
    
    public n(final ArrayList list, final int b) {
        if (b <= list.size()) {
            this.a = new ArrayList(list);
            this.b = b;
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public final void a(final ApolloInterceptor$b apolloInterceptor$b, final Executor executor, final ApolloInterceptor$a apolloInterceptor$a) {
        if (this.b < this.a.size()) {
            this.a.get(this.b).a(apolloInterceptor$b, new n(this.a, this.b + 1), executor, apolloInterceptor$a);
            return;
        }
        throw new IllegalStateException();
    }
}
