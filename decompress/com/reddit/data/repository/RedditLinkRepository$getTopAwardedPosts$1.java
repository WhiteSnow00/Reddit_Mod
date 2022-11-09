// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditLinkRepository", f = "RedditLinkRepository.kt", l = { 1502 }, m = "getTopAwardedPosts")
final class RedditLinkRepository$getTopAwardedPosts$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditLinkRepository this$0;
    
    public RedditLinkRepository$getTopAwardedPosts$1(final RedditLinkRepository this$0, final tg2.c<? super RedditLinkRepository$getTopAwardedPosts$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.R(null, (tg2.c)this);
    }
}
