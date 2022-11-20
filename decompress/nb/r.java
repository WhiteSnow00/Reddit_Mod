// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import ah0.b;
import java.util.Arrays;

public final class r
{
    public final int a;
    public boolean b;
    public boolean c;
    public byte[] d;
    public int e;
    
    public r(final int a) {
        this.a = a;
        (this.d = new byte[131])[2] = 1;
    }
    
    public final void a(final int n, int length, final byte[] array) {
        if (!this.b) {
            return;
        }
        final int n2 = length - n;
        final byte[] d = this.d;
        length = d.length;
        final int e = this.e;
        if (length < e + n2) {
            this.d = Arrays.copyOf(d, (e + n2) * 2);
        }
        System.arraycopy(array, n, this.d, this.e, n2);
        this.e += n2;
    }
    
    public final boolean b(final int n) {
        if (!this.b) {
            return false;
        }
        this.e -= n;
        this.b = false;
        return this.c = true;
    }
    
    public final void c() {
        this.b = false;
        this.c = false;
    }
    
    public final void d(final int n) {
        final boolean b = this.b;
        boolean b2 = true;
        ah0.b.H(b ^ true);
        if (n != this.a) {
            b2 = false;
        }
        this.b = b2;
        if (b2) {
            this.e = 3;
            this.c = false;
        }
    }
}
