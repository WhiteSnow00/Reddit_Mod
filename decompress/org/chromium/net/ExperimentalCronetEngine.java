// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import android.support.annotation.VisibleForTesting;
import java.util.Date;
import java.util.Set;
import android.content.Context;
import java.io.IOException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.concurrent.Executor;

public abstract class ExperimentalCronetEngine extends CronetEngine
{
    public static final int CONNECTION_METRIC_UNKNOWN = -1;
    public static final int EFFECTIVE_CONNECTION_TYPE_2G = 3;
    public static final int EFFECTIVE_CONNECTION_TYPE_3G = 4;
    public static final int EFFECTIVE_CONNECTION_TYPE_4G = 5;
    public static final int EFFECTIVE_CONNECTION_TYPE_OFFLINE = 1;
    public static final int EFFECTIVE_CONNECTION_TYPE_SLOW_2G = 2;
    public static final int EFFECTIVE_CONNECTION_TYPE_UNKNOWN = 0;
    
    public void addRequestFinishedListener(final RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
    }
    
    public void addRttListener(final NetworkQualityRttListener networkQualityRttListener) {
    }
    
    public void addThroughputListener(final NetworkQualityThroughputListener networkQualityThroughputListener) {
    }
    
    public void configureNetworkQualityEstimatorForTesting(final boolean b, final boolean b2, final boolean b3) {
    }
    
    public int getDownstreamThroughputKbps() {
        return -1;
    }
    
    public int getEffectiveConnectionType() {
        return 0;
    }
    
    public int getHttpRttMs() {
        return -1;
    }
    
    public int getTransportRttMs() {
        return -1;
    }
    
    public abstract ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(final String p0, final BidirectionalStream$Callback p1, final Executor p2);
    
    public abstract ExperimentalUrlRequest.Builder newUrlRequestBuilder(final String p0, final UrlRequest$Callback p1, final Executor p2);
    
    public /* bridge */ UrlRequest$Builder newUrlRequestBuilder(final String s, final UrlRequest$Callback urlRequest$Callback, final Executor executor) {
        return this.newUrlRequestBuilder(s, urlRequest$Callback, executor);
    }
    
    public URLConnection openConnection(final URL url, final Proxy proxy) throws IOException {
        return (URLConnection)FirebasePerfUrlConnection.instrument((Object)url.openConnection(proxy));
    }
    
    public void removeRequestFinishedListener(final RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
    }
    
    public void removeRttListener(final NetworkQualityRttListener networkQualityRttListener) {
    }
    
    public void removeThroughputListener(final NetworkQualityThroughputListener networkQualityThroughputListener) {
    }
    
    public void startNetLogToDisk(final String s, final boolean b, final int n) {
    }
    
    public static class Builder extends CronetEngine$Builder
    {
        public Builder(final Context context) {
            super(context);
        }
        
        public Builder(final ICronetEngineBuilder cronetEngineBuilder) {
            super(cronetEngineBuilder);
        }
        
        public /* bridge */ CronetEngine$Builder addPublicKeyPins(final String s, final Set set, final boolean b, final Date date) {
            return this.addPublicKeyPins(s, set, b, date);
        }
        
        public Builder addPublicKeyPins(final String s, final Set<byte[]> set, final boolean b, final Date date) {
            super.addPublicKeyPins(s, (Set)set, b, date);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder addQuicHint(final String s, final int n, final int n2) {
            return this.addQuicHint(s, n, n2);
        }
        
        public Builder addQuicHint(final String s, final int n, final int n2) {
            super.addQuicHint(s, n, n2);
            return this;
        }
        
        public /* bridge */ CronetEngine build() {
            return this.build();
        }
        
        public ExperimentalCronetEngine build() {
            return super.mBuilderDelegate.build();
        }
        
        public /* bridge */ CronetEngine$Builder enableHttp2(final boolean b) {
            return this.enableHttp2(b);
        }
        
        public Builder enableHttp2(final boolean b) {
            super.enableHttp2(b);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder enableHttpCache(final int n, final long n2) {
            return this.enableHttpCache(n, n2);
        }
        
        public Builder enableHttpCache(final int n, final long n2) {
            super.enableHttpCache(n, n2);
            return this;
        }
        
        public Builder enableNetworkQualityEstimator(final boolean b) {
            super.mBuilderDelegate.enableNetworkQualityEstimator(b);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder enablePublicKeyPinningBypassForLocalTrustAnchors(final boolean b) {
            return this.enablePublicKeyPinningBypassForLocalTrustAnchors(b);
        }
        
        public Builder enablePublicKeyPinningBypassForLocalTrustAnchors(final boolean b) {
            super.enablePublicKeyPinningBypassForLocalTrustAnchors(b);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder enableQuic(final boolean b) {
            return this.enableQuic(b);
        }
        
        public Builder enableQuic(final boolean b) {
            super.enableQuic(b);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder enableSdch(final boolean b) {
            return this.enableSdch(b);
        }
        
        public Builder enableSdch(final boolean b) {
            return this;
        }
        
        @VisibleForTesting
        public ICronetEngineBuilder getBuilderDelegate() {
            return super.mBuilderDelegate;
        }
        
        public Builder setExperimentalOptions(final String experimentalOptions) {
            super.mBuilderDelegate.setExperimentalOptions(experimentalOptions);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder setLibraryLoader(final CronetEngine$Builder$LibraryLoader libraryLoader) {
            return this.setLibraryLoader(libraryLoader);
        }
        
        public Builder setLibraryLoader(final CronetEngine$Builder$LibraryLoader libraryLoader) {
            super.setLibraryLoader(libraryLoader);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder setStoragePath(final String storagePath) {
            return this.setStoragePath(storagePath);
        }
        
        public Builder setStoragePath(final String storagePath) {
            super.setStoragePath(storagePath);
            return this;
        }
        
        public Builder setThreadPriority(final int threadPriority) {
            super.mBuilderDelegate.setThreadPriority(threadPriority);
            return this;
        }
        
        public /* bridge */ CronetEngine$Builder setUserAgent(final String userAgent) {
            return this.setUserAgent(userAgent);
        }
        
        public Builder setUserAgent(final String userAgent) {
            super.setUserAgent(userAgent);
            return this;
        }
    }
}
