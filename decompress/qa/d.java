// 
// Decompiled by Procyon v0.6.0
// 

package qa;

import ta.a;
import ra.n;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import na.b;

public final class d implements b<c>
{
    public final Provider<Executor> a;
    public final Provider<la.d> b;
    public final Provider<n> c;
    public final Provider<sa.d> d;
    public final Provider<a> e;
    
    public d(final Provider a, final Provider b, final g c, final Provider d, final Provider e) {
        this.a = (Provider<Executor>)a;
        this.b = (Provider<la.d>)b;
        this.c = (Provider<n>)c;
        this.d = (Provider<sa.d>)d;
        this.e = (Provider<a>)e;
    }
    
    public final Object get() {
        return new c((Executor)this.a.get(), (la.d)this.b.get(), (n)this.c.get(), (sa.d)this.d.get(), (a)this.e.get());
    }
}
