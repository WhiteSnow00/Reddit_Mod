// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditSubredditRepository", f = "RedditSubredditRepository.kt", l = { 272, 282, 287, 295, 297, 305, 307 }, m = "performFetchUserSubredditListItems")
final class RedditSubredditRepository$performFetchUserSubredditListItems$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditSubredditRepository this$0;
    
    public RedditSubredditRepository$performFetchUserSubredditListItems$1(final RedditSubredditRepository this$0, final tg2.c<? super RedditSubredditRepository$performFetchUserSubredditListItems$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        final RedditSubredditRepository this$0 = this.this$0;
        final Pair<Long, TimeUnit> h = RedditSubredditRepository.H;
        return this$0.v0((tg2.c)this);
    }
}
