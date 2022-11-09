// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.android.livesdk.chatroom.model.interact.ListReachEnhancementUser;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.ArrayList;

public class MultiLiveGuestInfoList
{
    @c(LIZ = "linked_users")
    public ArrayList<LinkPlayerInfo> LIZ;
    @c(LIZ = "applied_users")
    public ArrayList<LinkPlayerInfo> LIZIZ;
    @c(LIZ = "candidate_and_invited_users")
    public ArrayList<LinkPlayerInfo> LIZJ;
    @c(LIZ = "not_viewer_friends")
    public ArrayList<LinkPlayerInfo> LIZLLL;
    @c(LIZ = "reach_enhancement_users")
    public ArrayList<ListReachEnhancementUser> LJ;
    @c(LIZ = "tag_map")
    public HashMap<String, String> LJFF;
    @c(LIZ = "connecting_users")
    public ArrayList<LinkPlayerInfo> LJI;
    @c(LIZ = "request_user_status")
    public int LJII;
    
    static {
        Covode.recordClassIndex(9785);
    }
    
    public MultiLiveGuestInfoList() {
        this.LIZ = new ArrayList<LinkPlayerInfo>();
        this.LJII = 0;
    }
}
