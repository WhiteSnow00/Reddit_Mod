// 
// Decompiled by Procyon v0.6.0
// 

package lj2;

import java.util.concurrent.CancellationException;
import ej2.z0;
import kf2.f;

public final class a implements f
{
    public final z0 a;
    
    public a(final ej2.a a) {
        this.a = (z0)a;
    }
    
    public final void cancel() {
        this.a.a((CancellationException)null);
    }
}
