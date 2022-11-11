// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.concurrent.Callable;

public final class k4 implements Callable
{
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ u4 i;
    
    public k4(final u4 i, final String f, final String g, final String h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() throws Exception {
        this.i.a.a();
        final k h = this.i.a.h;
        g7.H((b7)h);
        return h.r0(this.f, this.g, this.h);
    }
}
