// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import com.appsflyer.internal.bq;
import X.5WL;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService
{
    static {
        Covode.recordClassIndex(2552);
    }
    
    public static Context INVOKEVIRTUAL_com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public void onNewToken(final String s) {
        new bq(INVOKEVIRTUAL_com_appsflyer_FirebaseMessagingServiceListener_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext((Context)this)).values(s);
    }
}
