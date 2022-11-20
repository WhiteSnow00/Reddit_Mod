// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import cg2.j;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import cj2.f;
import com.reddit.domain.model.vote.VoteDirection;
import cj2.e;

public final class RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1 implements e<VoteDirection>
{
    public final e f;
    
    public RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1(final e f) {
        this.f = f;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f(f) {
            public final f f;
            
            public final Object emit(final Object o, final c c) {
                RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1 redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2 = null;
                Label_0051: {
                    if (c instanceof RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1) {
                        final RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1 redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1 = (RedditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1)c;
                        final int label = redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2 = redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$1;
                            break Label_0051;
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
                    d.b4(result);
                }
                else {
                    d.b4(result);
                    final f f = this.f;
                    final VoteDirection fromInt = VoteDirection.Companion.fromInt(((Number)o).intValue());
                    redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2.label = 1;
                    if (f.emit((Object)fromInt, (c)redditLinkRepository$getLocalLinkVotingStates$$inlined$map$1$2$2) == coroutine_SUSPENDED) {
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
