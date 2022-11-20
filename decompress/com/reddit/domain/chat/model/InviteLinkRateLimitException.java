// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ng2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/chat/model/InviteLinkRateLimitException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class InviteLinkRateLimitException extends Exception
{
    public InviteLinkRateLimitException(final String s) {
        e.f((Object)s, "message");
        super(s);
    }
}
