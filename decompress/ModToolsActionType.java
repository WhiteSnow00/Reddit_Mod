// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/modtools/ModToolsActionType;", "", "action", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "toString", "TYPE_BAN", "TYPE_MUTE", "TYPE_CONTRIBUTOR", "TYPE_MODERATOR", "TYPE_MODERATOR_INVITE", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ModToolsActionType
{
    TYPE_BAN("banned"), 
    TYPE_CONTRIBUTOR("contributor"), 
    TYPE_MODERATOR("moderator"), 
    TYPE_MODERATOR_INVITE("moderator_invite"), 
    TYPE_MUTE("muted");
    
    private final String action;
    
    private ModToolsActionType(final String action) {
        this.action = action;
    }
    
    public final String getAction() {
        return this.action;
    }
    
    @Override
    public String toString() {
        return this.action;
    }
}
