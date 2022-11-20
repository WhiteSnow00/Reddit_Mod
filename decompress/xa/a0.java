// 
// Decompiled by Procyon v0.6.0
// 

package xa;

import bd.n$a;

public final class a0 implements n$a
{
    public final int f;
    public final b$a g;
    public final boolean h;
    public final int i;
    
    public a0(final b$a g, final int i, final boolean h) {
        this.f = 0;
        this.g = g;
        this.i = i;
        this.h = h;
    }
    
    public a0(final b$a g, final boolean h, final int i) {
        this.f = 1;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void invoke(final Object o) {
        switch (this.f) {
            default: {
                ((b)o).onPlayerStateChanged(this.g, this.h, this.i);
                return;
            }
            case 0: {
                ((b)o).onDeviceVolumeChanged(this.g, this.i, this.h);
            }
        }
    }
}
