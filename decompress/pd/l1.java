// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.RemoteException;
import we.h;
import com.google.android.gms.common.api.a$e;
import nd.d;

public final class l1 extends p
{
    public final p$a d;
    
    public l1(final p$a d, final d[] array, final boolean b) {
        this.d = d;
        super(array, b);
    }
    
    public final void a(final a$e a$e, final h h) throws RemoteException {
        this.d.a.accept((Object)a$e, (Object)h);
    }
}
