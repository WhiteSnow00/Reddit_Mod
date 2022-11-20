// 
// Decompiled by Procyon v0.6.0
// 

package cj2;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlin.coroutines.CoroutineContext;
import cg2.j;
import bj2.n;
import mg2.p;
import kotlinx.coroutines.flow.internal.a;

public class c<T> extends a<T>
{
    public final p<n<? super T>, gg2.c<? super j>, Object> i;
    
    public c(final p<? super n<? super T>, ? super gg2.c<? super j>, ?> i, final CoroutineContext coroutineContext, final int n, final BufferOverflow bufferOverflow) {
        super(coroutineContext, n, bufferOverflow);
        this.i = (p<n<? super T>, gg2.c<? super j>, Object>)i;
    }
    
    @Override
    public Object g(final n<? super T> n, final gg2.c<? super j> c) {
        Object o = this.i.invoke((Object)n, (Object)c);
        if (o != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o = j.a;
        }
        return o;
    }
    
    @Override
    public a<T> i(final CoroutineContext coroutineContext, final int n, final BufferOverflow bufferOverflow) {
        return new c(this.i, coroutineContext, n, bufferOverflow);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("block[");
        t.append(this.i);
        t.append("] -> ");
        t.append(super.toString());
        return t.toString();
    }
}
