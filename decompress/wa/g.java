// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import zc.l;
import android.content.Context;
import sg.j;

public final class g implements j
{
    public final int f;
    public final Context g;
    
    public g(final Context g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object get() {
        switch (this.f) {
            default: {
                return l.j(this.g);
            }
            case 0: {
                return new d(this.g);
            }
        }
    }
}
