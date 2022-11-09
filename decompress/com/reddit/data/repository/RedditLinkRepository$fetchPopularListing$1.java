// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import g60.o2;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditLinkRepository", f = "RedditLinkRepository.kt", l = { 1334 }, m = "fetchPopularListing")
final class RedditLinkRepository$fetchPopularListing$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditLinkRepository this$0;
    
    public RedditLinkRepository$fetchPopularListing$1(final RedditLinkRepository this$0, final tg2.c<? super RedditLinkRepository$fetchPopularListing$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return RedditLinkRepository.f(this.this$0, null, (tg2.c)this);
    }
}
