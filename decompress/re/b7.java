// 
// Decompiled by Procyon v0.6.0
// 

package re;

public abstract class b7 extends a7
{
    public boolean h;
    
    public b7(g7 g) {
        super(g);
        g = super.g;
        ++g.v;
    }
    
    public final void A() {
        if (!this.h) {
            this.B();
            final g7 g = super.g;
            ++g.w;
            this.h = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public abstract boolean B();
    
    public final void z() {
        if (this.h) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
}
