// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\n\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/chat/model/SlashCommandAction;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "Gif", "Invite", "Kick", "Leave", "Members", "Mute", "NewChat", "Snoomoji", "TextEmoji", "Unmute", "Lcom/reddit/domain/chat/model/SlashCommandAction$Gif;", "Lcom/reddit/domain/chat/model/SlashCommandAction$Invite;", "Lcom/reddit/domain/chat/model/SlashCommandAction$Kick;", "Lcom/reddit/domain/chat/model/SlashCommandAction$Leave;", "Lcom/reddit/domain/chat/model/SlashCommandAction$Members;", "Lcom/reddit/domain/chat/model/SlashCommandAction$Mute;", "Lcom/reddit/domain/chat/model/SlashCommandAction$NewChat;", "Lcom/reddit/domain/chat/model/SlashCommandAction$Snoomoji;", "Lcom/reddit/domain/chat/model/SlashCommandAction$TextEmoji;", "Lcom/reddit/domain/chat/model/SlashCommandAction$Unmute;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class SlashCommandAction
{
    private final String id;
    
    private SlashCommandAction(final String id) {
        this.id = id;
    }
    
    public SlashCommandAction(final String s, final DefaultConstructorMarker defaultConstructorMarker) {
        this(s);
    }
    
    public final String getId() {
        return this.id;
    }
}
