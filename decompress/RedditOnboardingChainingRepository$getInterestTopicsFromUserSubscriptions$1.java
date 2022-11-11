// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.onboardingtopic;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.onboardingtopic.RedditOnboardingChainingRepository", f = "RedditOnboardingChainingRepository.kt", l = { 125 }, m = "getInterestTopicsFromUserSubscriptions")
final class RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditOnboardingChainingRepository this$0;
    
    public RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1(final RedditOnboardingChainingRepository this$0, final tg2.c<? super RedditOnboardingChainingRepository$getInterestTopicsFromUserSubscriptions$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.k((tg2.c)this);
    }
}
