// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.google.gson.a.c;

public final class ReplyInvitationPanelInfo
{
    @c(LIZ = "inviter_rtc_user_id")
    public String LIZ;
    @c(LIZ = "anchor_multi_live_enum")
    public int LIZIZ;
    @c(LIZ = "anchor_setting_info")
    public MultiLiveAnchorPanelSettings LIZJ;
    @c(LIZ = "invitee_rtc_user_id")
    public String LIZLLL;
    @c(LIZ = "invitee_rtc_ext_info_map")
    public Map<Long, String> LJ;
    
    static {
        Covode.recordClassIndex(9786);
    }
}
