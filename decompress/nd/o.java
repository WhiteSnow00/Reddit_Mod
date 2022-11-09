// 
// Decompiled by Procyon v0.6.0
// 

package nd;

import android.os.BaseBundle;
import com.google.android.gms.cloudmessaging.zzq;
import android.os.Bundle;

public final class o extends p<Void>
{
    public o(final int n, final Bundle bundle) {
        super(n, 2, bundle);
    }
    
    public final void a(final Bundle bundle) {
        if (((BaseBundle)bundle).getBoolean("ack", false)) {
            this.d((Bundle)null);
            return;
        }
        this.c(new zzq(4, "Invalid response to one way request", (Throwable)null));
    }
    
    public final boolean b() {
        return true;
    }
}
