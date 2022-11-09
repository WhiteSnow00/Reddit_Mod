// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import android.view.View;
import android.view.WindowId;

public final class f0 implements g0
{
    public final WindowId a;
    
    public f0(final View view) {
        this.a = view.getWindowId();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof f0 && ((f0)o).a.equals((Object)this.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
