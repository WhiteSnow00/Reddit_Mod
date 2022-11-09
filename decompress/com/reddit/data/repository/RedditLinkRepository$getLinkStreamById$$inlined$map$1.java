// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tg2.c;
import pj2.f;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import com.reddit.domain.model.Link;
import pj2.e;

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
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f() {
            public final /* synthetic */ RedditLinkRepository g = RedditLinkRepository$getLinkStreamById$$inlined$map$1.this.g;
            public final /* synthetic */ String h = RedditLinkRepository$getLinkStreamById$$inlined$map$1.this.h;
            
            public final Object emit(Object x0, final c c) {
                ContinuationImpl continuationImpl = null;
                Label_0048: {
                    if (c instanceof RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1) {
                        continuationImpl = (RedditLinkRepository$getLinkStreamById$$inlined$map$1$2$1)c;
                        final int label = continuationImpl.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            continuationImpl.label = label + Integer.MIN_VALUE;
                            break Label_0048;
                        }
                    }
                    continuationImpl = new ContinuationImpl(c) {
                        public Object L$0;
                        public int label;
                        public /* synthetic */ Object result;
                        public final /* synthetic */ RedditLinkRepository$getLinkStreamById$$inlined$map$1$2 this$0;
                        
                        public final Object invokeSuspend(final Object result) {
                            this.result = result;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, (c)this);
                        }
                    };
                }
                final Object result = continuationImpl.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = continuationImpl.label;
                Object o2 = null;
                f f2 = null;
                Label_0195: {
                    f f;
                    if (label2 != 0) {
                        if (label2 != 1) {
                            if (label2 == 2) {
                                aj2.c.Q0(result);
                                return j.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            f = (f)continuationImpl.L$0;
                            aj2.c.Q0(result);
                            x0 = result;
                        }
                    }
                    else {
                        aj2.c.Q0(result);
                        f = f;
                        final Object o = o2 = x0;
                        f2 = f;
                        if (o != null) {
                            break Label_0195;
                        }
                        final RedditLinkRepository g = this.g;
                        final String h = this.h;
                        continuationImpl.L$0 = f;
                        continuationImpl.label = 1;
                        final Pair<Long, TimeUnit> h2 = RedditLinkRepository.h0;
                        x0 = g.x0(h, (c<? super Link>)continuationImpl);
                        if (x0 == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    o2 = x0;
                    f2 = f;
                }
                continuationImpl.L$0 = null;
                continuationImpl.label = 2;
                if (f2.emit(o2, (c)continuationImpl) == coroutine_SUSPENDED) {
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
