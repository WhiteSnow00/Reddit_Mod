// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.people;

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
import kotlinx.coroutines.flow.StateFlowImpl;
import xu1.b;
import a50.a;
import yu1.e;
import z50.h;

public final class PagedPersonResultsRepository implements h<e, a>
{
    public final a50.a a;
    public final h70.a b;
    public final b c;
    public final StateFlowImpl d;
    
    @Inject
    public PagedPersonResultsRepository(final a50.a a, final h70.a b, final b c) {
        sg2.e.f((Object)b, "remoteDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a.a;
    }
    
    public final StateFlowImpl a() {
        return this.d;
    }
    
    public final Object c(final a a, final c<? super j> c) {
        PagedPersonResultsRepository$fetch$1 pagedPersonResultsRepository$fetch$2 = null;
        Label_0050: {
            if (c instanceof PagedPersonResultsRepository$fetch$1) {
                final PagedPersonResultsRepository$fetch$1 pagedPersonResultsRepository$fetch$1 = (PagedPersonResultsRepository$fetch$1)c;
                final int label = pagedPersonResultsRepository$fetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedPersonResultsRepository$fetch$1.label = label + Integer.MIN_VALUE;
                    pagedPersonResultsRepository$fetch$2 = pagedPersonResultsRepository$fetch$1;
                    break Label_0050;
                }
            }
            pagedPersonResultsRepository$fetch$2 = new PagedPersonResultsRepository$fetch$1(this, (c)c);
        }
        Object result = pagedPersonResultsRepository$fetch$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = pagedPersonResultsRepository$fetch$2.label;
        int i$0;
        boolean z$0;
        PagedPersonResultsRepository pagedPersonResultsRepository;
        u0 u2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = pagedPersonResultsRepository$fetch$2.I$0;
            z$0 = pagedPersonResultsRepository$fetch$2.Z$0;
            final u0 u0 = (u0)pagedPersonResultsRepository$fetch$2.L$1;
            pagedPersonResultsRepository = (PagedPersonResultsRepository)pagedPersonResultsRepository$fetch$2.L$0;
            yd.b.k0(result);
            u2 = u0;
        }
        else {
            yd.b.k0(result);
            final yu1.b a2 = a.a;
            final u0 b = a.b;
            final xu1.c c2 = a.c;
            z$0 = a.d;
            if (!z$0 && ((v0)this.a.a.getValue()).d == null && (((v0)this.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d;
            if (z$0) {
                d = null;
            }
            else {
                d = ((v0)this.a.a.getValue()).d;
            }
            if (!z$0 && !((v0)this.a.a.getValue()).b.isEmpty()) {
                i$0 = 0;
            }
            else {
                i$0 = 1;
            }
            final StateFlowImpl a3 = this.a.a;
            a3.setValue((Object)v0.a((v0)a3.getValue(), PagedRequestState.Loading, (ArrayList)null, 30));
            final String query = a2.f.getQuery();
            final h70.a b2 = this.b;
            final u0 a4 = u0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, this.c.b(b.l, c2, z$0), 24575);
            pagedPersonResultsRepository$fetch$2.L$0 = this;
            pagedPersonResultsRepository$fetch$2.L$1 = b;
            pagedPersonResultsRepository$fetch$2.Z$0 = z$0;
            pagedPersonResultsRepository$fetch$2.I$0 = i$0;
            pagedPersonResultsRepository$fetch$2.label = 1;
            final Object b3 = b2.b(query, a4, a2, d, (c)pagedPersonResultsRepository$fetch$2);
            if (b3 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedPersonResultsRepository = this;
            u2 = b;
            result = b3;
        }
        final Result result2 = (Result)result;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            sg2.e.c(result3);
            final f f = (f)result3;
            List list = f.a;
            if (i$0 == 0) {
                list = CollectionsKt___CollectionsKt.W3((Iterable)list, (Collection)((v0)pagedPersonResultsRepository.a.a.getValue()).b);
            }
            pagedPersonResultsRepository.a.a.setValue((Object)new v0(PagedRequestState.Success, list, u2.k, f.b, z$0));
        }
        else {
            final StateFlowImpl a5 = pagedPersonResultsRepository.a.a;
            a5.setValue((Object)v0.a((v0)a5.getValue(), PagedRequestState.Error, (ArrayList)null, 30));
        }
        return j.a;
    }
    
    public static final class a extends z50.a
    {
        public a(final yu1.b b, final u0 u0, final xu1.c c, final boolean b2) {
            sg2.e.f((Object)b, "filterValues");
            super(b, u0, c, b2);
        }
    }
}
