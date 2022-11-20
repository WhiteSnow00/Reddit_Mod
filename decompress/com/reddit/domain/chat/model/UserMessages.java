// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.sendbird.android.BaseMessage;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/chat/model/UserMessages;", "", "()V", "messages", "", "Lcom/sendbird/android/BaseMessage;", "getMessages", "()Ljava/util/List;", "Lcom/reddit/domain/chat/model/UserMessagesWithIndicators;", "Lcom/reddit/domain/chat/model/UserMessagesWithNextIndicator;", "Lcom/reddit/domain/chat/model/UserMessagesWithPrevIndicator;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class UserMessages
{
    private UserMessages() {
    }
    
    public UserMessages(final DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
    
    public abstract List<BaseMessage> getMessages();
}
