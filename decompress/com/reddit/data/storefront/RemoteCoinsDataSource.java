// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.storefront;

import com.reddit.queries.lb$e;
import com.reddit.queries.lb$a;
import com.reddit.queries.lb$d;
import com.reddit.queries.lb$c;
import com.reddit.queries.lb;
import com.reddit.queries.jb$d;
import com.reddit.queries.jb$e;
import java.util.Iterator;
import java.util.List;
import com.reddit.queries.jb$c;
import com.reddit.queries.jb$f;
import df0.a;
import java.util.ArrayList;
import qg2.m;
import kotlin.collections.EmptyList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.queries.jb$b;
import com.reddit.queries.jb;
import df0.b;
import com.reddit.queries.c3$c;
import com.reddit.queries.c3$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.c3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteCoinsDataSource
{
    public final g a;
    
    @Inject
    public RemoteCoinsDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final c<? super Integer> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteCoinsDataSource$getIdentityCoinsBalance.RemoteCoinsDataSource$getIdentityCoinsBalance$1) {
                final RemoteCoinsDataSource$getIdentityCoinsBalance.RemoteCoinsDataSource$getIdentityCoinsBalance$1 remoteCoinsDataSource$getIdentityCoinsBalance$1 = (RemoteCoinsDataSource$getIdentityCoinsBalance.RemoteCoinsDataSource$getIdentityCoinsBalance$1)c;
                final int label = remoteCoinsDataSource$getIdentityCoinsBalance$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCoinsDataSource$getIdentityCoinsBalance$1.label = label + Integer.MIN_VALUE;
                    o = remoteCoinsDataSource$getIdentityCoinsBalance$1;
                    break Label_0047;
                }
            }
            o = new RemoteCoinsDataSource$getIdentityCoinsBalance.RemoteCoinsDataSource$getIdentityCoinsBalance$1(this, (c)c);
        }
        final Object result = ((RemoteCoinsDataSource$getIdentityCoinsBalance.RemoteCoinsDataSource$getIdentityCoinsBalance$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCoinsDataSource$getIdentityCoinsBalance.RemoteCoinsDataSource$getIdentityCoinsBalance$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final c3 c2 = new c3();
            ((RemoteCoinsDataSource$getIdentityCoinsBalance.RemoteCoinsDataSource$getIdentityCoinsBalance$1)o).label = 1;
            if ((b = e$a.b(14, (k)c2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final c3$c a2 = ((c3$b)b).a;
        Integer b2;
        if (a2 != null) {
            b2 = a2.b;
        }
        else {
            b2 = null;
        }
        return b2;
    }
    
    public final Object b(final c<? super b> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteCoinsDataSource$getSubredditCoinBalances.RemoteCoinsDataSource$getSubredditCoinBalances$1) {
                final RemoteCoinsDataSource$getSubredditCoinBalances.RemoteCoinsDataSource$getSubredditCoinBalances$1 remoteCoinsDataSource$getSubredditCoinBalances$1 = (RemoteCoinsDataSource$getSubredditCoinBalances.RemoteCoinsDataSource$getSubredditCoinBalances$1)c;
                final int label = remoteCoinsDataSource$getSubredditCoinBalances$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCoinsDataSource$getSubredditCoinBalances$1.label = label + Integer.MIN_VALUE;
                    o = remoteCoinsDataSource$getSubredditCoinBalances$1;
                    break Label_0047;
                }
            }
            o = new RemoteCoinsDataSource$getSubredditCoinBalances.RemoteCoinsDataSource$getSubredditCoinBalances$1(this, (c)c);
        }
        final Object result = ((RemoteCoinsDataSource$getSubredditCoinBalances.RemoteCoinsDataSource$getSubredditCoinBalances$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCoinsDataSource$getSubredditCoinBalances.RemoteCoinsDataSource$getSubredditCoinBalances$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final jb jb = new jb();
            ((RemoteCoinsDataSource$getSubredditCoinBalances.RemoteCoinsDataSource$getSubredditCoinBalances$1)o).label = 1;
            if ((b = e$a.b(14, (k)jb, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final jb$b jb$b = (jb$b)b;
        final jb$c a2 = jb$b.a;
        f.c((Object)a2);
        final List c2 = a2.c;
        ArrayList n1;
        if (c2 != null) {
            n1 = CollectionsKt___CollectionsKt.n1((Iterable)c2);
        }
        else {
            n1 = null;
        }
        Object instance = n1;
        if (n1 == null) {
            instance = EmptyList.INSTANCE;
        }
        final jb$c a3 = jb$b.a;
        f.c((Object)a3);
        final Integer b2 = a3.b;
        f.c((Object)b2);
        final int intValue = b2;
        final ArrayList list = new ArrayList<a>(m.P0((Iterable)instance, 10));
        for (final jb$f jb$f : instance) {
            final jb$e c3 = jb$f.c;
            f.c((Object)c3);
            final String b3 = c3.b;
            final jb$e c4 = jb$f.c;
            f.c((Object)c4);
            final String c5 = c4.c;
            final jb$e c6 = jb$f.c;
            f.c((Object)c6);
            final jb$d d = c6.d;
            f.c((Object)d);
            final Object b4 = d.b;
            f.d(b4, "null cannot be cast to non-null type kotlin.String");
            list.add(new a(b3, c5, (String)b4, jb$f.b));
        }
        return new b(intValue, list);
    }
    
    public final Object c(final String s, final c<? super Integer> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCoinsDataSource$getSubredditCoinsBalance.RemoteCoinsDataSource$getSubredditCoinsBalance$1) {
                final RemoteCoinsDataSource$getSubredditCoinsBalance.RemoteCoinsDataSource$getSubredditCoinsBalance$1 remoteCoinsDataSource$getSubredditCoinsBalance$1 = (RemoteCoinsDataSource$getSubredditCoinsBalance.RemoteCoinsDataSource$getSubredditCoinsBalance$1)c;
                final int label = remoteCoinsDataSource$getSubredditCoinsBalance$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCoinsDataSource$getSubredditCoinsBalance$1.label = label + Integer.MIN_VALUE;
                    o = remoteCoinsDataSource$getSubredditCoinsBalance$1;
                    break Label_0050;
                }
            }
            o = new RemoteCoinsDataSource$getSubredditCoinsBalance.RemoteCoinsDataSource$getSubredditCoinsBalance$1(this, (c)c);
        }
        final Object result = ((RemoteCoinsDataSource$getSubredditCoinsBalance.RemoteCoinsDataSource$getSubredditCoinsBalance$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCoinsDataSource$getSubredditCoinsBalance.RemoteCoinsDataSource$getSubredditCoinsBalance$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final lb lb = new lb(s);
            ((RemoteCoinsDataSource$getSubredditCoinsBalance.RemoteCoinsDataSource$getSubredditCoinsBalance$1)o).label = 1;
            if ((b = e$a.b(14, (k)lb, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final lb$d a2 = ((lb$c)b).a;
        f.c((Object)a2);
        final lb$a b2 = a2.b;
        f.c((Object)b2);
        final lb$e b3 = b2.b;
        int b4;
        if (b3 != null) {
            b4 = b3.b;
        }
        else {
            b4 = 0;
        }
        return new Integer(b4);
    }
}
