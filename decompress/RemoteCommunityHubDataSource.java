// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.communitycreation.SubredditNameValidationResult;
import ff2.c0;
import kotlinx.coroutines.rx2.d;
import com.reddit.domain.model.Account;
import rg2.p;
import hj2.v;
import java.util.Iterator;
import com.reddit.mutations.w0$f$a;
import com.reddit.mutations.w0$f;
import com.reddit.fragment.MyRedditSubredditFragment;
import java.io.IOException;
import xa0.b$a;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.w0;
import g22.a0;
import g22.w1;
import com.reddit.type.SubredditType;
import h7.h;
import com.reddit.mutations.w0$d;
import hg2.j;
import xa0.b$c;
import com.reddit.mutations.w0$c;
import com.reddit.mutations.w0$e;
import java.util.ArrayList;
import ig2.m;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import xa0.b$d;
import sg2.e;
import com.reddit.data.model.CommunityHubMapper;
import com.reddit.mutations.w0$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.CommunityHub;
import lg2.c;
import javax.inject.Inject;
import com.reddit.session.Session;
import xd0.b;
import xd0.g0;
import mr0.g;
import xa0.a;

public final class RemoteCommunityHubDataSource implements a
{
    public final g a;
    public final g0 b;
    public final b c;
    public final Session d;
    
    @Inject
    public RemoteCommunityHubDataSource(final g a, final g0 b, final b c, final Session d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(String s, final c<? super xa0.b<CommunityHub>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$createCommunityHub$1) {
                final RemoteCommunityHubDataSource$createCommunityHub$1 remoteCommunityHubDataSource$createCommunityHub$1 = (RemoteCommunityHubDataSource$createCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$createCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$createCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$createCommunityHub$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$createCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$createCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$createCommunityHub$1)o).label;
        final MyRedditSubredditFragment myRedditSubredditFragment = null;
        Object o2 = null;
        Label_0132: {
            if (label2 == 0) {
                break Label_0132;
            }
            Label_0111: {
                if (label2 == 1) {
                    break Label_0111;
                }
                Label_0101: {
                    if (label2 != 2) {
                        break Label_0101;
                    }
                    w0$b w0$b = (w0$b)((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0;
                    try {
                        yd.b.k0(result);
                        Block_9: {
                            CommunityHubMapper instance;
                            w0$f d;
                            MyRedditSubredditFragment a;
                            w0$f$a b;
                            ArrayList list;
                            ArrayList list2 = null;
                            List b2;
                            Iterator iterator = null;
                            Iterator iterator2;
                            RemoteCommunityHubDataSource remoteCommunityHubDataSource;
                            Object b3;
                            RemoteCommunityHubDataSource remoteCommunityHubDataSource2;
                            w0$b a2;
                            List c2;
                            Label_0300:Label_0238_Outer:
                            while (true) {
                            Block_11:
                                while (true) {
                                Label_0384_Outer:
                                    while (true) {
                                        instance = CommunityHubMapper.INSTANCE;
                                        d = w0$b.d;
                                        a = myRedditSubredditFragment;
                                        if (d != null) {
                                            b = d.b;
                                            a = myRedditSubredditFragment;
                                            if (b != null) {
                                                a = b.a;
                                            }
                                        }
                                        e.c((Object)a);
                                        o2 = new b$d((Object)instance.mapToCommunityHub(a));
                                        return o2;
                                        Label_0415: {
                                            s = (String)CollectionsKt___CollectionsKt.C3((List)list);
                                        }
                                        while (true) {
                                            Label_0348: {
                                            Label_0384:
                                                while (true) {
                                                Block_13_Outer:
                                                    while (true) {
                                                        while (true) {
                                                            Label_0428: {
                                                                break Label_0428;
                                                                Label_0331:
                                                                iftrue(Label_0428:)((s = (String)CollectionsKt___CollectionsKt.C3((List)list2)) != null);
                                                                break Label_0348;
                                                                list2 = new ArrayList<String>(m.c3((Iterable)b2, 10));
                                                                iterator = b2.iterator();
                                                                break Label_0300;
                                                                list.add((Object)((w0$e)iterator2.next()).c);
                                                                break Label_0384;
                                                                Label_0426:
                                                                s = null;
                                                                break Label_0428;
                                                                remoteCommunityHubDataSource = (RemoteCommunityHubDataSource)((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0;
                                                                yd.b.k0(result);
                                                                b3 = result;
                                                                remoteCommunityHubDataSource2 = remoteCommunityHubDataSource;
                                                                a2 = ((w0$c)b3).a;
                                                                iftrue(Label_0264:)(a2 != null);
                                                                break Block_9;
                                                            }
                                                            iftrue(Label_0444:)(s == null);
                                                            return new b$c(s);
                                                            iftrue(Label_0331:)(!iterator.hasNext());
                                                            break Block_11;
                                                            o2 = new b$c(s);
                                                            return o2;
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            iftrue(Label_0415:)(!iterator2.hasNext());
                                                            continue Label_0384_Outer;
                                                        }
                                                        Label_0264:
                                                        b2 = a2.b;
                                                        iftrue(Label_0348:)(b2 == null);
                                                        continue Block_13_Outer;
                                                    }
                                                    list = new ArrayList<String>(m.c3((Iterable)c2, 10));
                                                    iterator2 = c2.iterator();
                                                    continue Label_0384;
                                                }
                                            }
                                            c2 = a2.c;
                                            iftrue(Label_0426:)(c2 == null);
                                            continue;
                                        }
                                        Label_0444:
                                        ((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0 = a2;
                                        ((RemoteCommunityHubDataSource$createCommunityHub$1)o).label = 2;
                                        iftrue(Label_0468:)(remoteCommunityHubDataSource2.c((c<? super j>)o) != coroutine_SUSPENDED);
                                        return coroutine_SUSPENDED;
                                        Label_0468:
                                        w0$b = a2;
                                        continue Label_0238_Outer;
                                    }
                                    Label_0236: {
                                        remoteCommunityHubDataSource2 = this;
                                    }
                                    continue;
                                }
                                list2.add((Object)((w0$d)iterator.next()).c);
                                continue Label_0300;
                            }
                            yd.b.k0(result);
                            final a0 a3 = new a0(s, h.a.c(Boolean.FALSE), "", SubredditType.PUBLIC, (h)null, h.a.c(new w1(h.a.c(Boolean.TRUE))), 16);
                            final g a4 = this.a;
                            final w0 w0 = new w0(a3);
                            ((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0 = this;
                            ((RemoteCommunityHubDataSource$createCommunityHub$1)o).label = 1;
                            b3 = e$a.b(14, (k)w0, (mr0.e)a4, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                            iftrue(Label_0236:)(b3 != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                        }
                        o2 = new b$c((String)null);
                    }
                    catch (final Exception ex) {
                        o2 = new b$a();
                    }
                    catch (final IOException ex2) {
                        o2 = new b$a();
                    }
                }
            }
        }
        return o2;
    }
    
    public final v b(final String s) {
        return new v((p)new RemoteCommunityHubDataSource$loadCommunityHub$1(this, s, (c)null));
    }
    
    public final Object c(final c<? super j> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1) {
                final RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1 remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1 = (RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)c;
                final int label = remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1;
                    break Label_0047;
                }
            }
            o = new RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)o).label;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    Label_0142: {
                        final Account account = (Account)b;
                    }
                    Label_0147:
                    return j.a;
                    yd.b.k0(result);
                    final String username = this.d.getUsername();
                    iftrue(Label_0147:)(username == null);
                    final ff2.g d = this.c.d(username, false);
                    ((RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)o).label = 1;
                    iftrue(Label_0142:)((b = kotlinx.coroutines.reactive.a.b(d, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    return j.a;
                }
            }
        }
    }
    
    public final Object d(final String s, final c<? super xa0.b<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$subscribeToCommunityHub$1) {
                final RemoteCommunityHubDataSource$subscribeToCommunityHub$1 remoteCommunityHubDataSource$subscribeToCommunityHub$1 = (RemoteCommunityHubDataSource$subscribeToCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$subscribeToCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$subscribeToCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$subscribeToCommunityHub$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$subscribeToCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).label;
        b$a b$a = null;
        Label_0096: {
            if (label2 == 0) {
                break Label_0096;
            }
            Label_0086: {
                if (label2 != 1) {
                    break Label_0086;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    final Boolean b2;
                    Label_0133: {
                        b2 = (Boolean)b;
                    }
                    if (b2 == null) {
                        final b$c b$c = new b$c("failed to join my reddit");
                        return b$a;
                    }
                    final b$d b$d = new b$d((Object)b2);
                    return b$a;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    yd.b.k0(result);
                    final c0 e = this.b.e(s);
                    ((RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).label = 1;
                    iftrue(Label_0133:)((b = kotlinx.coroutines.rx2.d.b(e, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    b$a = new b$a();
                }
            }
        }
        return b$a;
    }
    
    public final Object e(final String s, final c<? super xa0.b<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1) {
                final RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1 remoteCommunityHubDataSource$unsubscribeToCommunityHub$1 = (RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$unsubscribeToCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$unsubscribeToCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$unsubscribeToCommunityHub$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).label;
        b$a b$a = null;
        Label_0096: {
            if (label2 == 0) {
                break Label_0096;
            }
            Label_0086: {
                if (label2 != 1) {
                    break Label_0086;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    final Boolean b2;
                    Label_0133: {
                        b2 = (Boolean)b;
                    }
                    if (b2 == null) {
                        final b$c b$c = new b$c("failed to leave my reddit");
                        return b$a;
                    }
                    final b$d b$d = new b$d((Object)b2);
                    return b$a;
                    yd.b.k0(result);
                    final c0 c2 = this.b.c(s);
                    ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).label = 1;
                    iftrue(Label_0133:)((b = kotlinx.coroutines.rx2.d.b(c2, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    b$a = new b$a();
                }
            }
        }
        return b$a;
    }
    
    public final Object f(final String s, final c<? super xa0.b<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$validateCommunityHubName$1) {
                final RemoteCommunityHubDataSource$validateCommunityHubName$1 remoteCommunityHubDataSource$validateCommunityHubName$1 = (RemoteCommunityHubDataSource$validateCommunityHubName$1)c;
                final int label = remoteCommunityHubDataSource$validateCommunityHubName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$validateCommunityHubName$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$validateCommunityHubName$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$validateCommunityHubName$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$validateCommunityHubName$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$validateCommunityHubName$1)o).label;
        b$a b$a = null;
        Label_0096: {
            if (label2 == 0) {
                break Label_0096;
            }
            Label_0086: {
                if (label2 != 1) {
                    break Label_0086;
                }
                try {
                    yd.b.k0(result);
                    Object b = result;
                    final SubredditNameValidationResult subredditNameValidationResult;
                    Label_0133: {
                        subredditNameValidationResult = (SubredditNameValidationResult)b;
                    }
                    if (subredditNameValidationResult.getErrorCode() == null && subredditNameValidationResult.getErrorMessage() == null) {
                        final b$d b$d = new b$d((Object)subredditNameValidationResult.isValid());
                        return b$a;
                    }
                    final b$c b$c = new b$c(subredditNameValidationResult.getErrorMessage());
                    return b$a;
                    yd.b.k0(result);
                    final c0 k = this.b.K(s);
                    ((RemoteCommunityHubDataSource$validateCommunityHubName$1)o).label = 1;
                    iftrue(Label_0133:)((b = kotlinx.coroutines.rx2.d.b(k, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    b$a = new b$a();
                }
            }
        }
        return b$a;
    }
}
