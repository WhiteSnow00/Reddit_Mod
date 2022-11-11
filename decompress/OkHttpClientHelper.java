// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.network;

import okhttp3.OkHttpClient;
import okhttp3.CertificatePinner$Builder;
import okhttp3.CertificatePinner;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.Session;
import okhttp3.Interceptor;
import okhttp3.Authenticator;
import com.twitter.sdk.android.core.GuestSessionProvider;
import okhttp3.OkHttpClient$Builder;

public class OkHttpClientHelper
{
    public static OkHttpClient$Builder addGuestAuth(final OkHttpClient$Builder okHttpClient$Builder, final GuestSessionProvider guestSessionProvider) {
        return okHttpClient$Builder.certificatePinner(getCertificatePinner()).authenticator((Authenticator)new GuestAuthenticator(guestSessionProvider)).addInterceptor((Interceptor)new GuestAuthInterceptor(guestSessionProvider)).addNetworkInterceptor((Interceptor)new GuestAuthNetworkInterceptor());
    }
    
    public static OkHttpClient$Builder addSessionAuth(final OkHttpClient$Builder okHttpClient$Builder, final Session<? extends TwitterAuthToken> session, final TwitterAuthConfig twitterAuthConfig) {
        return okHttpClient$Builder.certificatePinner(getCertificatePinner()).addInterceptor((Interceptor)new OAuth1aInterceptor((Session)session, twitterAuthConfig));
    }
    
    public static CertificatePinner getCertificatePinner() {
        return new CertificatePinner$Builder().add("*.twitter.com", new String[] { "sha1/I0PRSKJViZuUfUYaeX7ATP7RcLc=" }).add("*.twitter.com", new String[] { "sha1/VRmyeKyygdftp6vBg5nDu2kEJLU=" }).add("*.twitter.com", new String[] { "sha1/Eje6RRfurSkm/cHN/r7t8t7ZFFw=" }).add("*.twitter.com", new String[] { "sha1/Wr7Fddyu87COJxlD/H8lDD32YeM=" }).add("*.twitter.com", new String[] { "sha1/GiG0lStik84Ys2XsnA6TTLOB5tQ=" }).add("*.twitter.com", new String[] { "sha1/IvGeLsbqzPxdI0b0wuj2xVTdXgc=" }).add("*.twitter.com", new String[] { "sha1/7WYxNdMb1OymFMQp4xkGn5TBJlA=" }).add("*.twitter.com", new String[] { "sha1/sYEIGhmkwJQf+uiVKMEkyZs0rMc=" }).add("*.twitter.com", new String[] { "sha1/PANDaGiVHPNpKri0Jtq6j+ki5b0=" }).add("*.twitter.com", new String[] { "sha1/u8I+KQuzKHcdrT6iTb30I70GsD0=" }).add("*.twitter.com", new String[] { "sha1/wHqYaI2J+6sFZAwRfap9ZbjKzE4=" }).add("*.twitter.com", new String[] { "sha1/cTg28gIxU0crbrplRqkQFVggBQk=" }).add("*.twitter.com", new String[] { "sha1/sBmJ5+/7Sq/LFI9YRjl2IkFQ4bo=" }).add("*.twitter.com", new String[] { "sha1/vb6nG6txV/nkddlU0rcngBqCJoI=" }).add("*.twitter.com", new String[] { "sha1/nKmNAK90Dd2BgNITRaWLjy6UONY=" }).add("*.twitter.com", new String[] { "sha1/h+hbY1PGI6MSjLD/u/VR/lmADiI=" }).add("*.twitter.com", new String[] { "sha1/Xk9ThoXdT57KX9wNRW99UbHcm3s=" }).add("*.twitter.com", new String[] { "sha1/1S4TwavjSdrotJWU73w4Q2BkZr0=" }).add("*.twitter.com", new String[] { "sha1/gzF+YoVCU9bXeDGQ7JGQVumRueM=" }).add("*.twitter.com", new String[] { "sha1/aDMOYTWFIVkpg6PI0tLhQG56s8E=" }).add("*.twitter.com", new String[] { "sha1/Vv7zwhR9TtOIN/29MFI4cgHld40=" }).build();
    }
    
    public static OkHttpClient getCustomOkHttpClient(final OkHttpClient okHttpClient, final GuestSessionProvider guestSessionProvider) {
        if (okHttpClient != null) {
            return addGuestAuth(okHttpClient.newBuilder(), guestSessionProvider).build();
        }
        throw new IllegalArgumentException("HttpClient must not be null.");
    }
    
    public static OkHttpClient getCustomOkHttpClient(final OkHttpClient okHttpClient, final Session<? extends TwitterAuthToken> session, final TwitterAuthConfig twitterAuthConfig) {
        if (session == null) {
            throw new IllegalArgumentException("Session must not be null.");
        }
        if (okHttpClient != null) {
            return addSessionAuth(okHttpClient.newBuilder(), session, twitterAuthConfig).build();
        }
        throw new IllegalArgumentException("HttpClient must not be null.");
    }
    
    public static OkHttpClient getOkHttpClient(final GuestSessionProvider guestSessionProvider) {
        return addGuestAuth(new OkHttpClient$Builder(), guestSessionProvider).build();
    }
    
    public static OkHttpClient getOkHttpClient(final Session<? extends TwitterAuthToken> session, final TwitterAuthConfig twitterAuthConfig) {
        if (session != null) {
            return addSessionAuth(new OkHttpClient$Builder(), session, twitterAuthConfig).build();
        }
        throw new IllegalArgumentException("Session must not be null.");
    }
}
