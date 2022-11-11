// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer;

import android.content.pm.PackageItemInfo;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import com.appsflyer.internal.ai;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import android.content.BroadcastReceiver;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver
{
    static {
        Covode.recordClassIndex(2553);
    }
    
    public static String INVOKEVIRTUAL_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(final Intent intent, final String s) {
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
            final String invokevirtual_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "referrer");
            if (invokevirtual_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null && ai.values(context).getString("referrer", (String)null) != null) {
                ai.valueOf().AFKeystoreWrapper(context, invokevirtual_com_appsflyer_MultipleInstallBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                return;
            }
        }
        finally {
            final Throwable t;
            AFLogger.valueOf("error in BroadcastReceiver ", t);
        }
        AFLogger.valueOf("MultipleInstallBroadcastReceiver called");
        ai.valueOf().values(context, intent);
        for (final ResolveInfo resolveInfo : context.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0)) {
            final String action = intent.getAction();
            if (((PackageItemInfo)resolveInfo.activityInfo).packageName.equals(context.getPackageName()) && "com.android.vending.INSTALL_REFERRER".equals(action) && !this.getClass().getName().equals(((PackageItemInfo)resolveInfo.activityInfo).name)) {
                final StringBuilder sb = new StringBuilder("trigger onReceive: class: ");
                sb.append(((PackageItemInfo)resolveInfo.activityInfo).name);
                AFLogger.valueOf(sb.toString());
                try {
                    ((BroadcastReceiver)Class.forName(((PackageItemInfo)resolveInfo.activityInfo).name).newInstance()).onReceive(context, intent);
                }
                finally {
                    final StringBuilder sb2 = new StringBuilder("error in BroadcastReceiver ");
                    sb2.append(((PackageItemInfo)resolveInfo.activityInfo).name);
                    final Throwable t2;
                    AFLogger.valueOf(sb2.toString(), t2);
                }
            }
        }
    }
}
