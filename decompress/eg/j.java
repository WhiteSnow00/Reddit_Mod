// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import android.os.BaseBundle;
import java.util.ArrayList;
import com.google.android.play.core.assetpacks.AssetPackException;
import android.os.RemoteException;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.a;
import qg.k;
import ig.a1;

public class j<T> extends a1
{
    public final k<T> a;
    public final /* synthetic */ a b;
    
    public j(final a b, final k<T> a) {
        this.b = b;
        this.a = a;
    }
    
    public void S(final Bundle bundle, final Bundle bundle2) throws RemoteException {
        this.b.d.c((k)this.a);
        com.google.android.play.core.assetpacks.a.g.j("onGetChunkFileDescriptor", new Object[0]);
    }
    
    public void U0(final Bundle bundle, final Bundle bundle2) {
        this.b.d.c((k)this.a);
        com.google.android.play.core.assetpacks.a.g.j("onKeepAlive(%b)", new Object[] { ((BaseBundle)bundle).getBoolean("keep_alive") });
    }
    
    public void b(final Bundle bundle) {
        this.b.d.c((k)this.a);
        final int int1 = ((BaseBundle)bundle).getInt("error_code");
        com.google.android.play.core.assetpacks.a.g.h("onError(%d)", new Object[] { int1 });
        this.a.a((Exception)new AssetPackException(int1));
    }
    
    public void n0(final ArrayList list) {
        this.b.d.c((k)this.a);
        com.google.android.play.core.assetpacks.a.g.j("onGetSessionStates", new Object[0]);
    }
}
