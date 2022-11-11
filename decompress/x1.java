// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import ca0.k0;
import d60.e;
import r20.a;
import javax.inject.Provider;
import af2.d;

public final class x1 implements d<w1>
{
    public final Provider<a> a;
    public final Provider<e> b;
    
    public x1(final Provider b) {
        final k0 a = k0.a.a;
        this.a = (Provider<a>)a;
        this.b = (Provider<e>)b;
    }
    
    public final Object get() {
        return new w1((a)this.a.get(), (e)this.b.get());
    }
}
