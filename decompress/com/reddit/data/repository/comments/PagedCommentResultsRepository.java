// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository.comments;

import java.util.List;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.search.SearchCorrelation;
import com.reddit.events.search.SearchStructureType;
import java.util.ArrayList;
import com.reddit.data.local.PagedRequestState;
import c50.x0;
import yi0.u0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import com.reddit.data.repository.posts.PagedPostResultsRepository;
import javax.inject.Inject;
import ah2.f;
import kotlinx.coroutines.flow.StateFlowImpl;
import iv1.b;
import d50.a;
import jv1.c;
import g60.h;

public final class PagedCommentResultsRepository implements h<c, a>
{
    public final d50.a a;
    public final p70.a b;
    public final b c;
    public final StateFlowImpl d;
    
    @Inject
    public PagedCommentResultsRepository(final d50.a a, final p70.a b, final b c) {
        f.f((Object)b, "remoteDataSource");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a.a;
    }
    
    public final StateFlowImpl a() {
        return this.d;
    }
    
    public final Object c(final a a, final tg2.c<? super j> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1) {
                final PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1 pagedCommentResultsRepository$fetch$1 = (PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)c;
                final int label = pagedCommentResultsRepository$fetch$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    pagedCommentResultsRepository$fetch$1.label = label + Integer.MIN_VALUE;
                    o = pagedCommentResultsRepository$fetch$1;
                    break Label_0050;
                }
            }
            o = new PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1(this, (tg2.c)c);
        }
        Object result = ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).label;
        int i$0;
        boolean z$0;
        u0 u0;
        PagedCommentResultsRepository pagedCommentResultsRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i$0 = ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).I$0;
            z$0 = ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).Z$0;
            u0 = (u0)((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).L$1;
            pagedCommentResultsRepository = (PagedCommentResultsRepository)((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final jv1.b a2 = a.a;
            final u0 b = a.b;
            final iv1.c c2 = a.c;
            z$0 = a.d;
            if (!z$0 && ((x0)this.a.a.getValue()).d == null && (((x0)this.a.a.getValue()).b.isEmpty() ^ true)) {
                return j.a;
            }
            String d;
            if (z$0) {
                d = null;
            }
            else {
                d = ((x0)this.a.a.getValue()).d;
            }
            if (!z$0 && !((x0)this.a.a.getValue()).b.isEmpty()) {
                i$0 = 0;
            }
            else {
                i$0 = 1;
            }
            final StateFlowImpl a3 = this.a.a;
            a3.setValue((Object)x0.a((x0<Object>)a3.getValue(), PagedRequestState.Loading, null, 30));
            final String query = a2.f.getQuery();
            final p70.a b2 = this.b;
            final u0 a4 = yi0.u0.a(b, (String)null, (String)null, (Boolean)null, (Boolean)null, (SearchStructureType)null, (SearchCorrelation)null, (String)null, this.c.b(b.l, c2, z$0), 24575);
            ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).L$0 = this;
            ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).L$1 = b;
            ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).Z$0 = z$0;
            ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).I$0 = i$0;
            ((PagedCommentResultsRepository$fetch.PagedCommentResultsRepository$fetch$1)o).label = 1;
            final Object b3 = b2.b(query, a4, a2, d, (tg2.c)o);
            if (b3 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            pagedCommentResultsRepository = this;
            u0 = b;
            result = b3;
        }
        final Result result2 = (Result)result;
        if (result2.isSuccess() && result2.getResult() != null) {
            final Object result3 = result2.getResult();
            f.c(result3);
            final jv1.f f = (jv1.f)result3;
            List list = f.a;
            if (i$0 == 0) {
                list = CollectionsKt___CollectionsKt.N1((Iterable)list, (Collection)((x0)pagedCommentResultsRepository.a.a.getValue()).b);
            }
            pagedCommentResultsRepository.a.a.setValue((Object)new x0(PagedRequestState.Success, list, u0.k, f.b, z$0));
        }
        else {
            final StateFlowImpl a5 = pagedCommentResultsRepository.a.a;
            a5.setValue((Object)x0.a((x0<Object>)a5.getValue(), PagedRequestState.Error, null, 30));
        }
        return j.a;
    }
    
    public static final class a extends g60.a
    {
        public a(final jv1.b b, final u0 u0, final iv1.c c, final boolean b2) {
            f.f((Object)b, "filterValues");
            super(b, u0, c, b2);
        }
    }
}
