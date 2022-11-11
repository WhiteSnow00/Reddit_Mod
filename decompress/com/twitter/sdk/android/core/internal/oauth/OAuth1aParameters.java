// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import java.util.Locale;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import com.twitter.sdk.android.core.Twitter;
import okio.ByteString;
import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Iterator;
import java.util.TreeMap;
import com.twitter.sdk.android.core.internal.network.UrlUtils;
import java.util.Map;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import java.security.SecureRandom;

class OAuth1aParameters
{
    private static final SecureRandom RAND;
    private static final String SIGNATURE_METHOD = "HMAC-SHA1";
    private static final String VERSION = "1.0";
    private final TwitterAuthConfig authConfig;
    private final TwitterAuthToken authToken;
    private final String callback;
    private final String method;
    private final Map<String, String> postParams;
    private final String url;
    
    static {
        RAND = new SecureRandom();
    }
    
    public OAuth1aParameters(final TwitterAuthConfig authConfig, final TwitterAuthToken authToken, final String callback, final String method, final String url, final Map<String, String> postParams) {
        this.authConfig = authConfig;
        this.authToken = authToken;
        this.callback = callback;
        this.method = method;
        this.url = url;
        this.postParams = postParams;
    }
    
    private void appendParameter(final StringBuilder sb, final String s, final String s2) {
        if (s2 != null) {
            sb.append(' ');
            sb.append(UrlUtils.percentEncode(s));
            sb.append("=\"");
            sb.append(UrlUtils.percentEncode(s2));
            sb.append("\",");
        }
    }
    
    private String getEncodedQueryParams(final TreeMap<String, String> treeMap) {
        final StringBuilder sb = new StringBuilder();
        final int size = treeMap.size();
        final Iterator<Map.Entry<String, String>> iterator = treeMap.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map.Entry<String, V> entry = (Map.Entry<String, V>)iterator.next();
            sb.append(UrlUtils.percentEncode(UrlUtils.percentEncode(entry.getKey())));
            sb.append("%3D");
            sb.append(UrlUtils.percentEncode(UrlUtils.percentEncode((String)entry.getValue())));
            final int n2 = n + 1;
            if ((n = n2) < size) {
                sb.append("%26");
                n = n2;
            }
        }
        return sb.toString();
    }
    
    private String getNonce() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(System.nanoTime()));
        sb.append(String.valueOf(Math.abs(OAuth1aParameters.RAND.nextLong())));
        return sb.toString();
    }
    
    private String getSigningKey() {
        final TwitterAuthToken authToken = this.authToken;
        String secret;
        if (authToken != null) {
            secret = authToken.secret;
        }
        else {
            secret = null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(UrlUtils.urlEncode(this.authConfig.getConsumerSecret()));
        sb.append('&');
        sb.append(UrlUtils.urlEncode(secret));
        return sb.toString();
    }
    
    private String getTimestamp() {
        return Long.toString(System.currentTimeMillis() / 1000L);
    }
    
    public String calculateSignature(String base64) {
        try {
            final String signingKey = this.getSigningKey();
            final byte[] bytes = base64.getBytes("UTF8");
            final SecretKeySpec secretKeySpec = new SecretKeySpec(signingKey.getBytes("UTF8"), "HmacSHA1");
            final Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            final byte[] doFinal = instance.doFinal(bytes);
            base64 = ByteString.of(doFinal, 0, doFinal.length).base64();
            return base64;
        }
        catch (final UnsupportedEncodingException ex) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", (Throwable)ex);
            return "";
        }
        catch (final NoSuchAlgorithmException ex2) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", (Throwable)ex2);
            return "";
        }
        catch (final InvalidKeyException ex3) {
            Twitter.getLogger().e("Twitter", "Failed to calculate signature", (Throwable)ex3);
            return "";
        }
    }
    
    public String constructAuthorizationHeader(String token, final String s, final String s2) {
        final StringBuilder sb = new StringBuilder("OAuth");
        this.appendParameter(sb, "oauth_callback", this.callback);
        this.appendParameter(sb, "oauth_consumer_key", this.authConfig.getConsumerKey());
        this.appendParameter(sb, "oauth_nonce", token);
        this.appendParameter(sb, "oauth_signature", s2);
        this.appendParameter(sb, "oauth_signature_method", "HMAC-SHA1");
        this.appendParameter(sb, "oauth_timestamp", s);
        final TwitterAuthToken authToken = this.authToken;
        if (authToken != null) {
            token = authToken.token;
        }
        else {
            token = null;
        }
        this.appendParameter(sb, "oauth_token", token);
        this.appendParameter(sb, "oauth_version", "1.0");
        return sb.substring(0, sb.length() - 1);
    }
    
    public String constructSignatureBase(String token, String string) {
        final URI create = URI.create(this.url);
        final TreeMap<String, String> queryParams = UrlUtils.getQueryParams(create, true);
        final Map<String, String> postParams = this.postParams;
        if (postParams != null) {
            queryParams.putAll(postParams);
        }
        final String callback = this.callback;
        if (callback != null) {
            queryParams.put("oauth_callback", callback);
        }
        queryParams.put("oauth_consumer_key", this.authConfig.getConsumerKey());
        queryParams.put("oauth_nonce", token);
        queryParams.put("oauth_signature_method", "HMAC-SHA1");
        queryParams.put("oauth_timestamp", string);
        final TwitterAuthToken authToken = this.authToken;
        if (authToken != null) {
            token = authToken.token;
            if (token != null) {
                queryParams.put("oauth_token", token);
            }
        }
        queryParams.put("oauth_version", "1.0");
        final StringBuilder sb = new StringBuilder();
        sb.append(create.getScheme());
        sb.append("://");
        sb.append(create.getHost());
        sb.append(create.getPath());
        string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.method.toUpperCase(Locale.ENGLISH));
        sb2.append('&');
        sb2.append(UrlUtils.percentEncode(string));
        sb2.append('&');
        sb2.append(this.getEncodedQueryParams(queryParams));
        return sb2.toString();
    }
    
    public String getAuthorizationHeader() {
        final String nonce = this.getNonce();
        final String timestamp = this.getTimestamp();
        return this.constructAuthorizationHeader(nonce, timestamp, this.calculateSignature(this.constructSignatureBase(nonce, timestamp)));
    }
}
