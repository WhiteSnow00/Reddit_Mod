// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import pg2.j;
import j60.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import tg2.c;
import pj2.f;
import com.reddit.domain.model.Link;
import pj2.e;

public final class DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1 implements e<Link>
{
    public final /* synthetic */ e f;
    public final /* synthetic */ DatabaseLinkDataSource g;
    
    public DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1(final e f, final DatabaseLinkDataSource g) {
        this.f = f;
        this.g = g;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f() {
            public final /* synthetic */ DatabaseLinkDataSource g = DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1.this.g;
            
            public final Object emit(final Object o, final c c) {
                ContinuationImpl continuationImpl2 = null;
                Label_0050: {
                    if (c instanceof DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1$2$1) {
                        final ContinuationImpl continuationImpl = (DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1$2$1)c;
                        final int label = continuationImpl.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            continuationImpl.label = label + Integer.MIN_VALUE;
                            continuationImpl2 = continuationImpl;
                            break Label_0050;
                        }
                    }
                    continuationImpl2 = new ContinuationImpl(c) {
                        public Object L$0;
                        public int label;
                        public /* synthetic */ Object result;
                        public final /* synthetic */ DatabaseLinkDataSource$getLinkFlowById$$inlined$map$1$2 this$0;
                        
                        public final Object invokeSuspend(final Object result) {
                            this.result = result;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.emit(null, (c)this);
                        }
                    };
                }
                final Object result = continuationImpl2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = continuationImpl2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aj2.c.Q0(result);
                }
                else {
                    aj2.c.Q0(result);
                    final f f = f;
                    final b b = (b)o;
                    Link b2;
                    if (b != null) {
                        b2 = this.g.b(b);
                    }
                    else {
                        b2 = null;
                    }
                    continuationImpl2.label = 1;
                    if (f.emit((Object)b2, (c)continuationImpl2) == coroutine_SUSPENDED) {
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
