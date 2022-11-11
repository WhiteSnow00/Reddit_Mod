// 
// Decompiled by Procyon v0.6.0
// 

package x7;

public final class f implements Runnable
{
    public final /* synthetic */ Throwable f;
    public final /* synthetic */ a$g g;
    
    public f(final a$g g, final Throwable f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.g.a.e(this.f);
    }
}
