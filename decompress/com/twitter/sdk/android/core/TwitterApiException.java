// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import android.text.TextUtils;
import hj.h;
import com.google.gson.JsonSyntaxException;
import com.twitter.sdk.android.core.models.ApiErrors;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import hj.i;
import ku2.w;
import com.twitter.sdk.android.core.models.ApiError;

public class TwitterApiException extends TwitterException
{
    public static final int DEFAULT_ERROR_CODE = 0;
    private final ApiError apiError;
    private final int code;
    private final w response;
    private final TwitterRateLimit twitterRateLimit;
    
    public TwitterApiException(final w w) {
        this(w, readApiError(w), readApiRateLimit(w), w.a());
    }
    
    public TwitterApiException(final w response, final ApiError apiError, final TwitterRateLimit twitterRateLimit, final int code) {
        super(createExceptionMessage(code));
        this.apiError = apiError;
        this.twitterRateLimit = twitterRateLimit;
        this.code = code;
        this.response = response;
    }
    
    public static String createExceptionMessage(final int n) {
        return d.h("HTTP request failed, Status: ", n);
    }
    
    public static ApiError parseApiError(final String s) {
        final i i = new i();
        i.e.add(new SafeListAdapter());
        i.e.add(new SafeMapAdapter());
        final h a = i.a();
        try {
            final ApiErrors apiErrors = (ApiErrors)a.b((Class)ApiErrors.class, s);
            if (!apiErrors.errors.isEmpty()) {
                return (ApiError)apiErrors.errors.get(0);
            }
        }
        catch (final JsonSyntaxException ex) {
            final Logger logger = Twitter.getLogger();
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid json: ");
            sb.append(s);
            logger.e("Twitter", sb.toString(), (Throwable)ex);
        }
        return null;
    }
    
    public static ApiError readApiError(final w w) {
        try {
            final String e = w.c.source().S0().h().E();
            if (!TextUtils.isEmpty((CharSequence)e)) {
                return parseApiError(e);
            }
        }
        catch (final Exception ex) {
            Twitter.getLogger().e("Twitter", "Unexpected response", (Throwable)ex);
        }
        return null;
    }
    
    public static TwitterRateLimit readApiRateLimit(final w w) {
        return new TwitterRateLimit(w.a.headers());
    }
    
    public int getErrorCode() {
        final ApiError apiError = this.apiError;
        int code;
        if (apiError == null) {
            code = 0;
        }
        else {
            code = apiError.code;
        }
        return code;
    }
    
    public String getErrorMessage() {
        final ApiError apiError = this.apiError;
        String message;
        if (apiError == null) {
            message = null;
        }
        else {
            message = apiError.message;
        }
        return message;
    }
    
    public w getResponse() {
        return this.response;
    }
    
    public int getStatusCode() {
        return this.code;
    }
    
    public TwitterRateLimit getTwitterRateLimit() {
        return this.twitterRateLimit;
    }
}
