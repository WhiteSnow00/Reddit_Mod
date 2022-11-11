// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class BattleInviteRequestParams
{
    @c(LIZ = "channel_id")
    public Long LIZ;
    @c(LIZ = "room_id")
    public Long LIZIZ;
    @c(LIZ = "invite_type")
    public int LIZJ;
    @c(LIZ = "target_user_id")
    public Long LIZLLL;
    
    static {
        Covode.recordClassIndex(7885);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", channel_id=");
            sb.append(this.LIZ);
        }
        if (this.LIZIZ != null) {
            sb.append(", room_id=");
            sb.append(this.LIZIZ);
        }
        sb.append(", invite_type=");
        sb.append(this.LIZJ);
        if (this.LIZLLL != null) {
            sb.append(", target_user_id=");
            sb.append(this.LIZLLL);
        }
        sb.replace(0, 2, "BattleInviteRequestParams{");
        sb.append('}');
        return sb.toString();
    }
}
