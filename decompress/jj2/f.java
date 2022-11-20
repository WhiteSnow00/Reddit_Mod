// 
// Decompiled by Procyon v0.6.0
// 

package jj2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class f
{
    public static final AtomicLongFieldUpdater a;
    private volatile long number;
    
    static {
        a = AtomicLongFieldUpdater.newUpdater(f.class, "number");
    }
    
    public f() {
        this.number = 1L;
    }
}
