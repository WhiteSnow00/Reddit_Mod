// 
// Decompiled by Procyon v0.6.0
// 

package na2;

import ng2.e;

public final class c
{
    public final int a;
    public final String b;
    public final String c;
    public final a d;
    
    public c(final int a, final String b, String c, a d, final int n) {
        if ((n & 0x4) != 0x0) {
            c = null;
        }
        if ((n & 0x8) != 0x0) {
            d = null;
        }
        e.f((Object)b, "value1");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
