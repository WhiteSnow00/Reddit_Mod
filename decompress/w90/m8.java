// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import mx.b;
import af2.c;
import rh0.b$a;
import rh0.a;
import javax.inject.Provider;

public final class m8
{
    public final a1 a;
    public Provider<a> b;
    public Provider<pi0.a> c;
    
    public m8(final a1 a) {
        this.a = a;
        final Provider b = af2.c.b((Provider)b$a.a);
        this.b = (Provider<a>)b;
        this.c = (Provider<pi0.a>)af2.c.b((Provider)mx.b.b((Provider)a.h, b));
    }
}
