// 
// Decompiled by Procyon v0.6.0
// 

package ob;

public final class i
{
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;
    
    public i() {
        this.a = 0;
        this.b = -1;
        this.c = 0;
        final int[] d = new int[16];
        this.d = d;
        this.e = d.length - 1;
    }
    
    public final void a(final int n) {
        final int c = this.c;
        final int[] d = this.d;
        if (c == d.length) {
            final int n2 = d.length << 1;
            if (n2 < 0) {
                throw new IllegalStateException();
            }
            final int[] d2 = new int[n2];
            final int length = d.length;
            final int a = this.a;
            final int n3 = length - a;
            System.arraycopy(d, a, d2, 0, n3);
            System.arraycopy(this.d, 0, d2, n3, a);
            this.a = 0;
            this.b = this.c - 1;
            this.d = d2;
            this.e = n2 - 1;
        }
        final int b = this.b + 1 & this.e;
        this.b = b;
        this.d[b] = n;
        ++this.c;
    }
}
