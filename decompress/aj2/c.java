// 
// Decompiled by Procyon v0.6.0
// 

package aj2;

import kotlinx.coroutines.android.a;
import zi2.m0;

public final class c implements m0
{
    public final a f;
    public final Runnable g;
    
    public c(final a f, final Runnable g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void dispose() {
        this.f.h.removeCallbacks(this.g);
    }
}
