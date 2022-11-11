// 
// Decompiled by Procyon v0.6.0
// 

package pe;

public final class j0 implements Runnable
{
    public final /* synthetic */ long f;
    public final /* synthetic */ k1 g;
    
    public j0(final k1 g, final long f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.g.S(this.f);
    }
}
