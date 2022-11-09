// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.chatroom.interact.model.LinkerInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.UserInfo;
import android.os.SystemClock;
import java.util.EnumMap;
import com.bytedance.android.livesdkapi.depend.model.live.AgeRestricted;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo$Tag;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteMessageExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.InviterRivalExtra;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Collection;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 0xm
{
    public static long LIZ;
    public static final 0xm LIZIZ;
    public static long LIZJ;
    public static final 5DO LIZLLL;
    
    static {
        Covode.recordClassIndex(10327);
        LIZIZ = new 0xm();
        LIZLLL = 3Os.LIZ((QgG)29K.LIZ);
    }
    
    public static final void LIZ(final int n, final String s, final Map<String, String> map) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        LIZIZ(0xm.LIZIZ, hashMap);
        hashMap.put("mutual_follow_cnts", String.valueOf(n));
        hashMap.put("left_type", s);
        final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
        final ArrayList list = new ArrayList();
        for (final 0pc next : coHostUserList) {
            if (next.LIZIZ() ^ true) {
                list.add(next);
            }
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)list2, 10));
        for (final 0pc 0pc : list2) {
            long n2;
            if (0pc.LIZLLL() && 0pc.LJFF == 0pg.APPLYING) {
                n2 = 0pc.LIZIZ;
            }
            else {
                n2 = 0pc.LJIILIIL;
            }
            list3.add((Object)n2);
        }
        final List list4 = list3;
        hashMap.put("invite_cnts", String.valueOf(list4.size()));
        hashMap.put("uid_list", list4.toString());
        if (map != null) {
            hashMap.putAll(map);
        }
        LIZ("livesdk_connection_list_show", hashMap);
    }
    
    public static /* synthetic */ void LIZ(final 0xm 0xm, final Map map) {
        0xm.LIZ(map, (List<0pc>)null);
    }
    
    private void LIZ(final String s, final long n) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        hashMap.put("turnover_type", s);
        if (1NN.LLFF.LIZ().LJ != 0L) {
            hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        }
        final boolean equals = TextUtils.equals((CharSequence)s, (CharSequence)"create");
        final int n2 = 1;
        List list2;
        if (equals) {
            final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
            final ArrayList list = new ArrayList();
            for (final 0pc next : coHostUserList) {
                if (next.LIZLLL()) {
                    list.add(next);
                }
            }
            list2 = list;
        }
        else {
            final List<0pc> coHostUserList2 = 0jz.LIZLLL().getCoHostUserList();
            final ArrayList list3 = new ArrayList();
            for (final 0pc next2 : coHostUserList2) {
                final 0pc 0pc = next2;
                if (0pc.LJFF == 0pg.LINKED && (!TextUtils.equals((CharSequence)s, (CharSequence)"left") || 0pc.LJIILIIL != n)) {
                    list3.add(next2);
                }
            }
            list2 = list3;
        }
        this.LIZ(hashMap, list2);
        final Collection collection = list2;
        int n3 = n2;
        Label_0388: {
            if (!collection.isEmpty()) {
                final Iterator iterator3 = list2.iterator();
                while (true) {
                    n3 = n2;
                    if (!iterator3.hasNext()) {
                        break Label_0388;
                    }
                    if (((0pc)iterator3.next()).LJIIIIZZ == 2L) {
                        continue;
                    }
                    if (!collection.isEmpty()) {
                        final Iterator iterator4 = list2.iterator();
                        while (iterator4.hasNext()) {
                            if (((0pc)iterator4.next()).LJIIIIZZ == 2L) {
                                n3 = 2;
                                break Label_0388;
                            }
                        }
                        break;
                    }
                    break;
                }
                n3 = 0;
            }
        }
        hashMap.put("follow_status", String.valueOf(n3));
        hashMap.put("turnover_anchor_id", String.valueOf(n));
        LIZ("livesdk_connection_anchor_turnover", hashMap);
    }
    
    public static final void LIZ(String s, final 0k3 0k3) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        hashMap.put("request_page", "room");
        hashMap.put("click_reason", s);
        final 0xm liziz = 0xm.LIZIZ;
        liziz.LIZ(hashMap, 0k3);
        liziz.LJ(hashMap);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final Object o = null;
        Long value;
        if (room != null) {
            value = room.getId();
        }
        else {
            value = null;
        }
        hashMap.put("room_id", String.valueOf(value));
        Object value2 = o;
        if (room != null) {
            value2 = room.getOwnerUserId();
        }
        hashMap.put("anchor_id", String.valueOf(value2));
        final String ljljlll = 1NN.LLFF.LIZ().LJLJLLL;
        final String s2 = s = "0";
        if (ljljlll != null) {
            s = s2;
            if (n.LIZ((Object)"0", (Object)ljljlll) ^ true) {
                s = "1";
            }
        }
        hashMap.put("is_anchor_icon_show", s);
        final String ljljlj = 1NN.LLFF.LIZ().LJLJLJ;
        if (ljljlll == null || ljljlll.length() == 0) {
            hashMap.put("log_id", "");
        }
        else {
            hashMap.put("to_anchor_id", ljljlll);
            if ((s = ljljlj) == null) {
                s = "";
            }
            hashMap.put("log_id", s);
        }
        if (1NN.LLFF.LIZ().LJ != 0L) {
            hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        }
        LIZ("livesdk_connection_icon_click", hashMap);
    }
    
    public static final void LIZ(final String s, final LinkerInviteContent linkerInviteContent, final int n, final boolean b, final boolean b2) {
        CTM.LIZ((Object)linkerInviteContent);
        final long liz = linkerInviteContent.LIZ;
        final LinkerInviteMessageExtra ljiil = linkerInviteContent.LJIIL;
        List list2 = null;
        Label_0106: {
            if (ljiil != null) {
                final List ljiiiizz = ljiil.LJIIIIZZ;
                if (ljiiiizz != null) {
                    final ArrayList list = new ArrayList(6Jd.LIZ((Iterable)ljiiiizz, 10));
                    final Iterator iterator = ljiiiizz.iterator();
                    while (iterator.hasNext()) {
                        list.add((Object)((InviterRivalExtra)iterator.next()).LJIIJJI);
                    }
                    list2 = list;
                    break Label_0106;
                }
            }
            list2 = new ArrayList();
        }
        final ArrayList list3 = new ArrayList();
        if (liz > 0L) {
            list3.add(liz);
        }
        list3.addAll(list2);
        a a;
        if (b2) {
            a = 0xm.a.INVITE_WITHDRAW;
        }
        else if (b) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 5) {
                        a = 0xm.a.UNKNOW;
                    }
                    else {
                        a = 0xm.a.OVER_TIME;
                    }
                }
                else {
                    a = 0xm.a.REJECT;
                }
            }
            else {
                a = 0xm.a.ACCEPT;
            }
        }
        else if (n != 1) {
            if (n != 2) {
                if (n != 5) {
                    a = 0xm.a.UNKNOW;
                }
                else {
                    a = 0xm.a.OVER_TIME;
                }
            }
            else {
                a = 0xm.a.REJECT;
            }
        }
        else {
            a = 0xm.a.ACCEPT;
        }
        0xm.LIZIZ.LIZ(s, a.getValue(), b, list3);
    }
    
    public static final void LIZ(String s, final Room room, final int n, final RivalExtraInfo rivalExtraInfo, final boolean b) {
        CTM.LIZ((Object)s);
        if (room != null && room.getOwner() != null) {
            int n2;
            if (rivalExtraInfo != null && rivalExtraInfo.LJFF == 0) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            String s2;
            if (n == 1) {
                s2 = "mutual_follow";
            }
            else {
                s2 = "recommend";
            }
            final HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("connection_inviter_id", String.valueOf(0py.LIZ()));
            hashMap.put("connection_invitee_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("invitee_list", s2);
            hashMap.put("invitee_status", String.valueOf(n2));
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("invited_room_id", idStr);
            if (!TextUtils.isEmpty((CharSequence)s)) {
                hashMap.put("request_id", s);
            }
            LIZIZ(0xm.LIZIZ, hashMap);
            if (rivalExtraInfo != null && rivalExtraInfo.LJII == 5Fw.PLAYTYPE_APPLY.value) {
                s = "apply";
            }
            else {
                s = "invite";
            }
            hashMap.put("status", s);
            hashMap.put("is_clickable", String.valueOf(n2));
            hashMap.put("invitee_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("is_icon_show_anchor", String.valueOf((int)(b ? 1 : 0)));
            while (true) {
                Label_0309: {
                    if (rivalExtraInfo == null) {
                        break Label_0309;
                    }
                    final RivalExtraInfo$Tag ljiiiz = rivalExtraInfo.LJIIIZ;
                    if (ljiiiz == null) {
                        break Label_0309;
                    }
                    final Integer value = ljiiiz.LIZ;
                    hashMap.put("relation_type", String.valueOf(value));
                    LIZ("livesdk_connection_invite_show", hashMap);
                    return;
                }
                final Integer value = null;
                continue;
            }
        }
    }
    
    private final void LIZ(final String s, final Room room, String s2) {
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        LIZIZ(this, hashMap);
        final boolean liz = n.LIZ((Object)1NN.LLFF.LIZ().LJLJI.getLabel(), (Object)"inviter");
        int n = 1;
        if (liz ^ true) {
            hashMap.remove("enter_from");
        }
        final 1NN liz2 = 1NN.LLFF.LIZ();
        0xg.LIZ(hashMap, liz2.LJIILL, true);
        if (liz2.LJIILL != 0kf.RANDOM_LINK_MIC_INVITE) {
            hashMap.put("time_stamp", String.valueOf(0xm.LIZJ));
        }
        final String liziz = 0xy.LIZIZ();
        final String s3 = "";
        kotlin.jvm.internal.n.LIZIZ((Object)liziz, "");
        hashMap.put("invite_scene", liziz);
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            hashMap.put("click_type", s2);
        }
        if (liz2.LJ != 0L) {
            hashMap.put("channel_id", String.valueOf(liz2.LJ));
        }
        if (!TextUtils.isEmpty((CharSequence)liz2.LJJLIIIJILLIZJL)) {
            hashMap.put("request_id", liz2.LJJLIIIJILLIZJL);
        }
        hashMap.put("connection_inviter_id", String.valueOf(0py.LIZ()));
        final User owner = room.getOwner();
        kotlin.jvm.internal.n.LIZIZ((Object)owner, "");
        if (!TextUtils.isEmpty((CharSequence)owner.getIdStr())) {
            final User owner2 = room.getOwner();
            kotlin.jvm.internal.n.LIZIZ((Object)owner2, "");
            s2 = owner2.getIdStr();
            kotlin.jvm.internal.n.LIZIZ((Object)s2, "");
            hashMap.put("connection_invitee_id", s2);
            if (kotlin.jvm.internal.n.LIZ((Object)s, (Object)"livesdk_connection_invite_send_success")) {
                final User owner3 = room.getOwner();
                kotlin.jvm.internal.n.LIZIZ((Object)owner3, "");
                s2 = owner3.getIdStr();
                kotlin.jvm.internal.n.LIZIZ((Object)s2, "");
                hashMap.put("invitee_id", s2);
            }
        }
        s2 = 1NN.LLFF.LIZ().LJLJLLL;
        final long longValue = room.getOwnerUserId();
        if (s2 == null || !kotlin.jvm.internal.n.LIZ((Object)s2, (Object)String.valueOf(longValue))) {
            n = 0;
        }
        if (n != 0) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        hashMap.put("is_icon_show_anchor", s2);
        s2 = liz2.LJLJLJ;
        if (s2 == null) {
            s2 = s3;
        }
        hashMap.put("log_id", s2);
        final Room room2 = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final AgeRestricted ageRestricted = room.ageRestricted;
        if (ageRestricted != null && ageRestricted.ageInterval == 0) {
            hashMap.put("is_invitee_mature", "0");
        }
        else {
            final AgeRestricted ageRestricted2 = room.ageRestricted;
            if (ageRestricted2 != null && ageRestricted2.ageInterval == 4) {
                hashMap.put("is_invitee_mature", "1");
            }
        }
        if (room2 != null) {
            final AgeRestricted ageRestricted3 = room2.ageRestricted;
            if (ageRestricted3 != null && ageRestricted3.ageInterval == 0) {
                hashMap.put("is_inviter_mature", "0");
            }
            else {
                final AgeRestricted ageRestricted4 = room2.ageRestricted;
                if (ageRestricted4 != null && ageRestricted4.ageInterval == 4) {
                    hashMap.put("is_inviter_mature", "1");
                }
            }
        }
        hashMap.put("relation_type", String.valueOf(liz2.LJLL));
        this.LIZ(hashMap, liz2.LJIILL);
        LIZ(s, hashMap);
    }
    
    private final void LIZ(final String s, final String s2, final String s3) {
        1NN.LLFF.LIZ();
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "manual_pk");
        String s4;
        if (0jz.LIZLLL().isEnableSDK() && 0jz.LIZLLL().getCoHostUserList().size() > 2) {
            s4 = "1";
        }
        else {
            s4 = "0";
        }
        hashMap.put("is_multi", s4);
        hashMap.put("pk_id", s2);
        this.LIZ(s, s3, hashMap);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_connection_invited_dismiss");
        liz.LIZ();
        liz.LIZ((Map)hashMap);
        liz.LIZLLL();
    }
    
    private final void LIZ(final String s, final String s2, final Map<String, String> map) {
        final 1NN liz = 1NN.LLFF.LIZ();
        map.put("dismiss_reason", s2);
        if (liz.LJ != 0L) {
            map.put("channel_id", String.valueOf(liz.LJ));
        }
        else if (GTi.LIZ((CharSequence)s)) {
            map.put("channel_id", String.valueOf(s));
        }
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final Object o = null;
        Long value;
        if (room != null) {
            value = room.getOwnerUserId();
        }
        else {
            value = null;
        }
        map.put("anchor_id", String.valueOf(value));
        Object value2 = o;
        if (room != null) {
            value2 = room.getId();
        }
        map.put("room_id", String.valueOf(value2));
    }
    
    private final void LIZ(final String s, final String s2, final boolean b, final List<Long> list) {
        1NN.LLFF.LIZ();
        final HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        hashMap.put("popup_uid_cnts", String.valueOf(list.size()));
        String s3;
        if (b) {
            s3 = "application";
        }
        else {
            s3 = "invitation";
        }
        hashMap.put("show_type", s3);
        this.LIZ(s, s2, hashMap);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_connection_invited_dismiss");
        liz.LIZ();
        liz.LIZ((Map)hashMap);
        liz.LIZLLL();
    }
    
    public static final void LIZ(final String s, final Map<String, String> map) {
        final Gkn liz = Gkn.LJFF.LIZ(s);
        liz.LIZ();
        liz.LIZ((Map)map);
        liz.LIZLLL();
    }
    
    private final void LIZ(final Map<String, String> map, final List<0pc> list) {
        Object coHostLinkedUserList = list;
        if (list == null) {
            coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
        }
        final ArrayList list2 = new ArrayList(6Jd.LIZ((Iterable)coHostLinkedUserList, 10));
        final Iterator iterator = ((Iterable)coHostLinkedUserList).iterator();
        while (iterator.hasNext()) {
            list2.add((Object)((0pc)iterator.next()).LJIILIIL);
        }
        final List list3 = list2;
        map.put("current_connection_cnts", String.valueOf(list3.size()));
        map.put("uid_list", list3.toString());
    }
    
    public static final void LIZ(final boolean b, final long n) {
        final Gnh gnh = new Gnh();
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return;
        }
        if (!b) {
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_connection_transform");
            liz.LJ("live_detail");
            liz.LIZJ("live");
            liz.LIZLLL("other");
            liz.LIZ(gnh);
            liz.LIZ();
            final HashMap hashMap = new HashMap();
            final String idStr = room.getIdStr();
            n.LIZIZ((Object)idStr, "");
            hashMap.put("room_id", idStr);
            LIZ(0xm.LIZIZ, hashMap);
            liz.LIZ("anchor_id", room.getOwnerUserId());
            if (1NN.LLFF.LIZ().LJ != 0L) {
                liz.LIZ("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
            }
            else if (n != 0L) {
                liz.LIZ("channel_id", String.valueOf(n));
            }
            final List<0pc> coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
            final ArrayList list = new ArrayList();
            for (final 0pc next : coHostLinkedUserList) {
                if (next.LJIILIIL != room.getOwnerUserId()) {
                    list.add(next);
                }
            }
            final List list2 = list;
            final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)list2, 10));
            final Iterator iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list3.add((Object)((0pc)iterator2.next()).LJIILIIL);
            }
            hashMap.put("connection_type", "anchor");
            liz.LIZ("opposite_anchor_id", list3.toString());
            String s;
            if (coHostLinkedUserList.size() > 2) {
                s = "1";
            }
            else {
                s = "0";
            }
            liz.LIZ("is_multi", s);
            liz.LIZ((Map)hashMap);
            liz.LIZLLL();
        }
    }
    
    public static final void LIZ(final boolean b, final long n, final List<Long> list) {
        CTM.LIZ((Object)list);
        0xm.LIZ = System.currentTimeMillis();
        final HashMap hashMap = new HashMap();
        0xm.LIZIZ.LIZ(hashMap, b, n, list);
        LIZ("livesdk_connection_invited_received", hashMap);
    }
    
    private final boolean LIZ(final List<Long> list, final List<Long> list2) {
        if (!list2.contains(0py.LIZ())) {
            return false;
        }
        if (list.isEmpty() && list2.size() == 2 && 1NN.LLFF.LIZ().LJLLLLLL == 0py.LIZ()) {
            this.LIZ("create", 0py.LIZ());
            final ArrayList list3 = new ArrayList();
            for (final Long next : list2) {
                final Long n = next;
                final long liz = 0py.LIZ();
                if (n != null && n == liz) {
                    continue;
                }
                list3.add(next);
            }
            final Long n2 = list3.get(0);
            if (n2 != null) {
                0xm.LIZIZ.LIZ("enter", n2.longValue());
            }
            return true;
        }
        return false;
    }
    
    public static /* synthetic */ void LIZIZ(final 0xm 0xm, final Map map) {
        0xm.LIZ(map, 1NN.LLFF.LIZ().LJJLIIIJ);
    }
    
    public static final void LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        hashMap.put("show_reason", s);
        final 0xm liziz = 0xm.LIZIZ;
        LIZIZ(liziz, hashMap);
        liziz.LJI(hashMap);
        LIZ("livesdk_multi_connection_guide_show", hashMap);
    }
    
    private void LIZIZ(final Map<String, String> map, final 0k3 0k3) {
        CTM.LIZ((Object)map);
        if (0k3 != null && 0k3.LIZ()) {
            String s;
            if (0k3.LIZ) {
                s = "random_notice";
            }
            else {
                s = "normal_notice";
            }
            map.put("notice_type", s);
        }
        if (n.LIZ((Object)1NN.LLFF.LIZ().LJLJI.getLabel(), (Object)"inviter")) {
            String s2 = "0";
            map.put("is_multi_bubble_guide", "0");
            String lizj = null;
            Label_0129: {
                if (0k3 != null) {
                    final Boolean liziz = 0k3.LIZIZ;
                    if (liziz != null) {
                        if (liziz) {
                            s2 = "1";
                        }
                        map.put("is_multi_bubble_guide", s2);
                    }
                    if ((lizj = 0k3.LIZJ) != null) {
                        break Label_0129;
                    }
                }
                lizj = "";
            }
            map.put("enter_from", lizj);
        }
    }
    
    private final boolean LIZIZ(final List<Long> list, final List<Long> list2) {
        if (!list2.contains(0py.LIZ())) {
            return false;
        }
        if (list.isEmpty() && list2.size() == 2 && 1NN.LLFF.LIZ().LJLZ == 0py.LIZ()) {
            this.LIZ("enter", 0py.LIZ());
            return true;
        }
        if (list2.size() == list.size() + 1) {
            final ArrayList list3 = new ArrayList();
            for (final Object next : list2) {
                if (list.contains(next) ^ true) {
                    list3.add(next);
                }
            }
            final List list4 = list3;
            if (list4.isEmpty() ^ true) {
                final Long n = list4.get(0);
                long longValue;
                if (n != null) {
                    longValue = n;
                }
                else {
                    longValue = 0L;
                }
                this.LIZ("enter", longValue);
            }
            return true;
        }
        if (list2.size() > list.size()) {
            this.LIZ("enter", 0py.LIZ());
            return true;
        }
        return false;
    }
    
    public static /* synthetic */ void LIZJ(final 0xm 0xm, final Map map) {
        0xm.LIZIZ(map, 1NN.LLFF.LIZ().LJJLIIIJ);
    }
    
    private final boolean LIZJ(final List<Long> list, final List<Long> list2) {
        if (list2.size() < list.size()) {
            final ArrayList list3 = new ArrayList();
            for (final Object next : list) {
                if (true ^ list2.contains(next)) {
                    list3.add(next);
                }
            }
            final List list4 = list3;
            if (list4.isEmpty() ^ true) {
                final Long n = list4.get(0);
                long longValue;
                if (n != null) {
                    longValue = n;
                }
                else {
                    longValue = 0L;
                }
                this.LIZ("left", longValue);
                return true;
            }
        }
        return false;
    }
    
    private final void LJI(final Map<String, String> map) {
        final String ljjliiijillizjl = 1NN.LLFF.LIZ().LJJLIIIJILLIZJL;
        if (!TextUtils.isEmpty((CharSequence)ljjliiijillizjl)) {
            map.put("request_id", ljjliiijillizjl);
        }
    }
    
    public final EnumMap<5E1, List<Vwg>> LIZ() {
        return (EnumMap)0xm.LIZLLL.getValue();
    }
    
    public final void LIZ(final Room room) {
        CTM.LIZ((Object)room);
        final 1NN liz = 1NN.LLFF.LIZ();
        if (!liz.LJLIIIL) {
            return;
        }
        this.LIZ().clear();
        if (liz.LJJJJLL > 0L) {
            if (liz.LJZ != 0L) {
                final User owner = room.getOwner();
                long id;
                if (owner != null) {
                    id = owner.getId();
                }
                else {
                    id = 0L;
                }
                this.LIZ("left", id);
            }
            else {
                final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
                if (!coHostUserList.isEmpty()) {
                    final ArrayList list = new ArrayList();
                    for (final Object next : coHostUserList) {
                        if (((0pc)next).LJIILIIL != room.getOwnerUserId()) {
                            list.add(next);
                        }
                    }
                    final List list2 = list;
                    if (!list2.isEmpty()) {
                        this.LIZ("left", ((0pc)list2.get(0)).LJIILIIL);
                    }
                }
            }
        }
        liz.LJLIIIL = false;
        final HashMap hashMap = new HashMap();
        LIZIZ(this, hashMap);
        final Gnh gnh = new Gnh();
        long n = SystemClock.elapsedRealtime() - liz.LJJJJZ;
        if (liz.LJJJJLL > 0L) {
            n = SystemClock.elapsedRealtime() - liz.LJJJJLL;
        }
        final long n2 = n / 1000L;
        gnh.LIZLLL = String.valueOf(n2);
        hashMap.put("connection_type", "anchor");
        hashMap.put("invited_room_id", String.valueOf(liz.LJIIIIZZ));
        hashMap.put("connection_inviter_id", String.valueOf(liz.LJLLL));
        hashMap.put("connection_invitee_id", String.valueOf(liz.LJLLLL));
        final String label = 1NN.LLFF.LIZ().LJLJI.getLabel();
        if (kotlin.jvm.internal.n.LIZ((Object)label, (Object)0k2.IDLE.getLabel()) ^ true) {
            hashMap.put("anchor_type", label);
        }
        else if (kotlin.jvm.internal.n.LIZ((Object)1NN.LLFF.LIZ().LJLJJI, (Object)0k2.IDLE.getLabel()) ^ true) {
            hashMap.put("anchor_type", 1NN.LLFF.LIZ().LJLJJI);
        }
        final String ljjijlij = liz.LJJIJLIJ;
        final String s = "";
        String s2;
        if ((s2 = ljjijlij) == null) {
            s2 = "";
        }
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            hashMap.put("request_id", s2);
        }
        String s3;
        if (1NN.LLFF.LIZ().LJJJLZIJ) {
            s3 = "positive_over";
        }
        else {
            s3 = "negative_over";
        }
        hashMap.put("over_type", s3);
        final boolean ljjjz = 1NN.LLFF.LIZ().LJJJZ;
        final String s4 = "1";
        if (ljjjz) {
            hashMap.put("is_live_end", "1");
        }
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, true);
        String s5;
        if (n2 > 10L) {
            s5 = "1";
        }
        else {
            s5 = "0";
        }
        hashMap.put("is_effective_connection", s5);
        hashMap.put("connection_duration", String.valueOf(n));
        hashMap.put("event_type", String.valueOf(1NN.LLFF.LIZ().LJIILL.getType()));
        0xg.LIZ(hashMap);
        this.LJFF(hashMap);
        final List<0pc> coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
        final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)coHostLinkedUserList, 10));
        final Iterator<Object> iterator2 = coHostLinkedUserList.iterator();
        while (iterator2.hasNext()) {
            list3.add((Object)iterator2.next().LJIILIIL);
        }
        final List list4 = list3;
        if (list4.size() > 0) {
            hashMap.put("current_connection_cnts", String.valueOf(list4.size()));
            hashMap.put("uid_list", list4.toString());
        }
        else {
            hashMap.put("current_connection_cnts", String.valueOf(1NN.LLFF.LIZ().LJLJJL.size()));
            final String string = 1NN.LLFF.LIZ().LJLJJL.toString();
            kotlin.jvm.internal.n.LIZIZ((Object)string, "");
            hashMap.put("uid_list", string);
        }
        if (1NN.LLFF.LIZ().LJIIZILJ) {
            final String ljljlll = 1NN.LLFF.LIZ().LJLJLLL;
            1NN.LLFF.LIZ().LJLJLLL = "";
            String s6;
            if (ljljlll != null && kotlin.jvm.internal.n.LIZ((Object)ljljlll, (Object)String.valueOf(1NN.LLFF.LIZ().LJFF))) {
                s6 = "1";
            }
            else {
                s6 = "0";
            }
            hashMap.put("is_icon_show_anchor", s6);
        }
        if (liz.LJ != 0L) {
            hashMap.put("channel_id", String.valueOf(liz.LJ));
        }
        String ljljlj = 1NN.LLFF.LIZ().LJLJLJ;
        if (ljljlj == null) {
            ljljlj = s;
        }
        hashMap.put("log_id", ljljlj);
        hashMap.put("relation_type", String.valueOf(1NN.LLFF.LIZ().LJLL));
        String s7;
        if (1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
            s7 = s4;
        }
        else {
            s7 = "0";
        }
        hashMap.put("is_quick_recommend", s7);
        final Gkn liz2 = Gkn.LJFF.LIZ("connection_over");
        liz2.LIZ(gnh);
        liz2.LIZ((Map)hashMap);
        liz2.LIZ();
        liz2.LIZLLL();
    }
    
    public final void LIZ(final Room room, final String s) {
        CTM.LIZ((Object)room, (Object)s);
        0xm.LIZJ = System.currentTimeMillis();
        this.LIZ("livesdk_connection_invite", room, s);
    }
    
    public final void LIZ(final Room room, final List<Vwg> list) {
        CTM.LIZ((Object)list);
        final 1NN liz = 1NN.LLFF.LIZ();
        if (liz.LJLIIIL) {
            return;
        }
        if (list.size() >= 2) {
            final ArrayList list2 = new ArrayList(6Jd.LIZ((Iterable)list, 10));
            final Iterator<Object> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add((Object)iterator.next().LIZIZ);
            }
            if (list2.contains(0py.LIZ())) {
                liz.LJLIIIL = true;
                final HashMap hashMap = new HashMap();
                hashMap.put("connection_inviter_id", String.valueOf(1NN.LLFF.LIZ().LJLLLLLL));
                hashMap.put("connection_invitee_id", String.valueOf(1NN.LLFF.LIZ().LJLZ));
                this.LIZ("livesdk_connection_success", room, hashMap);
            }
        }
    }
    
    public final void LIZ(final String s, final Room room, final Map<String, String> map) {
        CTM.LIZ((Object)s, (Object)map);
        final 1NN liz = 1NN.LLFF.LIZ();
        map.put("connection_type", "anchor");
        map.put("invited_room_id", String.valueOf(liz.LJIIIIZZ));
        map.put("time_stamp", String.valueOf(System.currentTimeMillis()));
        while (true) {
            for (final 0pc next : 0jz.LIZLLL().getCoHostUserList()) {
                final 0pc 0pc = next;
                if (!0pc.LIZLLL() && 0pc.LIZJ() && 0pc.LJFF == 0pg.LINKED) {
                    final 0pc 0pc2 = next;
                    String ljiiiz;
                    if (0pc2 == null || (ljiiiz = 0pc2.LJIIIZ) == null) {
                        ljiiiz = "";
                    }
                    if (!TextUtils.isEmpty((CharSequence)ljiiiz)) {
                        map.put("request_id", ljiiiz);
                    }
                    final 0kf ljiill = 1NN.LLFF.LIZ().LJIILL;
                    0xg.LIZ(map, ljiill, true);
                    final 0k2 ljlji = liz.LJLJI;
                    if ((ljiill == 0kf.FOLLOW_INVITE || ljiill == 0kf.RECOMMEND_INVITE) && ljlji != 0k2.INVITEE && 0xm.LIZJ > 0L) {
                        map.put("invite_to_success_dur", String.valueOf(System.currentTimeMillis() - 0xm.LIZJ));
                    }
                    LIZJ(this, map);
                    this.LJFF(map);
                    this.LJ(map);
                    final List<0pc> coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
                    final ArrayList list = new ArrayList(6Jd.LIZ((Iterable)coHostLinkedUserList, 10));
                    final Iterator<Object> iterator2 = coHostLinkedUserList.iterator();
                    while (iterator2.hasNext()) {
                        list.add((Object)iterator2.next().LJIILIIL);
                    }
                    final List list2 = list;
                    map.put("current_connection_cnts", String.valueOf(list2.size()));
                    map.put("uid_list", list2.toString());
                    if (liz.LJ != 0L) {
                        map.put("channel_id", String.valueOf(liz.LJ));
                    }
                    map.put("relation_type", String.valueOf(liz.LJLL));
                    this.LIZ(map, ljiill);
                    0xg.LIZ(map);
                    final String s2 = "1";
                    if (room != null) {
                        final AgeRestricted ageRestricted = room.ageRestricted;
                        if (ageRestricted != null && ageRestricted.ageInterval == 0) {
                            map.put("is_invitee_mature", "0");
                            map.put("is_inviter_mature", "0");
                        }
                        else {
                            final AgeRestricted ageRestricted2 = room.ageRestricted;
                            if (ageRestricted2 != null && ageRestricted2.ageInterval == 4) {
                                map.put("is_invitee_mature", "1");
                                map.put("is_inviter_mature", "1");
                            }
                        }
                    }
                    String s3;
                    if (1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
                        s3 = s2;
                    }
                    else {
                        s3 = "0";
                    }
                    map.put("is_quick_recommend", s3);
                    LIZ(s, map);
                    return;
                }
            }
            0pc next = null;
            continue;
        }
    }
    
    public final void LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final HashMap hashMap = new HashMap();
        hashMap.put("withdraw_type", s);
        hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        if (TextUtils.isEmpty((CharSequence)s2)) {
            if (n.LIZ((Object)s, (Object)0q4.APPLY_INVITE.getLabel()) || n.LIZ((Object)s, (Object)0q4.APPLY_PAIR.getLabel())) {
                final Room ljjj = 1NN.LLFF.LIZ().LJJJ;
                Long value;
                if (ljjj != null) {
                    value = ljjj.getOwnerUserId();
                }
                else {
                    value = null;
                }
                final List lizj = Ey9.LIZJ((Object[])new Long[] { value });
                final RivalExtraInfo ljjji = 1NN.LLFF.LIZ().LJJJI;
                if (ljjji != null) {
                    final LinkerInfo lji = ljjji.LJI;
                    if (lji != null) {
                        final List liz = lji.LIZ;
                        if (liz != null) {
                            final ArrayList list = new ArrayList();
                            for (final Object next : liz) {
                                final long liz2 = ((UserInfo)next).LIZ;
                                if (value != null && liz2 == value) {
                                    continue;
                                }
                                list.add(next);
                            }
                            final Iterator iterator2 = list.iterator();
                            while (iterator2.hasNext()) {
                                lizj.add(((UserInfo)iterator2.next()).LIZ);
                            }
                        }
                    }
                }
                hashMap.put("uid_list", lizj.toString());
            }
            else {
                this.LIZ(hashMap);
            }
        }
        else {
            hashMap.put("uid_list", FIT.LIZ((Object)s2).toString());
        }
        0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, true);
        LIZ("livesdk_connection_withdraw", hashMap);
    }
    
    public final void LIZ(final String s, final String s2, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        CTM.LIZ((Object)s2);
        a a;
        if (b) {
            a = 0xm.a.INVITE_WITHDRAW;
        }
        else if (b2) {
            a = 0xm.a.OVER_TIME;
        }
        else if (b3) {
            a = 0xm.a.REJECT;
        }
        else if (b4) {
            a = 0xm.a.OTHERS_REJECT;
        }
        else if (b5) {
            a = 0xm.a.ACCEPT;
        }
        else {
            a = 0xm.a.UNKNOW;
        }
        this.LIZ(s, s2, a.getValue());
    }
    
    public final void LIZ(final List<Vwg> list, final List<Vwg> list2, final List<Vwg> list3) {
        CTM.LIZ((Object)list, (Object)list2, (Object)list3);
        List list4;
        if ((list4 = this.LIZ().get(5E1.LINKED)) == null) {
            list4 = new ArrayList();
        }
        List list5;
        if ((list5 = this.LIZ().get(5E1.APPLICANT)) == null) {
            list5 = new ArrayList();
        }
        List list6;
        if ((list6 = this.LIZ().get(5E1.INVITEE)) == null) {
            list6 = new ArrayList();
        }
        final ArrayList list7 = new ArrayList(6Jd.LIZ((Iterable)list, 10));
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            list7.add(iterator.next().LIZIZ);
        }
        final List lji = Qsi.LJI((Collection)list7);
        final ArrayList list8 = new ArrayList(6Jd.LIZ((Iterable)list4, 10));
        final Iterator iterator2 = list4.iterator();
        while (iterator2.hasNext()) {
            list8.add((Object)((Vwg)iterator2.next()).LIZIZ);
        }
        final List lji2 = Qsi.LJI((Collection)list8);
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        if (!lji.contains(liziz.LIZJ())) {
            return;
        }
        if (!this.LIZ(lji2, lji) && !this.LIZIZ(lji2, lji)) {
            this.LIZJ(lji2, lji);
        }
        list4.clear();
        list5.clear();
        list6.clear();
        list4.addAll(list);
        list5.addAll(list2);
        list6.addAll(list3);
        this.LIZ().put(5E1.LINKED, list4);
        this.LIZ().put(5E1.APPLICANT, list5);
        this.LIZ().put(5E1.INVITEE, list6);
    }
    
    public final void LIZ(final Map<String, String> map) {
        final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
        final ArrayList list = new ArrayList();
        for (final 0pc next : coHostUserList) {
            if (next.LIZJ()) {
                list.add(next);
            }
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add((Object)((0pc)iterator2.next()).LJIILIIL);
        }
        final String string = list3.toString();
        string.toString();
        map.put("uid_list", string);
    }
    
    public final void LIZ(final Map<String, String> map, final 0k3 0k3) {
        CTM.LIZ((Object)map);
        if (0k3 != null && 0k3.LIZ()) {
            String s;
            if (0k3.LIZ) {
                s = "random_notice";
            }
            else {
                s = "normal_notice";
            }
            map.put("notice_type", s);
        }
        String s2 = "0";
        map.put("is_multi_bubble_guide", "0");
        String lizj = null;
        Label_0108: {
            if (0k3 != null) {
                final Boolean liziz = 0k3.LIZIZ;
                if (liziz != null) {
                    if (liziz) {
                        s2 = "1";
                    }
                    map.put("is_multi_bubble_guide", s2);
                }
                if ((lizj = 0k3.LIZJ) != null) {
                    break Label_0108;
                }
            }
            lizj = "";
        }
        map.put("enter_from", lizj);
    }
    
    public final void LIZ(final Map<String, String> map, final 0kf 0kf) {
        CTM.LIZ((Object)map, (Object)0kf);
        map.put("event_type", String.valueOf(1NN.LLFF.LIZ().LJIILL.getType()));
        if (1NN.LLFF.LIZ().LJJJIL.LIZIZ()) {
            final String liz = 1NN.LLFF.LIZ().LJJJIL.LIZ;
            n.LIZIZ((Object)liz, "");
            map.put("rank_type", liz);
        }
        else if (0kf.getType() >= 0kf.WEEKLY_RANK_INVITE.getType() && 0kf.getType() <= 0kf.DAILY_RANK_INVITE.getType()) {
            final int n = 0xn.LIZ[0kf.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            map.put("rank_type", "not_in_rank");
                        }
                        else {
                            map.put("rank_type", H3e.DAILY_RANK.getRankName());
                        }
                    }
                    else {
                        map.put("rank_type", H3e.WEEKLY_ROOKIE_RANK.getRankName());
                    }
                }
                else {
                    map.put("rank_type", H3e.HOURLY_RANK.getRankName());
                }
            }
            else {
                map.put("rank_type", H3e.WEEKLY_RANK.getRankName());
            }
        }
        else {
            map.put("rank_type", "not_in_rank");
        }
        final String lizj = 1NN.LLFF.LIZ().LJJJIL.LIZJ();
        n.LIZIZ((Object)lizj, "");
        map.put("is_ranking_opposite_anchor", lizj);
    }
    
    public final void LIZ(final Map<String, String> map, final boolean b, final long n, final List<Long> list) {
        String s;
        if (b) {
            s = "application";
        }
        else {
            s = "invitation";
        }
        map.put("show_type", s);
        final ArrayList lizlll = Ey9.LIZLLL((Object[])new Long[] { n });
        final ArrayList list2 = new ArrayList();
        for (final Number next : list) {
            if (next.longValue() != n) {
                list2.add(next);
            }
        }
        lizlll.addAll(list2);
        if (b) {
            map.put("popup_uid_list", String.valueOf(n));
            map.put("popup_uid_cnts", "1");
        }
        else {
            map.put("popup_uid_list", lizlll.toString());
            map.put("popup_uid_cnts", String.valueOf(lizlll.size()));
        }
        if (1NN.LLFF.LIZ().LJ != 0L) {
            map.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        }
        0xt.LIZIZ.LIZIZ(map);
        map.put("connection_type", "anchor");
        map.put("connection_inviter_id", String.valueOf(n));
        map.put("connection_invitee_id", String.valueOf(0py.LIZ()));
        0xg.LIZ(map, 1NN.LLFF.LIZ().LJIILL, false);
    }
    
    public final void LIZ(final boolean b, final String s) {
        CTM.LIZ((Object)s);
        final HashMap hashMap = new HashMap();
        LIZ(this, hashMap);
        this.LIZLLL(hashMap);
        if (1NN.LLFF.LIZ().LJ != 0L) {
            hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
        }
        String s2;
        if (b) {
            s2 = "1";
        }
        else {
            s2 = "0";
        }
        hashMap.put("is_dont_suggest_again_show", s2);
        hashMap.put("selection", s);
        hashMap.put("anchor_id", String.valueOf(0py.LIZ()));
        this.LJ(hashMap);
        LIZ("livesdk_disconnect_connection_popup_click", hashMap);
    }
    
    public final void LIZ(final boolean b, final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return;
        }
        final Gkn liz = Gkn.LJFF.LIZ("anchor_connection_recommend_open");
        String s3;
        if (b) {
            s3 = "1";
        }
        else {
            s3 = "0";
        }
        liz.LIZ("is_open", s3);
        liz.LIZ("enter_from", s);
        liz.LIZ("anchor_id", room.getOwnerUserId());
        liz.LIZ("room_id", room.getIdStr());
        liz.LIZ("click_type", s2);
        liz.LIZLLL();
    }
    
    public final void LIZ(final boolean b, final boolean b2, final boolean b3, long currentTimeMillis, final List<Long> list, final RivalExtraInfo$Tag rivalExtraInfo$Tag) {
        CTM.LIZ((Object)list);
        final HashMap hashMap = new HashMap();
        this.LJ(hashMap);
        this.LIZ(hashMap, b, currentTimeMillis, list);
        currentTimeMillis = System.currentTimeMillis();
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        hashMap.put("show_to_decide_dur", String.valueOf(currentTimeMillis - 0xm.LIZ));
        String s;
        if (b2) {
            s = "accept";
        }
        else {
            s = "reject";
        }
        hashMap.put("selection", s);
        final String s2 = "1";
        String s3;
        if (b3) {
            s3 = "1";
        }
        else {
            s3 = "0";
        }
        hashMap.put("is_turn_off_invitation", s3);
        Integer value;
        if (rivalExtraInfo$Tag != null) {
            value = rivalExtraInfo$Tag.LIZ;
        }
        else {
            value = null;
        }
        hashMap.put("relation_type", String.valueOf(value));
        String s4;
        if (1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
            s4 = s2;
        }
        else {
            s4 = "0";
        }
        hashMap.put("is_quick_recommend", s4);
        LIZ("livesdk_connection_invited", hashMap);
    }
    
    public final void LIZIZ(final Room room, final String s) {
        CTM.LIZ((Object)room, (Object)s);
        this.LIZ("livesdk_connection_invite_send_success", room, s);
    }
    
    public final void LIZIZ(final Map<String, String> map) {
        final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
        final ArrayList list = new ArrayList();
        for (final 0pc next : coHostUserList) {
            final 0pc 0pc = next;
            if (0pc.LIZJ() && 0pc.LJFF == 0pg.INVITED) {
                list.add(next);
            }
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add((Object)((0pc)iterator2.next()).LJIILIIL);
        }
        map.put("current_inviting_cnts", String.valueOf(list3.size()));
    }
    
    public final void LIZIZ(final boolean b, final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return;
        }
        final Gkn liz = Gkn.LJFF.LIZ("anchor_connection_open");
        String s3;
        if (b) {
            s3 = "1";
        }
        else {
            s3 = "0";
        }
        liz.LIZ("is_open", s3);
        liz.LIZ("enter_from", s);
        liz.LIZ("anchor_id", room.getOwnerUserId());
        liz.LIZ("room_id", room.getIdStr());
        liz.LIZ("click_type", s2);
        liz.LIZLLL();
    }
    
    public final void LIZJ(final Map<String, String> map) {
        final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
        final ArrayList list = new ArrayList();
        for (final 0pc next : coHostUserList) {
            final 0pc 0pc = next;
            if (0pc.LIZJ() && 0pc.LJFF == 0pg.APPLIED) {
                list.add(next);
            }
        }
        final List list2 = list;
        final ArrayList list3 = new ArrayList(6Jd.LIZ((Iterable)list2, 10));
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            list3.add((Object)((0pc)iterator2.next()).LJIILIIL);
        }
        map.put("current_applying_cnts", String.valueOf(list3.size()));
    }
    
    public final void LIZLLL(final Map<String, String> map) {
        map.put("current_connection_position_left", String.valueOf(4 - 0jz.LIZLLL().getCoHostUserList().size()));
    }
    
    public final void LJ(final Map<String, String> map) {
        final String label = 1NN.LLFF.LIZ().LJLJI.getLabel();
        if (n.LIZ((Object)"idle", (Object)label) ^ true) {
            map.put("anchor_type", label);
        }
    }
    
    public final void LJFF(final Map<String, String> map) {
        final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
        final boolean b = coHostUserList instanceof Collection;
        final int n = 0;
        int n2 = 0;
        Label_0093: {
            if (!b || !coHostUserList.isEmpty()) {
                for (final 0pc 0pc : coHostUserList) {
                    n2 = n;
                    if (0pc.LJ) {
                        break Label_0093;
                    }
                    n2 = n;
                    if (0pc.LIZJ == 0pL.SUPPORT_MULTI) {
                        continue;
                    }
                    break Label_0093;
                }
            }
            n2 = 1;
        }
        map.put("multi_authority", String.valueOf(n2));
    }
    
    public enum a
    {
        ACCEPT("accept"), 
        INVITE_WITHDRAW("invite_withdraw"), 
        OTHERS_REJECT("others_reject"), 
        OVER_TIME("over_time"), 
        REJECT("reject"), 
        UNKNOW("unknow");
        
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(10328);
        }
        
        public a(final String liziz) {
            this.LIZIZ = liziz;
        }
        
        public final String getValue() {
            return this.LIZIZ;
        }
    }
}
