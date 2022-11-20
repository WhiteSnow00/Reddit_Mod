// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import ku2.d;
import java.util.Map;
import okhttp3.ResponseBody;
import com.twitter.sdk.android.core.Callback;
import android.net.Uri;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.util.TreeMap;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.TwitterCore;

public class OAuth1aService extends OAuthService
{
    private static final String CALLBACK_URL = "twittersdk://callback";
    private static final String PARAM_SCREEN_NAME = "screen_name";
    private static final String PARAM_USER_ID = "user_id";
    private static final String RESOURCE_OAUTH = "oauth";
    public OAuth1aService.OAuth1aService$OAuthApi api;
    
    public OAuth1aService(final TwitterCore twitterCore, final TwitterApi twitterApi) {
        super(twitterCore, twitterApi);
        this.api = (OAuth1aService.OAuth1aService$OAuthApi)this.getRetrofit().b((Class)OAuth1aService.OAuth1aService$OAuthApi.class);
    }
    
    public static OAuthResponse parseAuthResponse(final String s) {
        final TreeMap queryParams = UrlUtils.getQueryParams(s, false);
        final String s2 = queryParams.get("oauth_token");
        final String s3 = queryParams.get("oauth_token_secret");
        final String s4 = queryParams.get("screen_name");
        long long1;
        if (queryParams.containsKey("user_id")) {
            long1 = Long.parseLong(queryParams.get("user_id"));
        }
        else {
            long1 = 0L;
        }
        if (s2 != null && s3 != null) {
            return new OAuthResponse(new TwitterAuthToken(s2, s3), s4, long1);
        }
        return null;
    }
    
    public String buildCallbackUrl(final TwitterAuthConfig twitterAuthConfig) {
        return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter("version", this.getTwitterCore().getVersion()).appendQueryParameter("app", twitterAuthConfig.getConsumerKey()).build().toString();
    }
    
    public String getAccessTokenUrl() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getApi().getBaseHostUrl());
        sb.append("/oauth/access_token");
        return sb.toString();
    }
    
    public String getAuthorizeUrl(final TwitterAuthToken twitterAuthToken) {
        return this.getApi().buildUponBaseHostUrl(new String[] { "oauth", "authorize" }).appendQueryParameter("oauth_token", twitterAuthToken.token).build().toString();
    }
    
    public Callback<ResponseBody> getCallbackWrapper(final Callback<OAuthResponse> callback) {
        return (Callback<ResponseBody>)new OAuth1aService$1(this, (Callback)callback);
    }
    
    public String getTempTokenUrl() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getApi().getBaseHostUrl());
        sb.append("/oauth/request_token");
        return sb.toString();
    }
    
    public void requestAccessToken(final Callback<OAuthResponse> callback, final TwitterAuthToken twitterAuthToken, final String s) {
        this.api.getAccessToken(new OAuth1aHeaders().getAuthorizationHeader(this.getTwitterCore().getAuthConfig(), twitterAuthToken, (String)null, "POST", this.getAccessTokenUrl(), (Map)null), s).H((d)this.getCallbackWrapper(callback));
    }
    
    public void requestTempToken(final Callback<OAuthResponse> callback) {
        final TwitterAuthConfig authConfig = this.getTwitterCore().getAuthConfig();
        this.api.getTempToken(new OAuth1aHeaders().getAuthorizationHeader(authConfig, (TwitterAuthToken)null, this.buildCallbackUrl(authConfig), "POST", this.getTempTokenUrl(), (Map)null)).H((d)this.getCallbackWrapper(callback));
    }
}
