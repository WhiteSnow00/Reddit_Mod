// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import qd.h;
import android.content.Intent;

public final class y extends z
{
    public final /* synthetic */ Intent f;
    public final /* synthetic */ h g;
    
    public y(final Intent f, final h g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void a() {
        final Intent f = this.f;
        if (f != null) {
            this.g.startActivityForResult(f, 2);
        }
    }
}
