// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.events;

import com.reddit.domain.model.SubmitResponse;
import com.reddit.domain.model.PostSubmitValidationErrors;
import com.reddit.domain.model.SubmitCrosspostResponse;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0005¢\u0006\u0002\u0010\u0002¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents;", "", "()V", "LegacySubmitVideoResultEvent", "SubmitCancelEvent", "SubmitCrosspostResultEvent", "SubmitErrorEvent", "SubmitImageResultEvent", "SubmitResultEvent", "SubmitVideoResultEvent", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubmitEvents
{
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$LegacySubmitVideoResultEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "(Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class LegacySubmitVideoResultEvent extends BaseEvent
    {
        public LegacySubmitVideoResultEvent(final String s) {
            super(s);
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$SubmitCancelEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "(Ljava/lang/String;)V", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubmitCancelEvent extends BaseEvent
    {
        public SubmitCancelEvent(final String s) {
            f.f((Object)s, "requestId");
            super(s);
        }
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$SubmitCrosspostResultEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "response", "Lcom/reddit/domain/model/SubmitCrosspostResponse;", "(Ljava/lang/String;Lcom/reddit/domain/model/SubmitCrosspostResponse;)V", "getResponse", "()Lcom/reddit/domain/model/SubmitCrosspostResponse;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubmitCrosspostResultEvent extends BaseEvent
    {
        private final SubmitCrosspostResponse response;
        
        public SubmitCrosspostResultEvent(final String s, final SubmitCrosspostResponse response) {
            f.f((Object)s, "requestId");
            f.f((Object)response, "response");
            super(s);
            this.response = response;
        }
        
        public final SubmitCrosspostResponse getResponse() {
            return this.response;
        }
    }
    
    @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$SubmitErrorEvent;", "Lcom/reddit/domain/model/events/ErrorEvent;", "requestId", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "ErrorResponseException", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubmitErrorEvent extends ErrorEvent
    {
        public SubmitErrorEvent(final String s, final Exception ex) {
            f.f((Object)ex, "exception");
            super(s, ex);
        }
        
        @Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$SubmitErrorEvent$ErrorResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "firstErrorMessage", "", "validationErrors", "Lcom/reddit/domain/model/PostSubmitValidationErrors;", "(Ljava/lang/String;Lcom/reddit/domain/model/PostSubmitValidationErrors;)V", "getValidationErrors", "()Lcom/reddit/domain/model/PostSubmitValidationErrors;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
        public static final class ErrorResponseException extends Exception
        {
            private final PostSubmitValidationErrors validationErrors;
            
            public ErrorResponseException(final String s, final PostSubmitValidationErrors validationErrors) {
                f.f((Object)validationErrors, "validationErrors");
                super(s);
                this.validationErrors = validationErrors;
            }
            
            public final PostSubmitValidationErrors getValidationErrors() {
                return this.validationErrors;
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$SubmitImageResultEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "linkId", "(Ljava/lang/String;Ljava/lang/String;)V", "getLinkId", "()Ljava/lang/String;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubmitImageResultEvent extends BaseEvent
    {
        private final String linkId;
        
        public SubmitImageResultEvent(final String s, final String linkId) {
            f.f((Object)linkId, "linkId");
            super(s);
            this.linkId = linkId;
        }
        
        public final String getLinkId() {
            return this.linkId;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$SubmitResultEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "response", "Lcom/reddit/domain/model/SubmitResponse;", "subreddit", "(Ljava/lang/String;Lcom/reddit/domain/model/SubmitResponse;Ljava/lang/String;)V", "getResponse", "()Lcom/reddit/domain/model/SubmitResponse;", "getSubreddit", "()Ljava/lang/String;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubmitResultEvent extends BaseEvent
    {
        private final SubmitResponse response;
        private final String subreddit;
        
        public SubmitResultEvent(final String s, final SubmitResponse response, final String subreddit) {
            super(s);
            this.response = response;
            this.subreddit = subreddit;
        }
        
        public final SubmitResponse getResponse() {
            return this.response;
        }
        
        public final String getSubreddit() {
            return this.subreddit;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/events/SubmitEvents$SubmitVideoResultEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "subreddit", "linkId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLinkId", "()Ljava/lang/String;", "getSubreddit", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class SubmitVideoResultEvent extends BaseEvent
    {
        private final String linkId;
        private final String subreddit;
        
        public SubmitVideoResultEvent(final String s, final String subreddit, final String linkId) {
            f.f((Object)subreddit, "subreddit");
            f.f((Object)linkId, "linkId");
            super(s);
            this.subreddit = subreddit;
            this.linkId = linkId;
        }
        
        public final String getLinkId() {
            return this.linkId;
        }
        
        public final String getSubreddit() {
            return this.subreddit;
        }
    }
}
