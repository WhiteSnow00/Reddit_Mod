// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/streaming/ChatState;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NONE", "FULL_SCREEN", "COMPACT", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ChatState
{
    COMPACT("compact"), 
    FULL_SCREEN("full_screen"), 
    NONE("none");
    
    private final String value;
    
    private ChatState(final String value) {
        this.value = value;
    }
    
    public final String getValue() {
        return this.value;
    }
}
