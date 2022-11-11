// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class BattleInviteResult
{
    @c(LIZ = "data")
    public ResponseData LIZ;
    
    static {
        Covode.recordClassIndex(7886);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", data=");
            sb.append(this.LIZ);
        }
        sb.replace(0, 2, "BattleInviteResult{");
        sb.append('}');
        return sb.toString();
    }
    
    public static final class ResponseData
    {
        @c(LIZ = "battle_id")
        public Long LIZ;
        @c(LIZ = "inviter_gift_permission_type")
        public int LIZIZ;
        
        static {
            Covode.recordClassIndex(7887);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            if (this.LIZ != null) {
                sb.append(", battle_id=");
                sb.append(this.LIZ);
            }
            sb.append(", inviter_gift_permission_type=");
            sb.append(this.LIZIZ);
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }
}
