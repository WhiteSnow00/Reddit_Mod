// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 1mk extends 1d9
{
    public static final String LIZ;
    public static final 1mk LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    
    static {
        Covode.recordClassIndex(10316);
        LIZIZ = new 1mk();
        LIZ = GGd.LIZ("ttlive_client_linkmic_anchor_connect_status");
        LIZJ = GGd.LIZIZ("ttlive_client_linkmic_anchor_connect_status");
        LIZLLL = GGd.LIZ("ttlive_client_guest_link_status");
        LJ = GGd.LIZIZ("ttlive_client_guest_link_status");
    }
    
    public static final void LIZ(final int n, final String s) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        1mk.LIZIZ.LIZ(n, false, jsonObject);
        0d3.LIZ(jsonObject, "sei", s);
        0d8.LIZ("ttlive_client_linkmic_audience_sei", 0, jsonObject, 0);
    }
    
    public static final void LIZ(final long n, final long n2) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "icon_type", n);
        0d3.LIZ(jsonObject, "show_error_type", "bundle");
        0d3.LIZ(jsonObject, "event_id", "link_icon_show_error");
        0d3.LIZ(jsonObject, "permission_status", n2);
        1mk.LIZIZ.LIZ(null, jsonObject);
        LIZ(jsonObject, true);
    }
    
    public static final void LIZ(final String s, final int n, String s2) {
        CTM.LIZ((Object)s2);
        final JSONObject jsonObject = new JSONObject();
        1mk.LIZIZ.LIZ(4, true, jsonObject);
        0d3.LIZ(jsonObject, "sei", s2);
        s2 = s;
        if (s == null) {
            s2 = "";
        }
        0d3.LIZ(jsonObject, "link_mic_id", s2);
        0d3.LIZ(jsonObject, "region_size", (long)n);
        0d8.LIZ("ttlive_client_linkmic_anchor_sei", 0, jsonObject);
    }
    
    public static final void LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "event_id", s);
        if (s2 != null) {
            0d3.LIZ(jsonObject, "show_error_type", s2);
        }
        LIZ(jsonObject, false);
    }
    
    public static final void LIZ(final String s, final Throwable t) {
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "show_error_type", "permission");
        0d3.LIZ(jsonObject, "event_id", "link_icon_show_error");
        0d3.LIZ(jsonObject, "permission_type", s);
        1mk.LIZIZ.LIZ(t, jsonObject);
        LIZ(jsonObject, true);
    }
    
    public static final void LIZ(final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        0d8.LIZIZ(1mk.LIZ, 1, jsonObject);
        0d8.LIZ(1mk.LIZJ, 1, jsonObject);
    }
    
    public static final void LIZ(final JSONObject jsonObject, final boolean b) {
        final 0yA liz = 1dP.LIZJ.LIZ();
        int liziz;
        if (liz != null) {
            liziz = liz.LIZIZ();
        }
        else {
            liziz = 0;
        }
        0d3.LIZ(jsonObject, "is_aab_opt", liziz);
        if (b) {
            0d8.LIZ("ttlive_client_anchor_link_icon_monitor", 0, jsonObject);
            return;
        }
        if (HBB.LIZIZ("ttlive_client_audience_link_icon_monitor", 0.1f)) {
            0d8.LIZ("ttlive_client_audience_link_icon_monitor", 0, jsonObject);
        }
    }
    
    public static final void LIZ(final boolean b) {
        final JSONObject jsonObject = new JSONObject();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        String idStr;
        if (Room.isValid(room)) {
            if (room == null) {
                n.LIZIZ();
            }
            idStr = room.getIdStr();
        }
        else {
            idStr = "0";
        }
        final boolean valid = Room.isValid(room);
        final long n = 0L;
        long ownerUserId;
        if (valid) {
            if (room == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            ownerUserId = room.getOwnerUserId();
        }
        else {
            ownerUserId = 0L;
        }
        0d3.LIZ(jsonObject, "room_id", idStr);
        0d3.LIZ(jsonObject, "anchor_id", ownerUserId);
        final GIK liziz = Fk2.LIZ().LIZIZ();
        long lizj = n;
        if (liziz != null) {
            lizj = liziz.LIZJ();
        }
        0d3.LIZ(jsonObject, "current_user_id", lizj);
        String s;
        if (b) {
            s = "ttlive_linkmic_anchor_no_show_entrance_with_no_byte_plugin";
        }
        else {
            s = "ttlive_linkmic_audience_no_show_entrance_with_no_byte_plugin";
        }
        0d8.LIZ(s, 0, jsonObject);
    }
    
    public static final void LIZ(final boolean b, final int n, final long n2, final long n3) {
        if (!HBB.LIZIZ("ttlive_multi_guest_v3_open_record", 0.1f)) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        String s;
        if (b) {
            s = "host";
        }
        else {
            s = "audience";
        }
        0d3.LIZ(jsonObject, "use_role", s);
        0d3.LIZ(jsonObject, "version", String.valueOf(n));
        0d3.LIZ(jsonObject, "room_id", String.valueOf(n2));
        0d3.LIZ(jsonObject, "anchor_id", String.valueOf(n3));
        0d8.LIZ("ttlive_multi_guest_v3_open_record", 0, jsonObject);
    }
    
    public static final void LIZ(final boolean b, final int n, final boolean b2, final long n2, final String s, final String s2, final String s3) {
        CTM.LIZ((Object)s, (Object)s2, (Object)s3);
        if (!HBB.LIZIZ("ttlive_linkmic_aab_install", 0.1f)) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        final 0yA liz = 1dP.LIZJ.LIZ();
        int liziz;
        if (liz != null) {
            liziz = liz.LIZIZ();
        }
        else {
            liziz = 0;
        }
        0d3.LIZ(jsonObject, "is_aab_opt", liziz);
        0d3.LIZ(jsonObject, "is_silent_install", (b ^ true) ? 1 : 0);
        String s4;
        if (b2) {
            s4 = "host";
        }
        else {
            s4 = "audience";
        }
        0d3.LIZ(jsonObject, "user_role", s4);
        0d3.LIZ(jsonObject, "trigger_source", s);
        if (Q4d.LIZ.LIZ(s2)) {
            0d3.LIZ(jsonObject, "error_reason", s2);
        }
        if (Q4d.LIZ.LIZ(s3)) {
            0d3.LIZ(jsonObject, "error_msg", s3);
        }
        0d8.LIZ("ttlive_linkmic_aab_install", n, n2, jsonObject, 0);
    }
    
    public static final void LIZIZ(final long n, final long n2) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "icon_type", n);
        0d3.LIZ(jsonObject, "event_id", "link_icon_show");
        0d3.LIZ(jsonObject, "permission_status", n2);
        1mk.LIZIZ.LIZ(null, jsonObject);
        LIZ(jsonObject, true);
    }
    
    public static final void LIZLLL(final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        0d8.LIZIZ(1mk.LIZLLL, 0, jsonObject);
    }
    
    public static final void LJ(final JSONObject jsonObject) {
        CTM.LIZ((Object)jsonObject);
        0d8.LIZIZ(1mk.LIZLLL, 1, jsonObject);
        0d8.LIZ(1mk.LJ, 1, jsonObject);
    }
}
