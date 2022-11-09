// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.share;

import android.net.Uri;
import X.Q0z;
import X.75k;
import java.net.HttpURLConnection;
import X.764;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import android.webkit.WebView;
import X.75n;
import X.75s;
import X.75j;
import java.net.URLConnection;
import java.net.URL;
import X.0Qu;
import android.content.Intent;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.appsflyer.internal.cp;
import java.util.HashMap;
import com.appsflyer.AFLogger;
import X.0II;
import com.appsflyer.internal.ai;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.co;
import com.appsflyer.AppsFlyerProperties;
import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class CrossPromotionHelper
{
    public static String AFKeystoreWrapper;
    
    static {
        Covode.recordClassIndex(2723);
        CrossPromotionHelper.AFKeystoreWrapper = "https://%simpression.%s";
    }
    
    public static LinkGenerator AFInAppEventType(final Context context, final String afKeystoreWrapper, final String campaign, final Map<String, String> map, final String afInAppEventParameterName) {
        final LinkGenerator linkGenerator = new LinkGenerator("af_cross_promotion");
        linkGenerator.AFInAppEventParameterName = afInAppEventParameterName;
        linkGenerator.AFKeystoreWrapper = afKeystoreWrapper;
        linkGenerator.addParameter("af_siteid", context.getPackageName());
        if (campaign != null) {
            linkGenerator.setCampaign(campaign);
        }
        if (map != null) {
            linkGenerator.addParameters(map);
        }
        final String string = AppsFlyerProperties.getInstance().getString("advertiserId");
        if (string != null) {
            linkGenerator.addParameter("advertising_id", string);
        }
        return linkGenerator;
    }
    
    public static void logAndOpenStore(final Context context, final String s, final String s2) {
        logAndOpenStore(context, s, s2, null);
    }
    
    public static void logAndOpenStore(final Context context, final String s, final String s2, final Map<String, String> map) {
        final LinkGenerator afInAppEventType = AFInAppEventType(context, s, s2, map, 0II.LIZ(co.valueOf, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() }));
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }
        Map<String, String> map2;
        if ((map2 = map) == null) {
            map2 = new HashMap<String, String>();
        }
        map2.put("af_campaign", s2);
        AppsFlyerLib.getInstance().logEvent(context, "af_cross_promotion", (Map<String, Object>)map2);
        new PthreadThread((Runnable)new c(afInAppEventType.generateLink(), new cp(), context, AppsFlyerLib.getInstance().isStopped()), "CrossPromotionHelper").start();
    }
    
    public static void logCrossPromoteImpression(final Context context, final String s, final String s2) {
        logCrossPromoteImpression(context, s, s2, null);
    }
    
    public static void logCrossPromoteImpression(final Context context, final String s, final String s2, final Map<String, String> map) {
        if (AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.values("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }
        new PthreadThread((Runnable)new c(AFInAppEventType(context, s, s2, map, 0II.LIZ(CrossPromotionHelper.AFKeystoreWrapper, new Object[] { AppsFlyerLib.getInstance().getHostPrefix(), ai.valueOf().getHostName() })).generateLink(), null, null, AppsFlyerLib.getInstance().isStopped()), "CrossPromotionHelper").start();
    }
    
    public static void setUrl(final Map<String, String> map) {
        for (final Map.Entry<K, String> entry : map.entrySet()) {
            final String s = entry.getValue();
            final K key = entry.getKey();
            final int hashCode = key.hashCode();
            if (hashCode != 96801) {
                if (hashCode != 120623625) {
                    continue;
                }
                if (!key.equals("impression")) {
                    continue;
                }
                CrossPromotionHelper.AFKeystoreWrapper = s;
            }
            else {
                if (!key.equals("app")) {
                    continue;
                }
                co.valueOf = s;
            }
        }
    }
    
    public static final class c implements Runnable
    {
        public final cp AFInAppEventType;
        public final WeakReference<Context> AFKeystoreWrapper;
        public final boolean valueOf;
        public final String values;
        
        static {
            Covode.recordClassIndex(2724);
        }
        
        public c(final String values, final cp afInAppEventType, final Context context, final boolean valueOf) {
            this.values = values;
            this.AFInAppEventType = afInAppEventType;
            this.AFKeystoreWrapper = new WeakReference<Context>(context);
            this.valueOf = valueOf;
        }
        
        public static void INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_bytedance_analytics_expose_HookRecyclerView_startActivity(final Context context, final Intent intent) {
            0Qu.LIZ(intent, context);
            context.startActivity(intent);
        }
        
        public static URLConnection INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(final URL url) {
            final 75n ljiil = 75j.LIZLLL.LJIIL(new 75n((Object)url, (WebView)null, (JSONObject)null, 75s.CONTINUE));
            if (ljiil.LJFF == 75s.INTERCEPT && ljiil.LIZIZ != null) {
                final URLConnection urlConnection = (URLConnection)ljiil.LIZIZ;
                Object o;
                if (urlConnection instanceof HttpsURLConnection) {
                    o = new 764((HttpsURLConnection)urlConnection);
                }
                else {
                    o = urlConnection;
                    if (urlConnection instanceof HttpURLConnection) {
                        o = new 75k((HttpURLConnection)urlConnection);
                    }
                }
                return (URLConnection)o;
            }
            if (ljiil.LJFF != 75s.EXCEPTION || ljiil.LJ == null) {
                final URLConnection openConnection = url.openConnection();
                Object o2;
                if (openConnection instanceof HttpsURLConnection) {
                    o2 = new 764((HttpsURLConnection)openConnection);
                }
                else {
                    o2 = openConnection;
                    if (openConnection instanceof HttpURLConnection) {
                        o2 = new 75k((HttpURLConnection)openConnection);
                    }
                }
                return (URLConnection)o2;
            }
            throw ljiil.LJ;
        }
        
        public static void INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(final Context context, final Intent intent) {
            Q0z.LIZ(intent, (Object)context);
            INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_bytedance_analytics_expose_HookRecyclerView_startActivity(context, intent);
        }
        
        @Override
        public final void run() {
            if (this.valueOf) {
                return;
            }
            HttpURLConnection httpURLConnection2;
            try {
                final HttpURLConnection httpURLConnection = (HttpURLConnection)INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(new URL(this.values));
                try {
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    final int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        if (responseCode != 301 && responseCode != 302) {
                            final StringBuilder sb = new StringBuilder("call to ");
                            sb.append(this.values);
                            sb.append(" failed: ");
                            sb.append(responseCode);
                            AFLogger.valueOf(sb.toString());
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder("Cross promotion redirection success: ");
                            sb2.append(this.values);
                            AFLogger.values(sb2.toString(), false);
                            if (this.AFInAppEventType != null && this.AFKeystoreWrapper.get() != null) {
                                this.AFInAppEventType.AFInAppEventType = httpURLConnection.getHeaderField("Location");
                                final cp afInAppEventType = this.AFInAppEventType;
                                final Context context = this.AFKeystoreWrapper.get();
                                if (afInAppEventType.AFInAppEventType != null) {
                                    INVOKEVIRTUAL_com_appsflyer_share_CrossPromotionHelper$c_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity(context, new Intent("android.intent.action.VIEW", Uri.parse(afInAppEventType.AFInAppEventType)).setFlags(268435456));
                                }
                            }
                        }
                    }
                    else {
                        final StringBuilder sb3 = new StringBuilder("Cross promotion impressions success: ");
                        sb3.append(this.values);
                        AFLogger.values(sb3.toString(), false);
                    }
                    httpURLConnection.disconnect();
                    return;
                }
                finally {}
            }
            finally {
                httpURLConnection2 = null;
            }
            try {
                final Throwable t;
                AFLogger.values(t.getMessage(), t);
            }
            finally {
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
            }
        }
    }
}
