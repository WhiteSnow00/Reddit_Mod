// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.communitycreation.SubredditNameValidationResult;
import nf2.c0;
import kotlinx.coroutines.rx2.d;
import com.reddit.domain.model.Account;
import zg2.p;
import pj2.s;
import java.util.Iterator;
import com.reddit.mutations.w0$f$a;
import com.reddit.mutations.w0$f;
import com.reddit.fragment.MyRedditSubredditFragment;
import java.io.IOException;
import fb0.b$a;
import com.reddit.mutations.w0$e;
import com.reddit.mutations.w0$d;
import com.reddit.mutations.w0$c;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.w0;
import h7.h;
import o22.a0;
import o22.w1;
import com.reddit.type.SubredditType;
import h7.h$a;
import fb0.b$c;
import pg2.j;
import java.util.ArrayList;
import qg2.m;
import fb0.b$d;
import ah2.f;
import com.reddit.data.model.CommunityHubMapper;
import com.reddit.mutations.w0$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.CommunityHub;
import tg2.c;
import javax.inject.Inject;
import com.reddit.session.Session;
import ge0.b;
import ge0.o0;
import ur0.g;
import fb0.a;

public final class RemoteCommunityHubDataSource implements a
{
    public final g a;
    public final o0 b;
    public final b c;
    public final Session d;
    
    @Inject
    public RemoteCommunityHubDataSource(final g a, final o0 b, final b c, final Session d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(String s, final c<? super fb0.b<CommunityHub>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1) {
                final RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1 remoteCommunityHubDataSource$createCommunityHub$1 = (RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$createCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$createCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$createCommunityHub$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).label;
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
                    w0$b w0$b = (w0$b)((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0;
                    try {
                        aj2.c.Q0(result);
                    Label_0384:
                        while (true) {
                            CommunityHubMapper instance;
                            w0$f d;
                            MyRedditSubredditFragment a;
                            w0$f$a b;
                            List b2;
                            ArrayList list = null;
                            Iterator iterator = null;
                            w0$b a2;
                            RemoteCommunityHubDataSource remoteCommunityHubDataSource;
                            a0 a3;
                            g a4;
                            w0 w0;
                            Object b3;
                            List c2 = null;
                            Iterator iterator2 = null;
                            ArrayList list2 = null;
                            RemoteCommunityHubDataSource remoteCommunityHubDataSource2;
                            Label_0428:Block_11_Outer:
                            while (true) {
                                while (true) {
                                    Label_0300: {
                                    Block_12:
                                        while (true) {
                                            Block_10_Outer:Label_0238_Outer:
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
                                                f.c((Object)a);
                                                o2 = new b$d((Object)instance.mapToCommunityHub(a));
                                                return o2;
                                            Label_0238:
                                                while (true) {
                                                    while (true) {
                                                        list = new ArrayList<String>(m.P0((Iterable)b2, 10));
                                                        iterator = b2.iterator();
                                                        break Label_0300;
                                                        Label_0444: {
                                                            ((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0 = a2;
                                                        }
                                                        ((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).label = 2;
                                                        iftrue(Label_0468:)(remoteCommunityHubDataSource.c((c<? super j>)o) != coroutine_SUSPENDED);
                                                        return coroutine_SUSPENDED;
                                                        Label_0236:
                                                        remoteCommunityHubDataSource = this;
                                                        break Label_0238;
                                                        o2 = new b$c((String)null);
                                                        return o2;
                                                        aj2.c.Q0(result);
                                                        a3 = new a0(s, h$a.c((Object)Boolean.FALSE), "", SubredditType.PUBLIC, (h)null, h$a.c((Object)new w1(h$a.c((Object)Boolean.TRUE))), 16);
                                                        a4 = this.a;
                                                        w0 = new w0(a3);
                                                        ((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0 = this;
                                                        ((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).label = 1;
                                                        b3 = e$a.b(14, (k)w0, (e)a4, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                                                        iftrue(Label_0236:)(b3 != coroutine_SUSPENDED);
                                                        return coroutine_SUSPENDED;
                                                        iftrue(Label_0444:)(s == null);
                                                        return new b$c(s);
                                                        Label_0264:
                                                        b2 = a2.b;
                                                        iftrue(Label_0348:)(b2 == null);
                                                        continue Label_0238_Outer;
                                                    }
                                                    c2 = a2.c;
                                                    iftrue(Label_0426:)(c2 == null);
                                                    break Block_12;
                                                    iftrue(Label_0415:)(!iterator2.hasNext());
                                                    break Label_0428;
                                                    o2 = new b$c(s);
                                                    return o2;
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    Label_0415: {
                                                        s = (String)CollectionsKt___CollectionsKt.s1((List)list2);
                                                    }
                                                    continue Label_0428;
                                                    a2 = ((w0$c)b3).a;
                                                    iftrue(Label_0264:)(a2 != null);
                                                    return new b$c((String)null);
                                                    remoteCommunityHubDataSource2 = (RemoteCommunityHubDataSource)((RemoteCommunityHubDataSource$createCommunityHub.RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0;
                                                    aj2.c.Q0(result);
                                                    b3 = result;
                                                    remoteCommunityHubDataSource = remoteCommunityHubDataSource2;
                                                    continue Label_0238;
                                                }
                                                list.add(((w0$d)iterator.next()).c);
                                                break Label_0300;
                                                Label_0468: {
                                                    w0$b = a2;
                                                }
                                                continue Block_10_Outer;
                                            }
                                            Label_0331: {
                                                iftrue(Label_0428:)((s = (String)CollectionsKt___CollectionsKt.s1((List)list)) != null);
                                            }
                                            continue Block_11_Outer;
                                        }
                                        list2 = new ArrayList<String>(m.P0((Iterable)c2, 10));
                                        iterator2 = c2.iterator();
                                        continue Label_0384;
                                    }
                                    iftrue(Label_0331:)(!iterator.hasNext());
                                    continue;
                                }
                                Label_0426: {
                                    s = null;
                                }
                                continue Label_0428;
                            }
                            list2.add((Object)((w0$e)iterator2.next()).c);
                            continue Label_0384;
                        }
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
    
    public final s b(final String s) {
        return new s((p)new RemoteCommunityHubDataSource$loadCommunityHub$1(this, s, (c)null));
    }
    
    public final Object c(final c<? super j> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData.RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1) {
                final RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData.RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1 remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1 = (RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData.RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)c;
                final int label = remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1;
                    break Label_0047;
                }
            }
            o = new RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData.RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData.RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData.RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)o).label;
        Label_0090: {
            if (label2 == 0) {
                break Label_0090;
            }
            Label_0080: {
                if (label2 != 1) {
                    break Label_0080;
                }
                try {
                    aj2.c.Q0(result);
                    Object b = result;
                    Label_0142: {
                        final Account account = (Account)b;
                    }
                    Label_0147:
                    return j.a;
                    aj2.c.Q0(result);
                    final String username = this.d.getUsername();
                    iftrue(Label_0147:)(username == null);
                    final nf2.g f = this.c.f(username, false);
                    ((RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData.RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)o).label = 1;
                    iftrue(Label_0142:)((b = kotlinx.coroutines.reactive.a.b(f, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    return j.a;
                }
            }
        }
    }
    
    public final Object d(final String s, final c<? super fb0.b<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$subscribeToCommunityHub.RemoteCommunityHubDataSource$subscribeToCommunityHub$1) {
                final RemoteCommunityHubDataSource$subscribeToCommunityHub.RemoteCommunityHubDataSource$subscribeToCommunityHub$1 remoteCommunityHubDataSource$subscribeToCommunityHub$1 = (RemoteCommunityHubDataSource$subscribeToCommunityHub.RemoteCommunityHubDataSource$subscribeToCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$subscribeToCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$subscribeToCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$subscribeToCommunityHub$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$subscribeToCommunityHub.RemoteCommunityHubDataSource$subscribeToCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$subscribeToCommunityHub.RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$subscribeToCommunityHub.RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).label;
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
                    aj2.c.Q0(result);
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
                    aj2.c.Q0(result);
                    final c0 n = this.b.n(s);
                    ((RemoteCommunityHubDataSource$subscribeToCommunityHub.RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).label = 1;
                    iftrue(Label_0133:)((b = kotlinx.coroutines.rx2.d.b(n, (c)o)) != coroutine_SUSPENDED);
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
    
    public final Object e(final String s, final c<? super fb0.b<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$unsubscribeToCommunityHub.RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1) {
                final RemoteCommunityHubDataSource$unsubscribeToCommunityHub.RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1 remoteCommunityHubDataSource$unsubscribeToCommunityHub$1 = (RemoteCommunityHubDataSource$unsubscribeToCommunityHub.RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$unsubscribeToCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$unsubscribeToCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$unsubscribeToCommunityHub$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$unsubscribeToCommunityHub.RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub.RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub.RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).label;
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
                    aj2.c.Q0(result);
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
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    aj2.c.Q0(result);
                    final c0 l = this.b.l(s);
                    ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub.RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).label = 1;
                    iftrue(Label_0133:)((b = kotlinx.coroutines.rx2.d.b(l, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    b$a = new b$a();
                }
            }
        }
        return b$a;
    }
    
    public final Object f(final String s, final c<? super fb0.b<Boolean>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteCommunityHubDataSource$validateCommunityHubName.RemoteCommunityHubDataSource$validateCommunityHubName$1) {
                final RemoteCommunityHubDataSource$validateCommunityHubName.RemoteCommunityHubDataSource$validateCommunityHubName$1 remoteCommunityHubDataSource$validateCommunityHubName$1 = (RemoteCommunityHubDataSource$validateCommunityHubName.RemoteCommunityHubDataSource$validateCommunityHubName$1)c;
                final int label = remoteCommunityHubDataSource$validateCommunityHubName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$validateCommunityHubName$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$validateCommunityHubName$1;
                    break Label_0050;
                }
            }
            o = new RemoteCommunityHubDataSource$validateCommunityHubName.RemoteCommunityHubDataSource$validateCommunityHubName$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$validateCommunityHubName.RemoteCommunityHubDataSource$validateCommunityHubName$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$validateCommunityHubName.RemoteCommunityHubDataSource$validateCommunityHubName$1)o).label;
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
                    aj2.c.Q0(result);
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
                    aj2.c.Q0(result);
                    final c0 m = this.b.M(s);
                    ((RemoteCommunityHubDataSource$validateCommunityHubName.RemoteCommunityHubDataSource$validateCommunityHubName$1)o).label = 1;
                    iftrue(Label_0133:)((b = kotlinx.coroutines.rx2.d.b(m, (c)o)) != coroutine_SUSPENDED);
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
