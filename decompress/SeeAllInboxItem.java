// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019" }, d2 = { "Lcom/reddit/domain/chat/model/SeeAllInboxItem;", "Lcom/reddit/domain/chat/model/ChatInboxItemType;", "count", "", "id", "", "type", "Lcom/reddit/domain/chat/model/InboxItemType;", "(ILjava/lang/String;Lcom/reddit/domain/chat/model/InboxItemType;)V", "getCount", "()I", "getId", "()Ljava/lang/String;", "getType", "()Lcom/reddit/domain/chat/model/InboxItemType;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SeeAllInboxItem implements ChatInboxItemType
{
    private final int count;
    private final String id;
    private final InboxItemType type;
    
    public SeeAllInboxItem(final int count, final String id, final InboxItemType type) {
        f.f((Object)id, "id");
        f.f((Object)type, "type");
        this.count = count;
        this.id = id;
        this.type = type;
    }
    
    public final int component1() {
        return this.count;
    }
    
    public final String component2() {
        return this.getId();
    }
    
    public final InboxItemType component3() {
        return this.getType();
    }
    
    public final SeeAllInboxItem copy(final int n, final String s, final InboxItemType inboxItemType) {
        f.f((Object)s, "id");
        f.f((Object)inboxItemType, "type");
        return new SeeAllInboxItem(n, s, inboxItemType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SeeAllInboxItem)) {
            return false;
        }
        final SeeAllInboxItem seeAllInboxItem = (SeeAllInboxItem)o;
        return this.count == seeAllInboxItem.count && f.a((Object)this.getId(), (Object)seeAllInboxItem.getId()) && this.getType() == seeAllInboxItem.getType();
    }
    
    public final int getCount() {
        return this.count;
    }
    
    @Override
    public String getId() {
        return this.id;
    }
    
    @Override
    public InboxItemType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        return this.getType().hashCode() + (this.getId().hashCode() + Integer.hashCode(this.count) * 31) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SeeAllInboxItem(count=");
        k.append(this.count);
        k.append(", id=");
        k.append(this.getId());
        k.append(", type=");
        k.append(this.getType());
        k.append(')');
        return k.toString();
    }
}
