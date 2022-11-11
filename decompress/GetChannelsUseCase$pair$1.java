// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.usecase;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import kotlin.Pair;
import lg2.c;
import rg2.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@" }, d2 = { "T", "a", "b", "Lkotlin/Pair;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.chat.usecase.GetChannelsUseCase$pair$1", f = "GetChannelsUseCase.kt", l = {}, m = "invokeSuspend")
final class GetChannelsUseCase$pair$1 extends SuspendLambda implements q<Object, Object, c<? super Pair<Object, Object>>, Object>
{
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    
    public GetChannelsUseCase$pair$1(final c<? super GetChannelsUseCase$pair$1> c) {
        super(3, (c<Object>)c);
    }
    
    @Override
    public final Object invoke(final Object l$0, final Object l$2, final c<? super Pair<Object, Object>> c) {
        final GetChannelsUseCase$pair$1 getChannelsUseCase$pair$1 = new GetChannelsUseCase$pair$1((c<? super GetChannelsUseCase$pair$1>)c);
        getChannelsUseCase$pair$1.L$0 = l$0;
        getChannelsUseCase$pair$1.L$1 = l$2;
        return getChannelsUseCase$pair$1.invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.k0(o);
            return new Pair(this.L$0, this.L$1);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
