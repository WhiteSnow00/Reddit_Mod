// 
// Decompiled by Procyon v0.6.0
// 

package t7;

import sg2.e;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;

public final class d
{
    public final ApolloInterceptor$b a;
    public final ApolloInterceptor$a b;
    
    public d(final ApolloInterceptor$b a, final ApolloInterceptor$a b) {
        e.g((Object)a, "request");
        e.g((Object)b, "callback");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return e.a((Object)this.a, (Object)d.a) && e.a((Object)this.b, (Object)d.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("QueryToBatch(request=");
        r.append(this.a);
        r.append(", callback=");
        r.append(this.b);
        r.append(')');
        return r.toString();
    }
}
