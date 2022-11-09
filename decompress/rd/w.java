// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.app.Activity;
import android.content.Intent;

public final class w extends z
{
    public final /* synthetic */ Intent f;
    public final /* synthetic */ Activity g;
    public final /* synthetic */ int h;
    
    public w(final int h, final Activity g, final Intent f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void a() {
        final Intent f = this.f;
        if (f != null) {
            this.g.startActivityForResult(f, this.h);
        }
    }
}
