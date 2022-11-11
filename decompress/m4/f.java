// 
// Decompiled by Procyon v0.6.0
// 

package m4;

public final class f implements Runnable
{
    public final /* synthetic */ a.g f;
    public final /* synthetic */ e$b g;
    
    public f(final e$b g, final a$a$a f) {
        this.g = g;
        this.f = (a.g)f;
    }
    
    @Override
    public final void run() {
        final e$b g = this.g;
        g.g = this.f;
        g.b();
    }
}
