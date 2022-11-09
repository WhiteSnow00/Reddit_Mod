// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mj2.b0;
import kotlin.Metadata;
import pg2.j;
import c5.s;
import pj2.f;
import zg2.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@" }, d2 = { "T", "R", "Lpj2/f;", "it", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
@ug2.c(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = { 222 }, m = "invokeSuspend")
public final class CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 extends SuspendLambda implements q<f<? super c<Object>>, s<Object>, tg2.c<? super j>, Object>
{
    public final /* synthetic */ b0 $scope$inlined;
    private /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    
    public CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(final tg2.c c, final b0 $scope$inlined) {
        this.$scope$inlined = $scope$inlined;
        super(3, c);
    }
    
    public final Object invoke(final f<? super c<Object>> l$0, final s<Object> l$2, final tg2.c<? super j> c) {
        final CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1 = new CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1(c, this.$scope$inlined);
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$0 = l$0;
        cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.L$1 = l$2;
        return cachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1.invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(o);
        }
        else {
            aj2.c.Q0(o);
            final f f = (f)this.L$0;
            final c c = new c(this.$scope$inlined, (s)this.L$1);
            this.label = 1;
            if (f.emit((Object)c, (tg2.c)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
