// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.play_billing;

import android.os.RemoteException;
import android.os.Parcel;
import android.os.Bundle;
import android.os.IBinder;

public final class b extends e implements d
{
    public b(final IBinder binder) {
        super(binder);
    }
    
    public final Bundle A0(final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(9);
        l.writeString(s);
        l.writeString(s2);
        l.writeString(s3);
        final int a = g.a;
        l.writeInt(1);
        bundle.writeToParcel(l, 0);
        final Parcel o = this.o(l, 11);
        final Bundle bundle2 = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle2;
    }
    
    public final Bundle J0(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(9);
        l.writeString(s);
        l.writeString(s2);
        final int a = g.a;
        l.writeInt(1);
        bundle.writeToParcel(l, 0);
        final Parcel o = this.o(l, 902);
        final Bundle bundle2 = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle2;
    }
    
    public final int Q0(int int1, final String s, final String s2) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(int1);
        l.writeString(s);
        l.writeString(s2);
        final Parcel o = this.o(l, 1);
        int1 = o.readInt();
        o.recycle();
        return int1;
    }
    
    public final Bundle a0(int a, final String s, final String s2, final String s3, final Bundle bundle) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(a);
        l.writeString(s);
        l.writeString(s2);
        l.writeString(s3);
        l.writeString((String)null);
        a = g.a;
        l.writeInt(1);
        bundle.writeToParcel(l, 0);
        final Parcel o = this.o(l, 8);
        final Bundle bundle2 = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle2;
    }
    
    public final Bundle g1(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(9);
        l.writeString(s);
        l.writeString(s2);
        final int a = g.a;
        l.writeInt(1);
        bundle.writeToParcel(l, 0);
        final Parcel o = this.o(l, 12);
        final Bundle bundle2 = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle2;
    }
    
    public final int k(final String s, final String s2) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(3);
        l.writeString(s);
        l.writeString(s2);
        final Parcel o = this.o(l, 5);
        final int int1 = o.readInt();
        o.recycle();
        return int1;
    }
    
    public final Bundle n1(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(3);
        l.writeString(s);
        l.writeString(s2);
        final int a = g.a;
        l.writeInt(1);
        bundle.writeToParcel(l, 0);
        final Parcel o = this.o(l, 2);
        final Bundle bundle2 = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle2;
    }
    
    public final Bundle r0(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(3);
        l.writeString(s);
        l.writeString(s2);
        l.writeString(s3);
        final Parcel o = this.o(l, 4);
        final Bundle bundle = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle;
    }
    
    public final Bundle s0(final String s, final String s2, final Bundle bundle, final Bundle bundle2) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(10);
        l.writeString(s);
        l.writeString(s2);
        final int a = g.a;
        l.writeInt(1);
        bundle.writeToParcel(l, 0);
        l.writeInt(1);
        bundle2.writeToParcel(l, 0);
        final Parcel o = this.o(l, 901);
        final Bundle bundle3 = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle3;
    }
    
    public final Bundle z0(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel l = e.l();
        l.writeInt(3);
        l.writeString(s);
        l.writeString(s2);
        l.writeString(s3);
        l.writeString((String)null);
        final Parcel o = this.o(l, 3);
        final Bundle bundle = (Bundle)g.a(o, Bundle.CREATOR);
        o.recycle();
        return bundle;
    }
}
