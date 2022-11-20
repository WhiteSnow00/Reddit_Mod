// 
// Decompiled by Procyon v0.6.0
// 

package org.chromium.net;

public abstract class ExperimentalBidirectionalStream extends BidirectionalStream
{
    public abstract static class Builder extends BidirectionalStream$Builder
    {
        public /* bridge */ BidirectionalStream$Builder addHeader(final String s, final String s2) {
            return this.addHeader(s, s2);
        }
        
        public abstract Builder addHeader(final String p0, final String p1);
        
        public Builder addRequestAnnotation(final Object o) {
            return this;
        }
        
        public /* bridge */ BidirectionalStream build() {
            return this.build();
        }
        
        public abstract ExperimentalBidirectionalStream build();
        
        public /* bridge */ BidirectionalStream$Builder delayRequestHeadersUntilFirstFlush(final boolean b) {
            return this.delayRequestHeadersUntilFirstFlush(b);
        }
        
        public abstract Builder delayRequestHeadersUntilFirstFlush(final boolean p0);
        
        public /* bridge */ BidirectionalStream$Builder setHttpMethod(final String httpMethod) {
            return this.setHttpMethod(httpMethod);
        }
        
        public abstract Builder setHttpMethod(final String p0);
        
        public /* bridge */ BidirectionalStream$Builder setPriority(final int priority) {
            return this.setPriority(priority);
        }
        
        public abstract Builder setPriority(final int p0);
        
        public Builder setTrafficStatsTag(final int n) {
            return this;
        }
        
        public Builder setTrafficStatsUid(final int n) {
            return this;
        }
    }
}
