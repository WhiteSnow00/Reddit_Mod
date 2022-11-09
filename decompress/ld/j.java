// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class j extends f
{
    public final /* synthetic */ k a;
    
    public j(final k a) {
        this.a = a;
    }
    
    @Override
    public final void h(final Status status) throws RemoteException {
        ((BasePendingResult<Status>)this.a).g(status);
    }
}
