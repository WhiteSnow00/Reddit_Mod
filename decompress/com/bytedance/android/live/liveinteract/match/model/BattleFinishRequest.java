// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class BattleFinishRequest
{
    @c(LIZ = "channel_id")
    public Long LIZ;
    @c(LIZ = "cut_short")
    public Boolean LIZIZ;
    @c(LIZ = "battle_id")
    public Long LIZJ;
    @c(LIZ = "other_party_left")
    public Boolean LIZLLL;
    @c(LIZ = "other_party_user_id")
    public Long LJ;
    
    static {
        Covode.recordClassIndex(7882);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", channel_id=");
            sb.append(this.LIZ);
        }
        if (this.LIZIZ != null) {
            sb.append(", cut_short=");
            sb.append(this.LIZIZ);
        }
        if (this.LIZJ != null) {
            sb.append(", battle_id=");
            sb.append(this.LIZJ);
        }
        if (this.LIZLLL != null) {
            sb.append(", other_party_left=");
            sb.append(this.LIZLLL);
        }
        if (this.LJ != null) {
            sb.append(", other_party_user_id=");
            sb.append(this.LJ);
        }
        sb.replace(0, 2, "BattleFinishRequest{");
        sb.append('}');
        return sb.toString();
    }
}
