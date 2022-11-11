// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.mutations.w1$b;
import com.reddit.mutations.w1$d;
import com.reddit.mutations.w1$c;
import com.reddit.mutations.w1;
import g22.b0;
import java.util.Iterator;
import com.reddit.mutations.h1$b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.mutations.h1$d;
import w50.c$b;
import java.util.ArrayList;
import ig2.m;
import kotlin.collections.EmptyList;
import java.util.List;
import com.reddit.mutations.h1$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import mr0.e;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.h1;
import g22.x;
import g22.o;
import h7.h;
import ml0.a;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import w50.c$c;
import w50.c$a;
import javax.inject.Inject;
import mr0.g;
import w50.c;

public final class RemoteGqlVideoDataSource implements c
{
    public final g a;
    
    @Inject
    public RemoteGqlVideoDataSource(final g a) {
        this.a = a;
    }
    
    public final Object a(final c$a c$a, final lg2.c<? super c$c> c) {
        RemoteGqlVideoDataSource$submitProfileVideoPost$1 remoteGqlVideoDataSource$submitProfileVideoPost$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlVideoDataSource$submitProfileVideoPost$1) {
                final RemoteGqlVideoDataSource$submitProfileVideoPost$1 remoteGqlVideoDataSource$submitProfileVideoPost$1 = (RemoteGqlVideoDataSource$submitProfileVideoPost$1)c;
                final int label = remoteGqlVideoDataSource$submitProfileVideoPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlVideoDataSource$submitProfileVideoPost$1.label = label + Integer.MIN_VALUE;
                    remoteGqlVideoDataSource$submitProfileVideoPost$2 = remoteGqlVideoDataSource$submitProfileVideoPost$1;
                    break Label_0050;
                }
            }
            remoteGqlVideoDataSource$submitProfileVideoPost$2 = new RemoteGqlVideoDataSource$submitProfileVideoPost$1(this, (lg2.c)c);
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
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            String b2 = c$a.b;
            if (b2 == null || !ml0.a.Y((CharSequence)b2)) {
                b2 = null;
            }
            final g a = this.a;
            final String a2 = c$a.a;
            Object o;
            if (b2 != null) {
                o = new o(h.a.c(b2), (h)null, 2);
            }
            else {
                o = null;
            }
            final h1 h1 = new h1(new x(842784, h.a.c(c$a.k), h.a.c(c$a.j), h.a.c(c$a.e), h.a.c(c$a.d), h.a.c(c$a.f), h.a.c(o), h.a.c(c$a.g), h.a.c(c$a.h), (h)null, (h)null, (h)null, h.a.c(c$a.i), (h)null, h.a.c(c$a.l), h.a.c(c$a.m), (h)null, a2));
            remoteGqlVideoDataSource$submitProfileVideoPost$2.L$0 = this;
            remoteGqlVideoDataSource$submitProfileVideoPost$2.label = 1;
            b = e$a.b(14, (k)h1, (e)a, (RetryAlgo)null, (Map)null, (lg2.c)remoteGqlVideoDataSource$submitProfileVideoPost$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlVideoDataSource = this;
        }
        final h1$c h1$c = (h1$c)b;
        final h1$b a3 = h1$c.a;
        List c2;
        if (a3 != null) {
            c2 = a3.c;
        }
        else {
            c2 = null;
        }
        c$c c$c;
        if (c2 == null || c2.isEmpty()) {
            final h1$b a4 = h1$c.a;
            Object b3;
            if (a4 != null) {
                b3 = a4.b;
            }
            else {
                b3 = null;
            }
            sg2.e.d(b3, "null cannot be cast to non-null type kotlin.String");
            c$c = new c$c((String)b3, (List)null, 2);
        }
        else {
            final h1$b a5 = h1$c.a;
            Object o2;
            if (a5 == null || (o2 = a5.c) == null) {
                o2 = EmptyList.INSTANCE;
            }
            remoteGqlVideoDataSource.getClass();
            final ArrayList list = new ArrayList<c$b>(m.c3((Iterable)o2, 10));
            for (final h1$d h1$d : o2) {
                list.add(new c$b(h1$d.b, h1$d.c));
            }
            c$c = new c$c((String)null, CollectionsKt___CollectionsKt.q4((Iterable)list), 1);
        }
        return c$c;
    }
    
    public final Object b(final c$a c$a, final lg2.c<? super c$c> c) {
        RemoteGqlVideoDataSource$submitSubredditVideoPost$1 remoteGqlVideoDataSource$submitSubredditVideoPost$2 = null;
        Label_0050: {
            if (c instanceof RemoteGqlVideoDataSource$submitSubredditVideoPost$1) {
                final RemoteGqlVideoDataSource$submitSubredditVideoPost$1 remoteGqlVideoDataSource$submitSubredditVideoPost$1 = (RemoteGqlVideoDataSource$submitSubredditVideoPost$1)c;
                final int label = remoteGqlVideoDataSource$submitSubredditVideoPost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlVideoDataSource$submitSubredditVideoPost$1.label = label + Integer.MIN_VALUE;
                    remoteGqlVideoDataSource$submitSubredditVideoPost$2 = remoteGqlVideoDataSource$submitSubredditVideoPost$1;
                    break Label_0050;
                }
            }
            remoteGqlVideoDataSource$submitSubredditVideoPost$2 = new RemoteGqlVideoDataSource$submitSubredditVideoPost$1(this, (lg2.c)c);
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
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            String b2 = c$a.b;
            if (b2 == null || !ml0.a.Y((CharSequence)b2)) {
                b2 = null;
            }
            final g a = this.a;
            final String a2 = c$a.a;
            Object o;
            if (b2 != null) {
                o = new o(h.a.c(b2), (h)null, 2);
            }
            else {
                o = null;
            }
            final w1 w1 = new w1(new b0(a2, h.a.c(c$a.k), h.a.c(c$a.j), h.a.c(c$a.e), h.a.c(c$a.d), h.a.c(c$a.f), h.a.c(o), h.a.c(c$a.g), h.a.c(c$a.h), (h)null, (h)null, (h)null, h.a.c(c$a.i), (h)null, h.a.c(c$a.l), h.a.c(c$a.m), (h)null, c$a.c, 842784));
            remoteGqlVideoDataSource$submitSubredditVideoPost$2.L$0 = this;
            remoteGqlVideoDataSource$submitSubredditVideoPost$2.label = 1;
            b = e$a.b(14, (k)w1, (e)a, (RetryAlgo)null, (Map)null, (lg2.c)remoteGqlVideoDataSource$submitSubredditVideoPost$2, (OkHttpClient)null);
            if (b == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlVideoDataSource = this;
        }
        final w1$c w1$c = (w1$c)b;
        final w1$b a3 = w1$c.a;
        List c2;
        if (a3 != null) {
            c2 = a3.c;
        }
        else {
            c2 = null;
        }
        c$c c$c;
        if (c2 == null || c2.isEmpty()) {
            final w1$b a4 = w1$c.a;
            Object b3;
            if (a4 != null) {
                b3 = a4.b;
            }
            else {
                b3 = null;
            }
            sg2.e.d(b3, "null cannot be cast to non-null type kotlin.String");
            c$c = new c$c((String)b3, (List)null, 2);
        }
        else {
            final w1$b a5 = w1$c.a;
            Object o2;
            if (a5 == null || (o2 = a5.c) == null) {
                o2 = EmptyList.INSTANCE;
            }
            remoteGqlVideoDataSource.getClass();
            final ArrayList list = new ArrayList<c$b>(m.c3((Iterable)o2, 10));
            for (final w1$d w1$d : o2) {
                list.add(new c$b(w1$d.b, w1$d.c));
            }
            c$c = new c$c((String)null, CollectionsKt___CollectionsKt.q4((Iterable)list), 1);
        }
        return c$c;
    }
}
