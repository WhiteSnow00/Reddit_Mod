// 
// Decompiled by Procyon v0.6.0
// 

package m3;

public final class c implements Runnable
{
    public final /* synthetic */ f.a f;
    public final /* synthetic */ Object g;
    
    public c(final f.a f, final Object g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.f.f = this.g;
    }
}
