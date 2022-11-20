// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.posts;

import com.reddit.domain.model.search.SearchSource;
import java.util.Iterator;
import com.reddit.domain.model.search.Query;
import java.util.List;
import java.util.Collection;
import t20.a$b;
import t20.a$a;
import com.reddit.domain.model.search.DiscoveryUnitSearchResultKt;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult$ItemType;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult$ViewType;
import dg2.m;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.search.SearchCorrelation;
import com.reddit.events.search.SearchStructureType;
import mg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import com.reddit.data.local.PagedRequestState;
import x40.t0;
import cg.d;
import oi0.z0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import wa0.x;
import wu1.b;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.search.DiscoveryUnitSearchResult;
import t20.a;
import b60.h;

public final class PagedPostResultsRepository implements h<t20.a<DiscoveryUnitSearchResult, Link>, a>
{
    public final d50.a a;
    public final i70.a b;
    public final b c;
    public final x d;
    public final zu1.b e;
    public final StateFlowImpl f;
    
    @Inject
    public PagedPostResultsRepository(final d50.a a, final i70.a b, final b c, final x d, final zu1.b e) {
        ng2.e.f((Object)a, "localDataSource");
        ng2.e.f((Object)b, "remoteDataSource");
        ng2.e.f((Object)c, "searchQueryIdGenerator");
        ng2.e.f((Object)d, "searchFeatures");
        ng2.e.f((Object)e, "searchMediaCache");
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
    public final /* bridge */ Object b(final a a, final c c) {
        return this.c(a, c);
    }
    
    public final Object c(final a l$1, final c<? super j> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof PagedPostResultsRepository$fetch$1) {
                final PagedPostResultsRepository$fetch$1 pagedPostResultsRepository$fetch$1 = (PagedPostResultsRepository$fetch$1)c;
                final int label = pagedPostResultsRepository$fetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedPostResultsRepository$fetch$1.label = label + Integer.MIN_VALUE;
                    o = pagedPostResultsRepository$fetch$1;
                    break Label_0051;
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
        z0 z2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = ((PagedPostResultsRepository$fetch$1)o).I$0;
            z$0 = ((PagedPostResultsRepository$fetch$1)o).Z$0;
            final z0 z0 = (z0)((PagedPostResultsRepository$fetch$1)o).L$2;
            a2 = (a)((PagedPostResultsRepository$fetch$1)o).L$1;
            pagedPostResultsRepository = (PagedPostResultsRepository)((PagedPostResultsRepository$fetch$1)o).L$0;
            cg.d.b4(result);
            z2 = z0;
        }
        else {
            cg.d.b4(result);
            final xu1.a a3 = l$1.a;
            final z0 b = l$1.b;
            final wu1.c c2 = l$1.c;
            final boolean d = l$1.d;
            if (!d && ((t0)this.a.a.getValue()).d == null && (((t0)this.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d2;
            if (d) {
                d2 = null;
            }
            else {
                d2 = ((t0)this.a.a.getValue()).d;
            }
            if (!d && !((t0)this.a.a.getValue()).b.isEmpty()) {
                i$0 = 0;
            }
            else {
                i$0 = 1;
            }
            final StateFlowImpl a4 = this.a.a;
            a4.setValue((Object)t0.a((t0<Object>)a4.getValue(), PagedRequestState.Loading, null, 30));
            final Query f = a3.f;
            final ArrayList<String> list = new ArrayList<String>();
            String s;
            if ((s = f.getFlairApiText()) == null) {
                s = f.getFlairText();
            }
            if (s != null && px1.a.g0((CharSequence)s)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("flair_name:\"");
                sb.append(s);
                sb.append('\"');
                list.add(sb.toString());
            }
            if (px1.a.g0((CharSequence)f.getQuery())) {
                list.add(f.getQuery());
            }
            String a5;
            if (list.isEmpty() ^ true) {
                a5 = CollectionsKt___CollectionsKt.a5((Iterable)list, (CharSequence)" AND ", (String)null, (String)null, (l)null, 62);
            }
            else {
                a5 = "";
            }
            final i70.a b2 = this.b;
            final z0 a6 = z0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, this.c.a(b.l, c2, d2 == null), 24575);
            ((PagedPostResultsRepository$fetch$1)o).L$0 = this;
            ((PagedPostResultsRepository$fetch$1)o).L$1 = l$1;
            ((PagedPostResultsRepository$fetch$1)o).L$2 = b;
            ((PagedPostResultsRepository$fetch$1)o).Z$0 = d;
            ((PagedPostResultsRepository$fetch$1)o).I$0 = i$0;
            ((PagedPostResultsRepository$fetch$1)o).label = 1;
            final Object e = b2.e(a5, a6, a3, d2, (Integer)null, (c)o);
            if (e == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedPostResultsRepository = this;
            z$0 = d;
            z2 = b;
            result = e;
            a2 = l$1;
        }
        final Result result2 = (Result)result;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            ng2.e.c(result3);
            final xu1.e e2 = (xu1.e)result3;
            final String c3 = e2.c;
            final boolean b3 = i$0 != 0;
            final List a7 = e2.a;
            pagedPostResultsRepository.getClass();
            ArrayList o2;
            if (b3) {
                if (!ng2.e.a((Object)c3, (Object)"POST_SEARCH_PROMOTED_TREND")) {
                    a = ng2.e.a((Object)c3, (Object)"POST_SEARCH_TRENDING");
                }
                if (a) {
                    final ArrayList list2 = new ArrayList(m.u4((Iterable)a7, 10));
                    final Iterator iterator = a7.iterator();
                    int n = 0;
                    while (true) {
                        o2 = list2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        final Object next = iterator.next();
                        if (n < 0) {
                            cg.d.a4();
                            throw null;
                        }
                        final Link link = (Link)next;
                        Object o3;
                        if (n == 0) {
                            DiscoveryUnitSearchResult$ViewType discoveryUnitSearchResult$ViewType;
                            if (ng2.e.a((Object)c3, (Object)"POST_SEARCH_PROMOTED_TREND")) {
                                discoveryUnitSearchResult$ViewType = DiscoveryUnitSearchResult$ViewType.PROMOTED_TREND_HERO;
                            }
                            else {
                                discoveryUnitSearchResult$ViewType = DiscoveryUnitSearchResult$ViewType.HERO;
                            }
                            final DiscoveryUnitSearchResult discoveryUnitSearchResult = DiscoveryUnitSearchResultKt.toDiscoveryUnitSearchResult(link, discoveryUnitSearchResult$ViewType, DiscoveryUnitSearchResult$ItemType.POSTS);
                            ng2.e.f((Object)discoveryUnitSearchResult, "discoveryUnitSearchResult");
                            o3 = new a$a(discoveryUnitSearchResult);
                        }
                        else {
                            ng2.e.f((Object)link, "link");
                            o3 = new a$b((Object)link);
                        }
                        list2.add(o3);
                        ++n;
                    }
                }
                else {
                    final ArrayList list3 = new ArrayList(m.u4((Iterable)a7, 10));
                    final Iterator iterator2 = a7.iterator();
                    while (true) {
                        o2 = list3;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final Link link2 = (Link)iterator2.next();
                        ng2.e.f((Object)link2, "link");
                        list3.add((Object)new a$b((Object)link2));
                    }
                }
            }
            else {
                final ArrayList list4 = new ArrayList(m.u4((Iterable)a7, 10));
                final Iterator iterator3 = a7.iterator();
                while (true) {
                    o2 = list4;
                    if (!iterator3.hasNext()) {
                        break;
                    }
                    final Link link3 = (Link)iterator3.next();
                    ng2.e.f((Object)link3, "link");
                    list4.add((Object)new a$b((Object)link3));
                }
            }
            if (i$0 == 0) {
                o2 = CollectionsKt___CollectionsKt.o5((Iterable)o2, (Collection)((t0)pagedPostResultsRepository.a.a.getValue()).b);
            }
            if (pagedPostResultsRepository.d.F6()) {
                final zu1.b e3 = pagedPostResultsRepository.e;
                final String string = a2.c.toString();
                final wu1.c c4 = a2.c;
                final xu1.a a8 = a2.a;
                final z0 b4 = a2.b;
                final ArrayList<Link> list5 = new ArrayList<Link>();
                final Iterator iterator4 = o2.iterator();
                while (iterator4.hasNext()) {
                    final Link link4 = (Link)((t20.a)iterator4.next()).a((l)PagedPostResultsRepository$cacheMediaPosts$1$1$1.INSTANCE, (l)PagedPostResultsRepository$cacheMediaPosts$1$1$2.INSTANCE);
                    if (link4 != null) {
                        list5.add(link4);
                    }
                }
                e3.a(string, c4, a8, b4, (ArrayList)list5);
            }
            pagedPostResultsRepository.a.a.setValue((Object)new t0(PagedRequestState.Success, o2, z2.k, e2.b, z$0));
        }
        else {
            final StateFlowImpl a9 = pagedPostResultsRepository.a.a;
            a9.setValue((Object)t0.a((t0<Object>)a9.getValue(), PagedRequestState.Error, null, 30));
        }
        return j.a;
    }
    
    public static final class a extends b60.a
    {
        public a(final xu1.a a, final z0 z0, final wu1.c c, final boolean b, final SearchSource searchSource) {
            e.f((Object)a, "filterValues");
            e.f((Object)searchSource, "source");
            super(a, z0, c, b);
        }
    }
}
