// 
// Decompiled by Procyon v0.6.0
// 

package cj2;

import zi2.c0;
import bj2.t;
import dj2.i;
import bj2.n;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__ChannelsKt;
import cg2.j;
import gg2.c;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlin.coroutines.EmptyCoroutineContext;
import bj2.p;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.flow.internal.a;

public final class b<T> extends a<T>
{
    public static final AtomicIntegerFieldUpdater k;
    private volatile int consumed;
    public final p<T> i;
    public final boolean j;
    
    static {
        k = AtomicIntegerFieldUpdater.newUpdater(b.class, "consumed");
    }
    
    public b(final p p2, final boolean b) {
        this(p2, b, (CoroutineContext)EmptyCoroutineContext.INSTANCE, -3, BufferOverflow.SUSPEND);
    }
    
    public b(final p<? extends T> i, final boolean j, final CoroutineContext coroutineContext, final int n, final BufferOverflow bufferOverflow) {
        super(coroutineContext, n, bufferOverflow);
        this.i = (p<T>)i;
        this.j = j;
        this.consumed = 0;
    }
    
    @Override
    public final Object a(final f<? super T> f, final c<? super j> c) {
        if (super.g == -3) {
            this.l();
            final Object a = FlowKt__ChannelsKt.a((cj2.f<? super Object>)f, (bj2.p<?>)this.i, this.j, c);
            if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a;
            }
            return cg2.j.a;
        }
        else {
            final Object a2 = super.a(f, c);
            if (a2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return a2;
            }
            return cg2.j.a;
        }
    }
    
    @Override
    public final String f() {
        final StringBuilder t = a.t("channel=");
        t.append(this.i);
        return t.toString();
    }
    
    @Override
    public final Object g(final n<? super T> n, final c<? super j> c) {
        final Object a = FlowKt__ChannelsKt.a((cj2.f<? super Object>)new i((t)n), (bj2.p<?>)this.i, this.j, c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return cg2.j.a;
    }
    
    @Override
    public final a<T> i(final CoroutineContext coroutineContext, final int n, final BufferOverflow bufferOverflow) {
        return new b(this.i, this.j, coroutineContext, n, bufferOverflow);
    }
    
    @Override
    public final e<T> j() {
        return (e<T>)new b(this.i, this.j);
    }
    
    @Override
    public final p<T> k(final c0 c0) {
        this.l();
        p<T> p;
        if (super.g == -3) {
            p = this.i;
        }
        else {
            p = super.k(c0);
        }
        return p;
    }
    
    public final void l() {
        if (this.j) {
            final AtomicIntegerFieldUpdater k = b.k;
            boolean b = true;
            if (k.getAndSet(this, 1) != 0) {
                b = false;
            }
            if (!b) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
