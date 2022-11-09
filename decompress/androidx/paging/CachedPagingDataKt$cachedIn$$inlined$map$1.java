// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import pj2.f;
import c5.s;
import pj2.e;

public final class CachedPagingDataKt$cachedIn$$inlined$map$1 implements e<s<Object>>
{
    public final /* synthetic */ e f;
    
    public CachedPagingDataKt$cachedIn$$inlined$map$1(final pj2.s f) {
        this.f = (e)f;
    }
    
    public final Object a(final f f, final c c) {
        final Object a = this.f.a((f)new f<androidx.paging.c<Object>>() {
            public final Object emit(Object o, final c c) {
                CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 cachedPagingDataKt$cachedIn$$inlined$map$1$2$2 = null;
                Label_0050: {
                    if (c instanceof CachedPagingDataKt$cachedIn$$inlined$map$1$2$1) {
                        final CachedPagingDataKt$cachedIn$$inlined$map$1$2$1 cachedPagingDataKt$cachedIn$$inlined$map$1$2$1 = (CachedPagingDataKt$cachedIn$$inlined$map$1$2$1)c;
                        final int label = cachedPagingDataKt$cachedIn$$inlined$map$1$2$1.label;
                        if ((label & Integer.MIN_VALUE) != 0x0) {
                            cachedPagingDataKt$cachedIn$$inlined$map$1$2$1.label = label + Integer.MIN_VALUE;
                            cachedPagingDataKt$cachedIn$$inlined$map$1$2$2 = cachedPagingDataKt$cachedIn$$inlined$map$1$2$1;
                            break Label_0050;
                        }
                    }
                    cachedPagingDataKt$cachedIn$$inlined$map$1$2$2 = new CachedPagingDataKt$cachedIn$$inlined$map$1$2$1(this, c);
                }
                final Object result = cachedPagingDataKt$cachedIn$$inlined$map$1$2$2.result;
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label2 = cachedPagingDataKt$cachedIn$$inlined$map$1$2$2.label;
                if (label2 != 0) {
                    if (label2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aj2.c.Q0(result);
                }
                else {
                    aj2.c.Q0(result);
                    final f f = f;
                    final androidx.paging.c c2 = (androidx.paging.c)o;
                    c2.getClass();
                    o = new s((e)c2.c.e, c2.b.b);
                    cachedPagingDataKt$cachedIn$$inlined$map$1$2$2.label = 1;
                    if (f.emit(o, (c)cachedPagingDataKt$cachedIn$$inlined$map$1$2$2) == coroutine_SUSPENDED) {
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
