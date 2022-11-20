// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.people;

import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.search.SearchCorrelation;
import com.reddit.events.search.SearchStructureType;
import java.util.ArrayList;
import com.reddit.data.local.PagedRequestState;
import x40.t0;
import oi0.z0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import com.reddit.data.repository.posts.PagedPostResultsRepository;
import javax.inject.Inject;
import ng2.e;
import kotlinx.coroutines.flow.StateFlowImpl;
import wu1.b;
import c50.a;
import xu1.d;
import b60.h;

public final class PagedPersonResultsRepository implements h<d, a>
{
    public final c50.a a;
    public final i70.a b;
    public final b c;
    public final StateFlowImpl d;
    
    @Inject
    public PagedPersonResultsRepository(final c50.a a, final i70.a b, final b c) {
        e.f((Object)b, "remoteDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a.a;
    }
    
    @Override
    public final StateFlowImpl a() {
        return this.d;
    }
    
    @Override
    public final /* bridge */ Object b(final PagedPostResultsRepository.a a, final c c) {
        return this.c((a)a, c);
    }
    
    public final Object c(final a a, final c<? super j> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof PagedPersonResultsRepository$fetch$1) {
                final PagedPersonResultsRepository$fetch$1 pagedPersonResultsRepository$fetch$1 = (PagedPersonResultsRepository$fetch$1)c;
                final int label = pagedPersonResultsRepository$fetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedPersonResultsRepository$fetch$1.label = label + Integer.MIN_VALUE;
                    o = pagedPersonResultsRepository$fetch$1;
                    break Label_0051;
                }
            }
            o = new PagedPersonResultsRepository$fetch$1(this, (c)c);
        }
        Object result = ((PagedPersonResultsRepository$fetch$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedPersonResultsRepository$fetch$1)o).label;
        int i$0;
        boolean z$0;
        z0 z0;
        PagedPersonResultsRepository pagedPersonResultsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = ((PagedPersonResultsRepository$fetch$1)o).I$0;
            z$0 = ((PagedPersonResultsRepository$fetch$1)o).Z$0;
            z0 = (z0)((PagedPersonResultsRepository$fetch$1)o).L$1;
            pagedPersonResultsRepository = (PagedPersonResultsRepository)((PagedPersonResultsRepository$fetch$1)o).L$0;
            cg.d.b4(result);
        }
        else {
            cg.d.b4(result);
            final xu1.a a2 = a.a;
            final z0 b = a.b;
            final wu1.c c2 = a.c;
            z$0 = a.d;
            if (!z$0 && ((t0)this.a.a.getValue()).d == null && (((t0)this.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d;
            if (z$0) {
                d = null;
            }
            else {
                d = ((t0)this.a.a.getValue()).d;
            }
            if (!z$0 && !((t0)this.a.a.getValue()).b.isEmpty()) {
                i$0 = 0;
            }
            else {
                i$0 = 1;
            }
            final StateFlowImpl a3 = this.a.a;
            a3.setValue((Object)t0.a((t0<Object>)a3.getValue(), PagedRequestState.Loading, null, 30));
            final String query = a2.f.getQuery();
            final i70.a b2 = this.b;
            final z0 a4 = oi0.z0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, this.c.a(b.l, c2, z$0), 24575);
            ((PagedPersonResultsRepository$fetch$1)o).L$0 = this;
            ((PagedPersonResultsRepository$fetch$1)o).L$1 = b;
            ((PagedPersonResultsRepository$fetch$1)o).Z$0 = z$0;
            ((PagedPersonResultsRepository$fetch$1)o).I$0 = i$0;
            ((PagedPersonResultsRepository$fetch$1)o).label = 1;
            final Object b3 = b2.b(query, a4, a2, d, (c)o);
            if (b3 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedPersonResultsRepository = this;
            z0 = b;
            result = b3;
        }
        final Result result2 = (Result)result;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            e.c(result3);
            final xu1.e e = (xu1.e)result3;
            List list = e.a;
            if (i$0 == 0) {
                list = CollectionsKt___CollectionsKt.o5((Iterable)list, (Collection)((t0)pagedPersonResultsRepository.a.a.getValue()).b);
            }
            pagedPersonResultsRepository.a.a.setValue((Object)new t0(PagedRequestState.Success, list, z0.k, e.b, z$0));
        }
        else {
            final StateFlowImpl a5 = pagedPersonResultsRepository.a.a;
            a5.setValue((Object)t0.a((t0<Object>)a5.getValue(), PagedRequestState.Error, null, 30));
        }
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
