// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import he.b;
import android.os.RemoteException;
import android.accounts.Account;
import android.os.IInterface;

public interface j extends IInterface
{
    Account r() throws RemoteException;
    
    public abstract static class a extends b implements j
    {
    }
}
