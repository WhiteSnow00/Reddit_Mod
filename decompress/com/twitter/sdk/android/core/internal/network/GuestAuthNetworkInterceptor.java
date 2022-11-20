// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.network;

import java.io.IOException;
import okhttp3.Response;
import okhttp3.Interceptor$Chain;
import okhttp3.Interceptor;

public class GuestAuthNetworkInterceptor implements Interceptor
{
    public Response intercept(final Interceptor$Chain interceptor$Chain) throws IOException {
        Response response2;
        final Response response = response2 = interceptor$Chain.proceed(interceptor$Chain.request());
        if (response.code() == 403) {
            response2 = response.newBuilder().code(401).build();
        }
        return response2;
    }
}
