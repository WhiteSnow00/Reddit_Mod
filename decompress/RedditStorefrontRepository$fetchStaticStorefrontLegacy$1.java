// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.snoovatar.repository.RedditStorefrontRepository", f = "RedditStorefrontRepository.kt", l = { 216, 227 }, m = "fetchStaticStorefrontLegacy")
final class RedditStorefrontRepository$fetchStaticStorefrontLegacy$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RedditStorefrontRepository this$0;
    
    public RedditStorefrontRepository$fetchStaticStorefrontLegacy$1(final RedditStorefrontRepository this$0, final tg2.c<? super RedditStorefrontRepository$fetchStaticStorefrontLegacy$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return RedditStorefrontRepository.g(this.this$0, (tg2.c)this);
    }
}
