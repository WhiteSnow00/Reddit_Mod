// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import b60.w;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.SubredditForkingVisibility;
import javax.inject.Inject;
import sg2.e;
import com.reddit.data.room.dao.c;

public final class LocalSubredditForkingDataSource
{
    public final c a;
    
    @Inject
    public LocalSubredditForkingDataSource(final c a) {
        e.f((Object)a, "dao");
        this.a = a;
    }
    
    public final Object a(final String s, final lg2.c<? super SubredditForkingVisibility> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof LocalSubredditForkingDataSource$getForkingVisibility$1) {
                final LocalSubredditForkingDataSource$getForkingVisibility$1 localSubredditForkingDataSource$getForkingVisibility$1 = (LocalSubredditForkingDataSource$getForkingVisibility$1)c;
                final int label = localSubredditForkingDataSource$getForkingVisibility$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    localSubredditForkingDataSource$getForkingVisibility$1.label = label + Integer.MIN_VALUE;
                    o = localSubredditForkingDataSource$getForkingVisibility$1;
                    break Label_0050;
                }
            }
            o = new LocalSubredditForkingDataSource$getForkingVisibility$1(this, (lg2.c)c);
        }
        final Object result = ((LocalSubredditForkingDataSource$getForkingVisibility$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LocalSubredditForkingDataSource$getForkingVisibility$1)o).label;
        Object v;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.k0(result);
            v = result;
        }
        else {
            b.k0(result);
            final c a = this.a;
            ((LocalSubredditForkingDataSource$getForkingVisibility$1)o).label = 1;
            if ((v = a.v(s, (lg2.c<? super w>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final w w = (w)v;
        Object o2;
        if (w != null) {
            o2 = new SubredditForkingVisibility(w.b, w.c, w.d, w.e);
        }
        else {
            o2 = null;
        }
        return o2;
    }
}
