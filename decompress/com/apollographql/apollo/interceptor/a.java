// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.exception.ApolloException;
import w7.n;
import java.util.concurrent.Executor;

public final class a implements ApolloInterceptor$a
{
    public final ApolloInterceptor$b a;
    public final d b;
    public final Executor c;
    public final ApolloInterceptor$a d;
    public final c e;
    
    public a(final c e, final ApolloInterceptor$b a, final n b, final Executor c, final ApolloInterceptor$a d) {
        this.e = e;
        this.a = a;
        this.b = (d)b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final ApolloException ex) {
        this.d.a(ex);
    }
    
    public final void b(final ApolloInterceptor$FetchSourceType apolloInterceptor$FetchSourceType) {
        this.d.b(apolloInterceptor$FetchSourceType);
    }
    
    public final void c(final ApolloInterceptor$c apolloInterceptor$c) {
        if (this.e.b) {
            return;
        }
        final c e = this.e;
        final ApolloInterceptor$b a = this.a;
        e.getClass();
        final Optional flatMap = apolloInterceptor$c.b.flatMap((j7.c)new b(e, a));
        if (flatMap.isPresent()) {
            ((n)this.b).a((ApolloInterceptor$b)flatMap.get(), this.c, this.d);
        }
        else {
            this.d.c(apolloInterceptor$c);
            this.d.onCompleted();
        }
    }
    
    public final void onCompleted() {
    }
}
