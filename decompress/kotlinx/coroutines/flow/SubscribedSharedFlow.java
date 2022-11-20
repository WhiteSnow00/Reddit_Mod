// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.KotlinNothingValueException;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import cj2.f;
import mg2.p;
import cj2.t;

public final class SubscribedSharedFlow<T> implements t<T>
{
    public final t<T> f;
    public final p<f<? super T>, c<? super j>, Object> g;
    
    public SubscribedSharedFlow(final t<? extends T> f, final p<? super f<? super T>, ? super c<? super j>, ?> g) {
        this.f = (t<T>)f;
        this.g = (p<f<? super T>, c<? super j>, Object>)g;
    }
    
    public final Object a(final f<? super T> f, final c<?> c) {
        SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$2 = null;
        Label_0051: {
            if (c instanceof SubscribedSharedFlow$collect$1) {
                final SubscribedSharedFlow$collect$1 subscribedSharedFlow$collect$1 = (SubscribedSharedFlow$collect$1)c;
                final int label = subscribedSharedFlow$collect$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    subscribedSharedFlow$collect$1.label = label + Integer.MIN_VALUE;
                    subscribedSharedFlow$collect$2 = subscribedSharedFlow$collect$1;
                    break Label_0051;
                }
            }
            subscribedSharedFlow$collect$2 = new SubscribedSharedFlow$collect$1(this, (c)c);
        }
        final Object result = subscribedSharedFlow$collect$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = subscribedSharedFlow$collect$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
        }
        else {
            d.b4(result);
            final t<T> f2 = this.f;
            final SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(this.g, f);
            subscribedSharedFlow$collect$2.label = 1;
            if (f2.a((f)subscribedFlowCollector, (c)subscribedSharedFlow$collect$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        throw new KotlinNothingValueException();
    }
    
    public final List<T> b() {
        return this.f.b();
    }
}
