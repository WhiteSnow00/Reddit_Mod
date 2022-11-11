// 
// Decompiled by Procyon v0.6.0
// 

package ej2;

import java.util.concurrent.CancellationException;
import lg2.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class m extends v
{
    private volatile /* synthetic */ int _resumed;
    
    static {
        c = AtomicIntegerFieldUpdater.newUpdater(m.class, "_resumed");
    }
    
    public m(final c<?> c, final Throwable t, final boolean b) {
        Throwable t2 = t;
        if (t == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Continuation ");
            sb.append(c);
            sb.append(" was cancelled normally");
            t2 = new CancellationException(sb.toString());
        }
        super(t2, b);
        this._resumed = 0;
    }
}
