// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.network;

import okhttp3.HttpUrl$Builder;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import java.util.Locale;
import java.util.HashMap;
import java.io.IOException;
import java.util.Map;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aHeaders;
import okhttp3.Request;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import okhttp3.Interceptor;

public class OAuth1aInterceptor implements Interceptor
{
    public final TwitterAuthConfig authConfig;
    public final Session<? extends TwitterAuthToken> session;
    
    public OAuth1aInterceptor(final Session<? extends TwitterAuthToken> session, final TwitterAuthConfig authConfig) {
        this.session = session;
        this.authConfig = authConfig;
    }
    
    public String getAuthorizationHeader(final Request request) throws IOException {
        return new OAuth1aHeaders().getAuthorizationHeader(this.authConfig, (TwitterAuthToken)this.session.getAuthToken(), (String)null, request.method(), request.url().toString(), (Map)this.getPostParams(request));
    }
    
    public Map<String, String> getPostParams(final Request request) throws IOException {
        final HashMap hashMap = new HashMap();
        if ("POST".equals(request.method().toUpperCase(Locale.US))) {
            final RequestBody body = request.body();
            if (body instanceof FormBody) {
                final FormBody formBody = (FormBody)body;
                for (int i = 0; i < formBody.size(); ++i) {
                    hashMap.put(formBody.encodedName(i), formBody.value(i));
                }
            }
        }
        return hashMap;
    }
    
    public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        final Request request = interceptor$Chain.request();
        final Request build = request.newBuilder().url(this.urlWorkaround(request.url())).build();
        return interceptor$Chain.proceed(build.newBuilder().header("Authorization", this.getAuthorizationHeader(build)).build());
    }
    
    public HttpUrl urlWorkaround(final HttpUrl httpUrl) {
        final HttpUrl$Builder query = httpUrl.newBuilder().query((String)null);
        for (int querySize = httpUrl.querySize(), i = 0; i < querySize; ++i) {
            query.addEncodedQueryParameter(UrlUtils.percentEncode(httpUrl.queryParameterName(i)), UrlUtils.percentEncode(httpUrl.queryParameterValue(i)));
        }
        return query.build();
    }
}
