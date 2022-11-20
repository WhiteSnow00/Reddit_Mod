// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import ku2.d;
import com.twitter.sdk.android.core.Callback;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import okio.ByteString;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import com.twitter.sdk.android.core.internal.TwitterApi;
import com.twitter.sdk.android.core.TwitterCore;

public class OAuth2Service extends OAuthService
{
    public OAuth2Service.OAuth2Service$OAuth2Api api;
    
    public OAuth2Service(final TwitterCore twitterCore, final TwitterApi twitterApi) {
        super(twitterCore, twitterApi);
        this.api = (OAuth2Service.OAuth2Service$OAuth2Api)this.getRetrofit().b((Class)OAuth2Service.OAuth2Service$OAuth2Api.class);
    }
    
    private String getAuthHeader() {
        final TwitterAuthConfig authConfig = this.getTwitterCore().getAuthConfig();
        final StringBuilder sb = new StringBuilder();
        sb.append(UrlUtils.percentEncode(authConfig.getConsumerKey()));
        sb.append(":");
        sb.append(UrlUtils.percentEncode(authConfig.getConsumerSecret()));
        final ByteString encodeUtf8 = ByteString.encodeUtf8(sb.toString());
        final StringBuilder t = a.t("Basic ");
        t.append(encodeUtf8.base64());
        return t.toString();
    }
    
    private String getAuthorizationHeader(final OAuth2Token oAuth2Token) {
        final StringBuilder t = a.t("Bearer ");
        t.append(oAuth2Token.getAccessToken());
        return t.toString();
    }
    
    public void requestAppAuthToken(final Callback<OAuth2Token> callback) {
        this.api.getAppAuthToken(this.getAuthHeader(), "client_credentials").H((d)callback);
    }
    
    public void requestGuestAuthToken(final Callback<GuestAuthToken> callback) {
        this.requestAppAuthToken((Callback<OAuth2Token>)new OAuth2Service$1(this, (Callback)callback));
    }
    
    public void requestGuestToken(final Callback<GuestTokenResponse> callback, final OAuth2Token oAuth2Token) {
        this.api.getGuestToken(this.getAuthorizationHeader(oAuth2Token)).H((d)callback);
    }
}
