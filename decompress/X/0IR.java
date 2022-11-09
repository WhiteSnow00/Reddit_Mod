// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Iterator;
import com.bytedance.android.livesdk.model.message.PollEndContent;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdk.model.message.PollMessage;
import org.json.JSONObject;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import org.json.JSONArray;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 0ir
{
    public static final 0ir LIZ;
    
    static {
        Covode.recordClassIndex(6796);
        LIZ = new 0ir();
    }
    
    public final String LIZ(final User user) {
        while (true) {
            Label_0031: {
                if (user == null) {
                    break Label_0031;
                }
                final UserAttr userAttr = user.getUserAttr();
                if (userAttr == null) {
                    break Label_0031;
                }
                final Boolean value = userAttr.LIZIZ;
                if (GTi.LIZ(value)) {
                    return "moderator";
                }
                return "host";
            }
            final Boolean value = null;
            continue;
        }
    }
    
    public final void LIZ(final DataChannel dataChannel, final 0iq 0iq, final String s) {
        CTM.LIZ((Object)0iq, (Object)s);
        String s2;
        if (GTi.LJFF(dataChannel) || GTi.LIZJ(dataChannel)) {
            s2 = "livesdk_anchor_custom_poll_end";
        }
        else {
            s2 = "livesdk_audience_poll_end";
        }
        final PollMessage ljff = 0iq.LJFF;
        while (true) {
            Label_0369: {
                if (ljff == null) {
                    break Label_0369;
                }
                final PollStartContent lizj = ljff.LIZJ;
                if (lizj == null) {
                    break Label_0369;
                }
                final User lj = lizj.LJ;
                final String liz = this.LIZ(lj);
                final JSONArray jsonArray = new JSONArray();
                String s3 = "";
                final PollMessage ljff2 = 0iq.LJFF;
                int n = 1;
                Label_0391: {
                    if (ljff2 != null) {
                        final PollEndContent lizlll = ljff2.LIZLLL;
                        if (lizlll != null) {
                            final Iterator iterator = lizlll.LIZIZ.iterator();
                            int n2 = 0;
                            long n3 = 0L;
                            long n4 = 0L;
                            while (iterator.hasNext()) {
                                final Object next = iterator.next();
                                if (n2 < 0) {
                                    Ey9.LIZ();
                                }
                                final PollOptionInfo pollOptionInfo = (PollOptionInfo)next;
                                long liz2 = n4;
                                long n5 = n3;
                                String string = s3;
                                int n6 = n;
                                if (pollOptionInfo != null) {
                                    final JSONObject jsonObject = new JSONObject();
                                    jsonObject.put(pollOptionInfo.LIZIZ, (Object)String.valueOf(pollOptionInfo.LIZ));
                                    jsonArray.put((Object)jsonObject);
                                    long liz3;
                                    if (n2 == 0) {
                                        liz3 = pollOptionInfo.LIZ;
                                    }
                                    else {
                                        liz3 = n3;
                                        if (n3 != pollOptionInfo.LIZ) {
                                            n = 0;
                                            liz3 = n3;
                                        }
                                    }
                                    liz2 = n4;
                                    n5 = liz3;
                                    string = s3;
                                    n6 = n;
                                    if (n4 < pollOptionInfo.LIZ) {
                                        liz2 = pollOptionInfo.LIZ;
                                        final StringBuilder sb = new StringBuilder("{");
                                        sb.append(pollOptionInfo.LIZIZ);
                                        sb.append(':');
                                        sb.append(pollOptionInfo.LIZ);
                                        sb.append('}');
                                        string = sb.toString();
                                        n6 = n;
                                        n5 = liz3;
                                    }
                                }
                                ++n2;
                                n4 = liz2;
                                n3 = n5;
                                s3 = string;
                                n = n6;
                            }
                            if (n == 0) {
                                break Label_0391;
                            }
                        }
                    }
                    s3 = "tie_up";
                }
                final Gkn liz4 = Gkn.LJFF.LIZ(s2);
                liz4.LIZ(dataChannel);
                final PollMessage ljff3 = 0iq.LJFF;
                Long value;
                if (ljff3 != null) {
                    value = ljff3.LIZIZ;
                }
                else {
                    value = null;
                }
                liz4.LIZ("poll_id", (Number)value);
                final PollMessage ljff4 = 0iq.LJFF;
                while (true) {
                    Label_0691: {
                        if (ljff4 == null) {
                            break Label_0691;
                        }
                        final PollStartContent lizj2 = ljff4.LIZJ;
                        if (lizj2 == null) {
                            break Label_0691;
                        }
                        final String lizlll2 = lizj2.LIZLLL;
                        liz4.LIZ("poll_title", lizlll2);
                        liz4.LIZ("poll_sponsor", liz);
                        if (GTi.LJFF(dataChannel)) {
                            final User liz5 = 0W8.LIZ.LIZ();
                            Long value2;
                            if (liz5 != null) {
                                value2 = liz5.getId();
                            }
                            else {
                                value2 = null;
                            }
                            liz4.LIZ("moderator_id", (Number)value2);
                            liz4.LIZ("user_type", "moderator");
                        }
                        else if (GTi.LIZJ(dataChannel)) {
                            liz4.LIZ("user_type", "anchor");
                        }
                        else {
                            liz4.LIZ("winner", s3);
                        }
                        if (0iq.LIZIZ > 0L) {
                            final PollMessage ljff5 = 0iq.LJFF;
                            if (ljff5 != null) {
                                final PollStartContent lizj3 = ljff5.LIZJ;
                                if (lizj3 != null) {
                                    liz4.LIZ("time_remain", Math.max(0L, lizj3.LIZIZ - (System.currentTimeMillis() + Gl0.LIZ)));
                                }
                            }
                        }
                        else {
                            liz4.LIZ("time_remain", 0iq.LIZIZ);
                        }
                        final JSONObject jsonObject2 = new JSONObject();
                        jsonObject2.put("poll_result", (Object)jsonArray);
                        liz4.LIZ(jsonObject2);
                        liz4.LIZ("end_reason", s);
                        liz4.LIZ("is_custom", "1");
                        liz4.LIZLLL();
                        return;
                    }
                    final String lizlll2 = null;
                    continue;
                }
            }
            final User lj = null;
            continue;
        }
    }
    
    public final void LIZ(final DataChannel dataChannel, String liz, final boolean b, final boolean b2, final boolean b3, final String s) {
        CTM.LIZ((Object)liz, (Object)s);
        boolean b4;
        if (GTi.LIZJ(dataChannel) || b3) {
            b4 = true;
        }
        else {
            b4 = false;
        }
        String s2;
        if (GTi.LJFF(dataChannel)) {
            s2 = "livesdk_moderator_custom_poll_entrance_show";
        }
        else if (b4) {
            s2 = "livesdk_anchor_custom_poll_entrance_show";
        }
        else {
            s2 = "livesdk_custom_poll_entrance_show";
        }
        final Gkn liz2 = Gkn.LJFF.LIZ(s2);
        liz2.LIZ(dataChannel);
        liz2.LIZ("enter_from", liz);
        final boolean ljff = GTi.LJFF(dataChannel);
        final String s3 = null;
        final Number n = null;
        if (ljff) {
            final User liz3 = 0W8.LIZ.LIZ();
            Number value = n;
            if (liz3 != null) {
                value = liz3.getId();
            }
            liz2.LIZ("moderator_id", value);
        }
        else if (b4) {
            liz2.LIZ("has_red_dot", (int)(b ? 1 : 0));
            liz2.LIZ("has_bubble_guidance", (int)(b2 ? 1 : 0));
            if (b3) {
                liz2.LIZIZ(s);
            }
            else {
                liz = s3;
                if (dataChannel != null) {
                    final Room room = (Room)dataChannel.LIZIZ((Class)G69.class);
                    liz = s3;
                    if (room != null) {
                        final Fra streamType = room.getStreamType();
                        liz = s3;
                        if (streamType != null) {
                            liz = Fqb.LIZ(streamType);
                        }
                    }
                }
                liz2.LIZIZ(liz);
            }
        }
        liz2.LIZLLL();
    }
    
    public final void LIZ(final DataChannel dataChannel, String liz, final boolean b, final boolean b2, final boolean b3, final boolean b4, final String s) {
        CTM.LIZ((Object)liz, (Object)s);
        boolean b5;
        if (GTi.LIZJ(dataChannel) || b4) {
            b5 = true;
        }
        else {
            b5 = false;
        }
        String s2;
        if (GTi.LJFF(dataChannel)) {
            s2 = "livesdk_moderator_poll_entrance_click";
        }
        else if (b5) {
            s2 = "livesdk_anchor_custom_poll_entrance_click";
        }
        else {
            s2 = "livesdk_poll_entrance_click";
        }
        final Gkn liz2 = Gkn.LJFF.LIZ(s2);
        liz2.LIZ(dataChannel);
        liz2.LIZ("enter_from", liz);
        if (!b5) {
            if (b) {
                liz = "1";
            }
            else {
                liz = "0";
            }
            liz2.LIZ("is_end_show", liz);
        }
        final boolean ljff = GTi.LJFF(dataChannel);
        final String s3 = null;
        final Number n = null;
        if (ljff) {
            final User liz3 = 0W8.LIZ.LIZ();
            Number value = n;
            if (liz3 != null) {
                value = liz3.getId();
            }
            liz2.LIZ("moderator_id", value);
        }
        else if (b5) {
            if (b4) {
                liz2.LIZIZ(s);
            }
            else {
                liz = s3;
                if (dataChannel != null) {
                    final Room room = (Room)dataChannel.LIZIZ((Class)G69.class);
                    liz = s3;
                    if (room != null) {
                        final Fra streamType = room.getStreamType();
                        liz = s3;
                        if (streamType != null) {
                            liz = Fqb.LIZ(streamType);
                        }
                    }
                }
                liz2.LIZIZ(liz);
            }
            liz2.LIZ("has_red_dot", (int)(b2 ? 1 : 0));
            liz2.LIZ("has_bubble_guidance", (int)(b3 ? 1 : 0));
        }
        liz2.LIZLLL();
    }
}
