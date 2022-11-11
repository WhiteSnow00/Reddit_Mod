// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.model;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class BattleFinishResult
{
    @c(LIZ = "data")
    public ResponseData LIZ;
    
    static {
        Covode.recordClassIndex(7883);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", data=");
            sb.append(this.LIZ);
        }
        sb.replace(0, 2, "BattleFinishResult{");
        sb.append('}');
        return sb.toString();
    }
    
    public static final class ResponseData
    {
        @c(LIZ = "battle_result")
        public Map<Long, BattleResult> LIZ;
        @c(LIZ = "armies")
        public Map<Long, BattleUserArmies> LIZIZ;
        @c(LIZ = "anchors_info")
        public Map<Long, BattleUserInfo> LIZJ;
        @c(LIZ = "battle_combo_v2")
        public Map<Long, BattleComboInfo> LIZLLL;
        
        static {
            Covode.recordClassIndex(7884);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            final Map<Long, BattleResult> liz = this.LIZ;
            if (liz != null && !liz.isEmpty()) {
                sb.append(", battle_result=");
                sb.append(this.LIZ);
            }
            final Map<Long, BattleUserArmies> liziz = this.LIZIZ;
            if (liziz != null && !liziz.isEmpty()) {
                sb.append(", armies=");
                sb.append(this.LIZIZ);
            }
            final Map<Long, BattleUserInfo> lizj = this.LIZJ;
            if (lizj != null && !lizj.isEmpty()) {
                sb.append(", anchors_info=");
                sb.append(this.LIZJ);
            }
            final Map<Long, BattleComboInfo> lizlll = this.LIZLLL;
            if (lizlll != null && !lizlll.isEmpty()) {
                sb.append(", battle_combo_v2=");
                sb.append(this.LIZLLL);
            }
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }
}
