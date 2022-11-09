// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import androidx.fragment.app.Fragment;
import android.content.Intent;

public final class x extends z
{
    public final /* synthetic */ Intent f;
    public final /* synthetic */ Fragment g;
    public final /* synthetic */ int h;
    
    public x(final Fragment g, final Intent f, final int h) {
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
