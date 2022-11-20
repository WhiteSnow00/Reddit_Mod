// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/chat/model/UserStatus;", "", "(Ljava/lang/String;I)V", "YOU", "CONTACT", "ALREADY_IN_CHANNEL", "EXISTENT", "VERIFICATION", "NONEXISTENT", "NOT_VERIFIED", "NOT_ACCEPT_CHAT", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum UserStatus
{
    private static final UserStatus[] $VALUES;
    
    ALREADY_IN_CHANNEL, 
    CONTACT, 
    EXISTENT, 
    NONEXISTENT, 
    NOT_ACCEPT_CHAT, 
    NOT_VERIFIED, 
    VERIFICATION, 
    YOU;
    
    private static final UserStatus[] $values() {
        return new UserStatus[] { UserStatus.YOU, UserStatus.CONTACT, UserStatus.ALREADY_IN_CHANNEL, UserStatus.EXISTENT, UserStatus.VERIFICATION, UserStatus.NONEXISTENT, UserStatus.NOT_VERIFIED, UserStatus.NOT_ACCEPT_CHAT };
    }
    
    static {
        $VALUES = $values();
    }
}
