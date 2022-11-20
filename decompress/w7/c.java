// 
// Decompiled by Procyon v0.6.0
// 

package w7;

import m7.j$a;
import java.util.Iterator;
import java.util.ArrayList;
import com.apollographql.apollo.interceptor.ApolloInterceptor$b;
import java.util.List;
import m7.j;
import java.util.Collection;

public final class c implements j7.c<Collection<j>, List<j>>
{
    public final ApolloInterceptor$b a;
    
    public c(final ApolloInterceptor$b a) {
        this.a = a;
    }
    
    public final Object apply(final Object o) {
        final Collection collection = (Collection)o;
        final ArrayList list = new ArrayList<j>(collection.size());
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            final j$a b = ((j)iterator.next()).b();
            b.b = this.a.a;
            list.add(b.a());
        }
        return list;
    }
}
