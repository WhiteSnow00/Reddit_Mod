// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import com.reddit.domain.model.communitycreation.SubredditNameValidationResult;
import af2.c0;
import com.reddit.domain.model.Account;
import cj2.f;
import mg2.p;
import cj2.s;
import java.util.Iterator;
import com.reddit.mutations.w0$f$a;
import com.reddit.mutations.w0$f;
import com.reddit.fragment.MyRedditSubredditFragment;
import java.io.IOException;
import ya0.b$a;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import h7.k;
import mr0.e$a;
import com.reddit.mutations.w0;
import h7.h;
import y12.a0;
import y12.w1;
import com.reddit.type.SubredditType;
import h7.h$a;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import cg2.j;
import java.util.ArrayList;
import dg2.m;
import com.reddit.mutations.w0$e;
import com.reddit.mutations.w0$d;
import ya0.b$c;
import com.reddit.mutations.w0$c;
import ya0.b$d;
import ng2.e;
import com.reddit.data.model.CommunityHubMapper;
import cg.d;
import com.reddit.mutations.w0$b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.CommunityHub;
import gg2.c;
import javax.inject.Inject;
import com.reddit.session.Session;
import xd0.b;
import xd0.h0;
import mr0.g;
import ya0.a;

public final class RemoteCommunityHubDataSource implements a
{
    public final g a;
    public final h0 b;
    public final b c;
    public final Session d;
    
    @Inject
    public RemoteCommunityHubDataSource(final g a, final h0 b, final b c, final Session d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(String s, final c<? super ya0.b<CommunityHub>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteCommunityHubDataSource$createCommunityHub$1) {
                final RemoteCommunityHubDataSource$createCommunityHub$1 remoteCommunityHubDataSource$createCommunityHub$1 = (RemoteCommunityHubDataSource$createCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$createCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$createCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$createCommunityHub$1;
                    break Label_0051;
                }
            }
            o = new RemoteCommunityHubDataSource$createCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$createCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$createCommunityHub$1)o).label;
        final MyRedditSubredditFragment myRedditSubredditFragment = null;
        Object o2 = null;
        Label_0134: {
            if (label2 == 0) {
                break Label_0134;
            }
            Label_0110: {
                if (label2 == 1) {
                    break Label_0110;
                }
                Label_0100: {
                    if (label2 != 2) {
                        break Label_0100;
                    }
                    w0$b w0$b = (w0$b)((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0;
                    try {
                        cg.d.b4(result);
                        CommunityHubMapper instance;
                        w0$f d;
                        MyRedditSubredditFragment a;
                        w0$f$a b;
                        w0$b a2;
                        List c2;
                        Object b2;
                        RemoteCommunityHubDataSource remoteCommunityHubDataSource;
                        ArrayList list;
                        Iterator iterator;
                        ArrayList list2;
                        Iterator iterator2 = null;
                        List b3;
                        RemoteCommunityHubDataSource remoteCommunityHubDataSource2;
                        Label_0249:Label_0311_Outer:Block_10_Outer:
                        while (true) {
                            while (true) {
                            Label_0311:
                                while (true) {
                                    while (true) {
                                    Block_11_Outer:
                                        while (true) {
                                            while (true) {
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
                                                    c2 = a2.c;
                                                    iftrue(Label_0437:)(c2 == null);
                                                    Block_12: {
                                                        break Block_12;
                                                        a2 = ((w0$c)b2).a;
                                                        iftrue(Label_0275:)(a2 != null);
                                                        o2 = new b$c((String)null);
                                                        return o2;
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        o2 = new b$c(s);
                                                        return o2;
                                                        Label_0246: {
                                                            remoteCommunityHubDataSource = this;
                                                        }
                                                        continue Label_0249;
                                                        list.add(((w0$d)iterator.next()).c);
                                                        break Label_0311;
                                                        list2.add(((w0$e)iterator2.next()).c);
                                                        break Block_11_Outer;
                                                    }
                                                    list2 = new ArrayList<String>(m.u4((Iterable)c2, 10));
                                                    iterator2 = c2.iterator();
                                                    break Block_11_Outer;
                                                    Label_0455: {
                                                        ((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0 = a2;
                                                    }
                                                    ((RemoteCommunityHubDataSource$createCommunityHub$1)o).label = 2;
                                                    iftrue(Label_0480:)(remoteCommunityHubDataSource.c((c<? super j>)o) != coroutine_SUSPENDED);
                                                    return coroutine_SUSPENDED;
                                                    Label_0480:
                                                    w0$b = a2;
                                                    continue Block_11_Outer;
                                                }
                                                iftrue(Label_0342:)(!iterator.hasNext());
                                                continue Label_0311_Outer;
                                            }
                                            Label_0426: {
                                                s = (String)CollectionsKt___CollectionsKt.U4((List)list2);
                                            }
                                            break Label_0311;
                                            Label_0342:
                                            iftrue(Label_0439:)((s = (String)CollectionsKt___CollectionsKt.U4((List)list)) != null);
                                            continue Block_11_Outer;
                                        }
                                        iftrue(Label_0426:)(!iterator2.hasNext());
                                        continue Block_10_Outer;
                                    }
                                    Label_0437: {
                                        s = null;
                                    }
                                    break Label_0311;
                                    list = new ArrayList<String>(m.u4((Iterable)b3, 10));
                                    iterator = b3.iterator();
                                    continue Label_0311;
                                }
                                iftrue(Label_0455:)(s == null);
                                return new b$c(s);
                                Label_0275: {
                                    b3 = a2.b;
                                }
                                iftrue(Label_0359:)(b3 == null);
                                continue;
                            }
                            remoteCommunityHubDataSource2 = (RemoteCommunityHubDataSource)((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0;
                            cg.d.b4(result);
                            b2 = result;
                            remoteCommunityHubDataSource = remoteCommunityHubDataSource2;
                            continue Label_0249;
                        }
                        cg.d.b4(result);
                        final a0 a3 = new a0(s, h$a.c((Object)Boolean.FALSE), "", SubredditType.PUBLIC, (h)null, h$a.c((Object)new w1(h$a.c((Object)Boolean.TRUE))), 16);
                        final g a4 = this.a;
                        final w0 w0 = new w0(a3);
                        ((RemoteCommunityHubDataSource$createCommunityHub$1)o).L$0 = this;
                        ((RemoteCommunityHubDataSource$createCommunityHub$1)o).label = 1;
                        b2 = e$a.b(14, (k)w0, (mr0.e)a4, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null);
                        iftrue(Label_0246:)(b2 != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
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
        return new s((p<? super f<? super T>, ? super c<? super j>, ?>)new RemoteCommunityHubDataSource$loadCommunityHub$1(this, s, (c)null));
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
                    cg.d.b4(result);
                    Object b = result;
                    Label_0142: {
                        final Account account = (Account)b;
                    }
                    Label_0147:
                    return j.a;
                    cg.d.b4(result);
                    final String username = this.d.getUsername();
                    iftrue(Label_0147:)(username == null);
                    final af2.g<Account> f = this.c.f(username, false);
                    ((RemoteCommunityHubDataSource$silentlyFetchAndCacheAccountData$1)o).label = 1;
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
    
    public final Object d(final String s, final c<? super ya0.b<Boolean>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteCommunityHubDataSource$subscribeToCommunityHub$1) {
                final RemoteCommunityHubDataSource$subscribeToCommunityHub$1 remoteCommunityHubDataSource$subscribeToCommunityHub$1 = (RemoteCommunityHubDataSource$subscribeToCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$subscribeToCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$subscribeToCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$subscribeToCommunityHub$1;
                    break Label_0051;
                }
            }
            o = new RemoteCommunityHubDataSource$subscribeToCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).label;
        b$a b$a = null;
        Label_0097: {
            if (label2 == 0) {
                break Label_0097;
            }
            Label_0087: {
                if (label2 != 1) {
                    break Label_0087;
                }
                try {
                    cg.d.b4(result);
                    Object b = result;
                    final Boolean b2;
                    Label_0135: {
                        b2 = (Boolean)b;
                    }
                    if (b2 == null) {
                        final b$c b$c = new b$c("failed to join my reddit");
                        return b$a;
                    }
                    final b$d b$d = new b$d((Object)b2);
                    return b$a;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    cg.d.b4(result);
                    final c0<Boolean> e = this.b.e(s);
                    ((RemoteCommunityHubDataSource$subscribeToCommunityHub$1)o).label = 1;
                    iftrue(Label_0135:)((b = kotlinx.coroutines.rx2.d.b(e, (c)o)) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    b$a = new b$a();
                }
            }
        }
        return b$a;
    }
    
    public final Object e(final String s, final c<? super ya0.b<Boolean>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1) {
                final RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1 remoteCommunityHubDataSource$unsubscribeToCommunityHub$1 = (RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)c;
                final int label = remoteCommunityHubDataSource$unsubscribeToCommunityHub$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$unsubscribeToCommunityHub$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$unsubscribeToCommunityHub$1;
                    break Label_0051;
                }
            }
            o = new RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).label;
        b$a b$a = null;
        Label_0097: {
            if (label2 == 0) {
                break Label_0097;
            }
            Label_0087: {
                if (label2 != 1) {
                    break Label_0087;
                }
                try {
                    cg.d.b4(result);
                    Object b = result;
                    final Boolean b2;
                    Label_0135: {
                        b2 = (Boolean)b;
                    }
                    if (b2 == null) {
                        final b$c b$c = new b$c("failed to leave my reddit");
                        return b$a;
                    }
                    final b$d b$d = new b$d((Object)b2);
                    return b$a;
                    cg.d.b4(result);
                    final c0<Boolean> c2 = this.b.c(s);
                    ((RemoteCommunityHubDataSource$unsubscribeToCommunityHub$1)o).label = 1;
                    iftrue(Label_0135:)((b = kotlinx.coroutines.rx2.d.b(c2, (c)o)) != coroutine_SUSPENDED);
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
    
    public final Object f(final String s, final c<? super ya0.b<Boolean>> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RemoteCommunityHubDataSource$validateCommunityHubName$1) {
                final RemoteCommunityHubDataSource$validateCommunityHubName$1 remoteCommunityHubDataSource$validateCommunityHubName$1 = (RemoteCommunityHubDataSource$validateCommunityHubName$1)c;
                final int label = remoteCommunityHubDataSource$validateCommunityHubName$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteCommunityHubDataSource$validateCommunityHubName$1.label = label + Integer.MIN_VALUE;
                    o = remoteCommunityHubDataSource$validateCommunityHubName$1;
                    break Label_0051;
                }
            }
            o = new RemoteCommunityHubDataSource$validateCommunityHubName$1(this, (c)c);
        }
        final Object result = ((RemoteCommunityHubDataSource$validateCommunityHubName$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteCommunityHubDataSource$validateCommunityHubName$1)o).label;
        b$a b$a = null;
        Label_0097: {
            if (label2 == 0) {
                break Label_0097;
            }
            Label_0087: {
                if (label2 != 1) {
                    break Label_0087;
                }
                try {
                    cg.d.b4(result);
                    Object b = result;
                    final SubredditNameValidationResult subredditNameValidationResult;
                    Label_0135: {
                        subredditNameValidationResult = (SubredditNameValidationResult)b;
                    }
                    if (subredditNameValidationResult.getErrorCode() == null && subredditNameValidationResult.getErrorMessage() == null) {
                        final b$d b$d = new b$d((Object)subredditNameValidationResult.isValid());
                        return b$a;
                    }
                    final b$c b$c = new b$c(subredditNameValidationResult.getErrorMessage());
                    return b$a;
                    cg.d.b4(result);
                    final c0<SubredditNameValidationResult> f = this.b.F(s);
                    ((RemoteCommunityHubDataSource$validateCommunityHubName$1)o).label = 1;
                    iftrue(Label_0135:)((b = kotlinx.coroutines.rx2.d.b(f, (c)o)) != coroutine_SUSPENDED);
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
