// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.io.IOException;
import java.io.Closeable;
import java.util.LinkedHashSet;
import java.util.HashMap;

public abstract class l0
{
    public final HashMap a;
    public final LinkedHashSet b;
    public volatile boolean c;
    
    public l0() {
        this.a = new HashMap();
        this.b = new LinkedHashSet();
        this.c = false;
    }
    
    public static void a(final Object o) {
        if (o instanceof Closeable) {
            try {
                ((Closeable)o).close();
            }
            catch (final IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    
    public void b() {
    }
}
