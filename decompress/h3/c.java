// 
// Decompiled by Procyon v0.6.0
// 

package h3;

public final class c extends d
{
    public float c;
    
    public c() {
        this.c = 0.0f;
    }
    
    public final void f() {
        super.b = 0;
        super.a.clear();
        this.c = 0.0f;
    }
    
    public final void g(final int n) {
        final int b = super.b;
        if (b == 0 || this.c != n) {
            this.c = (float)n;
            if (b == 1) {
                this.c();
            }
            this.b();
        }
    }
}
