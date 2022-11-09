// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/ChatMessageData;", "", "v1", "Lcom/reddit/domain/chat/model/MessageV1;", "(Lcom/reddit/domain/chat/model/MessageV1;)V", "getV1", "()Lcom/reddit/domain/chat/model/MessageV1;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChatMessageData
{
    private final MessageV1 v1;
    
    public ChatMessageData(final MessageV1 v1) {
        f.f((Object)v1, "v1");
        this.v1 = v1;
    }
    
    public final MessageV1 getV1() {
        return this.v1;
    }
}
