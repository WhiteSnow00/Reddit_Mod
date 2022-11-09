// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.posts;

import com.reddit.domain.model.search.SearchSource;
import java.util.Iterator;
import com.reddit.domain.model.search.Query;
import java.util.List;
import java.util.Collection;
import u20.a$b;
import u20.a$a;
import com.reddit.domain.model.search.DiscoveryUnitSearchResultKt;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult$ItemType;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult$ViewType;
import qg2.m;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.search.SearchCorrelation;
import com.reddit.events.search.SearchStructureType;
import zg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import eg.n0;
import java.util.ArrayList;
import com.reddit.data.local.PagedRequestState;
import c50.x0;
import yi0.u0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import kotlinx.coroutines.flow.StateFlowImpl;
import db0.z;
import iv1.b;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult;
import u20.a;
import g60.h;

public final class PagedPostResultsRepository implements h<u20.a<DiscoveryUnitSearchResult, Link>, a>
{
    public final i50.a a;
    public final p70.a b;
    public final b c;
    public final z d;
    public final lv1.b e;
    public final StateFlowImpl f;
    
    @Inject
    public PagedPostResultsRepository(final i50.a a, final p70.a b, final b c, final z d, final lv1.b e) {
        ah2.f.f((Object)a, "localDataSource");
        ah2.f.f((Object)b, "remoteDataSource");
        ah2.f.f((Object)c, "searchQueryIdGenerator");
        ah2.f.f((Object)d, "searchFeatures");
        ah2.f.f((Object)e, "searchMediaCache");
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
    
    public final Object c(final a l$1, final c<? super j> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1) {
                final PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1 pagedPostResultsRepository$fetch$1 = (PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)c;
                final int label = pagedPostResultsRepository$fetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedPostResultsRepository$fetch$1.label = label + Integer.MIN_VALUE;
                    o = pagedPostResultsRepository$fetch$1;
                    break Label_0050;
                }
            }
            o = new PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1(this, (c)c);
        }
        Object result = ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).label;
        boolean a = true;
        int i$0;
        boolean z$0;
        u0 u0;
        a a2;
        PagedPostResultsRepository pagedPostResultsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).I$0;
            z$0 = ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).Z$0;
            u0 = (u0)((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).L$2;
            a2 = (a)((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).L$1;
            pagedPostResultsRepository = (PagedPostResultsRepository)((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final jv1.b a3 = l$1.a;
            final u0 b = l$1.b;
            final iv1.c c2 = l$1.c;
            final boolean d = l$1.d;
            if (!d && ((x0)this.a.a.getValue()).d == null && (((x0)this.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d2;
            if (d) {
                d2 = null;
            }
            else {
                d2 = ((x0)this.a.a.getValue()).d;
            }
            if (!d && !((x0)this.a.a.getValue()).b.isEmpty()) {
                i$0 = 0;
            }
            else {
                i$0 = 1;
            }
            final StateFlowImpl a4 = this.a.a;
            a4.setValue((Object)x0.a((x0<Object>)a4.getValue(), PagedRequestState.Loading, null, 30));
            final Query f = a3.f;
            final ArrayList<String> list = new ArrayList<String>();
            String s;
            if ((s = f.getFlairApiText()) == null) {
                s = f.getFlairText();
            }
            if (s != null && n0.d0((CharSequence)s)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("flair_name:\"");
                sb.append(s);
                sb.append('\"');
                list.add(sb.toString());
            }
            if (n0.d0((CharSequence)f.getQuery())) {
                list.add(f.getQuery());
            }
            String y1;
            if (list.isEmpty() ^ true) {
                y1 = CollectionsKt___CollectionsKt.y1((Iterable)list, (CharSequence)" AND ", (String)null, (String)null, (l)null, 62);
            }
            else {
                y1 = "";
            }
            final p70.a b2 = this.b;
            final u0 a5 = yi0.u0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, this.c.b(b.l, c2, d2 == null), 24575);
            ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).L$0 = this;
            ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).L$1 = l$1;
            ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).L$2 = b;
            ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).Z$0 = d;
            ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).I$0 = i$0;
            ((PagedPostResultsRepository$fetch.PagedPostResultsRepository$fetch$1)o).label = 1;
            final Object c3 = b2.c(y1, a5, a3, d2, (Integer)null, (c)o);
            if (c3 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedPostResultsRepository = this;
            z$0 = d;
            u0 = b;
            result = c3;
            a2 = l$1;
        }
        final Result result2 = (Result)result;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            ah2.f.c(result3);
            final jv1.f f2 = (jv1.f)result3;
            final String c4 = f2.c;
            final boolean b3 = i$0 != 0;
            final List a6 = f2.a;
            pagedPostResultsRepository.getClass();
            ArrayList n2;
            if (b3) {
                if (!ah2.f.a((Object)c4, (Object)"POST_SEARCH_PROMOTED_TREND")) {
                    a = ah2.f.a((Object)c4, (Object)"POST_SEARCH_TRENDING");
                }
                if (a) {
                    final ArrayList list2 = new ArrayList(m.P0((Iterable)a6, 10));
                    final Iterator iterator = a6.iterator();
                    int n = 0;
                    while (true) {
                        n2 = list2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final Object next = iterator.next();
                        if (n < 0) {
                            ah2.c.x0();
                            throw null;
                        }
                        final Link link = (Link)next;
                        Object o2;
                        if (n == 0) {
                            DiscoveryUnitSearchResult$ViewType discoveryUnitSearchResult$ViewType;
                            if (ah2.f.a((Object)c4, (Object)"POST_SEARCH_PROMOTED_TREND")) {
                                discoveryUnitSearchResult$ViewType = DiscoveryUnitSearchResult$ViewType.PROMOTED_TREND_HERO;
                            }
                            else {
                                discoveryUnitSearchResult$ViewType = DiscoveryUnitSearchResult$ViewType.HERO;
                            }
                            final DiscoveryUnitSearchResult discoveryUnitSearchResult = DiscoveryUnitSearchResultKt.toDiscoveryUnitSearchResult(link, discoveryUnitSearchResult$ViewType, DiscoveryUnitSearchResult$ItemType.POSTS);
                            ah2.f.f((Object)discoveryUnitSearchResult, "discoveryUnitSearchResult");
                            o2 = new a$a(discoveryUnitSearchResult);
                        }
                        else {
                            ah2.f.f((Object)link, "link");
                            o2 = new a$b((Object)link);
                        }
                        list2.add(o2);
                        ++n;
                    }
                }
                else {
                    final ArrayList list3 = new ArrayList(m.P0((Iterable)a6, 10));
                    final Iterator iterator2 = a6.iterator();
                    while (true) {
                        n2 = list3;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final Link link2 = (Link)iterator2.next();
                        ah2.f.f((Object)link2, "link");
                        list3.add((Object)new a$b((Object)link2));
                    }
                }
            }
            else {
                final ArrayList list4 = new ArrayList(m.P0((Iterable)a6, 10));
                final Iterator iterator3 = a6.iterator();
                while (true) {
                    n2 = list4;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    final Link link3 = (Link)iterator3.next();
                    ah2.f.f((Object)link3, "link");
                    list4.add((Object)new a$b((Object)link3));
                }
            }
            if (i$0 == 0) {
                n2 = CollectionsKt___CollectionsKt.N1((Iterable)n2, (Collection)((x0)pagedPostResultsRepository.a.a.getValue()).b);
            }
            if (pagedPostResultsRepository.d.E6()) {
                final lv1.b e = pagedPostResultsRepository.e;
                final String string = a2.c.toString();
                final iv1.c c5 = a2.c;
                final jv1.b a7 = a2.a;
                final u0 b4 = a2.b;
                final ArrayList<Link> list5 = new ArrayList<Link>();
                final Iterator iterator4 = n2.iterator();
                while (iterator4.hasNext()) {
                    final Link link4 = (Link)((u20.a)iterator4.next()).a((l)PagedPostResultsRepository$cacheMediaPosts$1$1$1.INSTANCE, (l)PagedPostResultsRepository$cacheMediaPosts$1$1$2.INSTANCE);
                    if (link4 != null) {
                        list5.add(link4);
                    }
                }
                e.a(string, c5, a7, b4, (ArrayList)list5);
            }
            pagedPostResultsRepository.a.a.setValue((Object)new x0(PagedRequestState.Success, n2, u0.k, f2.b, z$0));
        }
        else {
            final StateFlowImpl a8 = pagedPostResultsRepository.a.a;
            a8.setValue((Object)x0.a((x0<Object>)a8.getValue(), PagedRequestState.Error, null, 30));
        }
        return j.a;
    }
    
    public static final class a extends g60.a
    {
        public a(final jv1.b b, final u0 u0, final iv1.c c, final boolean b2, final SearchSource searchSource) {
            f.f((Object)b, "filterValues");
            f.f((Object)searchSource, "source");
            super(b, u0, c, b2);
        }
    }
}
