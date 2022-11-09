// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import ah2.f;
import java.util.Arrays;

public final class w
{
    public final /* synthetic */ int a;
    public int b;
    public int[] c;
    
    public w(final int a) {
        this.a = a;
        if (a != 1) {
            this.c = new int[10];
            return;
        }
        this.c = new int[10];
    }
    
    public final void a() {
        switch (this.a) {
            default: {
                this.b = 0;
                Arrays.fill(this.c, 0);
                return;
            }
            case 0: {
                this.b = 0;
            }
        }
    }
    
    public final int b() {
        int n;
        if ((this.b & 0x80) != 0x0) {
            n = this.c[7];
        }
        else {
            n = 65535;
        }
        return n;
    }
    
    public final int c() {
        final int[] c = this.c;
        final int b = this.b - 1;
        this.b = b;
        return c[b];
    }
    
    public final void d(final int n) {
        final int b = this.b;
        final int[] c = this.c;
        if (b >= c.length) {
            final int[] copy = Arrays.copyOf(c, c.length * 2);
            f.e((Object)copy, "copyOf(this, newSize)");
            this.c = copy;
        }
        this.c[this.b++] = n;
    }
    
    public final void e(final int n, final int n2) {
        if (n >= 0) {
            final int[] c = this.c;
            if (n < c.length) {
                this.b |= 1 << n;
                c[n] = n2;
            }
        }
    }
}
