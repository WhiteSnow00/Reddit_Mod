// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.interceptor;

import m7.j;
import java.util.Collection;
import h7.n;
import okhttp3.Response;
import h7.k$a;
import com.apollographql.apollo.api.internal.Optional;
import l7.a;
import h7.k;
import java.util.UUID;
import com.apollographql.apollo.exception.ApolloException;
import java.util.concurrent.Executor;
import w7.o;

public interface ApolloInterceptor
{
    void a(final b p0, final o p1, final Executor p2, final a p3);
    
    void dispose();
    
    public enum FetchSourceType
    {
        CACHE, 
        NETWORK;
    }
    
    public interface a
    {
        void a(final ApolloException p0);
        
        void b(final FetchSourceType p0);
        
        void c(final c p0);
        
        void onCompleted();
    }
    
    public static final class b
    {
        public final UUID a;
        public final k b;
        public final l7.a c;
        public final z7.a d;
        public final boolean e;
        public final Optional<k$a> f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        
        public b(final k b, final l7.a c, final z7.a d, final Optional<k$a> f, final boolean e, final boolean g, final boolean h, final boolean i) {
            this.a = UUID.randomUUID();
            this.b = b;
            this.c = c;
            this.d = d;
            this.f = f;
            this.e = e;
            this.g = g;
            this.h = h;
            this.i = i;
        }
        
        public final a a() {
            final a a = new a(this.b);
            final l7.a c = this.c;
            if (c == null) {
                throw new NullPointerException("cacheHeaders == null");
            }
            a.b = c;
            final z7.a d = this.d;
            if (d != null) {
                a.c = d;
                a.d = this.e;
                a.e = Optional.fromNullable(this.f.orNull());
                a.f = this.g;
                a.g = this.h;
                a.h = this.i;
                return a;
            }
            throw new NullPointerException("requestHeaders == null");
        }
        
        public static final class a
        {
            public final k a;
            public l7.a b;
            public z7.a c;
            public boolean d;
            public Optional<k$a> e;
            public boolean f;
            public boolean g;
            public boolean h;
            
            public a(final k a) {
                this.b = l7.a.b;
                this.c = z7.a.b;
                this.e = Optional.absent();
                this.f = true;
                if (a != null) {
                    this.a = a;
                    return;
                }
                throw new NullPointerException("operation == null");
            }
            
            public final b a() {
                return new b(this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h);
            }
        }
    }
    
    public static final class c
    {
        public final Optional<Response> a;
        public final Optional<n> b;
        public final Optional<Collection<j>> c;
        
        public c(final Response response, final n n, final Collection<j> collection) {
            this.a = Optional.fromNullable(response);
            this.b = Optional.fromNullable(n);
            this.c = Optional.fromNullable(collection);
        }
    }
}
