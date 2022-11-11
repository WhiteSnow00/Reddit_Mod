// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.powerups.RedditPowerupsRepository", f = "RedditPowerupsRepository.kt", l = { 286, 288 }, m = "cancelPowerups")
final class RedditPowerupsRepository$cancelPowerups$1 extends ContinuationImpl
{
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditPowerupsRepository this$0;
    
    public RedditPowerupsRepository$cancelPowerups$1(final RedditPowerupsRepository this$0, final tg2.c<? super RedditPowerupsRepository$cancelPowerups$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.h(0, null, null, null, (tg2.c)this, false);
    }
}
