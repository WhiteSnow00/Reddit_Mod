// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import android.content.Context;
import java.util.concurrent.Callable;

public final class m2 implements Callable<Boolean>
{
    public final /* synthetic */ Context f;
    
    public m2(final Context f) {
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final Context applicationContext = this.f.getApplicationContext();
        boolean b = false;
        if ((n2.a = applicationContext.getSharedPreferences("com.sendbird.sdk.messaging.local_cache_preference", 0)) != null) {
            b = true;
        }
        return b;
    }
}
