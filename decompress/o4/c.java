// 
// Decompiled by Procyon v0.6.0
// 

package o4;

import a4.u1;
import java.nio.ByteBuffer;

public class c
{
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;
    
    public c() {
        if (u1.y == null) {
            u1.y = new u1();
        }
    }
    
    public final int a(int short1) {
        if (short1 < this.d) {
            short1 = this.b.getShort(this.c + short1);
        }
        else {
            short1 = 0;
        }
        return short1;
    }
    
    public final void b(int n, final ByteBuffer b) {
        this.b = b;
        if (b != null) {
            this.a = n;
            n -= b.getInt(n);
            this.c = n;
            this.d = this.b.getShort(n);
        }
        else {
            this.a = 0;
            this.c = 0;
            this.d = 0;
        }
    }
}
