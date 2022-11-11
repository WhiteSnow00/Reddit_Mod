// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.dialog;

import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import android.widget.SeekBar;
import X.1Wd;
import X.1Wv;
import X.2FX;
import X.0AO;
import X.1lr;
import X.2FN;
import X.SRS;
import X.0CH;
import X.1lq;
import com.bytedance.android.live.effect.api.IEffectService;
import X.0s5;
import androidx.fragment.app.Fragment;
import X.0s6;
import X.0jR;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import X.2GA;
import X.1jw;
import X.0cJ;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import X.2G9;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.preview.AbsMultiGuestNewPreviewViewModel;
import X.1JQ;
import X.0Wp;
import X.Gte;
import X.Hf4;
import X.8si;
import X.2Fs;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.text.TextUtils;
import X.2d6;
import X.1Vb;
import X.1Va;
import X.FAN;
import X.FFb;
import X.F8U;
import X.F8V;
import X.FAr;
import X.FGw;
import X.1VZ;
import X.FBF;
import X.FIw;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import X.0uW;
import X.I4y;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautySetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import X.6E8;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import com.bytedance.android.live.base.model.ImageModel;
import X.HFv;
import X.Qys;
import X.0ch;
import X.HZ0;
import X.Fk2;
import X.0cB;
import X.0ba;
import X.0II;
import X.0gZ;
import X.0uq;
import X.1lp;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import X.2P9;
import X.1Wj;
import X.1Wh;
import X.VzU;
import X.SRT;
import X.GbZ;
import android.os.Handler;
import X.FH6;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect.MultiGuestEffectSwitchFragment;
import X.1so;
import androidx.recyclerview.widget.RecyclerView;
import X.HwV;
import android.widget.TextView;
import android.widget.ImageView;
import X.2Bo;
import X.1si;
import com.bytedance.android.live.liveinteract.multiguestv3.internal.IMultiGuestV3InternalService;
import X.0g8;
import X.0kV;
import X.1Uo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.1TV;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import X.SRo;
import X.SSb;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.FrameLayout;
import android.view.View;
import X.0Wg;
import X.0gk;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnClickListener;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.PreviewFragment;

public class GuestMediaManageFragment extends PreviewFragment implements View$OnClickListener, SeekBar$OnSeekBarChangeListener, b
{
    public static final String LIZ;
    public 0Wg LIZIZ;
    public View LIZJ;
    public FrameLayout LIZLLL;
    public ConstraintLayout LJ;
    public SSb LJFF;
    public SRo LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public LiveEffect LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public LiveEffect LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public LiveDialogFragment LJIJ;
    public 0gk LJIJI;
    public 1TV LJIJJ;
    public boolean LJIJJLI;
    public DataChannel LJIL;
    @0kV(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LJJ;
    public boolean LJJI;
    public 0g8 LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public IMultiGuestV3InternalService LJJIIJZLJL;
    public final a LJJIIZ;
    public 1si LJJIIZI;
    public 2Bo LJJIJ;
    public FrameLayout LJJIJIIJI;
    public ImageView LJJIJIIJIL;
    public View LJJIJIL;
    public View LJJIJL;
    public View LJJIJLIJ;
    public TextView LJJIL;
    public TextView LJJIZ;
    public View LJJJ;
    public HwV LJJJI;
    public RecyclerView LJJJIL;
    public View LJJJJ;
    public View LJJJJI;
    public 1so LJJJJIZL;
    public View LJJJJJ;
    public ConstraintLayout LJJJJJL;
    public MultiGuestEffectSwitchFragment LJJJJL;
    public int LJJJJLI;
    public boolean LJJJJLL;
    public final FH6 LJJJJZ;
    public final Handler LJJJJZI;
    public GbZ LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public String LJJJZ;
    public final Long LJJL;
    public final SRT<VzU, 1Wh<1Wj>, 2P9> LJJLI;
    public final MultiGuestEffectSwitchFragment.c LJJLIIIIJ;
    public final MultiGuestEffectSwitchFragment.b LJJLIIIJ;
    
    static {
        Covode.recordClassIndex(8751);
        LIZ = GuestMediaManageFragment.class.getSimpleName();
    }
    
    public GuestMediaManageFragment() {
        this.LJJJJZ = new FH6();
        this.LJJJJZI = new Handler(Looper.getMainLooper());
        this.LJJI = false;
        this.LJJJLL = false;
        this.LJJJLZIJ = false;
        this.LJJII = "";
        this.LJJIII = "";
        this.LJJIIJ = "";
        this.LJJJZ = "outside";
        this.LJJL = System.currentTimeMillis();
        this.LJJIIJZLJL = null;
        this.LJJLI = (SRT<VzU, 1Wh<1Wj>, 2P9>)new 1lp(this);
        this.LJJLIIIIJ = new MultiGuestEffectSwitchFragment.c() {
            static {
                Covode.recordClassIndex(8752);
            }
            
            @Override
            public final void LIZ() {
                if (GuestMediaManageFragment.this.LJI != null) {
                    GuestMediaManageFragment.this.LJI.setVisibility(0);
                }
            }
            
            @Override
            public final void LIZIZ() {
                if (GuestMediaManageFragment.this.LJI != null) {
                    GuestMediaManageFragment.this.LJI.setVisibility(4);
                }
            }
            
            @Override
            public final SRo LIZJ() {
                return GuestMediaManageFragment.this.LJI;
            }
        };
        this.LJJLIIIJ = new MultiGuestEffectSwitchFragment.b() {
            static {
                Covode.recordClassIndex(8753);
            }
            
            @Override
            public final LiveEffect LIZ() {
                return GuestMediaManageFragment.this.LJIILJJIL;
            }
            
            @Override
            public final void LIZ(final int ljiiliil) {
                GuestMediaManageFragment.this.LJIILIIL = ljiiliil;
            }
            
            @Override
            public final void LIZ(final int n, final boolean b) {
                GuestMediaManageFragment.this.LJJIIJ = 0uq.LIZ(n);
            }
            
            @Override
            public final void LIZ(final LiveEffect ljiiljjil) {
                GuestMediaManageFragment.this.LJIILJJIL = ljiiljjil;
            }
            
            @Override
            public final int LIZIZ() {
                return GuestMediaManageFragment.this.LJIILIIL;
            }
        };
        this.LJJIIZ = new a() {
            static {
                Covode.recordClassIndex(8755);
            }
            
            @Override
            public final void LIZ(final LiveEffect liveEffect) {
            }
            
            @Override
            public final void LIZ(final String s, final LiveEffect liveEffect) {
                if (GuestMediaManageFragment.this.LJIJJ != null) {
                    GuestMediaManageFragment.this.LJIJJ.LIZ(0gZ.LIZJ, liveEffect, 3);
                }
            }
            
            @Override
            public final void LIZIZ(final String s, final LiveEffect liveEffect) {
                if (GuestMediaManageFragment.this.LJIJJ != null) {
                    GuestMediaManageFragment.this.LJIJJ.LIZ(0gZ.LIZJ, liveEffect, 2);
                }
            }
        };
    }
    
    private void LIZ(final boolean b) {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, 0II.LIZ("switchPreview isVideoOn=%s", new Object[] { b }));
        this.LIZIZ(b);
        if (b) {
            ((View)this.LIZIZ).setVisibility(0);
            this.LJJIJIL.setBackground(0cB.LIZJ(2131234602));
            this.LJJIJL.setBackground(0cB.LIZJ(2131234561));
            this.LJJIIZI.setVisibility(4);
            this.LJJIJ.setVisibility(4);
            final 2Bo ljjij = this.LJJIJ;
            if (ljjij != null) {
                ljjij.LIZJ();
            }
            this.LJJIJIIJIL.setVisibility(4);
            return;
        }
        ((View)this.LIZIZ).setVisibility(4);
        this.LJJIJIL.setBackground(0cB.LIZJ(2131234599));
        this.LJJIJL.setBackground(0cB.LIZJ(2131234559));
        this.LJJIIZI.setVisibility(0);
        this.LJJIJ.setVisibility(0);
        this.LJJIJ.LIZIZ();
        if (!this.LJJJJLL) {
            final ImageModel avatarThumb = Fk2.LIZ().LIZIZ().LIZ().getAvatarThumb();
            0ch.LIZ(this.LJJIIZI, avatarThumb, (Qys)new HZ0(5, 0.74698794f));
            final ImageView ljjijiijil = this.LJJIJIIJIL;
            HFv.LIZ(ljjijiijil, avatarThumb, ljjijiijil.getWidth(), this.LJJIJIIJIL.getHeight(), 2131234398);
            this.LJJJJLL = true;
        }
        this.LJJIJIIJIL.setVisibility(0);
    }
    
    private void LIZIZ(final boolean b) {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, 0II.LIZ("switchCameraOnOrOff isVideoOn=%s", new Object[] { b }));
        final 0Wg liziz = this.LIZIZ;
        if (liziz == null) {
            return;
        }
        final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-video_capture_in_preview_panel_switch_camera");
        with.usage("");
        with.tag("Switch Camera on or off in preview panel");
        with.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy() });
        liziz.LIZ(b, (Cert)with.build());
    }
    
    private void LIZJ() {
        while (true) {
            Label_0068: {
                if (!MultiGuestBeautySetting.enableNewEffectPageContainer()) {
                    break Label_0068;
                }
                final FrameLayout ljjijiiji = this.LJJIJIIJI;
                if (ljjijiiji == null || this.LJJJJL == null) {
                    break Label_0068;
                }
                I4y.LIZ((View)ljjijiiji, 0);
                I4y.LIZ(this.LJJIJLIJ, 4);
                I4y.LIZ((View)this.LJJJJJL, 0);
                0ba.LIZ(4, GuestMediaManageFragment.LIZ, "switchToBeautySelection");
                this.LJJIIJ = "enhance";
                if (this.LJJ == null) {
                    return;
                }
                0uW.LIZJ.LIZ(this.LJJIII, this.LJJII, this.LJJIIJ, this.LJIILJJIL, this.LJIILIIL, this.LJJ.LIZ ^ true, this.LJIIJJI ^ true, this.LJIIL);
                final GbZ ljjjliil = this.LJJJLIIL;
                if (ljjjliil != null) {
                    ljjjliil.LIZLLL();
                }
                this.LIZ(true);
                final View ljjj = this.LJJJ;
                if (ljjj != null) {
                    final ConstraintLayout.a layoutParams = (ConstraintLayout.a)ljjj.getLayoutParams();
                    layoutParams.bottomToBottom = 2131362728;
                    layoutParams.rightToRight = 2131362728;
                    layoutParams.leftToLeft = 2131362728;
                    this.LJJJ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                }
                final HwV ljjji = this.LJJJI;
                if (ljjji != null) {
                    ljjji.setVisibility(0);
                }
                final RecyclerView ljjjil = this.LJJJIL;
                if (ljjjil != null) {
                    ljjjil.setVisibility(8);
                }
                final View ljjjj = this.LJJJJ;
                if (ljjjj != null) {
                    ljjjj.setVisibility(8);
                }
                final TextView ljjil = this.LJJIL;
                if (ljjil != null) {
                    ljjil.setTextColor(-1);
                }
                final TextView ljjiz = this.LJJIZ;
                if (ljjiz != null) {
                    ljjiz.setTextColor(-2130706433);
                }
                if (this.LJJIJLIJ != null) {
                    if (MultiGuestBeautySetting.enableNewEffectPageContainer()) {
                        this.LJJIJLIJ.setVisibility(8);
                    }
                    else {
                        this.LJJIJLIJ.setVisibility(0);
                    }
                }
                final View ljjjji = this.LJJJJI;
                if (ljjjji != null) {
                    ljjjji.setVisibility(0);
                }
                return;
            }
            I4y.LIZ((View)this.LJJIJIIJI, 8);
            I4y.LIZ((View)this.LJJJJJL, 8);
            continue;
        }
    }
    
    private void LIZLLL() {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, "switchToAudioSelection");
        if (this.LJJ == null) {
            return;
        }
        this.LJJIIJ = "audio";
        0uW.LIZJ.LIZ(this.LJJIII, this.LJJII, this.LJJIIJ, this.LJIILJJIL, this.LJIILIIL, this.LJJ.LIZ ^ true, this.LJIIJJI ^ true, this.LJIIL);
        this.LIZ(false);
        final View ljjijlij = this.LJJIJLIJ;
        if (ljjijlij != null) {
            ljjijlij.setVisibility(4);
        }
        final HwV ljjji = this.LJJJI;
        if (ljjji != null) {
            ljjji.setVisibility(8);
        }
        final RecyclerView ljjjil = this.LJJJIL;
        if (ljjjil != null) {
            ljjjil.setVisibility(8);
        }
        final View ljjjj = this.LJJJJ;
        if (ljjjj != null) {
            ljjjj.setVisibility(0);
        }
        final TextView ljjil = this.LJJIL;
        if (ljjil != null) {
            ljjil.setTextColor(-2130706433);
        }
        final TextView ljjiz = this.LJJIZ;
        if (ljjiz != null) {
            ljjiz.setTextColor(-2130706433);
        }
        final View ljjjji = this.LJJJJI;
        if (ljjjji != null) {
            ljjjji.setVisibility(4);
        }
        if (MultiGuestBeautySetting.enableNewEffectPageContainer()) {
            final FrameLayout ljjijiiji = this.LJJIJIIJI;
            if (ljjijiiji != null && this.LJJJJL != null) {
                I4y.LIZ((View)ljjijiiji, 4);
                I4y.LIZ((View)this.LJJJJJL, 4);
                return;
            }
        }
        I4y.LIZ((View)this.LJJIJIIJI, 8);
        I4y.LIZ((View)this.LJI, 8);
    }
    
    private void LJ() {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, "dispose");
        if (!this.LJJJJZ.isDisposed()) {
            this.LJJJJZ.dispose();
        }
    }
    
    public final void LIZ() {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, "onSyncStickersFailed");
        this.LIZ(new ArrayList<LiveEffect>());
    }
    
    public final void LIZ(final EffectChannelResponse effectChannelResponse) {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, 0II.LIZ("onSyncStickersSuccess effectCategoryResponseList=%s", new Object[] { effectChannelResponse }));
        ((FIw)FBF.LIZIZ((Iterable)((EffectChannelResponseTemplate)effectChannelResponse).getAllCategoryEffects()).LJ(1VZ.LIZ).LJIIJ().LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((FAN)FFb.LIZ((View)this.LJJJIL))).LIZ((2d6)new 1Va(this), 1Vb.LIZ);
    }
    
    public final void LIZ(final List<LiveEffect> list) {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, 0II.LIZ("initStickerRecyclerView liveEffects=%s", new Object[] { list.toString() }));
        if (list.isEmpty()) {
            list.add(new LiveEffect());
            return;
        }
        list.add(0, new LiveEffect());
        this.LJIJJ = new 1TV(this.getContext(), list, (1TV.a)new 1TV.a() {
            static {
                Covode.recordClassIndex(8754);
            }
            
            @Override
            public final void LIZ(final LiveEffect liveEffect) {
                if (GuestMediaManageFragment.this.LJIJI == null) {
                    return;
                }
                if (GuestMediaManageFragment.this.LJIJJ == null) {
                    return;
                }
                if (GuestMediaManageFragment.this.LJIJI.LIZ(liveEffect)) {
                    GuestMediaManageFragment.this.LJIJJ.LIZ(0gZ.LIZJ, liveEffect, 2);
                    return;
                }
                GuestMediaManageFragment.this.LJIJI.LIZ(0gZ.LIZJ, liveEffect, GuestMediaManageFragment.this.LJJIIZ);
            }
            
            @Override
            public final void LIZIZ(final LiveEffect ljiiljjil) {
                if (GuestMediaManageFragment.this.LJJIFFI != null) {
                    GuestMediaManageFragment.this.LJJIFFI.LIZ(0gZ.LIZJ);
                }
                if (!TextUtils.equals((CharSequence)ljiiljjil.realId, (CharSequence)"") && GuestMediaManageFragment.this.LJJIFFI != null) {
                    GuestMediaManageFragment.this.LJJIFFI.LIZ(0gZ.LIZJ, ljiiljjil);
                }
                GuestMediaManageFragment.this.LJIILJJIL = ljiiljjil;
            }
            
            @Override
            public final boolean LIZJ(final LiveEffect liveEffect) {
                if (liveEffect != null && liveEffect.realId.equals("")) {
                    return true;
                }
                try {
                    return GuestMediaManageFragment.this.LJIJI.LIZ(liveEffect);
                }
                catch (final Exception ex) {
                    return false;
                }
            }
        }, true);
        final RecyclerView ljjjil = this.LJJJIL;
        if (ljjjil != null) {
            this.getContext();
            ljjjil.setLayoutManager((RecyclerView.i)new LinearLayoutManager(0, false));
            this.LJJJIL.setAdapter((RecyclerView.a)this.LJIJJ);
        }
    }
    
    public void onClick(View view) {
        final String liz = GuestMediaManageFragment.LIZ;
        final int id = view.getId();
        final boolean b = false;
        0ba.LIZ(4, liz, 0II.LIZ("onClick v=%s", new Object[] { id }));
        final int id2 = view.getId();
        if (id2 == 2131367337) {
            0ba.LIZ(4, liz, "showDisconnectDialog");
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null && room.getOwner() != null) {
                final LiveDialogFragment ljij = this.LJIJ;
                if (ljij != null) {
                    ((DialogFragment)ljij).dismiss();
                }
                if (this.LJIL != null) {
                    this.LJIL.LIZJ((Class)2Fs.class, (Object)new 8si((Object)"setting_panel", (Object)10002));
                }
            }
            return;
        }
        if (id2 == 2131363259) {
            if (this.LJJ.LJJIFFI != 3 && this.LJJ.LJJIFFI != 1 && this.LJJJLZIJ) {
                Hf4.LIZ(0cB.LJ(), 2131831268);
                return;
            }
            this.LJIIL ^= true;
            final 0Wg liziz = this.LIZIZ;
            final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-video_capture_in_preview_panel_switch_camera_back_front");
            with.usage("");
            with.tag("Switch Capture camera back or front in preview panel");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy(), PrivacyPolicyStore.getVideoPrivacyPolicy() });
            liziz.LIZ((Cert)with.build());
        }
        else {
            if (id2 == 2131362728) {
                this.LIZJ();
                return;
            }
            if (id2 == 2131371771) {
                0ba.LIZ(4, liz, "switchToStickerSelection");
                this.LJJIIJ = "props";
                if (this.LJJ != null) {
                    0uW.LIZJ.LIZ(this.LJJIII, this.LJJII, this.LJJIIJ, this.LJIILJJIL, this.LJIILIIL, this.LJJ.LIZ ^ true, this.LJIIJJI ^ true, this.LJIIL);
                    this.LIZ(true);
                    view = this.LJJJ;
                    if (view != null) {
                        final ConstraintLayout.a layoutParams = (ConstraintLayout.a)view.getLayoutParams();
                        layoutParams.bottomToBottom = 2131371771;
                        layoutParams.rightToRight = 2131371771;
                        layoutParams.leftToLeft = 2131371771;
                        this.LJJJ.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                    }
                    final HwV ljjji = this.LJJJI;
                    if (ljjji != null) {
                        ljjji.setVisibility(8);
                    }
                    final RecyclerView ljjjil = this.LJJJIL;
                    if (ljjjil != null) {
                        ljjjil.setVisibility(0);
                    }
                    view = this.LJJJJ;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    final TextView ljjil = this.LJJIL;
                    if (ljjil != null) {
                        ljjil.setTextColor(-2130706433);
                    }
                    final TextView ljjiz = this.LJJIZ;
                    if (ljjiz != null) {
                        ljjiz.setTextColor(-1);
                    }
                    if (this.LJJIJLIJ != null) {
                        if (MultiGuestBeautySetting.enableNewEffectPageContainer()) {
                            this.LJJIJLIJ.setVisibility(8);
                        }
                        else {
                            this.LJJIJLIJ.setVisibility(0);
                        }
                    }
                    view = this.LJJJJI;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                return;
            }
            if (id2 != 2131374107) {
                if (id2 == 2131363145) {
                    0ba.LIZ(4, liz, "rewriteBeforeStates");
                    this.LJIILL = true;
                    final boolean ljiijji = this.LJIIJJI;
                    this.LJIIZILJ = (ljiijji && !this.LJII);
                    boolean ljiilliil = b;
                    if (!ljiijji) {
                        ljiilliil = b;
                        if (this.LJII) {
                            ljiilliil = true;
                        }
                    }
                    this.LJIILLIIL = ljiilliil;
                    this.LJII = ljiijji;
                    this.LJIIIIZZ = this.LJIIL;
                    this.LJIIIZ = this.LJIILIIL;
                    if ((this.LJIIJ = this.LJIILJJIL) != null && this.LJIL != null) {
                        this.LJIL.LIZJ((Class)Gte.class, (Object)new 0Wp("liveinteract", this.LJIILJJIL, ""));
                    }
                    final 0g8 ljjiffi = this.LJJIFFI;
                    if (ljjiffi instanceof 1JQ) {
                        ((1JQ)ljjiffi).LIZ(true);
                        AbsMultiGuestNewPreviewViewModel.LIZLLL.LIZ((1JQ)this.LJJIFFI);
                    }
                    final LiveDialogFragment ljij2 = this.LJIJ;
                    if (ljij2 != null) {
                        this.LJJJZ = "confirm_icon";
                        ((DialogFragment)ljij2).dismiss();
                    }
                }
                else if (id2 == 2131368241) {
                    final 1Uo ljj = this.LJJ;
                    if (ljj == null) {
                        return;
                    }
                    if (ljj.LJJIFFI != 2 && this.LJJ.LJJIFFI != 3) {
                        return;
                    }
                    final StringBuilder sb = new StringBuilder("onClickMicBtn setAudioEnable from ");
                    sb.append(this.LJJ.LIZ);
                    sb.append(" to ");
                    sb.append(this.LJJ.LIZ ^ true);
                    0ba.LIZ(4, liz, sb.toString());
                    final 1Uo ljj2 = this.LJJ;
                    ljj2.LIZ ^= true;
                    0uW.LIZJ.LIZ(this.LJJ.LJJIIZI, this.LJJ.LJIJI, true ^ this.LJJ.LIZ, "guest_connection_panel");
                    final DataChannel ljil = this.LJIL;
                    if (ljil != null) {
                        ljil.LIZJ((Class)2G9.class, (Object)this.LJJ.LIZ);
                    }
                }
                return;
            }
            if (this.LJJ.LJJIFFI != 3 && this.LJJ.LJJIFFI != 1 && this.LJJJLZIJ) {
                Hf4.LIZ(0cB.LJ(), 2131831268);
                this.LIZLLL();
                return;
            }
            if (this.LJIIJJI ^= true) {
                this.LIZJ();
            }
            else {
                this.LIZLLL();
            }
            0uW.LIZ(0uW.LIZJ, this.LJIIJJI, "link_management_panel");
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final String liz = GuestMediaManageFragment.LIZ;
        0ba.LIZ(4, liz, 0II.LIZ("onCreateView: onCreateView=%s, container=%s, savedInstanceState=%s", new Object[] { layoutInflater, viewGroup, bundle }));
        final View liz2 = 0II.LIZ(layoutInflater, 2131562015, viewGroup, false);
        0ba.LIZ(4, liz, 0II.LIZ("findViewByID mRootView=%s", new Object[] { liz2 }));
        this.LJ = (ConstraintLayout)liz2.findViewById(2131369613);
        this.LIZLLL = (FrameLayout)liz2.findViewById(2131369603);
        this.LIZJ = liz2.findViewById(2131369599);
        this.LJJIIZI = (1si)liz2.findViewById(2131362577);
        this.LJJIJ = (2Bo)liz2.findViewById(2131362508);
        this.LJJIJIIJIL = (ImageView)liz2.findViewById(2131362570);
        this.LJJIJIL = liz2.findViewById(2131374107);
        this.LJJIJL = liz2.findViewById(2131363259);
        this.LJJIJLIJ = liz2.findViewById(2131369074);
        this.LJJIL = (TextView)liz2.findViewById(2131362728);
        this.LJJIZ = (TextView)liz2.findViewById(2131371771);
        this.LJJJ = liz2.findViewById(2131366413);
        this.LJJJI = (HwV)liz2.findViewById(2131362727);
        this.LJJJIL = (RecyclerView)liz2.findViewById(2131371760);
        this.LJJJJ = liz2.findViewById(2131362509);
        this.LJJJJIZL = (1so)liz2.findViewById(2131363145);
        this.LJJJJI = liz2.findViewById(2131374123);
        this.LJJJJJ = liz2.findViewById(2131367337);
        this.LJFF = (SSb)liz2.findViewById(2131368241);
        this.LJJIJIIJI = (FrameLayout)liz2.findViewById(2131364752);
        this.LJI = (SRo)liz2.findViewById(2131371451);
        this.LJJJJJL = (ConstraintLayout)liz2.findViewById(2131370979);
        0cJ.LIZ((View)this.LIZLLL, 0cB.LIZ(8.0f));
        0cJ.LIZ(this.LIZJ, 0cB.LIZ(8.0f));
        0cJ.LIZ((View)this.LJJIIZI, 0cB.LIZ(8.0f));
        0cJ.LIZ(this.LJJJJI, 0cB.LIZ(8.0f));
        1jw.LIZ.LIZIZ(this);
        if (this.LJJ.LIZIZ) {
            this.LJJ.LIZIZ = false;
            final DataChannel ljil = this.LJIL;
            if (ljil != null) {
                ljil.LIZJ((Class)2GA.class, (Object)false);
            }
        }
        final 0g8 liz3 = AbsMultiGuestNewPreviewViewModel.LIZLLL.LIZ();
        this.LJJIFFI = liz3;
        if (liz3 instanceof 1JQ) {
            ((1JQ)liz3).LIZ(false);
        }
        final 0g8 ljjiffi = this.LJJIFFI;
        0ba.LIZ(4, liz, "createAndAddSurfaceView");
        final 0Wg.a a = new 0Wg.a();
        a.LIZ = this.LJIILIIL;
        a.LIZIZ = this.LJIILJJIL;
        if (this.LJIIL) {
            a.LIZJ = 0;
        }
        else {
            a.LIZJ = 1;
        }
        a.LIZLLL = this.LJIIJJI;
        final GbZ linkMicPreviewView = 0jR.LIZ(IBroadcastService.class).createLinkMicPreviewView(this.getContext(), a, this.LJIL, ljjiffi);
        this.LJJJLIIL = linkMicPreviewView;
        this.LIZIZ = (0Wg)linkMicPreviewView;
        final FrameLayout lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.post((Runnable)new 0s6(this));
        }
        final 0Wg liziz = this.LIZIZ;
        while (true) {
            Label_0939: {
                if (this.LJJJJL != null || !MultiGuestBeautySetting.enableNewEffectPageContainer()) {
                    break Label_0939;
                }
                final FrameLayout ljjijiiji = this.LJJIJIIJI;
                if (ljjijiiji == null) {
                    break Label_0939;
                }
                I4y.LIZ((View)ljjijiiji, 0);
                I4y.LIZ(this.LJJIJLIJ, 4);
                this.LJJJJL = MultiGuestEffectSwitchFragment.LIZ(liziz, this.LJJLIIIIJ, true, this.LJJLIIIJ);
                final 0AO liz4 = this.getChildFragmentManager().LIZ();
                liz4.LIZIZ(2131364752, this.LJJJJL, null);
                liz4.LJ();
                this.LJJJJJ.setVisibility(0);
                this.LJJJJIZL.setVisibility(0);
                this.LJJJLZIJ = true;
                this.LJJJJJ.setOnClickListener((View$OnClickListener)this);
                this.LJJJJIZL.setOnClickListener((View$OnClickListener)this);
                this.LJJIJIL.setOnClickListener((View$OnClickListener)this);
                this.LJJIJL.setOnClickListener((View$OnClickListener)this);
                this.LJJIL.setOnClickListener((View$OnClickListener)this);
                this.LJJIZ.setOnClickListener((View$OnClickListener)this);
                this.LJJJI.setSeekbarListener((SeekBar$OnSeekBarChangeListener)this);
                this.LJJIJ.LIZ(2Bo.LIZ("tiktok_live_interaction_resource", "audio_interact_effect.webp"));
                this.LJJIJLIJ.post((Runnable)new 0s5(this));
                this.LJIJI = 0jR.LIZ(IEffectService.class).stickerPresenter();
                this.LJJJI.setCurrentProgress(this.LJIILIIL);
                this.LJIJJLI = true;
                this.LJJJJLL = false;
                final DataChannel ljil2 = this.LJIL;
                if (ljil2 != null) {
                    ljil2.LIZIZ((0CH)this, (Class)2G9.class, (SRS)new 1lq(this));
                    ljil2.LIZIZ((0CH)this, (Class)2FN.class, (SRS)new 1lr(this));
                }
                this.LJFF.setOnClickListener((View$OnClickListener)this);
                if (this.LJJ != null) {
                    final StringBuilder sb = new StringBuilder(" onCreateView isAudioEnable = ");
                    sb.append(this.LJJ.LIZ);
                    0ba.LIZ(4, liz, sb.toString());
                }
                final IMultiGuestV3InternalService ljjiijzljl = this.LJJIIJZLJL;
                if (ljjiijzljl != null) {
                    ljjiijzljl.subscribe(1Wj.class, this.LJJLI);
                }
                return liz2;
            }
            I4y.LIZ(this.LJJIJLIJ, 0);
            I4y.LIZ((View)this.LJJJJJL, 8);
            I4y.LIZ((View)this.LJJIJIIJI, 8);
            continue;
        }
    }
    
    public void onDestroy() {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, "onDestroy");
        super.onDestroy();
        final 2Bo ljjij = this.LJJIJ;
        if (ljjij != null) {
            ljjij.LIZJ();
        }
        final 0gk ljiji = this.LJIJI;
        if (ljiji != null) {
            ljiji.LIZ();
        }
        this.LJIJJLI = false;
        this.LJJJJZ.LIZ();
        this.LJJJJZI.removeCallbacksAndMessages((Object)null);
        this.LJ();
        this.LJJJLL = false;
        this.LJJJLZIJ = false;
        final DataChannel ljil = this.LJIL;
        if (ljil != null) {
            ljil.LIZJ((Class)2FX.class, (Object)new 1Wd(new 1Wv(this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ), "close"));
        }
        if (this.LJJ != null) {
            0uW.LIZJ.LIZ(this.LJIILJJIL, this.LJIILIIL, this.LJJ.LIZ ^ true, this.LJIIJJI ^ true, this.LJIIL, this.LJJJZ, System.currentTimeMillis() - this.LJJL);
        }
        final IMultiGuestV3InternalService ljjiijzljl = this.LJJIIJZLJL;
        if (ljjiijzljl != null) {
            ljjiijzljl.unsubscribe(1Wj.class, this.LJJLI);
        }
    }
    
    public void onPause() {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, "onPause");
        super.onPause();
        if (this.LJJI) {
            return;
        }
        this.LIZIZ(false);
        this.LJJJLL = true;
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int ljiiliil, final boolean b) {
        if (ljiiliil >= 0 && ljiiliil <= seekBar.getMax() && b) {
            final 0Wg liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.LIZ(ljiiliil);
            }
            this.LJIILIIL = ljiiliil;
        }
    }
    
    public void onResume() {
        0ba.LIZ(4, GuestMediaManageFragment.LIZ, "onResume");
        super.onResume();
        this.LJJI = false;
        this.LIZIZ(this.LJIIJJI);
        if (this.LJJJLL && this.LJJJLZIJ) {
            this.LJJJLL = false;
            this.LJJJLZIJ = false;
            this.LJ();
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
}
