// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal.batch;

import java.util.Collection;
import okhttp3.MediaType;
import java.util.Iterator;
import okhttp3.Callback;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import zg2.l;
import jj2.k;
import kotlin.sequences.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.Request$Builder;
import okhttp3.RequestBody;
import java.io.Closeable;
import n02.r;
import pg2.j;
import java.nio.charset.Charset;
import okio.ByteString;
import w7.m;
import com.apollographql.apollo.interceptor.ApolloInterceptor;
import java.util.ArrayList;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import okhttp3.Call$Factory;
import okhttp3.HttpUrl;
import ah2.f;
import java.util.List;
import java.util.LinkedList;
import z0.c1;
import dg.d;
import z5.c;
import java.util.concurrent.Executor;

public final class a
{
    public final t7.a a;
    public final Executor b;
    public final c c;
    public final d d;
    public final c1 e;
    public final LinkedList<t7.d> f;
    
    public a(final t7.a a, final Executor b, final c c, final d d, final c1 e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new LinkedList<t7.d>();
    }
    
    public static void a(final a a, List o) {
        f.g((Object)a, "this$0");
        f.g(o, "$batch");
        final c c = a.c;
        c.getClass();
        final t7.c c2 = new t7.c((List<t7.d>)o, (HttpUrl)c.f, (Call$Factory)c.g, (ScalarTypeAdapters)c.h);
        final ArrayList list = new ArrayList();
        for (final t7.d d : c2.a) {
            d.b.b(ApolloInterceptor.FetchSourceType.NETWORK);
            final ApolloInterceptor.b a2 = d.a;
            list.add(a2.b.d(a2.i, a2.g, c2.d));
        }
        final MediaType i = m.i;
        final rk2.c c3 = new rk2.c();
        o = new k7.c(c3);
        try {
            ((k7.c)o).b();
            for (final ByteString byteString : list) {
                final Charset defaultCharset = Charset.defaultCharset();
                f.b((Object)defaultCharset, "defaultCharset()");
                ((k7.c)o).F(byteString.string(defaultCharset));
            }
            ((k7.c)o).q();
            final j a3 = j.a;
            r.o((Closeable)o, (Throwable)null);
            o = RequestBody.create(i, c3.x1());
            o = new Request$Builder().url(c2.b).header("Accept", "application/json").header("Content-Type", "application/json").post((RequestBody)o);
            final ApolloInterceptor.b b = (ApolloInterceptor.b)kotlin.sequences.b.X0((k)kotlin.sequences.b.d1((k)CollectionsKt___CollectionsKt.e1((Iterable)c2.a), (l)BatchHttpCallImpl$execute$firstRequest$1.INSTANCE));
            for (final String s : b.d.a.keySet()) {
                ((Request$Builder)o).header(s, (String)b.d.a.get(s));
            }
            FirebasePerfOkHttpClient.enqueue(c2.c.newCall(((Request$Builder)o).build()), (Callback)new t7.b(c2));
        }
        finally {
            try {}
            finally {
                r.o((Closeable)o, (Throwable)a);
            }
        }
    }
    
    public final void b() {
        if (this.f.isEmpty()) {
            return;
        }
        final ArrayList list = new ArrayList((Collection<? extends E>)this.f);
        this.f.clear();
        final ArrayList f1 = CollectionsKt___CollectionsKt.f1((Iterable)list, this.a.c);
        final d d = this.d;
        final StringBuilder k = a.k("Executing ");
        k.append(list.size());
        k.append(" Queries in ");
        k.append(f1.size());
        k.append(" Batch(es)");
        d.N(k.toString(), new Object[0]);
        final Iterator iterator = f1.iterator();
        while (iterator.hasNext()) {
            this.b.execute(new s4.a(2, this, iterator.next()));
        }
    }
}
