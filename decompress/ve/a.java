// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import android.os.Parcelable;
import android.os.BaseBundle;
import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import rd.k0;
import android.app.PendingIntent;
import android.os.IBinder;
import rd.i0;
import android.accounts.Account;
import android.os.RemoteException;
import android.util.Log;
import android.os.Parcel;
import rd.j;
import rd.b;
import qd.l;
import com.google.android.gms.common.api.c;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;
import rd.d;
import ue.f;
import rd.g;

public final class a extends g<ve.g> implements f
{
    public final boolean L;
    public final rd.d M;
    public final Bundle N;
    public final Integer O;
    
    public a(final Context context, final Looper looper, final rd.d m, final Bundle n, final com.google.android.gms.common.api.c.b b, final com.google.android.gms.common.api.c.c c) {
        super(context, looper, 44, m, (qd.d)b, (l)c);
        this.L = true;
        this.M = m;
        this.N = n;
        this.O = m.i;
    }
    
    @Override
    public final Bundle A() {
        if (!super.m.getPackageName().equals(this.M.f)) {
            ((BaseBundle)this.N).putString("com.google.android.gms.signin.internal.realClientPackageName", this.M.f);
        }
        return this.N;
    }
    
    @Override
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
    
    @Override
    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }
    
    @Override
    public final boolean g() {
        return this.L;
    }
    
    @Override
    public final void h() {
        this.n((c)new d());
    }
    
    @Override
    public final void j(final j j, final boolean b) {
        try {
            final ve.g g = this.C();
            final Integer o = this.O;
            yd.a.S0((Object)o);
            final int intValue = o;
            final Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(((fe.a)g).b);
            final int a = fe.c.a;
            obtain.writeStrongBinder(((IInterface)j).asBinder());
            obtain.writeInt(intValue);
            obtain.writeInt((int)(b ? 1 : 0));
            ((fe.a)g).k(obtain, 9);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }
    
    @Override
    public final void l() {
        try {
            final ve.g g = this.C();
            final Integer o = this.O;
            yd.a.S0((Object)o);
            final int intValue = o;
            final Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(((fe.a)g).b);
            obtain.writeInt(intValue);
            ((fe.a)g).k(obtain, 7);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
    
    @Override
    public final int m() {
        return 12451000;
    }
    
    @Override
    public final void p(final ve.f f) {
        if (f != null) {
            try {
                Account a = this.M.a;
                if (a == null) {
                    a = new Account("<<default account>>", "com.google");
                }
                GoogleSignInAccount b;
                if ("<<default account>>".equals(a.name)) {
                    b = ld.c.a(super.m).b();
                }
                else {
                    b = null;
                }
                final Integer o = this.O;
                yd.a.S0((Object)o);
                final i0 i0 = new i0(2, a, (int)o, b);
                final ve.g g = this.C();
                final ve.j j = new ve.j(1, i0);
                final Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(((fe.a)g).b);
                final int a2 = fe.c.a;
                obtain.writeInt(1);
                ((Parcelable)j).writeToParcel(obtain, 0);
                obtain.writeStrongBinder((IBinder)f);
                ((fe.a)g).k(obtain, 12);
                return;
            }
            catch (final RemoteException ex) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    f.i0(new ve.l(1, new od.b(8, null), null));
                    return;
                }
                catch (final RemoteException ex2) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)ex);
                    return;
                }
            }
        }
        throw new NullPointerException("Expecting a valid ISignInCallbacks");
    }
}
