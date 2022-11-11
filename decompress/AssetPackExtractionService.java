// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import android.content.Context;
import eg.e0;
import eg.r1;
import ak0.m;
import u5.w;
import eg.n0;
import android.os.IBinder;
import android.content.Intent;
import eg.q;
import android.app.Service;

public class AssetPackExtractionService extends Service
{
    public q f;
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.f;
    }
    
    public final void onCreate() {
        super.onCreate();
        Context applicationContext = ((Context)this).getApplicationContext();
        synchronized (n0.class) {
            if (n0.f == null) {
                final w w = new w((m)null);
                final Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                final r1 f = new r1(applicationContext);
                w.f = f;
                n0.f = new e0(f);
            }
            final e0 f2 = n0.f;
            monitorexit(n0.class);
            this.f = (q)f2.f.zza();
        }
    }
}
