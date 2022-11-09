// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.viewpager.widget.c;
import mj2.c0;
import a80.a;
import ah2.f;
import z0.l0;
import z0.e1;

public final class e<T, V extends i> implements e1<T>
{
    public final g0<T, V> f;
    public final l0 g;
    public V h;
    public long i;
    public long j;
    public boolean k;
    
    public e(final g0<T, V> f, final T t, final V v, final long i, final long j, final boolean k) {
        ah2.f.f((Object)f, "typeConverter");
        this.f = f;
        this.g = a.n0(t);
        i h;
        if (v != null) {
            h = c0.y((i)v);
        }
        else {
            h = a.C(f, t);
        }
        this.h = (V)h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final T a() {
        return (T)this.f.b().invoke((Object)this.h);
    }
    
    @Override
    public final T getValue() {
        return ((SnapshotMutableStateImpl<T>)this.g).getValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("AnimationState(value=");
        k.append(this.getValue());
        k.append(", velocity=");
        k.append(this.a());
        k.append(", isRunning=");
        k.append(this.k);
        k.append(", lastFrameTimeNanos=");
        k.append(this.i);
        k.append(", finishedTimeNanos=");
        return c.k(k, this.j, ')');
    }
}
