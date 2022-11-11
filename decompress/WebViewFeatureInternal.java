// 
// Decompiled by Procyon v0.6.0
// 

package androidx.webkit.internal;

import android.os.Build;
import android.os.Build$VERSION;
import java.util.Iterator;
import ak0.m;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import b6.a;

public enum WebViewFeatureInternal implements a
{
    CREATE_WEB_MESSAGE_CHANNEL("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 23), 
    DISABLED_ACTION_MODE_MENU_ITEMS("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 24), 
    DOCUMENT_START_SCRIPT("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1"), 
    FORCE_DARK("FORCE_DARK", "FORCE_DARK"), 
    FORCE_DARK_STRATEGY("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR"), 
    GET_WEB_CHROME_CLIENT("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 26), 
    GET_WEB_VIEW_CLIENT("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 26), 
    GET_WEB_VIEW_RENDERER("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 29), 
    MULTI_PROCESS("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    
    private static final int NOT_SUPPORTED_BY_FRAMEWORK = -1;
    
    OFF_SCREEN_PRERASTER("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 23), 
    POST_WEB_MESSAGE("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 23), 
    PROXY_OVERRIDE("PROXY_OVERRIDE", "PROXY_OVERRIDE:3"), 
    RECEIVE_HTTP_ERROR("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 23), 
    RECEIVE_WEB_RESOURCE_ERROR("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 23), 
    @Deprecated
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 27), 
    @Deprecated
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 27), 
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 27), 
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 27), 
    SAFE_BROWSING_ENABLE("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 26), 
    SAFE_BROWSING_HIT("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 27), 
    SAFE_BROWSING_PRIVACY_POLICY_URL("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 27), 
    SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 27), 
    SAFE_BROWSING_RESPONSE_PROCEED("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 27), 
    SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 27), 
    SERVICE_WORKER_BASIC_USAGE("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 24), 
    SERVICE_WORKER_BLOCK_NETWORK_LOADS("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 24), 
    SERVICE_WORKER_CACHE_MODE("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 24), 
    SERVICE_WORKER_CONTENT_ACCESS("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 24), 
    SERVICE_WORKER_FILE_ACCESS("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 24), 
    SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 24), 
    SHOULD_OVERRIDE_WITH_REDIRECTS("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 24), 
    START_SAFE_BROWSING("START_SAFE_BROWSING", "START_SAFE_BROWSING", 27), 
    SUPPRESS_ERROR_PAGE("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE"), 
    TRACING_CONTROLLER_BASIC_USAGE("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 28), 
    VISUAL_STATE_CALLBACK("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 23), 
    WEB_MESSAGE_CALLBACK_ON_MESSAGE("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 23), 
    WEB_MESSAGE_LISTENER("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER"), 
    WEB_MESSAGE_PORT_CLOSE("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 23), 
    WEB_MESSAGE_PORT_POST_MESSAGE("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 23), 
    WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 23), 
    WEB_RESOURCE_ERROR_GET_CODE("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 23), 
    WEB_RESOURCE_ERROR_GET_DESCRIPTION("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 23), 
    WEB_RESOURCE_REQUEST_IS_REDIRECT("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 24), 
    WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 29), 
    WEB_VIEW_RENDERER_TERMINATE("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 29);
    
    private final String mInternalFeatureValue;
    private final int mOsVersion;
    private final String mPublicFeatureValue;
    
    private WebViewFeatureInternal(final String s2, final String s3) {
        this(s2, s3, -1);
    }
    
    private WebViewFeatureInternal(final String mPublicFeatureValue, final String mInternalFeatureValue, final int mOsVersion) {
        this.mPublicFeatureValue = mPublicFeatureValue;
        this.mInternalFeatureValue = mInternalFeatureValue;
        this.mOsVersion = mOsVersion;
    }
    
    public static UnsupportedOperationException getUnsupportedOperationException() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }
    
    public static Set<String> getWebViewApkFeaturesForTesting() {
        return WebViewFeatureInternal.WebViewFeatureInternal$a.a;
    }
    
    public static boolean isSupported(final String s) {
        final HashSet set = new HashSet();
        final WebViewFeatureInternal[] values = values();
        for (int length = values.length, i = 0; i < length; ++i) {
            set.add(values[i]);
        }
        return isSupported(s, set);
    }
    
    public static boolean isSupported(final String s, final Collection<a> collection) {
        final HashSet set = new HashSet();
        for (final a a : collection) {
            if (a.getPublicFeatureName().equals(s)) {
                set.add(a);
            }
        }
        if (!set.isEmpty()) {
            final Iterator iterator2 = set.iterator();
            while (iterator2.hasNext()) {
                if (((a)iterator2.next()).isSupported()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException(m.l("Unknown feature ", s));
    }
    
    public String getPublicFeatureName() {
        return this.mPublicFeatureValue;
    }
    
    public boolean isSupported() {
        return this.isSupportedByFramework() || this.isSupportedByWebView();
    }
    
    public boolean isSupportedByFramework() {
        final int mOsVersion = this.mOsVersion;
        boolean b = false;
        if (mOsVersion == -1) {
            return false;
        }
        if (Build$VERSION.SDK_INT >= mOsVersion) {
            b = true;
        }
        return b;
    }
    
    public boolean isSupportedByWebView() {
        final HashSet a = WebViewFeatureInternal.WebViewFeatureInternal$a.a;
        final String mInternalFeatureValue = this.mInternalFeatureValue;
        final boolean contains = a.contains(mInternalFeatureValue);
        final boolean b = false;
        if (!contains) {
            final String type = Build.TYPE;
            final boolean b2 = "eng".equals(type) || "userdebug".equals(type);
            boolean b3 = b;
            if (!b2) {
                return b3;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(mInternalFeatureValue);
            sb.append(":dev");
            b3 = b;
            if (!a.contains(sb.toString())) {
                return b3;
            }
        }
        return true;
    }
}
