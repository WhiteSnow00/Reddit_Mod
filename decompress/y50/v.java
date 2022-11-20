// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import javax.inject.Inject;
import ng2.e;
import q20.a;
import mr0.g;

public final class v
{
    public final g a;
    public final a b;
    
    @Inject
    public v(final g a, final a b) {
        e.f((Object)a, "graphQlClient");
        e.f((Object)b, "backgroundThread");
        this.a = a;
        this.b = b;
    }
}
