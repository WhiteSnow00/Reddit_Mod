// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import androidx.lifecycle.x;
import androidx.lifecycle.y;

public final class l implements y<Boolean>
{
    public final /* synthetic */ e a;
    
    public l(final e a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        if (o) {
            this.a.n0(1);
            this.a.dismiss();
            final r g = this.a.g;
            if (g.x == null) {
                g.x = new x<Boolean>();
            }
            r.i(g.x, Boolean.FALSE);
        }
    }
}
