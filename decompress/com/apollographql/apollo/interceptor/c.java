// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.interceptor;

import java.util.concurrent.Executor;
import w7.n;
import zd.b;

public final class c implements ApolloInterceptor
{
    public final b a;
    public volatile boolean b;
    public final boolean c;
    
    public c(final b a, final boolean c) {
        this.a = a;
        this.c = c;
    }
    
    public final void a(final ApolloInterceptor$b apolloInterceptor$b, final n n, final Executor executor, final ApolloInterceptor$a apolloInterceptor$a) {
        final ApolloInterceptor$b$a a = apolloInterceptor$b.a();
        boolean g = false;
        a.f = false;
        a.h = true;
        if (apolloInterceptor$b.h || this.c) {
            g = true;
        }
        a.g = g;
        n.a(a.a(), executor, (ApolloInterceptor$a)new a(this, apolloInterceptor$b, n, executor, apolloInterceptor$a));
    }
    
    public final void dispose() {
        this.b = true;
    }
}
