// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.RemoteException;
import ve.h;
import com.google.android.gms.common.api.a$e;
import md.d;

public final class m1 extends p
{
    public final /* synthetic */ p$a d;
    
    public m1(final p$a d, final d[] array, final boolean b) {
        this.d = d;
        super(array, b);
    }
    
    public final void a(final a$e a$e, final h h) throws RemoteException {
        this.d.a.accept((Object)a$e, (Object)h);
    }
}
