// 
// Decompiled by Procyon v0.6.0
// 

package a2;

public final class a
{
    public float a;
    public long b;
    public float c;
    public boolean d;
    
    public a() {
        this.b = Long.MAX_VALUE;
        this.c = Float.NaN;
        this.d = true;
    }
    
    public final void a(final float c, final long n) {
        if (this.b == Long.MAX_VALUE || Float.isNaN(this.c)) {
            this.b = n;
            this.c = c;
            return;
        }
        if (n == this.b) {
            this.c = c;
            return;
        }
        final float a = this.a;
        final float signum = Math.signum(a);
        final float n2 = (float)Math.sqrt(Math.abs(a) * 2);
        final float n3 = (c - this.c) / ((n - this.b) * 0.001f);
        final float a2 = Math.abs(n3) * (n3 - signum * n2) + this.a;
        this.a = a2;
        if (this.d) {
            this.a = a2 * 0.5f;
            this.d = false;
        }
        this.b = n;
        this.c = c;
    }
}
