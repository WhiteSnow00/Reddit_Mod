// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.roomcomponents;

import kotlin.jvm.internal.DefaultConstructorMarker;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response$EntranceGroup;
import java.util.List;
import com.google.gson.a.c;
import X.9Mp;

public final class RoomComponentsResponse extends 9Mp
{
    @c(LIZ = "online_audience")
    public OnlineRankListResponse onlineAudienceData;
    @c(LIZ = "online_audience_status")
    public Long onlineAudienceStatus;
    @c(LIZ = "rankings")
    public List<RankEntranceV3Response$EntranceGroup> rankingData;
    @c(LIZ = "rankings_status")
    public Long rankingStatus;
    
    static {
        Covode.recordClassIndex(4957);
    }
    
    public RoomComponentsResponse() {
        this(null, null, null, null, 15, null);
    }
    
    public RoomComponentsResponse(final Long onlineAudienceStatus, final OnlineRankListResponse onlineAudienceData, final Long rankingStatus, final List<RankEntranceV3Response$EntranceGroup> rankingData) {
        this.onlineAudienceStatus = onlineAudienceStatus;
        this.onlineAudienceData = onlineAudienceData;
        this.rankingStatus = rankingStatus;
        this.rankingData = rankingData;
    }
    
    public final Long component1() {
        return this.onlineAudienceStatus;
    }
    
    public final OnlineRankListResponse component2() {
        return this.onlineAudienceData;
    }
    
    public final Long component3() {
        return this.rankingStatus;
    }
    
    public final List<RankEntranceV3Response$EntranceGroup> component4() {
        return this.rankingData;
    }
    
    public final RoomComponentsResponse copy(final Long n, final OnlineRankListResponse onlineRankListResponse, final Long n2, final List<RankEntranceV3Response$EntranceGroup> list) {
        return new RoomComponentsResponse(n, onlineRankListResponse, n2, list);
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.onlineAudienceStatus, this.onlineAudienceData, this.rankingStatus, this.rankingData };
    }
}
