// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import xd.a;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Parcel;
import android.os.IBinder;

public final class r0 extends g0 implements t0
{
    public r0(final IBinder binder) {
        super(binder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    public final void beginAdUnitExposure(final String s, final long n) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeLong(n);
        this.N(l, 23);
    }
    
    public final void clearConditionalUserProperty(final String s, final String s2, final Bundle bundle) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeString(s2);
        i0.c(l, (Parcelable)bundle);
        this.N(l, 9);
    }
    
    public final void endAdUnitExposure(final String s, final long n) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeLong(n);
        this.N(l, 24);
    }
    
    public final void generateEventId(final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)w0);
        this.N(l, 22);
    }
    
    public final void getCachedAppInstanceId(final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)w0);
        this.N(l, 19);
    }
    
    public final void getConditionalUserProperties(final String s, final String s2, final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeString(s2);
        i0.d(l, (IInterface)w0);
        this.N(l, 10);
    }
    
    public final void getCurrentScreenClass(final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)w0);
        this.N(l, 17);
    }
    
    public final void getCurrentScreenName(final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)w0);
        this.N(l, 16);
    }
    
    public final void getGmpAppId(final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)w0);
        this.N(l, 21);
    }
    
    public final void getMaxUserProperties(final String s, final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        i0.d(l, (IInterface)w0);
        this.N(l, 6);
    }
    
    public final void getUserProperties(final String s, final String s2, final boolean b, final w0 w0) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeString(s2);
        final ClassLoader a = i0.a;
        l.writeInt((int)(b ? 1 : 0));
        i0.d(l, (IInterface)w0);
        this.N(l, 5);
    }
    
    public final void initialize(final a a, final c1 c1, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        i0.c(l, (Parcelable)c1);
        l.writeLong(n);
        this.N(l, 1);
    }
    
    public final void logEvent(final String s, final String s2, final Bundle bundle, final boolean b, final boolean b2, final long n) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeString(s2);
        i0.c(l, (Parcelable)bundle);
        l.writeInt((int)(b ? 1 : 0));
        l.writeInt((int)(b2 ? 1 : 0));
        l.writeLong(n);
        this.N(l, 2);
    }
    
    public final void logHealthData(final int n, final String s, final a a, final a a2, final a a3) throws RemoteException {
        final Parcel l = this.l();
        l.writeInt(5);
        l.writeString(s);
        i0.d(l, (IInterface)a);
        i0.d(l, (IInterface)a2);
        i0.d(l, (IInterface)a3);
        this.N(l, 33);
    }
    
    public final void onActivityCreated(final a a, final Bundle bundle, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        i0.c(l, (Parcelable)bundle);
        l.writeLong(n);
        this.N(l, 27);
    }
    
    public final void onActivityDestroyed(final a a, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        l.writeLong(n);
        this.N(l, 28);
    }
    
    public final void onActivityPaused(final a a, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        l.writeLong(n);
        this.N(l, 29);
    }
    
    public final void onActivityResumed(final a a, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        l.writeLong(n);
        this.N(l, 30);
    }
    
    public final void onActivitySaveInstanceState(final a a, final w0 w0, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        i0.d(l, (IInterface)w0);
        l.writeLong(n);
        this.N(l, 31);
    }
    
    public final void onActivityStarted(final a a, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        l.writeLong(n);
        this.N(l, 25);
    }
    
    public final void onActivityStopped(final a a, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        l.writeLong(n);
        this.N(l, 26);
    }
    
    public final void registerOnMeasurementEventListener(final z0 z0) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)z0);
        this.N(l, 35);
    }
    
    public final void setConditionalUserProperty(final Bundle bundle, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.c(l, (Parcelable)bundle);
        l.writeLong(n);
        this.N(l, 8);
    }
    
    public final void setCurrentScreen(final a a, final String s, final String s2, final long n) throws RemoteException {
        final Parcel l = this.l();
        i0.d(l, (IInterface)a);
        l.writeString(s);
        l.writeString(s2);
        l.writeLong(n);
        this.N(l, 15);
    }
    
    public final void setDataCollectionEnabled(final boolean b) throws RemoteException {
        final Parcel l = this.l();
        final ClassLoader a = i0.a;
        l.writeInt((int)(b ? 1 : 0));
        this.N(l, 39);
    }
    
    public final void setUserProperty(final String s, final String s2, final a a, final boolean b, final long n) throws RemoteException {
        final Parcel l = this.l();
        l.writeString(s);
        l.writeString(s2);
        i0.d(l, (IInterface)a);
        l.writeInt((int)(b ? 1 : 0));
        l.writeLong(n);
        this.N(l, 4);
    }
}
