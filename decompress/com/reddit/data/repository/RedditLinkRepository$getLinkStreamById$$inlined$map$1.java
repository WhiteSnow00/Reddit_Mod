// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import cg2.j;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import cj2.f;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import com.reddit.domain.model.Link;
import cj2.e;

public final class RedditLinkRepository$getLinkStreamById$$inlined$map$1 implements e<Link>
{
    public final e f;
    public final RedditLinkRepository g;
    public final String h;
    
    public RedditLinkRepository$getLinkStreamById$$inlined$map$1(final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 f, final RedditLinkRepository g, final String h) {
        this.f = (e)f;
        this.g = g;
        this.h = h;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f(f, this.g, this.h) {
            public final f f;
            public final RedditLinkRepository g;
            public final String h;
            
            public final Object emit(Object y0, final c c) {
                RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 = null;
                Label_0049: {
                    if (c instanceof RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1) {
                        redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 = (RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1)c;
                        final int label = redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            break Label_0049;
                        }
                    }
                    redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 = new RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1(this, c);
                }
                final Object result = redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label;
                Object o2 = null;
                f f2 = null;
                Label_0197: {
                    f f;
                    if (label2 != 0) {
                        if (label2 != 1) {
                            if (label2 == 2) {
                                d.b4(result);
                                return j.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            f = (f)redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.L$0;
                            d.b4(result);
                            y0 = result;
                        }
                    }
                    else {
                        d.b4(result);
                        f = this.f;
                        final Object o = o2 = y0;
                        f2 = f;
                        if (o != null) {
                            break Label_0197;
                        }
                        final RedditLinkRepository g = this.g;
                        final String h = this.h;
                        redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.L$0 = f;
                        redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label = 1;
                        final Pair<Long, TimeUnit> h2 = RedditLinkRepository.h0;
                        y0 = g.y0(h, (c<? super Link>)redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1);
                        if (y0 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    o2 = y0;
                    f2 = f;
                }
                redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.L$0 = null;
                redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label = 2;
                if (f2.emit(o2, (c)redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
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
