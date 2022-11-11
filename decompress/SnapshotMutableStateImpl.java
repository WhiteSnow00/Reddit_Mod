// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import pg2.j;
import zg2.l;
import androidx.compose.runtime.snapshots.SnapshotKt;
import i1.x;
import ah2.f;
import z0.a1;
import i1.m;
import i1.w;

public class SnapshotMutableStateImpl<T> implements w, m<T>
{
    public final a1<T> f;
    public SnapshotMutableStateImpl.SnapshotMutableStateImpl$a<T> g;
    
    public SnapshotMutableStateImpl(final T t, final a1<T> f) {
        ah2.f.f((Object)f, "policy");
        this.f = f;
        this.g = (SnapshotMutableStateImpl.SnapshotMutableStateImpl$a<T>)new SnapshotMutableStateImpl.SnapshotMutableStateImpl$a((Object)t);
    }
    
    public final x a(final x x, x x2, final x x3) {
        final SnapshotMutableStateImpl.SnapshotMutableStateImpl$a snapshotMutableStateImpl$a = (SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)x;
        if (!this.f.a(((SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)x2).c, ((SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)x3).c)) {
            this.f.getClass();
            x2 = null;
        }
        return x2;
    }
    
    public final a1<T> e() {
        return this.f;
    }
    
    public final T getValue() {
        return (T)((SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)SnapshotKt.q((x)this.g, (w)this)).c;
    }
    
    public final l<T, j> q() {
        return (l<T, j>)new SnapshotMutableStateImpl$component2.SnapshotMutableStateImpl$component2$1(this);
    }
    
    public final void setValue(final T c) {
        final SnapshotMutableStateImpl.SnapshotMutableStateImpl$a snapshotMutableStateImpl$a = (SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)SnapshotKt.h((x)this.g, SnapshotKt.i());
        if (!this.f.a(snapshotMutableStateImpl$a.c, (Object)c)) {
            final SnapshotMutableStateImpl.SnapshotMutableStateImpl$a<T> g = this.g;
            synchronized (SnapshotKt.c) {
                final i1.f i = SnapshotKt.i();
                ((SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)SnapshotKt.n((SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)g, (w)this, i, snapshotMutableStateImpl$a)).c = c;
                final j a = j.a;
                monitorexit(SnapshotKt.c);
                SnapshotKt.m(i, (w)this);
            }
        }
    }
    
    public final T t() {
        return this.getValue();
    }
    
    @Override
    public final String toString() {
        final SnapshotMutableStateImpl.SnapshotMutableStateImpl$a snapshotMutableStateImpl$a = (SnapshotMutableStateImpl.SnapshotMutableStateImpl$a)SnapshotKt.h((x)this.g, SnapshotKt.i());
        final StringBuilder k = a.k("MutableState(value=");
        k.append(snapshotMutableStateImpl$a.c);
        k.append(")@");
        k.append(this.hashCode());
        return k.toString();
    }
    
    public final x u() {
        return (x)this.g;
    }
    
    public final void z(final x x) {
        this.g = (SnapshotMutableStateImpl.SnapshotMutableStateImpl$a<T>)x;
    }
}
