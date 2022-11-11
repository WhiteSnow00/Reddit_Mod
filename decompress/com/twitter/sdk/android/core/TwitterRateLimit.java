// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import okhttp3.Headers;

public class TwitterRateLimit
{
    private static final String LIMIT_KEY = "x-rate-limit-limit";
    private static final String REMAINING_KEY = "x-rate-limit-remaining";
    private static final String RESET_KEY = "x-rate-limit-reset";
    private int remainingRequest;
    private int requestLimit;
    private long resetSeconds;
    
    public TwitterRateLimit(final Headers headers) {
        if (headers != null) {
            for (int i = 0; i < headers.size(); ++i) {
                if ("x-rate-limit-limit".equals(headers.name(i))) {
                    this.requestLimit = Integer.valueOf(headers.value(i));
                }
                else if ("x-rate-limit-remaining".equals(headers.name(i))) {
                    this.remainingRequest = Integer.valueOf(headers.value(i));
                }
                else if ("x-rate-limit-reset".equals(headers.name(i))) {
                    this.resetSeconds = Long.valueOf(headers.value(i));
                }
            }
            return;
        }
        throw new IllegalArgumentException("headers must not be null");
    }
    
    public int getLimit() {
        return this.requestLimit;
    }
    
    public int getRemaining() {
        return this.remainingRequest;
    }
    
    public long getReset() {
        return this.resetSeconds;
    }
}
