// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.predictions.RedditPredictionsRepository", f = "RedditPredictionsRepository.kt", l = { 575 }, m = "fetchSubredditPredictionTournaments")
final class RedditPredictionsRepository$fetchSubredditPredictionTournaments$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditPredictionsRepository this$0;
    
    public RedditPredictionsRepository$fetchSubredditPredictionTournaments$1(final RedditPredictionsRepository this$0, final tg2.c<? super RedditPredictionsRepository$fetchSubredditPredictionTournaments$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return RedditPredictionsRepository.v(this.this$0, null, (tg2.c)this);
    }
}
