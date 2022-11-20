// 
// Decompiled by Procyon v0.6.0
// 

package cj2;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlin.coroutines.CoroutineContext;
import java.util.List;
import gg2.c;
import zi2.q1;
import kotlinx.coroutines.flow.StateFlowImpl;
import zi2.z0;
import dj2.f;

public final class r<T> implements y<T>, a<T>, f<T>
{
    public final z0 f;
    public final y<T> g;
    
    public r(final StateFlowImpl g, final q1 f) {
        this.f = (z0)f;
        this.g = (y<T>)g;
    }
    
    public final Object a(final cj2.f<? super T> f, final c<?> c) {
        return ((t)this.g).a((cj2.f)f, (c)c);
    }
    
    public final List<T> b() {
        return ((t)this.g).b();
    }
    
    public final e<T> e(final CoroutineContext coroutineContext, final int n, final BufferOverflow bufferOverflow) {
        if (((n < 0 || n >= 2) && n != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) {
            if ((n != 0 && n != -3) || bufferOverflow != BufferOverflow.SUSPEND) {
                final Object o = new dj2.c(n, coroutineContext, bufferOverflow, (e)this);
                return (e<T>)o;
            }
        }
        final Object o = this;
        return (e<T>)o;
    }
    
    public final T getValue() {
        return (T)this.g.getValue();
    }
}
