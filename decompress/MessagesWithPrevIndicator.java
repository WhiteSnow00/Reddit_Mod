// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f" }, d2 = { "Lcom/reddit/domain/chat/model/MessagesWithPrevIndicator;", "Lcom/reddit/domain/chat/model/Messages;", "messages", "", "Lcom/reddit/domain/chat/model/HasMessageData;", "hasPrev", "", "(Ljava/util/List;Z)V", "getHasPrev", "()Z", "getMessages", "()Ljava/util/List;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MessagesWithPrevIndicator implements Messages
{
    private final boolean hasPrev;
    private final List<HasMessageData> messages;
    
    public MessagesWithPrevIndicator(final List<? extends HasMessageData> messages, final boolean hasPrev) {
        f.f((Object)messages, "messages");
        this.messages = (List<HasMessageData>)messages;
        this.hasPrev = hasPrev;
    }
    
    public final boolean getHasPrev() {
        return this.hasPrev;
    }
    
    public final List<HasMessageData> getMessages() {
        return this.messages;
    }
}
