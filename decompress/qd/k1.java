// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.RemoteException;
import android.os.Parcel;
import ge.c;
import android.accounts.Account;
import android.os.IBinder;
import ge.a;

public final class k1 extends a implements i
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
