// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.communities;

import java.util.Iterator;
import com.reddit.domain.model.Subreddit;
import java.util.Map;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import dg2.m;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.search.SearchCorrelation;
import com.reddit.events.search.SearchStructureType;
import java.util.ArrayList;
import com.reddit.data.local.PagedRequestState;
import x40.t0;
import cg.d;
import oi0.z0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import com.reddit.data.repository.posts.PagedPostResultsRepository;
import javax.inject.Inject;
import ng2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import wu1.b;
import z40.a;
import xu1.c;
import b60.h;

public final class PagedCommunityResultsRepository implements h<c, a>
{
    public final z40.a a;
    public final i70.a b;
    public final b c;
    public final wb0.b d;
    public final d20.a e;
    public final StateFlowImpl f;
    
    @Inject
    public PagedCommunityResultsRepository(final z40.a a, final i70.a b, final b c, final wb0.b d, final d20.a e) {
        ng2.e.f((Object)b, "remoteDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = a.a;
    }
    
    @Override
    public final StateFlowImpl a() {
        return this.f;
    }
    
    @Override
    public final /* bridge */ Object b(final PagedPostResultsRepository.a a, final gg2.c c) {
        return this.c((a)a, c);
    }
    
    public final Object c(final a a, final gg2.c<? super j> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof PagedCommunityResultsRepository$fetch$2) {
                final PagedCommunityResultsRepository$fetch$2 pagedCommunityResultsRepository$fetch$2 = (PagedCommunityResultsRepository$fetch$2)c;
                final int label = pagedCommunityResultsRepository$fetch$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedCommunityResultsRepository$fetch$2.label = label + Integer.MIN_VALUE;
                    o = pagedCommunityResultsRepository$fetch$2;
                    break Label_0051;
                }
            }
            o = new PagedCommunityResultsRepository$fetch$2(this, (gg2.c)c);
        }
        Object o2 = ((PagedCommunityResultsRepository$fetch$2)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedCommunityResultsRepository$fetch$2)o).label;
        final int n = 1;
        int i$0 = 0;
        boolean z$0 = false;
        PagedCommunityResultsRepository l$0 = null;
        z0 z2 = null;
        Label_0492: {
            a l$2;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        i$0 = ((PagedCommunityResultsRepository$fetch$2)o).I$0;
                        z$0 = ((PagedCommunityResultsRepository$fetch$2)o).Z$0;
                        final z0 z0 = (z0)((PagedCommunityResultsRepository$fetch$2)o).L$1;
                        l$0 = (PagedCommunityResultsRepository)((PagedCommunityResultsRepository$fetch$2)o).L$0;
                        cg.d.b4(o2);
                        z2 = z0;
                        break Label_0492;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    final a a2 = (a)((PagedCommunityResultsRepository$fetch$2)o).L$1;
                    l$0 = (PagedCommunityResultsRepository)((PagedCommunityResultsRepository$fetch$2)o).L$0;
                    cg.d.b4(o2);
                    l$2 = a2;
                }
            }
            else {
                cg.d.b4(o2);
                ((PagedCommunityResultsRepository$fetch$2)o).L$0 = this;
                l$2 = a;
                ((PagedCommunityResultsRepository$fetch$2)o).L$1 = l$2;
                ((PagedCommunityResultsRepository$fetch$2)o).label = 1;
                if (this.d((gg2.c<? super j>)o) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$0 = this;
            }
            final xu1.a a3 = l$2.a;
            final z0 b = l$2.b;
            final wu1.c c2 = l$2.c;
            z$0 = l$2.d;
            if (!z$0 && ((t0)l$0.a.a.getValue()).d == null && (((t0)l$0.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d;
            if (z$0) {
                d = null;
            }
            else {
                d = ((t0)l$0.a.a.getValue()).d;
            }
            i$0 = n;
            if (!z$0) {
                if (((t0)l$0.a.a.getValue()).b.isEmpty()) {
                    i$0 = n;
                }
                else {
                    i$0 = 0;
                }
            }
            final StateFlowImpl a4 = l$0.a.a;
            a4.setValue((Object)t0.a((t0<Object>)a4.getValue(), PagedRequestState.Loading, null, 30));
            final String query = a3.f.getQuery();
            final i70.a b2 = l$0.b;
            final z0 a5 = z0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, l$0.c.a(b.l, c2, z$0), 24575);
            ((PagedCommunityResultsRepository$fetch$2)o).L$0 = l$0;
            ((PagedCommunityResultsRepository$fetch$2)o).L$1 = b;
            ((PagedCommunityResultsRepository$fetch$2)o).Z$0 = z$0;
            ((PagedCommunityResultsRepository$fetch$2)o).I$0 = i$0;
            ((PagedCommunityResultsRepository$fetch$2)o).label = 2;
            o2 = b2.c(query, a5, a3, d, (gg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            z2 = b;
        }
        final Result result = (Result)o2;
        if (result.isSuccess() && result.getResult() != null) {
            final Object result2 = result.getResult();
            ng2.e.c(result2);
            final xu1.e e = (xu1.e)result2;
            List list = e.a;
            if (i$0 == 0) {
                list = CollectionsKt___CollectionsKt.o5((Iterable)list, (Collection)((t0)l$0.a.a.getValue()).b);
            }
            l$0.a.a.setValue((Object)new t0(PagedRequestState.Success, list, z2.k, e.b, z$0));
        }
        else {
            final StateFlowImpl a6 = l$0.a.a;
            a6.setValue((Object)t0.a((t0<Object>)a6.getValue(), PagedRequestState.Error, null, 30));
        }
        return j.a;
    }
    
    public final Object d(final gg2.c<? super j> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1) {
                final PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1 pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1 = (PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)c;
                final int label = pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1.label = label + Integer.MIN_VALUE;
                    o = pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1;
                    break Label_0047;
                }
            }
            o = new PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1(this, (gg2.c)c);
        }
        Object o2 = ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).label;
        List<T> b;
        PagedCommunityResultsRepository pagedCommunityResultsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b = (List)((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$1;
            pagedCommunityResultsRepository = (PagedCommunityResultsRepository)((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$0;
            cg.d.b4(o2);
        }
        else {
            cg.d.b4(o2);
            b = ((t0)this.a.a.getValue()).b;
            final ArrayList list = new ArrayList<String>(m.u4((Iterable)b, 10));
            final Iterator<c> iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(iterator.next().i);
            }
            final ij2.a c2 = this.e.c();
            final PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1 pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1 = new PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1(this, (List)list, (gg2.c)null);
            ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$0 = this;
            ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$1 = b;
            ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).label = 1;
            o2 = g.j((CoroutineContext)c2, (p)pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1, (gg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedCommunityResultsRepository = this;
        }
        final Map map = (Map)o2;
        final ArrayList list2 = new ArrayList<c>(m.u4((Iterable)b, 10));
        for (final c c3 : b) {
            final Subreddit subreddit = map.get(c3.i);
            c a = c3;
            if (subreddit != null) {
                final Boolean userIsSubscriber = subreddit.getUserIsSubscriber();
                a = c3;
                if (userIsSubscriber != null) {
                    a = c.a(c3, Boolean.valueOf((boolean)userIsSubscriber));
                }
            }
            list2.add(a);
        }
        final StateFlowImpl a2 = pagedCommunityResultsRepository.a.a;
        a2.setValue((Object)t0.a((t0<Object>)a2.getValue(), null, list2, 29));
        return j.a;
    }
    
    public static final class a extends b60.a
    {
        public a(final xu1.a a, final z0 z0, final wu1.c c, final boolean b) {
            e.f((Object)a, "filterValues");
            super(a, z0, c, b);
        }
    }
}
