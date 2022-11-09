// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.c;
import e40.k;
import ca0.o0;
import w21.b;
import x21.a;
import javax.inject.Provider;
import af2.e;

public final class n7
{
    public final a1 a;
    public e b;
    public Provider<a> c;
    public Provider<b> d;
    
    public n7(final a1 a, final x21.b b) {
        this.a = a;
        this.b = e.a((Object)b);
        this.c = (Provider<a>)af2.c.b((Provider)new k((Provider)this.b, (Provider)a.b1, (Provider)o0.a((Provider)a.h), 21));
        this.d = (Provider<b>)af2.c.b((Provider)new ww0.c((Object)a.L, 4));
    }
}
