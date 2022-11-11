// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.usecase;

import kotlin.collections.CollectionsKt___CollectionsKt;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import lg2.c;
import com.reddit.domain.chat.model.ChannelPage$Ready;
import rg2.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@" }, d2 = { "Lcom/reddit/domain/chat/model/ChannelPage$Ready;", "invites", "joined", "Lcom/reddit/domain/chat/usecase/a$a;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.chat.usecase.GetChannelsUseCase$execute$2", f = "GetChannelsUseCase.kt", l = {}, m = "invokeSuspend")
final class GetChannelsUseCase$execute$2 extends SuspendLambda implements q<ChannelPage$Ready, ChannelPage$Ready, c<? super a$a>, Object>
{
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    
    public GetChannelsUseCase$execute$2(final c<? super GetChannelsUseCase$execute$2> c) {
        super(3, (c<Object>)c);
    }
    
    @Override
    public final Object invoke(final ChannelPage$Ready l$0, final ChannelPage$Ready l$2, final c<? super a$a> c) {
        final GetChannelsUseCase$execute$2 getChannelsUseCase$execute$2 = new GetChannelsUseCase$execute$2((c<? super GetChannelsUseCase$execute$2>)c);
        getChannelsUseCase$execute$2.L$0 = l$0;
        getChannelsUseCase$execute$2.L$1 = l$2;
        return getChannelsUseCase$execute$2.invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            b.k0(o);
            final ChannelPage$Ready channelPage$Ready = (ChannelPage$Ready)this.L$0;
            final ChannelPage$Ready channelPage$Ready2 = (ChannelPage$Ready)this.L$1;
            return new a$a(channelPage$Ready.getChannels().size(), CollectionsKt___CollectionsKt.j4((Iterable)channelPage$Ready.getChannels(), 2), channelPage$Ready2.getChannels(), channelPage$Ready2.getHasNextPage());
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
