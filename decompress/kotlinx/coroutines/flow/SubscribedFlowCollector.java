// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlinx.coroutines.flow.internal.SafeCollector;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import mg2.p;
import cj2.f;

public final class SubscribedFlowCollector<T> implements f<T>
{
    public final f<T> f;
    public final p<f<? super T>, c<? super j>, Object> g;
    
    public SubscribedFlowCollector(final p g, final f f) {
        this.f = (f<T>)f;
        this.g = (p<f<? super T>, c<? super j>, Object>)g;
    }
    
    public final Object a(final c<? super j> c) {
        SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1 = null;
        Label_0047: {
            if (c instanceof SubscribedFlowCollector$onSubscription$1) {
                final Object f = c;
                final int label = ((SubscribedFlowCollector$onSubscription$1)f).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((SubscribedFlowCollector$onSubscription$1)f).label = label + Integer.MIN_VALUE;
                    subscribedFlowCollector$onSubscription$1 = (SubscribedFlowCollector$onSubscription$1)f;
                    break Label_0047;
                }
            }
            subscribedFlowCollector$onSubscription$1 = new SubscribedFlowCollector$onSubscription$1(this, (c)c);
        }
        final Object result = subscribedFlowCollector$onSubscription$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = subscribedFlowCollector$onSubscription$1.label;
        Label_0127: {
            if (label2 == 0) {
                break Label_0127;
            }
            Label_0262: {
                if (label2 != 1) {
                    if (label2 == 2) {
                        d.b4(result);
                        break Label_0262;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object l$1 = subscribedFlowCollector$onSubscription$1.L$1;
                final SubscribedFlowCollector subscribedFlowCollector = (SubscribedFlowCollector)subscribedFlowCollector$onSubscription$1.L$0;
                Object f = l$1;
                try {
                    d.b4(result);
                    f = subscribedFlowCollector;
                    while (true) {
                        ((SafeCollector)l$1).releaseIntercepted();
                        f = ((SubscribedFlowCollector)f).f;
                        if (!(f instanceof SubscribedFlowCollector)) {
                            return j.a;
                        }
                        f = f;
                        subscribedFlowCollector$onSubscription$1.L$0 = null;
                        subscribedFlowCollector$onSubscription$1.L$1 = null;
                        subscribedFlowCollector$onSubscription$1.label = 2;
                        if (((SubscribedFlowCollector)f).a((c)subscribedFlowCollector$onSubscription$1) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        return j.a;
                        Label_0210: {
                            f = this;
                        }
                        continue;
                    }
                    d.b4(result);
                    l$1 = (f = new SafeCollector((f)this.f, ((c)subscribedFlowCollector$onSubscription$1).getContext()));
                    final p<f<? super T>, c<? super j>, Object> g = this.g;
                    f = l$1;
                    subscribedFlowCollector$onSubscription$1.L$0 = this;
                    f = l$1;
                    subscribedFlowCollector$onSubscription$1.L$1 = l$1;
                    f = l$1;
                    subscribedFlowCollector$onSubscription$1.label = 1;
                    f = l$1;
                    iftrue(Label_0210:)(g.invoke(l$1, (Object)subscribedFlowCollector$onSubscription$1) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                }
                finally {
                    ((SafeCollector)f).releaseIntercepted();
                }
            }
        }
    }
    
    public final Object emit(final T t, final c<? super j> c) {
        return this.f.emit((Object)t, (c)c);
    }
}
