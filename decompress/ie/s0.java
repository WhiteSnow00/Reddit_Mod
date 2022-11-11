// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.os.RemoteException;
import xd.a;
import java.util.HashMap;
import xd.a$a;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IInterface;
import android.os.IBinder;

public abstract class s0 extends h0 implements t0
{
    public s0() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }
    
    public static t0 asInterface(final IBinder binder) {
        if (binder == null) {
            return null;
        }
        final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        if (queryLocalInterface instanceof t0) {
            return (t0)queryLocalInterface;
        }
        return (t0)new r0(binder);
    }
    
    public final boolean l(int n, final Parcel parcel, final Parcel parcel2) throws RemoteException {
        final boolean b = false;
        final boolean b2 = false;
        boolean dataCollectionEnabled = false;
        final w0 w0 = null;
        final z0 z0 = null;
        final z0 z2 = null;
        final z0 z3 = null;
        final w0 w2 = null;
        final w0 w3 = null;
        final w0 w4 = null;
        final w0 w5 = null;
        final w0 w6 = null;
        final w0 w7 = null;
        final b1 b3 = null;
        final w0 w8 = null;
        final w0 w9 = null;
        final w0 w10 = null;
        final w0 w11 = null;
        Object o = null;
        final w0 w12 = null;
        final w0 w13 = null;
        switch (n) {
            default: {
                return false;
            }
            case 45: {
                final Bundle bundle = (Bundle)i0.a(parcel, Bundle.CREATOR);
                final long long1 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setConsentThirdParty(bundle, long1);
                break;
            }
            case 44: {
                final Bundle bundle2 = (Bundle)i0.a(parcel, Bundle.CREATOR);
                final long long2 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setConsent(bundle2, long2);
                break;
            }
            case 43: {
                final long long3 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).clearMeasurementEnabled(long3);
                break;
            }
            case 42: {
                final Bundle defaultEventParameters = (Bundle)i0.a(parcel, Bundle.CREATOR);
                i0.b(parcel);
                ((t0)this).setDefaultEventParameters(defaultEventParameters);
                break;
            }
            case 40: {
                final IBinder strongBinder = parcel.readStrongBinder();
                Object o2;
                if (strongBinder == null) {
                    o2 = w13;
                }
                else {
                    final IInterface queryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface instanceof w0) {
                        o2 = queryLocalInterface;
                    }
                    else {
                        o2 = new u0(strongBinder);
                    }
                }
                i0.b(parcel);
                ((t0)this).isDataCollectionEnabled((w0)o2);
                break;
            }
            case 39: {
                final ClassLoader a = i0.a;
                if (parcel.readInt() != 0) {
                    dataCollectionEnabled = true;
                }
                i0.b(parcel);
                ((t0)this).setDataCollectionEnabled(dataCollectionEnabled);
                break;
            }
            case 38: {
                final IBinder strongBinder2 = parcel.readStrongBinder();
                Object o3;
                if (strongBinder2 == null) {
                    o3 = w0;
                }
                else {
                    final IInterface queryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface2 instanceof w0) {
                        o3 = queryLocalInterface2;
                    }
                    else {
                        o3 = new u0(strongBinder2);
                    }
                }
                n = parcel.readInt();
                i0.b(parcel);
                ((t0)this).getTestFlag((w0)o3, n);
                break;
            }
            case 37: {
                final HashMap hashMap = parcel.readHashMap(i0.a);
                i0.b(parcel);
                ((t0)this).initForTests((Map)hashMap);
                break;
            }
            case 36: {
                final IBinder strongBinder3 = parcel.readStrongBinder();
                Object o4;
                if (strongBinder3 == null) {
                    o4 = z0;
                }
                else {
                    final IInterface queryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface3 instanceof z0) {
                        o4 = queryLocalInterface3;
                    }
                    else {
                        o4 = new x0(strongBinder3);
                    }
                }
                i0.b(parcel);
                ((t0)this).unregisterOnMeasurementEventListener((z0)o4);
                break;
            }
            case 35: {
                final IBinder strongBinder4 = parcel.readStrongBinder();
                Object o5;
                if (strongBinder4 == null) {
                    o5 = z2;
                }
                else {
                    final IInterface queryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface4 instanceof z0) {
                        o5 = queryLocalInterface4;
                    }
                    else {
                        o5 = new x0(strongBinder4);
                    }
                }
                i0.b(parcel);
                ((t0)this).registerOnMeasurementEventListener((z0)o5);
                break;
            }
            case 34: {
                final IBinder strongBinder5 = parcel.readStrongBinder();
                Object eventInterceptor;
                if (strongBinder5 == null) {
                    eventInterceptor = z3;
                }
                else {
                    final IInterface queryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    if (queryLocalInterface5 instanceof z0) {
                        eventInterceptor = queryLocalInterface5;
                    }
                    else {
                        eventInterceptor = new x0(strongBinder5);
                    }
                }
                i0.b(parcel);
                ((t0)this).setEventInterceptor((z0)eventInterceptor);
                break;
            }
            case 33: {
                n = parcel.readInt();
                final String string = parcel.readString();
                final a o6 = a$a.o(parcel.readStrongBinder());
                final a o7 = a$a.o(parcel.readStrongBinder());
                final a o8 = a$a.o(parcel.readStrongBinder());
                i0.b(parcel);
                ((t0)this).logHealthData(n, string, o6, o7, o8);
                break;
            }
            case 32: {
                final Bundle bundle3 = (Bundle)i0.a(parcel, Bundle.CREATOR);
                final IBinder strongBinder6 = parcel.readStrongBinder();
                Object o9;
                if (strongBinder6 == null) {
                    o9 = w2;
                }
                else {
                    final IInterface queryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface6 instanceof w0) {
                        o9 = queryLocalInterface6;
                    }
                    else {
                        o9 = new u0(strongBinder6);
                    }
                }
                final long long4 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).performAction(bundle3, (w0)o9, long4);
                break;
            }
            case 31: {
                final a o10 = a$a.o(parcel.readStrongBinder());
                final IBinder strongBinder7 = parcel.readStrongBinder();
                Object o11;
                if (strongBinder7 == null) {
                    o11 = w3;
                }
                else {
                    final IInterface queryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface7 instanceof w0) {
                        o11 = queryLocalInterface7;
                    }
                    else {
                        o11 = new u0(strongBinder7);
                    }
                }
                final long long5 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).onActivitySaveInstanceState(o10, (w0)o11, long5);
                break;
            }
            case 30: {
                final a o12 = a$a.o(parcel.readStrongBinder());
                final long long6 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).onActivityResumed(o12, long6);
                break;
            }
            case 29: {
                final a o13 = a$a.o(parcel.readStrongBinder());
                final long long7 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).onActivityPaused(o13, long7);
                break;
            }
            case 28: {
                final a o14 = a$a.o(parcel.readStrongBinder());
                final long long8 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).onActivityDestroyed(o14, long8);
                break;
            }
            case 27: {
                final a o15 = a$a.o(parcel.readStrongBinder());
                final Bundle bundle4 = (Bundle)i0.a(parcel, Bundle.CREATOR);
                final long long9 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).onActivityCreated(o15, bundle4, long9);
                break;
            }
            case 26: {
                final a o16 = a$a.o(parcel.readStrongBinder());
                final long long10 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).onActivityStopped(o16, long10);
                break;
            }
            case 25: {
                final a o17 = a$a.o(parcel.readStrongBinder());
                final long long11 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).onActivityStarted(o17, long11);
                break;
            }
            case 24: {
                final String string2 = parcel.readString();
                final long long12 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).endAdUnitExposure(string2, long12);
                break;
            }
            case 23: {
                final String string3 = parcel.readString();
                final long long13 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).beginAdUnitExposure(string3, long13);
                break;
            }
            case 22: {
                final IBinder strongBinder8 = parcel.readStrongBinder();
                Object o18;
                if (strongBinder8 == null) {
                    o18 = w4;
                }
                else {
                    final IInterface queryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface8 instanceof w0) {
                        o18 = queryLocalInterface8;
                    }
                    else {
                        o18 = new u0(strongBinder8);
                    }
                }
                i0.b(parcel);
                ((t0)this).generateEventId((w0)o18);
                break;
            }
            case 21: {
                final IBinder strongBinder9 = parcel.readStrongBinder();
                Object o19;
                if (strongBinder9 == null) {
                    o19 = w5;
                }
                else {
                    final IInterface queryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface9 instanceof w0) {
                        o19 = queryLocalInterface9;
                    }
                    else {
                        o19 = new u0(strongBinder9);
                    }
                }
                i0.b(parcel);
                ((t0)this).getGmpAppId((w0)o19);
                break;
            }
            case 20: {
                final IBinder strongBinder10 = parcel.readStrongBinder();
                Object o20;
                if (strongBinder10 == null) {
                    o20 = w6;
                }
                else {
                    final IInterface queryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface10 instanceof w0) {
                        o20 = queryLocalInterface10;
                    }
                    else {
                        o20 = new u0(strongBinder10);
                    }
                }
                i0.b(parcel);
                ((t0)this).getAppInstanceId((w0)o20);
                break;
            }
            case 19: {
                final IBinder strongBinder11 = parcel.readStrongBinder();
                Object o21;
                if (strongBinder11 == null) {
                    o21 = w7;
                }
                else {
                    final IInterface queryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface11 instanceof w0) {
                        o21 = queryLocalInterface11;
                    }
                    else {
                        o21 = new u0(strongBinder11);
                    }
                }
                i0.b(parcel);
                ((t0)this).getCachedAppInstanceId((w0)o21);
                break;
            }
            case 18: {
                final IBinder strongBinder12 = parcel.readStrongBinder();
                Object instanceIdProvider;
                if (strongBinder12 == null) {
                    instanceIdProvider = b3;
                }
                else {
                    final IInterface queryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    if (queryLocalInterface12 instanceof b1) {
                        instanceIdProvider = queryLocalInterface12;
                    }
                    else {
                        instanceIdProvider = new a1(strongBinder12);
                    }
                }
                i0.b(parcel);
                ((t0)this).setInstanceIdProvider((b1)instanceIdProvider);
                break;
            }
            case 17: {
                final IBinder strongBinder13 = parcel.readStrongBinder();
                Object o22;
                if (strongBinder13 == null) {
                    o22 = w8;
                }
                else {
                    final IInterface queryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface13 instanceof w0) {
                        o22 = queryLocalInterface13;
                    }
                    else {
                        o22 = new u0(strongBinder13);
                    }
                }
                i0.b(parcel);
                ((t0)this).getCurrentScreenClass((w0)o22);
                break;
            }
            case 16: {
                final IBinder strongBinder14 = parcel.readStrongBinder();
                Object o23;
                if (strongBinder14 == null) {
                    o23 = w9;
                }
                else {
                    final IInterface queryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface14 instanceof w0) {
                        o23 = queryLocalInterface14;
                    }
                    else {
                        o23 = new u0(strongBinder14);
                    }
                }
                i0.b(parcel);
                ((t0)this).getCurrentScreenName((w0)o23);
                break;
            }
            case 15: {
                final a o24 = a$a.o(parcel.readStrongBinder());
                final String string4 = parcel.readString();
                final String string5 = parcel.readString();
                final long long14 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setCurrentScreen(o24, string4, string5, long14);
                break;
            }
            case 14: {
                final long long15 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setSessionTimeoutDuration(long15);
                break;
            }
            case 13: {
                final long long16 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setMinimumSessionDuration(long16);
                break;
            }
            case 12: {
                final long long17 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).resetAnalyticsData(long17);
                break;
            }
            case 11: {
                final ClassLoader a2 = i0.a;
                boolean b4 = b;
                if (parcel.readInt() != 0) {
                    b4 = true;
                }
                final long long18 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setMeasurementEnabled(b4, long18);
                break;
            }
            case 10: {
                final String string6 = parcel.readString();
                final String string7 = parcel.readString();
                final IBinder strongBinder15 = parcel.readStrongBinder();
                Object o25;
                if (strongBinder15 == null) {
                    o25 = w10;
                }
                else {
                    final IInterface queryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface15 instanceof w0) {
                        o25 = queryLocalInterface15;
                    }
                    else {
                        o25 = new u0(strongBinder15);
                    }
                }
                i0.b(parcel);
                ((t0)this).getConditionalUserProperties(string6, string7, (w0)o25);
                break;
            }
            case 9: {
                final String string8 = parcel.readString();
                final String string9 = parcel.readString();
                final Bundle bundle5 = (Bundle)i0.a(parcel, Bundle.CREATOR);
                i0.b(parcel);
                ((t0)this).clearConditionalUserProperty(string8, string9, bundle5);
                break;
            }
            case 8: {
                final Bundle bundle6 = (Bundle)i0.a(parcel, Bundle.CREATOR);
                final long long19 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setConditionalUserProperty(bundle6, long19);
                break;
            }
            case 7: {
                final String string10 = parcel.readString();
                final long long20 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setUserId(string10, long20);
                break;
            }
            case 6: {
                final String string11 = parcel.readString();
                final IBinder strongBinder16 = parcel.readStrongBinder();
                Object o26;
                if (strongBinder16 == null) {
                    o26 = w11;
                }
                else {
                    final IInterface queryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface16 instanceof w0) {
                        o26 = queryLocalInterface16;
                    }
                    else {
                        o26 = new u0(strongBinder16);
                    }
                }
                i0.b(parcel);
                ((t0)this).getMaxUserProperties(string11, (w0)o26);
                break;
            }
            case 5: {
                final String string12 = parcel.readString();
                final String string13 = parcel.readString();
                final ClassLoader a3 = i0.a;
                boolean b5 = b2;
                if (parcel.readInt() != 0) {
                    b5 = true;
                }
                final IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    final IInterface queryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface17 instanceof w0) {
                        o = queryLocalInterface17;
                    }
                    else {
                        o = new u0(strongBinder17);
                    }
                }
                i0.b(parcel);
                ((t0)this).getUserProperties(string12, string13, b5, (w0)o);
                break;
            }
            case 4: {
                final String string14 = parcel.readString();
                final String string15 = parcel.readString();
                final a o27 = a$a.o(parcel.readStrongBinder());
                final ClassLoader a4 = i0.a;
                final boolean b6 = parcel.readInt() != 0;
                final long long21 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).setUserProperty(string14, string15, o27, b6, long21);
                break;
            }
            case 3: {
                final String string16 = parcel.readString();
                final String string17 = parcel.readString();
                final Bundle bundle7 = (Bundle)i0.a(parcel, Bundle.CREATOR);
                final IBinder strongBinder18 = parcel.readStrongBinder();
                Object o28;
                if (strongBinder18 == null) {
                    o28 = w12;
                }
                else {
                    final IInterface queryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    if (queryLocalInterface18 instanceof w0) {
                        o28 = queryLocalInterface18;
                    }
                    else {
                        o28 = new u0(strongBinder18);
                    }
                }
                final long long22 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).logEventAndBundle(string16, string17, bundle7, (w0)o28, long22);
                break;
            }
            case 2: {
                final String string18 = parcel.readString();
                final String string19 = parcel.readString();
                final Bundle bundle8 = (Bundle)i0.a(parcel, Bundle.CREATOR);
                final boolean b7 = parcel.readInt() != 0;
                final boolean b8 = parcel.readInt() != 0;
                final long long23 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).logEvent(string18, string19, bundle8, b7, b8, long23);
                break;
            }
            case 1: {
                final a o29 = a$a.o(parcel.readStrongBinder());
                final c1 c1 = (c1)i0.a(parcel, ie.c1.CREATOR);
                final long long24 = parcel.readLong();
                i0.b(parcel);
                ((t0)this).initialize(o29, c1, long24);
                break;
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
