// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.usecase;

import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import pj2.f;
import kotlinx.coroutines.flow.g;
import com.reddit.domain.chat.model.ChannelPage;
import kotlin.Pair;
import pj2.e;

public final class GetChannelsUseCase$execute$$inlined$filter$1 implements e<Pair<? extends ChannelPage, ? extends ChannelPage>>
{
    public final /* synthetic */ e f;
    
    public GetChannelsUseCase$execute$$inlined$filter$1(final g f) {
        this.f = (e)f;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f() {
            public final Object emit(final Object o, final c c) {
                GetChannelsUseCase$execute$$inlined$filter$1$2$1 getChannelsUseCase$execute$$inlined$filter$1$2$2 = null;
                Label_0050: {
                    if (c instanceof GetChannelsUseCase$execute$$inlined$filter$1$2$1) {
                        final GetChannelsUseCase$execute$$inlined$filter$1$2$1 getChannelsUseCase$execute$$inlined$filter$1$2$1 = (GetChannelsUseCase$execute$$inlined$filter$1$2$1)c;
                        final int label = getChannelsUseCase$execute$$inlined$filter$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            getChannelsUseCase$execute$$inlined$filter$1$2$1.label = label + Integer.MIN_VALUE;
                            getChannelsUseCase$execute$$inlined$filter$1$2$2 = getChannelsUseCase$execute$$inlined$filter$1$2$1;
                            break Label_0050;
                        }
                    }
                    getChannelsUseCase$execute$$inlined$filter$1$2$2 = new GetChannelsUseCase$execute$$inlined$filter$1$2$1(this, c);
                }
                final Object result = getChannelsUseCase$execute$$inlined$filter$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = getChannelsUseCase$execute$$inlined$filter$1$2$2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aj2.c.Q0(result);
                }
                else {
                    aj2.c.Q0(result);
                    final f f = f;
                    final Pair pair = (Pair)o;
                    final ChannelPage channelPage = (ChannelPage)pair.component1();
                    final ChannelPage channelPage2 = (ChannelPage)pair.component2();
                    if (channelPage instanceof ChannelPage.Ready && channelPage2 instanceof ChannelPage.Ready) {
                        getChannelsUseCase$execute$$inlined$filter$1$2$2.label = 1;
                        if (f.emit(o, (c)getChannelsUseCase$execute$$inlined$filter$1$2$2) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                }
                return j.a;
            }
        }, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return j.a;
    }
}
