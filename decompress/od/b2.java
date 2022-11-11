// 
// Decompiled by Procyon v0.6.0
// 

package od;

import lw0.b;
import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;

public final class b2 implements b, c.c
{
    public final a<?> a;
    public final boolean b;
    public c2 c;
    
    public b2(final a<?> a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void X(final Bundle bundle) {
        lw0.b.S((Object)this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.X(bundle);
    }
    
    @Override
    public final void l(final int n) {
        lw0.b.S((Object)this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.l(n);
    }
    
    public final void o(final md.b b) {
        b.S((Object)this.c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.c.N(b, this.a, this.b);
    }
}
