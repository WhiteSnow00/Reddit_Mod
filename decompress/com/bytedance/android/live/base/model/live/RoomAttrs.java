// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.live;

import com.google.gson.Gson;
import X.0b8;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.WXw;

public class RoomAttrs implements WXw
{
    @c(LIZ = "admin_flag")
    public int adminFlag;
    @c(LIZ = "fanticket_this_room")
    public long currentRoomContribution;
    @c(LIZ = "rank_this_room")
    public int currentRoomRank;
    @c(LIZ = "rank")
    public int rank;
    @c(LIZ = "silence_flag")
    public int silenceFlag;
    
    static {
        Covode.recordClassIndex(4939);
    }
    
    public static RoomAttrs from(final WXw wXw) {
        if (wXw == null) {
            return null;
        }
        if (wXw instanceof RoomAttrs) {
            final Gson liziz = 0b8.a.LIZIZ;
            return (RoomAttrs)liziz.LIZ(liziz.LIZIZ((Object)wXw), (Class)RoomAttrs.class);
        }
        final RoomAttrs roomAttrs = new RoomAttrs();
        roomAttrs.initWith(wXw);
        return roomAttrs;
    }
    
    private void initWith(final WXw wXw) {
        this.silenceFlag = wXw.getSilenceFlag();
        this.adminFlag = wXw.getAdminFlag();
        this.rank = wXw.getRank();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final RoomAttrs roomAttrs = (RoomAttrs)o;
            if (this.silenceFlag != roomAttrs.silenceFlag) {
                return false;
            }
            if (this.adminFlag != roomAttrs.adminFlag) {
                return false;
            }
            if (this.rank == roomAttrs.rank) {
                return true;
            }
        }
        return false;
    }
    
    public int getAdminFlag() {
        return this.adminFlag;
    }
    
    public int getRank() {
        return this.rank;
    }
    
    public int getSilenceFlag() {
        return this.silenceFlag;
    }
    
    @Override
    public int hashCode() {
        return (this.silenceFlag * 31 + this.adminFlag) * 31 + this.rank;
    }
    
    public void setAdminFlag(final int adminFlag) {
        this.adminFlag = adminFlag;
    }
    
    public void setRank(final int rank) {
        this.rank = rank;
    }
    
    public void setSilenceFlag(final int silenceFlag) {
        this.silenceFlag = silenceFlag;
    }
}
