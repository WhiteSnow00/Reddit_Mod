// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditMyAccountRepository", f = "RedditMyAccountRepository.kt", l = { 298 }, m = "getFollowedByRedditorsInternal")
final class RedditMyAccountRepository$getFollowedByRedditorsInternal$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditMyAccountRepository this$0;
    
    public RedditMyAccountRepository$getFollowedByRedditorsInternal$1(final RedditMyAccountRepository this$0, final tg2.c<? super RedditMyAccountRepository$getFollowedByRedditorsInternal$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, 0, (tg2.c)this);
    }
}
