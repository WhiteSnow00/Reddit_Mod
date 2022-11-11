// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.oauth;

import okhttp3.Call$Factory;
import okhttp3.OkHttpClient;
import nu2.j$a;
import pu2.a;
import gj.h;
import java.util.Objects;
import nu2.x$b;
import com.twitter.sdk.android.core.internal.network.OkHttpClientHelper;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient$Builder;
import com.twitter.sdk.android.core.TwitterCore;
import nu2.x;
import com.twitter.sdk.android.core.internal.TwitterApi;

abstract class OAuthService
{
    private static final String CLIENT_NAME = "TwitterAndroidSDK";
    private final TwitterApi api;
    private final x retrofit;
    private final TwitterCore twitterCore;
    private final String userAgent;
    
    public OAuthService(final TwitterCore twitterCore, final TwitterApi api) {
        this.twitterCore = twitterCore;
        this.api = api;
        this.userAgent = TwitterApi.buildUserAgent("TwitterAndroidSDK", twitterCore.getVersion());
        final OkHttpClient build = new OkHttpClient$Builder().addInterceptor((Interceptor)new OAuthService$1(this)).certificatePinner(OkHttpClientHelper.getCertificatePinner()).build();
        final x$b x$b = new x$b();
        x$b.c(this.getApi().getBaseHostUrl());
        Objects.requireNonNull(build, "client == null");
        x$b.b = (Call$Factory)build;
        x$b.b((j$a)new a(new h()));
        this.retrofit = x$b.d();
    }
    
    public TwitterApi getApi() {
        return this.api;
    }
    
    public x getRetrofit() {
        return this.retrofit;
    }
    
    public TwitterCore getTwitterCore() {
        return this.twitterCore;
    }
    
    public String getUserAgent() {
        return this.userAgent;
    }
}
