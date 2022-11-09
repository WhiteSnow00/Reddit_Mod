// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import av2.e;
import av2.c;
import av2.o;
import nf2.a;
import com.reddit.data.adapter.BadgeCountEnveloped;
import av2.f;
import com.reddit.domain.model.BadgeCount;
import nf2.c0;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'J\b\u0010\u0007\u001a\u00020\u0006H'J\u0012\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH'¨\u0006\u000b" }, d2 = { "Lcom/reddit/data/remote/RemoteInboxDataSource;", "", "Lnf2/c0;", "Lcom/reddit/domain/model/BadgeCount;", "badgeCount", "anonBadgeCount", "Lnf2/a;", "markInboxAsRead", "", "messageId", "markMessageAsRead", "remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteInboxDataSource
{
    @f("api/logged_out/badge_counts")
    @BadgeCountEnveloped
    c0<BadgeCount> anonBadgeCount();
    
    @f("api/badge_counts")
    @BadgeCountEnveloped
    c0<BadgeCount> badgeCount();
    
    @o("api/read_all_messages")
    a markInboxAsRead();
    
    @e
    @o("api/read_message")
    a markMessageAsRead(@c("id") final String p0);
}
