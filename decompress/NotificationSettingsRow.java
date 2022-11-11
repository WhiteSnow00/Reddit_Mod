// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.inbox;

import ag0.a;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/inbox/NotificationSettingsRow;", "", "messageType", "", "displayName", "isEnabled", "", "iconName", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getIconName", "()Z", "getMessageType", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NotificationSettingsRow
{
    private final String displayName;
    private final String iconName;
    private final boolean isEnabled;
    private final String messageType;
    
    public NotificationSettingsRow(final String messageType, final String displayName, final boolean isEnabled, final String iconName) {
        f.f((Object)messageType, "messageType");
        f.f((Object)displayName, "displayName");
        this.messageType = messageType;
        this.displayName = displayName;
        this.isEnabled = isEnabled;
        this.iconName = iconName;
    }
    
    public final String component1() {
        return this.messageType;
    }
    
    public final String component2() {
        return this.displayName;
    }
    
    public final boolean component3() {
        return this.isEnabled;
    }
    
    public final String component4() {
        return this.iconName;
    }
    
    public final NotificationSettingsRow copy(final String s, final String s2, final boolean b, final String s3) {
        f.f((Object)s, "messageType");
        f.f((Object)s2, "displayName");
        return new NotificationSettingsRow(s, s2, b, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationSettingsRow)) {
            return false;
        }
        final NotificationSettingsRow notificationSettingsRow = (NotificationSettingsRow)o;
        return f.a((Object)this.messageType, (Object)notificationSettingsRow.messageType) && f.a((Object)this.displayName, (Object)notificationSettingsRow.displayName) && this.isEnabled == notificationSettingsRow.isEnabled && f.a((Object)this.iconName, (Object)notificationSettingsRow.iconName);
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getIconName() {
        return this.iconName;
    }
    
    public final String getMessageType() {
        return this.messageType;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.displayName, this.messageType.hashCode() * 31, 31);
        int isEnabled;
        if ((isEnabled = (this.isEnabled ? 1 : 0)) != 0) {
            isEnabled = 1;
        }
        final String iconName = this.iconName;
        int hashCode;
        if (iconName == null) {
            hashCode = 0;
        }
        else {
            hashCode = iconName.hashCode();
        }
        return (f + isEnabled) * 31 + hashCode;
    }
    
    public final boolean isEnabled() {
        return this.isEnabled;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("NotificationSettingsRow(messageType=");
        k.append(this.messageType);
        k.append(", displayName=");
        k.append(this.displayName);
        k.append(", isEnabled=");
        k.append(this.isEnabled);
        k.append(", iconName=");
        return b.k(k, this.iconName, ')');
    }
}
