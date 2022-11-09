// 
// Decompiled by Procyon v0.6.0
// 

package q;

import android.os.Bundle;

public final class b implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ Bundle g;
    public final /* synthetic */ g h;
    
    public b(final g h, final int f, final Bundle g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void run() {
        this.h.b.W(this.f, this.g);
    }
}
