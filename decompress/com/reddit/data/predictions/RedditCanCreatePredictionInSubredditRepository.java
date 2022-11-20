// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import java.util.concurrent.ConcurrentHashMap;
import s50.g;
import od0.a;

public final class RedditCanCreatePredictionInSubredditRepository implements a
{
    public final g a;
    public final ConcurrentHashMap<String, Boolean> b;
    
    @Inject
    public RedditCanCreatePredictionInSubredditRepository(final g a) {
        e.f((Object)a, "remoteGqlPredictionsDataSource");
        this.a = a;
        this.b = new ConcurrentHashMap<String, Boolean>();
    }
    
    public final Object a(final String l$1, final c<? super Boolean> c) {
        RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2 = null;
        Label_0051: {
            if (c instanceof RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1) {
                final RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 = (RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)c;
                final int label = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1.label = label + Integer.MIN_VALUE;
                    redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2 = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1;
                    break Label_0051;
                }
            }
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2 = new RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1(this, (c)c);
        }
        Object o = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.label;
        RedditCanCreatePredictionInSubredditRepository redditCanCreatePredictionInSubredditRepository;
        String s2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final String s = (String)redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.L$1;
            redditCanCreatePredictionInSubredditRepository = (RedditCanCreatePredictionInSubredditRepository)redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.L$0;
            d.b4(o);
            s2 = s;
        }
        else {
            d.b4(o);
            final Boolean b = this.b.get(l$1);
            if (b != null) {
                return b;
            }
            final g a = this.a;
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.L$0 = this;
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.L$1 = l$1;
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.label = 1;
            o = a.a(l$1, (c<? super Boolean>)redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            s2 = l$1;
            redditCanCreatePredictionInSubredditRepository = this;
        }
        final boolean booleanValue = (boolean)o;
        redditCanCreatePredictionInSubredditRepository.b.put(s2, booleanValue);
        return booleanValue;
    }
}
