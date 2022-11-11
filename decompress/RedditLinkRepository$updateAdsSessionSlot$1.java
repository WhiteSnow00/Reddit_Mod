// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import com.reddit.listing.common.ListingType;
import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.repository.RedditLinkRepository", f = "RedditLinkRepository.kt", l = { 277 }, m = "updateAdsSessionSlot")
final class RedditLinkRepository$updateAdsSessionSlot$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditLinkRepository this$0;
    
    public RedditLinkRepository$updateAdsSessionSlot$1(final RedditLinkRepository this$0, final tg2.c<? super RedditLinkRepository$updateAdsSessionSlot$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return RedditLinkRepository.s0(this.this$0, null, null, (tg2.c)this);
    }
}
