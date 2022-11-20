// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.interceptor;

import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import ng2.e;
import h7.f;
import com.apollographql.apollo.api.internal.Optional;
import h7.n;
import j7.c;

public final class b implements c<n, Optional<ApolloInterceptor$b>>
{
    public final ApolloInterceptor$b a;
    public final com.apollographql.apollo.interceptor.c b;
    
    public b(final com.apollographql.apollo.interceptor.c b, final ApolloInterceptor$b a) {
        this.b = b;
        this.a = a;
    }
    
    public final Object apply(final Object o) {
        final n n = (n)o;
        if (n.a()) {
            final com.apollographql.apollo.interceptor.c b = this.b;
            final List c = n.c;
            b.getClass();
            final Iterator iterator = c.iterator();
            while (true) {
            Label_0275_Outer:
                do {
                    final boolean hasNext = iterator.hasNext();
                    final int n2 = 1;
                    if (hasNext) {
                        continue Label_0275_Outer;
                    }
                    final boolean b2 = false;
                    if (b2) {
                        final zd.b a = this.b.a;
                        final StringBuilder t = a.t("GraphQL server couldn't find Automatic Persisted Query for operation name: ");
                        t.append(this.a.b.name().name());
                        t.append(" id: ");
                        t.append(this.a.b.d());
                        final String string = t.toString();
                        a.getClass();
                        e.g((Object)string, "message");
                        a.y0(5, string, null, Arrays.copyOf(new Object[0], 0));
                        final ApolloInterceptor$b$a a2 = this.a.a();
                        a2.h = true;
                        a2.f = true;
                        return Optional.of((Object)a2.a());
                    }
                    final com.apollographql.apollo.interceptor.c b3 = this.b;
                    final List c2 = n.c;
                    b3.getClass();
                    final Iterator iterator2 = c2.iterator();
                    while (true) {
                        while (iterator2.hasNext()) {
                            if ("PersistedQueryNotSupported".equalsIgnoreCase(((f)iterator2.next()).a)) {
                                final int n3 = n2;
                                if (n3 != 0) {
                                    this.b.a.O("GraphQL server doesn't support Automatic Persisted Queries", new Object[0]);
                                    return Optional.of((Object)this.a);
                                }
                                return Optional.absent();
                            }
                        }
                        final int n3 = 0;
                        continue;
                    }
                } while (!"PersistedQueryNotFound".equalsIgnoreCase(((f)iterator.next()).a));
                final boolean b2 = true;
                continue;
            }
        }
        return Optional.absent();
    }
}
