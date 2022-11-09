// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/modtools/ModTriggerType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "USER_REPORTS", "AUTOMOD", "MOD", "ADMIN", "SHADOWBANNED_SUBMITTER", "HATEFUL_CONTENT", "CROWD_CONTROL", "BAN_EVASION", "UNKNOWN", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ModTriggerType
{
    ADMIN("Admin"), 
    AUTOMOD("AutoMod"), 
    BAN_EVASION("Ban Evasion Protection"), 
    CROWD_CONTROL("Crowd Control"), 
    HATEFUL_CONTENT("Automatic Filter"), 
    MOD("Mod"), 
    SHADOWBANNED_SUBMITTER("Shadow Banned Submitter"), 
    UNKNOWN("Unknown"), 
    USER_REPORTS("User Reports");
    
    private final String value;
    
    private ModTriggerType(final String value) {
        this.value = value;
    }
    
    public final String getValue() {
        return this.value;
    }
}
