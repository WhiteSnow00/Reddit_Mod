// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.widget;

import X.GK2;
import com.bytedance.android.widget.WidgetManager;
import X.0CC;
import X.2Ds;
import X.0jz;
import X.0mb;
import X.0n0;
import X.0nA;
import java.util.Arrays;
import X.Gkn;
import X.0kf;
import X.0kP;
import X.0xg;
import java.util.Map;
import android.text.TextUtils;
import X.0jR;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import X.Gnh;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import X.2Fd;
import X.1Pm;
import X.0kG;
import X.2d6;
import X.1Pl;
import X.FBZ;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import X.GFz;
import X.FGP;
import X.FIc;
import X.1kI;
import X.2Dx;
import X.1kH;
import X.2Ex;
import X.1kG;
import X.2EA;
import X.SRS;
import X.1kF;
import X.2F6;
import X.2El;
import X.0kK;
import java.lang.ref.WeakReference;
import X.0kM;
import X.0kL;
import X.2EJ;
import X.1Pk;
import X.1Pj;
import X.1Pi;
import X.Gtc;
import java.util.Objects;
import X.0nF;
import X.1Ph;
import X.1Pp;
import X.HPY;
import X.1Po;
import X.2Er;
import X.1Pn;
import android.widget.ImageView;
import X.0cm;
import X.IA6;
import X.0cb;
import android.widget.RelativeLayout$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import X.0cO;
import X.GOM;
import X.GOH;
import X.I4V;
import X.G5l;
import X.G69;
import X.0xy;
import android.os.SystemClock;
import X.2Ep;
import X.0mW;
import X.0mV;
import X.2GX;
import X.G73;
import X.0nC;
import X.0xm;
import X.0kd;
import X.0k3;
import X.GpW;
import X.Gmg;
import X.1Qk;
import java.util.Iterator;
import java.util.List;
import X.1lI;
import X.0nD;
import X.0d8;
import X.0d3;
import X.1jz;
import org.json.JSONObject;
import X.CTM;
import X.G3c;
import X.2Dq;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveStreamSizeOpt;
import X.1mk;
import X.0b8;
import X.0k4;
import X.0ba;
import X.0xc;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import X.6E8;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import X.Hf4;
import X.0cB;
import com.bytedance.android.widget.Widget;
import X.0xt;
import X.0kE;
import X.2EX;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import X.0xo;
import androidx.fragment.app.DialogFragment;
import X.Vqj;
import X.0AB;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractCancelDialog;
import X.2Du;
import X.0n9;
import X.Fgn;
import X.0CH;
import X.1O2;
import com.bytedance.covode.number.Covode;
import X.0xa;
import X.0j2;
import com.bytedance.android.live.liveinteract.cohost.ui.dialog.InteractDisconnectDialog;
import android.widget.LinearLayout;
import X.0yP;
import X.0yK;
import X.05Y;
import X.0mM;
import X.HoY;
import X.1si;
import android.view.View;
import android.widget.FrameLayout;
import X.1RZ;
import com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget;
import X.1NN;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.6mZ;
import X.0xZ;
import X.1k4;
import X.0ka;
import com.bytedance.android.live.liveinteract.api.CoHostLiveWidget;

public class LinkCrossRoomWidget extends CoHostLiveWidget implements 0ka, 1k4.a, 0xZ.a, 6mZ
{
    public static int LIZ;
    public boolean LIZIZ;
    public Room LIZJ;
    public 1k4 LIZLLL;
    public 1NN LJ;
    public boolean LJFF;
    public LinkBattleWidget LJI;
    public 1RZ LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public 0xZ LJIIJ;
    public FrameLayout LJIIJJI;
    public View LJIIL;
    public 1si LJIILIIL;
    public HoY LJIILJJIL;
    public 0mM LJIILL;
    public 05Y LJIILLIIL;
    public 0yK LJIIZILJ;
    public 0yP<LinearLayout> LJIJ;
    public 1si LJIJI;
    public View LJIJJ;
    public InteractDisconnectDialog LJIJJLI;
    public 0j2 LJIL;
    public 0xa LJJ;
    public boolean LJJI;
    
    static {
        Covode.recordClassIndex(7580);
    }
    
    public LinkCrossRoomWidget(final FrameLayout ljiijji) {
        this.LJJI = 1O2.LIZ();
        this.LJII = new 1RZ((0CH)this);
        this.LJIIJJI = ljiijji;
    }
    
    private void LIZ(final int n, final int n2, final int ljff) {
        final Fgn fgn = new Fgn(0);
        fgn.LIZIZ = n + n2;
        fgn.LJ = 0n9.LIZIZ();
        fgn.LJFF = ljff;
        super.dataChannel.LIZIZ((Class)2Du.class, (Object)fgn);
        if (!this.LJFF) {
            this.LIZJ(true);
        }
    }
    
    public static void LIZ(final InteractCancelDialog interactCancelDialog, final 0AB 0ab, final String s) {
        Vqj.LIZ((DialogFragment)interactCancelDialog, s);
        ((DialogFragment)interactCancelDialog).show(0ab, s);
    }
    
    private void LIZIZ(final String s, final String s2) {
        0xo.LIZ(s, this.LIZIZ, s2);
    }
    
    private void LIZJ(final int n) {
        final int ljjijiiji = this.LJ.LJJIJIIJI;
        final int ljjij = this.LJ.LJJIJ;
        final View ljiil = this.LJIIL;
        if (ljiil != null) {
            final ConstraintLayout.a layoutParams = (ConstraintLayout.a)ljiil.getLayoutParams();
            layoutParams.height = ljjij;
            this.LJIIL.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        super.dataChannel.LIZJ((Class)2EX.class, (Object)new 0kE());
        this.LJIILLIIL.setGuidelineBegin(ljjijiiji);
        if (this.LJIIL.getVisibility() != 0) {
            this.LJIIL.setVisibility(0);
            0xt.LIZIZ(this.LIZIZ);
        }
        this.LIZ(ljjijiiji, ljjij, n);
    }
    
    private void LIZJ(final boolean b) {
        if (!this.LIZIZ) {
            return;
        }
        if (b) {
            final View ljijj = this.LJIJJ;
            if (ljijj != null) {
                ljijj.setVisibility(0);
            }
            this.LIZLLL(true);
            return;
        }
        final View ljijj2 = this.LJIJJ;
        if (ljijj2 != null) {
            ljijj2.setVisibility(8);
        }
        this.LIZLLL(false);
    }
    
    private void LIZLLL(final boolean b) {
        final HoY ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ljiiljjil.setVisibility(visibility);
        }
    }
    
    private void LJIILIIL() {
        if (this.LJI == null) {
            this.enableSubWidgetManager();
            this.LJI = new LinkBattleWidget(((Widget)this).getView());
            ((WidgetManager)super.subWidgetManager).load((Widget)this.LJI);
        }
    }
    
    public final void LIZ() {
        final 1k4 lizlll = this.LIZLLL;
        if (lizlll != null) {
            if (lizlll.LIZIZ) {
                Hf4.LIZ(0cB.LJ(), 0cB.LIZ(2131829542), 0L);
                lizlll.LIZIZ(210);
                return;
            }
            final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-524");
            with.usage("");
            with.tag("link mic stop");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
            lizlll.LIZIZ((Cert)with.build());
        }
    }
    
    public final void LIZ(final int n) {
        final 1k4 lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZIZ(n);
        }
    }
    
    @Override
    public final void LIZ(final 0xa 0xa) {
        if (!this.LIZIZ && ((Widget)this).isViewValid() && 0xa.LJ != null && !0xa.LJ.isEmpty()) {
            final List<0xc> lj = 0xa.LJ;
            final int n = 0;
            final 0xc 0xc = lj.get(0);
            while (true) {
                for (final 0xc 0xc2 : 0xa.LJ) {
                    if (0xc2.LJIILIIL == 1) {
                        if (this.LJ.LJ <= 0L) {
                            try {
                                this.LJ.LJ = Long.parseLong(0xa.LIZLLL);
                            }
                            catch (final Exception ex) {
                                final StringBuilder sb = new StringBuilder("Parse ChannelId, Exception = ");
                                sb.append(ex.toString());
                                0ba.LIZ(4, "LinkCrossRoomLogs", sb.toString());
                            }
                        }
                        final 1NN lj2 = this.LJ;
                        final long lj3 = lj2.LJ;
                        if (!lj2.LJJIIJ) {
                            0k4 0k4;
                            if (lj2.LJJIII) {
                                0k4 = X.0k4.FIRST_SEI;
                            }
                            else {
                                0k4 = X.0k4.OTHER_SEI;
                            }
                            lj2.LIZ(lj3, 0k4);
                            lj2.LJJIIZ = System.currentTimeMillis();
                        }
                        this.LJJ = 0xa;
                        this.LJ.LJLIIL = 0xa;
                        1mk.LIZ(4, 0b8.a.LIZIZ.LIZIZ((Object)0xa));
                        this.LIZLLL.LIZ(false);
                        final float n2 = this.LJIIIIZZ * 1.0f / 0xa.LJFF.LIZJ;
                        final double n3 = 0xa.LJFF.LIZIZ;
                        final double lji = 0xc2.LJI;
                        final double n4 = n2;
                        final int n5 = (int)(n3 * lji * n4);
                        final int liz = 0cB.LIZ(130.0f);
                        this.LJ.LJJIJIIJI = liz;
                        if (LiveStreamSizeOpt.INSTANCE.getValue()) {
                            LinkCrossRoomWidget.LIZ = -0cB.LIZ(42.0f);
                        }
                        else {
                            LinkCrossRoomWidget.LIZ = liz - n5;
                        }
                        int ljjij;
                        if (LiveStreamSizeOpt.INSTANCE.getValue()) {
                            ljjij = (int)(Math.max(0.5625f, this.LJIIIIZZ / (float)this.LJIIIZ) / 1.3846154f * this.LJIIIZ) - 16;
                        }
                        else {
                            ljjij = (int)(0xc2.LJ * 0xa.LJFF.LIZIZ * n4);
                        }
                        this.LJ.LJJIJ = ljjij;
                        super.dataChannel.LIZJ((Class)2Dq.class, (Object)new G3c(this.LJ.LJJIJIIJI, liz + ljjij));
                        if (!this.LJ.LJJI) {
                            this.LJ.LJJI = true;
                            final String liziz = 0b8.a.LIZJ.LIZIZ((Object)0xa);
                            CTM.LIZ((Object)"co_host_sei", (Object)liziz);
                            final JSONObject jsonObject = new JSONObject();
                            1jz.LIZLLL.LIZ(jsonObject);
                            0d3.LIZ(jsonObject, "sei", liziz);
                            0d3.LIZ(jsonObject, "event_id", "co_host_sei");
                            0d8.LIZ("ttlive_client_linkmic_room", 1, jsonObject);
                        }
                        this.LIZJ(LinkCrossRoomWidget.LIZ);
                        this.LJIILIIL();
                        int n6 = n;
                        if (this.LJ.LJJLJLI != 0xc2.LJIILJJIL) {
                            n6 = 1;
                        }
                        this.LJ.LJJLJLI = 0xc2.LJIILJJIL;
                        if (0n9.LIZIZ()) {
                            if (n6 != 0) {
                                this.LJI.LIZLLL();
                            }
                        }
                        else {
                            this.LJIILL.LIZJ();
                        }
                        final 1Qk liz2 = 0n9.LIZ;
                        final long ljii = 0xa.LJII;
                        if (ljii <= 0L || liz2.LIZ != ljii) {
                            if (liz2.LJJI == 0nD.MATCH_SEI) {
                                1lI.LIZJ.LIZ(liz2);
                                liz2.LIZ(0nD.NONE);
                            }
                            return;
                        }
                        else {
                            if (liz2.LJJI != 0nD.NONE) {
                                1lI.LIZJ.LIZ(liz2, 0nD.MATCH_SEI);
                                return;
                            }
                            liz2.LIZ(0nD.MATCH_SEI);
                            return;
                        }
                    }
                }
                0xc 0xc2;
                if ((0xc2 = 0xc) == null) {
                    return;
                }
                continue;
            }
        }
    }
    
    public final void LIZ(final Cert cert) {
        final 1k4 lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ(cert);
            if (!this.LJJI) {
                this.LIZJ(0);
            }
        }
    }
    
    public final void LIZ(final Boolean b) {
        final 1k4 lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZ(b);
        }
    }
    
    public final void LIZ(final String s) {
        if (!this.LIZIZ) {
            final 0xZ ljiij = this.LJIIJ;
            if (ljiij != null) {
                ljiij.LIZ(s);
                final 1NN lj = this.LJ;
                if (lj != null) {
                    lj.LJJIII = false;
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final String s2) {
        this.LIZIZ(s, s2);
    }
    
    public final void LIZ(final Throwable t) {
        Gmg.LIZ((GpW)this, t);
    }
    
    @Override
    public final void LIZ(final boolean b) {
        this.LIZLLL(b ^ true);
        final StringBuilder sb = new StringBuilder("state:");
        String s;
        if (b) {
            s = "foreground";
        }
        else {
            s = "background";
        }
        sb.append(s);
        this.LIZIZ("LinkCross_Guest_State_Changed", sb.toString());
    }
    
    public final void LIZIZ() {
        final 0k3 ljjliiij = new 0k3(0k3.LJ);
        1NN.LLFF.LIZ().LJJLIIIJ = ljjliiij;
        if (1NN.LLFF.LIZ().LIZ(0kd.CONNECTION_START)) {
            0xm.LIZ("disconnect_connection", ljjliiij);
            String liziz = 0cB.LIZ(2131829225);
            if (0n9.LIZ.LIZJ() == 0nC.START) {
                liziz = 0cB.LIZ(2131829247);
            }
            final InteractDisconnectDialog ljijjli = this.LJIJJLI;
            if (ljijjli != null && ljijjli.LJJI()) {
                ((DialogFragment)this.LJIJJLI).dismiss();
            }
            final InteractDisconnectDialog ljijjli2 = new InteractDisconnectDialog();
            this.LJIJJLI = ljijjli2;
            ljijjli2.LIZ = 0cB.LIZ(2131829226);
            ljijjli2.LIZIZ = liziz;
            ljijjli2.LIZJ = 1;
            ljijjli2.LJ = 0cB.LIZ(2131831469);
            ljijjli2.LIZLLL = 0cB.LIZ(2131831463);
            final 1k4 lizlll = this.LIZLLL;
            CTM.LIZ((Object)lizlll);
            ljijjli2.LJFF = lizlll;
            final 1NN lj = this.LJ;
            CTM.LIZ((Object)lj);
            ljijjli2.LJI = lj;
            final 0AB 0ab = (0AB)super.dataChannel.LIZIZ((Class)G73.class);
            if (0ab != null) {
                final InteractDisconnectDialog ljijjli3 = this.LJIJJLI;
                Vqj.LIZ((DialogFragment)ljijjli3, "InteractDisconnectDialog");
                ((DialogFragment)ljijjli3).show(0ab, "InteractDisconnectDialog");
            }
            return;
        }
        if (1NN.LLFF.LIZ().LIZJ() == 0kd.INVITING) {
            0xm.LIZ("cancel_connection_invite", ljjliiij);
            this.LJIIIZ();
        }
    }
    
    @Override
    public final void LIZIZ(final boolean ljjliiiij) {
        0ba.LIZ(4, "LinkCrossRoomLogs", "onPkPermissionResult, result = ".concat(String.valueOf(ljjliiiij)));
        final 1NN lj = this.LJ;
        if (lj != null) {
            lj.LJJLIIIIJ = ljjliiiij;
        }
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "enable_battle", String.valueOf((int)(ljjliiiij ? 1 : 0)));
        0d3.LIZ(jsonObject, "cost", System.currentTimeMillis() - 1lI.LIZ);
        1lI.LIZ(1lI.LIZJ, "check_permission_complete", jsonObject, false, null, null, 60);
        if ((ljjliiiij ? 1 : 0) != 0) {
            super.dataChannel.LIZJ((Class)2GX.class, (Object)new 0mV(this));
            this.LJIILIIL();
            this.LJII.LIZJ = this.LJI;
            return;
        }
        super.dataChannel.LIZJ((Class)2GX.class, (Object)0mW.LIZ);
    }
    
    @Override
    public final boolean LIZIZ(final int n) {
        return !this.LIZIZ && n == 2;
    }
    
    public final Object LIZJ() {
        return this.LJII;
    }
    
    @Override
    public final LinkBattleWidget LIZLLL() {
        return this.LJI;
    }
    
    @Override
    public final void LJ() {
        if (1O2.LIZLLL()) {
            Hf4.LIZ(0cB.LJ(), 2131829345);
        }
        else {
            Hf4.LIZ(0cB.LJ(), 2131835804);
        }
        this.LIZLLL.LIZIZ(208);
    }
    
    @Override
    public final void LJFF() {
        Hf4.LIZ(0cB.LJ(), 2131835920);
        this.LIZLLL.LIZIZ(207);
    }
    
    @Override
    public final void LJI() {
        Hf4.LIZ(0cB.LJ(), 2131835901);
    }
    
    @Override
    public final void LJII() {
        final 1NN lj = this.LJ;
        if (lj != null && !lj.LIZJ) {
            super.dataChannel.LIZJ((Class)2Ep.class, (Object)1);
        }
        this.LJFF = true;
        this.LJIILL.LIZJ();
        this.LIZJ(false);
        if (this.LIZIZ) {
            final LinkBattleWidget lji = this.LJI;
            if (lji != null && lji.LJJII) {
                this.LJIJ.LIZ.setVisibility(0);
            }
            else if (this.LJI == null) {
                this.LJIJ.LIZ.setVisibility(0);
            }
            this.LJ.LJJJJLL = SystemClock.elapsedRealtime();
            0xy.LIZ(this.LIZJ, "livesdk_connection_success");
            0xy.LIZ(this.LIZJ, "livesdk_connection_success_rec");
            if (this.LJJI) {
                this.LIZJ(0);
            }
        }
    }
    
    @Override
    public final void LJIIIIZZ() {
        final 0j2 ljil = this.LJIL;
        if (ljil != null) {
            ljil.LIZ();
        }
    }
    
    public final void LJIIIZ() {
        final 0AB 0ab = (0AB)super.dataChannel.LIZIZ((Class)G73.class);
        if (0ab != null) {
            LIZ(new InteractCancelDialog(), 0ab, "InteractCancelDialog");
        }
    }
    
    @Override
    public final void LJIIJ() {
    }
    
    @Override
    public final void LJIIJJI() {
    }
    
    public final String LJIIL() {
        return this.getClass().getName();
    }
    
    public int getLayoutId() {
        return 2131562375;
    }
    
    public void onCreate() {
        super.onCreate();
        0xo.LIZ("LinkCross_Widget_onCreate");
        this.LIZJ = (Room)super.dataChannel.LIZIZ((Class)G69.class);
        this.LIZIZ = (boolean)super.dataChannel.LIZIZ((Class)G5l.class);
        this.LJ = 1NN.LLFF.LIZ();
        final I4V lj = I4V.LJ;
        lj.LJII();
        I4V.LIZJ = "broadcast_link_period";
        lj.LJI();
        GOH.INTERACTION_PK.load(super.dataChannel, (GOM)this.LJII);
        this.LJII.LIZ(8);
        this.LIZLLL = new 1k4(super.dataChannel);
        1jz.LIZ("co_host_widget");
        this.LJIIIIZZ = 0cB.LIZJ();
        this.LJIIIZ = 0cB.LIZIZ();
        int n;
        if (0cO.LIZIZ() && 0cO.LIZ() == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.LJIIIIZZ = (int)(0cB.LIZIZ() * 0.5625f);
        }
        final int liz = 0cB.LIZ(130.0f);
        LinkCrossRoomWidget.LIZ = 0;
        this.LJ.LJJIJIIJI = liz;
        final int ljjiizi = this.LJIIIIZZ / 2;
        final int ljjij = (int)(ljjiizi * 1.0f / 9.0f * 13.0f);
        this.LJ.LJJIIZI = ljjiizi;
        this.LJ.LJJIJ = ljjij;
        boolean b;
        if (0cO.LIZIZ() && 0cO.LIZ() == 0) {
            b = true;
        }
        else {
            b = false;
        }
        this.LJIIIIZZ = 0cB.LIZJ();
        if (b) {
            this.LJIIIIZZ = (int)(0cB.LIZIZ() * 0.5625f);
        }
        final ViewGroup$LayoutParams layoutParams = ((Widget)this).getView().getLayoutParams();
        if (b) {
            layoutParams.width = this.LJIIIIZZ;
            if (layoutParams instanceof FrameLayout$LayoutParams) {
                ((FrameLayout$LayoutParams)layoutParams).gravity = 17;
            }
            else if (layoutParams instanceof RelativeLayout$LayoutParams) {
                ((RelativeLayout$LayoutParams)layoutParams).addRule(13, -1);
            }
        }
        else {
            layoutParams.width = -1;
            layoutParams.height = -1;
        }
        ((Widget)this).getView().setLayoutParams(layoutParams);
        this.LJIIJJI.setVisibility(0);
        this.LJIIL = this.findViewById(2131363954);
        this.LJIILJJIL = (HoY)this.findViewById(2131368000);
        this.LJIILL = (0mM)this.findViewById(2131367376);
        this.LJIILLIIL = (05Y)this.findViewById(2131365782);
        this.LJIJJ = this.findViewById(2131367353);
        (this.LJIJI = (1si)this.findViewById(2131362496)).setVisibility(8);
        this.findViewById(2131366964);
        0cb.LIZ((View)(this.LJIILIIL = (1si)this.findViewById(2131367745)), "tiktok_live_interaction_resource", "ttlive_match_winning_streak_tip_bg.png");
        if (this.LIZJ.background != null) {
            0cm.LIZ((ImageView)this.LJIJI, this.LIZJ.background, IA6.TOP);
        }
        this.LJIIZILJ = new 0yK(super.dataChannel, ((Widget)this).getView());
        if (super.dataChannel != null) {
            final 0yP.a<View> liz2 = this.LJIIZILJ.LIZ(2131367413);
            liz2.LIZJ = new 1Pn(this);
            liz2.LIZIZ = (0CH)this;
            this.LJIJ = (0yP<LinearLayout>)liz2.LIZ((Class<? extends HPY>)2Er.class, (0yP.b<View, Object>)new 1Po(this)).LIZ();
            final 0yP.a<View> liz3 = this.LJIIZILJ.LIZ(2131366928);
            liz3.LIZJ = new 1Pp(this);
            liz3.LIZIZ = (0CH)this;
            liz3.LIZ((Class<? extends HPY>)2Er.class, (0yP.b<View, Object>)1Ph.LIZ).LIZ();
            final 0yP.a<View> liz4 = this.LJIIZILJ.LIZ(2131367376);
            liz4.LIZIZ = (0CH)this;
            final 0nF liz5 = 0nF.LIZ;
            Objects.requireNonNull(liz5);
            liz4.LIZ((Class<? extends HPY>)Gtc.class, (0yP.b<View, Object>)new 1Pi(liz5)).LIZ();
            final 0yP.a<View> liz6 = this.LJIIZILJ.LIZ(2131368507);
            liz6.LIZIZ = (0CH)this;
            final 0nF liz7 = 0nF.LIZ;
            Objects.requireNonNull(liz7);
            liz6.LIZ((Class<? extends HPY>)Gtc.class, (0yP.b<View, Object>)new 1Pj(liz7)).LIZ();
            final 0yP.a<View> liz8 = this.LJIIZILJ.LIZ(2131367371);
            liz8.LIZIZ = (0CH)this;
            final 0nF liz9 = 0nF.LIZ;
            Objects.requireNonNull(liz9);
            liz8.LIZ((Class<? extends HPY>)Gtc.class, (0yP.b<View, Object>)new 1Pk(liz9)).LIZ();
        }
        final View viewById = this.findViewById(2131367376);
        final ViewGroup$LayoutParams layoutParams2 = viewById.getLayoutParams();
        layoutParams2.width = 0cB.LIZJ() - 0cB.LIZ(87.0f) * 2;
        viewById.setLayoutParams(layoutParams2);
        final 0mM ljiill = this.LJIILL;
        if (ljiill != null) {
            ljiill.LIZ();
        }
        if (super.dataChannel != null) {
            super.dataChannel.LIZJ((Class)2EJ.class, (Object)new 0kK(0kL.CONTAINER, 0kM.NORMAL, new WeakReference<View>(((Widget)this).getView())));
        }
        this.LIZLLL.LIZ((1k4.a)this);
        if (this.LIZIZ) {
            if (this.LJ.LIZJ && !this.LJJI) {
                this.LIZJ(0);
            }
            this.LIZLLL.LIZ(false);
        }
        else {
            this.LJIIJ = new 0xZ((0xZ.a)this);
            0xy.LIZLLL = false;
            0xy.LIZJ = SystemClock.elapsedRealtime();
        }
        final DataChannel dataChannel = super.dataChannel;
        dataChannel.LIZ((Class)2El.class, (Object)true);
        dataChannel.LIZ((0CH)this, (Class)2F6.class, (SRS)new 1kF(this));
        dataChannel.LIZ((0CH)this, (Class)2EA.class, (SRS)new 1kG(this));
        dataChannel.LIZ((0CH)this, (Class)2Ex.class, (SRS)new 1kH(this));
        dataChannel.LIZ((0CH)this, (Class)2Dx.class, (SRS)new 1kI(this));
        ((FIc)FGP.LIZ().LIZ((Class)GFz.class).LIZ((FBZ)WidgetExtendsKt.autoDispose((LiveWidget)this))).LIZ((2d6)new 1Pl(this));
        ((FIc)FGP.LIZ().LIZ((Class)0kG.class).LIZ((FBZ)WidgetExtendsKt.autoDispose((LiveWidget)this))).LIZ((2d6)new 1Pm(this));
        if (super.dataChannel != null) {
            super.dataChannel.LIZ((Class)2Fd.class, (Object)new HashMap());
        }
    }
    
    public void onDestroy() {
        MethodCollector.i(10859);
        LinkCrossRoomWidget.LIZ = 0;
        final InteractDisconnectDialog ljijjli = this.LJIJJLI;
        if (ljijjli != null && ljijjli.LJJI()) {
            ((DialogFragment)this.LJIJJLI).dismiss();
        }
        if (super.dataChannel != null) {
            super.dataChannel.LIZ((Class)2El.class, (Object)false);
            super.dataChannel.LIZ((Class)2Fd.class, (Object)new HashMap());
        }
        final Gnh gnh = new Gnh();
        if (this.LJ.LJIJ > 0 && this.LJ.LJJJJJ == 0) {
            gnh.LIZ(1NN.LLFF.LIZ().LJIILL.getType());
        }
        if (this.LJI != null) {
            ((WidgetManager)super.subWidgetManager).unload((Widget)this.LJI);
            this.LJI = null;
        }
        if (this.LIZIZ) {
            final Room lizj = this.LIZJ;
            if (0jR.LIZ(IInteractService.class).hasMultiCoHostPermission() && !1NN.LLFF.LIZ().LJIILIIL) {
                0xm.LIZIZ.LIZ(lizj);
            }
            else if (0xy.LIZ) {
                if (lizj != null) {
                    0xy.LIZ = false;
                    final 1NN liz = 1NN.LLFF.LIZ();
                    final Gnh liz2 = 0xy.LIZ(lizj);
                    final long n = SystemClock.elapsedRealtime() - liz.LJJJJLL;
                    final long n2 = n / 1000L;
                    liz2.LIZLLL = String.valueOf(n2);
                    final HashMap hashMap = new HashMap();
                    hashMap.put("connection_type", "anchor");
                    hashMap.put("invited_room_id", String.valueOf(liz.LJIIIIZZ));
                    String s;
                    if (1NN.LLFF.LIZ().LJIIZILJ) {
                        s = "inviter";
                    }
                    else {
                        s = "invitee";
                    }
                    hashMap.put("anchor_type", s);
                    final String ljjijlij = liz.LJJIJLIJ;
                    if (!TextUtils.isEmpty((CharSequence)ljjijlij)) {
                        hashMap.put("request_id", ljjijlij);
                    }
                    0xy.LIZ(hashMap);
                    String s2;
                    if (1NN.LLFF.LIZ().LJJJLZIJ) {
                        s2 = "positive_over";
                    }
                    else {
                        s2 = "negative_over";
                    }
                    hashMap.put("over_type", s2);
                    if (1NN.LLFF.LIZ().LJJJZ) {
                        hashMap.put("is_live_end", "1");
                    }
                    0xg.LIZ(hashMap, 1NN.LLFF.LIZ().LJIILL, true);
                    hashMap.put("is_effective_connection", String.valueOf(n2 > 10L));
                    hashMap.put("connection_duration", String.valueOf(n));
                    hashMap.put("event_type", String.valueOf(1NN.LLFF.LIZ().LJIILL.getType()));
                    0xg.LIZ(hashMap);
                    if (1NN.LLFF.LIZ().LJIIZILJ) {
                        hashMap.put("connection_inviter_id", String.valueOf(lizj.getOwnerUserId()));
                        hashMap.put("connection_invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
                        final String ljljlll = 1NN.LLFF.LIZ().LJLJLLL;
                        1NN.LLFF.LIZ().LJLJLLL = "";
                        String s3;
                        if (ljljlll != null && ljljlll.equals(String.valueOf(1NN.LLFF.LIZ().LJFF))) {
                            s3 = "1";
                        }
                        else {
                            s3 = "0";
                        }
                        hashMap.put("is_icon_show_anchor", s3);
                    }
                    else {
                        hashMap.put("connection_invitee_id", String.valueOf(lizj.getOwnerUserId()));
                        hashMap.put("connection_inviter_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
                    }
                    if (1NN.LLFF.LIZ().LJIILLIIL == 0kP.RANDOM_LINK_MIC_RECOMMEND || 1NN.LLFF.LIZ().LJIILL == 0kf.RANDOM_LINK_MIC_RECOMMEND) {
                        hashMap.put("is_quick_recommend", "1");
                    }
                    else {
                        hashMap.put("is_quick_recommend", "0");
                    }
                    hashMap.put("log_id", 1NN.LLFF.LIZ().LJLJLJ);
                    String string;
                    if (1NN.LLFF.LIZ().LJLL == null) {
                        string = "";
                    }
                    else {
                        string = 1NN.LLFF.LIZ().LJLL.toString();
                    }
                    hashMap.put("relation_type", string);
                    final Gkn liz3 = Gkn.LJFF.LIZ("connection_over");
                    liz3.LIZ(liz2);
                    liz3.LIZ((Map)hashMap);
                    liz3.LIZ();
                    liz3.LIZLLL();
                }
            }
        }
        else {
            final Room lizj2 = this.LIZJ;
            if (!0xy.LIZLLL) {
                if (lizj2 != null) {
                    0xy.LIZLLL = true;
                    final long elapsedRealtime = SystemClock.elapsedRealtime();
                    final long lizj3 = 0xy.LIZJ;
                    final 1NN liz4 = 1NN.LLFF.LIZ();
                    final HashMap hashMap2 = new HashMap();
                    hashMap2.put("connection_type", "anchor");
                    hashMap2.put("channel_id", String.valueOf(liz4.LJ));
                    hashMap2.put("watch_connection_duration", String.valueOf((elapsedRealtime - lizj3) / 1000L));
                    hashMap2.put("right_user_id", String.valueOf(liz4.LJFF));
                    hashMap2.put("uid_list", Arrays.asList(liz4.LJFF, lizj2.getOwner().getId()).toString());
                    hashMap2.put("current_connection_cnts", "2");
                    0xy.LIZ(hashMap2);
                    0xy.LIZ("connection_watch_duration", hashMap2);
                }
            }
        }
        final boolean ljiij = this.LJ.LJIIJ;
        final boolean ljiijji = this.LJ.LJIIJJI;
        0n9.LIZJ = null;
        0n9.LIZLLL = null;
        0nA.LIZLLL.LIZ();
        try {
            ((GK2)this.LIZLLL).LIZ();
            this.LJIIZILJ.LIZ();
            this.LJ.LJFF("LinkCrossWidget_OnDestroy");
        }
        finally {
            0ba.LIZ(6, "DATA_CENTER", "should crash at onDestroy()");
        }
        0n0.LIZJ.LIZ(this.LJII.LIZ, new 0mb(this), 0n0.a.PK);
        this.LJIIJJI.removeAllViews();
        this.LJIIJJI.setBackgroundColor(0);
        this.LJIIJJI.setVisibility(8);
        final I4V lj = I4V.LJ;
        lj.LJII();
        String lizj4;
        if (I4V.LIZLLL) {
            lizj4 = "broadcast_period";
        }
        else {
            lizj4 = "watch_period";
        }
        I4V.LIZJ = lizj4;
        lj.LJI();
        super.onDestroy();
        0xo.LIZ("LinkCross_Widget_onDestroy");
        0jz.LIZLLL().setEnableSDK(true, "LinkCross_onDestroy");
        if (this.LIZIZ) {
            if (ljiijji) {
                super.dataChannel.LIZJ((Class)2Ds.class, (Object)"");
                MethodCollector.o(10859);
                return;
            }
            if (1O2.LIZIZ()) {
                final 1NN lj2 = this.LJ;
                if (lj2 != null) {
                    lj2.LIZIZ(0kd.MATCH);
                    MethodCollector.o(10859);
                    return;
                }
            }
            if (ljiij) {
                1O2.LJI();
                1O2.LIZ(super.dataChannel, 1O2.e.TYPE_AUTO_START_WHEN_END);
                MethodCollector.o(10859);
                return;
            }
            if (1O2.LIZ()) {
                1O2.LJI();
            }
        }
        MethodCollector.o(10859);
    }
    
    public void onPause() {
        super.onPause();
        if (this.LIZIZ) {
            final 1k4 lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZIZ(false);
            }
        }
    }
    
    public void onResume() {
        super.onResume();
        if (this.LIZIZ) {
            final 1k4 lizlll = this.LIZLLL;
            if (lizlll != null) {
                lizlll.LIZIZ(true);
            }
        }
    }
    
    @Override
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
