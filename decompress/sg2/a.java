// 
// Decompiled by Procyon v0.6.0
// 

package sg2;

import ng2.e;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public final class a extends rg2.a
{
    public final Random a() {
        final ThreadLocalRandom current = ThreadLocalRandom.current();
        e.e((Object)current, "current()");
        return current;
    }
    
    public final double nextDouble(final double n) {
        return ThreadLocalRandom.current().nextDouble(n);
    }
    
    public final int nextInt(final int n, final int n2) {
        return ThreadLocalRandom.current().nextInt(n, n2);
    }
    
    public final long nextLong(final long n) {
        return ThreadLocalRandom.current().nextLong(n);
    }
    
    public final long nextLong(final long n, final long n2) {
        return ThreadLocalRandom.current().nextLong(n, n2);
    }
}
