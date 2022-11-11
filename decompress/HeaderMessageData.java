// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J-\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/chat/model/HeaderMessageData;", "Lcom/reddit/domain/chat/model/MessagingItemViewType;", "members", "", "Lcom/reddit/domain/chat/model/UserData;", "id", "", "type", "Lcom/reddit/domain/chat/model/MessageType;", "(Ljava/util/List;JLcom/reddit/domain/chat/model/MessageType;)V", "getId", "()J", "getMembers", "()Ljava/util/List;", "setMembers", "(Ljava/util/List;)V", "getType", "()Lcom/reddit/domain/chat/model/MessageType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class HeaderMessageData implements MessagingItemViewType
{
    private final long id;
    private List<UserData> members;
    private final MessageType type;
    
    public HeaderMessageData(final List<UserData> members, final long id, final MessageType type) {
        f.f((Object)members, "members");
        f.f((Object)type, "type");
        this.members = members;
        this.id = id;
        this.type = type;
    }
    
    public HeaderMessageData(List instance, final long n, final MessageType messageType, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x1) != 0x0) {
            instance = EmptyList.INSTANCE;
        }
        this((List<UserData>)instance, n, messageType);
    }
    
    public final List<UserData> component1() {
        return this.members;
    }
    
    public final long component2() {
        return this.getId();
    }
    
    public final MessageType component3() {
        return this.getType();
    }
    
    public final HeaderMessageData copy(final List<UserData> list, final long n, final MessageType messageType) {
        f.f((Object)list, "members");
        f.f((Object)messageType, "type");
        return new HeaderMessageData(list, n, messageType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeaderMessageData)) {
            return false;
        }
        final HeaderMessageData headerMessageData = (HeaderMessageData)o;
        return f.a((Object)this.members, (Object)headerMessageData.members) && this.getId() == headerMessageData.getId() && this.getType() == headerMessageData.getType();
    }
    
    public long getId() {
        return this.id;
    }
    
    public final List<UserData> getMembers() {
        return this.members;
    }
    
    public MessageType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return this.getType().hashCode() + (Long.hashCode(this.getId()) + this.members.hashCode() * 31) * 31;
    }
    
    public final void setMembers(final List<UserData> members) {
        f.f((Object)members, "<set-?>");
        this.members = members;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("HeaderMessageData(members=");
        k.append(this.members);
        k.append(", id=");
        k.append(this.getId());
        k.append(", type=");
        k.append(this.getType());
        k.append(')');
        return k.toString();
    }
}
