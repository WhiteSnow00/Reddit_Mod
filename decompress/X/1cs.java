// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.Iterator;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONObject;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.LinkMicSignalMessage;
import com.bytedance.android.livesdk.model.message.LinkMicMessage;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

@0kX(LIZ = "LINK_MESSAGE_CENTER")
public final class 1cs implements OnMessageListener
{
    public final DataChannel LIZ;
    public final List<0xI> LIZIZ;
    
    static {
        Covode.recordClassIndex(10250);
    }
    
    public 1cs(final DataChannel liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        this.LIZIZ = new ArrayList<0xI>();
    }
    
    public final void LIZ(final 0xI 0xI) {
        CTM.LIZ((Object)0xI);
        this.LIZIZ.add(0xI);
    }
    
    public final void LIZIZ(final 0xI 0xI) {
        CTM.LIZ((Object)0xI);
        if (this.LIZIZ.contains(0xI)) {
            this.LIZIZ.remove(0xI);
        }
    }
    
    public final void onMessage(final IMessage message) {
        if (message == null) {
            return;
        }
        if (!(message instanceof LinkMicAnchorGuideMessage)) {
            final boolean b = message instanceof SocialMessage;
            String idStr = "0";
            final String s = "";
            long n = 0L;
            if (b) {
                final SocialMessage socialMessage = (SocialMessage)message;
                if (socialMessage.LIZ == 51L) {
                    final User liziz = socialMessage.LIZIZ;
                    if (liziz != null) {
                        final 0lD liz = 0lD.LIZ;
                        final DataChannel liz2 = this.LIZ;
                        final String value = String.valueOf(liziz.getId());
                        final FollowInfo followInfo = liziz.getFollowInfo();
                        if (followInfo != null) {
                            n = followInfo.getFollowStatus();
                        }
                        CTM.LIZ((Object)liz2, (Object)value);
                        final 1NN liz3 = 1NN.LLFF.LIZ();
                        final Gkn liz4 = Gkn.LJFF.LIZ("livesdk_followed_notification_show");
                        String s2;
                        if (GTi.LIZJ(liz2)) {
                            s2 = "anchor";
                        }
                        else {
                            s2 = "user";
                        }
                        liz4.LIZ("to_user_type", s2);
                        if (0jR.LIZ(IInteractService.class).hasMultiCoHostPermission()) {
                            final IInteractService liz5 = 0jR.LIZ(IInteractService.class);
                            kotlin.jvm.internal.n.LIZIZ((Object)liz5, "");
                            final List<Long> multiCoHostLinkedUserList = liz5.getMultiCoHostLinkedUserList();
                            if (multiCoHostLinkedUserList.size() > 2) {
                                idStr = "1";
                            }
                            liz4.LIZ("is_multi", idStr);
                            liz4.LIZ("current_connection_cnts", multiCoHostLinkedUserList.size());
                            liz4.LIZ("uid_list", multiCoHostLinkedUserList.toString());
                        }
                        else {
                            final GIK liziz2 = Fk2.LIZ().LIZIZ();
                            kotlin.jvm.internal.n.LIZIZ((Object)liziz2, "");
                            final long lizj = liziz2.LIZJ();
                            liz4.LIZ("is_multi", "0");
                            liz4.LIZ("current_connection_cnts", "2");
                            liz4.LIZ("uid_list", new String[] { value, String.valueOf(lizj) }.toString());
                        }
                        final Room liz6 = GTi.LIZ(liz2);
                        Long value2;
                        if (liz6 != null) {
                            value2 = liz6.getOwnerUserId();
                        }
                        else {
                            value2 = null;
                        }
                        liz4.LIZ("user_id", String.valueOf(value2));
                        liz4.LIZ("room_id", GTi.LIZIZ(liz2));
                        final Room liz7 = GTi.LIZ(liz2);
                        Long value3;
                        if (liz7 != null) {
                            value3 = liz7.getOwnerUserId();
                        }
                        else {
                            value3 = null;
                        }
                        liz4.LIZ("anchor_id", String.valueOf(value3));
                        liz4.LIZ("channel_id", String.valueOf(liz3.LJ));
                        liz4.LIZ("pk_id", String.valueOf(liz3.LJJZZIII));
                        liz4.LIZ("connection_type", liz.LIZ());
                        liz4.LIZ("follow_status", n);
                        liz4.LIZ("from_user_id", value);
                        liz4.LIZ("from_user_type", liz.LIZ());
                        liz4.LIZ(liz2);
                        liz4.LIZLLL();
                    }
                }
            }
            else if (message instanceof LinkMicMessage) {
                final int liz8 = ((LinkMicMessage)message).LIZ;
                if (liz8 == 8) {
                    final List<0xI> liziz3 = this.LIZIZ;
                    final ArrayList list = new ArrayList();
                    for (final Object next : liziz3) {
                        if (next instanceof 1co) {
                            list.add(next);
                        }
                    }
                    final Iterator iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next();
                    }
                    return;
                }
                if (liz8 != 105) {
                    return;
                }
                final List<0xI> liziz4 = this.LIZIZ;
                final ArrayList list2 = new ArrayList();
                for (final Object next2 : liziz4) {
                    if (next2 instanceof 1co) {
                        list2.add(next2);
                    }
                }
                final Iterator iterator4 = list2.iterator();
                while (iterator4.hasNext()) {
                    ((1co)iterator4.next()).LIZIZ();
                }
            }
            else {
                if (message instanceof LinkMicSignalMessage) {
                    final LinkMicSignalMessage linkMicSignalMessage = (LinkMicSignalMessage)message;
                    final Gr5 liz9 = linkMicSignalMessage.LIZ();
                    if (liz9 != null) {
                        final String lj = liz9.LJ;
                    }
                    final Gr5 liz10 = linkMicSignalMessage.LIZ();
                    int lji;
                    if (liz10 != null) {
                        lji = liz10.LJI;
                    }
                    else {
                        lji = -1;
                    }
                    try {
                        final Gr5 liz11 = ((LinkMicSignalMessage)message).LIZ();
                        long long1 = n;
                        if (liz11 != null) {
                            final String lizlll = liz11.LIZLLL;
                            long1 = n;
                            if (lizlll != null) {
                                long1 = Long.parseLong(lizlll);
                            }
                        }
                        final List<0xI> liziz5 = this.LIZIZ;
                        final ArrayList list3 = new ArrayList();
                        for (final Object next3 : liziz5) {
                            if (next3 instanceof 1cq) {
                                list3.add(next3);
                            }
                        }
                        final Iterator iterator6 = list3.iterator();
                        while (iterator6.hasNext()) {
                            ((1cq)iterator6.next()).LIZJ(long1, lji);
                        }
                        return;
                    }
                    catch (final Exception ex) {
                        return;
                    }
                }
                if (message instanceof LinkMessage) {
                    final LinkMessage linkMessage = (LinkMessage)message;
                    CTM.LIZ((Object)linkMessage);
                    final JSONObject jsonObject = new JSONObject();
                    0d3.LIZ(jsonObject, "event_id", "linkmic_im_dispatch");
                    final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
                    if (Room.isValid(room)) {
                        if (room == null) {
                            kotlin.jvm.internal.n.LIZIZ();
                        }
                        idStr = room.getIdStr();
                    }
                    0d3.LIZ(jsonObject, "room_id", idStr);
                    final GIK liziz6 = Fk2.LIZ().LIZIZ();
                    long lizj2;
                    if (liziz6 != null) {
                        lizj2 = liziz6.LIZJ();
                    }
                    else {
                        lizj2 = 0L;
                    }
                    final int lizj3 = linkMessage.LIZJ;
                    if (lizj3 == 2) {
                        0d3.LIZ(jsonObject, "user_id", lizj2);
                        0d3.LIZ(jsonObject, "current_scene", "Co_Host");
                    }
                    else if (lizj3 == 4) {
                        0d3.LIZ(jsonObject, "current_user_id", lizj2);
                        0d3.LIZ(jsonObject, "current_scene", "Multi_Live");
                    }
                    0d3.LIZ(jsonObject, "server_timestamp", System.currentTimeMillis() + Gl0.LIZ);
                    0d3.LIZ(jsonObject, "timestamp", System.currentTimeMillis());
                    0d3.LIZ(jsonObject, "msgId", ((H31)linkMessage).getMessageId());
                    final CommonMessageData baseMessage = ((HDi)linkMessage).baseMessage;
                    long lizj4;
                    if (baseMessage != null) {
                        lizj4 = baseMessage.LIZJ;
                    }
                    else {
                        lizj4 = 0L;
                    }
                    0d3.LIZ(jsonObject, "msg_roomid", lizj4);
                    final CommonMessageData baseMessage2 = ((HDi)linkMessage).baseMessage;
                    String ljiiliil = s;
                    if (baseMessage2 != null) {
                        ljiiliil = baseMessage2.LJIILIIL;
                        if (ljiiliil == null) {
                            ljiiliil = s;
                        }
                    }
                    0d3.LIZ(jsonObject, "logId", ljiiliil);
                    0d3.LIZ(jsonObject, "linkerId", linkMessage.LIZIZ);
                    0d3.LIZ(jsonObject, "msgType", linkMessage.LIZ);
                    0d3.LIZ(jsonObject, "scene", linkMessage.LIZJ);
                    if (Room.isValid(room)) {
                        if (room == null) {
                            kotlin.jvm.internal.n.LIZIZ();
                        }
                        n = room.getOwnerUserId();
                    }
                    Label_1283: {
                        String s3;
                        if (lizj2 == n) {
                            if (lizj3 == 2) {
                                s3 = "ttlive_client_anchor_link_mic_monitor";
                            }
                            else {
                                if (lizj3 != 4) {
                                    break Label_1283;
                                }
                                s3 = "ttlive_client_multi_live_anchor_monitor";
                            }
                        }
                        else if (lizj3 == 2) {
                            s3 = "ttlive_client_anchor_link_mic_audience_monitor";
                        }
                        else {
                            if (lizj3 != 4) {
                                break Label_1283;
                            }
                            s3 = "ttlive_client_multi_live_audience_monitor";
                        }
                        0d8.LIZ(s3, 0, jsonObject);
                    }
                    final int liz12 = linkMessage.LIZ;
                    if (liz12 != 13) {
                        if (liz12 == 14) {
                            final List<0xI> liziz7 = this.LIZIZ;
                            final ArrayList list4 = new ArrayList();
                            for (final Object next4 : liziz7) {
                                if (next4 instanceof 1cp) {
                                    list4.add(next4);
                                }
                            }
                            final Iterator iterator8 = list4.iterator();
                            while (iterator8.hasNext()) {
                                ((1cp)iterator8.next()).LJIIJJI(linkMessage);
                            }
                            return;
                        }
                        if (liz12 == 17) {
                            final List<0xI> liziz8 = this.LIZIZ;
                            final ArrayList list5 = new ArrayList();
                            for (final Object next5 : liziz8) {
                                if (next5 instanceof 1cr) {
                                    list5.add(next5);
                                }
                            }
                            final Iterator iterator10 = list5.iterator();
                            while (iterator10.hasNext()) {
                                ((1cr)iterator10.next()).LJI(linkMessage);
                            }
                            return;
                        }
                        if (liz12 == 23) {
                            final List<0xI> liziz9 = this.LIZIZ;
                            final ArrayList list6 = new ArrayList();
                            for (final Object next6 : liziz9) {
                                if (next6 instanceof 1cp) {
                                    list6.add(next6);
                                }
                            }
                            final Iterator iterator12 = list6.iterator();
                            while (iterator12.hasNext()) {
                                ((1cp)iterator12.next()).LJIIIZ(linkMessage);
                            }
                            return;
                        }
                        if (liz12 != 102) {
                            switch (liz12) {
                                case 11: {
                                    final List<0xI> liziz10 = this.LIZIZ;
                                    final ArrayList list7 = new ArrayList();
                                    for (final Object next7 : liziz10) {
                                        if (next7 instanceof 1cr) {
                                            list7.add(next7);
                                        }
                                    }
                                    final Iterator iterator14 = list7.iterator();
                                    while (iterator14.hasNext()) {
                                        ((1cr)iterator14.next()).LJFF(linkMessage);
                                    }
                                    return;
                                }
                                case 10: {
                                    final List<0xI> liziz11 = this.LIZIZ;
                                    final ArrayList list8 = new ArrayList();
                                    for (final Object next8 : liziz11) {
                                        if (next8 instanceof 1cr) {
                                            list8.add(next8);
                                        }
                                    }
                                    final Iterator iterator16 = list8.iterator();
                                    while (iterator16.hasNext()) {
                                        ((1cr)iterator16.next()).LJIILIIL(linkMessage);
                                    }
                                    return;
                                }
                                case 9: {
                                    final List<0xI> liziz12 = this.LIZIZ;
                                    final ArrayList list9 = new ArrayList();
                                    for (final Object next9 : liziz12) {
                                        if (next9 instanceof 1cp) {
                                            list9.add(next9);
                                        }
                                    }
                                    final Iterator iterator18 = list9.iterator();
                                    while (iterator18.hasNext()) {
                                        ((1cp)iterator18.next()).LIZLLL(linkMessage);
                                    }
                                    return;
                                }
                                case 8: {
                                    final List<0xI> liziz13 = this.LIZIZ;
                                    final ArrayList list10 = new ArrayList();
                                    for (final Object next10 : liziz13) {
                                        if (next10 instanceof 1cp) {
                                            list10.add(next10);
                                        }
                                    }
                                    final Iterator iterator20 = list10.iterator();
                                    while (iterator20.hasNext()) {
                                        ((1cp)iterator20.next()).LJIIL(linkMessage);
                                    }
                                    return;
                                }
                                case 7: {
                                    final List<0xI> liziz14 = this.LIZIZ;
                                    final ArrayList list11 = new ArrayList();
                                    for (final Object next11 : liziz14) {
                                        if (next11 instanceof 1cr) {
                                            list11.add(next11);
                                        }
                                    }
                                    final Iterator iterator22 = list11.iterator();
                                    while (iterator22.hasNext()) {
                                        ((1cr)iterator22.next()).LJIILJJIL(linkMessage);
                                    }
                                    return;
                                }
                                case 6: {
                                    final List<0xI> liziz15 = this.LIZIZ;
                                    final ArrayList list12 = new ArrayList();
                                    for (final Object next12 : liziz15) {
                                        if (next12 instanceof 1cr) {
                                            list12.add(next12);
                                        }
                                    }
                                    final Iterator iterator24 = list12.iterator();
                                    while (iterator24.hasNext()) {
                                        ((1cr)iterator24.next()).LJ(linkMessage);
                                    }
                                    return;
                                }
                                case 5: {
                                    final List<0xI> liziz16 = this.LIZIZ;
                                    final ArrayList list13 = new ArrayList();
                                    for (final Object next13 : liziz16) {
                                        if (next13 instanceof 1cp) {
                                            list13.add(next13);
                                        }
                                    }
                                    final Iterator iterator26 = list13.iterator();
                                    while (iterator26.hasNext()) {
                                        ((1cp)iterator26.next()).LIZJ(linkMessage);
                                    }
                                    return;
                                }
                                case 4: {
                                    final List<0xI> liziz17 = this.LIZIZ;
                                    final ArrayList list14 = new ArrayList();
                                    for (final Object next14 : liziz17) {
                                        if (next14 instanceof 1cp) {
                                            list14.add(next14);
                                        }
                                    }
                                    final Iterator iterator28 = list14.iterator();
                                    while (iterator28.hasNext()) {
                                        ((1cp)iterator28.next()).LJIIJ(linkMessage);
                                    }
                                    return;
                                }
                                case 3: {
                                    final List<0xI> liziz18 = this.LIZIZ;
                                    final ArrayList list15 = new ArrayList();
                                    for (final Object next15 : liziz18) {
                                        if (next15 instanceof 1cp) {
                                            list15.add(next15);
                                        }
                                    }
                                    final Iterator iterator30 = list15.iterator();
                                    while (iterator30.hasNext()) {
                                        ((1cp)iterator30.next()).LIZIZ(linkMessage);
                                    }
                                    return;
                                }
                                case 2: {
                                    final List<0xI> liziz19 = this.LIZIZ;
                                    final ArrayList list16 = new ArrayList();
                                    for (final Object next16 : liziz19) {
                                        if (next16 instanceof 1cp) {
                                            list16.add(next16);
                                        }
                                    }
                                    final Iterator iterator32 = list16.iterator();
                                    while (iterator32.hasNext()) {
                                        ((1cp)iterator32.next()).LIZ(linkMessage);
                                    }
                                }
                            }
                        }
                        else {
                            final List<0xI> liziz20 = this.LIZIZ;
                            final ArrayList list17 = new ArrayList();
                            for (final Object next17 : liziz20) {
                                if (next17 instanceof 1cp) {
                                    list17.add(next17);
                                }
                            }
                            final Iterator iterator34 = list17.iterator();
                            while (iterator34.hasNext()) {
                                ((1cp)iterator34.next()).LJIIIIZZ(linkMessage);
                            }
                        }
                    }
                    else {
                        final List<0xI> liziz21 = this.LIZIZ;
                        final ArrayList list18 = new ArrayList();
                        for (final Object next18 : liziz21) {
                            if (next18 instanceof 1cp) {
                                list18.add(next18);
                            }
                        }
                        final Iterator iterator36 = list18.iterator();
                        while (iterator36.hasNext()) {
                            ((1cp)iterator36.next()).LJII(linkMessage);
                        }
                    }
                }
            }
            return;
        }
        final LinkMicAnchorGuideMessage linkMicAnchorGuideMessage = (LinkMicAnchorGuideMessage)message;
        if (linkMicAnchorGuideMessage.LIZLLL != 2) {
            return;
        }
        final List<0xI> liziz22 = this.LIZIZ;
        final ArrayList list19 = new ArrayList();
        for (final Object next19 : liziz22) {
            if (next19 instanceof 1cn) {
                list19.add(next19);
            }
        }
        final Iterator iterator38 = list19.iterator();
        while (iterator38.hasNext()) {
            ((1cn)iterator38.next()).LIZ(linkMicAnchorGuideMessage);
        }
    }
}
