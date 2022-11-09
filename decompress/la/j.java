// 
// Decompiled by Procyon v0.6.0
// 

package la;

import na.c;
import android.content.Context;
import javax.inject.Provider;
import na.b;

public final class j implements b<i>
{
    public final Provider<Context> a;
    public final Provider<g> b;
    
    public j(final c a, final h b) {
        this.a = (Provider<Context>)a;
        this.b = (Provider<g>)b;
    }
    
    public final Object get() {
        return new i((Context)this.a.get(), (g)this.b.get());
    }
}
