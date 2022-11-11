// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;
import java.util.concurrent.Callable;

public final class r4 implements Callable
{
    public final /* synthetic */ u4 f;
    
    public r4(final u4 f, final t t, final String s) {
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        this.f.a.a();
        final t5 m = this.f.a.m;
        g7.H((b7)m);
        ((d1)m).M();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
