// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/chat/model/RecentMessage;", "", "chatId", "Lcom/reddit/domain/chat/model/ChatId;", "author", "", "(Lcom/reddit/domain/chat/model/ChatId;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getChatId", "()Lcom/reddit/domain/chat/model/ChatId;", "Prediction", "Standard", "Lcom/reddit/domain/chat/model/RecentMessage$Prediction;", "Lcom/reddit/domain/chat/model/RecentMessage$Standard;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class RecentMessage
{
    private final String author;
    private final ChatId chatId;
    
    private RecentMessage(final ChatId chatId, final String author) {
        this.chatId = chatId;
        this.author = author;
    }
    
    public RecentMessage(final ChatId chatId, final String s, final DefaultConstructorMarker defaultConstructorMarker) {
        this(chatId, s);
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public ChatId getChatId() {
        return this.chatId;
    }
}
