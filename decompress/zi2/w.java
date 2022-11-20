// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import b5.k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class w
{
    public static final AtomicIntegerFieldUpdater b;
    private volatile int _handled;
    public final Throwable a;
    
    static {
        b = AtomicIntegerFieldUpdater.newUpdater(w.class, "_handled");
    }
    
    public w(final Throwable a, final boolean handled) {
        this.a = a;
        this._handled = (handled ? 1 : 0);
    }
    
    public final boolean a() {
        return this._handled != 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName());
        sb.append('[');
        return k.m(sb, this.a, ']');
    }
}
