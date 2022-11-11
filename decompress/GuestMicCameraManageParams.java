// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class GuestMicCameraManageParams
{
    @c(LIZ = "room_id")
    public Long LIZ;
    @c(LIZ = "guest_user_id")
    public Long LIZIZ;
    @c(LIZ = "anchor_id")
    public Long LIZJ;
    @c(LIZ = "op")
    public int LIZLLL;
    @c(LIZ = "channel_id")
    public Long LJ;
    
    static {
        Covode.recordClassIndex(9774);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", room_id=");
            sb.append(this.LIZ);
        }
        if (this.LIZIZ != null) {
            sb.append(", guest_user_id=");
            sb.append(this.LIZIZ);
        }
        if (this.LIZJ != null) {
            sb.append(", anchor_id=");
            sb.append(this.LIZJ);
        }
        sb.append(", op=");
        sb.append(this.LIZLLL);
        if (this.LJ != null) {
            sb.append(", channel_id=");
            sb.append(this.LJ);
        }
        sb.replace(0, 2, "GuestMicCameraManageParams{");
        sb.append('}');
        return sb.toString();
    }
}
