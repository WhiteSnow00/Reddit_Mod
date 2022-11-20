// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.network;

import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import java.io.IOException;
import com.twitter.sdk.android.core.GuestSession;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import okhttp3.Request$Builder;
import com.twitter.sdk.android.core.GuestSessionProvider;
import okhttp3.Interceptor;

public class GuestAuthInterceptor implements Interceptor
{
    public final GuestSessionProvider guestSessionProvider;
    
    public GuestAuthInterceptor(final GuestSessionProvider guestSessionProvider) {
        this.guestSessionProvider = guestSessionProvider;
    }
    
    public static void addAuthHeaders(final Request$Builder request$Builder, final GuestAuthToken guestAuthToken) {
        final StringBuilder sb = new StringBuilder();
        sb.append(((OAuth2Token)guestAuthToken).getTokenType());
        sb.append(" ");
        sb.append(((OAuth2Token)guestAuthToken).getAccessToken());
        request$Builder.header("Authorization", sb.toString());
        request$Builder.header("x-guest-token", guestAuthToken.getGuestToken());
    }
    
    public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        final Request request = interceptor$Chain.request();
        final GuestSession currentSession = this.guestSessionProvider.getCurrentSession();
        GuestAuthToken guestAuthToken;
        if (currentSession == null) {
            guestAuthToken = null;
        }
        else {
            guestAuthToken = (GuestAuthToken)currentSession.getAuthToken();
        }
        if (guestAuthToken != null) {
            final Request$Builder builder = request.newBuilder();
            addAuthHeaders(builder, guestAuthToken);
            return interceptor$Chain.proceed(builder.build());
        }
        return interceptor$Chain.proceed(request);
    }
}
