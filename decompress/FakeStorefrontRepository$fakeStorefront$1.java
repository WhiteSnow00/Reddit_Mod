// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.snoovatar.repository.FakeStorefrontRepository", f = "FakeStorefrontRepository.kt", l = { 106 }, m = "fakeStorefront")
final class FakeStorefrontRepository$fakeStorefront$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ FakeStorefrontRepository this$0;
    
    public FakeStorefrontRepository$fakeStorefront$1(final FakeStorefrontRepository this$0, final tg2.c<? super FakeStorefrontRepository$fakeStorefront$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return FakeStorefrontRepository.g(this.this$0, (tg2.c)this);
    }
}
