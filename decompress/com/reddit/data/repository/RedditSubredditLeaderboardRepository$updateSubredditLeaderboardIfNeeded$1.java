// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditSubredditLeaderboardRepository", f = "RedditSubredditLeaderboardRepository.kt", l = { 19, 20 }, m = "updateSubredditLeaderboardIfNeeded")
final class RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditSubredditLeaderboardRepository this$0;
    
    public RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1(final RedditSubredditLeaderboardRepository this$0, final tg2.c<? super RedditSubredditLeaderboardRepository$updateSubredditLeaderboardIfNeeded$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, (tg2.c)this);
    }
}
