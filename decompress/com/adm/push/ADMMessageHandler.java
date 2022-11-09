// 
// Decompiled by Procyon v0.6.0
// 

package com.adm.push;

import com.amazon.device.messaging.ADMMessageReceiver;
import X.5ow;
import android.util.Log;
import X.6jQ;
import android.text.TextUtils;
import android.os.Bundle;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import com.amazon.device.messaging.ADMMessageHandlerBase;

public class ADMMessageHandler extends ADMMessageHandlerBase
{
    public static long sLastSendTokenTimeStamp;
    public static String sLastToken;
    public static boolean sSupportJobIntent;
    public Handler mHandler;
    
    static {
        Covode.recordClassIndex(2098);
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
            ADMMessageHandler.sSupportJobIntent = true;
        }
        finally {}
    }
    
    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }
    
    public static Bundle INVOKEVIRTUAL_com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(final Intent intent) {
        try {
            return intent.getExtras();
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    private Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = (Handler)new ADMMessageHandler.a(this.getApplicationContext());
        }
        return this.mHandler;
    }
    
    private void sendToken(final String s) {
        try {
            if (TextUtils.isEmpty((CharSequence)s)) {
                6jQ.LJ().LIZ(AdmPushAdapter.getAdmPush(), 102, "0", "ADMMessageHandler token is empty");
                return;
            }
            this.getHandler().obtainMessage(1, (Object)s).sendToTarget();
        }
        finally {
            if (6jQ.LIZIZ().LIZ()) {
                final Throwable t;
                Log.getStackTraceString(t);
            }
        }
    }
    
    public void onMessage(final Intent intent) {
        if (intent == null) {
            return;
        }
        final Bundle invokevirtual_com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (invokevirtual_com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            return;
        }
        try {
            6jQ.LIZLLL().LIZ(invokevirtual_com_adm_push_ADMMessageHandler_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.getString("payload"), AdmPushAdapter.getAdmPush());
        }
        catch (final Exception ex) {
            ex.getMessage();
        }
    }
    
    public void onRegistered(final String sLastToken) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ADMMessageHandler.sLastSendTokenTimeStamp < 2000L && 5ow.LIZ(sLastToken, ADMMessageHandler.sLastToken)) {
            return;
        }
        ADMMessageHandler.sLastSendTokenTimeStamp = currentTimeMillis;
        this.sendToken(ADMMessageHandler.sLastToken = sLastToken);
    }
    
    public void onRegistrationError(final String s) {
        this.getHandler().obtainMessage(2, (Object)s).sendToTarget();
    }
    
    public void onStart(final Intent intent, final int n) {
        Intent intent2 = intent;
        if (intent == null) {
            intent2 = new Intent();
            intent2.setAction("");
        }
        super.onStart(intent2, n);
    }
    
    public void onUnregistered(final String s) {
    }
    
    public static class Receiver extends ADMMessageReceiver
    {
        static {
            Covode.recordClassIndex(2099);
        }
        
        public Receiver() {
            super((Class)ADMMessageHandler.class);
            if (ADMMessageHandler.sSupportJobIntent) {
                this.registerJobServiceClass((Class)ADMMessageHandlerJob.class, 1);
            }
        }
    }
}
