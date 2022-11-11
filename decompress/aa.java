// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.ComponentName;
import java.util.concurrent.LinkedBlockingQueue;
import android.os.Parcel;
import android.os.IInterface;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.os.IBinder;
import java.io.IOException;
import android.os.Looper;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.text.TextUtils;
import X.6Tl;
import X.NQO;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import X.KiO;
import android.content.ServiceConnection;
import android.content.Intent;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class aa
{
    public final long AFInAppEventParameterName;
    public final boolean AFInAppEventType;
    public final String AFKeystoreWrapper;
    
    static {
        Covode.recordClassIndex(2567);
    }
    
    public aa() {
    }
    
    public aa(final String afKeystoreWrapper, final long afInAppEventParameterName, final boolean afInAppEventType) {
        this.AFKeystoreWrapper = afKeystoreWrapper;
        this.AFInAppEventParameterName = afInAppEventParameterName;
        this.AFInAppEventType = afInAppEventType;
    }
    
    public static boolean INVOKEVIRTUAL_com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_StartServiceLancet_bindService(final Context context, final Intent intent, final ServiceConnection serviceConnection, final int n) {
        if (context != null && context instanceof Context) {
            return KiO.LIZ(context, intent, serviceConnection, n) || context.bindService(intent, serviceConnection, n);
        }
        return context.bindService(intent, serviceConnection, n);
    }
    
    public static PackageInfo INVOKEVIRTUAL_com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(final PackageManager packageManager, final String s, final int n) {
        final Context liz = NQO.LJJ.LIZ();
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 128) {
            if (6Tl.LIZIZ == null) {
                6Tl.LIZIZ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZIZ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 0) {
            if (6Tl.LIZLLL == null) {
                6Tl.LIZLLL = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LIZLLL;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 64) {
            if (6Tl.LJ == null) {
                6Tl.LJ = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJ;
        }
        if (6Tl.LJIIIZ && TextUtils.equals((CharSequence)s, (CharSequence)liz.getPackageName()) && n == 8) {
            if (6Tl.LJFF == null) {
                6Tl.LJFF = packageManager.getPackageInfo(s, n);
            }
            return 6Tl.LJFF;
        }
        return packageManager.getPackageInfo(s, n);
    }
    
    public static d values(Context context) {
        MethodCollector.i(1892);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            INVOKEVIRTUAL_com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_process_AwemeMetaDataLancet_getPackageInfo(context.getPackageManager(), "com.android.vending", 0);
            final e e = new e((byte)0);
            final Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (!INVOKEVIRTUAL_com_appsflyer_internal_aa_com_ss_android_ugc_aweme_lancet_StartServiceLancet_bindService(context, intent, (ServiceConnection)e, 1)) {
                    context.unbindService((ServiceConnection)e);
                    context = (Context)new IOException("Google Play connection failed");
                    MethodCollector.o(1892);
                    throw context;
                }
                if (e.AFInAppEventParameterName) {
                    final IllegalStateException ex = new IllegalStateException("Cannot call get on this connection more than once");
                    MethodCollector.o(1892);
                    throw ex;
                }
                e.AFInAppEventParameterName = true;
                final IBinder binder = e.values.poll(10L, TimeUnit.SECONDS);
                if (binder != null) {
                    final b b = new b(binder);
                    return new d(b.AFKeystoreWrapper(), b.valueOf());
                }
                final TimeoutException ex2 = new TimeoutException("Timed out waiting for the service connection");
                MethodCollector.o(1892);
                throw ex2;
            }
            finally {
                context.unbindService((ServiceConnection)e);
                MethodCollector.o(1892);
            }
        }
        final IllegalStateException ex3 = new IllegalStateException("Cannot be called from the main thread");
        MethodCollector.o(1892);
        throw ex3;
    }
    
    public final boolean valueOf() {
        return this.AFInAppEventType;
    }
    
    public static final class b implements IInterface
    {
        public final IBinder values;
        
        static {
            Covode.recordClassIndex(2568);
        }
        
        public b(final IBinder values) {
            this.values = values;
        }
        
        public final String AFKeystoreWrapper() {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.values.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        
        public final IBinder asBinder() {
            return this.values;
        }
        
        public final boolean valueOf() {
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean b = true;
                obtain.writeInt(1);
                this.values.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    b = false;
                }
                return b;
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }
    
    public static final class d
    {
        public final String valueOf;
        public final boolean values;
        
        static {
            Covode.recordClassIndex(2569);
        }
        
        public d(final String valueOf, final boolean values) {
            this.valueOf = valueOf;
            this.values = values;
        }
        
        public final boolean valueOf() {
            return this.values;
        }
    }
    
    public static final class e implements ServiceConnection
    {
        public boolean AFInAppEventParameterName;
        public final LinkedBlockingQueue<IBinder> values;
        
        static {
            Covode.recordClassIndex(2570);
        }
        
        public e() {
            this.values = new LinkedBlockingQueue<IBinder>(1);
            this.AFInAppEventParameterName = false;
        }
        
        public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            try {
                this.values.put(binder);
            }
            catch (final InterruptedException ex) {}
        }
        
        public final void onServiceDisconnected(final ComponentName componentName) {
        }
    }
}
