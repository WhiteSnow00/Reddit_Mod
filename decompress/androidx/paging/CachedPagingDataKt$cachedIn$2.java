// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlinx.coroutines.JobSupport;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import pg2.j;
import kotlin.Metadata;
import zg2.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@" }, d2 = { "", "T", "Landroidx/paging/c;", "prev", "next", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
@ug2.c(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = { 99 }, m = "invokeSuspend")
final class CachedPagingDataKt$cachedIn$2 extends SuspendLambda implements q<c<Object>, c<Object>, tg2.c<? super c<Object>>, Object>
{
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    
    public CachedPagingDataKt$cachedIn$2(final tg2.c<? super CachedPagingDataKt$cachedIn$2> c) {
        super(3, (tg2.c)c);
    }
    
    public final Object invoke(final c<Object> l$0, final c<Object> l$2, final tg2.c<? super c<Object>> c) {
        final CachedPagingDataKt$cachedIn$2 cachedPagingDataKt$cachedIn$2 = new CachedPagingDataKt$cachedIn$2((tg2.c<? super CachedPagingDataKt$cachedIn$2>)c);
        cachedPagingDataKt$cachedIn$2.L$0 = l$0;
        cachedPagingDataKt$cachedIn$2.L$1 = l$2;
        return cachedPagingDataKt$cachedIn$2.invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        c l$0;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final c c = (c)this.L$0;
            aj2.c.Q0(o);
            l$0 = c;
        }
        else {
            aj2.c.Q0(o);
            final c c2 = (c)this.L$0;
            l$0 = (c)this.L$1;
            this.L$0 = l$0;
            this.label = 1;
            ((JobSupport)c2.c.d).a((CancellationException)null);
            if (j.a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return l$0;
    }
}
