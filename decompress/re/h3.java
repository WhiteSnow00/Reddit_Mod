// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;

public abstract class h3 extends k2
{
    public boolean g;
    
    public h3(final h4 h4) {
        super(h4);
        ((h4)((w)this).f).c();
    }
    
    public final void A() {
        if (!this.g) {
            if (!this.B()) {
                ((h4)((w)this).f).b();
                this.g = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
    
    public abstract boolean B();
    
    public final void z() {
        if (this.g) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
}
