// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.linkroom;

import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import com.bytedance.android.livesdk.model.linksetting.LinkmicUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchQualityOptimizeSetting;
import X.0ba;
import android.graphics.Bitmap;
import X.HZG;
import X.QgD;
import X.0TH;
import X.H52;
import X.10o;
import X.1Pt;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import X.F8U;
import X.F8V;
import X.FAr;
import X.FGw;
import X.0yr;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import X.0tO;
import X.0k8;
import X.1O2;
import X.1Uo;
import X.0py;
import X.GdQ;
import X.0yD;
import X.0xj;
import X.5ob;
import X.0kQ;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import java.util.Objects;
import X.0yG;
import X.0jR;
import com.bytedance.android.live.microom.IMicRoomService;
import X.1VV;
import X.HMP;
import X.FBF;
import android.content.Context;
import X.1Qk;
import X.1Qg;
import X.0kb;
import X.0md;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import X.0sh;
import X.0sc;
import X.1XD;
import X.1XE;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import X.1Tr;
import com.bytedance.android.live.base.model.user.User;
import android.view.SurfaceView;
import X.1jw;
import X.0xa;
import X.1Tj;
import java.util.LinkedHashSet;
import X.0sD;
import java.util.Set;
import X.0uW;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import X.0nC;
import X.0xg;
import kotlin.jvm.internal.n;
import X.GCe;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.1NN;
import X.0k7;
import com.bytedance.android.live.liveinteract.linkroom.widget.AudienceBottomLeftLinkWidget;
import X.2P9;
import X.QgG;
import X.0rh;
import X.1VE;
import X.0sv;
import X.0rv;
import X.2Fc;
import X.2Fb;
import X.2Fa;
import X.2FZ;
import X.1ZH;
import X.1W7;
import X.CTM;
import X.0kc;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup;
import X.1cy;
import X.0kY;
import X.0n9;
import java.util.Iterator;
import X.0pg;
import X.0pc;
import X.0jz;
import X.1NO;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import X.FyD;
import java.util.List;
import X.G1l;
import com.bytedance.android.live.liveinteract.api.IInteractService;

public class InteractService implements IInteractService
{
    public boolean hasAddInteractObserve;
    public final G1l<Integer> interactObserver;
    public final List<FyD> listeners;
    
    static {
        Covode.recordClassIndex(7607);
    }
    
    public InteractService() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/ArrayList.<init>:()V
        //    12: putfield        com/bytedance/android/live/liveinteract/linkroom/InteractService.listeners:Ljava/util/List;
        //    15: aload_0        
        //    16: new             LX/1Pr;
        //    19: dup            
        //    20: aload_0        
        //    21: invokespecial   X/1Pr.<init>:(Lcom/bytedance/android/live/liveinteract/linkroom/InteractService;)V
        //    24: putfield        com/bytedance/android/live/liveinteract/linkroom/InteractService.interactObserver:LX/G1l;
        //    27: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void addInteractObserve() {
        1NO.LIZ().LIZ((G1l)this.interactObserver);
        this.hasAddInteractObserve = true;
    }
    
    private final boolean checkMultiCoHostStatus() {
        if (!this.hasMultiCoHostPermission()) {
            return false;
        }
        final List<0pc> coHostUserList = 0jz.LIZLLL().getCoHostUserList();
        final ArrayList list = new ArrayList();
        for (final 0pc next : coHostUserList) {
            final 0pc 0pc = next;
            if (0pc.LJFF == 0pg.INVITING || (0pc.LJFF == 0pg.INVITED && 0pc.LIZJ())) {
                list.add(next);
            }
        }
        final int size = list.size();
        final int size2 = 0jz.LIZLLL().getCoHostUserList().size();
        return size < 3 && size2 < 4;
    }
    
    @Override
    public long battleTaskRecommendGiftId() {
        return 0n9.LIZ.LJJIZ;
    }
    
    @Override
    public boolean canLinkMic() {
        return (!this.isLinkingMic() && !this.isInRandomLinkMic()) || this.checkMultiCoHostStatus();
    }
    
    @Override
    public 0kY createCommonLinkMicFeedViewManager() {
        return new 1cy();
    }
    
    @Override
    public 0kc createMultiGuestV3PreAdjustPlayerManager(final ViewGroup viewGroup, final DataChannel dataChannel, final 0CH 0ch) {
        CTM.LIZ((Object)viewGroup, (Object)0ch);
        return new 1W7(viewGroup, dataChannel, 0ch);
    }
    
    @Override
    public 1ZH createMultiLiveFeedView(final int n, final long n2, final long n3, final boolean b) {
        switch (n) {
            default: {
                return null;
            }
            case 11: {
                return new 2FZ(n2, n3, b);
            }
            case 12: {
                return new 2Fa(n2, n3, b);
            }
            case 13: {
                return new 2Fb(n2, n3, b);
            }
            case 14: {
                return new 2Fc(n2, n3, b);
            }
        }
    }
    
    @Override
    public 0rv createPaddingMask(final ViewGroup viewGroup) {
        return 0sv.LIZ.LIZ(viewGroup);
    }
    
    @Override
    public void disconnectMultiGuestV3() {
        final 0rh liz = 1VE.LJFF.LIZ();
        if (liz != null) {
            final QgG<2P9> liziz = liz.LIZIZ();
            if (liziz != null) {
                liziz.invoke();
            }
        }
    }
    
    @Override
    public long getBattleId() {
        return 0n9.LIZ.LJ();
    }
    
    @Override
    public Class<AudienceBottomLeftLinkWidget> getBottomLeftLinkHostWidget() {
        return AudienceBottomLeftLinkWidget.class;
    }
    
    @Override
    public long getChannelId() {
        if (0k7.LIZ(this.getCurrentLinkMode(), 4)) {
            return 1NN.LLFF.LIZ().LJ;
        }
        if (0k7.LIZ(this.getCurrentLinkMode(), 2)) {
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null) {
                return room.getId();
            }
        }
        return 0L;
    }
    
    @Override
    public String getConnectionType() {
        if (this.isRoomInBattle()) {
            return "manual_pk";
        }
        if (this.isInCoHost()) {
            return "anchor";
        }
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        if (liz.LJI) {
            return "audience";
        }
        return "normal";
    }
    
    @Override
    public String getCurrentInviteeList() {
        return 0xg.LIZ(1NN.LLFF.LIZ().LJIILL);
    }
    
    @Override
    public int getCurrentLinkMode() {
        return 1NN.LLFF.LIZ().LIZ();
    }
    
    @Override
    public String getCurrentPkState() {
        if (0n9.LIZ.LIZJ() == 0nC.START) {
            return "in_pk";
        }
        if (0n9.LIZ.LIZJ() == 0nC.PUNISH) {
            return "pk_punish";
        }
        return "";
    }
    
    @Override
    public String getDebugInfo() {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder("LinkMic State\uff1a");
        final boolean roomInBattle = this.isRoomInBattle();
        final String s = "none";
        String s2;
        if (roomInBattle) {
            s2 = "co-host pk";
        }
        else if (this.isInCoHost()) {
            s2 = "co-host";
        }
        else if (this.isInMultiGuest()) {
            s2 = "multi-guest";
        }
        else {
            final GCe liz = GCe.LIZ();
            n.LIZIZ((Object)liz, "");
            if (liz.LJI) {
                s2 = "multi-guest audience";
            }
            else {
                s2 = "none";
            }
        }
        sb2.append(s2);
        sb2.append('\n');
        sb.append(sb2.toString());
        final StringBuilder sb3 = new StringBuilder("MultiLiveType\uff1a");
        final String s3 = null;
        while (true) {
            Label_0459: {
                if (room == null) {
                    break Label_0459;
                }
                final RoomLinkInfo linkMicInfo = room.getLinkMicInfo();
                if (linkMicInfo == null) {
                    break Label_0459;
                }
                final Long value = linkMicInfo.LJFF;
                sb3.append(value);
                sb3.append(" (0:none or multi_guest_v1 / 1:multi_live or 1vn)\n");
                sb.append(sb3.toString());
                final StringBuilder sb4 = new StringBuilder("AudienceIdList\uff1a");
                while (true) {
                    Label_0453: {
                        if (room == null) {
                            break Label_0453;
                        }
                        final RoomLinkInfo linkMicInfo2 = room.getLinkMicInfo();
                        if (linkMicInfo2 == null) {
                            break Label_0453;
                        }
                        final List lizlll = linkMicInfo2.LIZLLL;
                        if (lizlll == null) {
                            break Label_0453;
                        }
                        final String string = lizlll.toString();
                        sb4.append(string);
                        sb4.append('\n');
                        sb.append(sb4.toString());
                        final StringBuilder sb5 = new StringBuilder("Stream ID\uff1a");
                        Long value2;
                        if (room != null) {
                            value2 = room.getStreamId();
                        }
                        else {
                            value2 = null;
                        }
                        sb5.append(value2);
                        sb5.append('\n');
                        sb.append(sb5.toString());
                        final StringBuilder sb6 = new StringBuilder("Stream Url\uff1a");
                        String ljff = s3;
                        if (room != null) {
                            final StreamUrl streamUrl = room.getStreamUrl();
                            ljff = s3;
                            if (streamUrl != null) {
                                ljff = streamUrl.LJFF;
                            }
                        }
                        sb6.append(ljff);
                        sb6.append('\n');
                        sb.append(sb6.toString());
                        final StringBuilder sb7 = new StringBuilder("Recent SEI\uff1a");
                        String s4;
                        if (this.isInCoHost()) {
                            s4 = 1NN.LLFF.LIZ().LJJ;
                        }
                        else if (this.isInMultiGuest()) {
                            s4 = GCe.LIZ().LJ;
                        }
                        else {
                            final GCe liz2 = GCe.LIZ();
                            n.LIZIZ((Object)liz2, "");
                            s4 = s;
                            if (liz2.LJI) {
                                s4 = GCe.LIZ().LJ;
                            }
                        }
                        sb7.append(s4);
                        sb7.append('\n');
                        sb.append(sb7.toString());
                        final String string2 = sb.toString();
                        n.LIZIZ((Object)string2, "");
                        return string2;
                    }
                    final String string = null;
                    continue;
                }
            }
            final Long value = null;
            continue;
        }
    }
    
    @Override
    public String getGuestLinkPermission(final Room room, final boolean b) {
        CTM.LIZ((Object)room);
        return 0uW.LIZJ.LIZ(room, b);
    }
    
    @Override
    public Set<Long> getHasAppliedUidSetForMultiGuestAnchor() {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            return 0jz.LIZJ().getHasAppliedUidSetWhenIsAnchor();
        }
        return new LinkedHashSet<Long>();
    }
    
    @Override
    public Set<Long> getHasInvitedUidSetForMultiGuestAnchor() {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            return 0jz.LIZJ().getHasInvitedUidSetWhenIsAnchor();
        }
        return 1Tj.LIZLLL;
    }
    
    @Override
    public String getInviteeList() {
        if (!this.isInCoHost()) {
            return "";
        }
        return 0xg.LIZ(1NN.LLFF.LIZ().LJIILL);
    }
    
    @Override
    public 0xa getLinkCrossRoomSeiData() {
        final Object liz = 1jw.LIZ.LIZ("LINK_CROSS_DATA_HOLDER");
        if (liz != null && liz instanceof 1NN) {
            return ((1NN)liz).LJLIIL;
        }
        return null;
    }
    
    @Override
    public SurfaceView getLinkInAnchorSurface() {
        return GCe.LIZ().LJIL;
    }
    
    @Override
    public int getLinkState(final User user) {
        CTM.LIZ((Object)user);
        final boolean multiGuestV3 = this.isMultiGuestV3();
        Object o = null;
        final 1XD 1xd = null;
        if (!multiGuestV3) {
            final Object liz = 1jw.LIZ.LIZ("LINK_USER_INFO_CENTER");
            if (liz instanceof 1Tr) {
                o = liz;
            }
            final 1Tr 1Tr = (1Tr)o;
            if (1Tr != null) {
                CTM.LIZ((Object)user);
                for (final LinkPlayerInfo linkPlayerInfo : 1Tr.LIZIZ) {
                    if (linkPlayerInfo.LIZJ != null) {
                        final User lizj = linkPlayerInfo.LIZJ;
                        n.LIZIZ((Object)lizj, "");
                        if (lizj.getId() == user.getId()) {
                            return linkPlayerInfo.LJ;
                        }
                        continue;
                    }
                }
            }
            return 0;
        }
        Object liz2;
        if (!((liz2 = 1jw.LIZ.LIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER")) instanceof 1XE)) {
            liz2 = null;
        }
        final 1XE 1xe = (1XE)liz2;
        Object liz3 = 1jw.LIZ.LIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (!(liz3 instanceof 1XD)) {
            liz3 = 1xd;
        }
        final 1XD 1xd2 = (1XD)liz3;
        if (1xe == null) {
            if (1xd2 != null) {
                final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> ljff = 1xd2.LJFF();
                final long id = user.getId();
                CTM.LIZ((Object)ljff);
                final LinkPlayerInfo liziz = 0sc.LIZIZ(ljff, id);
                if (liziz != null) {
                    return liziz.LJ;
                }
            }
            return 0;
        }
        final 0sh<LinkListUser, LinkMessage> ljff2 = 1xe.LJFF();
        final long id2 = user.getId();
        CTM.LIZ((Object)ljff2);
        final LinkListUser lizlll = 0sc.LIZLLL(ljff2, id2);
        if (lizlll != null) {
            return lizlll.LJIIIIZZ;
        }
        return 0;
    }
    
    @Override
    public String getLinkStatus4H5() {
        return 0md.LIZ;
    }
    
    @Override
    public 0kb getLinkWidgetFactory() {
        return new 1Qg();
    }
    
    @Override
    public int getLinkedGuestNum() {
        return GCe.LIZ().LJJI;
    }
    
    @Override
    public int getMatchPreviewProgressStatus() {
        final 1Qk liz = 0n9.LIZ;
        if (!liz.LJJIIZ) {
            return -1;
        }
        if (liz.LJJIIJ <= 0.5 && liz.LJJIIJZLJL > 0.5) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public int getMatchProgressStatus() {
        final 1Qk liz = 0n9.LIZ;
        if (liz.LIZJ() != 0nC.START) {
            return -1;
        }
        if (liz.LJJIIJ > 0.5) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public int getMaxLinkNum() {
        return 0sD.LIZJ.LIZ().LJIIIZ();
    }
    
    @Override
    public List<Long> getMultiCoHostLinkedUserList() {
        final List<0pc> coHostLinkedUserList = 0jz.LIZLLL().getCoHostLinkedUserList();
        final ArrayList list = new ArrayList();
        for (final 0pc 0pc : coHostLinkedUserList) {
            if (0pc != null) {
                list.add(0pc.LJIILIIL);
            }
        }
        return list;
    }
    
    @Override
    public HMP getMultiGuestLeaf(final Context context, final int n, final FBF<User> fbf, final DataChannel dataChannel, final Runnable runnable) {
        CTM.LIZ((Object)context, (Object)fbf, (Object)dataChannel, (Object)runnable);
        return new 1VV(context, fbf, n, dataChannel, runnable);
    }
    
    @Override
    public int getMultiGuestOnlineGuestsViews() {
        return GCe.LIZ().LJIJJ;
    }
    
    @Override
    public long getRivalAnchorUidWhenAnchorLinkMic() {
        return 1NN.LLFF.LIZ().LJFF;
    }
    
    @Override
    public String getRoomScene() {
        0yG.a a;
        if (0jR.LIZ(IMicRoomService.class).isMicRoomForCurrentRoom()) {
            a = 0yG.a.LINE_UP;
        }
        else {
            final IInteractService liz = 0jR.LIZ(IInteractService.class);
            Objects.requireNonNull(liz, "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.api.IInteractService");
            final IInteractService interactService = liz;
            if (interactService.isBattling()) {
                a = 0yG.a.LINK_MIC_PK;
            }
            else if (interactService.getLinkedGuestNum() > 0) {
                a = 0yG.a.LINK_MIC_GUEST;
            }
            else if (interactService.isInCoHost()) {
                a = 0yG.a.LINK_MIC_ANCHOR;
            }
            else {
                a = 0yG.a.NORMAL_VIDEO;
            }
        }
        return a.getDesc();
    }
    
    @Override
    public List<TeamUsersInfo> getTeamInfo() {
        return (List<TeamUsersInfo>)0n9.LIZ.LJIIIIZZ;
    }
    
    @Override
    public Set<Long> getUninvitedUidSet() {
        final Set ljj = GCe.LIZ().LJJ;
        n.LIZIZ((Object)ljj, "");
        return ljj;
    }
    
    @Override
    public 0kQ getUserRole(final long n) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return 0kQ.NORMAL_AUDIENCE;
        }
        if (n == room.getOwnerUserId()) {
            return 0kQ.CURRENT_ANCHOR;
        }
        if (n == 1NN.LLFF.LIZ().LJFF) {
            return 0kQ.GUEST_ANCHOR;
        }
        if (5ob.LIZ.LIZ.containsKey(n)) {
            return 0kQ.GUEST_AUDIENCE;
        }
        return 0kQ.NORMAL_AUDIENCE;
    }
    
    @Override
    public void handleLiveRoomStopped() {
        if (GCe.LIZ().LJJI > 0) {
            0xj.LIZ("live_over", null, 2);
        }
        0yD.LIZ.LIZ();
        GdQ.LIZLLL.LIZ();
    }
    
    @Override
    public boolean hasMultiCoHostPermission() {
        return 0py.LIZIZ().isMultiCoHost();
    }
    
    @Override
    public boolean isAdjustParentForPreviewDialog() {
        final 1NO liz = 1NO.LIZ();
        n.LIZIZ((Object)liz, "");
        if (liz.LIZJ()) {
            return true;
        }
        Object liz2;
        if (!((liz2 = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER")) instanceof 1Uo)) {
            liz2 = null;
        }
        final 1Uo 1Uo = (1Uo)liz2;
        return 1Uo != null && (1Uo.LJIJJ || 1Uo.LJIJJLI);
    }
    
    @Override
    public boolean isAnchorVideoEnable() {
        final Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        return liz == null || (liz instanceof 1Uo && ((1Uo)liz).LIZIZ);
    }
    
    @Override
    public boolean isAudienceApplied() {
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        return liz.LIZLLL;
    }
    
    @Override
    public boolean isBattleStarter() {
        return 0n9.LIZ.LIZLLL;
    }
    
    @Override
    public boolean isBattling() {
        return 0nC.START == 0n9.LIZ.LIZJ();
    }
    
    @Override
    public boolean isInCoHost() {
        return 1NN.LLFF.LIZ().LIZ;
    }
    
    @Override
    public boolean isInMultiGuest() {
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        return liz.LIZLLL;
    }
    
    @Override
    public boolean isInRandomLinkMic() {
        return 1O2.LIZ();
    }
    
    @Override
    public boolean isInteracting() {
        final 1NO liz = 1NO.LIZ();
        n.LIZIZ((Object)liz, "");
        final Integer n = (Integer)liz.LJIIIZ;
        kotlin.jvm.internal.n.LIZIZ((Object)n, "");
        final int intValue = n;
        return intValue == 2 || intValue == 1;
    }
    
    @Override
    public boolean isLinkingMic() {
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        return liz.LIZLLL || 1NN.LLFF.LIZ().LIZ;
    }
    
    @Override
    public boolean isMultiGuestV3() {
        return 0sD.LIZJ.LIZ().LIZLLL();
    }
    
    @Override
    public boolean isMultiLiveFixLayout() {
        final Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (liz instanceof 1Uo) {
            final 1Uo 1Uo = (1Uo)liz;
            if (1Uo.LJIILL == 0k8.GRID_FIX || 1Uo.LJIILL == 0k8.FLOATING_FIX) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean isMultiLiveFloatLayout() {
        final Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (liz instanceof 1Uo) {
            final 1Uo 1Uo = (1Uo)liz;
            if (1Uo.LJIILL == 0k8.FLOATING_FIX || 1Uo.LJIILL == 0k8.FLOATING) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean isMultiLiveGridLayout() {
        final Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (liz instanceof 1Uo) {
            final 1Uo 1Uo = (1Uo)liz;
            if (1Uo.LJIILL == 0k8.GRID_FIX || 1Uo.LJIILL == 0k8.GRID) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean isMultiLiveLayout() {
        final Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        return liz instanceof 1Uo && ((1Uo)liz).LJIILL != 0k8.NORMAL;
    }
    
    @Override
    public boolean isNotInLinkMicProgress() {
        return 0tO.LIZIZ();
    }
    
    @Override
    public boolean isPreparingCoHost() {
        return !0jz.LIZLLL().getCoHostState().isIdle();
    }
    
    @Override
    public boolean isRoomInBattle() {
        final 0nC lizj = 0n9.LIZ.LIZJ();
        return lizj.compareTo(0nC.START) >= 0 && lizj.compareTo(0nC.END) < 0;
    }
    
    @Override
    public boolean isTurnOffInvitation(final long n) {
        Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        final boolean b = liz instanceof 1Uo;
        final Object o = null;
        if (!b) {
            liz = null;
        }
        final 1Uo 1Uo = (1Uo)liz;
        Object liziz = o;
        if (1Uo != null) {
            liziz = 1Uo.LIZIZ(n);
        }
        return n.LIZ(liziz, (Object)true) && this.isMultiGuestV3();
    }
    
    @Override
    public void leaveOnCopyrightViolation(final Room room) {
        if (room != null) {
            final LinkApi linkApi = 0yr.LIZ().LIZ(LinkApi.class);
            final long id = room.getId();
            final GCe liz = GCe.LIZ();
            n.LIZIZ((Object)liz, "");
            linkApi.leave(id, liz.LJJIFFI, 10016).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZJ();
        }
    }
    
    @Override
    public void onInit() {
        0jR.LIZ(IPublicScreenService.class).addOnRegistryReadyListener(new 1Pt());
    }
    
    @Override
    public void preloadAnchorViewHolder() {
        H52.LJI.LIZ(2131562255, 5, 0);
    }
    
    @Override
    public void preloadWidgetView() {
        0TH.LJFF.LIZ(2131562387);
        0TH.LJFF.LIZ(2131562386);
        0TH.LJFF.LIZ(2131562375);
    }
    
    @Override
    public void registerInteractStateChangeListener(final FyD fyD) {
        if (!this.hasAddInteractObserve) {
            this.addInteractObserve();
        }
        if (fyD != null && !this.listeners.contains(fyD)) {
            this.listeners.add(fyD);
        }
    }
    
    @Override
    public void removeInteractStateChangeListener(final FyD fyD) {
        final List<FyD> listeners = this.listeners;
        Objects.requireNonNull(listeners, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        QgD.LIZIZ((Object)listeners).remove(fyD);
    }
    
    @Override
    public void tryPreloadMatchAnchorResource(final Room room) {
        public final class 1Ps implements HZG
        {
            static {
                Covode.recordClassIndex(7609);
            }
            
            public final void LIZ(final Bitmap bitmap) {
                0ba.LIZ(3, "InteractService", "load icon success");
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       5
        //     4: return         
        //     5: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/match/LiveMatchQualityOptimizeSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/match/LiveMatchQualityOptimizeSetting;
        //     8: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/match/LiveMatchQualityOptimizeSetting.enableOptimize:()Z
        //    11: ifeq            50
        //    14: aload_1        
        //    15: getfield        com/bytedance/android/livesdkapi/depend/model/live/Room.multiLiveUserSettings:Lcom/bytedance/android/livesdk/model/linksetting/MultiLiveUserSettings;
        //    18: astore_2       
        //    19: aload_2        
        //    20: ifnull          50
        //    23: aload_2        
        //    24: getfield        com/bytedance/android/livesdk/model/linksetting/MultiLiveUserSettings.LIZJ:Lcom/bytedance/android/livesdk/model/linksetting/CoHost;
        //    27: astore_2       
        //    28: aload_2        
        //    29: ifnull          50
        //    32: aload_2        
        //    33: getfield        com/bytedance/android/livesdk/model/linksetting/CoHost.LIZIZ:Ljava/util/List;
        //    36: astore_2       
        //    37: aload_2        
        //    38: ifnull          50
        //    41: aload_2        
        //    42: invokeinterface java/util/Collection.isEmpty:()Z
        //    47: ifeq            51
        //    50: return         
        //    51: aload_1        
        //    52: getfield        com/bytedance/android/livesdkapi/depend/model/live/Room.multiLiveUserSettings:Lcom/bytedance/android/livesdk/model/linksetting/MultiLiveUserSettings;
        //    55: astore_1       
        //    56: aload_1        
        //    57: ifnull          50
        //    60: aload_1        
        //    61: getfield        com/bytedance/android/livesdk/model/linksetting/MultiLiveUserSettings.LIZJ:Lcom/bytedance/android/livesdk/model/linksetting/CoHost;
        //    64: astore_1       
        //    65: aload_1        
        //    66: ifnull          50
        //    69: aload_1        
        //    70: getfield        com/bytedance/android/livesdk/model/linksetting/CoHost.LIZIZ:Ljava/util/List;
        //    73: astore_1       
        //    74: aload_1        
        //    75: ifnull          50
        //    78: aload_1        
        //    79: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    84: astore_1       
        //    85: aload_1        
        //    86: invokeinterface java/util/Iterator.hasNext:()Z
        //    91: ifeq            50
        //    94: aload_1        
        //    95: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   100: checkcast       Lcom/bytedance/android/livesdk/model/linksetting/LinkmicUser;
        //   103: astore_2       
        //   104: aload_2        
        //   105: ifnull          85
        //   108: aload_2        
        //   109: getfield        com/bytedance/android/livesdk/model/linksetting/LinkmicUser.LJFF:Lcom/bytedance/android/live/base/model/ImageModel;
        //   112: ifnull          85
        //   115: ldc_w           Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;.class
        //   118: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   121: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;
        //   124: aload_2        
        //   125: getfield        com/bytedance/android/livesdk/model/linksetting/LinkmicUser.LJFF:Lcom/bytedance/android/live/base/model/ImageModel;
        //   128: new             LX/1Ps;
        //   131: dup            
        //   132: invokespecial   X/1Ps.<init>:()V
        //   135: invokeinterface com/bytedance/android/livesdkapi/host/IHostFrescoHelper.LIZ:(Lcom/bytedance/android/live/base/model/ImageModel;LX/HZG;)LX/GfU;
        //   140: pop            
        //   141: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   144: ldc_w           LX/2GM;.class
        //   147: ldc_w           "room_enter"
        //   150: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZ:(Ljava/lang/Class;Ljava/lang/Object;)V
        //   153: goto            85
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
