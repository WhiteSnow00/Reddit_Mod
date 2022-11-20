// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.network;

import okhttp3.Request$Builder;
import okhttp3.Headers;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import com.twitter.sdk.android.core.GuestSession;
import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import com.twitter.sdk.android.core.GuestSessionProvider;
import okhttp3.Authenticator;

public class GuestAuthenticator implements Authenticator
{
    public static final int MAX_RETRIES = 2;
    public final GuestSessionProvider guestSessionProvider;
    
    public GuestAuthenticator(final GuestSessionProvider guestSessionProvider) {
        this.guestSessionProvider = guestSessionProvider;
    }
    
    public Request authenticate(final Route route, final Response response) throws IOException {
        return this.reauth(response);
    }
    
    public boolean canRetry(Response priorResponse) {
        boolean b = true;
        int n = 1;
        while (true) {
            priorResponse = priorResponse.priorResponse();
            if (priorResponse == null) {
                break;
            }
            ++n;
        }
        if (n >= 2) {
            b = false;
        }
        return b;
    }
    
    public GuestSession getExpiredSession(final Response response) {
        final Headers headers = response.request().headers();
        final String value = headers.get("Authorization");
        final String value2 = headers.get("x-guest-token");
        if (value != null && value2 != null) {
            return new GuestSession(new GuestAuthToken("bearer", value.replace("bearer ", ""), value2));
        }
        return null;
    }
    
    public Request reauth(final Response response) {
        if (this.canRetry(response)) {
            final GuestSession refreshCurrentSession = this.guestSessionProvider.refreshCurrentSession(this.getExpiredSession(response));
            GuestAuthToken guestAuthToken;
            if (refreshCurrentSession == null) {
                guestAuthToken = null;
            }
            else {
                guestAuthToken = (GuestAuthToken)refreshCurrentSession.getAuthToken();
            }
            if (guestAuthToken != null) {
                return this.resign(response.request(), guestAuthToken);
            }
        }
        return null;
    }
    
    public Request resign(final Request request, final GuestAuthToken guestAuthToken) {
        final Request$Builder builder = request.newBuilder();
        GuestAuthInterceptor.addAuthHeaders(builder, guestAuthToken);
        return builder.build();
    }
}
