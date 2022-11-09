// 
// Decompiled by Procyon v0.6.0
// 

package t7;

import java.util.concurrent.TimeUnit;

public final class a
{
    public final boolean a;
    public final long b;
    public final int c;
    
    public a() {
        final long millis = TimeUnit.MILLISECONDS.toMillis(10L);
        this.a = false;
        this.b = millis;
        this.c = 10;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return this.a == a.a && this.b == a.b && this.c == a.c;
    }
    
    @Override
    public final int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        return Integer.hashCode(this.c) + b.c(this.b, a * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("BatchConfig(batchingEnabled=");
        k.append(this.a);
        k.append(", batchIntervalMs=");
        k.append(this.b);
        k.append(", maxBatchSize=");
        return d.k(k, this.c, ')');
    }
}
