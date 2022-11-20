// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.q;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.o;

public final class m implements o
{
    public final n f;
    public final Lifecycle$State g;
    public final v h;
    
    public m(final n f, final Lifecycle$State g, final v h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
        final n f = this.f;
        final Lifecycle$State g = this.g;
        final v h = this.h;
        f.getClass();
        if (lifecycle$Event == Lifecycle$Event.upTo(g)) {
            f.b.add(h);
            f.a.run();
        }
        else if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            f.a(h);
        }
        else if (lifecycle$Event == Lifecycle$Event.downFrom(g)) {
            f.b.remove(h);
            f.a.run();
        }
    }
}
