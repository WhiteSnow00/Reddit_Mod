// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0012\u001a\u00020\u0003R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013" }, d2 = { "Lcom/reddit/domain/model/InboxCount;", "", "notificationCount", "", "trendingNotificationCount", "messageCount", "modMailCount", "(IIII)V", "getMessageCount", "()I", "setMessageCount", "(I)V", "getModMailCount", "setModMailCount", "getNotificationCount", "setNotificationCount", "getTrendingNotificationCount", "setTrendingNotificationCount", "getInboxCount", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class InboxCount
{
    private int messageCount;
    private int modMailCount;
    private int notificationCount;
    private int trendingNotificationCount;
    
    public InboxCount(final int notificationCount, final int trendingNotificationCount, final int messageCount, final int modMailCount) {
        this.notificationCount = notificationCount;
        this.trendingNotificationCount = trendingNotificationCount;
        this.messageCount = messageCount;
        this.modMailCount = modMailCount;
    }
    
    public final int getInboxCount() {
        return this.notificationCount + this.trendingNotificationCount + this.messageCount + this.modMailCount;
    }
    
    public final int getMessageCount() {
        return this.messageCount;
    }
    
    public final int getModMailCount() {
        return this.modMailCount;
    }
    
    public final int getNotificationCount() {
        return this.notificationCount;
    }
    
    public final int getTrendingNotificationCount() {
        return this.trendingNotificationCount;
    }
    
    public final void setMessageCount(final int messageCount) {
        this.messageCount = messageCount;
    }
    
    public final void setModMailCount(final int modMailCount) {
        this.modMailCount = modMailCount;
    }
    
    public final void setNotificationCount(final int notificationCount) {
        this.notificationCount = notificationCount;
    }
    
    public final void setTrendingNotificationCount(final int trendingNotificationCount) {
        this.trendingNotificationCount = trendingNotificationCount;
    }
}
