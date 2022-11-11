// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.remote.api;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import X.7BB;
import X.5zP;
import X.7Aw;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult;
import com.bytedance.android.livesdk.chatroom.interact.model.AutoMatchResp$ResponseData;
import com.bytedance.android.livesdk.model.CohostInviteExtra;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInviteResult;
import X.0z4;
import com.bytedance.android.livesdk.chatroom.interact.model.MgetPullStreamInfosResponse$ResponseData;
import webcast.api.linkmic.GetUserLinkmicStatusResponse$ResponseData;
import X.0yd;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkGetSettingResult;
import X.FBF;
import X.5zS;
import java.util.Map;
import X.7B9;
import X.1dl;
import X.FAE;
import X.7Ay;
import com.bytedance.covode.number.Covode;

public interface CoHostApi
{
    default static {
        Covode.recordClassIndex(7378);
    }
    
    @7B9(LIZ = "/webcast/linkmic/cancel/")
    FAE<1dl<Void>> cancel(@7Ay(LIZ = "channel_id") final long p0, @7Ay(LIZ = "room_id") final long p1, @7Ay(LIZ = "to_room_id") final long p2, @7Ay(LIZ = "to_user_id") final long p3, @7Ay(LIZ = "sec_to_user_id") final String p4, @7Ay(LIZ = "cancel_reason") final String p5, @7Ay(LIZ = "transparent_extra") final String p6);
    
    @7B9(LIZ = "/webcast/linkmic/finish/")
    FAE<1dl<Void>> finishV3(@7Ay(LIZ = "channel_id") final long p0, @7Ay(LIZ = "transparent_extra") final String p1);
    
    @7B9(LIZ = "/webcast/linkmic/finish/")
    FAE<1dl<Void>> finishV3(@7Ay(LIZ = "channel_id") final long p0, @7Ay(LIZ = "transparent_extra") final String p1, @7Ay(LIZ = "not_suggest_to_uid") final long p2);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/linkmic/get_settings/")
    FBF<1dl<LinkGetSettingResult>> getAnchorLinkMicUserSetting(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "sec_user_id") final String p1, @5zS final Map<String, String> p2);
    
    @7B9(LIZ = "/webcast/linkmic/get_user_linkmic_status/")
    FAE<1dl<GetUserLinkmicStatusResponse$ResponseData>> getLinkMicUserStatus(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "to_user_id") final long p1, @7Ay(LIZ = "to_room_id") final long p2);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/linkmic/mget_pull_stream_infos/")
    FBF<1dl<MgetPullStreamInfosResponse$ResponseData>> getPullStreamInfoByRoomIds(@7Ay(LIZ = "room_ids") final String p0);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/linkmic/invite/")
    FAE<0z4<LinkInviteResult, CohostInviteExtra>> invite(@7Ay(LIZ = "vendor") final int p0, @7Ay(LIZ = "to_room_id") final long p1, @7Ay(LIZ = "to_user_id") final long p2, @7Ay(LIZ = "sec_to_user_id") final String p3, @7Ay(LIZ = "room_id") final long p4, @7Ay(LIZ = "invite_type") final int p5, @7Ay(LIZ = "match_type") final int p6, @7Ay(LIZ = "effective_seconds") final int p7, @7Ay(LIZ = "check_perception_center") final boolean p8, @7Ay(LIZ = "tag_type") final int p9, @7Ay(LIZ = "tag_value") final String p10);
    
    @7B9(LIZ = "/webcast/linkmic/join_channel/")
    FAE<1dl<Void>> joinChannelV3(@7Ay(LIZ = "channel_id") final long p0, @7Ay(LIZ = "transparent_extra") final String p1);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/linkmic_match/auto_match/")
    FBF<1dl<AutoMatchResp$ResponseData>> randomLinkMicAutoMatch(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "user_id") final long p1, @7Ay(LIZ = "sec_user_id") final String p2, @7Ay(LIZ = "tz_name") final String p3, @7Ay(LIZ = "tz_offset") final int p4);
    
    @7B9(LIZ = "/webcast/linkmic_match/cancel_match/")
    FBF<1dl<Void>> randomLinkMicCancelMatch(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "user_id") final long p1, @7Ay(LIZ = "sec_user_id") final String p2);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/linkmic/reply/")
    FAE<1dl<LinkReplyResult>> reply(@7Ay(LIZ = "channel_id") final long p0, @7Ay(LIZ = "room_id") final long p1, @7Ay(LIZ = "reply_status") final int p2, @7Ay(LIZ = "invite_user_id") final long p3, @7Ay(LIZ = "transparent_extra") final String p4);
    
    @5zP
    @7BB(LIZ = "/webcast/linkmic/feedback/")
    FBF<1dl<Void>> reportBroadcasterLinkIssue(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "channel_id") final long p1, @7Ay(LIZ = "anchor_id") final long p2, @7Aw(LIZ = "sec_anchor_id") final String p3, @7Ay(LIZ = "to_user_id") final long p4, @7Aw(LIZ = "sec_to_user_id") final String p5, @7Aw(LIZ = "scene") final String p6, @7Aw(LIZ = "vendor") final int p7, @7Aw(LIZ = "issue_category") final String p8, @7Aw(LIZ = "issue_content") final String p9, @7Aw(LIZ = "err_code") final long p10, @7Aw(LIZ = "extra_str") final String p11);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/linkmic/rivals/")
    FBF<0z4<RivalsListsData, RivalsListExtra>> rivalsList(@7Ay(LIZ = "rivals_type") final int p0, @7Ay(LIZ = "room_id") final long p1, @7Ay(LIZ = "tz_name") final String p2, @7Ay(LIZ = "tz_offset") final int p3, @7Ay(LIZ = "top_living_friend_uid") final long p4, @5zS final Map<String, String> p5);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7B9(LIZ = "/webcast/linkmic/rivals/")
    FBF<0z4<RivalsListsData, RivalsListExtra>> rivalsListForMultiCoHost(@7Ay(LIZ = "rivals_type") final int p0, @7Ay(LIZ = "room_id") final long p1, @7Ay(LIZ = "scene") final int p2, @7Ay(LIZ = "tz_name") final String p3, @7Ay(LIZ = "tz_offset") final int p4, @7Ay(LIZ = "top_living_friend_uid") final long p5, @5zS final Map<String, String> p6);
    
    @7B9(LIZ = "/webcast/linkmic/send_signal/")
    FAE<1dl<Void>> sendSignalV3(@7Ay(LIZ = "channel_id") final long p0, @7Ay(LIZ = "content") final String p1, @7Ay(LIZ = "to_user_ids") final long[] p2);
    
    @5zP
    @7BB(LIZ = "/webcast/linkmic/update_settings/")
    FBF<1dl<Void>> updateAnchorLinkSetting(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "sec_user_id") final String p1, @7Aw(LIZ = "effective_field") final int p2, @7Aw(LIZ = "is_turn_on") final boolean p3, @7Aw(LIZ = "accept_multi_linkmic") final boolean p4, @7Aw(LIZ = "accept_not_follower_invite") final boolean p5, @7Aw(LIZ = "allow_gift_to_other_anchors") final boolean p6, @7Aw(LIZ = "block_invitation_of_this_live") final boolean p7, @7Aw(LIZ = "allow_live_notice_of_friends") final boolean p8, @5zS final Map<String, String> p9);
    
    @5zP
    @7BB(LIZ = "/webcast/linkmic/update_settings/")
    FBF<1dl<Void>> updateMultiCoHostLinkSetting(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "sec_user_id") final String p1, @7Aw(LIZ = "effective_field") final int p2, @7Aw(LIZ = "block_this_multi_host_invites") final boolean p3, @7Aw(LIZ = "block_this_multi_host_apply") final boolean p4, @7Aw(LIZ = "receive_friend_multi_host_invites") final boolean p5, @7Aw(LIZ = "receive_friend_multi_host_application") final boolean p6, @7Aw(LIZ = "receive_not_friend_multi_host_invites") final boolean p7, @7Aw(LIZ = "receive_not_friend_multi_host_application") final boolean p8, @7Aw(LIZ = "allow_live_notice_of_friends") final boolean p9, @5zS final Map<String, String> p10);
}
