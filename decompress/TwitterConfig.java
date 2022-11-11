// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import java.util.concurrent.ExecutorService;
import android.content.Context;

public class TwitterConfig
{
    public final Context context;
    public final Boolean debug;
    public final ExecutorService executorService;
    public final Logger logger;
    public final TwitterAuthConfig twitterAuthConfig;
    
    private TwitterConfig(final Context context, final Logger logger, final TwitterAuthConfig twitterAuthConfig, final ExecutorService executorService, final Boolean debug) {
        this.context = context;
        this.logger = logger;
        this.twitterAuthConfig = twitterAuthConfig;
        this.executorService = executorService;
        this.debug = debug;
    }
    
    public static class Builder
    {
        private final Context context;
        private Boolean debug;
        private ExecutorService executorService;
        private Logger logger;
        private TwitterAuthConfig twitterAuthConfig;
        
        public Builder(final Context context) {
            if (context != null) {
                this.context = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
        
        public TwitterConfig build() {
            return new TwitterConfig(this.context, this.logger, this.twitterAuthConfig, this.executorService, this.debug, null);
        }
        
        public Builder debug(final boolean b) {
            this.debug = b;
            return this;
        }
        
        public Builder executorService(final ExecutorService executorService) {
            if (executorService != null) {
                this.executorService = executorService;
                return this;
            }
            throw new IllegalArgumentException("ExecutorService must not be null.");
        }
        
        public Builder logger(final Logger logger) {
            if (logger != null) {
                this.logger = logger;
                return this;
            }
            throw new IllegalArgumentException("Logger must not be null.");
        }
        
        public Builder twitterAuthConfig(final TwitterAuthConfig twitterAuthConfig) {
            if (twitterAuthConfig != null) {
                this.twitterAuthConfig = twitterAuthConfig;
                return this;
            }
            throw new IllegalArgumentException("TwitterAuthConfig must not be null.");
        }
    }
}
