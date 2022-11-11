// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import sg2.e;
import kotlin.random.Random;

public abstract class a extends Random
{
    public abstract java.util.Random a();
    
    public final int nextBits(final int n) {
        return -n >> 31 & this.a().nextInt() >>> 32 - n;
    }
    
    public final boolean nextBoolean() {
        return this.a().nextBoolean();
    }
    
    public final byte[] nextBytes(final byte[] array) {
        e.f((Object)array, "array");
        this.a().nextBytes(array);
        return array;
    }
    
    public final double nextDouble() {
        return this.a().nextDouble();
    }
    
    public final float nextFloat() {
        return this.a().nextFloat();
    }
    
    public final int nextInt() {
        return this.a().nextInt();
    }
    
    public final int nextInt(final int n) {
        return this.a().nextInt(n);
    }
    
    public final long nextLong() {
        return this.a().nextLong();
    }
}
