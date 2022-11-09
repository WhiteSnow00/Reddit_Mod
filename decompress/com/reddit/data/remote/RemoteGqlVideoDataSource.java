// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.w1$b;
import com.reddit.mutations.w1$d;
import com.reddit.mutations.w1$c;
import com.reddit.mutations.w1;
import o22.b0;
import java.util.Iterator;
import com.reddit.mutations.h1$b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.h1$d;
import java.util.ArrayList;
import qg2.m;
import kotlin.collections.EmptyList;
import java.util.List;
import ah2.f;
import com.reddit.mutations.h1$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.h1;
import o22.x;
import h7.h;
import o22.o;
import h7.h$a;
import eg.n0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import javax.inject.Inject;
import ur0.g;
import d60.c;

public final class RemoteGqlVideoDataSource implements c
{
    public final g a;
    
    @Inject
    public RemoteGqlVideoDataSource(final g a) {
        this.a = a;
    }
    
    public final Object a(final a a, final tg2.c<? super c> c) {
        RemoteGqlVideoDataSource$submitProfileVideoPost.RemoteGqlVideoDataSource$submitProfileVideoPost$1 remoteGqlVideoDataSource$submitProfileVideoPost$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlVideoDataSource$submitProfileVideoPost.RemoteGqlVideoDataSource$submitProfileVideoPost$1) {
                final RemoteGqlVideoDataSource$submitProfileVideoPost.RemoteGqlVideoDataSource$submitProfileVideoPost$1 remoteGqlVideoDataSource$submitProfileVideoPost$1 = (RemoteGqlVideoDataSource$submitProfileVideoPost.RemoteGqlVideoDataSource$submitProfileVideoPost$1)c;
                final int label = remoteGqlVideoDataSource$submitProfileVideoPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlVideoDataSource$submitProfileVideoPost$1.label = label + Integer.MIN_VALUE;
                    remoteGqlVideoDataSource$submitProfileVideoPost$2 = remoteGqlVideoDataSource$submitProfileVideoPost$1;
                    break Label_0050;
                }
            }
            remoteGqlVideoDataSource$submitProfileVideoPost$2 = new RemoteGqlVideoDataSource$submitProfileVideoPost.RemoteGqlVideoDataSource$submitProfileVideoPost$1(this, (tg2.c)c);
        }
        final Object result = remoteGqlVideoDataSource$submitProfileVideoPost$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlVideoDataSource$submitProfileVideoPost$2.label;
        RemoteGqlVideoDataSource remoteGqlVideoDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlVideoDataSource = (RemoteGqlVideoDataSource)remoteGqlVideoDataSource$submitProfileVideoPost$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            String b2 = a.b;
            if (b2 == null || !n0.d0((CharSequence)b2)) {
                b2 = null;
            }
            final g a2 = this.a;
            final String a3 = a.a;
            Object o;
            if (b2 != null) {
                o = new o(h$a.c((Object)b2), (h)null, 2);
            }
            else {
                o = null;
            }
            final h1 h1 = new h1(new x(842784, h$a.c((Object)a.k), h$a.c((Object)a.j), h$a.c((Object)a.e), h$a.c((Object)a.d), h$a.c((Object)a.f), h$a.c(o), h$a.c((Object)a.g), h$a.c((Object)a.h), (h)null, (h)null, (h)null, h$a.c((Object)a.i), (h)null, h$a.c((Object)a.l), h$a.c((Object)a.m), (h)null, a3));
            remoteGqlVideoDataSource$submitProfileVideoPost$2.L$0 = this;
            remoteGqlVideoDataSource$submitProfileVideoPost$2.label = 1;
            b = e$a.b(14, (k)h1, (e)a2, (RetryAlgo)null, (Map)null, (tg2.c)remoteGqlVideoDataSource$submitProfileVideoPost$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlVideoDataSource = this;
        }
        final h1$c h1$c = (h1$c)b;
        final h1$b a4 = h1$c.a;
        List c2;
        if (a4 != null) {
            c2 = a4.c;
        }
        else {
            c2 = null;
        }
        c c3;
        if (c2 == null || c2.isEmpty()) {
            final h1$b a5 = h1$c.a;
            Object b3;
            if (a5 != null) {
                b3 = a5.b;
            }
            else {
                b3 = null;
            }
            f.d(b3, "null cannot be cast to non-null type kotlin.String");
            c3 = new c((String)b3, null, 2);
        }
        else {
            final h1$b a6 = h1$c.a;
            Object o2;
            if (a6 == null || (o2 = a6.c) == null) {
                o2 = EmptyList.INSTANCE;
            }
            remoteGqlVideoDataSource.getClass();
            final ArrayList list = new ArrayList<b>(m.P0((Iterable)o2, 10));
            for (final h1$d h1$d : o2) {
                list.add(new b(h1$d.b, h1$d.c));
            }
            c3 = new c(null, CollectionsKt___CollectionsKt.h2((Iterable)list), 1);
        }
        return c3;
    }
    
    public final Object b(final a a, final tg2.c<? super c> c) {
        RemoteGqlVideoDataSource$submitSubredditVideoPost.RemoteGqlVideoDataSource$submitSubredditVideoPost$1 remoteGqlVideoDataSource$submitSubredditVideoPost$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlVideoDataSource$submitSubredditVideoPost.RemoteGqlVideoDataSource$submitSubredditVideoPost$1) {
                final RemoteGqlVideoDataSource$submitSubredditVideoPost.RemoteGqlVideoDataSource$submitSubredditVideoPost$1 remoteGqlVideoDataSource$submitSubredditVideoPost$1 = (RemoteGqlVideoDataSource$submitSubredditVideoPost.RemoteGqlVideoDataSource$submitSubredditVideoPost$1)c;
                final int label = remoteGqlVideoDataSource$submitSubredditVideoPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlVideoDataSource$submitSubredditVideoPost$1.label = label + Integer.MIN_VALUE;
                    remoteGqlVideoDataSource$submitSubredditVideoPost$2 = remoteGqlVideoDataSource$submitSubredditVideoPost$1;
                    break Label_0050;
                }
            }
            remoteGqlVideoDataSource$submitSubredditVideoPost$2 = new RemoteGqlVideoDataSource$submitSubredditVideoPost.RemoteGqlVideoDataSource$submitSubredditVideoPost$1(this, (tg2.c)c);
        }
        final Object result = remoteGqlVideoDataSource$submitSubredditVideoPost$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlVideoDataSource$submitSubredditVideoPost$2.label;
        RemoteGqlVideoDataSource remoteGqlVideoDataSource;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlVideoDataSource = (RemoteGqlVideoDataSource)remoteGqlVideoDataSource$submitSubredditVideoPost$2.L$0;
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            String b2 = a.b;
            if (b2 == null || !n0.d0((CharSequence)b2)) {
                b2 = null;
            }
            final g a2 = this.a;
            final String a3 = a.a;
            Object o;
            if (b2 != null) {
                o = new o(h$a.c((Object)b2), (h)null, 2);
            }
            else {
                o = null;
            }
            final w1 w1 = new w1(new b0(a3, h$a.c((Object)a.k), h$a.c((Object)a.j), h$a.c((Object)a.e), h$a.c((Object)a.d), h$a.c((Object)a.f), h$a.c(o), h$a.c((Object)a.g), h$a.c((Object)a.h), (h)null, (h)null, (h)null, h$a.c((Object)a.i), (h)null, h$a.c((Object)a.l), h$a.c((Object)a.m), (h)null, a.c, 842784));
            remoteGqlVideoDataSource$submitSubredditVideoPost$2.L$0 = this;
            remoteGqlVideoDataSource$submitSubredditVideoPost$2.label = 1;
            b = e$a.b(14, (k)w1, (e)a2, (RetryAlgo)null, (Map)null, (tg2.c)remoteGqlVideoDataSource$submitSubredditVideoPost$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlVideoDataSource = this;
        }
        final w1$c w1$c = (w1$c)b;
        final w1$b a4 = w1$c.a;
        List c2;
        if (a4 != null) {
            c2 = a4.c;
        }
        else {
            c2 = null;
        }
        c c3;
        if (c2 == null || c2.isEmpty()) {
            final w1$b a5 = w1$c.a;
            Object b3;
            if (a5 != null) {
                b3 = a5.b;
            }
            else {
                b3 = null;
            }
            f.d(b3, "null cannot be cast to non-null type kotlin.String");
            c3 = new c((String)b3, null, 2);
        }
        else {
            final w1$b a6 = w1$c.a;
            Object o2;
            if (a6 == null || (o2 = a6.c) == null) {
                o2 = EmptyList.INSTANCE;
            }
            remoteGqlVideoDataSource.getClass();
            final ArrayList list = new ArrayList<b>(m.P0((Iterable)o2, 10));
            for (final w1$d w1$d : o2) {
                list.add(new b(w1$d.b, w1$d.c));
            }
            c3 = new c(null, CollectionsKt___CollectionsKt.h2((Iterable)list), 1);
        }
        return c3;
    }
}
