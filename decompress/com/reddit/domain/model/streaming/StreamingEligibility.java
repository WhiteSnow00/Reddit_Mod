// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamingEligibility;", "", "()V", "Eligible", "Error", "NotEligible", "Lcom/reddit/domain/model/streaming/StreamingEligibility$Eligible;", "Lcom/reddit/domain/model/streaming/StreamingEligibility$Error;", "Lcom/reddit/domain/model/streaming/StreamingEligibility$NotEligible;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class StreamingEligibility
{
    private StreamingEligibility() {
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamingEligibility$Eligible;", "Lcom/reddit/domain/model/streaming/StreamingEligibility;", "()V", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Eligible extends StreamingEligibility
    {
        public static final Eligible INSTANCE;
        
        static {
            INSTANCE = new Eligible();
        }
        
        private Eligible() {
            super(null);
        }
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamingEligibility$Error;", "Lcom/reddit/domain/model/streaming/StreamingEligibility;", "()V", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Error extends StreamingEligibility
    {
        public static final Error INSTANCE;
        
        static {
            INSTANCE = new Error();
        }
        
        private Error() {
            super(null);
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamingEligibility$NotEligible;", "Lcom/reddit/domain/model/streaming/StreamingEligibility;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class NotEligible extends StreamingEligibility
    {
        private final String message;
        
        public NotEligible(final String message) {
            f.f((Object)message, "message");
            super(null);
            this.message = message;
        }
        
        public final String getMessage() {
            return this.message;
        }
    }
}
