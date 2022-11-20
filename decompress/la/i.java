// 
// Decompiled by Procyon v0.6.0
// 

package la;

import javax.inject.Inject;
import android.content.Context;
import java.util.HashMap;
import javax.inject.Singleton;

@Singleton
public final class i implements d
{
    public final i.i$a a;
    public final g b;
    public final HashMap c;
    
    @Inject
    public i(final Context context, final g b) {
        final i.i$a a = new i.i$a(context);
        this.c = new HashMap();
        this.a = a;
        this.b = b;
    }
    
    public final k b(final String s) {
        synchronized (this) {
            if (this.c.containsKey(s)) {
                return this.c.get(s);
            }
            final c a = this.a.a(s);
            if (a == null) {
                return null;
            }
            final g b = this.b;
            final k create = a.create((f)new b(b.a, b.b, b.c, s));
            this.c.put(s, create);
            return create;
        }
    }
}
