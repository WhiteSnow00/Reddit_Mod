// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/model/QuarantinedCommunityException;", "Lcom/reddit/domain/model/CommunityException;", "exception", "", "quarantineMessageRtJson", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuarantineMessageRtJson", "()Ljava/lang/String;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class QuarantinedCommunityException extends CommunityException
{
    private final String quarantineMessageRtJson;
    
    public QuarantinedCommunityException(final String s, final String quarantineMessageRtJson) {
        e.f((Object)s, "exception");
        super(s);
        this.quarantineMessageRtJson = quarantineMessageRtJson;
    }
    
    public final String getQuarantineMessageRtJson() {
        return this.quarantineMessageRtJson;
    }
}
