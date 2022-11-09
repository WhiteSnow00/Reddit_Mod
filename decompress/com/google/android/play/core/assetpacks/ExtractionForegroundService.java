// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import android.os.IBinder;
import android.content.Intent;
import eg.g0;
import android.app.Service;

public class ExtractionForegroundService extends Service
{
    public final g0 f;
    
    public ExtractionForegroundService() {
        this.f = new g0(this);
    }
    
    public final IBinder onBind(final Intent intent) {
        return (IBinder)this.f;
    }
}
