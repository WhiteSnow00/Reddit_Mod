// 
// Decompiled by Procyon v0.6.0
// 

package d;

import ng2.e;
import z0.g0;
import z0.c1;

public final class c<I, O> extends androidx.activity.result.c<I>
{
    public final a<I> a;
    public final c1<f.a<I, O>> b;
    
    public c(final a a, final g0 b) {
        e.f((Object)a, "launcher");
        this.a = (a<I>)a;
        this.b = (c1<f.a<I, O>>)b;
    }
    
    public final void a(final Object o) {
        this.a.a(o);
    }
    
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
