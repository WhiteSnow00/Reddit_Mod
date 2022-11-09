// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import j0.i;
import java.util.Iterator;
import j0.h$e;
import j0.b;

public final class z4
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public static void a() {
        synchronized (z4.class) {
            final b a = z4.a;
            final Iterator iterator = ((h$e)a.values()).iterator();
            if (!iterator.hasNext()) {
                ((i)a).clear();
                return;
            }
            ((z4)iterator.next()).getClass();
            throw null;
        }
    }
}
