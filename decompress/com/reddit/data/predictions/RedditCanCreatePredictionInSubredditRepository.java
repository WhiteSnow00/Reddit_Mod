// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import java.util.concurrent.ConcurrentHashMap;
import x50.h;
import xd0.a;

public final class RedditCanCreatePredictionInSubredditRepository implements a
{
    public final h a;
    public final ConcurrentHashMap<String, Boolean> b;
    
    @Inject
    public RedditCanCreatePredictionInSubredditRepository(final h a) {
        f.f((Object)a, "remoteGqlPredictionsDataSource");
        this.a = a;
        this.b = new ConcurrentHashMap<String, Boolean>();
    }
    
    public final Object a(final String l$1, final c<? super Boolean> c) {
        RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit.RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2 = null;
        Label_0050: {
            if (c instanceof RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit.RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1) {
                final RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit.RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1 = (RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit.RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1)c;
                final int label = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1.label = label + Integer.MIN_VALUE;
                    redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2 = redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1;
                    break Label_0050;
                }
            }
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2 = new RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit.RedditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$1(this, (c)c);
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
            aj2.c.Q0(o);
            s2 = s;
        }
        else {
            aj2.c.Q0(o);
            final Boolean b = this.b.get(l$1);
            if (b != null) {
                return b;
            }
            final h a = this.a;
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.L$0 = this;
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.L$1 = l$1;
            redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2.label = 1;
            o = a.a(l$1, (c)redditCanCreatePredictionInSubredditRepository$canCreatePredictionInSubreddit$2);
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
