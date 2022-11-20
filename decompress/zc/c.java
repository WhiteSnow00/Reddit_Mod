// 
// Decompiled by Procyon v0.6.0
// 

package zc;

public final class c implements Runnable
{
    public final d.a.a.a f;
    public final int g;
    public final long h;
    public final long i;
    
    public c(final d.a.a.a f, final int g, final long h, final long i) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final void run() {
        this.f.b.t(this.g, this.h, this.i);
    }
}
