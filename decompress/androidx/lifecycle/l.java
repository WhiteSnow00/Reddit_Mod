// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import ej2.z0;

public final class l
{
    public final Lifecycle a;
    public final Lifecycle.State b;
    public final e c;
    public final k d;
    
    public l(final Lifecycle a, final Lifecycle.State b, final e c, final z0 z0) {
        sg2.e.f((Object)a, "lifecycle");
        sg2.e.f((Object)b, "minState");
        sg2.e.f((Object)c, "dispatchQueue");
        this.a = a;
        this.b = b;
        this.c = c;
        final k d = new k(this, z0);
        this.d = d;
        if (a.b() == Lifecycle.State.DESTROYED) {
            z0.a((CancellationException)null);
            this.a();
        }
        else {
            a.a((p)d);
        }
    }
    
    public final void a() {
        this.a.c((p)this.d);
        final e c = this.c;
        c.b = true;
        c.a();
    }
}
