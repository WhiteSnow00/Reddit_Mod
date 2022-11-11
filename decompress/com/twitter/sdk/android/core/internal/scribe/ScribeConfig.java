// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

public class ScribeConfig
{
    public static final String BASE_URL = "https://api.twitter.com";
    public static final int DEFAULT_MAX_FILES_TO_KEEP = 100;
    public static final int DEFAULT_SEND_INTERVAL_SECONDS = 600;
    public final String baseUrl;
    public final boolean isEnabled;
    public final int maxFilesToKeep;
    public final String pathType;
    public final String pathVersion;
    public final int sendIntervalSeconds;
    public final String sequence;
    public final String userAgent;
    
    public ScribeConfig(final boolean isEnabled, final String baseUrl, final String pathVersion, final String pathType, final String sequence, final String userAgent, final int maxFilesToKeep, final int sendIntervalSeconds) {
        this.isEnabled = isEnabled;
        this.baseUrl = baseUrl;
        this.pathVersion = pathVersion;
        this.pathType = pathType;
        this.sequence = sequence;
        this.userAgent = userAgent;
        this.maxFilesToKeep = maxFilesToKeep;
        this.sendIntervalSeconds = sendIntervalSeconds;
    }
}
