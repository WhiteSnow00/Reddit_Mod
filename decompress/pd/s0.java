// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Handler;
import ee.f;

public final class s0 implements b$a
{
    public final e a;
    
    public s0(final e a) {
        this.a = a;
    }
    
    public final void a(final boolean b) {
        final f s = this.a.s;
        ((Handler)s).sendMessage(((Handler)s).obtainMessage(1, (Object)b));
    }
}
