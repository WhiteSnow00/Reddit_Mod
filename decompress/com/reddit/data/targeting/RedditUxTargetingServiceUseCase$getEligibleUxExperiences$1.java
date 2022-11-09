// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.targeting;

import java.util.List;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.targeting.RedditUxTargetingServiceUseCase", f = "RedditUxTargetingServiceUseCase.kt", l = { 48 }, m = "getEligibleUxExperiences")
final class RedditUxTargetingServiceUseCase$getEligibleUxExperiences$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditUxTargetingServiceUseCase this$0;
    
    public RedditUxTargetingServiceUseCase$getEligibleUxExperiences$1(final RedditUxTargetingServiceUseCase this$0, final tg2.c<? super RedditUxTargetingServiceUseCase$getEligibleUxExperiences$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d((List)null, (tg2.c)this);
    }
}
