// 
// Decompiled by Procyon v0.6.0
// 

package wl2;

import zk2.c;
import zk2.b;

public final class j
{
    public final byte[] a;
    public final byte[] b;
    public final b c;
    public int d;
    public int e;
    
    public j(final byte[] a, final byte[] b, final c c) {
        this.a = a;
        this.b = b;
        this.c = (b)c;
    }
    
    public final void a(final byte[] array, final int n, final boolean b) {
        if (array.length >= this.c.f()) {
            final b c = this.c;
            final byte[] a = this.a;
            c.b(0, a.length, a);
            this.c.c((byte)(this.d >>> 24));
            this.c.c((byte)(this.d >>> 16));
            this.c.c((byte)(this.d >>> 8));
            this.c.c((byte)this.d);
            this.c.c((byte)(this.e >>> 8));
            this.c.c((byte)this.e);
            this.c.c((byte)(-1));
            final b c2 = this.c;
            final byte[] b2 = this.b;
            c2.b(0, b2.length, b2);
            this.c.g(n, array);
            if (b) {
                ++this.e;
            }
            return;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }
}
