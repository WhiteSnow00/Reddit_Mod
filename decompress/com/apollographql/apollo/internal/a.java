// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal;

import h7.k;
import java.util.Collections;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import java.util.concurrent.Executor;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import okhttp3.Call$Factory;
import okhttp3.HttpUrl;
import java.util.Iterator;
import o72.f;
import com.apollographql.apollo.api.cache.http.HttpCachePolicy;
import h7.m;
import java.util.concurrent.atomic.AtomicBoolean;
import h7.l;
import java.util.List;
import java.util.ArrayList;
import dg.d;

public final class a
{
    public final d a;
    public final ArrayList b;
    public List<l> c;
    public a d;
    public final AtomicBoolean e;
    
    public a(final a a) {
        this.e = new AtomicBoolean();
        this.a = a.h;
        this.b = new ArrayList(a.a.size());
        for (final m a2 : a.a) {
            final ArrayList b = this.b;
            final c$c c$c = new c$c();
            c$c.a = (k)a2;
            c$c.b = a.c;
            c$c.c = a.d;
            c$c.e = a.e;
            c$c.f = a.f;
            c$c.d = HttpCachePolicy.a;
            c$c.g = f.i;
            c$c.h = l7.a.b;
            c$c.k = a.h;
            c$c.l = a.i;
            c$c.m = a.j;
            c$c.n = a.k;
            c$c.q = a.l;
            c$c.j = a.g;
            b.add(new c((c.c$c<Object>)c$c));
        }
        this.c = a.b;
        this.d = a.l;
    }
    
    public static final class a
    {
        public List<m> a;
        public List<l> b;
        public HttpUrl c;
        public Call$Factory d;
        public ScalarTypeAdapters e;
        public m7.a f;
        public Executor g;
        public d h;
        public List<ApolloInterceptor> i;
        public List<r7.a> j;
        public r7.a k;
        public s7.a l;
        
        public a() {
            this.a = (List<m>)Collections.emptyList();
            this.b = Collections.emptyList();
        }
    }
}
