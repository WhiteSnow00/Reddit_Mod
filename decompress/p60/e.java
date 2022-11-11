// 
// Decompiled by Procyon v0.6.0
// 

package p60;

import javax.inject.Inject;
import cw0.a;

public final class e implements d
{
    public final a a;
    public final p b;
    
    @Inject
    public e(final a a, final p b) {
        sg2.e.f((Object)a, "redditLogger");
        sg2.e.f((Object)b, "validPricePackageFinder");
        this.a = a;
        this.b = b;
    }
    
    public final a a() {
        return this.a;
    }
}
