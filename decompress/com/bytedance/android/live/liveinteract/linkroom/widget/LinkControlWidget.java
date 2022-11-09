// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.linkroom.widget;

import X.GK2;
import X.0bf;
import X.44T;
import X.G1k;
import X.I5h;
import com.bytedance.android.widget.Widget;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import X.Fzp;
import X.2FM;
import X.Fjw;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import X.Fhf;
import X.1ZT;
import X.1lD;
import X.GtJ;
import X.0md;
import X.0kH;
import X.2EH;
import X.GCf;
import X.1lG;
import X.2FA;
import X.1lF;
import X.2FD;
import X.1lE;
import X.2EQ;
import X.1kl;
import X.2EM;
import X.1kj;
import X.2D3;
import X.H8A;
import X.1QH;
import X.0kT;
import X.1dP;
import X.0yA;
import X.0mp;
import X.1lC;
import X.2D6;
import X.1lB;
import X.2Gb;
import X.1lA;
import X.Gst;
import X.1l9;
import X.2Eh;
import X.1l8;
import X.2Ei;
import X.1l7;
import X.2EE;
import X.1l5;
import X.2Eg;
import X.1l4;
import X.2Ec;
import X.1l3;
import X.2DK;
import X.1l2;
import X.2Gd;
import X.1l1;
import X.2Fe;
import X.1l0;
import X.2FH;
import X.1kz;
import X.2GX;
import X.1ky;
import X.2Eo;
import X.1kx;
import X.2En;
import X.1kw;
import X.2Ep;
import X.1ku;
import X.2Em;
import X.1kt;
import X.2Ek;
import X.1ks;
import X.2EO;
import X.1kr;
import X.2GQ;
import X.1kq;
import X.2GZ;
import X.1kk;
import X.2Ef;
import X.1lH;
import X.Gta;
import X.1l6;
import X.Gtf;
import X.1kv;
import X.1kg;
import X.2GO;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import X.HDh;
import X.GwN;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import X.GOM;
import X.GOH;
import X.G6q;
import X.G5l;
import com.bytedance.android.live.microom.IMicRoomService;
import X.G69;
import X.0jz;
import X.2Ew;
import X.0xm;
import X.0mq;
import X.0q5;
import X.0jR;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import X.HiW;
import X.SRS;
import com.bytedance.android.live.liveinteract.multicohost.widget.MultiCoHostWidget;
import X.0k3;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.liveinteract.multicohost.business.contract.MultiCoHostBeInvitedContract;
import X.1OY;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.LinkDialog;
import X.0Z7;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveAutoLinkMicSetting;
import X.GST;
import X.0xt;
import X.GGI;
import X.GpW;
import X.Gmg;
import X.2GP;
import X.1T2;
import X.0yB;
import X.0xK;
import X.FAE;
import X.1Qi;
import X.1Qh;
import X.FAN;
import X.FBp;
import X.FG5;
import X.FFb;
import X.FFa;
import X.0CC;
import X.FIw;
import X.2Du;
import X.1jz;
import X.1Pg;
import X.1Pf;
import X.FCD;
import X.0yr;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostPreviewDelaySetting;
import X.0cf;
import X.0mU;
import X.1kE;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoHostPreviewAnchorAndroidSwitchSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveCohostPreviewAnchorSetting;
import X.0kf;
import com.bytedance.android.livesdk.model.message.linker.invite_message.LinkerInviteContent;
import com.bytedance.android.live.base.model.ImageModel;
import X.1si;
import X.2Bo;
import com.bytedance.android.live.base.model.user.User;
import X.0xy;
import X.HQ5;
import X.2d6;
import X.1Pv;
import X.IAA;
import X.1Pu;
import X.F8U;
import X.F8V;
import X.FAr;
import X.FGw;
import X.HFv;
import X.1kL;
import X.1Py;
import kotlin.jvm.internal.n;
import X.G6r;
import X.G6t;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import X.0xf;
import X.1ml;
import android.app.Dialog;
import X.KN6;
import X.1Qe;
import X.G5i;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import X.FlV;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSdkGuestOneVnSetting;
import X.1cm;
import X.1lb;
import X.1TT;
import X.HiU;
import X.CTM;
import X.0xJ;
import X.2Ds;
import X.0kP;
import X.Hf4;
import X.0cB;
import com.bytedance.bpea.cert.token.TokenCert;
import X.2Dt;
import X.I5o;
import X.0mt;
import X.1QB;
import X.1Q5;
import X.5E4;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import X.6E8;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import X.Fgn;
import X.1ki;
import X.2P9;
import X.QgG;
import X.0mr;
import X.1kh;
import X.2ED;
import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import X.Gqy;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveOneTapGoliveEntranceSetting;
import X.2D5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import X.1NA;
import android.text.TextUtils;
import X.1Np;
import X.1jw;
import X.1O2;
import X.2FG;
import X.0pL;
import android.os.SystemClock;
import X.0mv;
import X.1RZ;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.live.liveinteract.multicohost.ui.fragment.MultiCoHostBeInvitedFragment;
import X.0d3;
import org.json.JSONObject;
import X.0k8;
import X.0uW;
import X.0mw;
import X.0q3;
import X.0TH;
import X.0xG;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.0xj;
import X.2GY;
import X.0tO;
import X.2D8;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3RoomLoadingOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.OneVNExperienceProblemsV1SwitchSetting;
import X.0sD;
import X.0mu;
import X.0n0;
import X.1NN;
import X.0xo;
import X.0k7;
import X.1NO;
import X.5ob;
import X.GCe;
import java.util.Map;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import java.util.HashMap;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCrossRoomWidget;
import X.0ba;
import com.bytedance.bpea.basics.Cert;
import X.0CH;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.design.app.LiveDialog;
import X.1cs;
import X.0kW;
import X.0xL;
import X.FC5;
import X.Fra;
import X.0nC;
import X.0kd;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCoHostBeInviteVideoPreloadWidget;
import X.0ka;
import com.bytedance.android.live.liveinteract.api.CoHostLiveWidget;
import X.1Nc;
import com.bytedance.android.live.liveinteract.commoninterface.BaseInternalLinkMicAnchorWidget;
import X.6mZ;
import X.GNM;
import X.1kO;
import X.0mk;
import com.bytedance.android.live.liveinteract.api.BaseLinkControlWidget;

public class LinkControlWidget extends BaseLinkControlWidget implements 0mk.a, 1kO.a, GNM, 6mZ
{
    public BaseInternalLinkMicAnchorWidget LIZIZ;
    public 1Nc LIZJ;
    public CoHostLiveWidget LIZLLL;
    public 0ka LJ;
    public LinkCoHostBeInviteVideoPreloadWidget LJFF;
    public 1kO LJI;
    public Room LJII;
    public boolean LJIIIIZZ;
    public BaseLinkControlWidget.a LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public final 0mk LJIIL;
    public boolean LJIILIIL;
    public 0kd LJIILJJIL;
    public 0nC LJIILL;
    public 0nC LJIILLIIL;
    public Fra LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public FC5 LJIJJLI;
    @0kW(LIZ = "LINKER_MANAGER")
    public 0xL LJIL;
    @0kW(LIZ = "LINK_MESSAGE_CENTER")
    public 1cs LJJ;
    public LiveDialog LJJI;
    public boolean LJJIFFI;
    
    static {
        Covode.recordClassIndex(7717);
    }
    
    public LinkControlWidget(final BaseLinkControlWidget.a ljiiiz) {
        this.LJIIL = new 0mk((0mk.a)this, (0CH)this);
        this.LJIJI = false;
        this.LJIJJ = false;
        this.LJIILIIL = false;
        this.LJJI = null;
        this.LJJIFFI = false;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIIZ = ljiiiz;
    }
    
    private void LIZ(final Cert cert) {
        if (this.LIZLLL != null) {
            final StringBuilder sb = new StringBuilder("startLinkCross, mLinkCrossRoomWidget = ");
            sb.append(this.LIZLLL);
            0ba.LIZ(4, "LinkControlWidget", sb.toString());
            final CoHostLiveWidget lizlll = this.LIZLLL;
            if (lizlll instanceof LinkCrossRoomWidget) {
                ((LinkCrossRoomWidget)lizlll).LIZ(cert);
            }
        }
        else {
            0ba.LIZ(4, "LinkControlWidget", "startLinkCross, switchMode");
            this.LIZLLL(4);
        }
    }
    
    public static void LIZ(String s, final boolean b) {
        final HashMap hashMap = new HashMap();
        hashMap.put("mode", s);
        s = "0";
        hashMap.put("stream_mix_on_client", "0");
        if (b) {
            s = "1";
        }
        hashMap.put("is_anchor", s);
        LivePerformanceManager.LJJIFFI.LIZ().LIZ("link_mic", (Map)hashMap);
    }
    
    private void LIZJ(final String s) {
        0ba.LIZ(4, "LinkControlWidget", "reset data holder ".concat(String.valueOf(s)));
        GCe.LIZ().LIZ(s, this.LJII);
        5ob.LIZ.LIZIZ(s);
        1NO.LIZ().LJ();
    }
    
    private void LIZLLL(final int n) {
        if (!((Widget)this).isViewValid()) {
            return;
        }
        final boolean liz = 0k7.LIZ(this.LJIIJJI, n);
        final StringBuilder sb = new StringBuilder("CurrentMode:");
        sb.append(this.LJIIJJI);
        sb.append("; TargetMode:");
        sb.append(n);
        sb.append(", containMode = ");
        sb.append(liz);
        0xo.LIZJ("SwitchMode", sb.toString());
        final StringBuilder sb2 = new StringBuilder("switchMode, before -> CurrentMode:");
        sb2.append(this.LJIIJJI);
        sb2.append("; TargetMode:");
        sb2.append(n);
        sb2.append(", containMode = ");
        sb2.append(liz);
        0ba.LIZ(4, "LinkControlWidget", sb2.toString());
        if (liz) {
            return;
        }
        this.LJIIJJI |= n;
        final StringBuilder sb3 = new StringBuilder("switchMode, after -> CurrentMode:");
        sb3.append(this.LJIIJJI);
        0ba.LIZ(4, "LinkControlWidget", sb3.toString());
        1NN.LLFF.LIZ().LIZ(this.LJIIJJI);
        if (n == 2) {
            LIZ("normal", this.LJIIIIZZ);
            if (this.LJIIIIZZ) {
                if (!super.LIZ) {
                    this.LJIJ();
                    0n0.LIZJ.LIZIZ(this.LJIIL.LIZIZ.LIZJ, new 0mu(this), 0n0.a.MULTIGUEST);
                }
                final BaseInternalLinkMicAnchorWidget liziz = (BaseInternalLinkMicAnchorWidget)this.LJIIIZ.LIZ(0);
                this.LIZIZ = liziz;
                if (this.LJIIJ) {
                    liziz.LIZIZ();
                }
                this.LJIIJ = false;
            }
            else {
                this.LIZJ = (1Nc)this.LJIIIZ.LIZ(1);
                if (0sD.LIZJ.LIZ().LIZLLL() && (OneVNExperienceProblemsV1SwitchSetting.INSTANCE.getValue() || MultiGuestV3RoomLoadingOptSetting.INSTANCE.isEnable())) {
                    this.LIZJ.LIZ((String)super.dataChannel.LIZIZ((Class)2D8.class));
                }
                0tO.LIZIZ(this.LJII, super.dataChannel);
                final StringBuilder sb4 = new StringBuilder("TargetMode:");
                sb4.append(n);
                sb4.append(", action:loadMultiGuestWidget");
                0xo.LIZJ("SwitchMode", sb4.toString());
            }
            super.dataChannel.LIZIZ((Class)2GY.class, (Object)2);
            return;
        }
        if (n == 4) {
            final StringBuilder sb5 = new StringBuilder("TargetMode:");
            sb5.append(n);
            sb5.append(", action:loadCoHostWidget");
            0xo.LIZJ("SwitchMode", sb5.toString());
            LIZ("pk", this.LJIIIIZZ);
            this.LJIJI();
        }
    }
    
    private void LJ(final int n) {
        final StringBuilder sb = new StringBuilder("unLoadWidget, before -> CurrentMode = ");
        sb.append(this.LJIIJJI);
        sb.append("  removeMode = ");
        sb.append(n);
        0ba.LIZ(4, "LinkControlWidget", sb.toString());
        0xo.LIZJ("unLoadWidget", "mode:".concat(String.valueOf(n)));
        if (!0k7.LIZ(this.LJIIJJI, n)) {
            return;
        }
        this.LJIIJJI = 0k7.LIZIZ(this.LJIIJJI, n);
        final StringBuilder sb2 = new StringBuilder("unLoadWidget, after -> CurrentMode:");
        sb2.append(this.LJIIJJI);
        0ba.LIZ(4, "LinkControlWidget", sb2.toString());
        1NN.LLFF.LIZ().LIZ(this.LJIIJJI);
        final StringBuilder sb3 = new StringBuilder("unLoadWidget, after remove mode, mCurrentMode = ");
        sb3.append(this.LJIIJJI);
        0ba.LIZ(4, "LinkControlWidget", sb3.toString());
        if (n == 2) {
            0xj.LIZLLL.LIZ("other");
            0xj.LIZLLL.LIZIZ("connection_over");
            this.LJIIIZ.LIZ(this.LIZIZ);
            this.LJIIIZ.LIZ((LiveWidget)this.LIZJ);
            this.LIZIZ = null;
            this.LIZJ = null;
            this.LJIL.LIZ(0xG.a.MULTIGUEST);
            if (0sD.LIZJ.LIZ().LIZLLL()) {
                0sD.LIZJ.LIZ().LJII();
            }
        }
        else if (n == 4) {
            this.LJIIIZ.LIZ(this.LIZLLL);
            0TH.LJFF.LIZ(2131562375);
            this.LJI.LJFF();
            this.LIZLLL = null;
            this.LJIL.LIZ(0xG.a.COHOST);
            this.LJIILJJIL();
            if (this.LJJIFFI) {
                this.LJJIFFI = false;
            }
            else {
                0q3.LIZ();
            }
        }
        if (this.LJIIJJI == 0) {
            if (this.LJIIIIZZ) {
                if (!this.LJIJI && !super.LIZ) {
                    this.LJIJ();
                    0n0.LIZJ.LIZIZ(this.LJIIL.LIZIZ.LIZJ, new 0mw(this), 0n0.a.MULTIGUEST);
                }
            }
            else {
                this.LJIIL.LIZ(8, 16);
                0xj.LIZLLL.LIZ("other");
                if (0uW.LIZJ.LIZ()) {
                    0uW.LIZJ.LIZIZ("others", (0k8)null);
                    0uW.LIZJ.LIZ("others", 0k8.NORMAL);
                }
            }
            super.dataChannel.LIZIZ((Class)2GY.class, (Object)0);
            LJJI();
        }
    }
    
    private boolean LJIILL() {
        return 1NN.LLFF.LIZ().LJJLIIIJLJLI >= 10000L;
    }
    
    private JSONObject LJIILLIIL() {
        final JSONObject jsonObject = new JSONObject();
        final 1NN liz = 1NN.LLFF.LIZ();
        String s;
        if (liz.LJIIZILJ) {
            s = "inviter";
        }
        else {
            s = "invitee";
        }
        0d3.LIZ(jsonObject, "role_type", s);
        String s2;
        if (liz.LJIILIIL) {
            s2 = "random";
        }
        else {
            s2 = "normal";
        }
        0d3.LIZ(jsonObject, "from", s2);
        return jsonObject;
    }
    
    private void LJIIZILJ() {
        final InteractDialogFragmentBaseContract.AbsView<?> lizlll = 0q3.LIZLLL("LinkDialog");
        if (lizlll instanceof MultiCoHostBeInvitedFragment) {
            ((MultiCoHostBeInvitedFragment)lizlll).LIZLLL();
        }
    }
    
    private void LJIJ() {
        final CoHostLiveWidget lizlll = this.LIZLLL;
        if (lizlll != null && lizlll.LIZJ() != null) {
            final Object lizj = this.LIZLLL.LIZJ();
            if (lizj instanceof 1RZ) {
                0n0.LIZJ.LIZ(((1RZ)lizj).LIZ, new 0mv(this), 0n0.a.PK);
            }
        }
    }
    
    private void LJIJI() {
        SystemClock.elapsedRealtime();
        if (1NN.LLFF.LIZ().LJIJ > 0) {
            1NN.LLFF.LIZ();
        }
        final 0pL 0pL = (0pL)super.dataChannel.LIZIZ((Class)2FG.class);
        if (0pL != null && 0pL.isMultiCoHost() && !1O2.LIZ()) {
            this.LIZLLL = (CoHostLiveWidget)this.LJIIIZ.LIZ(6);
        }
        else {
            if (1jw.LIZ.LIZJ("LINKER_MANAGER")) {
                return;
            }
            if (!(this.LJIL.LIZ() instanceof 1Np)) {
                this.LJI.LIZJ();
            }
            this.LIZLLL = (CoHostLiveWidget)this.LJIIIZ.LIZ(2);
        }
        if (this.LJIIIIZZ) {
            this.LJIIL.LIZ(0, 1);
        }
        else {
            this.LJIIL.LIZ(8, 16);
        }
        super.dataChannel.LIZIZ((Class)2GY.class, (Object)4);
        if (!this.LJIIIIZZ) {
            final String ljj = 1NN.LLFF.LIZ().LJJ;
            if (!TextUtils.isEmpty((CharSequence)ljj)) {
                this.LIZ(ljj);
            }
        }
    }
    
    private boolean LJIJJ() {
        final 1NA 1na = (1NA)DataChannelGlobal.LIZJ.LIZIZ((Class)2D5.class);
        return 1na != null && 1na.LIZIZ != null && 1na.LIZIZ == 1 && TTliveOneTapGoliveEntranceSetting.INSTANCE.getValue();
    }
    
    private void LJIJJLI() {
        if (super.dataChannel == null) {
            return;
        }
        if (!LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC)) {
            return;
        }
        final boolean liz = this.LJIL.LIZ;
        final boolean liziz = this.LJIL.LIZIZ;
        int n = 0;
        if (liz) {
            if (liziz) {
                n = 3;
            }
            else {
                n = 1;
            }
        }
        else if (liziz) {
            n = 2;
        }
        super.dataChannel.LIZ((Class)2ED.class, (Object)n);
        0ba.LIZ(4, "updateLinkMicEnableStatus", "newestStatus = ".concat(String.valueOf(n)));
    }
    
    private void LJIL() {
        0mr.LIZ(this.LJII, (QgG<2P9>)new 1kh(this));
    }
    
    private void LJJ() {
        0mr.LIZ(this.LJII, (QgG<2P9>)new 1ki(this));
    }
    
    public static void LJJI() {
        LivePerformanceManager.LJJIFFI.LIZ().LIZJ("link_mic");
    }
    
    @Override
    public final void LIZ() {
        this.LJIJ();
        0n0.LIZJ.LIZIZ(this.LJIIL.LIZIZ.LIZJ, new 0mt(this), 0n0.a.MULTIGUEST);
    }
    
    @Override
    public final void LIZ(final int n) {
        final JSONObject ljiilliil = this.LJIILLIIL();
        0d3.LIZ(ljiilliil, "permit_status", n);
        ((I5h)I5o.LIZIZ).LIZJ("get_reply", ljiilliil);
        if (n != 1) {
            final JSONObject ljiilliil2 = this.LJIILLIIL();
            0d3.LIZ(ljiilliil2, "end_reason", "not_agree");
            ((I5h)I5o.LIZIZ).LIZ(2, ljiilliil2);
        }
        if (!((Widget)this).isViewValid()) {
            return;
        }
        1NN.LLFF.LIZ().LIZJ = true;
        final StringBuilder sb = new StringBuilder("onReceivePermitApply, permit = ");
        sb.append(n);
        sb.append("   guestUserId = ");
        sb.append(1NN.LLFF.LIZ().LJFF);
        0ba.LIZ(4, "LinkControlWidget", sb.toString());
        if (n == 1) {
            if (1O2.LIZJ()) {
                if (super.dataChannel != null) {
                    super.dataChannel.LIZJ((Class)2Dt.class, (Object)"");
                }
                1NN.LLFF.LIZ().LJIILIIL = true;
            }
            0q3.LIZ();
            this.LIZ((Cert)TokenCert.with("bpea-linkmic_linkcontrolwidget_startLinkCross"));
            return;
        }
        Hf4.LIZ(0cB.LJ(), 2131829289);
    }
    
    @Override
    public final void LIZ(int liziz, final boolean b, final Cert cert) {
        final JSONObject ljiilliil = this.LJIILLIIL();
        0d3.LIZ(ljiilliil, "reply_status", liziz);
        ((I5h)I5o.LIZIZ).LIZJ("get_reply", ljiilliil);
        if (liziz != 1) {
            final JSONObject ljiilliil2 = this.LJIILLIIL();
            0d3.LIZ(ljiilliil2, "end_reason", "not_agree");
            ((I5h)I5o.LIZIZ).LIZ(2, ljiilliil2);
        }
        if (!((Widget)this).isViewValid()) {
            return;
        }
        if (!b && 1NN.LLFF.LIZ().LIZJ && 1NN.LLFF.LIZ().LJIILLIIL != 0kP.RANDOM_LINK_MIC_RECOMMEND) {
            return;
        }
        1NN.LLFF.LIZ().LIZJ = true;
        final StringBuilder sb = new StringBuilder("onReceiveReply, reply = ");
        sb.append(liziz);
        sb.append("   guestUserId = ");
        sb.append(1NN.LLFF.LIZ().LJFF);
        0ba.LIZ(4, "LinkControlWidget", sb.toString());
        if (liziz == 1) {
            if (1O2.LIZJ() || (1O2.LJ() && 1NN.LLFF.LIZ().LJIILLIIL == 0kP.RANDOM_LINK_MIC_RECOMMEND)) {
                if (super.dataChannel != null) {
                    super.dataChannel.LIZJ((Class)2Dt.class, (Object)"");
                }
                1NN.LLFF.LIZ().LJIILIIL = true;
            }
            0q3.LIZ();
            this.LIZ(cert);
            return;
        }
        if (1O2.LIZJ() && 1NN.LLFF.LIZ().LJIILLIIL != 0kP.RANDOM_LINK_MIC_RECOMMEND) {
            1NN.LLFF.LIZ().LJIIJJI = true;
            final 0xJ liziz2 = this.LJIL.LIZIZ(0xG.a.COHOST);
            if (liziz2 instanceof 1Np && ((1Np)liziz2).LIZJ()) {
                super.dataChannel.LIZJ((Class)2Ds.class, (Object)"");
            }
            return;
        }
        if (1NN.LLFF.LIZ().LJIILLIIL != 0kP.RANDOM_LINK_MIC_RECOMMEND) {
            liziz = this.LIZIZ(liziz);
            Hf4.LIZ(0cB.LJ(), liziz);
            final 0xJ liziz3 = this.LJIL.LIZIZ(0xG.a.COHOST);
            if (liziz3 instanceof 1Np) {
                ((1Np)liziz3).LIZJ();
            }
        }
    }
    
    @Override
    public final void LIZ(final 0pL ljiizilj) {
        final 0mk ljiil = this.LJIIL;
        CTM.LIZ((Object)ljiizilj);
        final 1Q5 liz = ljiil.LIZ;
        CTM.LIZ((Object)ljiizilj);
        final 0pL none = 0pL.NONE;
        final boolean b = true;
        final int n = 0;
        final boolean ljij = ljiizilj != none;
        if (liz.LJIJ != ljij) {
            liz.LJIJ = ljij;
            int n2;
            if (liz.LJIJ) {
                n2 = 0;
            }
            else {
                n2 = 8;
            }
            liz.LIZ(n2);
        }
        liz.LJIIZILJ = ljiizilj;
        final boolean liz2 = ljiizilj != 0pL.NONE && b;
        0xo.LIZJ("LinkCrossRoomPermissionResult", "result : ".concat(String.valueOf(liz2)));
        0ba.LIZ(4, "LinkControlWidget", "onLinkCrossRoomPermissionResult, permission = ".concat(String.valueOf(ljiizilj)));
        final JSONObject jsonObject = new JSONObject();
        int n3;
        if (liz2) {
            n3 = n;
        }
        else {
            n3 = -1;
        }
        0d3.LIZ(jsonObject, "err_code", n3);
        ((I5h)HiU.LIZ).LIZIZ("check_permission", jsonObject);
        if (this.LJIJI) {
            this.LJIIL.LIZ(8, 17);
        }
        this.LJIL.LIZ = liz2;
        1NN.LLFF.LIZ();
        this.LJIJJLI();
    }
    
    @Override
    public final void LIZ(final 5E4 5e4) {
        if (this.LJIJI) {
            return;
        }
        final Room ljii = this.LJII;
        if (ljii != null && !ljii.isLiveTypeAudio()) {
            if (!0sD.LIZJ.LIZ().LIZLLL()) {
                0xJ 0xJ;
                if (!((0xJ = this.LJIL.LIZ()) instanceof 1TT)) {
                    1jw.LIZ.LIZ(new 1lb(), null);
                    final 1cm 1cm = new 1cm();
                    1cm.LIZ = this.LJIIIIZZ;
                    this.LJIL.LIZ(this.LJII.getOwnerUserId(), 0xG.a.MULTIGUEST, super.dataChannel, 1cm);
                    0xJ = this.LJIL.LIZIZ(0xG.a.MULTIGUEST);
                }
                if (!this.LJIIIIZZ && 0xJ instanceof 1TT && this.LJI.LJII) {
                    GCe.LIZ().LJJIIJ = 3;
                }
            }
            final StringBuilder sb = new StringBuilder("source:");
            sb.append(5e4.value);
            0xo.LIZJ("onMultiGuestTurnedOn", sb.toString());
            if (!this.LJIIIIZZ && 0sD.LIZJ.LIZ().LIZLLL() && LiveSdkGuestOneVnSetting.INSTANCE.isDisable()) {
                0xo.LIZJ("onMultiGuestTurnedOn", "block turn on by 1vn guestsetting.");
                return;
            }
            this.LIZLLL(2);
            0xj.LIZ = SystemClock.uptimeMillis();
            final Map<String, String> liziz = 0xj.LIZLLL.LIZIZ();
            String liziz2;
            if ((liziz2 = 0xj.LIZIZ) == null) {
                liziz2 = "others";
            }
            liziz.put("trigger", liziz2);
            liziz.put("permission_type", 0tO.LIZLLL());
            0uW.LIZJ.LIZ(liziz, 0uW.LIZJ.LIZIZ());
            0xj.LIZIZ = null;
            0xj.LIZLLL.LIZ("livesdk_guest_connection_mode_view_start", liziz);
        }
        if (5e4 == 5E4.USER_CLICK) {
            Hf4.LIZ(0cB.LJ(), 2131829039);
        }
        if (5e4 == 5E4.ACTIVITY_PAGE_OPEN) {
            0tO.LIZ(true, 0tO.LIZ(), 5E4.ACTIVITY_PAGE_OPEN);
        }
        ((G1k)GCe.LIZ()).LIZ((Object)true);
    }
    
    @Override
    public final void LIZ(final 5E4 5e4, final Throwable t) {
        if (5e4 == 5E4.USER_CLICK) {
            FlV.LIZ(((Widget)this).context, t, 2131835918);
        }
    }
    
    @Override
    public final void LIZ(final LinkMessage linkMessage) {
        if (!((Widget)this).isViewValid()) {
            return;
        }
        if (linkMessage.LIZJ == 4) {
            if (this.LJIIIIZZ) {
                this.LIZIZ();
                return;
            }
            if (1NO.LIZ().LIZJ() && (super.dataChannel == null || super.dataChannel.LIZIZ((Class)G5i.class) == null || !(boolean)super.dataChannel.LIZIZ((Class)G5i.class))) {
                if (this.LJJI == null) {
                    final LiveDialog.a a = new LiveDialog.a(((Widget)this).context);
                    a.LIZJ(2131830167);
                    a.LIZ(2131831382, 1Qe.LIZ);
                    this.LJJI = a.LIZIZ();
                }
                final LiveDialog ljji = this.LJJI;
                if (ljji != null) {
                    ljji.show();
                    KN6.LIZ.LIZ((Dialog)ljji);
                }
            }
            this.LJ(2);
            1ml.LJI(false);
            final 0xf liz = 0xf.LJIIJ.LIZ();
            if (liz != null) {
                liz.LIZIZ = false;
            }
        }
    }
    
    @Override
    public final void LIZ(final LinkMicAnchorGuideMessage linkMicAnchorGuideMessage) {
        Boolean value = false;
        if (super.dataChannel != null) {
            value = value;
            if (super.dataChannel.LIZIZ((Class)G6t.class) != null) {
                value = (Boolean)super.dataChannel.LIZIZ((Class)G6t.class);
            }
        }
        if (1NN.LLFF.LIZ().LJJJLL == -1 && !value) {
            1NN.LLFF.LIZ().LJLJLJ = linkMicAnchorGuideMessage.LJFF;
            if (linkMicAnchorGuideMessage.LJ != null) {
                super.dataChannel.LIZ((Class)G6r.class, (Object)linkMicAnchorGuideMessage.LJ.getId());
                final 0mk ljiil = this.LJIIL;
                CTM.LIZ((Object)linkMicAnchorGuideMessage);
                final User lj = linkMicAnchorGuideMessage.LJ;
                String idStr = "";
                if (lj != null) {
                    final 1Q5 liz = ljiil.LIZ;
                    n.LIZIZ((Object)lj, "");
                    CTM.LIZ((Object)lj);
                    final 2Bo ljiiiz = liz.LJIIIZ;
                    if (ljiiiz != null) {
                        final 1si ljii = liz.LJII;
                        if (ljii != null) {
                            final 1si ljiiiizz = liz.LJIIIIZZ;
                            if (ljiiiizz != null) {
                                final 1kL 1kL = new 1kL(ljii, ljiiiizz, ljiiiz, new 1Py(ljiiiizz, ljiiiz, ljii));
                                final ImageModel avatarThumb = lj.getAvatarThumb();
                                n.LIZIZ((Object)avatarThumb, "");
                                HFv.LIZ(avatarThumb).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1Pu(liz, (IAA)1kL, avatarThumb, ljii), (2d6)new 1Pv((IAA)1kL, avatarThumb));
                            }
                        }
                    }
                }
                final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
                String value2;
                if (room == null) {
                    value2 = "";
                }
                else {
                    value2 = String.valueOf(room.getOwnerUserId());
                    idStr = room.getIdStr();
                }
                0xy.LIZ(value2, idStr, "anchor_icon", String.valueOf(linkMicAnchorGuideMessage.LJI), String.valueOf(linkMicAnchorGuideMessage.LJ.getId()));
            }
        }
    }
    
    @Override
    public final void LIZ(final LinkerInviteContent linkerInviteContent) {
        final JSONObject jsonObject = new JSONObject();
        final Room ljii = this.LJII;
        if (ljii != null) {
            0d3.LIZ(jsonObject, "room_id", ljii.getIdStr());
        }
        0d3.LIZ(jsonObject, "remote_room_id", linkerInviteContent.LIZIZ);
        0d3.LIZ(jsonObject, "record_id", 1NN.LLFF.LIZ().LJJJJZI);
        0d3.LIZ(jsonObject, "user_id", this.LJII.getOwnerUserId());
        0d3.LIZ(jsonObject, "remote_user_id", linkerInviteContent.LIZ);
        0d3.LIZ(jsonObject, "is_inviter", false);
        ((I5h)I5o.LIZIZ).LIZ(jsonObject);
        ((I5h)I5o.LIZIZ).LIZ("popup_show");
        if (!((Widget)this).isViewValid()) {
            return;
        }
        final StringBuilder sb = new StringBuilder("onReceiveInvitation, channelId = ");
        sb.append(1NN.LLFF.LIZ().LJ);
        0ba.LIZ(4, "LinkControlWidget", sb.toString());
        if (1NN.LLFF.LIZ().LJ == 0L) {
            return;
        }
        0q3.LIZIZ("LinkDialog");
        final StringBuilder sb2 = new StringBuilder("onReceiveInvitation, InviteType = ");
        sb2.append(1NN.LLFF.LIZ().LJIILL);
        0ba.LIZ(4, "LinkControlWidget", sb2.toString());
        if (1NN.LLFF.LIZ().LJIILL != 0kf.RANDOM_LINK_MIC_INVITE || !1O2.LIZIZ()) {
            if (1NN.LLFF.LIZ().LJIILL != 0kf.RANDOM_LINK_MIC_INVITE) {
                if (1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
                    1NN.LLFF.LIZ().LJIILIIL = true;
                }
                ((I5h)I5o.LIZIZ).LIZ("inviter_preview_first_frame_render");
                final 0pL 0pL = (0pL)super.dataChannel.LIZIZ((Class)2FG.class);
                0ba.LIZ(4, "LinkControlWidget", "showInviteFragmentAndStartLinkCross, permission = ".concat(String.valueOf(0pL)));
                this.LJIJ = false;
                if (LiveCohostPreviewAnchorSetting.INSTANCE.isOpenCoHostPreviewAnchor() && !this.LJIILL() && LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue() && (0pL == null || !0pL.isMultiCoHost())) {
                    0ba.LIZ(4, "LinkControlWidget", "onReceiveInvitation, preview show");
                    0xo.LIZ("CoHost_PrePare_Show_VideoPreview_Start");
                    (this.LJFF = (LinkCoHostBeInviteVideoPreloadWidget)this.LJIIIZ.LIZ(5)).LIZ(new 1kE() {
                        static {
                            Covode.recordClassIndex(7720);
                        }
                        
                        @Override
                        public final void LIZ() {
                            super.LIZ();
                            0xo.LIZ("CoHost_PrePare_Show_VideoPreview_onPlayDisplayed");
                            LinkControlWidget.this.LIZJ(0);
                            final LinkControlWidget liziz = LinkControlWidget.this;
                            liziz.LIZ(linkerInviteContent, liziz.LJFF, true, false);
                        }
                        
                        @Override
                        public final void LIZ(final Exception ex) {
                            super.LIZ(ex);
                            if (ex == null) {
                                0xo.LIZ("CoHost_PrePare_Show_VideoPreview_onNonPlayerInternalError");
                            }
                            else {
                                final StringBuilder sb = new StringBuilder("CoHost_PrePare_Show_VideoPreview_onNonPlayerInternalError: ");
                                sb.append(ex.getMessage());
                                0xo.LIZ(sb.toString());
                            }
                            final LinkControlWidget liziz = LinkControlWidget.this;
                            liziz.LIZJ(liziz.LJIILIIL());
                            LinkControlWidget.this.LIZ(linkerInviteContent, null, true, true);
                        }
                        
                        @Override
                        public final void LIZIZ() {
                            super.LIZIZ();
                            0xo.LIZ("CoHost_PrePare_Show_VideoPreview_onPlayOverTime");
                            LinkControlWidget.this.LIZJ(-1);
                            LinkControlWidget.this.LIZ(linkerInviteContent, null, true, true);
                        }
                        
                        @Override
                        public final void a_(final Exception ex) {
                            super.a_(ex);
                            if (ex == null) {
                                0xo.LIZ("CoHost_PrePare_Show_VideoPreview_onError");
                            }
                            else {
                                final StringBuilder sb = new StringBuilder("CoHost_PrePare_Show_VideoPreview_onError: ");
                                sb.append(ex.getMessage());
                                0xo.LIZ(sb.toString());
                            }
                            final LinkControlWidget liziz = LinkControlWidget.this;
                            liziz.LIZJ(liziz.LJIILIIL());
                            LinkControlWidget.this.LIZ(linkerInviteContent, null, true, true);
                        }
                    });
                    final LinkCoHostBeInviteVideoPreloadWidget ljff = this.LJFF;
                    final String value = String.valueOf(linkerInviteContent.LIZIZ);
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_StarPreLoadVideo");
                    if (value == null || value.length() == 0) {
                        ljff.LJIIIZ = -4;
                        ljff.LIZIZ(new Exception("RoomIds_IsNullOrEmpty"));
                        return;
                    }
                    if (!ljff.LIZIZ) {
                        ljff.LIZIZ = true;
                        final 0mU lizlll = new 0mU(ljff);
                        0cf.LIZ().postDelayed((Runnable)lizlll, (long)(LiveCohostPreviewDelaySetting.INSTANCE.getValue() * 1000.0f));
                        ljff.LIZLLL = lizlll;
                        ljff.LIZJ = 0yr.LIZ().LIZ(CoHostApi.class).getPullStreamInfoByRoomIds(value).LIZ((FCD)new FC5()).LIZ((2d6)new 1Pf(ljff, value, elapsedRealtime), (2d6)new 1Pg(ljff));
                    }
                }
                else {
                    0ba.LIZ(4, "LinkControlWidget", "onReceiveInvitation, not preview show");
                    0xo.LIZ("CoHost_PrePare_Show_HeadPortraitPreview");
                    if (LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
                        if (this.LJIILL()) {
                            this.LIZJ(-5);
                        }
                        else {
                            this.LIZJ(1);
                        }
                    }
                    this.LIZ(linkerInviteContent, null, false, false);
                }
            }
            return;
        }
        if (super.dataChannel != null) {
            super.dataChannel.LIZJ((Class)2Dt.class, (Object)"");
        }
        1NN.LLFF.LIZ().LJIILIIL = true;
        if (1NN.LLFF.LIZ().LJJIJL && !TextUtils.isEmpty((CharSequence)1NN.LLFF.LIZ().LJJIJIL)) {
            final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-505");
            with.usage("");
            with.tag("link mic start to push stream");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
            this.LIZ((Cert)with.build());
        }
        final 1NN liz = 1NN.LLFF.LIZ();
        if (liz.LJ == 0L || this.LJII == null) {
            1jz.LIZ();
            return;
        }
        if (liz.LJJIJL && !TextUtils.isEmpty((CharSequence)liz.LJJIJIL)) {
            0xo.LIZJ("LinkCross_Reply", "start Interact when reply click agree");
            liz.LIZJ = true;
            if (super.dataChannel != null) {
                super.dataChannel.LIZIZ((Class)2Du.class, (Object)new Fgn(4));
            }
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("reply_status", 1);
        if (this.LJIL.LIZIZ(0xG.a.COHOST) != null) {
            final FAE<0xK> liziz = this.LJIL.LIZIZ(0xG.a.COHOST).LIZIZ(hashMap);
            if (liziz == null) {
                0xo.LIZJ("LinkCross_Reply", "single is null");
                return;
            }
            if (this.LJIJJLI == null) {
                this.LJIJJLI = new FC5();
            }
            ((FIw)liziz.LIZ((FAN)FFb.LIZ((FG5)FFa.LIZ((0CH)this, 0CC.a.ON_DESTROY), (FBp)this.LJIJJLI))).LIZ(1Qh.LIZ, (2d6)new 1Qi(this));
        }
    }
    
    public final void LIZ(final LinkerInviteContent linkerInviteContent, final LinkCoHostBeInviteVideoPreloadWidget linkCoHostBeInviteVideoPreloadWidget, final boolean b, final boolean b2) {
        1NN.LLFF.LIZ().LJLLJ = linkerInviteContent.LJIJI;
        if (LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
            if (this.LJIJ) {
                0xo.LIZ("HasShowBeInvitedFragment_True");
                return;
            }
            this.LJIJ = true;
            if (b && b2) {
                this.LJIILJJIL();
            }
        }
        final 0pL 0pL = (0pL)super.dataChannel.LIZIZ((Class)2FG.class);
        0ba.LIZ(4, "LinkControlWidget", "showInviteFragmentAndStartLinkCross, permission = ".concat(String.valueOf(0pL)));
        if (0pL != null && 0pL.isMultiCoHost()) {
            1T2.LIZ(super.dataChannel, 0yB.LIZ((0CH)this, linkerInviteContent));
        }
        else {
            1T2.LIZ(super.dataChannel, 0yB.LIZ((0CH)this, linkerInviteContent, linkCoHostBeInviteVideoPreloadWidget));
            if (1NN.LLFF.LIZ().LJJIJL && !TextUtils.isEmpty((CharSequence)1NN.LLFF.LIZ().LJJIJIL)) {
                final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-507");
                with.usage("");
                with.tag("link mic start to push stream");
                with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
                this.LIZ((Cert)with.build());
                final CoHostLiveWidget lizlll = this.LIZLLL;
                if (lizlll != null && lizlll instanceof LinkCrossRoomWidget) {
                    ((LinkCrossRoomWidget)lizlll).LIZ(Boolean.valueOf(true));
                }
            }
        }
        super.dataChannel.LIZJ((Class)2GP.class);
    }
    
    public final void LIZ(final String ljj) {
        0ba.LIZ(4, "LinkControlWidget", "linkmic_sei_update, sei = ".concat(String.valueOf(ljj)));
        1NN.LLFF.LIZ().LJJ = ljj;
        if (this.LJIIIIZZ) {
            return;
        }
        final boolean liz = 0k7.LIZ(this.LJIIJJI, 2);
        0ba.LIZ(4, "LinkControlWidget", "onSei, containMultiGuest = ".concat(String.valueOf(liz)));
        if (liz && this.LIZJ != null) {
            final StringBuilder sb = new StringBuilder("onSei, containMultiGuest = true, mMultiGuestAsGuestWidget = ");
            sb.append(this.LIZJ);
            0ba.LIZ(4, "LinkControlWidget", sb.toString());
            this.LIZJ.LIZ(ljj);
            return;
        }
        final boolean liz2 = 0k7.LIZ(this.LJIIJJI, 4);
        0ba.LIZ(4, "LinkControlWidget", "onSei, containCoHost = ".concat(String.valueOf(liz2)));
        if (liz2 && this.LIZLLL != null) {
            final StringBuilder sb2 = new StringBuilder("onSei, containCoHost = true, mLinkCrossRoomWidget = ");
            sb2.append(this.LIZLLL);
            0ba.LIZ(4, "LinkControlWidget", sb2.toString());
            this.LIZLLL.LIZ(ljj);
        }
    }
    
    public final void LIZ(final Throwable t) {
        Gmg.LIZ((GpW)this, t);
    }
    
    @Override
    public final void LIZ(final boolean ljjiii) {
        final boolean ljiiiizz = this.LJIIIIZZ;
        final String s = "1";
        if (ljiiiizz && ljjiii) {
            final HashMap hashMap = new HashMap();
            hashMap.put("action_type", "show");
            hashMap.put("invite_entrance", "golive_window");
            String s2;
            if (GGI.LIZJ()) {
                s2 = "1";
            }
            else {
                s2 = "0";
            }
            hashMap.put("is_subscriber_only_live", s2);
            0uW.LIZ(0uW.LIZJ, hashMap);
            0xt.LIZIZ.LIZ("livesdk_anchor_guest_connection_entrance_click", hashMap);
        }
        0xo.LIZJ("LinkInRoomPermissionResult", "result : ".concat(String.valueOf(ljjiii)));
        final 1QB liziz = this.LJIIL.LIZIZ;
        liziz.LIZ = ljjiii;
        int n;
        if (liziz.LIZ) {
            n = 0;
        }
        else {
            n = 8;
        }
        liziz.LIZ(n);
        if (this.LJIJI) {
            this.LJIIL.LIZ(8, 17);
        }
        final 0xL ljil = this.LJIL;
        if (ljil != null) {
            ljil.LIZIZ = ljjiii;
        }
        GCe.LIZ().LJJIII = ljjiii;
        this.LJIJJLI();
        final Room ljii = this.LJII;
        final boolean booleanValue = (boolean)((44T)GST.LLFFF).LIZ();
        final HashMap hashMap2 = new HashMap();
        hashMap2.put("anchor_id", String.valueOf(ljii.getOwnerUserId()));
        hashMap2.put("room_id", ljii.getIdStr());
        String s3;
        if (ljjiii) {
            s3 = "1";
        }
        else {
            s3 = "0";
        }
        hashMap2.put("guest_avaliable", s3);
        String s4;
        if (booleanValue) {
            s4 = s;
        }
        else {
            s4 = "0";
        }
        hashMap2.put("guest_connection_switch_status", s4);
        0xy.LIZ("livesdk_guest_connection_switch_status", hashMap2);
        if (ljjiii && !this.LJIJI && this.LJI != null) {
            Label_0388: {
                if (!(boolean)((44T)GST.LLFFF).LIZ() || this.LJIJJ()) {
                    if (MultiLiveAutoLinkMicSetting.enableAutoStart()) {
                        final Room ljii2 = this.LJII;
                        if (ljii2 != null && ljii2.isMultiLiveAutoStart() && GCe.LIZ().LJJII != null && 0Z7.LIZIZ(GCe.LIZ().LJJII)) {
                            break Label_0388;
                        }
                    }
                    if (this.LJIJJ()) {
                        0xt.LJ("auto");
                        this.LJI.LIZ(5E4.ACTIVITY_PAGE_OPEN);
                        return;
                    }
                    if (((44T)GST.LLFFF).LIZ()) {
                        ((44T)GST.LLFFF).LIZ((Object)false);
                    }
                    return;
                }
            }
            0xt.LJ("auto");
            this.LJI.LIZ(5E4.AUTO_START);
            0ba.LIZ(4, "MultiLiveAuto", "try to init and turn on multiGuest");
        }
    }
    
    public final boolean LIZ(final Runnable runnable, final boolean b) {
        if (!this.LJIIIIZZ) {
            final 1Nc lizj = this.LIZJ;
            if (lizj != null) {
                return lizj.LIZ(runnable, b);
            }
        }
        return false;
    }
    
    @Override
    public final int LIZIZ(final int n) {
        if (n != 2 && n != 4 && n != 11) {
            return 2131829210;
        }
        return 2131828869;
    }
    
    @Override
    public final void LIZIZ() {
        ((G1k)GCe.LIZ()).LIZ((Object)false);
        if (0k7.LIZ(this.LJIIJJI, 2)) {
            this.LJ(2);
        }
        if (!this.LJIIIIZZ) {
            this.LJIIL.LIZ(8, 16);
            0uW.LIZJ.LIZIZ("others", 0k8.NORMAL);
        }
        5ob.LIZ.LIZIZ("multi-guest turn off");
    }
    
    @Override
    public final void LIZIZ(final LinkerInviteContent linkerInviteContent) {
        if (!((Widget)this).isViewValid()) {
            return;
        }
        if (1NN.LLFF.LIZ().LJ == 0L) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "room_id", this.LJII.getIdStr());
        0d3.LIZ(jsonObject, "remote_room_id", linkerInviteContent.LIZIZ);
        0d3.LIZ(jsonObject, "record_id", 1NN.LLFF.LIZ().LJJJJZI);
        0d3.LIZ(jsonObject, "user_id", this.LJII.getOwnerUserId());
        0d3.LIZ(jsonObject, "remote_user_id", linkerInviteContent.LIZ);
        0d3.LIZ(jsonObject, "is_inviter", false);
        ((I5h)I5o.LIZIZ).LIZ(jsonObject);
        ((I5h)I5o.LIZIZ).LIZ("popup_show");
        final StringBuilder sb = new StringBuilder("onReceiveApply, channelId = ");
        sb.append(1NN.LLFF.LIZ().LJ);
        0ba.LIZ(4, "LinkControlWidget", sb.toString());
        0q3.LIZIZ("LinkDialog");
        final 0pL 0pL = (0pL)super.dataChannel.LIZIZ((Class)2FG.class);
        if (0pL != null && 0pL.isMultiCoHost()) {
            final DataChannel dataChannel = super.dataChannel;
            CTM.LIZ((Object)this, (Object)linkerInviteContent);
            final LinkDialog linkDialog = new LinkDialog((0CH)this);
            final 1OY.a invitee_APPLIED_MULTI_CO_HOST_FRAGMENT = 1OY.a.INVITEE_APPLIED_MULTI_CO_HOST_FRAGMENT;
            final MultiCoHostBeInvitedContract.b liz = MultiCoHostBeInvitedContract.b.LIZJ.LIZ(linkerInviteContent);
            liz.LIZIZ = 2;
            linkDialog.LIZIZ(invitee_APPLIED_MULTI_CO_HOST_FRAGMENT, liz);
            1T2.LIZ(dataChannel, linkDialog);
        }
    }
    
    @Override
    public final void LIZIZ(final String s) {
        0q3.LIZIZ("MultiCoHostExclusiveDialog");
        if (0q3.LIZJ("LinkDialog")) {
            return;
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            1NN.LLFF.LIZ().LJJLIIIJ = new 0k3(0k3.LJII);
        }
        else {
            1NN.LLFF.LIZ().LJJLIIIJ = new 0k3(s);
        }
        if (0k7.LIZ(this.LJIIJJI, 4)) {
            final CoHostLiveWidget lizlll = this.LIZLLL;
            if (lizlll != null && lizlll instanceof MultiCoHostWidget) {
                1T2.LIZ(super.dataChannel, 0yB.LIZ((0CH)this, false, null));
            }
            return;
        }
        this.LJ(false);
    }
    
    @Override
    public final void LIZIZ(final boolean b) {
        final DataChannel dataChannel = super.dataChannel;
        if (!0tO.LIZJ()) {
            0tO.LIZLLL(dataChannel);
        }
        final 1Nc lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(b, true);
        }
    }
    
    @Override
    public final void LIZJ() {
        0q3.LIZIZ("LinkDialog");
        this.LIZLLL(4);
    }
    
    public final void LIZJ(final int n) {
        if (!LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
            return;
        }
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "err_code", n);
        final LinkCoHostBeInviteVideoPreloadWidget ljff = this.LJFF;
        if (ljff != null) {
            0d3.LIZ(jsonObject, "get_pull_info_cost", ljff.LJII);
            0d3.LIZ(jsonObject, "pull_stream_cost", this.LJFF.LJIIIIZZ);
        }
        ((I5h)I5o.LIZIZ).LIZIZ("inviter_preview_first_frame_render", jsonObject);
    }
    
    @Override
    public final void LIZJ(final boolean b) {
        0tO.LIZJ(super.dataChannel);
        final 1Nc lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(b, false);
        }
    }
    
    @Override
    public final void LIZLLL() {
        this.LJ(4);
    }
    
    @Override
    public final void LIZLLL(final boolean b) {
        if (b) {
            this.LJJ();
            return;
        }
        this.LJIL();
    }
    
    @Override
    public final void LJ() {
        if (!((Widget)this).isViewValid()) {
            return;
        }
        this.LJIIZILJ();
        0q3.LIZ();
    }
    
    public final boolean LJ(final boolean b) {
        final JSONObject jsonObject = new JSONObject();
        0k3 ljjliiij;
        if ((ljjliiij = 1NN.LLFF.LIZ().LJJLIIIJ) == null) {
            ljjliiij = new 0k3(0k3.LJII);
            1NN.LLFF.LIZ().LJJLIIIJ = ljjliiij;
        }
        0d3.LIZ(jsonObject, "from", ljjliiij.LIZJ);
        0d3.LIZ(jsonObject, "room_id", this.LJII.getIdStr());
        0d3.LIZ(jsonObject, "record_id", this.LJII.getIdStr());
        0d3.LIZ(jsonObject, "user_id", this.LJII.getOwnerUserId());
        ((I5h)HiW.LIZ).LIZ(jsonObject);
        if (!0jR.LIZ(IInteractService.class).canLinkMic() && !0jR.LIZ(IInteractService.class).isInMultiGuest()) {
            Hf4.LIZ(0cB.LJ(), 2131829210);
            return false;
        }
        if (this.LJI.LIZLLL()) {
            return false;
        }
        if (0q3.LIZJ("LinkDialog")) {
            return false;
        }
        final Object liziz = super.dataChannel.LIZIZ((Class)2FG.class);
        if (liziz == 0pL.NONE) {
            return false;
        }
        if (liziz == 0pL.SUPPORT_MULTI) {
            1T2.LIZ(super.dataChannel, 0yB.LIZIZ((0CH)this));
        }
        else {
            if (b) {
                this.LJJIFFI = true;
            }
            else {
                this.LJJIFFI = false;
            }
            1T2.LIZ(super.dataChannel, 0yB.LIZ((0CH)this));
        }
        return true;
    }
    
    @Override
    public final void LJFF() {
        if (!((Widget)this).isViewValid()) {
            return;
        }
        this.LJIIZILJ();
        0q3.LIZIZ("LinkDialog");
        this.LJIILJJIL();
    }
    
    @Override
    public final void LJI() {
        if (!((Widget)this).isViewValid()) {
            return;
        }
        if (!0q3.LIZJ("LinkDialog")) {
            return;
        }
        final 0q5 liz = 0q3.LIZ("LinkDialog");
        if (liz == null) {
            return;
        }
        if (!(liz instanceof 1T2)) {
            return;
        }
        if (!((1T2)liz).LIZIZ.LIZLLL().isUserListType()) {
            0q3.LIZIZ("LinkDialog");
        }
    }
    
    @Override
    public final void LJII() {
        final CoHostLiveWidget lizlll = this.LIZLLL;
        if (lizlll != null && this.LJIIIIZZ) {
            lizlll.LIZ(204);
        }
    }
    
    @Override
    public final void LJIIIIZZ() {
        if (((Widget)this).isViewValid() && !this.LJIIIIZZ) {
            if (!LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(Gqy.LINK_MIC);
                Hf4.LIZ(0cB.LJ(), 2131831427);
                return;
            }
            if (this.LJIJI) {
                Hf4.LIZ(0cB.LJ(), 2131830287);
                return;
            }
            if (!0k7.LIZ(this.LJIIJJI, 2)) {
                Hf4.LIZ(0cB.LJ(), 2131831330);
                return;
            }
            this.LIZLLL(this.LJIIIIZZ);
        }
    }
    
    @Override
    public final void LJIIIZ() {
        if (((Widget)this).isViewValid() && this.LJIIIIZZ) {
            if (!LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC)) {
                LiveAppBundleUtils.ensurePluginAvailable(Gqy.LINK_MIC);
                Hf4.LIZ(0cB.LJ(), 2131831427);
                return;
            }
            if (this.LJIJI) {
                Hf4.LIZ(0cB.LJ(), 2131830287);
                return;
            }
            final Room ljii = this.LJII;
            if (ljii != null && ljii.getMosaicStatus() == 1) {
                Hf4.LIZ(0cB.LJ(), 2131835948);
                return;
            }
            if (0k7.LIZ(this.LJIIJJI, 4)) {
                if (1NN.LLFF.LIZ().LIZ(0kd.CONNECTION_START)) {
                    0ba.LIZ(6, "LinkControlWidget", "H5 open co-host, but now is co-hosting!");
                    return;
                }
                if (1NN.LLFF.LIZ().LIZJ() == 0kd.INVITING) {
                    0ba.LIZ(6, "LinkControlWidget", "H5 open co-host, but is inviting other host!");
                }
            }
            else if (this.LJIIL.LIZ.LJIJ) {
                0mq.LIZ(1);
                this.LJIIL.LIZ(false);
                1NN.LLFF.LIZ().LJJLIIIJ = new 0k3(0k3.LJII);
                0xm.LIZ("connection_invite");
                this.LJ(false);
                0xy.LIZ(super.dataChannel);
            }
        }
    }
    
    @Override
    public final void LJIIJ() {
        0tO.LJ(super.dataChannel);
    }
    
    @Override
    public final void LJIIJJI() {
        if (!LiveAppBundleUtils.isPluginAvailable(Gqy.LINK_MIC)) {
            Hf4.LIZ(0cB.LJ(), 2131835711);
            return;
        }
        final Room ljii = this.LJII;
        if (ljii != null && ljii.getMosaicStatus() == 1) {
            Hf4.LIZ(0cB.LJ(), 2131835948);
            return;
        }
        final 0k3 ljjliiij = new 0k3("connection_icon");
        final DataChannel ljiilliil = this.LJIIL.LIZ.LJIILLIIL;
        while (true) {
            Label_0136: {
                if (ljiilliil == null) {
                    break Label_0136;
                }
                final Boolean b = (Boolean)ljiilliil.LIZIZ((Class)2Ew.class);
                if (b == null) {
                    break Label_0136;
                }
                final boolean booleanValue = b;
                ljjliiij.LIZIZ = booleanValue;
                if (1O2.LJ() || 1O2.LIZLLL()) {
                    0xm.LIZ("cancel_random_waiting", 1NN.LLFF.LIZ().LJJLIIIJ = ljjliiij);
                    1O2.LIZ(1O2.c.PREVIEW_DIALOG);
                    return;
                }
                if (1O2.LJFF()) {
                    0xm.LIZ("disconnect_connection", 1NN.LLFF.LIZ().LJJLIIIJ = ljjliiij);
                    1O2.LIZ(1O2.c.CANCEL_DIALOG);
                    return;
                }
                if (0k7.LIZ(this.LJIIJJI, 4)) {
                    final CoHostLiveWidget lizlll = this.LIZLLL;
                    if (lizlll != null) {
                        lizlll.LIZIZ();
                        return;
                    }
                }
                else {
                    0mq.LIZ(1);
                    1NN.LLFF.LIZ().LJJLIIIJ = ljjliiij;
                    final boolean lj = this.LJ(false);
                    final String s = "";
                    if (lj) {
                        if (0jR.LIZ(IInteractService.class).hasMultiCoHostPermission()) {
                            0xm.LIZ("connection_invite");
                        }
                        else {
                            final HashMap hashMap = new HashMap();
                            hashMap.put("request_page", "room");
                            if (!TextUtils.isEmpty((CharSequence)null)) {
                                hashMap.put("notice_type", null);
                            }
                            hashMap.put("enter_from", "connection_icon");
                            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
                            if (room != null) {
                                hashMap.put("room_id", String.valueOf(room.getId()));
                                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                            }
                            final String ljljlll = 1NN.LLFF.LIZ().LJLJLLL;
                            String s2 = "0";
                            if (ljljlll != null) {
                                s2 = s2;
                                if (!"0".equals(ljljlll)) {
                                    s2 = "1";
                                }
                            }
                            hashMap.put("is_anchor_icon_show", s2);
                            final String ljljlj = 1NN.LLFF.LIZ().LJLJLJ;
                            if (ljljlll != null && !ljljlll.isEmpty()) {
                                hashMap.put("to_anchor_id", ljljlll);
                                hashMap.put("log_id", ljljlj);
                            }
                            else {
                                hashMap.put("log_id", "");
                            }
                            if (1NN.LLFF.LIZ().LJ != 0L) {
                                hashMap.put("channel_id", String.valueOf(1NN.LLFF.LIZ().LJ));
                            }
                            hashMap.put("click_reason", "connection_invite");
                            0xy.LIZ("connection_icon_click", hashMap);
                        }
                        0xy.LIZ(super.dataChannel);
                    }
                    final Object liziz = super.dataChannel.LIZIZ((Class)G6r.class);
                    final 1NN liz = 1NN.LLFF.LIZ();
                    String value;
                    if (liziz == null) {
                        value = s;
                    }
                    else {
                        value = String.valueOf(liziz);
                    }
                    liz.LJLJLLL = value;
                }
                return;
            }
            final boolean booleanValue = false;
            continue;
        }
    }
    
    public final String LJIIL() {
        return this.getClass().getName();
    }
    
    public final int LJIILIIL() {
        final LinkCoHostBeInviteVideoPreloadWidget ljff = this.LJFF;
        if (ljff != null) {
            return ljff.LJIIIZ;
        }
        return -4;
    }
    
    public final void LJIILJJIL() {
        if (this.LJFF != null && LiveCoHostPreviewAnchorAndroidSwitchSetting.INSTANCE.getValue()) {
            this.LJIIIZ.LIZ(this.LJFF);
            this.LJFF = null;
        }
    }
    
    public int getLayoutId() {
        return 2131562371;
    }
    
    public void onCreate() {
        super.onCreate();
        if (super.dataChannel != null) {
            0jz.LIZJ().onLinkControlWidgetCreate((Room)super.dataChannel.LIZIZ((Class)G69.class), this.getContext());
        }
        this.LIZJ("onCreate");
        this.LJIJI = 0jR.LIZ(IMicRoomService.class).isMicRoomForCurrentRoom();
        this.LJII = (Room)super.dataChannel.LIZIZ((Class)G69.class);
        this.LJIIIIZZ = (boolean)super.dataChannel.LIZIZ((Class)G5l.class);
        this.LJIIZILJ = (Fra)super.dataChannel.LIZIZ((Class)G6q.class);
        if (this.LJIIIIZZ) {
            GOH.COHOST.load(super.dataChannel, (GOM)this.LJIIL.LIZ, false);
        }
        GOH.MULTIGUEST.load(super.dataChannel, (GOM)this.LJIIL.LIZIZ, false);
        this.LJIIL.LIZ(8, 17);
        final 1cs ljj = new 1cs(super.dataChannel);
        this.LJJ = ljj;
        final IMessageManager messageManager = (IMessageManager)ljj.LIZ.LIZIZ((Class)GwN.class);
        if (messageManager != null) {
            messageManager.addMessageListener(HDh.LINK_MIC_SIGNAL.getIntType(), (OnMessageListener)ljj);
            messageManager.addMessageListener(HDh.LINK_MIC.getIntType(), (OnMessageListener)ljj);
            messageManager.addMessageListener(HDh.LINK_MESSAGE.getIntType(), (OnMessageListener)ljj);
            messageManager.addMessageListener(HDh.SOCIAL.getIntType(), (OnMessageListener)ljj);
            messageManager.addMessageListener(HDh.LINK_CO_HOST_GUIDE.getIntType(), (OnMessageListener)ljj);
        }
        1jw.LIZ.LIZ(new 0xL(), null);
        1jw.LIZ.LIZ(this.LJJ, null);
        1jw.LIZ.LIZ(this);
        (this.LJI = new 1kO(this.LJII, this.LJIIIIZZ, this.LJIIZILJ)).LIZ((1kO.a)this);
        final DataChannel dataChannel = super.dataChannel;
        dataChannel.LIZ((0CH)this, (Class)2GO.class, (SRS)new 1kg(this));
        dataChannel.LIZ((Object)this, (Class)2Du.class, (SRS)new 1kv(this));
        dataChannel.LIZ((0CH)this, (Class)Gtf.class, (SRS)new 1l6(this));
        dataChannel.LIZ((0CH)this, (Class)Gta.class, (SRS)new 1lH(this));
        dataChannel.LIZ((0CH)this, (Class)2Ef.class, (SRS)new 1kk(this));
        dataChannel.LIZ((0CH)this, (Class)2GZ.class, (SRS)new 1kq(this));
        dataChannel.LIZ((0CH)this, (Class)2GQ.class, (SRS)new 1kr(this));
        dataChannel.LIZ((0CH)this, (Class)2EO.class, (SRS)new 1ks(this));
        dataChannel.LIZ((0CH)this, (Class)2Ek.class, (SRS)new 1kt(this));
        dataChannel.LIZ((0CH)this, (Class)2Em.class, (SRS)new 1ku(this));
        dataChannel.LIZ((0CH)this, (Class)2Ep.class, (SRS)new 1kw(this));
        dataChannel.LIZ((0CH)this, (Class)2En.class, (SRS)new 1kx(this));
        dataChannel.LIZ((0CH)this, (Class)2Eo.class, (SRS)new 1ky(this));
        dataChannel.LIZ((0CH)this, (Class)2GX.class, (SRS)new 1kz(this));
        dataChannel.LIZ((0CH)this, (Class)2FH.class, 1l0.LIZ);
        dataChannel.LIZ((0CH)this, (Class)2Fe.class, (SRS)new 1l1(this));
        dataChannel.LIZ((0CH)this, (Class)2Gd.class, (SRS)new 1l2(this));
        dataChannel.LIZ((0CH)this, (Class)2DK.class, (SRS)new 1l3(this));
        dataChannel.LIZ((0CH)this, (Class)2Ec.class, (SRS)new 1l4(this));
        dataChannel.LIZ((0CH)this, (Class)2Eg.class, (SRS)new 1l5(this));
        dataChannel.LIZ((0CH)this, (Class)2EE.class, (SRS)new 1l7(this));
        dataChannel.LIZ((0CH)this, (Class)2Ei.class, (SRS)new 1l8(this));
        dataChannel.LIZ((0CH)this, (Class)2Eh.class, 1l9.LIZ);
        dataChannel.LIZ((0CH)this, (Class)Gst.class, (SRS)new 1lA(this));
        DataChannelGlobal.LIZJ.LIZ((Object)this, (Class)2Gb.class, (SRS)new 1lB(this));
        DataChannelGlobal.LIZJ.LIZ((Object)this, (Class)2D6.class, (SRS)new 1lC(this));
        final 0mp 0mp = new 0mp();
        final boolean ljiiiizz = this.LJIIIIZZ;
        final boolean ljiji = this.LJIJI;
        final int ljiijji = this.LJIIJJI;
        final 0mk ljiil = this.LJIIL;
        CTM.LIZ((Object)ljiil);
        0yA 0yA = 1jw.LIZ.LIZIZ("LINK_MIC_APP_BUNDLE_UTIL");
        if (0yA == null) {
            0yA = new 1dP(ljiiiizz);
            0kT.a.LIZ(1jw.LIZ, 0yA);
        }
        ((I5h)HiU.LIZ).LIZ("load_plugin", (JSONObject)null);
        1dP.LIZJ.LIZ("start load linkmic plugin silently. ".concat(String.valueOf(0mp)));
        LiveAppBundleUtils.ensurePluginAvailable$default(Gqy.LINK_MIC, (H8A)new 1QH(ljiiiizz, System.currentTimeMillis(), 0yA, ljiil, ljiijji, ljiji), false, 4, (Object)null);
        LiveAppBundleUtils.ensurePluginAvailable$default(Gqy.QUIC, (H8A)null, false, 6, (Object)null);
        LiveAppBundleUtils.ensurePluginAvailable$default(Gqy.RTS, (H8A)null, false, 6, (Object)null);
        if (super.dataChannel != null) {
            super.dataChannel.LIZ((0CH)this, (Class)2D3.class, (SRS)new 1kj(this));
        }
        if (super.dataChannel != null) {
            super.dataChannel.LIZ((0CH)this, (Class)2EM.class, (SRS)new 1kl(this));
        }
        final DataChannel dataChannel2 = super.dataChannel;
        dataChannel2.LIZ((0CH)this, (Class)2EQ.class, (SRS)new 1lE(this));
        dataChannel2.LIZ((0CH)this, (Class)2FD.class, (SRS)new 1lF(this));
        dataChannel2.LIZ((0CH)this, (Class)2FA.class, (SRS)new 1lG(this));
        GCe.LIZ().LIZ = (GCf)new GCf() {
            public boolean LIZ;
            
            static {
                Covode.recordClassIndex(7718);
            }
            
            public final void LIZ(final boolean liz) {
                if (this.LIZ == liz) {
                    return;
                }
                this.LIZ = liz;
                0ba.LIZ(4, "LinkControlWidget", "multi-guest state: ".concat(String.valueOf(liz)));
                if (liz) {
                    LinkControlWidget.this.dataChannel.LIZJ((Class)2EH.class, (Object)new 0kH(0kH.LIZJ));
                    0md.LIZIZ.LIZ(0kH.LIZJ);
                    return;
                }
                LinkControlWidget.this.dataChannel.LIZJ((Class)2EH.class, (Object)new 0kH(0kH.LIZIZ));
                0md.LIZIZ.LIZ(0kH.LIZIZ);
            }
        };
        GCe.LIZ().LIZIZ = (GCf)new GCf() {
            public boolean LIZ;
            
            static {
                Covode.recordClassIndex(7719);
            }
            
            public final void LIZ(final boolean liz) {
                if (this.LIZ == liz) {
                    return;
                }
                this.LIZ = liz;
                LinkControlWidget.this.dataChannel.LIZJ((Class)2Ek.class);
            }
        };
        if (!this.LJIIIIZZ) {
            super.dataChannel.LIZ((0CH)this, (Class)GtJ.class, (SRS)new 1lD(this));
        }
        if (!this.LJIIIIZZ) {
            0uW.LIZJ.LIZ("live_play", 0k8.NORMAL);
        }
        final boolean ljiiiizz2 = this.LJIIIIZZ;
        final Room ljii = this.LJII;
        CTM.LIZ((Object)ljii);
        if (!ljiiiizz2) {
            final 1ZT 1zt = new 1ZT();
            final Fzp liz = Fhf.LIZ;
            n.LIZIZ((Object)liz, "");
            final EnterRoomLinkSession liziz = liz.LIZIZ();
            if (liziz != null) {
                final EnterRoomConfig liziz2 = liziz.LIZIZ;
                if (liziz2 != null) {
                    1zt.LIZ(liziz2.LIZLLL.LJIIZILJ, ljii, true);
                    1jw.LIZ.LIZ(1zt, null);
                    if (liziz2.LIZLLL.LJIIZILJ != null) {
                        liziz2.LIZLLL.LJIIZILJ = "-1";
                    }
                }
            }
        }
        CTM.LIZ((Object)this);
        0kT.a.LIZ(1jw.LIZ, new MultiGuestDialogManager((0CH)this));
        ((0bf)Fjw.LIZIZ()).LIZ("link_mic_sync", "widget_create");
        if (!this.LJIIIIZZ && super.dataChannel != null) {
            super.dataChannel.LIZIZ((Class)2FM.class, (Object)true);
        }
    }
    
    public void onDestroy() {
        this.LJIIIZ = null;
        final 1cs ljj = this.LJJ;
        if (ljj != null) {
            try {
                final IMessageManager messageManager = (IMessageManager)ljj.LIZ.LIZIZ((Class)GwN.class);
                if (messageManager != null) {
                    messageManager.removeMessageListener((OnMessageListener)ljj);
                }
            }
            catch (final Exception ex) {
                0ba.LIZ("ALogger", ex);
            }
        }
        final 1kO lji = this.LJI;
        if (lji != null) {
            ((GK2)lji).LIZ();
        }
        0q3.LIZIZ("LinkDialog");
        super.dataChannel.LIZIZ((Object)this);
        DataChannelGlobal.LIZJ.LIZIZ((Object)this);
        GCe.LIZ().LIZ = null;
        if (!this.LJIIIIZZ) {
            0uW.LIZJ.LIZIZ("live_over", (0k8)null);
        }
        super.onDestroy();
        if (!this.LJIJJ()) {
            1jw.LIZ.LIZ().clear();
        }
        0q3.LIZ();
        this.LJIL.LIZ(0xG.a.MULTIGUEST);
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            0sD.LIZJ.LIZ().LJII();
        }
        this.LIZJ("onDestroy");
        0jz.LIZJ().onLinkControlWidgetDestroy();
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
