// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import com.reddit.domain.model.listing.Listing;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditLinkRepository", f = "RedditLinkRepository.kt", l = { 910 }, m = "saveHomeLinksInternal")
final class RedditLinkRepository$saveHomeLinksInternal$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditLinkRepository this$0;
    
    public RedditLinkRepository$saveHomeLinksInternal$1(final RedditLinkRepository this$0, final tg2.c<? super RedditLinkRepository$saveHomeLinksInternal$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return RedditLinkRepository.q0(this.this$0, null, null, null, null, (tg2.c)this);
    }
}
