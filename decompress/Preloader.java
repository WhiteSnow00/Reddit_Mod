// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b" }, d2 = { "Lcom/reddit/domain/chat/model/Preloader;", "Lcom/reddit/domain/chat/model/MessagingItemViewType;", "isLoading", "", "id", "", "type", "Lcom/reddit/domain/chat/model/MessageType;", "(ZJLcom/reddit/domain/chat/model/MessageType;)V", "getId", "()J", "()Z", "setLoading", "(Z)V", "getType", "()Lcom/reddit/domain/chat/model/MessageType;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Preloader implements MessagingItemViewType
{
    private final long id;
    private boolean isLoading;
    private final MessageType type;
    
    public Preloader(final boolean isLoading, final long id, final MessageType type) {
        f.f((Object)type, "type");
        this.isLoading = isLoading;
        this.id = id;
        this.type = type;
    }
    
    public final boolean component1() {
        return this.isLoading;
    }
    
    public final long component2() {
        return this.getId();
    }
    
    public final MessageType component3() {
        return this.getType();
    }
    
    public final Preloader copy(final boolean b, final long n, final MessageType messageType) {
        f.f((Object)messageType, "type");
        return new Preloader(b, n, messageType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Preloader)) {
            return false;
        }
        final Preloader preloader = (Preloader)o;
        return this.isLoading == preloader.isLoading && this.getId() == preloader.getId() && this.getType() == preloader.getType();
    }
    
    public long getId() {
        return this.id;
    }
    
    public MessageType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        int isLoading;
        if ((isLoading = (this.isLoading ? 1 : 0)) != 0) {
            isLoading = 1;
        }
        return this.getType().hashCode() + (Long.hashCode(this.getId()) + isLoading * 31) * 31;
    }
    
    public final boolean isLoading() {
        return this.isLoading;
    }
    
    public final void setLoading(final boolean isLoading) {
        this.isLoading = isLoading;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Preloader(isLoading=");
        k.append(this.isLoading);
        k.append(", id=");
        k.append(this.getId());
        k.append(", type=");
        k.append(this.getType());
        k.append(')');
        return k.toString();
    }
}
