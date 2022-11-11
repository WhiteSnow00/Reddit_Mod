// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.usecase;

import pg2.j;
import com.reddit.domain.chat.model.ChannelPage;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import pj2.f;
import pj2.e;

public final class GetChatRequestsUseCase$execute$$inlined$filterIsInstance$1 implements e<Object>
{
    public final /* synthetic */ e f;
    
    public GetChatRequestsUseCase$execute$$inlined$filterIsInstance$1(final e f) {
        this.f = f;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f() {
            public final Object emit(final Object o, final c c) {
                GetChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1 getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$2 = null;
                Label_0050: {
                    if (c instanceof GetChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1) {
                        final GetChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1 getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1 = (GetChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1)c;
                        final int label = getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1.label = label + Integer.MIN_VALUE;
                            getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$2 = getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1;
                            break Label_0050;
                        }
                    }
                    getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$2 = new GetChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$1(this, c);
                }
                final Object result = getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aj2.c.Q0(result);
                }
                else {
                    aj2.c.Q0(result);
                    final f f = f;
                    if (o instanceof ChannelPage.Ready) {
                        getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$2.label = 1;
                        if (f.emit(o, (c)getChatRequestsUseCase$execute$$inlined$filterIsInstance$1$2$2) == coroutine_SUSPENDED) {
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
