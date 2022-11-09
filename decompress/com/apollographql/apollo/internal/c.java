// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal;

import o72.f;
import com.apollographql.apollo.exception.ApolloCanceledException;
import java.util.Iterator;
import j7.h;
import com.apollographql.apollo.exception.ApolloException;
import h7.j;
import w7.i;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import h7.k$a;
import com.apollographql.apollo.ApolloCall;
import java.util.concurrent.atomic.AtomicReference;
import com.apollographql.apollo.api.internal.Optional;
import h7.m;
import h7.l;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import java.util.List;
import java.util.concurrent.Executor;
import w7.o;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy;
import okhttp3.Call$Factory;
import okhttp3.HttpUrl;
import h7.k;
import com.apollographql.apollo.internal.batch.a;
import com.apollographql.apollo.d;

public final class c<T> implements d<T>, com.apollographql.apollo.c<T>
{
    public final boolean A;
    public final a B;
    public final k a;
    public final HttpUrl b;
    public final Call$Factory c;
    public final HttpCachePolicy.b d;
    public final ScalarTypeAdapters e;
    public final m7.a f;
    public final l7.a g;
    public final z7.a h;
    public final p7.a i;
    public final o j;
    public final Executor k;
    public final dg.d l;
    public final s7.a m;
    public final List<ApolloInterceptor> n;
    public final List<r7.a> o;
    public final r7.a p;
    public final List<l> q;
    public final List<m> r;
    public final Optional<com.apollographql.apollo.internal.a> s;
    public final boolean t;
    public final AtomicReference<CallState> u;
    public final AtomicReference<ApolloCall.b<T>> v;
    public final Optional<k$a> w;
    public final boolean x;
    public final boolean y;
    public final boolean z;
    
    public c(final c.c$c<T> c$c) {
        this.u = new AtomicReference<CallState>(CallState.IDLE);
        this.v = new AtomicReference<ApolloCall.b<T>>();
        final k a = c$c.a;
        this.a = a;
        this.b = c$c.b;
        this.c = c$c.c;
        c$c.getClass();
        final HttpCachePolicy.b d = c$c.d;
        this.d = d;
        this.e = c$c.e;
        this.f = c$c.f;
        this.i = c$c.g;
        this.g = c$c.h;
        this.h = c$c.i;
        this.k = c$c.j;
        this.l = c$c.k;
        this.n = c$c.l;
        final List m = c$c.m;
        this.o = m;
        this.p = c$c.n;
        final List o = c$c.o;
        this.q = o;
        final List p = c$c.p;
        this.r = p;
        this.m = c$c.q;
        if ((p.isEmpty() && o.isEmpty()) || c$c.f == null) {
            this.s = Optional.absent();
        }
        else {
            final com.apollographql.apollo.internal.a.a a2 = new com.apollographql.apollo.internal.a.a();
            List<m> a3 = c$c.p;
            if (a3 == null) {
                a3 = Collections.emptyList();
            }
            a2.a = (List<m>)a3;
            List<Object> emptyList;
            if (o != null) {
                emptyList = o;
            }
            else {
                emptyList = (List<Object>)Collections.emptyList();
            }
            a2.b = (List<l>)emptyList;
            a2.c = c$c.b;
            a2.d = c$c.c;
            a2.e = c$c.e;
            a2.f = c$c.f;
            a2.g = c$c.j;
            a2.h = c$c.k;
            a2.i = c$c.l;
            a2.j = c$c.m;
            a2.k = c$c.n;
            a2.l = c$c.q;
            this.s = Optional.of(new com.apollographql.apollo.internal.a(a2));
        }
        this.x = c$c.t;
        this.t = c$c.r;
        this.y = c$c.u;
        this.w = c$c.s;
        this.z = c$c.v;
        this.A = c$c.w;
        this.B = c$c.x;
        HttpCachePolicy.b b;
        if (a instanceof m) {
            b = d;
        }
        else {
            b = null;
        }
        final h g = a.g();
        final ArrayList<ApolloInterceptor> list = new ArrayList<ApolloInterceptor>();
        final Iterator iterator = m.iterator();
        while (iterator.hasNext()) {
            final ApolloInterceptor a4 = ((r7.a)iterator.next()).a();
            if (a4 != null) {
                list.add(a4);
            }
        }
        list.addAll(this.n);
        list.add(this.i.a(this.l));
        list.add((ApolloInterceptor)new i(this.f, g, this.k, this.l, this.z));
        final r7.a p2 = this.p;
        if (p2 != null) {
            final ApolloInterceptor a5 = p2.a();
            if (a5 != null) {
                list.add(a5);
            }
        }
        else if (this.t && (a instanceof m || a instanceof j)) {
            list.add((ApolloInterceptor)new com.apollographql.apollo.interceptor.c(this.l, this.y && !(a instanceof j)));
        }
        list.add((ApolloInterceptor)new w7.k((i7.a)null, this.f.g(), g, this.e, this.l));
        Label_0808: {
            if (this.A) {
                final a b2 = this.B;
                if (b2 != null) {
                    if (!this.x && !this.y) {
                        list.add((ApolloInterceptor)new w7.a(b2));
                        break Label_0808;
                    }
                    throw new ApolloException("Batching is not supported when using HTTP Get method queries");
                }
            }
            list.add((ApolloInterceptor)new w7.m(this.b, this.c, b, this.e, this.l));
        }
        this.j = new o((ArrayList)list, 0);
    }
    
    public final void b(final Optional<ApolloCall.b<T>> optional) {
        synchronized (this) {
            final int n = c$b.a[this.u.get().ordinal()];
            if (n != 1) {
                if (n == 2) {
                    this.v.set(optional.orNull());
                    this.m.a((ApolloCall)this);
                    optional.apply((j7.a<ApolloCall.b<T>>)new c$a());
                    this.u.set(CallState.ACTIVE);
                    return;
                }
                if (n == 3) {
                    throw new ApolloCanceledException();
                }
                if (n != 4) {
                    throw new IllegalStateException("Unknown state");
                }
            }
            throw new IllegalStateException("Already Executed");
        }
    }
    
    public final void c(ApolloCall.b<T> a) {
        try {
            this.b(Optional.fromNullable(a));
            a = new ApolloInterceptor.b.a(this.a);
            final l7.a g = this.g;
            if (g == null) {
                throw new NullPointerException("cacheHeaders == null");
            }
            ((ApolloInterceptor.b.a)a).b = g;
            final z7.a h = this.h;
            if (h != null) {
                ((ApolloInterceptor.b.a)a).c = h;
                ((ApolloInterceptor.b.a)a).d = false;
                final Optional<k$a> w = this.w;
                gn.a.q0((Object)w, "optimisticUpdates == null");
                ((ApolloInterceptor.b.a)a).e = w;
                ((ApolloInterceptor.b.a)a).g = this.x;
                a = ((ApolloInterceptor.b.a)a).a();
                this.j.a((ApolloInterceptor.b)a, this.k, (ApolloInterceptor.a)new b(this));
                return;
            }
            throw new NullPointerException("requestHeaders == null");
        }
        catch (final ApolloCanceledException ex) {
            ((ApolloCall.b)a).a((ApolloException)ex);
        }
    }
    
    public final void cancel() {
        synchronized (this) {
            final int n = c$b.a[this.u.get().ordinal()];
            if (n != 1) {
                if (n == 2) {
                    this.u.set(CallState.CANCELED);
                    return;
                }
                if (n == 3) {
                    return;
                }
                if (n == 4) {
                    return;
                }
                throw new IllegalStateException("Unknown state");
            }
            this.u.set(CallState.CANCELED);
            try {
                final Iterator iterator = this.j.a.iterator();
                while (iterator.hasNext()) {
                    ((ApolloInterceptor)iterator.next()).dispose();
                }
                if (this.s.isPresent()) {
                    final Iterator iterator2 = this.s.get().b.iterator();
                    while (iterator2.hasNext()) {
                        ((c)iterator2.next()).cancel();
                    }
                }
            }
            finally {
                this.m.b((ApolloCall)this);
                this.v.set(null);
            }
        }
    }
    
    public final Object clone() throws CloneNotSupportedException {
        return new c(this.g());
    }
    
    public final Optional<ApolloCall.b<T>> d() {
        synchronized (this) {
            final int n = c$b.a[this.u.get().ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        return Optional.fromNullable(this.v.get());
                    }
                    if (n != 4) {
                        throw new IllegalStateException("Unknown state");
                    }
                }
                throw new IllegalStateException(new CallState.a(this.u.get()).a(CallState.ACTIVE, CallState.CANCELED));
            }
            return Optional.fromNullable(this.v.get());
        }
    }
    
    public final c e() {
        final u7.c i = o72.f.i;
        if (this.u.get() == CallState.IDLE) {
            final c.c$c<Object> g = this.g();
            g.g = i;
            return new c((c.c$c<T>)g);
        }
        throw new IllegalStateException("Already Executed");
    }
    
    public final Optional<ApolloCall.b<T>> f() {
        synchronized (this) {
            final int n = c$b.a[this.u.get().ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        return Optional.fromNullable(this.v.getAndSet(null));
                    }
                    if (n != 4) {
                        throw new IllegalStateException("Unknown state");
                    }
                }
                throw new IllegalStateException(new CallState.a(this.u.get()).a(CallState.ACTIVE, CallState.CANCELED));
            }
            this.m.b((ApolloCall)this);
            this.u.set(CallState.TERMINATED);
            return Optional.fromNullable(this.v.getAndSet(null));
        }
    }
    
    public final c.c$c<T> g() {
        final c.c$c c$c = new c.c$c();
        c$c.a = this.a;
        c$c.b = this.b;
        c$c.c = this.c;
        c$c.d = this.d;
        c$c.e = this.e;
        c$c.f = this.f;
        c$c.h = this.g;
        c$c.i = this.h;
        c$c.g = this.i;
        c$c.j = this.k;
        c$c.k = this.l;
        c$c.l = this.n;
        c$c.m = this.o;
        c$c.n = this.p;
        c$c.q = this.m;
        c$c.o = new ArrayList(this.q);
        c$c.p = new ArrayList(this.r);
        c$c.r = this.t;
        c$c.t = this.x;
        c$c.u = this.y;
        c$c.s = this.w;
        c$c.v = this.z;
        c$c.x = this.B;
        c$c.w = this.A;
        return (c.c$c<T>)c$c;
    }
    
    public final k operation() {
        return this.a;
    }
}
