// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.android.livesdk.chatroom.api.LinkReviewApi;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveLinkmicModeSwitchOpenSetting;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.model.linksetting.MultiGuestPermissionInfoAudienceSide;
import com.bytedance.android.livesdk.model.linksetting.RoomAudienceMultiGuestPermissionInfo;
import java.util.List;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplyPermission;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.linksetting.CoHost;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import android.util.ArrayMap;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLinkPermissionAheadSetting;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import org.json.JSONObject;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestSeiAbnormalDetectorSwitch;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAnchorOneVnSetting;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class 1kO extends GpV<a>
{
    public final String LIZ;
    public 1NN LIZIZ;
    public 2fc LIZJ;
    public Room LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    @0kW(LIZ = "LINKER_MANAGER")
    public 0xL LJIIIIZZ;
    public final 1mj LJIIIZ;
    public Fra LJIIJ;
    @0kW(LIZ = "LINK_MESSAGE_CENTER")
    public 1cs LJIIJJI;
    
    static {
        Covode.recordClassIndex(7669);
    }
    
    public 1kO(final Room lizlll, final boolean lj, final Fra ljiij) {
        final StringBuilder sb = new StringBuilder("oneVn_");
        sb.append(this.getClass().getSimpleName());
        this.LIZ = sb.toString();
        this.LJIIIZ = new 1xC(this);
        this.LIZLLL = lizlll;
        final StringBuilder sb2 = new StringBuilder("roomId = ");
        sb2.append(this.LIZLLL.getId());
        sb2.append("   OwnerUserId = ");
        sb2.append(this.LIZLLL.getOwnerUserId());
        0ba.LIZ(4, "LinkControlPresenter", sb2.toString());
        this.LJ = lj;
        this.LJIIJ = ljiij;
        this.LIZIZ = 1NN.LLFF.LIZ();
        1jw.LIZ.LIZ(this);
    }
    
    private boolean LIZ(final String s) {
        if (((GK2)this).LJJIL == null) {
            final StringBuilder sb = new StringBuilder("getViewInterface() return null, ");
            sb.append(s);
            sb.append(" failed");
            0sN.LIZIZ("LinkControlPresenter", sb.toString());
            return false;
        }
        if (((GpW)((GK2)this).LJJIL).getContext() == null) {
            final StringBuilder sb2 = new StringBuilder("getViewInterface().getContext() return null, ");
            sb2.append(s);
            sb2.append(" failed");
            0sN.LIZIZ("LinkControlPresenter", sb2.toString());
            return false;
        }
        if (this.LIZLLL == null) {
            final StringBuilder sb3 = new StringBuilder("mRoom is null,");
            sb3.append(s);
            sb3.append("  initOneVnForGuestForBase failed");
            0sN.LIZIZ("LinkControlPresenter", sb3.toString());
            return false;
        }
        return true;
    }
    
    private void LJI() {
        final 0pL 0pL = (0pL)super.LJJIJL.LIZIZ((Class)2FG.class);
        if (0pL != null && 0pL.isMultiCoHost()) {
            if (0jz.LIZLLL().isAttached()) {
                return;
            }
            0jz.LIZLLL().attach(this.LIZLLL, super.LJJIJL, (Context)0jz.LIZIZ().getTopActivity());
            0jz.LIZLLL().subscribe(Vwo.class, (X.SRT<? super VzU, ? super 1Wh<Vwo>, 2P9>)new 1kf(this));
            0jz.LIZLLL().subscribe(RnP.class, (X.SRT<? super VzU, ? super 1Wh<RnP>, 2P9>)new 1kP(this));
            0jz.LIZLLL().subscribe(RnT.class, (X.SRT<? super VzU, ? super 1Wh<RnT>, 2P9>)new 1kQ(this));
            0jz.LIZLLL().subscribe(RnN.class, (X.SRT<? super VzU, ? super 1Wh<RnN>, 2P9>)new 1kR(this));
            0jz.LIZLLL().subscribe(Vwp.class, (X.SRT<? super VzU, ? super 1Wh<Vwp>, 2P9>)new 1kS(this));
            0jz.LIZLLL().subscribe(RnO.class, (X.SRT<? super VzU, ? super 1Wh<RnO>, 2P9>)new 1kT(this));
            0jz.LIZLLL().subscribe(1Su.class, (X.SRT<? super VzU, ? super 1Wh<1Su>, 2P9>)new 1kU(this));
            0jz.LIZLLL().subscribe(1Sx.class, (X.SRT<? super VzU, ? super 1Wh<1Sx>, 2P9>)new 1kY(this));
            0jz.LIZLLL().subscribe(0q0.class, (X.SRT<? super VzU, ? super 1Wh<0q0>, 2P9>)new 1kZ(this));
        }
    }
    
    private void LJII() {
        1NN.LLFF.LIZ().LJJJLL = -1;
        if (super.LJJIJL != null) {
            super.LJJIJL.LIZIZ((Class)2Eu.class, (Object)(-1));
        }
    }
    
    public final void LIZ() {
        this.LIZIZ.LJFF("LinkControlPresenter_OnDestroy");
        this.LJIIJJI.LIZIZ(this.LJIIIZ);
        this.LJFF();
        final Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (liz instanceof 1Uo) {
            0xy.LIZ(((1Uo)liz).LJIILL);
        }
        else {
            0xy.LIZ((0k8)null);
        }
        if (1O2.LIZ()) {
            1O2.LIZ(1O2.b.EXIT);
        }
        if (!this.LJ && 0sD.LIZJ.LIZ().LIZLLL()) {
            0jz.LIZJ().unsubscribeCreateChannelMsg();
        }
        0jz.LIZLLL().detach();
        0jz.LIZJ().detach();
        super.LIZ();
    }
    
    public final void LIZ(final int n) {
        0xo.LIZ("LinkCross_Reply_RtcJoinChannelFailed", true);
        final HashMap<String, Object> lj = 1jz.LIZLLL.LJ();
        lj.put("reply_status", n);
        final 0xL ljiiiizz = this.LJIIIIZZ;
        if (ljiiiizz != null) {
            final 0xJ liziz = ljiiiizz.LIZIZ(0xG.a.COHOST);
            if (liziz instanceof 1Np) {
                final FAE<0xK> liziz2 = liziz.LIZIZ(lj);
                if (liziz2 != null) {
                    ((FIw)liziz2.LIZ((FAN)this.LJJI())).LIZ(1QM.LIZ, (2d6)new 1QN(this));
                }
                ((1Np)liziz).LIZJ();
            }
        }
    }
    
    public final void LIZ(final 0pL 0pL) {
        super.LJJIJL.LIZ((Class)2FG.class, (Object)0pL);
        this.LJI();
    }
    
    public final void LIZ(a a) {
        super.LIZ((GpW)a);
        final boolean lj = this.LJ;
        final String s = null;
        if (lj && LiveAnchorOneVnSetting.INSTANCE.enable1vn() && this.LIZ("initOneVnForAnchor")) {
            0jz.LIZJ().init(this.LIZLLL, null, ((GpW)((GK2)this).LJJIL).getContext());
        }
        if (!this.LJ && this.LIZ("initOneVnForGuest")) {
            String string = null;
            Label_0097: {
                if (this.LIZLLL.multiLiveUserSettings == null) {
                    0sN.LIZ("LinkControlPresenter", "mRoom.multiLiveUserSettings is null, initOneVnForGuest failed");
                }
                else {
                    final ArrayMap liziz = this.LIZLLL.multiLiveUserSettings.LIZIZ;
                    if (liziz == null) {
                        0sN.LIZ("LinkControlPresenter", "channelIdMap is null, initOneVnForGuest failed");
                    }
                    else if (((Map)liziz).get(4) != null) {
                        string = ((Long)((Map)liziz).get(4)).toString();
                        break Label_0097;
                    }
                }
                string = null;
            }
            if (this.LIZ("initOneVnForGuestForBase")) {
                0jz.LIZJ().init(this.LIZLLL, string, ((GpW)((GK2)this).LJJIL).getContext());
                0jz.LIZJ().subscribe(RnQ.class, (X.SRT<? super VzU, ? super 1Wh<RnQ>, 2P9>)new 1kW(this));
            }
            this.LIZIZ();
        }
        ((FIc)FGP.LIZ().LIZ((Class)0kD.class).LIZ((FBZ)this.LJJ())).LIZ((2d6)new 1QO(this));
        ((FIc)FGP.LIZ().LIZ((Class)0kF.class).LIZ((FBZ)this.LJJ())).LIZ((2d6)new 1QP(this));
        ((FIc)FGP.LIZ().LIZ((Class)0kG.class).LIZ((FBZ)this.LJJ())).LIZ((2d6)new 1QQ(this));
        ((FIc)FGP.LIZ().LIZ((Class)0kB.class).LIZ((FBZ)this.LJJ())).LIZ((2d6)new 1QR(this));
        final 1cs ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(this.LJIIIZ);
        }
        if (MultiGuestSeiAbnormalDetectorSwitch.INSTANCE.getValue().LIZ) {
            0kT.a.LIZ(1jw.LIZ, new 0xf());
        }
        final boolean lj2 = this.LJ;
        String secUid = "";
        Label_0452: {
            if (!lj2) {
                final Room lizlll = this.LIZLLL;
                CTM.LIZ((Object)lizlll);
                final MultiLiveUserSettings multiLiveUserSettings = lizlll.multiLiveUserSettings;
            Label_1333_Outer:
                while (true) {
                    Label_3007: {
                        if (multiLiveUserSettings == null) {
                            break Label_3007;
                        }
                        final CoHost lizj = multiLiveUserSettings.LIZJ;
                        if (lizj == null) {
                            break Label_3007;
                        }
                        final boolean liz = lizj.LIZ;
                        0ba.LIZ(4, "LinkControlPresenter", "attachView isMultiCoHost = ".concat(String.valueOf(liz)));
                        if (liz) {
                            this.LIZ(0pL.SUPPORT_MULTI);
                        }
                        final Room lizlll2 = this.LIZLLL;
                        CTM.LIZ((Object)"SyncRoomStats", (Object)lizlll2);
                        final HashMap hashMap = new HashMap();
                        hashMap.put("event", "SyncRoomStats");
                        hashMap.put("roomId", lizlll2.getId());
                        hashMap.put("owner_user_id", lizlll2.getOwnerUserId());
                        final User owner = lizlll2.getOwner();
                        Integer value;
                        if (owner != null) {
                            value = owner.getLinkMicStats();
                        }
                        else {
                            value = null;
                        }
                        hashMap.put("link_mic_stats", value);
                        hashMap.put("with_linkmic", lizlll2.isWithLinkMic());
                        hashMap.put("linkmic_info", 0b8.a.LIZIZ.LIZIZ((Object)lizlll2.getLinkMicInfo()));
                        0xo.LIZ(hashMap);
                        final Room lizlll3 = this.LIZLLL;
                        if (HBB.LIZIZ("ttlive_client_room_enter_micinfo", 0.1f)) {
                            final JSONObject jsonObject = new JSONObject();
                            final boolean valid = Room.isValid(lizlll3);
                            final String s2 = "0";
                            String idStr;
                            if (valid) {
                                idStr = s;
                                if (lizlll3 != null) {
                                    idStr = lizlll3.getIdStr();
                                }
                            }
                            else {
                                idStr = "0";
                            }
                            0d3.LIZ(jsonObject, "room_id", idStr);
                            long ownerUserId;
                            if (lizlll3 != null) {
                                ownerUserId = lizlll3.getOwnerUserId();
                            }
                            else {
                                ownerUserId = 0L;
                            }
                            0d3.LIZ(jsonObject, "anchor_id", ownerUserId);
                            String s3;
                            if (lizlll3 != null) {
                                final RoomLinkInfo linkMicInfo = lizlll3.getLinkMicInfo();
                                Label_1219: {
                                    if (linkMicInfo != null) {
                                        0d3.LIZ(jsonObject, "channel_id", linkMicInfo.LIZ);
                                        final BattleInfoResponse lj3 = linkMicInfo.LJ;
                                        while (true) {
                                            Label_2977: {
                                                if (lj3 == null) {
                                                    break Label_2977;
                                                }
                                                final Long liziz2 = lj3.LIZIZ;
                                                if (liziz2 == null) {
                                                    break Label_2977;
                                                }
                                                final long longValue = liziz2;
                                                0d3.LIZ(jsonObject, "battle_id", longValue);
                                                final BattleInfoResponse lj4 = linkMicInfo.LJ;
                                                while (true) {
                                                    Label_2971: {
                                                        if (lj4 == null) {
                                                            break Label_2971;
                                                        }
                                                        final BattleSetting lizj2 = lj4.LIZJ;
                                                        if (lizj2 == null) {
                                                            break Label_2971;
                                                        }
                                                        final long lizj3 = lizj2.LIZJ;
                                                        0d3.LIZ(jsonObject, "battle_start_time", lizj3);
                                                        final BattleInfoResponse lj5 = linkMicInfo.LJ;
                                                        while (true) {
                                                            Label_2965: {
                                                                if (lj5 == null) {
                                                                    break Label_2965;
                                                                }
                                                                final BattleSetting lizj4 = lj5.LIZJ;
                                                                if (lizj4 == null) {
                                                                    break Label_2965;
                                                                }
                                                                final int lj6 = lizj4.LJ;
                                                                0d3.LIZ(jsonObject, "battle_status", String.valueOf(lj6));
                                                                0d3.LIZ(jsonObject, "rival_anchor_id", linkMicInfo.LIZIZ);
                                                                break Label_1219;
                                                            }
                                                            final int lj6 = 0;
                                                            continue Label_1333_Outer;
                                                        }
                                                    }
                                                    final long lizj3 = 0L;
                                                    continue Label_1333_Outer;
                                                }
                                            }
                                            final long longValue = 0L;
                                            continue Label_1333_Outer;
                                        }
                                    }
                                }
                                s3 = s2;
                                if (lizlll3.isWithLinkMic()) {
                                    s3 = "1";
                                }
                            }
                            else {
                                s3 = s2;
                            }
                            0d3.LIZ(jsonObject, "with_linkmic", s3);
                            0d8.LIZ("ttlive_client_room_enter_micinfo", 1, jsonObject, 0);
                        }
                        final 1mg ljiiljjil = 1mg.LJIILJJIL;
                        final Room lizlll4 = this.LIZLLL;
                        CTM.LIZ((Object)lizlll4);
                        1mg.LJIIJJI = Gqs.LIZ();
                        final RoomLinkInfo linkMicInfo2 = lizlll4.getLinkMicInfo();
                        long liz2;
                        if (linkMicInfo2 != null) {
                            liz2 = linkMicInfo2.LIZ;
                        }
                        else {
                            liz2 = 0L;
                        }
                        final RoomLinkInfo linkMicInfo3 = lizlll4.getLinkMicInfo();
                        while (true) {
                            Label_2953: {
                                if (linkMicInfo3 == null) {
                                    break Label_2953;
                                }
                                final BattleInfoResponse lj7 = linkMicInfo3.LJ;
                                if (lj7 == null) {
                                    break Label_2953;
                                }
                                final Long liziz3 = lj7.LIZIZ;
                                if (liziz3 == null) {
                                    break Label_2953;
                                }
                                final long longValue2 = liziz3;
                                final RoomLinkInfo linkMicInfo4 = lizlll4.getLinkMicInfo();
                                while (true) {
                                    Label_2947: {
                                        if (linkMicInfo4 == null) {
                                            break Label_2947;
                                        }
                                        final BattleInfoResponse lj8 = linkMicInfo4.LJ;
                                        if (lj8 == null) {
                                            break Label_2947;
                                        }
                                        final BattleSetting lizj5 = lj8.LIZJ;
                                        if (lizj5 == null) {
                                            break Label_2947;
                                        }
                                        final long lizj6 = lizj5.LIZJ;
                                        final RoomLinkInfo linkMicInfo5 = lizlll4.getLinkMicInfo();
                                        while (true) {
                                            Label_2941: {
                                                if (linkMicInfo5 == null) {
                                                    break Label_2941;
                                                }
                                                final BattleInfoResponse lj9 = linkMicInfo5.LJ;
                                                if (lj9 == null) {
                                                    break Label_2941;
                                                }
                                                final BattleSetting lizj7 = lj9.LIZJ;
                                                if (lizj7 == null) {
                                                    break Label_2941;
                                                }
                                                final int lj10 = lizj7.LJ;
                                                while (true) {
                                                    Label_2935: {
                                                        if (longValue2 <= 0L || lizj6 <= 0L || (lj10 != 1 && lj10 != 3)) {
                                                            break Label_2935;
                                                        }
                                                        final RoomLinkInfo linkMicInfo6 = lizlll4.getLinkMicInfo();
                                                        if (linkMicInfo6 == null) {
                                                            break Label_2935;
                                                        }
                                                        final BattleInfoResponse lj11 = linkMicInfo6.LJ;
                                                        if (lj11 == null) {
                                                            break Label_2935;
                                                        }
                                                        final Map ljiijji2 = lj11.LJIIJJI;
                                                        if (ljiijji2 == null || ljiijji2.size() <= 0) {
                                                            break Label_2935;
                                                        }
                                                        final int n = 1;
                                                        final JSONObject jsonObject2 = new JSONObject();
                                                        0d3.LIZ(jsonObject2, "channel_id", liz2);
                                                        0d3.LIZ(jsonObject2, "battle_id", longValue2);
                                                        0d3.LIZ(jsonObject2, "start_time", lizj6);
                                                        0d3.LIZ(jsonObject2, "battle_status", lj10);
                                                        0d3.LIZ(jsonObject2, "is_valid", n);
                                                        1mg.LIZIZ(ljiiljjil, "room_enter_identify", jsonObject2, null, null, false, 28);
                                                        Label_2338: {
                                                            if (this.LIZLLL.isWithLinkMic()) {
                                                                long ljff;
                                                                if (this.LIZLLL.getLinkMicInfo() != null) {
                                                                    ljff = this.LIZLLL.getLinkMicInfo().LJFF;
                                                                }
                                                                else {
                                                                    ljff = 0L;
                                                                }
                                                                0ba.LIZ(4, "LinkControlPresenter", "syncRoomStats layoutType= ".concat(String.valueOf(ljff)));
                                                                if (this.LIZLLL.multiLiveUserSettings != null && this.LIZLLL.multiLiveUserSettings.LIZ != null && this.LIZLLL.multiLiveUserSettings.LIZ.LIZIZ != null && this.LIZLLL.multiLiveUserSettings.LIZ.LIZIZ == 1L) {
                                                                    this.LJII = true;
                                                                    0sD.LIZJ.LIZ().LIZJ();
                                                                }
                                                                else {
                                                                    this.LJII = (ljff == 1L);
                                                                }
                                                                Label_1963: {
                                                                    if (this.LJII) {
                                                                        0xj.LIZIZ = "live_play";
                                                                        final Room lizlll5 = this.LIZLLL;
                                                                        CTM.LIZ((Object)lizlll5);
                                                                        final MultiLiveUserSettings multiLiveUserSettings2 = lizlll5.multiLiveUserSettings;
                                                                        while (true) {
                                                                            Label_2878: {
                                                                                if (multiLiveUserSettings2 == null) {
                                                                                    break Label_2878;
                                                                                }
                                                                                final MultiLiveUserApplySettings liz3 = multiLiveUserSettings2.LIZ;
                                                                                if (liz3 == null) {
                                                                                    break Label_2878;
                                                                                }
                                                                                final MultiLiveUserApplyPermission liz4 = liz3.LIZ;
                                                                                if (liz4 != null) {
                                                                                    final MultiLiveAnchorPanelSettings ljjii = new MultiLiveAnchorPanelSettings();
                                                                                    final int liz5 = liz4.LIZ;
                                                                                    if (liz5 != 1) {
                                                                                        if (liz5 != 2) {
                                                                                            if (liz5 == 3) {
                                                                                                ljjii.LIZJ = 4;
                                                                                                ljjii.LIZLLL = 4;
                                                                                                GCe.LIZ().LJJII = ljjii;
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            ljjii.LIZJ = 3;
                                                                                            ljjii.LIZLLL = 3;
                                                                                            GCe.LIZ().LJJII = ljjii;
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        ljjii.LIZJ = 3;
                                                                                        ljjii.LIZLLL = 4;
                                                                                        GCe.LIZ().LJJII = ljjii;
                                                                                    }
                                                                                }
                                                                                ((a)((GK2)this).LJJIL).LIZ(5E4.AUDIENCE_OPEN);
                                                                                if (this.LIZLLL.getLinkMicInfo() != null) {
                                                                                    final List lizlll6 = this.LIZLLL.getLinkMicInfo().LIZLLL;
                                                                                    if (lizlll6 != null && lizlll6.size() > 0) {
                                                                                        GCe.LIZ().LIZIZ(true);
                                                                                    }
                                                                                    else {
                                                                                        GCe.LIZ().LIZIZ(false);
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    GCe.LIZ().LIZIZ(false);
                                                                                }
                                                                                final 0xf liz6 = 0xf.LJIIJ.LIZ();
                                                                                if (liz6 != null) {
                                                                                    liz6.LIZIZ = true;
                                                                                    liz6.LIZJ = true;
                                                                                }
                                                                                if (!this.LJII) {
                                                                                    break Label_1963;
                                                                                }
                                                                                final Room lizlll7 = this.LIZLLL;
                                                                                if (lizlll7.multiLiveUserSettings == null || lizlll7.multiLiveUserSettings.LIZ == null) {
                                                                                    break Label_1963;
                                                                                }
                                                                                final MultiLiveUserApplyPermission liz7 = lizlll7.multiLiveUserSettings.LIZ.LIZ;
                                                                                if (liz7 == null) {
                                                                                    break Label_1963;
                                                                                }
                                                                                MultiLiveAnchorPanelSettings ljjii2 = null;
                                                                                Label_1938: {
                                                                                    if (1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER") != null) {
                                                                                        final 1Uo 1Uo = (1Uo)1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
                                                                                        if (1Uo != null && (ljjii2 = 1Uo.LJFF) != null) {
                                                                                            break Label_1938;
                                                                                        }
                                                                                    }
                                                                                    if ((ljjii2 = GCe.LIZ().LJJII) == null) {
                                                                                        ljjii2 = new MultiLiveAnchorPanelSettings((byte)0);
                                                                                    }
                                                                                }
                                                                                final int liz8 = liz7.LIZ;
                                                                                if (liz8 != 1) {
                                                                                    if (liz8 != 2) {
                                                                                        if (liz8 != 3) {
                                                                                            break Label_1963;
                                                                                        }
                                                                                        ljjii2.LIZJ = 4;
                                                                                        ljjii2.LIZLLL = 4;
                                                                                        GCe.LIZ().LJJII = ljjii2;
                                                                                        if (0tO.LIZIZ() && ((GK2)this).LJJIL != null) {
                                                                                            ((a)((GK2)this).LJJIL).LIZJ(false);
                                                                                        }
                                                                                        break Label_1963;
                                                                                    }
                                                                                    else {
                                                                                        ljjii2.LIZJ = 3;
                                                                                        ljjii2.LIZLLL = 3;
                                                                                        GCe.LIZ().LJJII = ljjii2;
                                                                                        if (0tO.LIZIZ(super.LJJIJL)) {
                                                                                            if (((GK2)this).LJJIL != null) {
                                                                                                ((a)((GK2)this).LJJIL).LIZIZ(false);
                                                                                            }
                                                                                            break Label_1963;
                                                                                        }
                                                                                        else {
                                                                                            if (((GK2)this).LJJIL != null) {
                                                                                                ((a)((GK2)this).LJJIL).LJIIJ();
                                                                                            }
                                                                                            break Label_1963;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    ljjii2.LIZJ = 3;
                                                                                    ljjii2.LIZLLL = 4;
                                                                                    GCe.LIZ().LJJII = ljjii2;
                                                                                    if (((GK2)this).LJJIL != null) {
                                                                                        ((a)((GK2)this).LJJIL).LJIIJ();
                                                                                    }
                                                                                    break Label_1963;
                                                                                }
                                                                            }
                                                                            final MultiLiveUserApplyPermission liz4 = null;
                                                                            continue;
                                                                        }
                                                                    }
                                                                    0d8.LIZ(new Throwable(), "not new multiguestV3+multilive, just skip not return..".concat(String.valueOf(ljff)));
                                                                }
                                                                if (LiveSdkMultiGuestLinkPermissionAheadSetting.INSTANCE.enableAhead()) {
                                                                    final Room lizlll8 = this.LIZLLL;
                                                                    a = (a)((GK2)this).LJJIL;
                                                                    CTM.LIZ((Object)a);
                                                                    if (lizlll8 != null) {
                                                                        final MultiLiveUserSettings multiLiveUserSettings3 = lizlll8.multiLiveUserSettings;
                                                                        if (multiLiveUserSettings3 != null) {
                                                                            final MultiLiveUserApplySettings liz9 = multiLiveUserSettings3.LIZ;
                                                                            if (liz9 != null) {
                                                                                final RoomAudienceMultiGuestPermissionInfo lj12 = liz9.LJ;
                                                                                if (lj12 != null && lj12.LIZ) {
                                                                                    final MultiLiveUserSettings multiLiveUserSettings4 = lizlll8.multiLiveUserSettings;
                                                                                    if (multiLiveUserSettings4 != null) {
                                                                                        final MultiLiveUserApplySettings liz10 = multiLiveUserSettings4.LIZ;
                                                                                        if (liz10 != null) {
                                                                                            final RoomAudienceMultiGuestPermissionInfo lj13 = liz10.LJ;
                                                                                            if (lj13 != null && lj13.LIZIZ != null) {
                                                                                                final MultiLiveUserSettings multiLiveUserSettings5 = lizlll8.multiLiveUserSettings;
                                                                                                if (multiLiveUserSettings5 != null) {
                                                                                                    final MultiLiveUserApplySettings liz11 = multiLiveUserSettings5.LIZ;
                                                                                                    if (liz11 != null) {
                                                                                                        final RoomAudienceMultiGuestPermissionInfo lj14 = liz11.LJ;
                                                                                                        if (lj14 != null && lj14.LIZ) {
                                                                                                            final MultiGuestPermissionInfoAudienceSide liziz4 = lj14.LIZIZ;
                                                                                                            if (liziz4 != null) {
                                                                                                                final Long liziz5 = liziz4.LIZIZ;
                                                                                                                if (liziz5 != null && liziz5 == 0L) {
                                                                                                                    final 0sK lj15 = 0sK.LJ;
                                                                                                                    if (1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER") == null) {
                                                                                                                        break Label_2338;
                                                                                                                    }
                                                                                                                    Object liz12;
                                                                                                                    if (!((liz12 = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER")) instanceof 1Uo)) {
                                                                                                                        liz12 = null;
                                                                                                                    }
                                                                                                                    final 1Uo 1Uo2 = (1Uo)liz12;
                                                                                                                    if (1Uo2 != null) {
                                                                                                                        1Uo2.LIZ(lj15.LIZ(lizlll8));
                                                                                                                        1Uo2.LJJIII = 0L;
                                                                                                                    }
                                                                                                                    break Label_2338;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                final MultiLiveUserSettings multiLiveUserSettings6 = lizlll8.multiLiveUserSettings;
                                                                                                if (multiLiveUserSettings6 == null) {
                                                                                                    break Label_2338;
                                                                                                }
                                                                                                final MultiLiveUserApplySettings liz13 = multiLiveUserSettings6.LIZ;
                                                                                                if (liz13 == null) {
                                                                                                    break Label_2338;
                                                                                                }
                                                                                                final RoomAudienceMultiGuestPermissionInfo lj16 = liz13.LJ;
                                                                                                if (lj16 == null || !lj16.LIZ) {
                                                                                                    break Label_2338;
                                                                                                }
                                                                                                final MultiGuestPermissionInfoAudienceSide liziz6 = lj16.LIZIZ;
                                                                                                if (liziz6 != null) {
                                                                                                    final Long liziz7 = liziz6.LIZIZ;
                                                                                                    if (liziz7 != null) {
                                                                                                        if (liziz7 == 0L) {
                                                                                                            break Label_2338;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER") == null) {
                                                                                                    break Label_2338;
                                                                                                }
                                                                                                Object liz14;
                                                                                                if (!((liz14 = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER")) instanceof 1Uo)) {
                                                                                                    liz14 = null;
                                                                                                }
                                                                                                final 1Uo 1Uo3 = (1Uo)liz14;
                                                                                                if (1Uo3 != null) {
                                                                                                    final MultiLiveUserSettings multiLiveUserSettings7 = lizlll8.multiLiveUserSettings;
                                                                                                    while (true) {
                                                                                                        Label_2447: {
                                                                                                            if (multiLiveUserSettings7 == null) {
                                                                                                                break Label_2447;
                                                                                                            }
                                                                                                            final MultiLiveUserApplySettings liz15 = multiLiveUserSettings7.LIZ;
                                                                                                            if (liz15 == null) {
                                                                                                                break Label_2447;
                                                                                                            }
                                                                                                            final RoomAudienceMultiGuestPermissionInfo lj17 = liz15.LJ;
                                                                                                            if (lj17 == null) {
                                                                                                                break Label_2447;
                                                                                                            }
                                                                                                            final MultiGuestPermissionInfoAudienceSide liziz8 = lj17.LIZIZ;
                                                                                                            if (liziz8 == null) {
                                                                                                                break Label_2447;
                                                                                                            }
                                                                                                            final Long liziz9 = liziz8.LIZIZ;
                                                                                                            if (liziz9 == null) {
                                                                                                                break Label_2447;
                                                                                                            }
                                                                                                            final long longValue3 = liziz9;
                                                                                                            1Uo3.LJJIII = longValue3;
                                                                                                            final MultiLiveUserSettings multiLiveUserSettings8 = lizlll8.multiLiveUserSettings;
                                                                                                            if (multiLiveUserSettings8 != null) {
                                                                                                                final MultiLiveUserApplySettings liz16 = multiLiveUserSettings8.LIZ;
                                                                                                                String lizj8 = null;
                                                                                                                Label_2329: {
                                                                                                                    if (liz16 != null) {
                                                                                                                        final RoomAudienceMultiGuestPermissionInfo lj18 = liz16.LJ;
                                                                                                                        if (lj18 != null) {
                                                                                                                            final MultiGuestPermissionInfoAudienceSide liziz10 = lj18.LIZIZ;
                                                                                                                            if (liziz10 != null && (lizj8 = liziz10.LIZJ) != null) {
                                                                                                                                break Label_2329;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    lizj8 = "";
                                                                                                                }
                                                                                                                secUid = lizj8;
                                                                                                            }
                                                                                                            1Uo3.LJJIIJ = secUid;
                                                                                                            break Label_2338;
                                                                                                        }
                                                                                                        final long longValue3 = 0L;
                                                                                                        continue;
                                                                                                    }
                                                                                                }
                                                                                                break Label_2338;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        final IHostContext hostContext = 0jR.LIZ(IHostContext.class);
                                                                        if (hostContext != null) {
                                                                            ((FIw)0yr.LIZ().LIZ(LinkApi.class).checkAudienceSelfPermission(lizlll8.getId(), (long)hostContext.appId(), (long)hostContext.liveId()).LIZ((FCC)new FC5()).LIZ((FAN)FFb.LIZ((0CH)a))).LIZ((2d6)1W4.LIZ, (2d6)new 1W5(a));
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        final RoomLinkInfo linkMicInfo7 = this.LIZLLL.getLinkMicInfo();
                                                        if (linkMicInfo7 != null) {
                                                            final 1NN liz17 = 1NN.LLFF.LIZ();
                                                            liz17.LJFF = linkMicInfo7.LIZIZ;
                                                            liz17.LIZ(linkMicInfo7);
                                                            if (liz17.LJ <= 0L) {
                                                                break Label_0452;
                                                            }
                                                            1lX.LIZ.LIZ().LIZJ();
                                                            0ba.LIZ(4, "LinkControlPresenter", "identifyLinkModeWithRoom, CoHost On");
                                                            1jz.LIZ("room_enter");
                                                            liz17.LIZ(liz17.LJ, 0k4.ROOM_ENTER);
                                                            ((a)((GK2)this).LJJIL).LIZJ();
                                                        }
                                                        Fjy.LIZ.LJ(0k6.LIZ(this.LIZLLL));
                                                        break Label_0452;
                                                    }
                                                    final int n = 0;
                                                    continue;
                                                }
                                            }
                                            final int lj10 = 0;
                                            continue;
                                        }
                                    }
                                    final long lizj6 = 0L;
                                    continue;
                                }
                            }
                            final long longValue2 = 0L;
                            continue;
                        }
                    }
                    final boolean liz = false;
                    continue;
                }
            }
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null) {
                final long id = room.getId();
                if (room.getOwner() != null) {
                    secUid = room.getOwner().getSecUid();
                }
                final HashMap hashMap2 = new HashMap();
                hashMap2.put("cohost_arch_version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
                0yr.LIZ().LIZ(CoHostApi.class).getAnchorLinkMicUserSetting(id, secUid, hashMap2).LIZ((FCD)new FC5()).LIZ(1cv.LIZ, 1cw.LIZ);
            }
        }
        if (this.LJ && this.LJIIJ == Fra.VIDEO) {
            final Room lizlll9 = this.LIZLLL;
            if (lizlll9 != null && lizlll9.hasMultiLivePermissionAnchorSide()) {
                ((a)((GK2)this).LJJIL).LIZ(true);
                0ba.LIZ(4, "MultiLiveAuto", "linkMic has already grant permission");
            }
            else {
                final IHostContext hostContext2 = 0jR.LIZ(IHostContext.class);
                ((FIw)0yr.LIZ().LIZ(LinkApi.class).checkAnchorSelfPermission(this.LIZLLL.getId(), (long)hostContext2.appId(), (long)hostContext2.liveId()).LIZ((FAN)this.LJJI())).LIZ((2d6)new 1QW(this), (2d6)new 1QX(this));
            }
            ((I5h)HiU.LIZ).LIZ("check_permission");
            final 1lW liz18 = 1lW.LIZ.LIZ();
            final HashMap hashMap3 = new HashMap();
            hashMap3.put("cohost_arch_version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
            ((FIc)0yr.LIZ().LIZ(LinkApi.class).checkPermissionV3(this.LIZLLL.getId(), true, (Map)hashMap3).LIZ((FBZ)this.LJJI())).LIZ((2d6)new 1QY(this, liz18), (2d6)new 1QZ(this, liz18));
        }
        if (super.LJJIJL != null) {
            final DataChannel ljjijl = super.LJJIJL;
            ljjijl.LIZ((0CH)((GK2)this).LJJIL, (Class)2Et.class, (SRS)new 1ka(this));
            ljjijl.LIZ((0CH)((GK2)this).LJJIL, (Class)2Es.class, (SRS)new 1kb(this));
            ljjijl.LIZ((0CH)((GK2)this).LJJIL, (Class)2FW.class, (SRS)new 1kc(this));
        }
    }
    
    public final void LIZ(final 5E3 5e3) {
        final HashMap hashMap = new HashMap();
        hashMap.put("cancel_reason", 5e3);
        final 0xJ liziz = this.LJIIIIZZ.LIZIZ(0xG.a.COHOST);
        if (liziz != null && liziz instanceof 1Np) {
            if (liziz.LIZLLL(hashMap) != null) {
                ((FIw)liziz.LIZLLL(hashMap).LIZ((FAN)this.LJJI())).LIZ(1Qa.LIZ, (2d6)new 1Qb(this));
            }
            ((1Np)liziz).LIZJ();
        }
        this.LJII();
        this.LIZJ = null;
    }
    
    public final void LIZ(final 5E4 5e4) {
        final StringBuilder sb = new StringBuilder("initAndTurnOnMultiGuest, mTurningOnAudienceInteract = ");
        sb.append(this.LJFF);
        sb.append("  mIsMicRoom = ");
        sb.append(this.LJI);
        sb.append(" source = ");
        String value;
        if (5e4 != null) {
            value = 5e4.value;
        }
        else {
            value = "";
        }
        sb.append(value);
        0ba.LIZ(4, "LinkControlPresenter", sb.toString());
        if (this.LJI) {
            return;
        }
        1jw.LIZ.LIZ(new 1lb(), null);
        if (super.LJJIJL != null) {
            super.LJJIJL.LIZ((Class)2GT.class, (Object)null);
        }
        final 44V llfff = GST.LLFFF;
        int n = 1;
        ((44T)llfff).LIZ((Object)true);
        if (LiveAnchorOneVnSetting.INSTANCE.enable1vn()) {
            if (0sD.LIZJ.LIZ().LIZIZ() != null && this.LJ) {
                0jz.LIZJ().subscribe(RnS.class, (X.SRT<? super VzU, ? super 1Wh<RnS>, 2P9>)new 1ke(this));
                0sD.LIZJ.LIZ().LIZIZ().LIZ(5e4, new 1QI(this, 5e4));
            }
            return;
        }
        if (this.LJFF) {
            return;
        }
        this.LJFF = true;
        final 1cm 1cm = new 1cm();
        1cm.LIZ = this.LJ;
        this.LJIIIIZZ.LIZ(this.LIZLLL.getOwnerUserId(), 0xG.a.MULTIGUEST, super.LJJIJL, 1cm);
        if (this.LIZLLL.isLiveTypeAudio()) {
            n = 8;
        }
        if (this.LJIIIIZZ.LIZ() instanceof 1TT) {
            if (((GK2)this).LJJIL == null) {
                0ba.LIZ(6, "LinkControlPresenter", "initAndTurnOnMultiGuest getViewInterface is null");
                return;
            }
            final 1TT 1tt = (1TT)this.LJIIIIZZ.LIZ();
            final long id = this.LIZLLL.getId();
            CTM.LIZ((Object)5e4);
            final HashMap hashMap = new HashMap();
            hashMap.put("source", 5e4);
            1tt.LJ = id;
            final 0xN lizj = 1tt.LIZJ;
            if (lizj == null) {
                kotlin.jvm.internal.n.LIZ("");
            }
            lizj.LIZIZ().LJI(hashMap);
            final FAE liz = 0yr.LIZ().LIZ(LinkApi.class).init(id, 12, n).LIZ((FCC)new FC5()).LIZ((3uO)new 1TQ(1tt, hashMap, id, 5e4));
            kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
            ((FIw)liz.LIZ((FAN)this.LJJI())).LIZ((2d6)new 1QS(this, 5e4), (2d6)new 1QT(this, 5e4));
        }
    }
    
    public final void LIZIZ() {
        0jz.LIZJ().subscribe(RnS.class, (X.SRT<? super VzU, ? super 1Wh<RnS>, 2P9>)new 1kX(this));
        0jz.LIZJ().subscribe(RnL.class, (X.SRT<? super VzU, ? super 1Wh<RnL>, 2P9>)new 1kd(this));
    }
    
    public final void LIZJ() {
        1jw.LIZ.LIZ(new 1jy(), null);
        final 1cm 1cm = new 1cm();
        1cm.LIZ = this.LJ;
        this.LJIIIIZZ.LIZ(this.LIZLLL.getOwnerUserId(), 0xG.a.COHOST, super.LJJIJL, 1cm);
    }
    
    public final boolean LIZLLL() {
        return 0k7.LIZ(1NN.LLFF.LIZ().LIZ(), 2) && !TTliveLinkmicModeSwitchOpenSetting.INSTANCE.getValue();
    }
    
    public final void LJ() {
        ((FIw)0yr.LIZ().LIZ(LinkReviewApi.class).bannedInfo(13).LIZ((FAN)this.LJJI())).LIZ((2d6)new 1QU(this), (2d6)new 1QV(this));
    }
    
    public final void LJFF() {
        final 2fc lizj = this.LIZJ;
        if (lizj != null) {
            lizj.dispose();
            this.LIZJ = null;
        }
        this.LJII();
    }
    
    public final void onEvent(final 0kD 0kD) {
        if (((GK2)this).LJJIL == null) {
            return;
        }
        final int liz = 0kD.LIZ;
        if (liz != 1) {
            if (liz == 2) {
                ((a)((GK2)this).LJJIL).LIZLLL();
            }
            return;
        }
        ((a)((GK2)this).LJJIL).LIZIZ();
    }
    
    public final void onEvent(final 0kF 0kF) {
        if (((GK2)this).LJJIL == null) {
            return;
        }
        ((a)((GK2)this).LJJIL).LJIIIIZZ();
    }
    
    public interface a extends GpW
    {
        default static {
            Covode.recordClassIndex(7672);
        }
        
        void LIZ(final int p0);
        
        void LIZ(final int p0, final boolean p1, final Cert p2);
        
        void LIZ(final 0pL p0);
        
        void LIZ(final 5E4 p0);
        
        void LIZ(final 5E4 p0, final Throwable p1);
        
        void LIZ(final LinkMessage p0);
        
        void LIZ(final LinkMicAnchorGuideMessage p0);
        
        void LIZ(final LinkerInviteContent p0);
        
        void LIZ(final boolean p0);
        
        int LIZIZ(final int p0);
        
        void LIZIZ();
        
        void LIZIZ(final LinkerInviteContent p0);
        
        void LIZIZ(final String p0);
        
        void LIZIZ(final boolean p0);
        
        void LIZJ();
        
        void LIZJ(final boolean p0);
        
        void LIZLLL();
        
        void LJ();
        
        void LJFF();
        
        void LJI();
        
        void LJII();
        
        void LJIIIIZZ();
        
        void LJIIIZ();
        
        void LJIIJ();
    }
}
