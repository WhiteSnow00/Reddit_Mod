// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import java.util.ArrayList;
import android.os.RemoteException;
import android.os.Bundle;
import qg.k;
import ig.c0;

public class q<T> extends c0
{
    public final k<T> a;
    public final /* synthetic */ r b;
    
    public q(final r b, final k<T> a) {
        this.b = b;
        this.a = a;
    }
    
    public void N0(final int n, final Bundle bundle) throws RemoteException {
        this.b.b.c((k)this.a);
        r.c.j("onStartInstall(%d)", new Object[] { n });
    }
    
    public void b(final Bundle bundle) throws RemoteException {
        this.b.b.c((k)this.a);
        r.c.j("onDeferredLanguageInstall", new Object[0]);
    }
    
    public void f0(final int n, final Bundle bundle) throws RemoteException {
        this.b.b.c((k)this.a);
        r.c.j("onCancelInstall(%d)", new Object[] { n });
    }
    
    public void t0(final ArrayList list) throws RemoteException {
        this.b.b.c((k)this.a);
        r.c.j("onGetSessionStates", new Object[0]);
    }
}
