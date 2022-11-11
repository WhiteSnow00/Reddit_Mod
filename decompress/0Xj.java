// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PipSetting;
import java.util.Map;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class 0xj
{
    public static long LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static final 0xj LIZLLL;
    public static long LJ;
    public static String LJFF;
    public static String LJI;
    
    static {
        Covode.recordClassIndex(10325);
        LIZLLL = new 0xj();
    }
    
    public static final void LIZ() {
        if (0xj.LIZ <= 0L) {
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long liz = 0xj.LIZ;
        final 0xj lizlll = 0xj.LIZLLL;
        final Map<String, String> liziz = lizlll.LIZIZ();
        String ljff;
        if ((ljff = 0xj.LJFF) == null) {
            ljff = "live_over";
        }
        liziz.put("trigger", ljff);
        lizlll.LIZ(null);
        0uW.LIZJ.LIZ(liziz, 0uW.LIZJ.LIZIZ());
        liziz.put("duration", String.valueOf(uptimeMillis - liz));
        liziz.put("permission_type", 0tO.LIZLLL());
        lizlll.LIZ("livesdk_guest_connection_mode_view_duration", liziz);
        0xj.LIZ = 0L;
    }
    
    public static void LIZ(String s, final Integer n) {
        if (0xj.LJ <= 0L) {
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        final long lj = 0xj.LJ;
        final 0xj lizlll = 0xj.LIZLLL;
        final Map<String, String> liziz = lizlll.LIZIZ();
        String s2;
        if ((s2 = s) == null) {
            s = 0xj.LJI;
            if ((s2 = s) == null) {
                s2 = "live_over";
            }
        }
        liziz.put("trigger", s2);
        0k8 ljiiljjil = null;
        lizlll.LIZIZ(null);
        final 0uW lizj = 0uW.LIZJ;
        final 1Uo liz = 0uW.LIZ;
        if (liz != null) {
            ljiiljjil = liz.LJIILJJIL;
        }
        lizj.LIZ(liziz, ljiiljjil);
        liziz.put("duration", String.valueOf(uptimeMillis - lj));
        if (n == null || (s = String.valueOf((int)n)) == null) {
            s = String.valueOf(GCe.LIZ().LJJI);
        }
        liziz.put("guest_cnt", s);
        lizlll.LIZ("livesdk_guest_connection_status_view_duration", liziz);
        0xj.LJ = 0L;
    }
    
    public static /* synthetic */ void LIZ(String s, Integer n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            s = null;
        }
        if ((n2 & 0x2) != 0x0) {
            n = null;
        }
        LIZ(s, n);
    }
    
    public static final void LIZ(String s, final String s2) {
        String lizj;
        if ((lizj = 0xj.LIZJ) == null) {
            lizj = "";
        }
        final 8si liz = 8sj.LIZ((Object)"guest_invite_type", (Object)lizj);
        String s3;
        if ((s3 = s) == null) {
            s3 = "";
        }
        final 8si liz2 = 8sj.LIZ((Object)"click_type", (Object)s3);
        if ((s = s2) == null) {
            s = "";
        }
        final Map lizj2 = FJ3.LIZJ(new 8si[] { liz, liz2, 8sj.LIZ((Object)"tab", (Object)s) });
        0xk.LIZIZ(lizj2);
        0uY.LJ(lizj2);
        0xk.LIZ(lizj2);
        0uY.LIZLLL(lizj2);
        0uY.LIZIZ(lizj2);
        0uY.LIZ(lizj2);
        0xj.LIZLLL.LIZ("livesdk_guest_video_preview_page_click", lizj2);
    }
    
    public static final void LIZ(final String s, String s2, final String s3) {
        String lizj;
        if ((lizj = 0xj.LIZJ) == null) {
            lizj = "";
        }
        final 8si liz = 8sj.LIZ((Object)"guest_invite_type", (Object)lizj);
        final 8si liz2 = 8sj.LIZ((Object)"action_type", (Object)s2);
        final 8si liz3 = 8sj.LIZ((Object)"click_decision", (Object)s3);
        if ((s2 = s) == null) {
            s2 = "";
        }
        final Map lizj2 = FJ3.LIZJ(new 8si[] { liz, liz2, liz3, 8sj.LIZ((Object)"guest_connection_type", (Object)s2) });
        0xk.LIZ(lizj2);
        0xk.LIZIZ(lizj2);
        0xj.LIZLLL.LIZ("livesdk_guest_cancel_connection_window", lizj2);
    }
    
    public static final void LIZ(final boolean b) {
        if (GCe.LIZ().LJJI > 0 && (!MultiGuestV3PipSetting.INSTANCE.getValue() || !b)) {
            LIZ(null, null, 3);
        }
    }
    
    public static final void LIZIZ(final String s, final String s2) {
        final Map lizj = FJ3.LIZJ(new 8si[] { 8sj.LIZ((Object)"action_type", (Object)s), 8sj.LIZ((Object)"guest_decision", (Object)s2) });
        0xk.LIZIZ(lizj);
        0xk.LIZ(lizj);
        0uY.LIZJ(lizj);
        0xj.LIZLLL.LIZ("livesdk_guest_reply_anchor_invitation", lizj);
    }
    
    public static final void LIZIZ(final boolean b) {
        if (GCe.LIZ().LJJI > 0 && (!MultiGuestV3PipSetting.INSTANCE.getValue() || !b)) {
            LIZJ(null);
        }
    }
    
    public static final void LIZJ(String s) {
        final 1ZT liz = 1ZT.LJ.LIZ();
        String s2 = s;
        if (liz != null) {
            final String lj = liz.LJ();
            s2 = s;
            if (lj != null) {
                s2 = s;
                if (GTi.LIZ((CharSequence)lj)) {
                    s2 = lj;
                }
            }
        }
        0xj.LJ = SystemClock.uptimeMillis();
        final 0xj lizlll = 0xj.LIZLLL;
        final Map<String, String> liziz = lizlll.LIZIZ();
        if ((s = s2) == null) {
            s = "connection_start";
        }
        liziz.put("trigger", s);
        lizlll.LIZIZ(null);
        0uW.LIZJ.LIZ(liziz, 0uW.LIZJ.LIZIZ());
        final 1Uo liz2 = 0uW.LIZ;
        int ljii;
        if (liz2 != null) {
            ljii = liz2.LJII;
        }
        else {
            ljii = 0;
        }
        liziz.put("guest_cnt", String.valueOf(ljii));
        lizlll.LIZ("livesdk_guest_connection_status_view_start", liziz);
    }
    
    public final void LIZ(final String ljff) {
        if (ljff == null) {
            0xj.LJFF = null;
            return;
        }
        if (n.LIZ((Object)0xj.LJFF, (Object)"live_over") ^ true) {
            0xj.LJFF = ljff;
        }
    }
    
    public final void LIZ(final String s, final Map<String, String> map) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
    
    public final Map<String, String> LIZIZ() {
        final HashMap hashMap = new HashMap();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            final GIK liziz = Fk2.LIZ().LIZIZ();
            n.LIZIZ((Object)liziz, "");
            hashMap.put("user_id", String.valueOf(liziz.LIZJ()));
            hashMap.put("live_room_mode", String.valueOf(room.liveRoomMode));
            hashMap.put("enter_method", Fwf.LIZ.LIZLLL());
            hashMap.put("enter_from_merge", Fwf.LIZ.LIZ());
            hashMap.put("action_type", Fwf.LIZ.LJFF());
        }
        hashMap.put("guest_cnt", String.valueOf(GCe.LIZ().LJJI));
        return hashMap;
    }
    
    public final void LIZIZ(final String lji) {
        if (lji == null) {
            0xj.LJI = null;
            return;
        }
        if (n.LIZ((Object)0xj.LJI, (Object)"live_over") ^ true) {
            0xj.LJI = lji;
        }
    }
}
