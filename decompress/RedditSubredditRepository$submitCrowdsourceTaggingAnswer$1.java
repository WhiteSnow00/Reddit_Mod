// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.ArrayList;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditSubredditRepository", f = "RedditSubredditRepository.kt", l = { 1249, 1255 }, m = "submitCrowdsourceTaggingAnswer")
final class RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditSubredditRepository this$0;
    
    public RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1(final RedditSubredditRepository this$0, final tg2.c<? super RedditSubredditRepository$submitCrowdsourceTaggingAnswer$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(null, null, (tg2.c)this);
    }
}
