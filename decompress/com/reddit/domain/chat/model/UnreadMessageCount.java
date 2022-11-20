// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/chat/model/UnreadMessageCount;", "", "unreadCount", "", "(I)V", "getUnreadCount", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class UnreadMessageCount
{
    private final int unreadCount;
    
    public UnreadMessageCount(@n(name = "unread_count") final int unreadCount) {
        this.unreadCount = unreadCount;
    }
    
    public static UnreadMessageCount copy$default(final UnreadMessageCount unreadMessageCount, int unreadCount, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            unreadCount = unreadMessageCount.unreadCount;
        }
        return unreadMessageCount.copy(unreadCount);
    }
    
    public final int component1() {
        return this.unreadCount;
    }
    
    public final UnreadMessageCount copy(@n(name = "unread_count") final int n) {
        return new UnreadMessageCount(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof UnreadMessageCount && this.unreadCount == ((UnreadMessageCount)o).unreadCount);
    }
    
    public final int getUnreadCount() {
        return this.unreadCount;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(this.unreadCount);
    }
    
    @Override
    public String toString() {
        return d.j(a.t("UnreadMessageCount(unreadCount="), this.unreadCount, ')');
    }
}
