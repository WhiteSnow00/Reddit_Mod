// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import java.util.Map;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceInviteRefactorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.HashMap;

public final class 0xw
{
    public static final 0xw LIZ;
    public static long LIZIZ;
    public static final HashMap<Long, String> LIZJ;
    public static final HashMap<Long, String> LIZLLL;
    public static final HashSet<Long> LJ;
    public static final String LJFF;
    
    static {
        Covode.recordClassIndex(10340);
        LIZ = new 0xw();
        LIZJ = new HashMap<Long, String>();
        LIZLLL = new HashMap<Long, String>();
        LJ = new HashSet<Long>();
        LJFF = "MultiLiveEnd";
    }
    
    private final String LIZ(final long n, final String s) {
        final int hashCode = s.hashCode();
        if (hashCode != -1143858661) {
            if (hashCode == 0 && s.equals("")) {
                return this.LIZIZ(n);
            }
        }
        else if (s.equals("liveEnd&turnOff")) {
            return "";
        }
        return "anchor_invite_guest";
    }
    
    private final String LIZ(final String s) {
        final int hashCode = s.hashCode();
        if (hashCode != -1143858661) {
            if (hashCode == 0 && s.equals("")) {
                return "guest_apply_anchor";
            }
        }
        else if (s.equals("liveEnd&turnOff")) {
            return "";
        }
        return "anchor_invite_guest";
    }
    
    public static final void LIZ(final long n) {
        0xw.LJ.add(n);
    }
    
    public static final void LIZ(final long n, final long n2, final 0k8 0k8) {
        final HashMap<Long, String> lizj = 0xw.LIZJ;
        final String s = lizj.remove(n);
        final String s2 = 0xw.LIZLLL.remove(n);
        if (s2 != null && s != null && lizj.size() == 0) {
            0xw.LIZ.LIZ("guest_over", n, n2, 0k8, s, s2);
        }
    }
    
    public static final void LIZ(final long n, final 0k8 0k8) {
        final HashMap<Long, String> lizj = 0xw.LIZJ;
        final String s = lizj.remove(n);
        final String s2 = 0xw.LIZLLL.remove(n);
        if (s2 != null && s != null && lizj.size() == 0) {
            LIZ(0xw.LIZ, "connection_end_quickly", n, 0L, 0k8, s, s2, 4);
        }
    }
    
    public static final void LIZ(final long n, final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap<Long, String> lizj = 0xw.LIZJ;
        if (lizj.isEmpty()) {
            0xw.LIZIZ = System.currentTimeMillis();
        }
        lizj.put(n, s);
        0xw.LIZLLL.put(n, s2);
    }
    
    public static final void LIZ(final 0k8 0k8) {
        final HashMap<Long, String> lizj = 0xw.LIZJ;
        if (lizj.isEmpty()) {
            return;
        }
        lizj.clear();
        0xw.LIZLLL.clear();
        LIZ(0xw.LIZ, "turn_off_functions", 0L, 0L, 0k8, null, null, 54);
    }
    
    public static /* synthetic */ void LIZ(final 0xw 0xw, final String s, long n, long n2, final 0k8 0k8, String s2, String s3, final int n3) {
        if ((n3 & 0x2) != 0x0) {
            n = 0L;
        }
        if ((n3 & 0x4) != 0x0) {
            n2 = -1L;
        }
        if ((n3 & 0x10) != 0x0) {
            s2 = "liveEnd&turnOff";
        }
        if ((n3 & 0x20) != 0x0) {
            s3 = "";
        }
        0xw.LIZ(s, n, n2, 0k8, s2, s3);
    }
    
    private final void LIZ(final String s, final long n, final long n2, final 0k8 0k8, String liziz, final String s2) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final GIK liziz2 = Fk2.LIZ().LIZIZ();
        0W5 liz;
        if (liziz2 != null) {
            liz = liziz2.LIZ();
        }
        else {
            liz = null;
        }
        Label_0526: {
            if (room == null) {
                break Label_0526;
            }
            if (liz != null) {
                final HashMap hashMap = new HashMap();
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("channel_id", String.valueOf(room.getId()));
                hashMap.put("duration", String.valueOf((System.currentTimeMillis() - 0xw.LIZIZ) / 1000L));
                hashMap.put("live_type", "video_live");
                hashMap.put("connection_over_type", s);
                if (n2 >= 0L) {
                    hashMap.put("anchor_relationship", String.valueOf(n2));
                }
                hashMap.put("enter_method", Fwf.LIZ.LIZLLL());
                hashMap.put("enter_from_merge", Fwf.LIZ.LIZ());
                hashMap.put("action_type", Fwf.LIZ.LJFF());
                hashMap.put("layout_setting", 0uW.LIZJ.LIZ(0k8).getFirst());
                hashMap.put("window_setting", 0uW.LIZJ.LIZ(0k8).getSecond());
                hashMap.put("guest_invite_type", this.LIZ(liziz));
                if (0sD.LIZJ.LIZ().LIZLLL()) {
                    String liz3 = null;
                    Label_0335: {
                        if (LinkMicMultiGuestV3ServiceInviteRefactorSetting.getValue()) {
                            final 0sR.a liz2 = 0sR.LJIIIIZZ.LIZ(n);
                            if (liz2 != null) {
                                liziz = liz2.LIZIZ;
                                if ((liz3 = liziz) != null) {
                                    break Label_0335;
                                }
                            }
                            liz3 = "";
                        }
                        else {
                            liz3 = 1Tj.LIZ(n);
                        }
                    }
                    hashMap.put("enter_from", liz3);
                }
                else {
                    hashMap.put("enter_from", this.LIZ(n, liziz));
                }
                hashMap.put("guest_id", String.valueOf(n));
                hashMap.put("permission_type", 0tO.LIZLLL());
                hashMap.put("linkId", s2);
                final Gkn liz4 = Gkn.LJFF.LIZ("livesdk_anchor_guest_connection_over");
                liz4.LIZ((Map)hashMap);
                GSP.LIZ(liz4);
                liz4.LIZLLL();
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("log_name", (Object)"ttlive_multilive_multi_live_end");
                jsonObject.put("way", (Object)s);
                0ba.LIZ(4, 0xw.LJFF, jsonObject.toString());
                1NN.LLFF.LIZ().LJLIL = false;
                return;
            }
            try {
                throw new IllegalStateException("Required value was null.".toString());
                throw new IllegalStateException("Required value was null.".toString());
            }
            catch (final IllegalStateException ex) {}
        }
    }
    
    private final String LIZIZ(final long n) {
        final HashSet<Long> lj = 0xw.LJ;
        if (lj.contains(n)) {
            lj.remove(n);
            return "animation_guest_apply_anchor";
        }
        return "guest_apply_anchor";
    }
    
    public static final void LIZIZ(final long n, final long n2, final 0k8 0k8) {
        final HashMap<Long, String> lizj = 0xw.LIZJ;
        final String s = lizj.remove(n);
        final String s2 = 0xw.LIZLLL.remove(n);
        if (s2 != null && s != null && lizj.size() == 0) {
            0xw.LIZ.LIZ("anchor_kick_out_guest", n, n2, 0k8, s, s2);
        }
    }
    
    public static final void LIZIZ(final 0k8 0k8) {
        final HashMap<Long, String> lizj = 0xw.LIZJ;
        if (lizj.isEmpty()) {
            return;
        }
        lizj.clear();
        0xw.LIZLLL.clear();
        LIZ(0xw.LIZ, "live_end", 0L, 0L, 0k8, null, null, 54);
    }
}
