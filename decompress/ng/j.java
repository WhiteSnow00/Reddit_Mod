// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import java.util.Iterator;
import android.os.RemoteException;
import ig.b0;
import android.os.Bundle;
import android.os.BaseBundle;
import java.util.ArrayList;
import qg.k;
import java.util.Collection;
import ig.e;

public final class j extends e
{
    public final /* synthetic */ Collection g;
    public final /* synthetic */ Collection h;
    public final /* synthetic */ k i;
    public final /* synthetic */ r j;
    
    public j(final r j, final k k, final ArrayList g, final ArrayList h, final k i) {
        this.j = j;
        this.g = g;
        this.h = h;
        this.i = i;
        super(k);
    }
    
    public final void a() {
        final Collection g = this.g;
        final ArrayList list = new ArrayList<BaseBundle>(g.size());
        for (final String s : g) {
            final Bundle bundle = new Bundle();
            ((BaseBundle)bundle).putString("module_name", s);
            list.add((BaseBundle)bundle);
        }
        list.addAll(r.a(this.h));
        try {
            final r j = this.j;
            final b0 b0 = (b0)j.b.n;
            final String a = j.a;
            final Bundle bundle2 = new Bundle();
            ((BaseBundle)bundle2).putInt("playcore_version_code", 11002);
            b0.C(a, list, bundle2, new p((k<Integer>)this.i));
        }
        catch (final RemoteException ex) {
            r.c.i((Exception)ex, "startInstall(%s,%s)", new Object[] { this.g, this.h });
            this.i.a((Exception)new RuntimeException((Throwable)ex));
        }
    }
}
