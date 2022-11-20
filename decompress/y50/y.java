// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import javax.inject.Inject;
import ng2.e;
import q20.a;
import mr0.g;

public final class y
{
    public final g a;
    public final a b;
    
    @Inject
    public y(final g a, final a b) {
        e.f((Object)a, "client");
        e.f((Object)b, "backgroundThread");
        this.a = a;
        this.b = b;
    }
}
