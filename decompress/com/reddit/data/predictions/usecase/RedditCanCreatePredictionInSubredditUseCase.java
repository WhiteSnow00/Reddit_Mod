// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions.usecase;

import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import yd0.a;

public final class RedditCanCreatePredictionInSubredditUseCase implements a
{
    public final xd0.a a;
    
    @Inject
    public RedditCanCreatePredictionInSubredditUseCase(final xd0.a a) {
        f.f((Object)a, "canCreatePredictionInSubredditRepository");
        this.a = a;
    }
    
    public final Object a(final String s, final Boolean b, final Boolean b2, final c<? super Boolean> c) {
        final Boolean true = Boolean.TRUE;
        boolean b3;
        if (!f.a((Object)b, (Object)true)) {
            b3 = false;
        }
        else {
            if (!f.a((Object)b2, (Object)true)) {
                return this.b(s, c);
            }
            b3 = true;
        }
        return b3;
    }
    
    public final Object b(final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo.RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1) {
                final RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo.RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1 redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1 = (RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo.RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)c;
                final int label = redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1.label = label + Integer.MIN_VALUE;
                    o = redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1;
                    break Label_0050;
                }
            }
            o = new RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo.RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1(this, (c)c);
        }
        final Object result = ((RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo.RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo.RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)o).label;
        if (label2 != 0) {
            if (label2 == 1) {
                Label_0149: {
                    try {
                        aj2.c.Q0(result);
                        return result;
                    }
                    catch (final IOException ex) {
                        break Label_0149;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final IOException ex;
                bv2.a.a.j((Throwable)ex, "Failed checking prediction creation eligibility in use case", new Object[0]);
                return Boolean.FALSE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aj2.c.Q0(result);
        final xd0.a a2 = this.a;
        ((RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo.RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)o).label = 1;
        Object a;
        if ((a = a2.a(s, (c)o)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return a;
    }
}
