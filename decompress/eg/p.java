// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.os.BaseBundle;
import android.os.Bundle;
import qg.k;
import com.google.android.play.core.assetpacks.a;

public final class p extends j<Void>
{
    public final int c;
    public final String d;
    public final int e;
    public final /* synthetic */ a f;
    
    public p(final a f, final k<Void> k, final int c, final String d, final int e) {
        this.f = f;
        super(k);
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final void b(final Bundle bundle) {
        this.f.d.c(super.a);
        com.google.android.play.core.assetpacks.a.g.h("onError(%d), retrying notifyModuleCompleted...", new Object[] { ((BaseBundle)bundle).getInt("error_code") });
        final int e = this.e;
        if (e > 0) {
            this.f.j(this.c, e - 1, this.d);
        }
    }
}
