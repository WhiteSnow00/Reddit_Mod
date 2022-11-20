// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

import java.util.concurrent.Executor;

public abstract class ExperimentalUrlRequest extends UrlRequest
{
    public abstract static class Builder extends UrlRequest$Builder
    {
        public abstract Builder addHeader(final String p0, final String p1);
        
        public /* bridge */ UrlRequest$Builder addHeader(final String s, final String s2) {
            return this.addHeader(s, s2);
        }
        
        public Builder addRequestAnnotation(final Object o) {
            return this;
        }
        
        public abstract Builder allowDirectExecutor();
        
        public /* bridge */ UrlRequest$Builder allowDirectExecutor() {
            return this.allowDirectExecutor();
        }
        
        public abstract ExperimentalUrlRequest build();
        
        public /* bridge */ UrlRequest build() {
            return this.build();
        }
        
        public abstract Builder disableCache();
        
        public /* bridge */ UrlRequest$Builder disableCache() {
            return this.disableCache();
        }
        
        public Builder disableConnectionMigration() {
            return this;
        }
        
        public abstract Builder setHttpMethod(final String p0);
        
        public /* bridge */ UrlRequest$Builder setHttpMethod(final String httpMethod) {
            return this.setHttpMethod(httpMethod);
        }
        
        public abstract Builder setPriority(final int p0);
        
        public /* bridge */ UrlRequest$Builder setPriority(final int priority) {
            return this.setPriority(priority);
        }
        
        public Builder setRequestFinishedListener(final RequestFinishedInfo$Listener requestFinishedInfo$Listener) {
            return this;
        }
        
        public Builder setTrafficStatsTag(final int n) {
            return this;
        }
        
        public Builder setTrafficStatsUid(final int n) {
            return this;
        }
        
        public abstract Builder setUploadDataProvider(final UploadDataProvider p0, final Executor p1);
        
        public /* bridge */ UrlRequest$Builder setUploadDataProvider(final UploadDataProvider uploadDataProvider, final Executor executor) {
            return this.setUploadDataProvider(uploadDataProvider, executor);
        }
    }
}
