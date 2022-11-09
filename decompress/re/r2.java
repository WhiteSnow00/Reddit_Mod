// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.Parcelable;
import ke.g0;
import android.os.IBinder;
import ke.e0;

public final class r2 extends e0 implements t2
{
    public r2(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }
    
    public final void A(final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)q7);
        this.J(k, 4);
    }
    
    public final byte[] E(final t t, final String s) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)t);
        k.writeString(s);
        final Parcel m = this.m(k, 9);
        final byte[] byteArray = m.createByteArray();
        m.recycle();
        return byteArray;
    }
    
    public final void J0(final long n, final String s, final String s2, final String s3) throws RemoteException {
        final Parcel k = this.k();
        k.writeLong(n);
        k.writeString(s);
        k.writeString(s2);
        k.writeString(s3);
        this.J(k, 10);
    }
    
    public final List M(final String s, final String s2, final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        k.writeString(s);
        k.writeString(s2);
        g0.c(k, (Parcelable)q7);
        final Parcel m = this.m(k, 16);
        final ArrayList typedArrayList = m.createTypedArrayList(c.CREATOR);
        m.recycle();
        return typedArrayList;
    }
    
    public final String V(final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)q7);
        final Parcel m = this.m(k, 11);
        final String string = m.readString();
        m.recycle();
        return string;
    }
    
    public final void Z(final j7 j7, final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)j7);
        g0.c(k, (Parcelable)q7);
        this.J(k, 2);
    }
    
    public final List a1(final String s, final String s2, final String s3, final boolean b) throws RemoteException {
        final Parcel k = this.k();
        k.writeString((String)null);
        k.writeString(s2);
        k.writeString(s3);
        final ClassLoader a = g0.a;
        k.writeInt((int)(b ? 1 : 0));
        final Parcel m = this.m(k, 15);
        final ArrayList typedArrayList = m.createTypedArrayList(j7.CREATOR);
        m.recycle();
        return typedArrayList;
    }
    
    public final List b0(final String s, final String s2, final String s3) throws RemoteException {
        final Parcel k = this.k();
        k.writeString((String)null);
        k.writeString(s2);
        k.writeString(s3);
        final Parcel m = this.m(k, 17);
        final ArrayList typedArrayList = m.createTypedArrayList(c.CREATOR);
        m.recycle();
        return typedArrayList;
    }
    
    public final void g1(final Bundle bundle, final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)bundle);
        g0.c(k, (Parcelable)q7);
        this.J(k, 19);
    }
    
    public final void k1(final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)q7);
        this.J(k, 6);
    }
    
    public final void n1(final t t, final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)t);
        g0.c(k, (Parcelable)q7);
        this.J(k, 1);
    }
    
    public final List o1(final String s, final String s2, final boolean b, final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        k.writeString(s);
        k.writeString(s2);
        final ClassLoader a = g0.a;
        k.writeInt((int)(b ? 1 : 0));
        g0.c(k, (Parcelable)q7);
        final Parcel m = this.m(k, 14);
        final ArrayList typedArrayList = m.createTypedArrayList(j7.CREATOR);
        m.recycle();
        return typedArrayList;
    }
    
    public final void p1(final c c, final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)c);
        g0.c(k, (Parcelable)q7);
        this.J(k, 12);
    }
    
    public final void u1(final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)q7);
        this.J(k, 20);
    }
    
    public final void z(final q7 q7) throws RemoteException {
        final Parcel k = this.k();
        g0.c(k, (Parcelable)q7);
        this.J(k, 18);
    }
}
