// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.storefront;

import com.reddit.queries.ob$e;
import com.reddit.queries.ob$a;
import com.reddit.queries.ob$d;
import com.reddit.queries.ob$c;
import com.reddit.queries.ob;
import com.reddit.queries.mb$d;
import com.reddit.queries.mb$e;
import java.util.Iterator;
import java.util.List;
import com.reddit.queries.mb$c;
import com.reddit.queries.mb$f;
import ue0.a;
import java.util.ArrayList;
import dg2.m;
import kotlin.collections.EmptyList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.queries.mb$b;
import com.reddit.queries.mb;
import ue0.b;
import com.reddit.queries.c3$c;
import com.reddit.queries.c3$b;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.queries.c3;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import mr0.g;

public final class RemoteCoinsDataSource
{
    public final g a;
    
    @Inject
    public RemoteCoinsDataSource(final g a) {
        e.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final c<? super Integer> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteCoinsDataSource$getIdentityCoinsBalance$1) {
                final RemoteCoinsDataSource$getIdentityCoinsBalance$1 remoteCoinsDataSource$getIdentityCoinsBalance$1 = (RemoteCoinsDataSource$getIdentityCoinsBalance$1)c;
                final int label = remoteCoinsDataSource$getIdentityCoinsBalance$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCoinsDataSource$getIdentityCoinsBalance$1.label = label + Integer.MIN_VALUE;
                    o = remoteCoinsDataSource$getIdentityCoinsBalance$1;
                    break Label_0047;
                }
            }
            o = new RemoteCoinsDataSource$getIdentityCoinsBalance$1(this, (c)c);
        }
        final Object result = ((RemoteCoinsDataSource$getIdentityCoinsBalance$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCoinsDataSource$getIdentityCoinsBalance$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            b = result;
        }
        else {
            d.b4(result);
            final g a = this.a;
            final c3 c2 = new c3();
            ((RemoteCoinsDataSource$getIdentityCoinsBalance$1)o).label = 1;
            if ((b = e$a.b(14, (k)c2, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
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
            if (c instanceof RemoteCoinsDataSource$getSubredditCoinBalances$1) {
                final RemoteCoinsDataSource$getSubredditCoinBalances$1 remoteCoinsDataSource$getSubredditCoinBalances$1 = (RemoteCoinsDataSource$getSubredditCoinBalances$1)c;
                final int label = remoteCoinsDataSource$getSubredditCoinBalances$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCoinsDataSource$getSubredditCoinBalances$1.label = label + Integer.MIN_VALUE;
                    o = remoteCoinsDataSource$getSubredditCoinBalances$1;
                    break Label_0047;
                }
            }
            o = new RemoteCoinsDataSource$getSubredditCoinBalances$1(this, (c)c);
        }
        final Object result = ((RemoteCoinsDataSource$getSubredditCoinBalances$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCoinsDataSource$getSubredditCoinBalances$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            b = result;
        }
        else {
            d.b4(result);
            final g a = this.a;
            final mb mb = new mb();
            ((RemoteCoinsDataSource$getSubredditCoinBalances$1)o).label = 1;
            if ((b = e$a.b(14, (k)mb, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final mb$b mb$b = (mb$b)b;
        final mb$c a2 = mb$b.a;
        e.c((Object)a2);
        final List c2 = a2.c;
        ArrayList q4;
        if (c2 != null) {
            q4 = CollectionsKt___CollectionsKt.Q4((Iterable)c2);
        }
        else {
            q4 = null;
        }
        Object instance = q4;
        if (q4 == null) {
            instance = EmptyList.INSTANCE;
        }
        final mb$c a3 = mb$b.a;
        e.c((Object)a3);
        final Integer b2 = a3.b;
        e.c((Object)b2);
        final int intValue = b2;
        final ArrayList list = new ArrayList<a>(m.u4((Iterable)instance, 10));
        for (final mb$f mb$f : instance) {
            final mb$e c3 = mb$f.c;
            e.c((Object)c3);
            final String b3 = c3.b;
            final mb$e c4 = mb$f.c;
            e.c((Object)c4);
            final String c5 = c4.c;
            final mb$e c6 = mb$f.c;
            e.c((Object)c6);
            final mb$d d = c6.d;
            e.c((Object)d);
            final Object b4 = d.b;
            e.d(b4, "null cannot be cast to non-null type kotlin.String");
            list.add(new a(b3, c5, (String)b4, mb$f.b));
        }
        return new b(intValue, list);
    }
    
    public final Object c(final String s, final c<? super Integer> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteCoinsDataSource$getSubredditCoinsBalance$1) {
                final RemoteCoinsDataSource$getSubredditCoinsBalance$1 remoteCoinsDataSource$getSubredditCoinsBalance$1 = (RemoteCoinsDataSource$getSubredditCoinsBalance$1)c;
                final int label = remoteCoinsDataSource$getSubredditCoinsBalance$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCoinsDataSource$getSubredditCoinsBalance$1.label = label + Integer.MIN_VALUE;
                    o = remoteCoinsDataSource$getSubredditCoinsBalance$1;
                    break Label_0051;
                }
            }
            o = new RemoteCoinsDataSource$getSubredditCoinsBalance$1(this, (c)c);
        }
        final Object result = ((RemoteCoinsDataSource$getSubredditCoinsBalance$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCoinsDataSource$getSubredditCoinsBalance$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            b = result;
        }
        else {
            d.b4(result);
            final g a = this.a;
            final ob ob = new ob(s);
            ((RemoteCoinsDataSource$getSubredditCoinsBalance$1)o).label = 1;
            if ((b = e$a.b(14, (k)ob, (mr0.e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final ob$d a2 = ((ob$c)b).a;
        e.c((Object)a2);
        final ob$a b2 = a2.b;
        e.c((Object)b2);
        final ob$e b3 = b2.b;
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
