// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import a80.a;
import u2.i;
import z0.l0;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;

public final class c implements b
{
    public Transition<EnterExitState> a;
    public final l0 b;
    
    public c(final Transition<EnterExitState> a) {
        this.a = a;
        this.b = a80.a.n0(new i(0L));
    }
    
    @Override
    public final Transition<EnterExitState> a() {
        return this.a;
    }
}
