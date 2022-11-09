// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ag0.a;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J7\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\"" }, d2 = { "Lcom/reddit/domain/chat/model/Collapsing;", "Lcom/reddit/domain/chat/model/MessagingItemViewType;", "messages", "", "Lcom/reddit/domain/chat/model/HasUserMessageData;", "authorId", "", "id", "", "type", "Lcom/reddit/domain/chat/model/MessageType;", "(Ljava/util/List;Ljava/lang/String;JLcom/reddit/domain/chat/model/MessageType;)V", "getAuthorId", "()Ljava/lang/String;", "getId", "()J", "getMessages", "()Ljava/util/List;", "setMessages", "(Ljava/util/List;)V", "getType", "()Lcom/reddit/domain/chat/model/MessageType;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Collapsing implements MessagingItemViewType
{
    private final String authorId;
    private final long id;
    private List<? extends HasUserMessageData> messages;
    private final MessageType type;
    
    public Collapsing(final List<? extends HasUserMessageData> messages, final String authorId, final long id, final MessageType type) {
        f.f((Object)messages, "messages");
        f.f((Object)authorId, "authorId");
        f.f((Object)type, "type");
        this.messages = messages;
        this.authorId = authorId;
        this.id = id;
        this.type = type;
    }
    
    public final List<HasUserMessageData> component1() {
        return (List<HasUserMessageData>)this.messages;
    }
    
    public final String component2() {
        return this.authorId;
    }
    
    public final long component3() {
        return this.getId();
    }
    
    public final MessageType component4() {
        return this.getType();
    }
    
    public final Collapsing copy(final List<? extends HasUserMessageData> list, final String s, final long n, final MessageType messageType) {
        f.f((Object)list, "messages");
        f.f((Object)s, "authorId");
        f.f((Object)messageType, "type");
        return new Collapsing(list, s, n, messageType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Collapsing)) {
            return false;
        }
        final Collapsing collapsing = (Collapsing)o;
        return f.a((Object)this.messages, (Object)collapsing.messages) && f.a((Object)this.authorId, (Object)collapsing.authorId) && this.getId() == collapsing.getId() && this.getType() == collapsing.getType();
    }
    
    public final String getAuthorId() {
        return this.authorId;
    }
    
    public long getId() {
        return this.id;
    }
    
    public final List<HasUserMessageData> getMessages() {
        return (List<HasUserMessageData>)this.messages;
    }
    
    public MessageType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return this.getType().hashCode() + (Long.hashCode(this.getId()) + a.f(this.authorId, this.messages.hashCode() * 31, 31)) * 31;
    }
    
    public final void setMessages(final List<? extends HasUserMessageData> messages) {
        f.f((Object)messages, "<set-?>");
        this.messages = messages;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Collapsing(messages=");
        k.append(this.messages);
        k.append(", authorId=");
        k.append(this.authorId);
        k.append(", id=");
        k.append(this.getId());
        k.append(", type=");
        k.append(this.getType());
        k.append(')');
        return k.toString();
    }
}
