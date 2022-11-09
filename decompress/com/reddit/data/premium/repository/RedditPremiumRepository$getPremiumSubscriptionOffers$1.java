// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.premium.repository;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.premium.repository.RedditPremiumRepository", f = "RedditPremiumRepository.kt", l = { 45 }, m = "getPremiumSubscriptionOffers")
final class RedditPremiumRepository$getPremiumSubscriptionOffers$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditPremiumRepository this$0;
    
    public RedditPremiumRepository$getPremiumSubscriptionOffers$1(final RedditPremiumRepository this$0, final tg2.c<? super RedditPremiumRepository$getPremiumSubscriptionOffers$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f((tg2.c)this);
    }
}
