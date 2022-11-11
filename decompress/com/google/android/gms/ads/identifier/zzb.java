// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.ads.identifier;

import java.util.concurrent.TimeUnit;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

final class zzb extends Thread
{
    public final CountDownLatch zza;
    public boolean zzb;
    private final WeakReference<AdvertisingIdClient> zzc;
    private final long zzd;
    
    public zzb(final AdvertisingIdClient advertisingIdClient, final long zzd) {
        this.zzc = new WeakReference<AdvertisingIdClient>(advertisingIdClient);
        this.zzd = zzd;
        this.zza = new CountDownLatch(1);
        this.zzb = false;
        this.start();
    }
    
    private final void zza() {
        final AdvertisingIdClient advertisingIdClient = this.zzc.get();
        if (advertisingIdClient != null) {
            advertisingIdClient.zza();
            this.zzb = true;
        }
    }
    
    @Override
    public final void run() {
        try {
            if (!this.zza.await(this.zzd, TimeUnit.MILLISECONDS)) {
                this.zza();
            }
        }
        catch (final InterruptedException ex) {
            this.zza();
        }
    }
}
