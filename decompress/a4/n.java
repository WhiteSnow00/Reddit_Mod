// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import androidx.lifecycle.o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class n
{
    public final Runnable a;
    public final CopyOnWriteArrayList<z> b;
    public final HashMap c;
    
    public n(final Runnable a) {
        this.b = new CopyOnWriteArrayList<z>();
        this.c = new HashMap();
        this.a = a;
    }
    
    public final void a(final z z) {
        this.b.remove(z);
        final a a = this.c.remove(z);
        if (a != null) {
            a.a.c((p)a.b);
            a.b = null;
        }
        this.a.run();
    }
    
    public static final class a
    {
        public final Lifecycle a;
        public o b;
        
        public a(final Lifecycle a, final o b) {
            (this.a = a).a((p)(this.b = b));
        }
    }
}
