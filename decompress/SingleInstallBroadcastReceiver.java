// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import com.appsflyer.internal.ai;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import android.content.BroadcastReceiver;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver
{
    static {
        Covode.recordClassIndex(2554);
    }
    
    public static String INVOKEVIRTUAL_com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(final Intent intent, final String s) {
        try {
            return intent.getStringExtra(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            final String invokevirtual_com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "referrer");
            if (invokevirtual_com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null && ai.values(context).getString("referrer", (String)null) != null) {
                ai.valueOf().AFKeystoreWrapper(context, invokevirtual_com_appsflyer_SingleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                return;
            }
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("error in BroadcastReceiver ", t);
        }
        final String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        final long currentTimeMillis = System.currentTimeMillis();
        if (string != null && currentTimeMillis - Long.valueOf(string).longValue() < 2000L) {
            return;
        }
        AFLogger.valueOf("SingleInstallBroadcastReceiver called");
        ai.valueOf().values(context, intent);
        AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
    }
}
