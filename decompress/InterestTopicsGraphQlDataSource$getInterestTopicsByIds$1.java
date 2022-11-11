// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.onboardingtopic;

import com.reddit.domain.onboardingflow.OnboardingFlowType;
import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.onboardingtopic.InterestTopicsGraphQlDataSource", f = "InterestTopicsGraphQlDataSource.kt", l = { 55 }, m = "getInterestTopicsByIds")
final class InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InterestTopicsGraphQlDataSource this$0;
    
    public InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1(final InterestTopicsGraphQlDataSource this$0, final tg2.c<? super InterestTopicsGraphQlDataSource$getInterestTopicsByIds$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, 0, null, null, (tg2.c)this);
    }
}
