// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import android.content.Intent;
import com.twitter.sdk.android.core.Twitter;
import android.os.Looper;
import android.content.Context;

class AdvertisingInfoServiceStrategy implements AdvertisingInfoStrategy
{
    private static final String GOOGLE_PLAY_SERVICES_INTENT = "com.google.android.gms.ads.identifier.service.START";
    private static final String GOOGLE_PLAY_SERVICES_INTENT_PACKAGE_NAME = "com.google.android.gms";
    private static final String GOOGLE_PLAY_SERVICE_PACKAGE_NAME = "com.android.vending";
    private final Context context;
    
    public AdvertisingInfoServiceStrategy(final Context context) {
        this.context = context.getApplicationContext();
    }
    
    public AdvertisingInfo getAdvertisingInfo() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Twitter.getLogger().d("Twitter", "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.context.getPackageManager().getPackageInfo("com.android.vending", 0);
            final AdvertisingInfoServiceStrategy.AdvertisingInfoServiceStrategy$AdvertisingConnection advertisingInfoServiceStrategy$AdvertisingConnection = new AdvertisingInfoServiceStrategy.AdvertisingInfoServiceStrategy$AdvertisingConnection((AdvertisingInfoServiceStrategy$1)null);
            final Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.context.bindService(intent, (ServiceConnection)advertisingInfoServiceStrategy$AdvertisingConnection, 1)) {
                    try {
                        try {
                            final AdvertisingInfoServiceStrategy.AdvertisingInfoServiceStrategy$AdvertisingInterface advertisingInfoServiceStrategy$AdvertisingInterface = new AdvertisingInfoServiceStrategy.AdvertisingInfoServiceStrategy$AdvertisingInterface(advertisingInfoServiceStrategy$AdvertisingConnection.getBinder(), (AdvertisingInfoServiceStrategy$1)null);
                            final AdvertisingInfo advertisingInfo = new AdvertisingInfo(advertisingInfoServiceStrategy$AdvertisingInterface.getId(), AdvertisingInfoServiceStrategy.AdvertisingInfoServiceStrategy$AdvertisingInterface.access$200(advertisingInfoServiceStrategy$AdvertisingInterface));
                            this.context.unbindService((ServiceConnection)advertisingInfoServiceStrategy$AdvertisingConnection);
                            return advertisingInfo;
                        }
                        finally {}
                    }
                    catch (final Exception ex) {
                        Twitter.getLogger().w("Twitter", "Exception in binding to Google Play Service to capture AdvertisingId", (Throwable)ex);
                        this.context.unbindService((ServiceConnection)advertisingInfoServiceStrategy$AdvertisingConnection);
                        return null;
                    }
                    this.context.unbindService((ServiceConnection)advertisingInfoServiceStrategy$AdvertisingConnection);
                }
                else {
                    Twitter.getLogger().d("Twitter", "Could not bind to Google Play Service to capture AdvertisingId");
                }
            }
            finally {
                final Throwable t;
                Twitter.getLogger().d("Twitter", "Could not bind to Google Play Service to capture AdvertisingId", t);
            }
            return null;
        }
        catch (final Exception ex2) {
            Twitter.getLogger().d("Twitter", "Unable to determine if Google Play Services is available", (Throwable)ex2);
            return null;
        }
        catch (final PackageManager$NameNotFoundException ex3) {
            Twitter.getLogger().d("Twitter", "Unable to find Google Play Services package name");
            return null;
        }
    }
}
