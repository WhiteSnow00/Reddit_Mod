// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import i60.w;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.SubredditForkingVisibility;
import javax.inject.Inject;
import ah2.f;
import com.reddit.data.room.dao.c;

public final class LocalSubredditForkingDataSource
{
    public final c a;
    
    @Inject
    public LocalSubredditForkingDataSource(final c a) {
        f.f((Object)a, "dao");
        this.a = a;
    }
    
    public final Object a(final String s, final tg2.c<? super SubredditForkingVisibility> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof LocalSubredditForkingDataSource$getForkingVisibility.LocalSubredditForkingDataSource$getForkingVisibility$1) {
                final LocalSubredditForkingDataSource$getForkingVisibility.LocalSubredditForkingDataSource$getForkingVisibility$1 localSubredditForkingDataSource$getForkingVisibility$1 = (LocalSubredditForkingDataSource$getForkingVisibility.LocalSubredditForkingDataSource$getForkingVisibility$1)c;
                final int label = localSubredditForkingDataSource$getForkingVisibility$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    localSubredditForkingDataSource$getForkingVisibility$1.label = label + Integer.MIN_VALUE;
                    o = localSubredditForkingDataSource$getForkingVisibility$1;
                    break Label_0050;
                }
            }
            o = new LocalSubredditForkingDataSource$getForkingVisibility.LocalSubredditForkingDataSource$getForkingVisibility$1(this, (tg2.c)c);
        }
        final Object result = ((LocalSubredditForkingDataSource$getForkingVisibility.LocalSubredditForkingDataSource$getForkingVisibility$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LocalSubredditForkingDataSource$getForkingVisibility.LocalSubredditForkingDataSource$getForkingVisibility$1)o).label;
        Object w1;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            w1 = result;
        }
        else {
            aj2.c.Q0(result);
            final c a = this.a;
            ((LocalSubredditForkingDataSource$getForkingVisibility.LocalSubredditForkingDataSource$getForkingVisibility$1)o).label = 1;
            if ((w1 = a.w1(s, (tg2.c<? super w>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final w w2 = (w)w1;
        Object o2;
        if (w2 != null) {
            o2 = new SubredditForkingVisibility(w2.b, w2.c, w2.d, w2.e);
        }
        else {
            o2 = null;
        }
        return o2;
    }
}
