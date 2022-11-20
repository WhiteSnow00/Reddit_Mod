// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.q;
import androidx.lifecycle.o;

public final class i1 implements o
{
    public final AbstractComposeView f;
    
    public i1(final AbstractComposeView f) {
        this.f = f;
    }
    
    public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
        final AbstractComposeView f = this.f;
        e.f((Object)f, "$view");
        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
            f.d();
        }
    }
}
