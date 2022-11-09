// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.os.Bundle;

public final class q extends p<Bundle>
{
    public q(final int n, final Bundle bundle) {
        super(n, 1, bundle);
    }
    
    public final void a(Bundle bundle) {
        if ((bundle = bundle.getBundle("data")) == null) {
            bundle = Bundle.EMPTY;
        }
        this.d(bundle);
    }
    
    public final boolean b() {
        return false;
    }
}
