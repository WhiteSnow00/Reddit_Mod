// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.share;

import java.util.HashMap;
import com.appsflyer.AFLogger;
import android.text.TextUtils;
import java.util.Map;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.AppsFlyerLib;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class ShareInviteHelper
{
    static {
        Covode.recordClassIndex(2726);
    }
    
    public static LinkGenerator generateInviteUrl(final Context context) {
        final String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(context);
        final String string = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
        final String string2 = AppsFlyerProperties.getInstance().getString("onelinkDomain");
        final String string3 = AppsFlyerProperties.getInstance().getString("AppUserId");
        final LinkGenerator linkGenerator = new LinkGenerator("af_app_invites");
        linkGenerator.setBaseURL(string, string2, context.getPackageName());
        linkGenerator.setReferrerUID(appsFlyerUID);
        linkGenerator.setReferrerCustomerId(string3);
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        final String string4 = AppsFlyerProperties.getInstance().getString("onelinkScheme");
        if (string4 != null && string4.length() > 3) {
            linkGenerator.setBaseDeeplink(string4);
        }
        return linkGenerator;
    }
    
    public static void logInvite(final Context context, final String s, final Map<String, String> map) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            AFLogger.AFLogger$LogLevel("[Invite] Cannot report App-Invite with null/empty channel");
            return;
        }
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, report Invite is disabled", true);
            return;
        }
        final LinkGenerator generateInviteUrl = generateInviteUrl(context);
        generateInviteUrl.addParameters(map);
        AFLogger.AFInAppEventType("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(s)));
        final StringBuilder sb = new StringBuilder("[Invite] Generated URL: ");
        sb.append(generateInviteUrl.generateLink());
        AFLogger.AFInAppEventType(sb.toString());
        final String mediaSource = generateInviteUrl.getMediaSource();
        String s2;
        if ("af_app_invites".equals(mediaSource)) {
            s2 = "af_invite";
        }
        else {
            s2 = mediaSource;
            if ("af_user_share".equals(mediaSource)) {
                s2 = "af_share";
            }
        }
        final HashMap hashMap = new HashMap();
        if (generateInviteUrl.getParameters() != null) {
            hashMap.putAll(generateInviteUrl.getParameters());
        }
        hashMap.put("af_channel", s);
        AppsFlyerLib.getInstance().logEvent(context, s2, hashMap);
    }
}
