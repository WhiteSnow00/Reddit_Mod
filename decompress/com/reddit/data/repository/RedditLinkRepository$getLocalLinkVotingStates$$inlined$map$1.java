// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import hg2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import hj2.f;
import com.reddit.domain.model.vote.VoteDirection;
import hj2.e;

public final class RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1 implements e<VoteDirection>
{
    public final /* synthetic */ e f;
    
    public RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1(final e f) {
        this.f = f;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = this.f.a(new f() {
            @Override
            public final Object emit(final Object o, final c c) {
                RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1 redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2 = null;
                Label_0050: {
                    if (c instanceof RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1) {
                        final RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1 redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1 = (RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1)c;
                        final int label = redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2 = redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1;
                            break Label_0050;
                        }
                    }
                    redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2 = new RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1(this, c);
                }
                final Object result = redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.k0(result);
                }
                else {
                    b.k0(result);
                    final f f = f;
                    final VoteDirection fromInt = VoteDirection.Companion.fromInt(((Number)o).intValue());
                    redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2.label = 1;
                    if (f.emit(fromInt, (c<? super j>)redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2) == coroutine_SUSPENDED) {
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
