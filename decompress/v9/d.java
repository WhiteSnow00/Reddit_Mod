// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import java.util.concurrent.Executors;
import rt2.c;
import java.util.concurrent.ExecutorService;
import rt2.b;

public abstract class d implements a
{
    public static final b b;
    public final ExecutorService a;
    
    static {
        b = c.b("LruDiskUsage");
    }
    
    public d() {
        this.a = Executors.newSingleThreadExecutor();
    }
    
    public abstract boolean a(final long p0, final int p1);
}
