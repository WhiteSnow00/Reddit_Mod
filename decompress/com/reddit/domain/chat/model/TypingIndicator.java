// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J)\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/chat/model/TypingIndicator;", "Lcom/reddit/domain/chat/model/MessagingItemViewType;", "title", "", "id", "", "type", "Lcom/reddit/domain/chat/model/MessageType;", "(Ljava/lang/String;JLcom/reddit/domain/chat/model/MessageType;)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getType", "()Lcom/reddit/domain/chat/model/MessageType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class TypingIndicator implements MessagingItemViewType
{
    private final long id;
    private String title;
    private final MessageType type;
    
    public TypingIndicator() {
        this(null, 0L, null, 7, null);
    }
    
    public TypingIndicator(final String title, final long id, final MessageType type) {
        f.f((Object)type, "type");
        this.title = title;
        this.id = id;
        this.type = type;
    }
    
    public final String component1() {
        return this.title;
    }
    
    public final long component2() {
        return this.getId();
    }
    
    public final MessageType component3() {
        return this.getType();
    }
    
    public final TypingIndicator copy(final String s, final long n, final MessageType messageType) {
        f.f((Object)messageType, "type");
        return new TypingIndicator(s, n, messageType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TypingIndicator)) {
            return false;
        }
        final TypingIndicator typingIndicator = (TypingIndicator)o;
        return f.a((Object)this.title, (Object)typingIndicator.title) && this.getId() == typingIndicator.getId() && this.getType() == typingIndicator.getType();
    }
    
    public long getId() {
        return this.id;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public MessageType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final String title = this.title;
        int hashCode;
        if (title == null) {
            hashCode = 0;
        }
        else {
            hashCode = title.hashCode();
        }
        return this.getType().hashCode() + (Long.hashCode(this.getId()) + hashCode * 31) * 31;
    }
    
    public final void setTitle(final String title) {
        this.title = title;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("TypingIndicator(title=");
        k.append(this.title);
        k.append(", id=");
        k.append(this.getId());
        k.append(", type=");
        k.append(this.getType());
        k.append(')');
        return k.toString();
    }
}
