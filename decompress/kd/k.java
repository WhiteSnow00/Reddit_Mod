// 
// Decompiled by Procyon v0.6.0
// 

package kd;

import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public final class k extends e
{
    public final /* synthetic */ l a;
    
    public k(final l a) {
        this.a = a;
    }
    
    public final void d0(final Status status) throws RemoteException {
        ((BasePendingResult<Status>)this.a).g(status);
    }
}
