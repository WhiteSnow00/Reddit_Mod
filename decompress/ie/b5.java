// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.Iterator;
import j0.h$e;
import j0.b;

public final class b5
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public static void a() {
        synchronized (b5.class) {
            final b a = b5.a;
            final Iterator iterator = ((h$e)a.values()).iterator();
            if (!iterator.hasNext()) {
                a.clear();
                return;
            }
            ((b5)iterator.next()).getClass();
            throw null;
        }
    }
}
