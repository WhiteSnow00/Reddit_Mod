// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.q;
import androidx.lifecycle.o;

public final class l implements o
{
    public final n f;
    public final v g;
    
    public l(final n f, final v g) {
        this.f = f;
        this.g = g;
    }
    
    public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
        final n f = this.f;
        final v g = this.g;
        f.getClass();
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            f.a(g);
        }
    }
}
