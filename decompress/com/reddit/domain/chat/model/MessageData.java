// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.sendbird.android.BaseMessage;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/chat/model/MessageData;", "", "message", "Lcom/sendbird/android/BaseMessage;", "getMessage", "()Lcom/sendbird/android/BaseMessage;", "messageId", "", "getMessageId", "()J", "setMessageId", "(J)V", "timestamp", "getTimestamp", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface MessageData
{
    BaseMessage getMessage();
    
    long getMessageId();
    
    long getTimestamp();
    
    void setMessageId(final long p0);
}
