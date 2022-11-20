// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import okhttp3.Response;
import com.apollographql.apollo.interceptor.ApolloInterceptor$c;
import com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;

public final class j implements ApolloInterceptor$a
{
    public final ApolloInterceptor$b a;
    public final ApolloInterceptor$a b;
    public final k c;
    
    public j(final k c, final ApolloInterceptor$b a, final ApolloInterceptor$a b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final ApolloException ex) {
        if (this.c.e) {
            return;
        }
        this.b.a(ex);
    }
    
    public final void b(final ApolloInterceptor$FetchSourceType apolloInterceptor$FetchSourceType) {
        this.b.b(apolloInterceptor$FetchSourceType);
    }
    
    public final void c(ApolloInterceptor$c b) {
        try {
            if (this.c.e) {
                return;
            }
            b = this.c.b(this.a.b, (Response)b.a.get());
            this.b.c(b);
            this.b.onCompleted();
        }
        catch (final ApolloException ex) {
            this.a(ex);
        }
    }
    
    public final void onCompleted() {
    }
}
