// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public final class j4
{
    public static final Logger a;
    public static final AtomicBoolean b;
    
    static {
        a = Logger.getLogger(j4.class.getName());
        b = new AtomicBoolean(false);
    }
    
    public static boolean a() {
        return j4.b.get();
    }
}
