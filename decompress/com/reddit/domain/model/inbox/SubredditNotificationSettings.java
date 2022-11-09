// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.inbox;

import kotlin.NoWhenBranchMatchedException;
import com.reddit.notification.common.NotificationLevel;
import androidx.appcompat.widget.s0;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/inbox/SubredditNotificationSettings;", "", "subredditKindWithId", "", "isSubredditUpdatesInterestingPostEnabled", "", "isUpdateFromSubredditEnabled", "(Ljava/lang/String;ZZ)V", "()Z", "getSubredditKindWithId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditNotificationSettings
{
    public static final Companion Companion;
    private final boolean isSubredditUpdatesInterestingPostEnabled;
    private final boolean isUpdateFromSubredditEnabled;
    private final String subredditKindWithId;
    
    static {
        Companion = new Companion(null);
    }
    
    public SubredditNotificationSettings(final String subredditKindWithId, final boolean isSubredditUpdatesInterestingPostEnabled, final boolean isUpdateFromSubredditEnabled) {
        f.f((Object)subredditKindWithId, "subredditKindWithId");
        this.subredditKindWithId = subredditKindWithId;
        this.isSubredditUpdatesInterestingPostEnabled = isSubredditUpdatesInterestingPostEnabled;
        this.isUpdateFromSubredditEnabled = isUpdateFromSubredditEnabled;
    }
    
    public final String component1() {
        return this.subredditKindWithId;
    }
    
    public final boolean component2() {
        return this.isSubredditUpdatesInterestingPostEnabled;
    }
    
    public final boolean component3() {
        return this.isUpdateFromSubredditEnabled;
    }
    
    public final SubredditNotificationSettings copy(final String s, final boolean b, final boolean b2) {
        f.f((Object)s, "subredditKindWithId");
        return new SubredditNotificationSettings(s, b, b2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditNotificationSettings)) {
            return false;
        }
        final SubredditNotificationSettings subredditNotificationSettings = (SubredditNotificationSettings)o;
        return f.a((Object)this.subredditKindWithId, (Object)subredditNotificationSettings.subredditKindWithId) && this.isSubredditUpdatesInterestingPostEnabled == subredditNotificationSettings.isSubredditUpdatesInterestingPostEnabled && this.isUpdateFromSubredditEnabled == subredditNotificationSettings.isUpdateFromSubredditEnabled;
    }
    
    public final String getSubredditKindWithId() {
        return this.subredditKindWithId;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.subredditKindWithId.hashCode();
        final int isSubredditUpdatesInterestingPostEnabled = this.isSubredditUpdatesInterestingPostEnabled ? 1 : 0;
        int n = 1;
        int n2 = isSubredditUpdatesInterestingPostEnabled;
        if (isSubredditUpdatesInterestingPostEnabled != 0) {
            n2 = 1;
        }
        final int isUpdateFromSubredditEnabled = this.isUpdateFromSubredditEnabled ? 1 : 0;
        if (isUpdateFromSubredditEnabled == 0) {
            n = isUpdateFromSubredditEnabled;
        }
        return (hashCode * 31 + n2) * 31 + n;
    }
    
    public final boolean isSubredditUpdatesInterestingPostEnabled() {
        return this.isSubredditUpdatesInterestingPostEnabled;
    }
    
    public final boolean isUpdateFromSubredditEnabled() {
        return this.isUpdateFromSubredditEnabled;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditNotificationSettings(subredditKindWithId=");
        k.append(this.subredditKindWithId);
        k.append(", isSubredditUpdatesInterestingPostEnabled=");
        k.append(this.isSubredditUpdatesInterestingPostEnabled);
        k.append(", isUpdateFromSubredditEnabled=");
        return s0.o(k, this.isUpdateFromSubredditEnabled, ')');
    }
    
    @Metadata(d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t" }, d2 = { "Lcom/reddit/domain/model/inbox/SubredditNotificationSettings$Companion;", "", "()V", "fromNotificationLevel", "Lcom/reddit/domain/model/inbox/SubredditNotificationSettings;", "subredditKindWithId", "", "notificationLevel", "Lcom/reddit/notification/common/NotificationLevel;", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final SubredditNotificationSettings fromNotificationLevel(final String s, final NotificationLevel notificationLevel) {
            f.f((Object)s, "subredditKindWithId");
            f.f((Object)notificationLevel, "notificationLevel");
            final int n = WhenMappings.$EnumSwitchMapping$0[((Enum)notificationLevel).ordinal()];
            SubredditNotificationSettings subredditNotificationSettings;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    subredditNotificationSettings = new SubredditNotificationSettings(s, true, true);
                }
                else {
                    subredditNotificationSettings = new SubredditNotificationSettings(s, false, true);
                }
            }
            else {
                subredditNotificationSettings = new SubredditNotificationSettings(s, false, false);
            }
            return subredditNotificationSettings;
        }
    }
}
