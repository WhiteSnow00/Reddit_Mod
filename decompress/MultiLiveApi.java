// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.api;

import com.bytedance.android.livesdk.chatroom.model.multilive.UpdateRoomLayoutSettings;
import X.1VA;
import X.7BN;
import X.0yd;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageResp;
import X.1dj;
import X.5zN;
import com.bytedance.android.live.liveinteract.multilive.model.ReportLinkMessageReq;
import X.2P9;
import com.bytedance.android.live.liveinteract.multilive.model.GetSharedInviteePanelParamsResponse;
import X.7B8;
import java.util.Map;
import X.7B9;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import X.FAE;
import X.7Ay;
import X.7BB;
import X.5zP;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import X.1dl;
import X.FBF;
import X.7Aw;
import com.bytedance.covode.number.Covode;

public interface MultiLiveApi
{
    default static {
        Covode.recordClassIndex(9501);
    }
    
    @5zP
    @7BB(LIZ = "/webcast/linkmic_audience/guest_mic_camera_manage/")
    FBF<1dl<GuestMicCameraManageResponse>> anchorMuteGuest(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "anchor_id") final long p1, @7Aw(LIZ = "channel_id") final long p2, @7Aw(LIZ = "guest_user_id") final Long p3, @7Aw(LIZ = "op") final int p4);
    
    @7B9(LIZ = "/webcast/linkmic_audience/list_by_type/")
    FAE<1dl<MultiLiveGuestInfoList>> getListByType(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "anchor_id") final long p1, @7Ay(LIZ = "channel_id") final long p2, @7Ay(LIZ = "list_type") final int p3);
    
    @7B9(LIZ = "/webcast/linkmic_audience/list_by_type/")
    FAE<1dl<MultiLiveGuestInfoList>> getListByType(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "anchor_id") final long p1, @7Ay(LIZ = "channel_id") final long p2, @7Ay(LIZ = "list_type") final int p3, @7Ay(LIZ = "list_type_scene") final int p4);
    
    @7B9(LIZ = "/webcast/linkmic_audience/list_by_type/")
    FAE<1dl<MultiLiveGuestInfoList>> getListByType(@7Ay(LIZ = "room_id") final long p0, @7Ay(LIZ = "anchor_id") final long p1, @7Ay(LIZ = "channel_id") final long p2, @7Ay(LIZ = "need_list_type_set_json_str") final String p3, @7Ay(LIZ = "list_by_type_scene") final int p4);
    
    @5zP
    @7BB(LIZ = "/webcast/linkmic_audience/get_shared_invitee_panel/")
    FBF<1dl<GetSharedInviteePanelParamsResponse>> getSharedInviteePanelState(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "user_return_type") final int p1, @7B8 final Map<String, String> p2);
    
    @5zP
    @7BB(LIZ = "/webcast/linkmic_audience/reply_accept_notice/")
    FBF<1dl<2P9>> replyAcceptNotice(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "guest_user_id") final long p1, @7Aw(LIZ = "anchor_id") final long p2, @7Aw(LIZ = "channel_id") final long p3);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @7BB(LIZ = "/tikcast/linkmic/report_link_message/")
    @7BN(LIZ = { "content-type: application/json" })
    FAE<1dj<ReportLinkMessageResp>> reportLinkMsg(@5zN final ReportLinkMessageReq p0);
    
    @5zP
    @7BB(LIZ = "/webcast/linkmic_audience/shared_invitation_callback/")
    FBF<1dl<2P9>> sendMultiLiveShareInvitation(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "shared_invitee_user_ids_json_str") final String p1, @7B8 final Map<String, String> p2);
    
    @5zP
    @7BB(LIZ = "/feedback/2/post_message/")
    FBF<1VA> submitFeedback(@7B8 final Map<String, String> p0);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @5zP
    @7BB(LIZ = "/webcast/linkmic_audience/turn_off_invitation/")
    FBF<1dl<2P9>> turnOffInvitation(@7Aw(LIZ = "room_id") final long p0);
    
    @0yd(LIZ = 0yd.a.LINK_MIC)
    @5zP
    @7BB(LIZ = "/webcast/linkmic_audience/update_setting/")
    FBF<1dl<UpdateRoomLayoutSettings>> updateAnchorPanelSettings(@7Aw(LIZ = "room_id") final long p0, @7Aw(LIZ = "channel_id") final long p1, @7Aw(LIZ = "live_id") final long p2, @7Aw(LIZ = "new_layout") final int p3, @7Aw(LIZ = "new_fix_mic_num") final int p4, @7Aw(LIZ = "new_allow_request_from_user") final int p5, @7Aw(LIZ = "new_allow_request_from_follower_only") final int p6);
}
