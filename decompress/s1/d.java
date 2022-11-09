// 
// Decompiled by Procyon v0.6.0
// 

package s1;

public abstract class d
{
    public final boolean a;
    public final boolean b;
    
    public d(boolean a, boolean b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = false;
        }
        if ((n & 0x2) != 0x0) {
            b = false;
        }
        this.a = a;
        this.b = b;
    }
}
