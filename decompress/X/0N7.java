// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.LinkedHashMap;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 0n7
{
    public static final 0n7 LIZ;
    
    static {
        Covode.recordClassIndex(7779);
        LIZ = new 0n7();
    }
    
    public final Map<String, String> LIZ(final boolean b) {
        final 1NN liz = 1NN.LLFF.LIZ();
        final 1Qk liz2 = 0n9.LIZ;
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        String s;
        if (b) {
            s = "anchor";
        }
        else {
            s = "user";
        }
        linkedHashMap.put("user_type", s);
        long n = 0L;
        long ownerUserId;
        if (room != null) {
            ownerUserId = room.getOwnerUserId();
        }
        else {
            ownerUserId = 0L;
        }
        linkedHashMap.put("anchor_id", String.valueOf(ownerUserId));
        long id;
        if (room != null) {
            id = room.getId();
        }
        else {
            id = 0L;
        }
        linkedHashMap.put("room_id", String.valueOf(id));
        linkedHashMap.put("channel_id", String.valueOf(liz.LJ));
        final BattleSetting liziz = liz2.LIZIZ;
        int n2 = 0;
        final int n3 = 0;
        int lizlll;
        if (liziz != null) {
            lizlll = liziz.LIZLLL;
        }
        else {
            lizlll = 0;
        }
        linkedHashMap.put("pk_time", String.valueOf(lizlll));
        linkedHashMap.put("pk_id", String.valueOf(liz.LJJZZIII));
        linkedHashMap.put("is_oncemore", String.valueOf((int)(liz2.LIZJ ? 1 : 0)));
        String ljjijlij;
        if ((ljjijlij = liz.LJJIJLIJ) == null) {
            ljjijlij = "";
        }
        linkedHashMap.put("request_id", ljjijlij);
        linkedHashMap.put("invitee_list", 0xg.LIZ(liz.LJIILL));
        final 0kf ljiill = liz.LJIILL;
        final 0kf random_LINK_MIC_INVITE = 0kf.RANDOM_LINK_MIC_INVITE;
        final int n4 = 1;
        int n5 = n3;
        int n7 = 0;
        Label_0320: {
            if (ljiill == random_LINK_MIC_INVITE) {
                final int n6 = 0n8.LIZ[1O2.LJIIZILJ.ordinal()];
                if (n6 != 1) {
                    n7 = n4;
                    if (n6 == 2) {
                        break Label_0320;
                    }
                    n5 = n3;
                }
                else {
                    n5 = 1;
                }
            }
            final int n8 = 0;
            n2 = n5;
            n7 = n8;
        }
        linkedHashMap.put("is_change_pairing", String.valueOf(n2));
        linkedHashMap.put("is_system_rematching", String.valueOf(n7));
        final String ljl = liz.LJL;
        if (ljl != null) {
            linkedHashMap.put("request_from", ljl);
        }
        String s2;
        if (liz2.LIZLLL) {
            s2 = "inviter";
        }
        else {
            s2 = "invitee";
        }
        linkedHashMap.put("anchor_type", s2);
        if (liz2.LIZLLL) {
            linkedHashMap.put("pk_invitee_id", String.valueOf(liz.LJFF));
            long ownerUserId2;
            if (room != null) {
                ownerUserId2 = room.getOwnerUserId();
            }
            else {
                ownerUserId2 = 0L;
            }
            linkedHashMap.put("pk_inviter_id", String.valueOf(ownerUserId2));
        }
        else {
            long ownerUserId3;
            if (room != null) {
                ownerUserId3 = room.getOwnerUserId();
            }
            else {
                ownerUserId3 = 0L;
            }
            linkedHashMap.put("pk_invitee_id", String.valueOf(ownerUserId3));
            linkedHashMap.put("pk_inviter_id", String.valueOf(liz.LJFF));
        }
        if (liz.LJIIZILJ) {
            if (room != null) {
                n = room.getOwnerUserId();
            }
            linkedHashMap.put("connection_inviter_id", String.valueOf(n));
            linkedHashMap.put("connection_invitee_id", String.valueOf(liz.LJFF));
        }
        else {
            linkedHashMap.put("connection_inviter_id", String.valueOf(liz.LJFF));
            if (room != null) {
                n = room.getOwnerUserId();
            }
            linkedHashMap.put("connection_invitee_id", String.valueOf(n));
        }
        if (liz2.LIZJ() == 0nC.PUNISH) {
            linkedHashMap.put("match_status", "punish");
        }
        else {
            linkedHashMap.put("match_status", "pk_phase");
        }
        return linkedHashMap;
    }
    
    public final void LIZ(final String s, final Map<String, String> map) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
}
