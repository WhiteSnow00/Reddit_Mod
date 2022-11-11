// 
// Decompiled by Procyon v0.6.0
// 

package pa;

import sa.a;
import qa.o;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import ma.b;

public final class d implements b<c>
{
    public final Provider<Executor> a;
    public final Provider<ka.d> b;
    public final Provider<o> c;
    public final Provider<ra.d> d;
    public final Provider<a> e;
    
    public d(final Provider a, final Provider b, final g c, final Provider d, final Provider e) {
        this.a = (Provider<Executor>)a;
        this.b = (Provider<ka.d>)b;
        this.c = (Provider<o>)c;
        this.d = (Provider<ra.d>)d;
        this.e = (Provider<a>)e;
    }
    
    public final Object get() {
        return new c((Executor)this.a.get(), (ka.d)this.b.get(), (o)this.c.get(), (ra.d)this.d.get(), (a)this.e.get());
    }
}
