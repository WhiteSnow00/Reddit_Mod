// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.Parcel;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.os.Binder;
import md.d;
import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.common.api.Scope;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import qd.a;

public final class f extends a
{
    public static final Parcelable$Creator<f> CREATOR;
    public final int f;
    public final int g;
    public int h;
    public String i;
    public IBinder j;
    public Scope[] k;
    public Bundle l;
    public Account m;
    public d[] n;
    public d[] o;
    public boolean p;
    public int q;
    public boolean r;
    public String s;
    
    static {
        CREATOR = (Parcelable$Creator)new e1();
    }
    
    public f(int f, final int g, final int h, final String i, final IBinder j, final Scope[] k, final Bundle l, Account m, final d[] n, final d[] o, final boolean p14, final int q, final boolean r, final String s) {
        this.f = f;
        this.g = g;
        this.h = h;
        if ("com.google.android.gms".equals(i)) {
            this.i = "com.google.android.gms";
        }
        else {
            this.i = i;
        }
        if (f < 2) {
            final Account account = null;
            m = null;
            Account m2 = account;
            Label_0173: {
                if (j != null) {
                    f = j$a.a;
                    final IInterface queryLocalInterface = j.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    Object o2;
                    if (queryLocalInterface instanceof j) {
                        o2 = queryLocalInterface;
                    }
                    else {
                        o2 = new l1(j);
                    }
                    f = pd.a.b;
                    m2 = account;
                    if (o2 != null) {
                        final long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            try {
                                ((j)o2).r();
                            }
                            finally {}
                        }
                        catch (final RemoteException ex) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            m2 = m;
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        break Label_0173;
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.m = m2;
        }
        else {
            this.j = j;
            this.m = m;
        }
        this.k = k;
        this.l = l;
        this.n = n;
        this.o = o;
        this.p = p14;
        this.q = q;
        this.r = r;
        this.s = s;
    }
    
    public f(final int g, final String s) {
        this.f = 6;
        this.h = md.f.a;
        this.g = g;
        this.p = true;
        this.s = s;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        e1.a(this, parcel, n);
    }
}
