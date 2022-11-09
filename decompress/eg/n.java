// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.os.BaseBundle;
import android.os.Bundle;
import qg.k;
import com.google.android.play.core.assetpacks.a;

public final class n extends j<Void>
{
    public final /* synthetic */ a c;
    
    public n(final a c, final k<Void> k) {
        this.c = c;
        super(k);
    }
    
    @Override
    public final void U0(final Bundle bundle, final Bundle bundle2) {
        super.U0(bundle, bundle2);
        if (!this.c.f.compareAndSet(true, false)) {
            com.google.android.play.core.assetpacks.a.g.k("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (((BaseBundle)bundle).getBoolean("keep_alive")) {
            this.c.a();
        }
    }
}
