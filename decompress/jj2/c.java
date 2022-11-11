// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import a4.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class c<T> extends n
{
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    private volatile /* synthetic */ Object _consensus;
    
    static {
        a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    }
    
    public c() {
        this._consensus = a0.S;
    }
    
    public final c<?> a() {
        return this;
    }
    
    public final Object c(final Object o) {
        Object o2;
        if ((o2 = this._consensus) == a0.S) {
            o2 = this.e(this.i(o));
        }
        this.d(o, o2);
        return o2;
    }
    
    public abstract void d(final T p0, final Object p1);
    
    public final Object e(final Object o) {
        final Object consensus = this._consensus;
        final t s = a0.S;
        if (consensus != s) {
            return consensus;
        }
        final AtomicReferenceFieldUpdater a = c.a;
        while (true) {
            while (!a.compareAndSet(this, s, o)) {
                if (a.get(this) != s) {
                    final boolean b = false;
                    if (b) {
                        return o;
                    }
                    return this._consensus;
                }
            }
            final boolean b = true;
            continue;
        }
    }
    
    public final Object f() {
        return this._consensus;
    }
    
    public long g() {
        return 0L;
    }
    
    public final boolean h() {
        return this._consensus != a0.S;
    }
    
    public abstract Object i(final T p0);
}
