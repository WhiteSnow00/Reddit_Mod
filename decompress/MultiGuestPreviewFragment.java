// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment;

import X.0xQ;
import X.0eC;
import androidx.fragment.app.DialogFragment;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import X.0bf;
import com.bytedance.bpea.cert.token.TokenCert;
import org.json.JSONObject;
import X.1ml;
import android.widget.SeekBar;
import android.widget.FrameLayout$LayoutParams;
import X.2G1;
import X.0Wp;
import X.Gte;
import X.2Fk;
import X.0AO;
import X.1mV;
import X.2G0;
import X.SRS;
import X.0CH;
import X.1mU;
import X.2Fz;
import X.0vd;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import X.0cJ;
import X.0II;
import android.os.Bundle;
import android.view.LayoutInflater;
import X.KN6;
import android.app.Dialog;
import X.0tA;
import android.content.DialogInterface$OnClickListener;
import X.0vS;
import X.0vR;
import X.Ht9;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import X.2Fm;
import X.0ux;
import androidx.fragment.app.Fragment;
import X.HAM;
import X.Fk2;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import X.0sM;
import X.0xj;
import androidx.recyclerview.widget.LinearLayoutManager;
import X.5ap;
import X.1Zz;
import X.1Zy;
import X.FAN;
import X.FFb;
import X.FAr;
import X.FGw;
import X.1Zx;
import X.FBF;
import X.FIw;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import X.0WH;
import X.0gZ;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.interact.model.LinkInRoomReplyResponse;
import java.util.ArrayList;
import X.2Fw;
import X.2P9;
import X.QgG;
import X.1mW;
import X.2Fj;
import X.2Ft;
import X.0jR;
import com.bytedance.android.live.effect.api.IEffectService;
import X.1NN;
import X.Hf4;
import X.0uW;
import X.0jz;
import X.GCe;
import X.2G9;
import X.0yD;
import X.0ve;
import X.1Zw;
import X.1Zv;
import X.2d6;
import X.1Zu;
import X.F8U;
import X.F8V;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime;
import X.FBH;
import java.util.concurrent.TimeUnit;
import X.0up;
import X.0sD;
import X.0ba;
import android.view.SurfaceView;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.7wf;
import X.7wd;
import X.0W3;
import X.G69;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import android.text.TextUtils$TruncateAt;
import X.GTi;
import X.G18;
import com.bytedance.android.live.base.model.ImageModel;
import X.HFv;
import X.Qys;
import X.0ch;
import X.HZ0;
import X.0cp;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import X.2GA;
import X.0ql;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import X.6E8;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautySetting;
import com.bytedance.bpea.basics.Cert;
import java.util.Iterator;
import java.util.List;
import X.0cB;
import X.Vvh;
import X.Vva;
import android.text.style.ForegroundColorSpan;
import android.text.Spannable;
import X.0fd;
import X.Fjw;
import android.text.SpannableString;
import X.1jw;
import X.0uq;
import X.1NO;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import X.GbZ;
import X.1XE;
import android.os.Handler;
import X.2fc;
import X.FH6;
import X.1ib;
import androidx.recyclerview.widget.RecyclerView;
import X.HwV;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.effect.MultiGuestEffectSwitchFragment;
import android.widget.ImageView;
import X.2Bo;
import X.1BF;
import X.1si;
import X.0rb;
import X.1YG;
import android.view.ViewGroup$LayoutParams;
import X.1kK;
import java.lang.ref.WeakReference;
import X.0kV;
import X.1Uo;
import X.HtA;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.1TV;
import com.bytedance.android.livesdk.LiveDialogFragment;
import androidx.constraintlayout.widget.ConstraintLayout;
import X.SRo;
import android.widget.FrameLayout;
import X.1so;
import android.view.View;
import X.0Wg;
import android.view.ViewGroup;
import X.0qb;
import X.0gk;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.view.View$OnClickListener;

public class MultiGuestPreviewFragment extends PreviewFragment implements View$OnClickListener, SeekBar$OnSeekBarChangeListener, 0gk.b, 0qb.b
{
    public static final String LIZ;
    public ViewGroup LIZIZ;
    public 0Wg LIZJ;
    public View LIZLLL;
    public 1so LJ;
    public Boolean LJFF;
    public FrameLayout LJI;
    public SRo LJII;
    public ConstraintLayout LJIIIIZZ;
    public boolean LJIIIZ;
    public LiveDialogFragment LJIIJ;
    public 0qb.a LJIIJJI;
    public 0gk LJIIL;
    public 1TV LJIILIIL;
    public DataChannel LJIILJJIL;
    public HtA LJIILL;
    @0kV(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LJIILLIIL;
    public int LJIIZILJ;
    public WeakReference<1kK> LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public ViewGroup$LayoutParams LJIJJLI;
    public boolean LJIL;
    public String LJJ;
    public String LJJI;
    public 1YG LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public 0rb.a LJJIIJ;
    public final 0gk.a LJJIIJZLJL;
    public 1si LJJIIZ;
    public 1BF LJJIIZI;
    public 2Bo LJJIJ;
    public ImageView LJJIJIIJI;
    public View LJJIJIIJIL;
    public View LJJIJIL;
    public View LJJIJL;
    public FrameLayout LJJIJLIJ;
    public MultiGuestEffectSwitchFragment LJJIL;
    public TextView LJJIZ;
    public TextView LJJJ;
    public View LJJJI;
    public HwV LJJJIL;
    public RecyclerView LJJJJ;
    public 1ib LJJJJI;
    public View LJJJJIZL;
    public ViewGroup LJJJJJ;
    public 1ib LJJJJJL;
    public 1ib LJJJJL;
    public View LJJJJLI;
    public View LJJJJLL;
    public View LJJJJZ;
    public ImageView LJJJJZI;
    public boolean LJJJLIIL;
    public boolean LJJJLL;
    public final FH6 LJJJLZIJ;
    public 2fc LJJJZ;
    public final Handler LJJL;
    @0kV(LIZ = "MULTI_GUEST_V3_GUEST_USER_MANAGER")
    public 1XE LJJLI;
    public int LJJLIIIIJ;
    public boolean LJJLIIIJ;
    public ViewGroup LJJLIIIJILLIZJL;
    public GbZ LJJLIIIJJI;
    public boolean LJJLIIIJJIZ;
    public boolean LJJLIIIJL;
    public final long LJJLIIIJLJLI;
    public MultiGuestEffectSwitchFragment.c LJJLIIIJLLLLLLLZ;
    public MultiGuestEffectSwitchFragment.b LJJLIIJ;
    
    static {
        Covode.recordClassIndex(9637);
        LIZ = MultiGuestPreviewFragment.class.getSimpleName();
    }
    
    public MultiGuestPreviewFragment() {
        this.LJFF = false;
        this.LJIIIZ = true;
        this.LJJJLIIL = true;
        this.LJJJLZIJ = new FH6();
        this.LJJL = new Handler(Looper.getMainLooper());
        this.LJIJI = false;
        this.LJIJJ = false;
        this.LJJLIIIJJIZ = false;
        this.LJIL = false;
        this.LJJLIIIJL = false;
        this.LJJ = "outside";
        this.LJJI = "is_cancel";
        this.LJJLIIIJLJLI = System.currentTimeMillis();
        this.LJJIFFI = null;
        this.LJJII = "anchor_invite";
        this.LJJIII = "";
        this.LJJLIIIJLLLLLLLZ = new MultiGuestEffectSwitchFragment.c() {
            static {
                Covode.recordClassIndex(9638);
            }
            
            @Override
            public final void LIZ() {
                if (MultiGuestPreviewFragment.this.LJII != null && !MultiGuestPreviewFragment.this.LJJIII.equals("audio") && MultiGuestPreviewFragment.this.LJIIIIZZ != null) {
                    MultiGuestPreviewFragment.this.LJII.setVisibility(0);
                    MultiGuestPreviewFragment.this.LJIIIIZZ.setVisibility(0);
                }
            }
            
            @Override
            public final void LIZIZ() {
                if (MultiGuestPreviewFragment.this.LJII != null && MultiGuestPreviewFragment.this.LJIIIIZZ != null) {
                    MultiGuestPreviewFragment.this.LJII.setVisibility(4);
                    MultiGuestPreviewFragment.this.LJIIIIZZ.setVisibility(4);
                }
            }
            
            @Override
            public final SRo LIZJ() {
                return MultiGuestPreviewFragment.this.LJII;
            }
        };
        this.LJJLIIJ = new MultiGuestEffectSwitchFragment.b() {
            static {
                Covode.recordClassIndex(9639);
            }
            
            @Override
            public final LiveEffect LIZ() {
                return 1NO.LIZ().LIZJ;
            }
            
            @Override
            public final void LIZ(final int n) {
                MultiGuestPreviewFragment.this.LIZ(n);
            }
            
            @Override
            public final void LIZ(final int n, final boolean b) {
                MultiGuestPreviewFragment.this.LJJIII = 0uq.LIZ(n);
                if (!b) {
                    MultiGuestPreviewFragment.this.LIZIZ("switch_tab");
                }
            }
            
            @Override
            public final void LIZ(final LiveEffect liveEffect) {
                MultiGuestPreviewFragment.this.LIZ(liveEffect);
            }
            
            @Override
            public final int LIZIZ() {
                return 1NO.LIZ().LIZIZ;
            }
        };
        this.LJJIIJZLJL = new 0gk.a() {
            static {
                Covode.recordClassIndex(9641);
            }
            
            @Override
            public final void LIZ(final LiveEffect liveEffect) {
            }
            
            @Override
            public final void LIZ(final String s, final LiveEffect liveEffect) {
                MultiGuestPreviewFragment.this.LIZ(s, liveEffect, 3);
            }
            
            @Override
            public final void LIZIZ(final String s, final LiveEffect liveEffect) {
                MultiGuestPreviewFragment.this.LIZ(s, liveEffect, 2);
            }
        };
        1jw.LIZ.LIZIZ(this);
    }
    
    private SpannableString LIZ(String liz, final String s) {
        final SpannableString spannableString = new SpannableString((CharSequence)s);
        final int index = s.indexOf(liz);
        if (index == -1) {
            final Fjw liziz = Fjw.LIZIZ();
            final String liz2 = MultiGuestPreviewFragment.LIZ;
            final StringBuilder sb = new StringBuilder("updateTitleText error. anchorName=");
            sb.append(liz);
            sb.append(" titleText= ");
            sb.append(s);
            ((0bf)liziz).LIZIZ(liz2, sb.toString());
        }
        final int n = liz.length() + index;
        try {
            0fd.LIZ(this.getContext(), (Spannable)spannableString, index, n, 33, 4, 600);
        }
        catch (final Exception ex) {
            final Fjw liziz2 = Fjw.LIZIZ();
            liz = MultiGuestPreviewFragment.LIZ;
            final StringBuilder sb2 = new StringBuilder("updateTitleText error. start=");
            sb2.append(index);
            sb2.append(" end=");
            sb2.append(n);
            sb2.append(" string=");
            sb2.append(spannableString);
            ((0bf)liziz2).LIZIZ(liz, sb2.toString());
        }
        if (index > 0 && index < s.length()) {
            spannableString.setSpan((Object)new ForegroundColorSpan(this.getResources().getColor(2131100941)), 0, index, 33);
        }
        if (n < s.length() && n > 0) {
            spannableString.setSpan((Object)new ForegroundColorSpan(this.getResources().getColor(2131100941)), n, s.length(), 33);
        }
        return spannableString;
    }
    
    private void LIZ(final View view, final int visibility) {
        if (view == null) {
            return;
        }
        view.setVisibility(visibility);
    }
    
    private void LIZ(final ViewGroup viewGroup, final boolean b) {
        if (viewGroup.getChildCount() > 0 && viewGroup instanceof Vva) {
            final List allLayoutWindows = ((Vva)viewGroup).getAllLayoutWindows();
            if (allLayoutWindows.isEmpty()) {
                return;
            }
            for (final Vvh vvh : allLayoutWindows) {
                if (vvh.LJIIIIZZ() instanceof 0Wg) {
                    if (b) {
                        vvh.LJ().setBackgroundColor(0cB.LIZIZ(2131100834));
                        return;
                    }
                    vvh.LJ().setBackgroundColor(0);
                    break;
                }
            }
        }
    }
    
    private void LIZ(final Cert cert) {
        this.LJIIIZ = true;
        final GbZ ljjliiijji = this.LJJLIIIJJI;
        if (ljjliiijji != null) {
            ljjliiijji.LIZLLL();
        }
        this.LJJIII = "enhance";
        this.LIZ(true, cert);
        if (!MultiGuestBeautySetting.enableNewEffectPageContainer()) {
            final View ljjji = this.LJJJI;
            if (ljjji != null) {
                final ConstraintLayout.a layoutParams = (ConstraintLayout.a)ljjji.getLayoutParams();
                layoutParams.bottomToBottom = 2131362728;
                layoutParams.rightToRight = 2131362728;
                layoutParams.leftToLeft = 2131362728;
                this.LJJJI.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            }
            this.LIZ((View)this.LJJJIL, 0);
            this.LIZ((View)this.LJJJJ, 8);
            this.LIZ(this.LJJJJIZL, 0);
            this.LIZ(this.LJJIJL, 0);
            final TextView ljjiz = this.LJJIZ;
            if (ljjiz != null) {
                ljjiz.setTextColor(-1);
            }
            final TextView ljjj = this.LJJJ;
            if (ljjj != null) {
                ljjj.setTextColor(-2130706433);
            }
        }
        this.LIZ((View)this.LJJJJI, 8);
        this.LIZ(this.LJJJJIZL, 0);
    }
    
    private void LIZ(final boolean b) {
        if (b) {
            final ImageView ljjjjzi = this.LJJJJZI;
            if (ljjjjzi != null) {
                ljjjjzi.setBackground(0cB.LIZJ(2131234490));
            }
        }
        else {
            final ImageView ljjjjzi2 = this.LJJJJZI;
            if (ljjjjzi2 != null) {
                ljjjjzi2.setBackground(0cB.LIZJ(2131234489));
            }
        }
        if (this.LJJIII()) {
            final GbZ gbZ = (GbZ)this.LIZJ;
            final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-801");
            with.usage("");
            with.tag("mute audio in preview dialog");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
            gbZ.LIZJ(b, (Cert)with.build());
        }
    }
    
    private void LIZ(final boolean liziz, final Cert cert) {
        if (this.LJIILLIIL == null) {
            return;
        }
        this.LIZIZ(liziz, cert);
        this.LJIILLIIL.LIZIZ = liziz;
        final 1NO liz = 1NO.LIZ();
        int lji;
        if (liziz) {
            lji = 1;
        }
        else {
            lji = 2;
        }
        liz.LJI = lji;
        0ql.LIZ.LIZ(this.LJIILLIIL);
        if (this.LJJIII()) {
            this.LJIILJJIL.LIZJ((Class)2GA.class, (Object)this.LJIILLIIL.LIZIZ);
        }
        if (liziz) {
            ((View)this.LIZJ).setVisibility(0);
            this.LJJIJIIJIL.setBackground(0cB.LIZJ(2131234602));
            this.LJJIJIL.setBackground(0cB.LIZJ(2131234561));
            this.LJJIIZ.setVisibility(4);
            this.LJJIJ.setVisibility(4);
            this.LJJIJ.LIZJ();
            this.LJJIJIIJI.setVisibility(4);
            this.LJIIJJI.LIZ(1);
            return;
        }
        ((View)this.LIZJ).setVisibility(4);
        this.LJJIJIIJIL.setBackground(0cB.LIZJ(2131234599));
        this.LJJIJIL.setBackground(0cB.LIZJ(2131234559));
        this.LJJIIZ.setVisibility(0);
        this.LJJIJ.setVisibility(0);
        this.LJJIJ.LIZIZ();
        if (!this.LJJJLL) {
            final ImageModel lizj = this.LJIIJJI.LIZJ();
            if (LiveImageLoaderModuleSetting.useImageModule()) {
                final G18 liz2 = 0cp.LIZ();
                liz2.LIZ((List)lizj.getUrls());
                liz2.LIZ(0.74698794f);
                liz2.LIZ((View)this.LJJIIZ);
                final G18 liz3 = 0cp.LIZ();
                liz3.LIZ((List)lizj.getUrls());
                liz3.LIZ(this.LJJIJIIJI.getWidth(), this.LJJIJIIJI.getHeight());
                liz3.LIZIZ(2131234398);
                liz3.LIZ((View)this.LJJIJIIJI);
            }
            else {
                0ch.LIZ(this.LJJIIZ, lizj, (Qys)new HZ0(5, 0.74698794f));
                final ImageView ljjijiiji = this.LJJIJIIJI;
                HFv.LIZ(ljjijiiji, lizj, ljjijiiji.getWidth(), this.LJJIJIIJI.getHeight(), 2131234398);
            }
            this.LJJJLL = true;
        }
        this.LJJIJIIJI.setVisibility(0);
        this.LJIIJJI.LIZ(2);
    }
    
    private void LIZIZ(final int n) {
        if (this.LJJJJJL != null && this.LJIILJJIL != null && this.LJJIJIIJI()) {
            final String lj = GTi.LJ(this.LJIILJJIL);
            if (lj.isEmpty()) {
                return;
            }
            final String liz = 0cB.LIZ(n, lj);
            if (liz != null && !liz.isEmpty()) {
                final SpannableString liz2 = this.LIZ(lj, liz);
                this.LIZ((View)this.LJJJJJL, 0);
                this.LJJJJJL.setEllipsize(TextUtils$TruncateAt.END);
                if (this.LJJIFFI != null && this.LJJJJJL.getLayoutParams() instanceof ConstraintLayout.a) {
                    final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.LJJJJJL.getLayoutParams();
                    if (this.LJJIFFI.LIZLLL) {
                        layoutParams.setMarginEnd(0cB.LIZ(48.0f));
                    }
                    else {
                        layoutParams.setMarginEnd(0cB.LIZ(16.0f));
                    }
                    this.LJJJJJL.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                }
                this.LJJJJJL.setText((CharSequence)liz2);
                this.LJJJJJL.setMaxLines(3);
            }
        }
    }
    
    private void LIZIZ(final ViewGroup viewGroup, final boolean b) {
        if (viewGroup.getChildCount() <= 0) {
            return;
        }
        int i = viewGroup.getChildCount() - 1;
        while (i >= 0) {
            final View child = viewGroup.getChildAt(i);
            if (child.getVisibility() == 0) {
                if (b) {
                    child.setBackgroundColor(0cB.LIZIZ(2131100834));
                    return;
                }
                child.setBackgroundColor(0);
            }
            else {
                --i;
            }
        }
    }
    
    private void LIZIZ(final boolean b, final Cert cert) {
        final 0Wg lizj = this.LIZJ;
        if (lizj == null) {
            return;
        }
        lizj.LIZ(b, cert);
    }
    
    private void LJIILIIL() {
        if (this.LJJIJIIJI()) {
            this.LIZ(this.LJJJJLI, 8);
            this.LIZ((View)this.LJ, 0);
            this.LIZ(this.LJJJJZ, 8);
            if (this.LJJIFFI != null && MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportPauseGoLiveInPreviewPanel()) {
                this.LIZ((View)this.LJJJJL, 8);
                this.LIZ((View)this.LJJJJJL, 0);
                if (this.LJIJJLI()) {
                    this.LIZIZ(2131831203);
                }
                else if (this.LJIJJ()) {
                    this.LIZIZ(2131831202);
                }
                else {
                    this.LIZ((View)this.LJJJJJL, 8);
                }
            }
            else {
                this.LIZ((View)this.LJJJJJL, 8);
                if (this.LJIIIZ()) {
                    this.LIZ((View)this.LJJJJL, 0);
                    this.LJIILL();
                }
                else {
                    final 1YG ljjiffi = this.LJJIFFI;
                    if (ljjiffi == null || !ljjiffi.LIZLLL) {
                        this.LIZ((View)this.LJJJJJ, 8);
                    }
                    else {
                        this.LIZ((View)this.LJJJJJ, 0);
                    }
                    this.LIZ((View)this.LJJJJL, 8);
                }
            }
            this.LJJI();
            this.LJJIFFI();
            this.LJIILLIIL();
            this.LJIIZILJ();
            return;
        }
        this.LIZ((View)this.LJJJJJL, 8);
        this.LIZ(this.LJJJJLI, 0);
        this.LIZ(this.LJJJJLL, 8);
        this.LIZ(this.LJJJJZ, 0);
        this.LIZ((View)this.LJJJJL, 0);
        this.LIZ((View)this.LJ, 8);
        this.LJIIZILJ();
        this.LJIILJJIL();
    }
    
    private void LJIILJJIL() {
        final ViewGroup ljjjjj = this.LJJJJJ;
        if (ljjjjj != null) {
            final ViewGroup$LayoutParams layoutParams = ljjjjj.getLayoutParams();
            layoutParams.height = 0cB.LIZ(52.0f);
            this.LJJJJJ.setLayoutParams(layoutParams);
        }
    }
    
    private void LJIILL() {
        final DataChannel ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null && this.LJJJJL != null) {
            final Room room = (Room)ljiiljjil.LIZIZ((Class)G69.class);
            if (room != null && room.getOwner() != null) {
                if (!0W3.LIZ(room.getOwner()).isEmpty()) {
                    this.LJJJJL.setTypeface(7wd.LIZ().LIZ(7wf.LIZ));
                    this.LJJJJL.setTextSize(1, 14.0f);
                    final String liz = 0W3.LIZ(room.getOwner());
                    final String liz2 = 0cB.LIZ(2131831499, liz);
                    if (liz2 != null) {
                        if (!liz2.isEmpty()) {
                            final int index = liz2.indexOf(liz);
                            if (index == -1) {
                                final Fjw liziz = Fjw.LIZIZ();
                                final String liz3 = MultiGuestPreviewFragment.LIZ;
                                final StringBuilder sb = new StringBuilder("updateTitleText error. anchorName=");
                                sb.append(liz);
                                sb.append(" titleText= ");
                                sb.append(liz2);
                                ((0bf)liziz).LIZIZ(liz3, sb.toString());
                            }
                            final int n = liz.length() + index;
                            final SpannableString text = new SpannableString((CharSequence)liz2);
                            try {
                                0fd.LIZ(this.getContext(), (Spannable)text, index, n, 33, 4, 600);
                            }
                            catch (final Exception ex) {
                                final Fjw liziz2 = Fjw.LIZIZ();
                                final String liz4 = MultiGuestPreviewFragment.LIZ;
                                final StringBuilder sb2 = new StringBuilder("updateTitleText error. start=");
                                sb2.append(index);
                                sb2.append(" end=");
                                sb2.append(n);
                                sb2.append(" string=");
                                sb2.append(text);
                                ((0bf)liziz2).LIZIZ(liz4, sb2.toString());
                            }
                            if (index > 0 && index < liz2.length()) {
                                text.setSpan((Object)new ForegroundColorSpan(this.getResources().getColor(2131100941)), 0, index, 33);
                            }
                            if (n < liz2.length() && n > 0) {
                                text.setSpan((Object)new ForegroundColorSpan(this.getResources().getColor(2131100941)), n, liz2.length(), 33);
                            }
                            if (this.LJJJJL.getLayoutParams() instanceof ConstraintLayout.a) {
                                final ConstraintLayout.a layoutParams = (ConstraintLayout.a)this.LJJJJL.getLayoutParams();
                                final int liz5 = 0cB.LIZ(16.0f);
                                int liz6;
                                if (this.LJJIFFI != null) {
                                    liz6 = 0cB.LIZ(48.0f);
                                }
                                else {
                                    liz6 = liz5;
                                }
                                layoutParams.setMargins(liz5, liz5, liz6, 0);
                                layoutParams.setMarginEnd(liz6);
                                layoutParams.width = -1;
                                this.LJJJJL.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            }
                            this.LJJJJL.setMaxLines(3);
                            this.LJJJJL.setEllipsize(TextUtils$TruncateAt.END);
                            this.LJJJJL.setText((CharSequence)text);
                        }
                    }
                }
            }
        }
    }
    
    private void LJIILLIIL() {
        if (this.LJJIJIIJI()) {
            this.LIZ(this.LJJJJLL, 0);
        }
    }
    
    private void LJIIZILJ() {
        final 1YG ljjiffi = this.LJJIFFI;
        if (ljjiffi != null && ljjiffi.LIZ) {
            this.LIZ((View)this.LJJJJZI, 0);
        }
    }
    
    private void LJIJ() {
        MethodCollector.i(8217);
        final GbZ ljjliiijji = this.LJJLIIIJJI;
        if (ljjliiijji instanceof SurfaceView) {
            final SurfaceView surfaceView = (SurfaceView)ljjliiijji;
            if (surfaceView.getParent() != null && surfaceView.getParent() instanceof ViewGroup) {
                final ViewGroup ljjliiijillizjl = (ViewGroup)surfaceView.getParent();
                this.LJJLIIIJILLIZJL = ljjliiijillizjl;
                this.LJIJJLI = surfaceView.getLayoutParams();
                ljjliiijillizjl.removeView((View)surfaceView);
                this.LIZIZ(ljjliiijillizjl, true);
            }
        }
        MethodCollector.o(8217);
    }
    
    private void LJIJI() {
        MethodCollector.i(8241);
        final GbZ ljjliiijji = this.LJJLIIIJJI;
        if (ljjliiijji instanceof SurfaceView) {
            final SurfaceView surfaceView = (SurfaceView)ljjliiijji;
            if (surfaceView.getParent() != null && surfaceView.getParent() instanceof ViewGroup) {
                final ViewGroup ljjliiijillizjl = (ViewGroup)surfaceView.getParent();
                this.LJJLIIIJILLIZJL = ljjliiijillizjl;
                final 1Uo ljiilliil = this.LJIILLIIL;
                if (ljiilliil != null && ljiilliil.LJJIIZ == null) {
                    this.LJIILLIIL.LJJIIZ = surfaceView.getLayoutParams();
                }
                else if (this.LJIILLIIL == null) {
                    0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "getLinkViewLayoutParams failed for mLinkDataHolder is null");
                }
                this.LJIJJLI = surfaceView.getLayoutParams();
                ljjliiijillizjl.removeView((View)surfaceView);
                this.LIZ(ljjliiijillizjl, true);
            }
        }
        MethodCollector.o(8241);
    }
    
    private boolean LJIJJ() {
        final 1Uo ljiilliil = this.LJIILLIIL;
        return ljiilliil != null && ljiilliil.LJJIFFI == 2;
    }
    
    private boolean LJIJJLI() {
        final 1Uo ljiilliil = this.LJIILLIIL;
        return ljiilliil != null && ljiilliil.LJJIFFI == 3;
    }
    
    private void LJIL() {
        if (0sD.LIZJ.LIZ().LIZLLL() && MultiGuestBeautySetting.enableNewEffectPageContainer()) {
            final FrameLayout ljjijlij = this.LJJIJLIJ;
            if (ljjijlij != null && this.LJJIL != null) {
                this.LIZ((View)ljjijlij, 4);
                this.LIZ((View)this.LJIIIIZZ, 4);
                return;
            }
        }
        this.LIZ((View)this.LJIIIIZZ, 8);
        this.LIZ((View)this.LJJIJLIJ, 8);
    }
    
    private void LJJ() {
        if (0sD.LIZJ.LIZ().LIZLLL() && MultiGuestBeautySetting.enableNewEffectPageContainer()) {
            final FrameLayout ljjijlij = this.LJJIJLIJ;
            if (ljjijlij != null && this.LJJIL != null) {
                this.LIZ((View)ljjijlij, 0);
                this.LIZ(this.LJJIJL, 4);
                final MultiGuestEffectSwitchFragment ljjil = this.LJJIL;
                if (ljjil.isAdded() && ljjil.isViewValid() && 0up.LIZ.LIZIZ(ljjil.LJII)) {
                    final SRo liziz = ljjil.LIZIZ;
                    if (liziz != null && liziz.getVisibility() == 4) {
                        final MultiGuestEffectSwitchFragment.c ljff = ljjil.LJFF;
                        if (ljff != null) {
                            ljff.LIZ();
                        }
                    }
                }
                this.LIZ((View)this.LJIIIIZZ, 0);
                return;
            }
        }
        this.LIZ((View)this.LJIIIIZZ, 8);
        this.LIZ((View)this.LJJIJLIJ, 8);
    }
    
    private void LJJI() {
        final 1YG ljjiffi = this.LJJIFFI;
        if (ljjiffi != null && ljjiffi.LJI) {
            this.LJJJLZIJ.LIZ(FBH.LIZ(1L, TimeUnit.SECONDS).LIZIZ((long)MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime.INSTANCE.getValue()).LIZ(F8U.LIZ(F8V.LIZ)).LIZLLL((2d6)new 1Zu(this)));
        }
    }
    
    private void LJJIFFI() {
        this.LJJII();
        this.LJIL = true;
        final 1so lj = this.LJ;
        if (lj != null) {
            lj.setVisibility(0);
        }
        this.LJJJZ = FBH.LIZ(1L, TimeUnit.SECONDS).LIZIZ((long)(this.LJIIZILJ + 1)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1Zv(this), 1Zw.LIZ);
        if (this.LJJLIIIJ) {
            this.LJJL.postDelayed((Runnable)new 0ve(this), (long)this.LJJLIIIIJ);
        }
    }
    
    private void LJJII() {
        this.LJIIZILJ = 5;
        final int liz = 0yD.LIZ.LIZ("guest_pre_push_time_mills");
        final boolean b = false;
        while (true) {
            Label_0083: {
                if (liz <= 0) {
                    break Label_0083;
                }
                final int ljiizilj = this.LJIIZILJ;
                if (liz >= ljiizilj * 1000) {
                    break Label_0083;
                }
                this.LJJLIIIIJ = ljiizilj * 1000 - liz;
                final int ljjliiiij = this.LJJLIIIIJ;
                boolean ljjliiij = b;
                if (ljjliiiij > 0) {
                    ljjliiij = b;
                    if (ljjliiiij < this.LJIIZILJ * 1000) {
                        ljjliiij = true;
                    }
                }
                this.LJJLIIIJ = ljjliiij;
                return;
            }
            this.LJJLIIIIJ = 0;
            continue;
        }
    }
    
    private boolean LJJIII() {
        return 1NO.LIZ().LIZJ() && this.LJJLIIIJJI != null && !this.LJIIJ() && !this.LJIIIZ();
    }
    
    private String LJJIIJ() {
        final StringBuilder sb = new StringBuilder(" isFromInvite=");
        sb.append(this.LJIIJ());
        sb.append(" isFromPermit");
        sb.append(this.LJIIIZ());
        sb.append(" isGuestOnline");
        sb.append(this.LJJIII());
        return sb.toString();
    }
    
    private void LJJIIJZLJL() {
        this.LJJJLIIL = false;
        this.LIZ(true);
        final 1Uo ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.LIZ = this.LJJJLIIL;
            if (this.LJJIII()) {
                this.LJIILJJIL.LIZJ((Class)2G9.class, (Object)this.LJIILLIIL.LIZ);
            }
            return;
        }
        0ba.LIZ(4, MultiGuestPreviewFragment.LIZ, "mLinkDataHolder == null when switchAudio2Mute");
    }
    
    private void LJJIIZ() {
        this.LJJJLIIL = true;
        this.LIZ(false);
        final 1Uo ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.LIZ = this.LJJJLIIL;
        }
        if (this.LJJIII()) {
            this.LJIILJJIL.LIZJ((Class)2G9.class, (Object)this.LJIILLIIL.LIZ);
        }
    }
    
    private void LJJIIZI() {
        final 1Uo ljiilliil = this.LJIILLIIL;
        if (ljiilliil == null) {
            return;
        }
        ljiilliil.LJJI = 1;
        this.LJIILLIIL.LIZIZ = true;
        final DataChannel ljiiljjil = this.LJIILJJIL;
        if (ljiiljjil != null) {
            ljiiljjil.LIZJ((Class)2GA.class, (Object)true);
        }
        this.LJJ();
        this.LJIILLIIL.LIZ(GCe.LIZ().LIZIZ(), false);
        final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-1231");
        with.usage("");
        with.tag("link mic camera active");
        with.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy() });
        this.LIZ((Cert)with.build());
        if (0sD.LIZJ.LIZ().LIZLLL() && this.LJIILJJIL != null && 0jz.LIZJ().getLinkMicState() == 5 && !this.LJJIJIIJI() && this.LJIILLIIL.LJJIIZI != null) {
            0uW.LIZJ.LIZ(this.LJIILLIIL.LJJIIZI, "guest_icon", "enhance", 1NO.LIZ().LIZJ, 1NO.LIZ().LIZIZ, this.LJIILLIIL.LIZ ^ true, this.LJIILLIIL.LIZIZ ^ true, this.LJIILLIIL.LIZLLL);
        }
    }
    
    private void LJJIJ() {
        if (GCe.LIZ().LJJI >= 0sD.LIZJ.LIZ().LJIIIZ() && !this.LJI()) {
            Hf4.LIZ(0cB.LJ(), 2131830587);
            this.LJIIJJI();
            final WeakReference<1kK> ljij = this.LJIJ;
            if (ljij != null && ljij.get() != null) {
                this.LJIJ.get().LIZ("leave_source_reply_pos_limit", false, 10012);
            }
            return;
        }
        if (1NN.LLFF.LIZ().LIZ() != 2) {
            Hf4.LIZ(0cB.LJ(), 2131830549);
            this.LJIIJJI();
            return;
        }
        final 1Uo ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            if ((ljiilliil.LJJIFFI == 0 || this.LJIILLIIL.LJJIFFI == 2 || this.LJIILLIIL.LJJIFFI == -1) && this.LJIILLIIL.LJJI == 1) {
                this.LJ();
                Hf4.LIZ(0cB.LJ(), 2131831268);
            }
        }
        else {
            0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "mLinkDataHolder is null in replyGoLiveInPreviewAhead()");
        }
        ((0bf)Fjw.LIZIZ()).LIZIZ("invite_issue_check", "replyAnchor");
        this.LJII();
        GCe.LIZ().LIZ(true);
        final 1Uo ljiilliil2 = this.LJIILLIIL;
        if (ljiilliil2 != null) {
            ljiilliil2.LIZIZ = (this.LJIIJJI.LIZ() != 2);
            this.LJIILLIIL.LJIJJLI = true;
        }
        else {
            0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "mLinkDataHolder is null in replyGoLiveInPreviewAhead()");
        }
        this.LJFF = true;
        if (0sD.LIZJ.LIZ().LIZLLL() && MultiGuestBeautySetting.enableGuestUseComposerManagerB()) {
            0jR.LIZ(IEffectService.class).composerManagerB().LIZ("guest_linkmic", false);
        }
        if (this.LJIIIZ()) {
            final 1YG ljjiffi = this.LJJIFFI;
            if (ljjiffi != null && ljjiffi.LIZIZ()) {
                this.LJIILJJIL.LIZJ((Class)2Ft.class);
            }
            else {
                this.LJIILJJIL.LIZJ((Class)2Fj.class);
            }
        }
        else if (this.LJIIJ()) {
            final 1YG ljjiffi2 = this.LJJIFFI;
            if (ljjiffi2 != null && ljjiffi2.LIZ() && this.LJJIFFI.LJFF != null) {
                this.LJJIFFI.LJFF.LIZ((QgG<2P9>)new 1mW(this));
            }
            else {
                this.LJIILJJIL.LIZJ((Class)2Fw.class);
            }
        }
        this.LJIIL();
    }
    
    private boolean LJJIJIIJI() {
        return this.LJJIIJ == 0rb.a.GO_LIVE;
    }
    
    public final void LIZ() {
        this.LIZ(new ArrayList<LiveEffect>());
    }
    
    public final void LIZ(final int liziz) {
        final 0qb.a ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZIZ(liziz);
        }
        this.LIZJ.LIZ(liziz);
        1NO.LIZ().LIZIZ = liziz;
        this.LIZIZ("select_pattern");
    }
    
    public final void LIZ(final LinkInRoomReplyResponse linkInRoomReplyResponse, final boolean b) {
    }
    
    public final void LIZ(final LiveEffect liveEffect) {
        if (this.LJIIJJI == null || !TextUtils.equals((CharSequence)liveEffect.realId, (CharSequence)this.LJIIJJI.LIZIZ())) {
            this.LJIIJJI.LIZ(liveEffect.realId);
            0jR.LIZ(IEffectService.class).composerManager().LIZ(0gZ.LIZJ);
            if (TextUtils.equals((CharSequence)liveEffect.realId, (CharSequence)"")) {
                this.LJIIJJI.LIZ((LiveEffect)null);
            }
            else {
                0jR.LIZ(IEffectService.class).composerManager().LIZ(0gZ.LIZJ, liveEffect);
                this.LJIIJJI.LIZ(liveEffect);
            }
        }
        this.LIZIZ("select_pattern");
        final 0WH 0wh = 1jw.LIZ.LIZIZ("MULTI_GUEST_REVIEW_MANAGER");
        if (0wh != null) {
            if (liveEffect.getResourceId().equals("")) {
                0wh.LIZ();
                return;
            }
            0wh.LIZIZ(liveEffect);
        }
    }
    
    public final void LIZ(final EffectChannelResponse effectChannelResponse) {
        0jR.LIZ(IEffectService.class).composerManager().LIZ(effectChannelResponse);
        ((FIw)FBF.LIZIZ((Iterable)((EffectChannelResponseTemplate)effectChannelResponse).getAllCategoryEffects()).LJ(1Zx.LIZ).LJIIJ().LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((FAN)FFb.LIZ((View)this.LJJJJ))).LIZ((2d6)new 1Zy(this), 1Zz.LIZ);
    }
    
    public final void LIZ(final String s) {
    }
    
    public final void LIZ(final String s, final LiveEffect liveEffect, final int n) {
        if (0gZ.LIZJ.equals(s)) {
            this.LJIILIIL.LIZ(s, liveEffect, n);
        }
    }
    
    public final void LIZ(final Throwable t) {
    }
    
    public final void LIZ(final List<LiveEffect> list) {
        if (list.isEmpty()) {
            list.add(new LiveEffect());
            return;
        }
        list.add(0, new LiveEffect());
        this.LJIILIIL = new 1TV(this.getContext(), list, (1TV.a)new 1TV.a() {
            static {
                Covode.recordClassIndex(9640);
            }
            
            @Override
            public final void LIZ(final LiveEffect liveEffect) {
                if (MultiGuestPreviewFragment.this.LJIIL == null) {
                    return;
                }
                if (MultiGuestPreviewFragment.this.LJIILIIL == null) {
                    return;
                }
                if (MultiGuestPreviewFragment.this.LJIIL.LIZ(liveEffect)) {
                    MultiGuestPreviewFragment.this.LJIILIIL.LIZ(0gZ.LIZJ, liveEffect, 2);
                    return;
                }
                MultiGuestPreviewFragment.this.LJIIL.LIZ(0gZ.LIZJ, liveEffect, (0gk.a)5ap.LIZ((Object)MultiGuestPreviewFragment.this.LJJIIJZLJL));
            }
            
            @Override
            public final void LIZIZ(final LiveEffect liveEffect) {
                MultiGuestPreviewFragment.this.LIZ(liveEffect);
            }
            
            @Override
            public final boolean LIZJ(final LiveEffect liveEffect) {
                if (liveEffect != null && liveEffect.realId.equals("")) {
                    return true;
                }
                try {
                    return MultiGuestPreviewFragment.this.LJIIL.LIZ(liveEffect);
                }
                catch (final Exception ex) {
                    return false;
                }
            }
        }, false);
        final RecyclerView ljjjj = this.LJJJJ;
        if (ljjjj != null) {
            this.getContext();
            ljjjj.setLayoutManager((RecyclerView.i)new LinearLayoutManager(0, false));
            this.LJJJJ.setAdapter((RecyclerView.a)this.LJIILIIL);
        }
    }
    
    public final LiveDialogFragment LIZIZ() {
        return this.LJIIJ;
    }
    
    public final void LIZIZ(final String s) {
        0xj.LIZ(s, this.LJJIII);
    }
    
    public final void LIZIZ(final Throwable t) {
    }
    
    public final void LIZJ() {
        MethodCollector.i(8214);
        final SurfaceView surfaceView = (SurfaceView)this.LIZJ;
        if (surfaceView.getParent() != null) {
            0sM.LIZ((View)surfaceView);
        }
        final 0Wg lizj = this.LIZJ;
        if (lizj != null) {
            final FrameLayout lji = this.LJI;
            if (lji != null) {
                lji.addView((View)lizj);
            }
        }
        MethodCollector.o(8214);
    }
    
    public final void LIZLLL() {
        this.LJJII = "anchor_permit";
        this.LJJIIJ = 0rb.a.GO_LIVE;
        final 1Uo ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null) {
            ljiilliil.LJIJJ = false;
        }
        else {
            0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "setUseExistedSurfaceView(false) failed for mLinkDataHolder is null");
        }
        this.LJIILIIL();
        this.LJJLIIIJL = true;
    }
    
    public final void LJ() {
        final 1Uo ljiilliil = this.LJIILLIIL;
        if (ljiilliil == null) {
            return;
        }
        this.LJJIII = "audio";
        ljiilliil.LJJI = 2;
        this.LJIILLIIL.LIZIZ = false;
        this.LJIILLIIL.LIZ(GCe.LIZ().LIZIZ(), true);
        this.LJIIIZ = false;
        final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-1229");
        with.usage("");
        with.tag("link mic camera inactive");
        with.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy() });
        this.LIZ(false, (Cert)with.build());
        this.LJIL();
        this.LIZ(this.LJJIJL, 4);
        this.LIZ((View)this.LJJJIL, 8);
        this.LIZ((View)this.LJJJJ, 8);
        this.LIZ((View)this.LJJJJI, 0);
        this.LIZ(this.LJJJJIZL, 4);
        if (this.LJJJJI != null && this.LJJIFFI != null && MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportPauseGoLiveInPreviewPanel()) {
            this.LJJJJI.setText(2131831197);
        }
        if (this.LJJIII()) {
            this.LJIILJJIL.LIZJ((Class)2GA.class, (Object)this.LJIIIZ);
        }
        if (0sD.LIZJ.LIZ().LIZLLL() && this.LJIILJJIL != null && 0jz.LIZJ().getLinkMicState() == 5 && !this.LJJIJIIJI() && this.LJIILLIIL.LJJIIZI != null) {
            0uW.LIZJ.LIZ(this.LJIILLIIL.LJJIIZI, "guest_icon", "", 1NO.LIZ().LIZJ, 1NO.LIZ().LIZIZ, this.LJIILLIIL.LIZ ^ true, this.LJIILLIIL.LIZIZ ^ true, this.LJIILLIIL.LIZLLL);
        }
    }
    
    public final void LJFF() {
        if (this.LJJIIJ != 0rb.a.GO_LIVE) {
            return;
        }
        this.LJJIJ();
    }
    
    public final boolean LJI() {
        final 1XE ljjli = this.LJJLI;
        if (ljjli == null) {
            return false;
        }
        final Iterator<LinkListUser> iterator = ljjli.LJFF().LIZJ().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().LIZ.getId() == Fk2.LIZ().LIZIZ().LIZ().getId()) {
                return true;
            }
        }
        return false;
    }
    
    public final void LJII() {
        if (this.LJJLIIIJJI != null) {
            return;
        }
        final 1Uo ljiilliil = this.LJIILLIIL;
        if (ljiilliil != null && ljiilliil.LJIL != null) {
            return;
        }
        final GbZ gbZ = (GbZ)this.LIZJ;
        final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-1228");
        with.usage("");
        with.tag("link mic apply");
        with.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy() });
        gbZ.LIZLLL((Cert)with.build());
    }
    
    public final void LJIIIIZZ() {
        if (this.LJJIJIIJI()) {
            return;
        }
        this.LJJI = "is_cancel";
        this.LJJ = "return";
        final DataChannel liz = HAM.LIZ((Fragment)this);
        if (liz != null) {
            this.LJIJI = true;
            final 0ux guest_USER_INFO = 0ux.GUEST_USER_INFO;
            guest_USER_INFO.setGoNextPage(false);
            liz.LIZIZ((Class)2Fm.class, (Object)guest_USER_INFO);
        }
    }
    
    public final boolean LJIIIZ() {
        final String ljjii = this.LJJII;
        return ljjii != null && ljjii.equals("anchor_permit");
    }
    
    public final boolean LJIIJ() {
        final String ljjii = this.LJJII;
        return ljjii != null && ljjii.equals("anchor_invite");
    }
    
    public final void LJIIJJI() {
        final LiveDialogFragment ljiij = this.LJIIJ;
        if (ljiij != null) {
            ((DialogFragment)ljiij).dismiss();
        }
    }
    
    public final void LJIIL() {
        if (!this.LJJJLZIJ.isDisposed()) {
            this.LJJJLZIJ.dispose();
        }
        GTi.LIZ(this.LJJJZ);
    }
    
    public void onClick(View ljjji) {
        final int id = ljjji.getId();
        if (id != 2131365790) {
            if (this.LJJIJIIJI()) {
                final 1YG ljjiffi = this.LJJIFFI;
                if (ljjiffi != null && ljjiffi.LJI && (!this.LJIJJ() || id == 2131367337)) {
                    GTi.LIZ(this.LJJJZ);
                    this.LJ.setText(2131831243);
                    final String lj = GTi.LJ(this.LJIILJJIL);
                    if (!lj.isEmpty()) {
                        final String liz = 0cB.LIZ(2131831202, lj);
                        if (liz != null && !liz.isEmpty()) {
                            this.LJJJJJL.setText((CharSequence)this.LIZ(lj, liz));
                        }
                    }
                }
            }
            if (id == 2131367309) {
                this.LJIIIIZZ();
                return;
            }
        }
        if (id == 2131367337) {
            final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
            if (room != null && room.getOwner() != null) {
                final 1Uo ljiilliil = this.LJIILLIIL;
                String s;
                if (ljiilliil != null && !ljiilliil.LIZIZ) {
                    s = "voice";
                }
                else {
                    s = "video";
                }
                0xj.LIZ(s, "click", "cancel");
                final Ht9 ht9 = new Ht9(this.getContext());
                ht9.LIZ(2131831192);
                ht9.LIZIZ(2131831190);
                ht9.LIZIZ(2131831189, 0vR.LIZ, false);
                ht9.LIZ(2131831191, (DialogInterface$OnClickListener)new 0vS(this, s), false);
                this.LJIILL = ht9.LIZ();
                0xj.LIZ(s, "show", "0");
                if (0sD.LIZJ.LIZ().LIZLLL()) {
                    0tA.LIZ((Dialog)this.LJIILL, 5, true, true, 56);
                }
                final HtA ljiill = this.LJIILL;
                ((0eC)ljiill).show();
                KN6.LIZ.LIZ((Dialog)ljiill);
            }
            this.LIZIZ("cancel_link");
            return;
        }
        if (id == 2131363259) {
            if (this.LJIIIZ) {
                final 1Uo ljiilliil2 = this.LJIILLIIL;
                if (ljiilliil2 == null) {
                    0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "camera switch failed for mLinkDataHolder is null");
                    return;
                }
                this.LJIILLIIL.LIZLLL = (ljiilliil2.LIZLLL ^ true);
                final 0Wg lizj = this.LIZJ;
                if (lizj != null) {
                    final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-1224");
                    with.usage("");
                    with.tag("link mic switch camera");
                    with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy(), PrivacyPolicyStore.getVideoPrivacyPolicy() });
                    lizj.LIZ((Cert)with.build());
                }
            }
            return;
        }
        if (id == 2131362728) {
            this.LJJIIZI();
            this.LIZIZ("switch_tab");
            return;
        }
        if (id == 2131371771) {
            this.LJIIIZ = true;
            this.LJJIII = "props";
            final PrivacyCert$Builder with2 = PrivacyCert$Builder.with("bpea-1230");
            with2.usage("");
            with2.tag("link mic camera active");
            with2.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy() });
            this.LIZ(true, (Cert)with2.build());
            if (!MultiGuestBeautySetting.enableNewEffectPageContainer()) {
                ljjji = this.LJJJI;
                if (ljjji != null) {
                    final ConstraintLayout.a layoutParams = (ConstraintLayout.a)ljjji.getLayoutParams();
                    layoutParams.bottomToBottom = 2131371771;
                    layoutParams.rightToRight = 2131371771;
                    layoutParams.leftToLeft = 2131371771;
                    this.LJJJI.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                }
                this.LIZ((View)this.LJJJIL, 8);
                this.LIZ((View)this.LJJJJ, 0);
                this.LIZ((View)this.LJJJJI, 8);
                this.LIZ(this.LJJIJL, 0);
                this.LIZ(this.LJJJJIZL, 0);
                final TextView ljjiz = this.LJJIZ;
                if (ljjiz != null) {
                    ljjiz.setTextColor(-2130706433);
                }
                final TextView ljjj = this.LJJJ;
                if (ljjj != null) {
                    ljjj.setTextColor(-1);
                }
            }
            if (0sD.LIZJ.LIZ().LIZLLL() && this.LJIILJJIL != null && 0jz.LIZJ().getLinkMicState() == 5 && !this.LJJIJIIJI() && this.LJIILLIIL.LJJIIZI != null) {
                0uW.LIZJ.LIZ(this.LJIILLIIL.LJJIIZI, "guest_icon", "props", 1NO.LIZ().LIZJ, 1NO.LIZ().LIZIZ, this.LJIILLIIL.LIZ ^ true, this.LJIILLIIL.LIZIZ ^ true, this.LJIILLIIL.LIZLLL);
            }
            this.LIZIZ("switch_tab");
            return;
        }
        if (id == 2131374107) {
            final boolean ljiiiz = this.LJIIIZ ^ true;
            this.LJIIIZ = ljiiiz;
            while (true) {
                Label_0875: {
                    if (!ljiiiz) {
                        this.LJ();
                        break Label_0875;
                    }
                    final 1Uo ljiilliil3 = this.LJIILLIIL;
                    if (ljiilliil3 == null || ljiilliil3.LJJIFFI != 2) {
                        if (this.LJIILLIIL == null) {
                            0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "getGuestLinkMicPermission() failed for mLinkDataHolder is null");
                        }
                        this.LJJIIZI();
                        break Label_0875;
                    }
                    Hf4.LIZ(0cB.LJ(), 2131831268);
                    this.LJIIIZ ^= true;
                    this.LIZIZ("switch_camera");
                    return;
                }
                0uW.LIZ(0uW.LIZJ, this.LJIIIZ, "preview_page");
                continue;
            }
        }
        if (id == 2131365790) {
            this.LJJI = "connection";
            this.LJJ = "confirm_icon";
            this.LJFF();
            this.LIZIZ("go_live");
            return;
        }
        if (id == 2131367014) {
            final String liz2 = MultiGuestPreviewFragment.LIZ;
            final StringBuilder sb = new StringBuilder("onClickMicBtn#isAudioSwitchOn ");
            sb.append(this.LJJJLIIL);
            sb.append(" to ");
            sb.append(this.LJJJLIIL ^ true);
            sb.append(this.LJJIIJ());
            0ba.LIZ(4, liz2, sb.toString());
            if (this.LJJJLIIL) {
                this.LJJIIJZLJL();
            }
            else {
                this.LJJIIZ();
            }
            if (this.LJIILLIIL != null) {
                0uW.LIZJ.LIZ(this.LJIILLIIL.LJJIIZI, this.LJIILLIIL.LJIJI, true ^ this.LJIILLIIL.LIZ, "preview_page");
            }
            this.LIZIZ("switch_mute_setting");
        }
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View liz = 0II.LIZ(layoutInflater, 2131562014, viewGroup, false);
        this.LIZIZ = (ViewGroup)liz.findViewById(2131369613);
        this.LJI = (FrameLayout)liz.findViewById(2131369603);
        this.LIZLLL = liz.findViewById(2131369599);
        this.LJJIIZ = (1si)liz.findViewById(2131362577);
        this.LJJIIZI = (1BF)liz.findViewById(2131362507);
        this.LJJIJ = (2Bo)liz.findViewById(2131362508);
        this.LJJIJIIJI = (ImageView)liz.findViewById(2131362570);
        this.LJJIJIIJIL = liz.findViewById(2131374107);
        this.LJJIJIL = liz.findViewById(2131363259);
        this.LJJIJL = liz.findViewById(2131369074);
        this.LJJIJLIJ = (FrameLayout)liz.findViewById(2131364752);
        this.LJJIZ = (TextView)liz.findViewById(2131362728);
        this.LJJJ = (TextView)liz.findViewById(2131371771);
        this.LJJJI = liz.findViewById(2131366413);
        this.LJJJIL = (HwV)liz.findViewById(2131362727);
        this.LJJJJ = (RecyclerView)liz.findViewById(2131371760);
        this.LJJJJI = (1ib)liz.findViewById(2131362509);
        this.LJ = (1so)liz.findViewById(2131365790);
        this.LJJJJIZL = liz.findViewById(2131374123);
        this.LJJJJJ = (ViewGroup)liz.findViewById(2131367483);
        this.LJJJJL = (1ib)liz.findViewById(2131373652);
        this.LJJJJLI = liz.findViewById(2131367309);
        this.LJJJJLL = liz.findViewById(2131367337);
        this.LJJJJZ = liz.findViewById(2131364440);
        this.LJJJJJL = (1ib)liz.findViewById(2131373658);
        this.LJJJJZI = (ImageView)liz.findViewById(2131367014);
        this.LJII = (SRo)liz.findViewById(2131371451);
        this.LJIIIIZZ = (ConstraintLayout)liz.findViewById(2131370979);
        0cJ.LIZ((View)this.LJI, 0cB.LIZ(8.0f));
        0cJ.LIZ(this.LIZLLL, 0cB.LIZ(8.0f));
        0cJ.LIZ((View)this.LJJIIZ, 0cB.LIZ(8.0f));
        0cJ.LIZ(this.LJJJJIZL, 0cB.LIZ(8.0f));
        if (this.LJIJ.get() != null) {
            this.LJJLIIIJJI = this.LJIJ.get().LJII();
        }
        final 1Uo ljiilliil = this.LJIILLIIL;
        0Wg lizj;
        if (ljiilliil == null) {
            this.LJIIJJI();
            final Fjw liziz = Fjw.LIZIZ();
            final String liz2 = MultiGuestPreviewFragment.LIZ;
            final StringBuilder sb = new StringBuilder("createAndAddSurfaceView fail. LinkInjector size is:");
            sb.append(1jw.LIZ.LIZ().size());
            ((0bf)liziz).LIZIZ(liz2, sb.toString());
            lizj = null;
        }
        else {
            if (this.LJJLIIIJJI != null) {
                if (this.LJJIII()) {
                    if (0sD.LIZJ.LIZ().LIZLLL()) {
                        this.LJIJI();
                    }
                    else {
                        this.LJIJ();
                    }
                }
                this.LJIILLIIL.LJIJJ = true;
                this.LIZJ = (0Wg)this.LJJLIIIJJI;
            }
            else {
                final GbZ linkVideoView = 0jR.LIZ(IBroadcastService.class).createLinkVideoView(this.getContext(), 0ql.LIZ(ljiilliil, true, false, 12), 1jw.LIZ.LIZIZ("MULTI_GUEST_REVIEW_MANAGER"), this.LJIILJJIL);
                this.LJIILLIIL.LJIJJ = false;
                this.LJIILLIIL.LJIL = linkVideoView;
                this.LIZJ = (0Wg)linkVideoView;
            }
            final GbZ ljjliiijji = this.LJJLIIIJJI;
            if (ljjliiijji instanceof SurfaceView && ((SurfaceView)ljjliiijji).getParent() != null) {
                if (0sD.LIZJ.LIZ().LIZLLL()) {
                    this.LJIJI();
                }
                else {
                    this.LJIJ();
                }
            }
            if (0sD.LIZJ.LIZ().LIZLLL()) {
                final FrameLayout lji = this.LJI;
                if (lji != null) {
                    lji.post((Runnable)new 0vd(this));
                }
            }
            else {
                this.LIZJ();
            }
            lizj = this.LIZJ;
        }
        while (true) {
            Label_0795: {
                if (!0sD.LIZJ.LIZ().LIZLLL() || this.LJJIL != null || !MultiGuestBeautySetting.enableNewEffectPageContainer()) {
                    break Label_0795;
                }
                final FrameLayout ljjijlij = this.LJJIJLIJ;
                if (ljjijlij == null) {
                    break Label_0795;
                }
                this.LIZ((View)ljjijlij, 0);
                this.LIZ(this.LJJIJL, 4);
                this.LJJIL = MultiGuestEffectSwitchFragment.LIZ(lizj, this.LJJLIIIJLLLLLLLZ, false, this.LJJLIIJ);
                final 0AO liz3 = this.getChildFragmentManager().LIZ();
                liz3.LIZIZ(2131364752, this.LJJIL, null);
                liz3.LJ();
                ((0xQ<MultiGuestPreviewFragment>)this.LJIIJJI).LIZ(this);
                this.LIZIZ.setOnClickListener((View$OnClickListener)this);
                this.LJJJJLI.setOnClickListener((View$OnClickListener)this);
                this.LJJJJLL.setOnClickListener((View$OnClickListener)this);
                this.LJ.setOnClickListener((View$OnClickListener)this);
                this.LJJIJIIJIL.setOnClickListener((View$OnClickListener)this);
                this.LJJIJIL.setOnClickListener((View$OnClickListener)this);
                this.LJJIZ.setOnClickListener((View$OnClickListener)this);
                this.LJJJ.setOnClickListener((View$OnClickListener)this);
                this.LJJJIL.setSeekbarListener((SeekBar$OnSeekBarChangeListener)this);
                this.LJJJJZI.setOnClickListener((View$OnClickListener)this);
                this.LJJIIZI.setVisibility(8);
                this.LJJIJ.LIZ(2Bo.LIZ("tiktok_live_interaction_resource", "audio_interact_effect.webp"));
                this.LJIIL = 0jR.LIZ(IEffectService.class).stickerPresenter();
                this.LJIIJJI.LIZ(1NO.LIZ().LIZLLL);
                this.LJJJLL = false;
                final DataChannel ljiiljjil = this.LJIILJJIL;
                ljiiljjil.LIZ((0CH)this, (Class)2Fz.class, (SRS)new 1mU(this));
                ljiiljjil.LIZ((0CH)this, (Class)2G0.class, (SRS)new 1mV(this));
                return liz;
            }
            this.LIZ(this.LJJIJL, 0);
            this.LIZ((View)this.LJII, 8);
            this.LIZ((View)this.LJJIJLIJ, 8);
            continue;
        }
    }
    
    public void onDestroy() {
        MethodCollector.i(8298);
        super.onDestroy();
        this.LJJIIZI.LJII();
        this.LJJIJ.LIZJ();
        this.LJIIL.LIZ();
        this.LJJIJLIJ = null;
        this.LJJIL = null;
        this.LJJJLZIJ.LIZ();
        this.LJJL.removeCallbacksAndMessages((Object)null);
        this.LJIIL();
        this.LJIILJJIL.LIZJ((Class)2Fk.class, (Object)0rb.a.SEND_REQUEST);
        if (1NO.LIZ().LIZJ != null) {
            this.LJIILJJIL.LIZJ((Class)Gte.class, (Object)new 0Wp("liveinteract", 1NO.LIZ().LIZJ, ""));
        }
        if (this.LJIILLIIL != null) {
            if (this.LJJIII() || this.LJIILLIIL.LJIJJLI) {
                ((View)this.LIZJ).setVisibility(0);
            }
            else {
                this.LJIILLIIL.LJIL = null;
            }
        }
        Label_0227: {
            if (0sD.LIZJ.LIZ().LIZLLL()) {
                if (!this.LJIJJ || !this.LJJIJIIJI()) {
                    final GbZ ljjliiijji = this.LJJLIIIJJI;
                    if (ljjliiijji instanceof SurfaceView) {
                        final SurfaceView surfaceView = (SurfaceView)ljjliiijji;
                        final ViewGroup ljjliiijillizjl = this.LJJLIIIJILLIZJL;
                        if (ljjliiijillizjl == null || ljjliiijillizjl.getChildCount() == 0) {
                            final DataChannel ljiiljjil = this.LJIILJJIL;
                            if (ljiiljjil != null) {
                                ljiiljjil.LIZJ((Class)2G1.class);
                            }
                            break Label_0227;
                        }
                        else {
                            final FrameLayout lji = this.LJI;
                            if (lji != null) {
                                lji.removeView((View)surfaceView);
                            }
                            if (surfaceView.getParent() == null && surfaceView.getTag() instanceof FrameLayout$LayoutParams) {
                                surfaceView.setLayoutParams((ViewGroup$LayoutParams)surfaceView.getTag());
                                this.LJJLIIIJILLIZJL.addView((View)surfaceView, 1);
                                this.LIZ(this.LJJLIIIJILLIZJL, false);
                            }
                            final 1Uo ljiilliil = this.LJIILLIIL;
                            if (ljiilliil != null) {
                                ljiilliil.LJJIIZ = null;
                            }
                            else {
                                0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "setLinkViewLayoutParams(null) failed for mLinkDataHolder is null");
                            }
                            this.LJJLIIIJILLIZJL = null;
                        }
                    }
                    if (this.LJIIIZ()) {
                        final 1YG ljjiffi = this.LJJIFFI;
                        if (ljjiffi != null && ljjiffi.LIZIZ()) {
                            break Label_0227;
                        }
                    }
                    final DataChannel ljiiljjil2 = this.LJIILJJIL;
                    if (ljiiljjil2 != null) {
                        ljiiljjil2.LIZJ((Class)2G1.class);
                    }
                }
            }
            else {
                final GbZ ljjliiijji2 = this.LJJLIIIJJI;
                if (ljjliiijji2 instanceof SurfaceView) {
                    final SurfaceView surfaceView2 = (SurfaceView)ljjliiijji2;
                    final ViewGroup ljjliiijillizjl2 = this.LJJLIIIJILLIZJL;
                    if (ljjliiijillizjl2 != null) {
                        if (ljjliiijillizjl2.getChildCount() != 0) {
                            final FrameLayout lji2 = this.LJI;
                            if (lji2 != null) {
                                lji2.removeView((View)surfaceView2);
                            }
                            if (surfaceView2.getParent() == null) {
                                surfaceView2.setLayoutParams(this.LJIJJLI);
                                this.LJJLIIIJILLIZJL.addView((View)surfaceView2, 1);
                                this.LIZIZ(this.LJJLIIIJILLIZJL, false);
                            }
                            this.LJJLIIIJILLIZJL = null;
                        }
                    }
                }
            }
        }
        this.LJIIIZ = (1NO.LIZ().LJI == 1);
        this.LJJLIIIJJIZ = false;
        this.LJIL = false;
        this.LJJLIIIJL = false;
        if (0sD.LIZJ.LIZ().LIZLLL() && this.LJIILJJIL != null && (0jz.LIZJ().getLinkMicState() == 5 || this.LJJIJIIJI()) && this.LJIILLIIL != null) {
            0uW.LIZJ.LIZ(this.LJIILLIIL.LJJIIZI, 1NO.LIZ().LIZJ, 1NO.LIZ().LIZIZ, this.LJIILLIIL.LIZ ^ true, this.LJIILLIIL.LIZIZ ^ true, this.LJIILLIIL.LIZLLL, this.LJJ, this.LJJI, System.currentTimeMillis() - this.LJJLIIIJLJLI);
        }
        MethodCollector.o(8298);
    }
    
    public void onPause() {
        super.onPause();
        if (this.LJJIII()) {
            return;
        }
        if (!this.LJIJI && !this.LJJLIIIJL) {
            final 1Uo ljiilliil = this.LJIILLIIL;
            if (ljiilliil != null && !ljiilliil.LJJ) {
                final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-1226");
                with.usage("");
                with.tag("link mic camera inactive");
                with.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy() });
                this.LIZIZ(false, (Cert)with.build());
                this.LJJLIIIJJIZ = true;
            }
        }
    }
    
    public void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        if (n >= 0 && n <= seekBar.getMax() && b) {
            this.LIZ(n);
        }
    }
    
    public void onResume() {
        super.onResume();
        this.LJIJI = false;
        1ml.LIZ(1ml.LJIIIIZZ, false, "camera_preview_view_show", new JSONObject());
        if (this.LJIILLIIL != null) {
            if (this.LJJIII()) {
                final String liz = MultiGuestPreviewFragment.LIZ;
                final StringBuilder sb = new StringBuilder("setUpAudioStateWhenOnResume enable=");
                sb.append(this.LJIILLIIL.LIZ);
                sb.append(" ");
                sb.append(this.LJJIIJ());
                0ba.LIZ(4, liz, sb.toString());
                if (this.LJIILLIIL.LIZ) {
                    this.LJJIIZ();
                }
                else {
                    this.LJJIIJZLJL();
                }
            }
            else {
                this.LIZ((this.LJJJLIIL = this.LJIILLIIL.LIZ) ^ true);
                ((GbZ)this.LIZJ).LIZJ(true, (Cert)TokenCert.with("bpea-setUpAudioStateWhenOnResume"));
            }
        }
        this.LJIJI = false;
        final 1Uo ljiilliil = this.LJIILLIIL;
        boolean b;
        if (ljiilliil != null && ljiilliil.LJJI == 2) {
            b = false;
        }
        else {
            if (this.LJIILLIIL == null) {
                0ba.LIZ(5, MultiGuestPreviewFragment.LIZ, "getPreviewSettingState() failed for mLinkDataHolder is null");
            }
            b = true;
        }
        final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-1225");
        with.usage("");
        with.tag("link mic camera active");
        with.policies(new 6E8[] { PrivacyPolicyStore.getVideoPrivacyPolicy(), PrivacyPolicyStore.getAudioPrivacyPolicy() });
        this.LIZIZ(b, (Cert)with.build());
        if (1NO.LIZ().LIZJ() && this.LJJLIIIJJIZ && this.LJIL) {
            this.LJJLIIIJJIZ = false;
            this.LJIL = false;
            this.LJIIL();
            this.LJFF();
        }
    }
    
    public void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onStopTrackingTouch(final SeekBar seekBar) {
    }
    
    public void onViewCreated(final View view, final Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LJIIL != null && !MultiGuestBeautySetting.enableNewEffectPageContainer()) {
            this.LJIIL.LIZ(0gZ.LIZJ, (0gk.b)this);
        }
        this.LJIILIIL();
        final 1Uo ljiilliil = this.LJIILLIIL;
        Label_0109: {
            if (ljiilliil != null) {
                ljiilliil.LJFF("apply");
                int ljji = this.LJIILLIIL.LJJI;
                if (1NO.LIZ().LIZJ()) {
                    if (this.LJIILLIIL.LIZIZ) {
                        ljji = 1;
                    }
                    else {
                        ljji = 2;
                    }
                }
                if (this.LJIILLIIL.LJJIFFI == 2) {
                    this.LJIILLIIL.LJJI = 2;
                }
                else {
                    if (ljji == 1) {
                        this.LJJIIZI();
                        break Label_0109;
                    }
                    if (ljji != 2) {
                        break Label_0109;
                    }
                }
                this.LJIIIZ = false;
                this.LJ();
            }
        }
        final HwV ljjjil = this.LJJJIL;
        if (ljjjil != null) {
            ljjjil.setCurrentProgress(1NO.LIZ().LIZIZ);
        }
    }
}
