// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.ads.identifier;

import java.util.Map;
import java.util.HashMap;
import android.os.IInterface;
import android.os.IBinder;
import android.content.pm.PackageManager$NameNotFoundException;
import zd.c;
import zd.d;
import java.util.concurrent.TimeUnit;
import android.content.Intent;
import md.f;
import android.content.ServiceConnection;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import java.io.IOException;
import android.os.SystemClock;
import lw0.b;
import android.content.Context;
import zd.e;
import md.a;

public class AdvertisingIdClient
{
    public a zza;
    public e zzb;
    public boolean zzc;
    public final Object zzd;
    public zzb zze;
    public final long zzf;
    private final Context zzg;
    
    public AdvertisingIdClient(final Context context) {
        this(context, 30000L, false, false);
    }
    
    public AdvertisingIdClient(final Context context, final long zzf, final boolean b, final boolean b2) {
        this.zzd = new Object();
        b.R((Object)context);
        Context zzg = context;
        if (b) {
            final Context applicationContext = context.getApplicationContext();
            zzg = context;
            if (applicationContext != null) {
                zzg = applicationContext;
            }
        }
        this.zzg = zzg;
        this.zzc = false;
        this.zzf = zzf;
    }
    
    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        context = (Context)new AdvertisingIdClient(context, -1L, true, false);
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            ((AdvertisingIdClient)context).zzb(false);
            final Info zzd = ((AdvertisingIdClient)context).zzd(-1);
            ((AdvertisingIdClient)context).zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            ((AdvertisingIdClient)context).zza();
            return zzd;
        }
        finally {
            try {
                final Throwable t;
                ((AdvertisingIdClient)context).zzc(null, true, 0.0f, -1L, "", t);
            }
            finally {
                ((AdvertisingIdClient)context).zza();
            }
        }
    }
    
    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        context = (Context)new AdvertisingIdClient(context, -1L, false, false);
        try {
            ((AdvertisingIdClient)context).zzb(false);
            b.Q("Calling this from your main thread can lead to deadlock");
            synchronized (context) {
                Label_0116: {
                    if (!((AdvertisingIdClient)context).zzc) {
                        final Object zzd = ((AdvertisingIdClient)context).zzd;
                        synchronized (zzd) {
                            final zzb zze = ((AdvertisingIdClient)context).zze;
                            if (zze != null && zze.zzb) {
                                monitorexit(zzd);
                                try {
                                    ((AdvertisingIdClient)context).zzb(false);
                                    if (((AdvertisingIdClient)context).zzc) {
                                        break Label_0116;
                                    }
                                    throw new IOException("AdvertisingIdClient cannot reconnect.");
                                }
                                catch (final Exception zzd) {
                                    throw new IOException("AdvertisingIdClient cannot reconnect.", (Throwable)zzd);
                                }
                            }
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                }
                b.R((Object)((AdvertisingIdClient)context).zza);
                b.R((Object)((AdvertisingIdClient)context).zzb);
                try {
                    final boolean a = ((AdvertisingIdClient)context).zzb.a();
                    monitorexit(context);
                    ((AdvertisingIdClient)context).zze();
                    return a;
                }
                catch (final RemoteException ex) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)ex);
                    throw new IOException("Remote exception");
                }
            }
        }
        finally {
            ((AdvertisingIdClient)context).zza();
        }
    }
    
    public static void setShouldSkipGmsCoreVersionCheck(final boolean b) {
    }
    
    private final Info zzd(final int n) throws IOException {
        b.Q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Label_0097: {
                if (!this.zzc) {
                    final Object zzd = this.zzd;
                    synchronized (zzd) {
                        final zzb zze = this.zze;
                        if (zze != null && zze.zzb) {
                            monitorexit(zzd);
                            try {
                                this.zzb(false);
                                if (this.zzc) {
                                    break Label_0097;
                                }
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                            catch (final Exception zzd) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.", (Throwable)zzd);
                            }
                        }
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
            }
            b.R((Object)this.zza);
            b.R((Object)this.zzb);
            try {
                final Info info = new Info(this.zzb.s(), this.zzb.t());
                monitorexit(this);
                this.zze();
                return info;
            }
            catch (final RemoteException ex) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", (Throwable)ex);
                throw new IOException("Remote exception");
            }
        }
    }
    
    private final void zze() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/gms/ads/identifier/AdvertisingIdClient.zzd:Ljava/lang/Object;
        //     4: astore_1       
        //     5: aload_1        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/ads/identifier/AdvertisingIdClient.zze:Lcom/google/android/gms/ads/identifier/zzb;
        //    11: astore_2       
        //    12: aload_2        
        //    13: ifnull          30
        //    16: aload_2        
        //    17: getfield        com/google/android/gms/ads/identifier/zzb.zza:Ljava/util/concurrent/CountDownLatch;
        //    20: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //    23: aload_0        
        //    24: getfield        com/google/android/gms/ads/identifier/AdvertisingIdClient.zze:Lcom/google/android/gms/ads/identifier/zzb;
        //    27: invokevirtual   java/lang/Thread.join:()V
        //    30: aload_0        
        //    31: getfield        com/google/android/gms/ads/identifier/AdvertisingIdClient.zzf:J
        //    34: lstore_3       
        //    35: lload_3        
        //    36: lconst_0       
        //    37: lcmp           
        //    38: ifle            56
        //    41: new             Lcom/google/android/gms/ads/identifier/zzb;
        //    44: astore_2       
        //    45: aload_2        
        //    46: aload_0        
        //    47: lload_3        
        //    48: invokespecial   com/google/android/gms/ads/identifier/zzb.<init>:(Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;J)V
        //    51: aload_0        
        //    52: aload_2        
        //    53: putfield        com/google/android/gms/ads/identifier/AdvertisingIdClient.zze:Lcom/google/android/gms/ads/identifier/zzb;
        //    56: aload_1        
        //    57: monitorexit    
        //    58: return         
        //    59: astore_2       
        //    60: aload_1        
        //    61: monitorexit    
        //    62: aload_2        
        //    63: athrow         
        //    64: astore_2       
        //    65: goto            30
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      12     59     64     Any
        //  16     23     59     64     Any
        //  23     30     64     68     Ljava/lang/InterruptedException;
        //  23     30     59     64     Any
        //  30     35     59     64     Any
        //  41     56     59     64     Any
        //  56     58     59     64     Any
        //  60     62     59     64     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void finalize() throws Throwable {
        this.zza();
        super.finalize();
    }
    
    public Info getInfo() throws IOException {
        return this.zzd(-1);
    }
    
    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        this.zzb(true);
    }
    
    public final void zza() {
        b.Q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg != null && this.zza != null) {
                try {
                    if (this.zzc) {
                        td.a.b().c(this.zzg, (ServiceConnection)this.zza);
                    }
                }
                finally {
                    final Throwable t;
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", t);
                }
                this.zzc = false;
                this.zzb = null;
                this.zza = null;
            }
        }
    }
    
    public final void zzb(final boolean b) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        b.Q("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzc) {
                this.zza();
            }
            final Context zzg = this.zzg;
            try {
                zzg.getPackageManager().getPackageInfo("com.android.vending", 0);
                final int c = f.b.c(zzg, 12451000);
                if (c != 0 && c != 2) {
                    throw new IOException("Google Play services not available");
                }
                final a zza = new a();
                final Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (td.a.b().a(zzg, intent, (ServiceConnection)zza, 1)) {
                        this.zza = zza;
                        try {
                            final IBinder a = zza.a(TimeUnit.MILLISECONDS);
                            final int a2 = d.a;
                            final IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            Object zzb;
                            if (queryLocalInterface instanceof e) {
                                zzb = queryLocalInterface;
                            }
                            else {
                                zzb = new c(a);
                            }
                            this.zzb = (e)zzb;
                            this.zzc = true;
                            if (b) {
                                this.zze();
                            }
                            return;
                        }
                        catch (final InterruptedException ex) {
                            final IOException ex2 = new IOException("Interrupted exception");
                        }
                    }
                    throw new IOException("Connection failure");
                }
                finally {
                    final Throwable t;
                    throw new IOException(t);
                }
            }
            catch (final PackageManager$NameNotFoundException ex3) {
                throw new GooglePlayServicesNotAvailableException(9);
            }
        }
    }
    
    public final boolean zzc(final Info info, final boolean b, final float n, final long n2, String s, final Throwable t) {
        if (Math.random() <= 0.0) {
            final HashMap hashMap = new HashMap();
            s = "1";
            hashMap.put("app_context", "1");
            if (info != null) {
                if (!info.isLimitAdTrackingEnabled()) {
                    s = "0";
                }
                hashMap.put("limit_ad_tracking", s);
                final String id = info.getId();
                if (id != null) {
                    hashMap.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (t != null) {
                hashMap.put("error", t.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(n2));
            new zza(this, hashMap).start();
            return true;
        }
        return false;
    }
    
    public static final class Info
    {
        private final String zza;
        private final boolean zzb;
        
        @Deprecated
        public Info(final String zza, final boolean zzb) {
            this.zza = zza;
            this.zzb = zzb;
        }
        
        public String getId() {
            return this.zza;
        }
        
        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }
        
        @Override
        public String toString() {
            final String zza = this.zza;
            final boolean zzb = this.zzb;
            final StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 7);
            sb.append("{");
            sb.append(zza);
            sb.append("}");
            sb.append(zzb);
            return sb.toString();
        }
    }
}
