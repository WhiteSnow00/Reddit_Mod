// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import sg2.e;
import java.util.Map;

public final class l0 extends m0
{
    public final /* synthetic */ Map<k0, n0> c;
    public final /* synthetic */ boolean d;
    
    public l0(final boolean d, final Map c) {
        this.c = c;
        this.d = d;
    }
    
    public final boolean a() {
        return this.d;
    }
    
    public final boolean e() {
        return this.c.isEmpty();
    }
    
    public final n0 g(final k0 k0) {
        e.f((Object)k0, "key");
        return this.c.get(k0);
    }
}
