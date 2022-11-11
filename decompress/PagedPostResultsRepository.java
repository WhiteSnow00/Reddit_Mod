// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.posts;

import com.reddit.domain.model.search.SearchSource;
import java.util.Iterator;
import com.reddit.domain.model.search.Query;
import java.util.List;
import java.util.Collection;
import q20.a$b;
import q20.a$a;
import com.reddit.domain.model.search.DiscoveryUnitSearchResultKt;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult$ItemType;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult$ViewType;
import ig2.m;
import yu1.f;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.search.SearchCorrelation;
import com.reddit.events.search.SearchStructureType;
import rg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import com.reddit.data.local.PagedRequestState;
import v40.v0;
import oi0.u0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import va0.y;
import xu1.b;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult;
import q20.a;
import z50.h;

public final class PagedPostResultsRepository implements h<q20.a<DiscoveryUnitSearchResult, Link>, a>
{
    public final b50.a a;
    public final h70.a b;
    public final b c;
    public final y d;
    public final av1.b e;
    public final StateFlowImpl f;
    
    @Inject
    public PagedPostResultsRepository(final b50.a a, final h70.a b, final b c, final y d, final av1.b e) {
        sg2.e.f((Object)a, "localDataSource");
        sg2.e.f((Object)b, "remoteDataSource");
        sg2.e.f((Object)c, "searchQueryIdGenerator");
        sg2.e.f((Object)d, "searchFeatures");
        sg2.e.f((Object)e, "searchMediaCache");
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
            if (c instanceof PagedPostResultsRepository$fetch$1) {
                final PagedPostResultsRepository$fetch$1 pagedPostResultsRepository$fetch$1 = (PagedPostResultsRepository$fetch$1)c;
                final int label = pagedPostResultsRepository$fetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedPostResultsRepository$fetch$1.label = label + Integer.MIN_VALUE;
                    o = pagedPostResultsRepository$fetch$1;
                    break Label_0050;
                }
            }
            o = new PagedPostResultsRepository$fetch$1(this, (c)c);
        }
        Object result = ((PagedPostResultsRepository$fetch$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedPostResultsRepository$fetch$1)o).label;
        boolean a = true;
        int i$0;
        boolean z$0;
        a a2;
        PagedPostResultsRepository pagedPostResultsRepository;
        u0 u2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = ((PagedPostResultsRepository$fetch$1)o).I$0;
            z$0 = ((PagedPostResultsRepository$fetch$1)o).Z$0;
            final u0 u0 = (u0)((PagedPostResultsRepository$fetch$1)o).L$2;
            a2 = (a)((PagedPostResultsRepository$fetch$1)o).L$1;
            pagedPostResultsRepository = (PagedPostResultsRepository)((PagedPostResultsRepository$fetch$1)o).L$0;
            yd.b.k0(result);
            u2 = u0;
        }
        else {
            yd.b.k0(result);
            final yu1.b a3 = l$1.a;
            final u0 b = l$1.b;
            final xu1.c c2 = l$1.c;
            final boolean d = l$1.d;
            if (!d && ((v0)this.a.a.getValue()).d == null && (((v0)this.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d2;
            if (d) {
                d2 = null;
            }
            else {
                d2 = ((v0)this.a.a.getValue()).d;
            }
            if (!d && !((v0)this.a.a.getValue()).b.isEmpty()) {
                i$0 = 0;
            }
            else {
                i$0 = 1;
            }
            final StateFlowImpl a4 = this.a.a;
            a4.setValue((Object)v0.a((v0)a4.getValue(), PagedRequestState.Loading, (ArrayList)null, 30));
            final Query f = a3.f;
            final ArrayList<String> list = new ArrayList<String>();
            String s;
            if ((s = f.getFlairApiText()) == null) {
                s = f.getFlairText();
            }
            if (s != null && ml0.a.Y((CharSequence)s)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("flair_name:\"");
                sb.append(s);
                sb.append('\"');
                list.add(sb.toString());
            }
            if (ml0.a.Y((CharSequence)f.getQuery())) {
                list.add(f.getQuery());
            }
            String i3;
            if (list.isEmpty() ^ true) {
                i3 = CollectionsKt___CollectionsKt.I3((Iterable)list, (CharSequence)" AND ", (String)null, (String)null, (l)null, 62);
            }
            else {
                i3 = "";
            }
            final h70.a b2 = this.b;
            final u0 a5 = u0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, this.c.b(b.l, c2, d2 == null), 24575);
            ((PagedPostResultsRepository$fetch$1)o).L$0 = this;
            ((PagedPostResultsRepository$fetch$1)o).L$1 = l$1;
            ((PagedPostResultsRepository$fetch$1)o).L$2 = b;
            ((PagedPostResultsRepository$fetch$1)o).Z$0 = d;
            ((PagedPostResultsRepository$fetch$1)o).I$0 = i$0;
            ((PagedPostResultsRepository$fetch$1)o).label = 1;
            final Object c3 = b2.c(i3, a5, a3, d2, (Integer)null, (c)o);
            if (c3 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedPostResultsRepository = this;
            z$0 = d;
            u2 = b;
            result = c3;
            a2 = l$1;
        }
        final Result result2 = (Result)result;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            sg2.e.c(result3);
            final f f2 = (f)result3;
            final String c4 = f2.c;
            final boolean b3 = i$0 != 0;
            final List a6 = f2.a;
            pagedPostResultsRepository.getClass();
            ArrayList w3;
            if (b3) {
                if (!sg2.e.a((Object)c4, (Object)"POST_SEARCH_PROMOTED_TREND")) {
                    a = sg2.e.a((Object)c4, (Object)"POST_SEARCH_TRENDING");
                }
                if (a) {
                    final ArrayList list2 = new ArrayList(m.c3((Iterable)a6, 10));
                    final Iterator iterator = a6.iterator();
                    int n = 0;
                    while (true) {
                        w3 = list2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final Object next = iterator.next();
                        if (n < 0) {
                            lw0.b.I2();
                            throw null;
                        }
                        final Link link = (Link)next;
                        Object o2;
                        if (n == 0) {
                            DiscoveryUnitSearchResult$ViewType discoveryUnitSearchResult$ViewType;
                            if (sg2.e.a((Object)c4, (Object)"POST_SEARCH_PROMOTED_TREND")) {
                                discoveryUnitSearchResult$ViewType = DiscoveryUnitSearchResult$ViewType.PROMOTED_TREND_HERO;
                            }
                            else {
                                discoveryUnitSearchResult$ViewType = DiscoveryUnitSearchResult$ViewType.HERO;
                            }
                            final DiscoveryUnitSearchResult discoveryUnitSearchResult = DiscoveryUnitSearchResultKt.toDiscoveryUnitSearchResult(link, discoveryUnitSearchResult$ViewType, DiscoveryUnitSearchResult$ItemType.POSTS);
                            sg2.e.f((Object)discoveryUnitSearchResult, "discoveryUnitSearchResult");
                            o2 = new a$a(discoveryUnitSearchResult);
                        }
                        else {
                            sg2.e.f((Object)link, "link");
                            o2 = new a$b((Object)link);
                        }
                        list2.add(o2);
                        ++n;
                    }
                }
                else {
                    final ArrayList list3 = new ArrayList(m.c3((Iterable)a6, 10));
                    final Iterator iterator2 = a6.iterator();
                    while (true) {
                        w3 = list3;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final Link link2 = (Link)iterator2.next();
                        sg2.e.f((Object)link2, "link");
                        list3.add((Object)new a$b((Object)link2));
                    }
                }
            }
            else {
                final ArrayList list4 = new ArrayList(m.c3((Iterable)a6, 10));
                final Iterator iterator3 = a6.iterator();
                while (true) {
                    w3 = list4;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    final Link link3 = (Link)iterator3.next();
                    sg2.e.f((Object)link3, "link");
                    list4.add((Object)new a$b((Object)link3));
                }
            }
            if (i$0 == 0) {
                w3 = CollectionsKt___CollectionsKt.W3((Iterable)w3, (Collection)((v0)pagedPostResultsRepository.a.a.getValue()).b);
            }
            if (pagedPostResultsRepository.d.x6()) {
                final av1.b e = pagedPostResultsRepository.e;
                final String string = a2.c.toString();
                final xu1.c c5 = a2.c;
                final yu1.b a7 = a2.a;
                final u0 b4 = a2.b;
                final ArrayList<Link> list5 = new ArrayList<Link>();
                final Iterator iterator4 = w3.iterator();
                while (iterator4.hasNext()) {
                    final Link link4 = (Link)((q20.a)iterator4.next()).a((l)PagedPostResultsRepository$cacheMediaPosts$1$1$1.INSTANCE, (l)PagedPostResultsRepository$cacheMediaPosts$1$1$2.INSTANCE);
                    if (link4 != null) {
                        list5.add(link4);
                    }
                }
                e.a(string, c5, a7, b4, (ArrayList)list5);
            }
            pagedPostResultsRepository.a.a.setValue((Object)new v0(PagedRequestState.Success, (List)w3, u2.k, f2.b, z$0));
        }
        else {
            final StateFlowImpl a8 = pagedPostResultsRepository.a.a;
            a8.setValue((Object)v0.a((v0)a8.getValue(), PagedRequestState.Error, (ArrayList)null, 30));
        }
        return j.a;
    }
    
    public static final class a extends z50.a
    {
        public a(final yu1.b b, final u0 u0, final xu1.c c, final boolean b2, final SearchSource searchSource) {
            e.f((Object)b, "filterValues");
            e.f((Object)searchSource, "source");
            super(b, u0, c, b2);
        }
    }
}
