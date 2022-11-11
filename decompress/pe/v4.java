// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;

public abstract class v4 extends d1
{
    public boolean g;
    
    public v4(final h4 h4) {
        super(h4);
        ((h4)super.f).c();
    }
    
    public abstract boolean N();
    
    public final void O() {
        if (this.g) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }
    
    public final void P() {
        if (!this.g) {
            if (!this.N()) {
                ((h4)super.f).a();
                this.g = true;
            }
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }
}
