// 
// Decompiled by Procyon v0.6.0
// 

package pe;

public abstract class i3 extends l2
{
    public boolean g;
    
    public i3(final h4 h4) {
        super(h4);
        ((h4)super.f).c();
    }
    
    public final void N() {
        if (this.g) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void O() {
        if (!this.g) {
            if (!this.P()) {
                ((h4)super.f).a();
                this.g = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public abstract boolean P();
}
