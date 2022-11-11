// 
// Decompiled by Procyon v0.6.0
// 

package od;

import te.f;
import lw0.b;
import android.os.Bundle;
import com.google.android.gms.common.api.c;

public final class f0 implements b, c.c
{
    public final /* synthetic */ h0 a;
    
    @Override
    public final void X(final Bundle bundle) {
        lw0.b.R((Object)this.a.r);
        final se.f k = this.a.k;
        lw0.b.R((Object)k);
        k.b((f)new e0(this.a));
    }
    
    @Override
    public final void l(final int n) {
    }
    
    public final void o(final md.b b) {
        this.a.b.lock();
        try {
            if (this.a.l && !b.q()) {
                this.a.h();
                this.a.m();
            }
            else {
                this.a.k(b);
            }
        }
        finally {
            this.a.b.unlock();
        }
    }
}
