// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo;

import com.apollographql.apollo.cache.normalized.RecordFieldJsonAdapter;
import h7.o;
import java.util.Map;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import com.apollographql.apollo.subscription.SubscriptionConnectionParams;
import b8.f;
import b8.g;
import com.android.billingclient.api.a0;
import java.util.LinkedHashMap;
import m7.e;
import m7.h;
import com.apollographql.apollo.api.internal.Optional;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import com.apollographql.apollo.internal.c$c;
import h7.k$b;
import h7.k$a;
import h7.k;
import z0.c1;
import z5.c;
import u7.b;
import y7.i;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import java.util.List;
import dg.d;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy;
import java.util.concurrent.Executor;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import okhttp3.Call$Factory;
import okhttp3.HttpUrl;

public final class a
{
    public final HttpUrl a;
    public final Call$Factory b;
    public final a c;
    public final ScalarTypeAdapters d;
    public final Executor e;
    public final HttpCachePolicy.b f;
    public final p7.a g;
    public final l7.a h;
    public final d i;
    public final s7.a j;
    public final List<ApolloInterceptor> k;
    public final List<r7.a> l;
    public final r7.a m;
    public final boolean n;
    public final i o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final com.apollographql.apollo.internal.batch.a s;
    
    public a(final HttpUrl a, final Call$Factory b, final a c, final ScalarTypeAdapters d, final Executor e, final HttpCachePolicy.b f, final b g, final l7.a h, final d i, final List k, final List l, final i o, final t7.a a2) {
        this.j = new s7.a();
        this.a = a;
        this.b = b;
        final com.apollographql.apollo.internal.batch.a a3 = null;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        if (!l.isEmpty() && !k.isEmpty()) {
            throw new IllegalArgumentException("You can either use applicationInterceptors or applicationInterceptorFactories but not both at the same time.");
        }
        this.k = k;
        this.l = l;
        this.m = null;
        this.n = false;
        this.o = o;
        this.p = false;
        this.q = false;
        this.r = false;
        com.apollographql.apollo.internal.batch.a s = a3;
        if (a2.a) {
            s = new com.apollographql.apollo.internal.batch.a(a2, e, new c(a, b, d), i, new c1(3));
        }
        this.s = s;
    }
    
    public final <D extends k$a, T, V extends k$b> com.apollographql.apollo.internal.c<T> a(final k<D, T, V> a) {
        final c$c c$c = new c$c();
        c$c.a = a;
        c$c.b = this.a;
        c$c.c = this.b;
        c$c.d = this.f;
        c$c.e = this.d;
        c$c.f = this.c;
        c$c.g = this.g;
        c$c.h = this.h;
        c$c.j = this.e;
        c$c.k = this.i;
        c$c.l = this.k;
        c$c.m = this.l;
        c$c.n = this.m;
        c$c.q = this.j;
        c$c.p = new ArrayList(Collections.emptyList());
        c$c.o = new ArrayList(Collections.emptyList());
        c$c.r = this.n;
        c$c.t = this.p;
        c$c.u = this.q;
        c$c.v = this.r;
        c$c.x = this.s;
        return new com.apollographql.apollo.internal.c<T>((com.apollographql.apollo.internal.c.c$c<T>)c$c);
    }
    
    public static final class a
    {
        public Call$Factory a;
        public HttpUrl b;
        public Optional<h> c;
        public Optional<e> d;
        public HttpCachePolicy.b e;
        public b f;
        public l7.a g;
        public final LinkedHashMap h;
        public Executor i;
        public final ArrayList j;
        public final ArrayList k;
        public a0 l;
        public Optional<g.b> m;
        public f.a n;
        public long o;
        
        public a() {
            this.c = Optional.absent();
            this.d = Optional.absent();
            this.e = HttpCachePolicy.a;
            this.f = o72.f.j;
            this.g = l7.a.b;
            this.h = new LinkedHashMap();
            this.j = new ArrayList();
            this.k = new ArrayList();
            this.l = new a0();
            this.m = Optional.absent();
            this.n = new f.a(new SubscriptionConnectionParams());
            this.o = -1L;
        }
        
        public final com.apollographql.apollo.a a() {
            gn.a.q0((Object)this.b, "serverUrl is null");
            final d d = new d();
            Object a;
            if ((a = this.a) == null) {
                a = new OkHttpClient();
            }
            Executor i;
            if ((i = this.i) == null) {
                i = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), new com.apollographql.apollo.b());
            }
            final ScalarTypeAdapters scalarTypeAdapters = new ScalarTypeAdapters(Collections.unmodifiableMap((Map<? extends o, ? extends h7.b<?>>)this.h));
            Object a2 = m7.a.a;
            final Optional<h> c = this.c;
            final Optional<e> d2 = this.d;
            if (c.isPresent() && d2.isPresent()) {
                final h h = c.get();
                RecordFieldJsonAdapter.Companion.getClass();
                new RecordFieldJsonAdapter();
                h.getClass();
                a2 = new s7.c(h.a(), (e)d2.get(), scalarTypeAdapters, i, d);
            }
            Object l = this.l;
            final Optional<g.b> m = this.m;
            if (m.isPresent()) {
                l = new y7.a(scalarTypeAdapters, m.get(), this.n, i, this.o, new zg2.a<n7.f<Map<String, Object>>>() {
                    public final Object invoke() {
                        return ((m7.a)a2).g();
                    }
                });
            }
            return new com.apollographql.apollo.a(this.b, (Call$Factory)a, (m7.a)a2, scalarTypeAdapters, i, this.e, this.f, this.g, d, Collections.unmodifiableList((List<?>)this.j), Collections.unmodifiableList((List<?>)this.k), (i)l, new t7.a());
        }
    }
}
