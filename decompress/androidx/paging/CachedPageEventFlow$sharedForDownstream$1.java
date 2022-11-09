// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlinx.coroutines.JobSupport;
import java.util.List;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import qg2.s;
import pj2.f;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0016\u0012\u0012\u0012\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0018\u00010\u00030\u0002H\u008a@" }, d2 = { "", "T", "Lpj2/f;", "Lqg2/s;", "Landroidx/paging/PageEvent;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
@ug2.c(c = "androidx.paging.CachedPageEventFlow$sharedForDownstream$1", f = "CachedPageEventFlow.kt", l = { 63, 68 }, m = "invokeSuspend")
final class CachedPageEventFlow$sharedForDownstream$1 extends SuspendLambda implements p<f<? super s<? extends PageEvent<Object>>>, c<? super j>, Object>
{
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ a<Object> this$0;
    
    public CachedPageEventFlow$sharedForDownstream$1(final a<Object> this$0, final c<? super CachedPageEventFlow$sharedForDownstream$1> c) {
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final CachedPageEventFlow$sharedForDownstream$1 cachedPageEventFlow$sharedForDownstream$1 = new CachedPageEventFlow$sharedForDownstream$1(this.this$0, (c<? super CachedPageEventFlow$sharedForDownstream$1>)c);
        cachedPageEventFlow$sharedForDownstream$1.L$0 = l$0;
        return (c<j>)cachedPageEventFlow$sharedForDownstream$1;
    }
    
    public final Object invoke(final f<? super s<? extends PageEvent<Object>>> f, final c<? super j> c) {
        return ((CachedPageEventFlow$sharedForDownstream$1)this.create(f, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object a) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        while (true) {
            Label_0122: {
                f f;
                Iterator iterator2;
                if (label != 0) {
                    if (label == 1) {
                        f = (f)this.L$0;
                        aj2.c.Q0(a);
                        break Label_0122;
                    }
                    if (label != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final Iterator iterator = (Iterator)this.L$1;
                    f = (f)this.L$0;
                    aj2.c.Q0(a);
                    iterator2 = iterator;
                }
                else {
                    aj2.c.Q0(a);
                    f = (f)this.L$0;
                    final FlattenedPageController a2 = this.this$0.a;
                    this.L$0 = f;
                    this.label = 1;
                    a = a2.a((c)this);
                    if (a == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    break Label_0122;
                }
                while (iterator2.hasNext()) {
                    final s s = iterator2.next();
                    this.L$0 = f;
                    this.L$1 = iterator2;
                    this.label = 2;
                    if (f.emit((Object)s, (c)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                return j.a;
            }
            final List list = (List)a;
            ((JobSupport)this.this$0.d).start();
            Iterator iterator2 = list.iterator();
            continue;
        }
    }
}
