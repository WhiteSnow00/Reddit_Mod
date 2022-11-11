// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\t" }, d2 = { "Lcom/reddit/domain/chat/model/ChatMessageCustomType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AWARDING", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ChatMessageCustomType
{
    AWARDING("awarding");
    
    public static final Companion Companion;
    private final String value;
    
    static {
        Companion = new Companion(null);
    }
    
    private ChatMessageCustomType(final String value) {
        this.value = value;
    }
    
    public static final ChatMessageCustomType toEnum(final String s) {
        return ChatMessageCustomType.Companion.toEnum(s);
    }
    
    public final String getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/ChatMessageCustomType$Companion;", "", "()V", "toEnum", "Lcom/reddit/domain/chat/model/ChatMessageCustomType;", "value", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final ChatMessageCustomType toEnum(final String s) {
            for (final ChatMessageCustomType chatMessageCustomType : ChatMessageCustomType.values()) {
                if (e.a((Object)chatMessageCustomType.getValue(), (Object)s)) {
                    return chatMessageCustomType;
                }
            }
            return null;
        }
    }
}
