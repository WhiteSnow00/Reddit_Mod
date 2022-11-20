// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import b5.k;
import cg.d;
import xd.a;
import ah0.b;
import z0.k0;
import z0.c1;

public final class e<T, V extends i> implements c1<T>
{
    public final h0<T, V> f;
    public final k0 g;
    public V h;
    public long i;
    public long j;
    public boolean k;
    
    public e(final h0 h0, final Object o, i i, final int n) {
        if ((n & 0x4) != 0x0) {
            i = null;
        }
        long n2;
        if ((n & 0x8) != 0x0) {
            n2 = Long.MIN_VALUE;
        }
        else {
            n2 = 0L;
        }
        long n3;
        if ((n & 0x10) != 0x0) {
            n3 = Long.MIN_VALUE;
        }
        else {
            n3 = 0L;
        }
        this((l0.h0<Object, i>)h0, o, i, n2, n3, false);
    }
    
    public e(final h0<T, V> f, final T t, final V v, final long i, final long j, final boolean k) {
        ng2.e.f((Object)f, "typeConverter");
        this.f = f;
        this.g = b.Z0((Object)t);
        i h;
        if (v != null) {
            h = a.L((i)v);
        }
        else {
            h = d.D1((h0)f, (Object)t);
        }
        this.h = (V)h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final T a() {
        return (T)this.f.b().invoke((Object)this.h);
    }
    
    public final T getValue() {
        return (T)((SnapshotMutableStateImpl)this.g).getValue();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("AnimationState(value=");
        t.append(this.getValue());
        t.append(", velocity=");
        t.append(this.a());
        t.append(", isRunning=");
        t.append(this.k);
        t.append(", lastFrameTimeNanos=");
        t.append(this.i);
        t.append(", finishedTimeNanos=");
        return b5.k.k(t, this.j, ')');
    }
}
