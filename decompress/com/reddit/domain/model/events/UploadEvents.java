// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.events;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/events/UploadEvents;", "", "()V", "UploadErrorEvent", "UploadSuccessEvent", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UploadEvents
{
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/model/events/UploadEvents$UploadErrorEvent;", "Lcom/reddit/domain/model/events/ErrorEvent;", "requestId", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class UploadErrorEvent extends ErrorEvent
    {
        public UploadErrorEvent(final String s, final Exception ex) {
            f.f((Object)ex, "exception");
            super(s, ex);
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/events/UploadEvents$UploadSuccessEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "url", "mediaKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMediaKey", "()Ljava/lang/String;", "getUrl", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class UploadSuccessEvent extends BaseEvent
    {
        private final String mediaKey;
        private final String url;
        
        public UploadSuccessEvent(final String s, final String url, final String mediaKey) {
            f.f((Object)url, "url");
            super(s);
            this.url = url;
            this.mediaKey = mediaKey;
        }
        
        public final String getMediaKey() {
            return this.mediaKey;
        }
        
        public final String getUrl() {
            return this.url;
        }
    }
}
