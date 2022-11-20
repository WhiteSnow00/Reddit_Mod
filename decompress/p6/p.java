// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.concurrent.atomic.AtomicBoolean;

public final class p implements f0
{
    public final String a;
    public final AtomicBoolean b;
    
    public p(final String a, final AtomicBoolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void onResult(final Object o) {
        final String a = this.a;
        final AtomicBoolean b = this.b;
        final h h = (h)o;
        r.a.remove(a);
        b.set(true);
    }
}
