// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.io.IOException;
import com.google.android.gms.internal.firebase-auth-api.zzacf;

public abstract class l
{
    public int a;
    public m b;
    
    public static int f(final int n) {
        return -(n & 0x1) ^ n >>> 1;
    }
    
    public static long g(final long n) {
        return -(n & 0x1L) ^ n >>> 1;
    }
    
    public abstract int a(final int p0) throws zzacf;
    
    public abstract int b() throws IOException;
    
    public abstract boolean c() throws IOException;
    
    public abstract boolean d() throws IOException;
    
    public abstract boolean e(final int p0) throws IOException;
}
