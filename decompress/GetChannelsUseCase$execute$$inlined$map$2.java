// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.usecase;

import pg2.j;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.domain.chat.model.ChannelPage;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import pj2.f;
import pj2.e;

public final class GetChannelsUseCase$execute$$inlined$map$2 implements e<a$a>
{
    public final /* synthetic */ e f;
    
    public GetChannelsUseCase$execute$$inlined$map$2(final GetChannelsUseCase$execute$$inlined$map$1 f) {
        this.f = (e)f;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f() {
            public final Object emit(Object o, final c c) {
                GetChannelsUseCase$execute$$inlined$map$2$2$1 getChannelsUseCase$execute$$inlined$map$2$2$2 = null;
                Label_0050: {
                    if (c instanceof GetChannelsUseCase$execute$$inlined$map$2$2$1) {
                        final GetChannelsUseCase$execute$$inlined$map$2$2$1 getChannelsUseCase$execute$$inlined$map$2$2$1 = (GetChannelsUseCase$execute$$inlined$map$2$2$1)c;
                        final int label = getChannelsUseCase$execute$$inlined$map$2$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            getChannelsUseCase$execute$$inlined$map$2$2$1.label = label + Integer.MIN_VALUE;
                            getChannelsUseCase$execute$$inlined$map$2$2$2 = getChannelsUseCase$execute$$inlined$map$2$2$1;
                            break Label_0050;
                        }
                    }
                    getChannelsUseCase$execute$$inlined$map$2$2$2 = new GetChannelsUseCase$execute$$inlined$map$2$2$1(this, c);
                }
                final Object result = getChannelsUseCase$execute$$inlined$map$2$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = getChannelsUseCase$execute$$inlined$map$2$2$2.label;
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
                    final ChannelPage.Ready ready = (ChannelPage.Ready)pair.component1();
                    final ChannelPage.Ready ready2 = (ChannelPage.Ready)pair.component2();
                    o = new a$a(ready.getChannels().size(), CollectionsKt___CollectionsKt.a2((Iterable)ready.getChannels(), 2), (List)ready2.getChannels(), ready2.getHasNextPage());
                    getChannelsUseCase$execute$$inlined$map$2$2$2.label = 1;
                    if (f.emit(o, (c)getChannelsUseCase$execute$$inlined$map$2$2$2) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
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
