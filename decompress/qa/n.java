// 
// Decompiled by Procyon v0.6.0
// 

package qa;

import pa.g;
import sa.a;
import ra.d;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import ma.b;

public final class n implements b<m>
{
    public final Provider<Executor> a;
    public final Provider<d> b;
    public final Provider<o> c;
    public final Provider<a> d;
    
    public n(final Provider a, final Provider b, final g c, final Provider d) {
        this.a = (Provider<Executor>)a;
        this.b = (Provider<d>)b;
        this.c = (Provider<o>)c;
        this.d = (Provider<a>)d;
    }
    
    public final Object get() {
        return new m((Executor)this.a.get(), (d)this.b.get(), (o)this.c.get(), (a)this.d.get());
    }
}
