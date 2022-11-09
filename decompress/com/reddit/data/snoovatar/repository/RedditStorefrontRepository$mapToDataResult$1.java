// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository;

import com.reddit.queries.h5$c;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.snoovatar.repository.RedditStorefrontRepository", f = "RedditStorefrontRepository.kt", l = { 248 }, m = "mapToDataResult")
final class RedditStorefrontRepository$mapToDataResult$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditStorefrontRepository this$0;
    
    public RedditStorefrontRepository$mapToDataResult$1(final RedditStorefrontRepository this$0, final tg2.c<? super RedditStorefrontRepository$mapToDataResult$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.j((h5$c)null, (tg2.c)this);
    }
}
