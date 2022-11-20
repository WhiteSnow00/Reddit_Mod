// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions.usecase;

import java.io.IOException;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import pd0.a;

public final class RedditCanCreatePredictionInSubredditUseCase implements a
{
    public final od0.a a;
    
    @Inject
    public RedditCanCreatePredictionInSubredditUseCase(final od0.a a) {
        e.f((Object)a, "canCreatePredictionInSubredditRepository");
        this.a = a;
    }
    
    public final Object a(final String s, final Boolean b, final Boolean b2, final c<? super Boolean> c) {
        final Boolean true = Boolean.TRUE;
        boolean b3;
        if (!e.a((Object)b, (Object)true)) {
            b3 = false;
        }
        else {
            if (!e.a((Object)b2, (Object)true)) {
                return this.b(s, c);
            }
            b3 = true;
        }
        return b3;
    }
    
    public final Object b(final String s, final c<? super Boolean> c) {
        Object o = null;
        Label_0051: {
            if (c instanceof RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1) {
                final RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1 redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1 = (RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)c;
                final int label = redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1.label = label + Integer.MIN_VALUE;
                    o = redditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1;
                    break Label_0051;
                }
            }
            o = new RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1(this, (c)c);
        }
        final Object result = ((RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)o).label;
        if (label2 != 0) {
            if (label2 == 1) {
                Label_0153: {
                    try {
                        d.b4(result);
                        return result;
                    }
                    catch (final IOException ex) {
                        break Label_0153;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                final IOException ex;
                pu2.a.a.j((Throwable)ex, "Failed checking prediction creation eligibility in use case", new Object[0]);
                return Boolean.FALSE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b4(result);
        final od0.a a2 = this.a;
        ((RedditCanCreatePredictionInSubredditUseCase$fetchFromRepo$1)o).label = 1;
        Object a;
        if ((a = a2.a(s, (c)o)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return a;
    }
}
