// 
// Decompiled by Procyon v0.6.0
// 

package la;

import na.c;
import ua.a;
import android.content.Context;
import javax.inject.Provider;
import na.b;

public final class h implements b<g>
{
    public final Provider<Context> a;
    public final Provider<a> b;
    public final Provider<a> c;
    
    public h(final c a) {
        final ua.b a2 = ua.b.a.a;
        final ua.c a3 = ua.c.a.a;
        this.a = (Provider<Context>)a;
        this.b = (Provider<a>)a2;
        this.c = (Provider<a>)a3;
    }
    
    public final Object get() {
        return new g((Context)this.a.get(), (a)this.b.get(), (a)this.c.get());
    }
}
