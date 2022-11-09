// 
// Decompiled by Procyon v0.6.0
// 

package w60;

import javax.inject.Inject;
import ah2.f;
import jw0.a;

public final class e implements d
{
    public final a a;
    public final p b;
    
    @Inject
    public e(final a a, final p b) {
        f.f((Object)a, "redditLogger");
        f.f((Object)b, "validPricePackageFinder");
        this.a = a;
        this.b = b;
    }
    
    public final a a() {
        return this.a;
    }
}
