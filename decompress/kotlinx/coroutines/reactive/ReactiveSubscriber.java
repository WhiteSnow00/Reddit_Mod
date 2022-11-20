// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.reactive;

import ng2.e;
import bj2.h$b;
import bj2.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zg.a;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.AbstractChannel;
import nt2.d;
import nt2.c;

public final class ReactiveSubscriber<T> implements c<T>
{
    public final long f;
    public d g;
    public final AbstractChannel h;
    
    public ReactiveSubscriber(final int n, final BufferOverflow bufferOverflow, final long f) {
        this.f = f;
        int n2 = n;
        if (n == 0) {
            n2 = 1;
        }
        this.h = a.e(n2, bufferOverflow, 4);
    }
    
    public final Object a(final gg2.c<? super T> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof ReactiveSubscriber$takeNextOrNull$1) {
                final ReactiveSubscriber$takeNextOrNull$1 reactiveSubscriber$takeNextOrNull$1 = (ReactiveSubscriber$takeNextOrNull$1)c;
                final int label = reactiveSubscriber$takeNextOrNull$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    reactiveSubscriber$takeNextOrNull$1.label = label + Integer.MIN_VALUE;
                    o = reactiveSubscriber$takeNextOrNull$1;
                    break Label_0047;
                }
            }
            o = new ReactiveSubscriber$takeNextOrNull$1(this, (gg2.c)c);
        }
        final Object result = ((ReactiveSubscriber$takeNextOrNull$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((ReactiveSubscriber$takeNextOrNull$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cg.d.b4(result);
            o2 = ((h)result).a;
        }
        else {
            cg.d.b4(result);
            final AbstractChannel h = this.h;
            ((ReactiveSubscriber$takeNextOrNull$1)o).label = 1;
            if ((o2 = h.N((gg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Throwable a = bj2.h.a(o2);
        if (a == null) {
            Object o3 = o2;
            if (o2 instanceof h$b) {
                bj2.h.a(o2);
                o3 = null;
            }
            return o3;
        }
        throw a;
    }
    
    public final void onComplete() {
        ((bj2.a)this.h).Q(null);
    }
    
    public final void onError(final Throwable t) {
        ((bj2.a)this.h).Q(t);
    }
    
    public final void onNext(final T t) {
        if (((bj2.a<T>)this.h).i(t) instanceof h$b ^ true) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Element ");
        sb.append(t);
        sb.append(" was not added to channel because it was full, ");
        sb.append(this.h);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final void onSubscribe(final d g) {
        this.g = g;
        if (g != null) {
            g.request(this.f);
            return;
        }
        e.n("subscription");
        throw null;
    }
}
