// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

public final class b extends e implements d
{
    public b(final IBinder binder) {
        super(binder);
    }
    
    public final int H0(int int1, final String s, final String s2) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(int1);
        k.writeString(s);
        k.writeString(s2);
        final Parcel m = this.m(k, 1);
        int1 = m.readInt();
        m.recycle();
        return int1;
    }
    
    public final Bundle U(int a, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(a);
        k.writeString(s);
        k.writeString(s2);
        k.writeString(s3);
        k.writeString((String)null);
        a = g.a;
        k.writeInt(1);
        bundle.writeToParcel(k, 0);
        final Parcel m = this.m(k, 8);
        final Bundle bundle2 = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle2;
    }
    
    public final Bundle X0(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(9);
        k.writeString(s);
        k.writeString(s2);
        final int a = g.a;
        k.writeInt(1);
        bundle.writeToParcel(k, 0);
        final Parcel m = this.m(k, 12);
        final Bundle bundle2 = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle2;
    }
    
    public final Bundle e1(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(3);
        k.writeString(s);
        k.writeString(s2);
        final int a = g.a;
        k.writeInt(1);
        bundle.writeToParcel(k, 0);
        final Parcel m = this.m(k, 2);
        final Bundle bundle2 = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle2;
    }
    
    public final int j(final String s, final String s2) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(3);
        k.writeString(s);
        k.writeString(s2);
        final Parcel m = this.m(k, 5);
        final int int1 = m.readInt();
        m.recycle();
        return int1;
    }
    
    public final Bundle j0(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(3);
        k.writeString(s);
        k.writeString(s2);
        k.writeString(s3);
        final Parcel m = this.m(k, 4);
        final Bundle bundle = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle;
    }
    
    public final Bundle k0(final String s, final String s2, final Bundle bundle, final Bundle bundle2) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(10);
        k.writeString(s);
        k.writeString(s2);
        final int a = g.a;
        k.writeInt(1);
        bundle.writeToParcel(k, 0);
        k.writeInt(1);
        bundle2.writeToParcel(k, 0);
        final Parcel m = this.m(k, 901);
        final Bundle bundle3 = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle3;
    }
    
    public final Bundle p0(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(3);
        k.writeString(s);
        k.writeString(s2);
        k.writeString(s3);
        k.writeString((String)null);
        final Parcel m = this.m(k, 3);
        final Bundle bundle = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle;
    }
    
    public final Bundle q0(final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(9);
        k.writeString(s);
        k.writeString(s2);
        k.writeString(s3);
        final int a = g.a;
        k.writeInt(1);
        bundle.writeToParcel(k, 0);
        final Parcel m = this.m(k, 11);
        final Bundle bundle2 = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle2;
    }
    
    public final Bundle z0(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel k = e.k();
        k.writeInt(9);
        k.writeString(s);
        k.writeString(s2);
        final int a = g.a;
        k.writeInt(1);
        bundle.writeToParcel(k, 0);
        final Parcel m = this.m(k, 902);
        final Bundle bundle2 = (Bundle)g.a(m, Bundle.CREATOR);
        m.recycle();
        return bundle2;
    }
}
