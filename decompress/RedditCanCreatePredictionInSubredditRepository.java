// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import java.util.concurrent.ConcurrentHashMap;
import q50.h;
import od0.a;

public final class RedditCanCreatePredictionInSubredditRepository implements a
{
    public final h a;
    public final ConcurrentHashMap<String, Boolean> b;
    
    @Inject
    public RedditCanCreatePredictionInSubredditRepository(final h a) {
        e.f((Object)a, "remoteGqlPredictionsDataSource");
        this.a = a;
        this.b = new ConcurrentHashMap<String, Boolean>();
    }
    
    public final Object a(String l$1, final c<? super Boolean> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1) {
                final RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 = (RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)c;
                final int label = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1.label = label + Integer.MIN_VALUE;
                    o = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1;
                    break Label_0050;
                }
            }
            o = new RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1(this, (c)c);
        }
        Object o2 = ((RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)o).label;
        RedditCanCreatePredictionInSubredditRepository redditCanCreatePredictionInSubredditRepository;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$1 = (String)((RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)o).L$1;
            redditCanCreatePredictionInSubredditRepository = (RedditCanCreatePredictionInSubredditRepository)((RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)o).L$0;
            yd.b.k0(o2);
        }
        else {
            yd.b.k0(o2);
            final Boolean b = this.b.get(l$1);
            if (b != null) {
                return b;
            }
            final h a = this.a;
            ((RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)o).L$0 = this;
            ((RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)o).L$1 = l$1;
            ((RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)o).label = 1;
            o2 = a.a(l$1, (c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditCanCreatePredictionInSubredditRepository = this;
        }
        final boolean booleanValue = (boolean)o2;
        redditCanCreatePredictionInSubredditRepository.b.put(l$1, booleanValue);
        return booleanValue;
    }
}
