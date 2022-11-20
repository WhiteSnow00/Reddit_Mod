// 
// Decompiled by Procyon v0.6.0
// 

package xd2;

import java.util.concurrent.TimeUnit;

public final class b
{
    public int a;
    public long b;
    
    public b() {
        this.a = 1000;
        this.b = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
