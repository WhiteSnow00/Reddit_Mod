// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/chat/model/MessagesWithIndicators;", "Lcom/reddit/domain/chat/model/Messages;", "messages", "", "Lcom/reddit/domain/chat/model/HasMessageData;", "hasPrev", "", "hasNext", "(Ljava/util/List;ZZ)V", "getHasNext", "()Z", "getHasPrev", "getMessages", "()Ljava/util/List;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class MessagesWithIndicators implements Messages
{
    private final boolean hasNext;
    private final boolean hasPrev;
    private final List<HasMessageData> messages;
    
    public MessagesWithIndicators(final List<? extends HasMessageData> messages, final boolean hasPrev, final boolean hasNext) {
        f.f((Object)messages, "messages");
        this.messages = (List<HasMessageData>)messages;
        this.hasPrev = hasPrev;
        this.hasNext = hasNext;
    }
    
    public final boolean getHasNext() {
        return this.hasNext;
    }
    
    public final boolean getHasPrev() {
        return this.hasPrev;
    }
    
    public final List<HasMessageData> getMessages() {
        return this.messages;
    }
}
