// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.room.model;

import kotlin.Metadata;
import androidx.viewpager.widget.c;
import ah2.f;

public final class SubredditTriggeredInviteDataModel
{
    public final String a;
    public final Status b;
    public final long c;
    
    public SubredditTriggeredInviteDataModel(final String a, final Status b, final long c) {
        f.f((Object)a, "subredditName");
        f.f((Object)b, "status");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static SubredditTriggeredInviteDataModel a(final SubredditTriggeredInviteDataModel subredditTriggeredInviteDataModel, final Status status) {
        final String a = subredditTriggeredInviteDataModel.a;
        final long c = subredditTriggeredInviteDataModel.c;
        f.f((Object)a, "subredditName");
        f.f((Object)status, "status");
        return new SubredditTriggeredInviteDataModel(a, status, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditTriggeredInviteDataModel)) {
            return false;
        }
        final SubredditTriggeredInviteDataModel subredditTriggeredInviteDataModel = (SubredditTriggeredInviteDataModel)o;
        return f.a((Object)this.a, (Object)subredditTriggeredInviteDataModel.a) && this.b == subredditTriggeredInviteDataModel.b && this.c == subredditTriggeredInviteDataModel.c;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SubredditTriggeredInviteDataModel(subredditName=");
        k.append(this.a);
        k.append(", status=");
        k.append(this.b);
        k.append(", shownUtc=");
        return androidx.viewpager.widget.c.k(k, this.c, ')');
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/data/room/model/SubredditTriggeredInviteDataModel$Status;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "ACCEPTED", "REJECTED", "db_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Status
    {
        ACCEPTED, 
        REJECTED, 
        UNKNOWN;
    }
}
