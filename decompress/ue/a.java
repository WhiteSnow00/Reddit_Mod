// 
// Decompiled by Procyon v0.6.0
// 

package ue;

import android.os.Parcelable;
import android.os.BaseBundle;
import android.os.IInterface;
import qd.i;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import qd.k0;
import android.app.PendingIntent;
import android.os.IBinder;
import qd.i0;
import android.accounts.Account;
import android.os.RemoteException;
import android.util.Log;
import android.os.Parcel;
import mg.d0;
import qd.b$c;
import qd.b;
import pd.l;
import com.google.android.gms.common.api.c;
import android.os.Looper;
import android.content.Context;
import android.os.Bundle;
import qd.d;
import te.f;
import qd.g;

public final class a extends g<ue.g> implements f
{
    public final boolean L;
    public final d M;
    public final Bundle N;
    public final Integer O;
    
    public a(final Context context, final Looper looper, final d m, final Bundle n, final c.b b, final c.c c) {
        super(context, looper, 44, m, (pd.d)b, (l)c);
        this.L = true;
        this.M = m;
        this.N = n;
        this.O = m.i;
    }
    
    public final Bundle A() {
        if (!super.m.getPackageName().equals(this.M.f)) {
            ((BaseBundle)this.N).putString("com.google.android.gms.signin.internal.realClientPackageName", this.M.f);
        }
        return this.N;
    }
    
    public final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }
    
    public final String E() {
        return "com.google.android.gms.signin.service.START";
    }
    
    public final boolean f() {
        return this.L;
    }
    
    public final void g() {
        this.s((b$c)new b.d(this));
    }
    
    public final void j() {
        try {
            final ue.g g = (ue.g)this.C();
            final Integer o = this.O;
            d0.y((Object)o);
            final int intValue = o;
            final Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(((ee.a)g).b);
            obtain.writeInt(intValue);
            ((ee.a)g).k(obtain, 7);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
    
    public final int k() {
        return 12451000;
    }
    
    public final void m(final ue.f f) {
        if (f != null) {
            try {
                Account a = this.M.a;
                if (a == null) {
                    a = new Account("<<default account>>", "com.google");
                }
                GoogleSignInAccount b;
                if ("<<default account>>".equals(a.name)) {
                    b = ld.b.a(super.m).b();
                }
                else {
                    b = null;
                }
                final Integer o = this.O;
                d0.y((Object)o);
                final i0 i0 = new i0(2, a, (int)o, b);
                final ue.g g = (ue.g)this.C();
                final j j = new j(1, i0);
                final Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(((ee.a)g).b);
                final int a2 = ee.c.a;
                obtain.writeInt(1);
                ((Parcelable)j).writeToParcel(obtain, 0);
                obtain.writeStrongBinder((IBinder)f);
                ((ee.a)g).k(obtain, 12);
                return;
            }
            catch (final RemoteException ex) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    f.j0(new ue.l(1, new nd.b(8, (PendingIntent)null), null));
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
    
    public final void o(final i i, final boolean b) {
        try {
            final ue.g g = (ue.g)this.C();
            final Integer o = this.O;
            d0.y((Object)o);
            final int intValue = o;
            final Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(((ee.a)g).b);
            final int a = ee.c.a;
            obtain.writeStrongBinder(((IInterface)i).asBinder());
            obtain.writeInt(intValue);
            obtain.writeInt((int)(b ? 1 : 0));
            ((ee.a)g).k(obtain, 9);
        }
        catch (final RemoteException ex) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }
    
    public final IInterface w(final IBinder binder) {
        Object o;
        if (binder == null) {
            o = null;
        }
        else {
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
            if (queryLocalInterface instanceof ue.g) {
                o = queryLocalInterface;
            }
            else {
                o = new ue.g(binder);
            }
        }
        return (IInterface)o;
    }
}
