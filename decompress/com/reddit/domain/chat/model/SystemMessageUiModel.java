// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.sendbird.android.BaseMessage;
import ah2.f;
import com.sendbird.android.h;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#" }, d2 = { "Lcom/reddit/domain/chat/model/SystemMessageUiModel;", "Lcom/reddit/domain/chat/model/MessageData;", "", "component1", "", "component2", "component3", "Lcom/sendbird/android/h;", "component4", "messageText", "messageId", "timestamp", "message", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getMessageText", "()Ljava/lang/String;", "J", "getMessageId", "()J", "setMessageId", "(J)V", "getTimestamp", "Lcom/sendbird/android/h;", "getMessage", "()Lcom/sendbird/android/h;", "<init>", "(Ljava/lang/String;JJLcom/sendbird/android/h;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SystemMessageUiModel implements MessageData
{
    private final h message;
    private long messageId;
    private final String messageText;
    private final long timestamp;
    
    public SystemMessageUiModel(final String messageText, final long messageId, final long timestamp, final h message) {
        f.f((Object)messageText, "messageText");
        f.f((Object)message, "message");
        this.messageText = messageText;
        this.messageId = messageId;
        this.timestamp = timestamp;
        this.message = message;
    }
    
    public final String component1() {
        return this.messageText;
    }
    
    public final long component2() {
        return this.getMessageId();
    }
    
    public final long component3() {
        return this.getTimestamp();
    }
    
    public final h component4() {
        return this.getMessage();
    }
    
    public final SystemMessageUiModel copy(final String s, final long n, final long n2, final h h) {
        f.f((Object)s, "messageText");
        f.f((Object)h, "message");
        return new SystemMessageUiModel(s, n, n2, h);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SystemMessageUiModel)) {
            return false;
        }
        final SystemMessageUiModel systemMessageUiModel = (SystemMessageUiModel)o;
        return f.a((Object)this.messageText, (Object)systemMessageUiModel.messageText) && this.getMessageId() == systemMessageUiModel.getMessageId() && this.getTimestamp() == systemMessageUiModel.getTimestamp() && f.a((Object)this.getMessage(), (Object)systemMessageUiModel.getMessage());
    }
    
    public h getMessage() {
        return this.message;
    }
    
    public long getMessageId() {
        return this.messageId;
    }
    
    public final String getMessageText() {
        return this.messageText;
    }
    
    public long getTimestamp() {
        return this.timestamp;
    }
    
    @Override
    public int hashCode() {
        return ((BaseMessage)this.getMessage()).hashCode() + (Long.hashCode(this.getTimestamp()) + (Long.hashCode(this.getMessageId()) + this.messageText.hashCode() * 31) * 31) * 31;
    }
    
    public void setMessageId(final long messageId) {
        this.messageId = messageId;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SystemMessageUiModel(messageText=");
        k.append(this.messageText);
        k.append(", messageId=");
        k.append(this.getMessageId());
        k.append(", timestamp=");
        k.append(this.getTimestamp());
        k.append(", message=");
        k.append(this.getMessage());
        k.append(')');
        return k.toString();
    }
}
