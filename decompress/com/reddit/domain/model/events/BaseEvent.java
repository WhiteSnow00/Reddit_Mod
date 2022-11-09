// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/events/BaseEvent;", "", "requestId", "", "(Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public class BaseEvent
{
    private final String requestId;
    
    public BaseEvent() {
        this(null, 1, null);
    }
    
    public BaseEvent(final String requestId) {
        this.requestId = requestId;
    }
    
    public final String getRequestId() {
        return this.requestId;
    }
}
