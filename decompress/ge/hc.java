// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import ve.h;
import ve.x;
import java.util.concurrent.ExecutorService;

public class hc
{
    public rb a;
    public ExecutorService b;
    
    public final x a(final fc fc) {
        final h h = new h();
        this.b.execute(new gc(this, fc, h));
        return h.a;
    }
}
