// 
// Decompiled by Procyon v0.6.0
// 

package com.adm.push;

import X.5ow;
import android.util.Log;
import X.6jQ;
import android.text.TextUtils;
import X.5WL;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;

public class ADMMessageHandlerJob extends ADMMessageHandlerJobBase
{
    public static long sLastSendTokenTimeStamp;
    public static String sLastToken;
    public Handler mHandler;
    
    static {
        Covode.recordClassIndex(2101);
    }
    
    public static Bundle INVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(final Intent intent) {
        try {
            return intent.getExtras();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static Context INVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    private Handler getHandler(final Context context) {
        if (this.mHandler == null) {
            this.mHandler = (Handler)new ADMMessageHandlerJob.a(INVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(context));
        }
        return this.mHandler;
    }
    
    private void sendToken(final Context context, final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                6jQ.LJ().LIZ(AdmPushAdapter.getAdmPush(), 102, "0", "ADMMessageHandlerJob token is empty");
                return;
            }
            this.getHandler(context).obtainMessage(1, (Object)s).sendToTarget();
        }
        finally {
            if (6jQ.LIZIZ().LIZ()) {
                final Throwable t;
                Log.getStackTraceString(t);
            }
        }
    }
    
    public void onMessage(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final Bundle invokevirtual_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (invokevirtual_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            return;
        }
        try {
            6jQ.LIZLLL().LIZ(invokevirtual_com_adm_push_ADMMessageHandlerJob_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("payload"), AdmPushAdapter.getAdmPush());
        }
        catch (final Exception ex) {
            ex.getMessage();
        }
    }
    
    public void onRegistered(final Context context, final String sLastToken) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ADMMessageHandlerJob.sLastSendTokenTimeStamp < 2000L && 5ow.LIZ(sLastToken, ADMMessageHandlerJob.sLastToken)) {
            return;
        }
        ADMMessageHandlerJob.sLastSendTokenTimeStamp = currentTimeMillis;
        this.sendToken(context, ADMMessageHandlerJob.sLastToken = sLastToken);
    }
    
    public void onRegistrationError(final Context context, final String s) {
        this.getHandler(context).obtainMessage(2, (Object)s).sendToTarget();
    }
    
    public void onUnregistered(final Context context, final String s) {
    }
}
