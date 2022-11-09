// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import ak0.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.reddit.domain.model.notifications.FeedNotification;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\r¨\u0006\"" }, d2 = { "Lcom/reddit/domain/model/NotificationUnitFeedElement;", "Lcom/reddit/domain/model/ILink;", "id", "", "notifications", "", "Lcom/reddit/domain/model/notifications/FeedNotification;", "(Ljava/lang/String;Ljava/util/List;)V", "createdUtc", "", "getCreatedUtc", "()J", "getId", "()Ljava/lang/String;", "isBlankAd", "", "()Z", "kindWithId", "getKindWithId", "getNotifications", "()Ljava/util/List;", "promoted", "getPromoted", "uniqueId", "getUniqueId", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NotificationUnitFeedElement extends ILink
{
    private final long createdUtc;
    private final String id;
    private final boolean isBlankAd;
    private final String kindWithId;
    private final List<FeedNotification> notifications;
    private final boolean promoted;
    private final String uniqueId;
    
    public NotificationUnitFeedElement(final String id, final List<FeedNotification> notifications) {
        f.f((Object)id, "id");
        f.f((Object)notifications, "notifications");
        super((DefaultConstructorMarker)null);
        this.id = id;
        this.notifications = notifications;
        final StringBuilder k = a.k("feed_notification_unit_");
        k.append(this.getId());
        this.kindWithId = k.toString();
        this.uniqueId = this.getId();
    }
    
    public final String component1() {
        return this.getId();
    }
    
    public final List<FeedNotification> component2() {
        return this.notifications;
    }
    
    public final NotificationUnitFeedElement copy(final String s, final List<FeedNotification> list) {
        f.f((Object)s, "id");
        f.f((Object)list, "notifications");
        return new NotificationUnitFeedElement(s, list);
    }
    
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationUnitFeedElement)) {
            return false;
        }
        final NotificationUnitFeedElement notificationUnitFeedElement = (NotificationUnitFeedElement)o;
        return f.a((Object)this.getId(), (Object)notificationUnitFeedElement.getId()) && f.a((Object)this.notifications, (Object)notificationUnitFeedElement.notifications);
    }
    
    public long getCreatedUtc() {
        return this.createdUtc;
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getKindWithId() {
        return this.kindWithId;
    }
    
    public final List<FeedNotification> getNotifications() {
        return this.notifications;
    }
    
    public boolean getPromoted() {
        return this.promoted;
    }
    
    public String getUniqueId() {
        return this.uniqueId;
    }
    
    public int hashCode() {
        return this.notifications.hashCode() + this.getId().hashCode() * 31;
    }
    
    public boolean isBlankAd() {
        return this.isBlankAd;
    }
    
    public String toString() {
        final StringBuilder k = a.k("NotificationUnitFeedElement(id=");
        k.append(this.getId());
        k.append(", notifications=");
        return m.n(k, (List)this.notifications, ')');
    }
}
