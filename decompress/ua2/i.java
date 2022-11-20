// 
// Decompiled by Procyon v0.6.0
// 

package ua2;

import r82.o;
import com.reddit.vault.h;

public interface i
{
    void a(final h p0);
    
    void b(final o p0, final String p1, final h p2);
    
    void c(final h p0);
    
    void d(final h p0);
    
    void e(final h p0);
    
    public static final class a
    {
        public static void a(final i i, final o o, String s, h h, final int n) {
            if ((n & 0x2) != 0x0) {
                s = null;
            }
            if ((n & 0x4) != 0x0) {
                h = null;
            }
            i.b(o, s, h);
        }
    }
}
