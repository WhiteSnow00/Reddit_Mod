// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.roomcomponents;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.rank.api.model.RankItem;
import java.util.List;
import com.google.gson.a.c;

public class OnlineRankListResponse
{
    @c(LIZ = "display_config")
    public OnlineRankConfig config;
    @c(LIZ = "currency")
    public String currency;
    @c(LIZ = "anchor_show_contribution")
    public boolean isBroadcastMENAT;
    @c(LIZ = "ranks")
    public List<RankItem> ranks;
    @c(LIZ = "self_info")
    public RankItem selfInfo;
    @c(LIZ = "show_bottom_bar")
    public boolean showBottomBar;
    @c(LIZ = "total")
    public int total;
    
    static {
        Covode.recordClassIndex(4956);
    }
}
