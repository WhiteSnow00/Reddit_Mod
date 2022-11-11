// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.communities;

import java.util.Iterator;
import com.reddit.domain.model.Subreddit;
import java.util.Map;
import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import ig2.m;
import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import yu1.f;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.search.SearchCorrelation;
import com.reddit.events.search.SearchStructureType;
import java.util.ArrayList;
import com.reddit.data.local.PagedRequestState;
import v40.v0;
import oi0.u0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import com.reddit.data.repository.posts.PagedPostResultsRepository;
import javax.inject.Inject;
import sg2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import xu1.b;
import x40.a;
import yu1.d;
import z50.h;

public final class PagedCommunityResultsRepository implements h<d, a>
{
    public final x40.a a;
    public final h70.a b;
    public final b c;
    public final xb0.b d;
    public final a20.a e;
    public final StateFlowImpl f;
    
    @Inject
    public PagedCommunityResultsRepository(final x40.a a, final h70.a b, final b c, final xb0.b d, final a20.a e) {
        sg2.e.f((Object)b, "remoteDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = a.a;
    }
    
    public final StateFlowImpl a() {
        return this.f;
    }
    
    public final Object c(final a a, final c<? super j> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof PagedCommunityResultsRepository$fetch$2) {
                final PagedCommunityResultsRepository$fetch$2 pagedCommunityResultsRepository$fetch$2 = (PagedCommunityResultsRepository$fetch$2)c;
                final int label = pagedCommunityResultsRepository$fetch$2.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedCommunityResultsRepository$fetch$2.label = label + Integer.MIN_VALUE;
                    o = pagedCommunityResultsRepository$fetch$2;
                    break Label_0050;
                }
            }
            o = new PagedCommunityResultsRepository$fetch$2(this, (c)c);
        }
        Object o2 = ((PagedCommunityResultsRepository$fetch$2)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedCommunityResultsRepository$fetch$2)o).label;
        final int n = 1;
        int i$0 = 0;
        boolean z$0 = false;
        u0 u0 = null;
        PagedCommunityResultsRepository pagedCommunityResultsRepository = null;
        Label_0482: {
            PagedCommunityResultsRepository l$0;
            a l$2;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        i$0 = ((PagedCommunityResultsRepository$fetch$2)o).I$0;
                        z$0 = ((PagedCommunityResultsRepository$fetch$2)o).Z$0;
                        u0 = (u0)((PagedCommunityResultsRepository$fetch$2)o).L$1;
                        pagedCommunityResultsRepository = (PagedCommunityResultsRepository)((PagedCommunityResultsRepository$fetch$2)o).L$0;
                        yd.b.k0(o2);
                        break Label_0482;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    final a a2 = (a)((PagedCommunityResultsRepository$fetch$2)o).L$1;
                    l$0 = (PagedCommunityResultsRepository)((PagedCommunityResultsRepository$fetch$2)o).L$0;
                    yd.b.k0(o2);
                    l$2 = a2;
                }
            }
            else {
                yd.b.k0(o2);
                ((PagedCommunityResultsRepository$fetch$2)o).L$0 = this;
                l$2 = a;
                ((PagedCommunityResultsRepository$fetch$2)o).L$1 = l$2;
                ((PagedCommunityResultsRepository$fetch$2)o).label = 1;
                if (this.d((c<? super j>)o) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                l$0 = this;
            }
            final yu1.b a3 = l$2.a;
            final u0 b = l$2.b;
            final xu1.c c2 = l$2.c;
            z$0 = l$2.d;
            if (!z$0 && ((v0)l$0.a.a.getValue()).d == null && (((v0)l$0.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d;
            if (z$0) {
                d = null;
            }
            else {
                d = ((v0)l$0.a.a.getValue()).d;
            }
            i$0 = n;
            if (!z$0) {
                if (((v0)l$0.a.a.getValue()).b.isEmpty()) {
                    i$0 = n;
                }
                else {
                    i$0 = 0;
                }
            }
            final StateFlowImpl a4 = l$0.a.a;
            a4.setValue((Object)v0.a((v0)a4.getValue(), PagedRequestState.Loading, (ArrayList)null, 30));
            final String query = a3.f.getQuery();
            final h70.a b2 = l$0.b;
            final u0 a5 = oi0.u0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, l$0.c.b(b.l, c2, z$0), 24575);
            ((PagedCommunityResultsRepository$fetch$2)o).L$0 = l$0;
            ((PagedCommunityResultsRepository$fetch$2)o).L$1 = b;
            ((PagedCommunityResultsRepository$fetch$2)o).Z$0 = z$0;
            ((PagedCommunityResultsRepository$fetch$2)o).I$0 = i$0;
            ((PagedCommunityResultsRepository$fetch$2)o).label = 2;
            o2 = b2.d(query, a5, a3, d, (c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedCommunityResultsRepository = l$0;
            u0 = b;
        }
        final Result result = (Result)o2;
        if (result.isSuccess() && result.getResult() != null) {
            final Object result2 = result.getResult();
            sg2.e.c(result2);
            final f f = (f)result2;
            List list = f.a;
            if (i$0 == 0) {
                list = CollectionsKt___CollectionsKt.W3((Iterable)list, (Collection)((v0)pagedCommunityResultsRepository.a.a.getValue()).b);
            }
            pagedCommunityResultsRepository.a.a.setValue((Object)new v0(PagedRequestState.Success, list, u0.k, f.b, z$0));
        }
        else {
            final StateFlowImpl a6 = pagedCommunityResultsRepository.a.a;
            a6.setValue((Object)v0.a((v0)a6.getValue(), PagedRequestState.Error, (ArrayList)null, 30));
        }
        return j.a;
    }
    
    public final Object d(final c<? super j> c) {
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
            o = new PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1(this, (c)c);
        }
        Object o2 = ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).label;
        List b;
        PagedCommunityResultsRepository pagedCommunityResultsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b = (List)((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$1;
            pagedCommunityResultsRepository = (PagedCommunityResultsRepository)((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$0;
            yd.b.k0(o2);
        }
        else {
            yd.b.k0(o2);
            b = ((v0)this.a.a.getValue()).b;
            final ArrayList list = new ArrayList<String>(m.c3((Iterable)b, 10));
            final Iterator iterator = b.iterator();
            while (iterator.hasNext()) {
                list.add(((d)iterator.next()).i);
            }
            final mj2.a c2 = this.e.c();
            final PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1 pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1 = new PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1(this, (List)list, (c)null);
            ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$0 = this;
            ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).L$1 = b;
            ((PagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$1)o).label = 1;
            o2 = g.l((CoroutineContext)c2, (p)pagedCommunityResultsRepository$refreshSubscriptionStateFromLocalDataSource$localSubreddits$1, (c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedCommunityResultsRepository = this;
        }
        final Map map = (Map)o2;
        final ArrayList list2 = new ArrayList<d>(m.c3((Iterable)b, 10));
        for (final d d : b) {
            final Subreddit subreddit = map.get(d.i);
            d a = d;
            if (subreddit != null) {
                final Boolean userIsSubscriber = subreddit.getUserIsSubscriber();
                a = d;
                if (userIsSubscriber != null) {
                    a = yu1.d.a(d, Boolean.valueOf((boolean)userIsSubscriber));
                }
            }
            list2.add(a);
        }
        final StateFlowImpl a2 = pagedCommunityResultsRepository.a.a;
        a2.setValue((Object)v0.a((v0)a2.getValue(), (PagedRequestState)null, list2, 29));
        return j.a;
    }
    
    public static final class a extends z50.a
    {
        public a(final yu1.b b, final u0 u0, final xu1.c c, final boolean b2) {
            e.f((Object)b, "filterValues");
            super(b, u0, c, b2);
        }
    }
}
