// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Collections;
import java.util.Collection;
import com.apollographql.apollo.e;
import java.util.HashSet;
import java.util.Set;
import h7.l;
import h7.n;
import com.apollographql.apollo.interceptor.ApolloInterceptor$c;
import com.apollographql.apollo.ApolloCall$StatusEvent;
import j7.a;
import com.apollographql.apollo.interceptor.ApolloInterceptor$FetchSourceType;
import okhttp3.Response;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.ApolloParseException;
import com.apollographql.apollo.ApolloCall$b;
import com.apollographql.apollo.exception.ApolloHttpException;
import java.util.Arrays;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.interceptor.ApolloInterceptor$a;

public final class b implements ApolloInterceptor$a
{
    public final c a;
    
    public b(final c a) {
        this.a = a;
    }
    
    public final void a(final ApolloException ex) {
        final Optional f = this.a.f();
        if (!f.isPresent()) {
            final c a = this.a;
            final zd.b l = a.l;
            final String name = a.a.name().name();
            l.getClass();
            l.y0(3, "onFailure for operation: %s. No callback present.", (Throwable)ex, Arrays.copyOf(new Object[] { name }, 1));
            return;
        }
        if (ex instanceof ApolloHttpException) {
            final ApolloCall$b apolloCall$b = (ApolloCall$b)f.get();
            final ApolloHttpException ex2 = (ApolloHttpException)ex;
            apolloCall$b.a((ApolloException)ex2);
            try (final Response rawResponse = ex2.rawResponse()) {}
        }
        else if (ex instanceof ApolloParseException) {
            ((ApolloCall$b)f.get()).a((ApolloException)ex);
        }
        else if (ex instanceof ApolloNetworkException) {
            ((ApolloCall$b)f.get()).a((ApolloException)ex);
        }
        else {
            ((ApolloCall$b)f.get()).a(ex);
        }
    }
    
    public final void b(final ApolloInterceptor$FetchSourceType apolloInterceptor$FetchSourceType) {
        this.a.d().apply((a)new a<ApolloCall$b<Object>>(apolloInterceptor$FetchSourceType) {
            public final ApolloInterceptor$FetchSourceType a;
            
            public final void apply(final Object o) {
                final ApolloCall$b apolloCall$b = (ApolloCall$b)o;
                final int n = c$b.b[((Enum)this.a).ordinal()];
                if (n != 1) {
                    if (n == 2) {
                        apolloCall$b.c(ApolloCall$StatusEvent.FETCH_NETWORK);
                    }
                }
                else {
                    apolloCall$b.c(ApolloCall$StatusEvent.FETCH_CACHE);
                }
            }
        });
    }
    
    public final void c(final ApolloInterceptor$c apolloInterceptor$c) {
        final Optional d = this.a.d();
        if (!d.isPresent()) {
            final c a = this.a;
            a.l.L("onResponse for operation: %s. No callback present.", a.a.name().name());
            return;
        }
        ((ApolloCall$b)d.get()).b((n)apolloInterceptor$c.b.get());
    }
    
    public final void onCompleted() {
        final Optional f = this.a.f();
        if (this.a.s.isPresent()) {
            final com.apollographql.apollo.internal.a a = (com.apollographql.apollo.internal.a)this.a.s.get();
            if (!a.e.compareAndSet(false, true)) {
                throw new IllegalStateException("Already Executed");
            }
            try {
                for (l l : a.c) {
                    final HashMap c = a.d.c;
                    if0.a.j((Object)l, "operationName == null");
                    synchronized (c) {
                        final Set set = c.get(l);
                        Set<Object> emptySet;
                        if (set != null) {
                            emptySet = (Set<Object>)new HashSet<e>(set);
                        }
                        else {
                            emptySet = (Set<Object>)Collections.emptySet();
                        }
                        monitorexit(c);
                        final Iterator<Object> iterator2 = (Iterator<Object>)emptySet.iterator();
                        while (iterator2.hasNext()) {
                            iterator2.next().a();
                        }
                    }
                }
            }
            catch (final Exception ex) {
                a.a.P(ex, "Failed to re-fetch query watcher", new Object[0]);
            }
            final AtomicInteger atomicInteger = new AtomicInteger(a.b.size());
            for (final c c2 : a.b) {
                c2.c((ApolloCall$b)new s7.b(a, atomicInteger, c2));
            }
        }
        if (!f.isPresent()) {
            final c a2 = this.a;
            a2.l.L("onCompleted for operation: %s. No callback present.", a2.a.name().name());
            return;
        }
        ((ApolloCall$b)f.get()).c(ApolloCall$StatusEvent.COMPLETED);
    }
}
