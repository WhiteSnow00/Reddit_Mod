// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.events;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0015\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/events/ErrorEvent;", "Lcom/reddit/domain/model/events/BaseEvent;", "requestId", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/String;Ljava/lang/Exception;)V", "getException", "()Ljava/lang/Exception;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public class ErrorEvent extends BaseEvent
{
    private final Exception exception;
    
    public ErrorEvent(final Exception ex) {
        e.f((Object)ex, "exception");
        this(null, ex, 1, null);
    }
    
    public ErrorEvent(final String s, final Exception exception) {
        e.f((Object)exception, "exception");
        super(s);
        this.exception = exception;
    }
    
    public final Exception getException() {
        return this.exception;
    }
}
