// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class l extends f
{
    public final /* synthetic */ m a;
    
    public l(final m a) {
        this.a = a;
    }
    
    @Override
    public final void X(final Status status) throws RemoteException {
        ((BasePendingResult<Status>)this.a).g(status);
    }
}
