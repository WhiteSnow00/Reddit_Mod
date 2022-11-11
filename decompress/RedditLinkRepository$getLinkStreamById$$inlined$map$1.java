// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import hg2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import hj2.f;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import com.reddit.domain.model.Link;
import hj2.e;

public final class RedditLinkRepository$getLinkStreamById$$inlined$map$1 implements e<Link>
{
    public final /* synthetic */ e f;
    public final /* synthetic */ RedditLinkRepository g;
    public final /* synthetic */ String h;
    
    public RedditLinkRepository$getLinkStreamById$$inlined$map$1(final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 f, final RedditLinkRepository g, final String h) {
        this.f = (e)f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object a(final f f, final c c) {
        final Object a = this.f.a(new f() {
            public final /* synthetic */ RedditLinkRepository g = RedditLinkRepository$getLinkStreamById$$inlined$map$1.this.g;
            public final /* synthetic */ String h = RedditLinkRepository$getLinkStreamById$$inlined$map$1.this.h;
            
            @Override
            public final Object emit(Object x0, final c c) {
                RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 = null;
                Label_0048: {
                    if (c instanceof RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1) {
                        redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 = (RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1)c;
                        final int label = redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            break Label_0048;
                        }
                    }
                    redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1 = new RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1(this, c);
                }
                final Object result = redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label;
                Object o2 = null;
                f f2 = null;
                Label_0194: {
                    f f;
                    if (label2 != 0) {
                        if (label2 != 1) {
                            if (label2 == 2) {
                                b.k0(result);
                                return j.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            f = (f)redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.L$0;
                            b.k0(result);
                            x0 = result;
                        }
                    }
                    else {
                        b.k0(result);
                        f = f;
                        final Object o = o2 = x0;
                        f2 = f;
                        if (o != null) {
                            break Label_0194;
                        }
                        final RedditLinkRepository g = this.g;
                        final String h = this.h;
                        redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.L$0 = f;
                        redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label = 1;
                        final Pair<Long, TimeUnit> h2 = RedditLinkRepository.h0;
                        x0 = g.x0(h, (c<? super Link>)redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1);
                        if (x0 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    o2 = x0;
                    f2 = f;
                }
                redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.L$0 = null;
                redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1.label = 2;
                if (f2.emit(o2, (c<? super j>)redditLinkRepository$getLinkStreamById$$inlined$map$1$2$1) == coroutine_SUSPENDED) {
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
