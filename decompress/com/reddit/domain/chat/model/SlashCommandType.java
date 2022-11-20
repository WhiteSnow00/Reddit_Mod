// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/SlashCommandType;", "", "(Ljava/lang/String;I)V", "ONE_TO_ONE", "GROUP_CHAT", "GROUP_HOST", "ALL", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum SlashCommandType
{
    private static final SlashCommandType[] $VALUES;
    
    ALL, 
    GROUP_CHAT, 
    GROUP_HOST, 
    ONE_TO_ONE;
    
    private static final SlashCommandType[] $values() {
        return new SlashCommandType[] { SlashCommandType.ONE_TO_ONE, SlashCommandType.GROUP_CHAT, SlashCommandType.GROUP_HOST, SlashCommandType.ALL };
    }
    
    static {
        $VALUES = $values();
    }
}
