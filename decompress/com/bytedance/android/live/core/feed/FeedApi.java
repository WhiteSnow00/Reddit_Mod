// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.core.feed;

import X.7B9;
import X.0yd;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;
import X.0z3;
import X.FBF;
import X.7Ay;
import X.5zK;
import com.bytedance.covode.number.Covode;

public interface FeedApi
{
    default static {
        Covode.recordClassIndex(5769);
    }
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2);
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2, @7Ay(LIZ = "is_draw") final long p3, @7Ay(LIZ = "draw_room_id") final long p4, @7Ay(LIZ = "draw_room_owner_id") final long p5);
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2, @7Ay(LIZ = "ec_template_id") final String p3);
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2, @7Ay(LIZ = "channel_id") final String p3, @7Ay(LIZ = "is_draw") final long p4, @7Ay(LIZ = "draw_room_id") final long p5, @7Ay(LIZ = "draw_room_owner_id") final long p6);
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2, @7Ay(LIZ = "channel_id") final String p3, @7Ay(LIZ = "is_draw") final long p4, @7Ay(LIZ = "draw_room_id") final long p5, @7Ay(LIZ = "draw_room_owner_id") final long p6, @7Ay(LIZ = "session_refresh_index") final int p7, @7Ay(LIZ = "session_id") final long p8);
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2, @7Ay(LIZ = "channel_id") final String p3, @7Ay(LIZ = "is_draw") final long p4, @7Ay(LIZ = "draw_room_id") final long p5, @7Ay(LIZ = "draw_room_owner_id") final long p6, @7Ay(LIZ = "enter_source") final String p7);
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2, @7Ay(LIZ = "channel_id") final String p3, @7Ay(LIZ = "is_draw") final long p4, @7Ay(LIZ = "draw_room_id") final long p5, @7Ay(LIZ = "draw_room_owner_id") final long p6, @7Ay(LIZ = "ec_template_id") final String p7, @7Ay(LIZ = "ec_top_author") final Long p8, @7Ay(LIZ = "refresh_session_index") final int p9);
    
    @0yd(LIZ = 0yd.a.FEED)
    @7B9
    FBF<0z3<FeedItem, FeedExtra>> feed(@5zK final String p0, @7Ay(LIZ = "max_time") final long p1, @7Ay(LIZ = "req_from") final String p2, @7Ay(LIZ = "channel_id") final String p3, @7Ay(LIZ = "draw_room_id") final String p4, @7Ay(LIZ = "draw_room_owner_id") final String p5, @7Ay(LIZ = "hashtag_id") final long p6, @7Ay(LIZ = "style") final long p7);
}
