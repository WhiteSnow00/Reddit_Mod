// 
// Decompiled by Procyon v0.6.0
// 

package kd;

import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class i extends e
{
    public final /* synthetic */ j a;
    
    public i(final j a) {
        this.a = a;
    }
    
    public final void i(final Status status) throws RemoteException {
        ((BasePendingResult<Status>)this.a).g(status);
    }
}
