// 
// Decompiled by Procyon v0.6.0
// 

package l0;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import mj2.c0;
import ah2.f;
import z0.l0;
import pg2.j;
import zg2.a;

public final class c<T, V extends i>
{
    public final g0<T, V> a;
    public final T b;
    public final long c;
    public final a<j> d;
    public final l0 e;
    public V f;
    public long g;
    public long h;
    public final l0 i;
    
    public c(final Object o, final g0 a, final i i, final long g, final Object b, final long c, final a d) {
        ah2.f.f((Object)a, "typeConverter");
        ah2.f.f((Object)i, "initialVelocityVector");
        this.a = a;
        this.b = (T)b;
        this.c = c;
        this.d = (a<j>)d;
        this.e = a80.a.n0(o);
        this.f = (V)c0.y(i);
        this.g = g;
        this.h = Long.MIN_VALUE;
        this.i = a80.a.n0(Boolean.TRUE);
    }
    
    public final void a() {
        ((SnapshotMutableStateImpl<Boolean>)this.i).setValue(Boolean.FALSE);
        this.d.invoke();
    }
    
    public final T b() {
        return ((SnapshotMutableStateImpl<T>)this.e).getValue();
    }
    
    public final T c() {
        return (T)this.a.b().invoke((Object)this.f);
    }
    
    public final boolean d() {
        return ((SnapshotMutableStateImpl<Boolean>)this.i).getValue();
    }
}
