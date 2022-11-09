// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.RemoteException;
import android.os.Parcel;
import he.c;
import android.accounts.Account;
import android.os.IBinder;
import he.a;

public final class k1 extends he.a implements j
{
    public k1(final IBinder binder) {
        super(binder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    public final Account r() throws RemoteException {
        final Parcel k = this.k(this.m(), 2);
        final Account account = (Account)c.a(k, Account.CREATOR);
        k.recycle();
        return account;
    }
}
