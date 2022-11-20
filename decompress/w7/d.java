// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import java.util.Collection;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import com.apollographql.apollo.api.internal.Optional;
import java.util.Set;
import n7.i;
import n7.h;

public final class d implements h<i, Set<String>>
{
    public final Optional a;
    public final ApolloInterceptor$b b;
    
    public d(final Optional a, final ApolloInterceptor$b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Object execute(final Object o) {
        return ((i)o).h((Collection)this.a.get(), this.b.c);
    }
}
