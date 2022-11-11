// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import java.util.HashMap;
import java.util.Map;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterAuthConfig;

public class OAuth1aHeaders
{
    public static final String HEADER_AUTH_CREDENTIALS = "X-Verify-Credentials-Authorization";
    public static final String HEADER_AUTH_SERVICE_PROVIDER = "X-Auth-Service-Provider";
    
    public String getAuthorizationHeader(final TwitterAuthConfig twitterAuthConfig, final TwitterAuthToken twitterAuthToken, final String s, final String s2, final String s3, final Map<String, String> map) {
        return this.getOAuth1aParameters(twitterAuthConfig, twitterAuthToken, s, s2, s3, map).getAuthorizationHeader();
    }
    
    public OAuth1aParameters getOAuth1aParameters(final TwitterAuthConfig twitterAuthConfig, final TwitterAuthToken twitterAuthToken, final String s, final String s2, final String s3, final Map<String, String> map) {
        return new OAuth1aParameters(twitterAuthConfig, twitterAuthToken, s, s2, s3, map);
    }
    
    public Map<String, String> getOAuthEchoHeaders(final TwitterAuthConfig twitterAuthConfig, final TwitterAuthToken twitterAuthToken, final String s, final String s2, final String s3, final Map<String, String> map) {
        final HashMap hashMap = new HashMap(2);
        hashMap.put("X-Verify-Credentials-Authorization", this.getAuthorizationHeader(twitterAuthConfig, twitterAuthToken, s, s2, s3, map));
        hashMap.put("X-Auth-Service-Provider", s3);
        return hashMap;
    }
}
