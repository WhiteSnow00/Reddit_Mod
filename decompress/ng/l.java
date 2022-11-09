// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import android.os.BaseBundle;
import android.os.RemoteException;
import android.os.Bundle;
import ig.b0;
import qg.k;
import ig.e;

public final class l extends e
{
    public final /* synthetic */ int g;
    public final /* synthetic */ k h;
    public final /* synthetic */ r i;
    
    public l(final r i, final k k, final int g, final k h) {
        this.i = i;
        this.g = g;
        this.h = h;
        super(k);
    }
    
    public final void a() {
        try {
            final r i = this.i;
            final b0 b0 = (b0)i.b.n;
            final String a = i.a;
            final int g = this.g;
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putInt("playcore_version_code", 11002);
            b0.q1(a, g, bundle, new m((k<Void>)this.h));
        }
        catch (final RemoteException ex) {
            r.c.i((Exception)ex, "cancelInstall(%d)", new Object[] { this.g });
            this.h.a((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
