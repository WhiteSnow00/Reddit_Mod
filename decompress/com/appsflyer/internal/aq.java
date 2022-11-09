// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.Intent;
import android.os.Build$VERSION;
import android.net.Uri;
import android.app.Activity;
import com.bytedance.covode.number.Covode;

public final class aq
{
    static {
        Covode.recordClassIndex(2614);
    }
    
    public static Uri AFInAppEventParameterName(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        final Intent intent = activity.getIntent();
        final Uri uri = (Uri)intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        final String invokevirtual_com_appsflyer_internal_aq_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_appsflyer_internal_aq_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "android.intent.extra.REFERRER_NAME");
        if (invokevirtual_com_appsflyer_internal_aq_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
            return Uri.parse(invokevirtual_com_appsflyer_internal_aq_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        }
        return null;
    }
    
    public static String INVOKEVIRTUAL_com_appsflyer_internal_aq_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(final Intent intent, final String s) {
        try {
            return intent.getStringExtra(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
}
