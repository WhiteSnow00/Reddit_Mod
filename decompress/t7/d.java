// 
// Decompiled by Procyon v0.6.0
// 

package t7;

import ah2.f;
import com.apollographql.apollo.interceptor.ApolloInterceptor;

public final class d
{
    public final ApolloInterceptor.b a;
    public final ApolloInterceptor.a b;
    
    public d(final ApolloInterceptor.b a, final ApolloInterceptor.a b) {
        f.g((Object)a, "request");
        f.g((Object)b, "callback");
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
        return f.a((Object)this.a, (Object)d.a) && f.a((Object)this.b, (Object)d.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("QueryToBatch(request=");
        k.append(this.a);
        k.append(", callback=");
        k.append(this.b);
        k.append(')');
        return k.toString();
    }
}
