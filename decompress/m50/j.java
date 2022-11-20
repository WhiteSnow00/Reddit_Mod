// 
// Decompiled by Procyon v0.6.0
// 

package m50;

import ng2.e;
import q90.h;
import android.content.Context;
import javax.inject.Provider;
import ne2.d;

public final class j implements d<i>
{
    public final Provider<Context> a;
    
    public j(final h.b a) {
        this.a = (Provider<Context>)a;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        e.e(value, "context.get()");
        return new i((Context)value);
    }
}
