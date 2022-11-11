// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.preview;

import X.HPe;
import java.util.Iterator;
import java.util.List;
import X.Qsi;
import X.Gaz;
import X.GTi;
import X.1JP;
import kotlin.jvm.internal.n;
import X.0jR;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautySetting;
import X.Gte;
import X.0Wp;
import X.1Wd;
import X.1Wv;
import X.2FX;
import X.0g8;
import X.HP3;
import X.HPJ;
import X.HPI;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import X.1JQ;
import X.0kg;
import com.bytedance.covode.number.Covode;
import X.5DO;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0Wg;
import com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt;

public abstract class AbsMultiGuestNewPreviewViewModel extends ViewModelExt
{
    public static final a LIZLLL;
    public 0Wg LIZ;
    public DataChannel LIZIZ;
    public final 5DO LIZJ;
    public final 5DO LJ;
    public final 5DO LJFF;
    public final 5DO LJI;
    public final 5DO LJII;
    public final 5DO LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(9727);
        LIZLLL = (a)new a((byte)0);
    }
    
    public AbsMultiGuestNewPreviewViewModel() {
        this.LJ = 0kg.LIZ(this, 0);
        this.LJFF = 0kg.LIZIZ(this);
        this.LJI = 0kg.LIZ(this);
        this.LJII = 0kg.LIZ(this);
        this.LIZJ = 0kg.LIZIZ(this);
        this.LJIIIIZZ = 0kg.LIZ(this);
    }
    
    public abstract void LIZ(final 1JQ p0);
    
    public final void LIZ(final boolean b, final boolean b2, final int n, final LiveEffect liveEffect) {
        ((HPe)this.LIZJ()).LIZ = new AbsMultiGuestNewPreviewViewModel.b(b, b2, n, liveEffect);
    }
    
    public final HPI<Integer> LIZIZ() {
        return (HPI<Integer>)this.LJ.getValue();
    }
    
    public final HPJ<AbsMultiGuestNewPreviewViewModel.b> LIZJ() {
        return (HPJ<AbsMultiGuestNewPreviewViewModel.b>)this.LJFF.getValue();
    }
    
    public final HP3<Integer> LIZLLL() {
        return (HP3<Integer>)this.LJI.getValue();
    }
    
    public final HP3<LiveEffect> LJ() {
        return (HP3<LiveEffect>)this.LJII.getValue();
    }
    
    public final HP3<Integer> LJFF() {
        return (HP3<Integer>)this.LJIIIIZZ.getValue();
    }
    
    public void LJI() {
        final 0Wg liz = this.LIZ;
        final 1JQ 1jq = null;
        Object attachedComposerManager;
        if (liz != null) {
            attachedComposerManager = liz.getAttachedComposerManager();
        }
        else {
            attachedComposerManager = null;
        }
        Object o = attachedComposerManager;
        if (!(attachedComposerManager instanceof 0g8)) {
            o = null;
        }
        0g8 0g8 = (0g8)o;
        if (!(0g8 instanceof 1JQ)) {
            0g8 = 1jq;
        }
        final 1JQ 1jq2 = (1JQ)0g8;
        if (1jq2 != null) {
            this.LIZ(1jq2);
        }
        final DataChannel liziz = this.LIZIZ;
        if (liziz != null) {
            final AbsMultiGuestNewPreviewViewModel.b b = (AbsMultiGuestNewPreviewViewModel.b)((HPe)this.LIZJ()).getValue();
            if (b != null) {
                liziz.LIZJ((Class)2FX.class, (Object)new 1Wd(new 1Wv(b.LIZ, b.LIZIZ, b.LIZJ, b.LIZLLL), "close1"));
            }
        }
    }
    
    public final void LJII() {
        final AbsMultiGuestNewPreviewViewModel.b b = (AbsMultiGuestNewPreviewViewModel.b)((HPe)this.LIZJ()).getValue();
        if (b != null) {
            final LiveEffect lizlll = b.LIZLLL;
            if (lizlll != null) {
                final 0Wp 0Wp = new 0Wp("liveinteract", lizlll, "");
                final DataChannel liziz = this.LIZIZ;
                if (liziz != null) {
                    liziz.LIZJ((Class)Gte.class, (Object)0Wp);
                }
            }
        }
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(9728);
        }
        
        public final 0g8 LIZ() {
            if (MultiGuestBeautySetting.enableGuestUseComposerManagerB()) {
                final IEffectService liz = 0jR.LIZ(IEffectService.class);
                n.LIZIZ((Object)liz, "");
                final 1JQ composerManagerB = liz.createComposerManagerB();
                n.LIZIZ((Object)composerManagerB, "");
                return composerManagerB;
            }
            final IEffectService liz2 = 0jR.LIZ(IEffectService.class);
            n.LIZIZ((Object)liz2, "");
            final 1JP composerManager = liz2.createComposerManager();
            n.LIZIZ((Object)composerManager, "");
            return composerManager;
        }
        
        public final void LIZ(final 1JQ 1jq) {
            if (GTi.LIZIZ(Boolean.valueOf(MultiGuestBeautySetting.useNewBeautySmallItem()))) {
                return;
            }
            final IEffectService liz = 0jR.LIZ(IEffectService.class);
            n.LIZIZ((Object)liz, "");
            final 1JQ composerManagerB = liz.composerManagerB();
            if (1jq != null) {
                composerManagerB.LIZ("liveguestbeauty");
                final List<LiveEffect> liziz = 1jq.LIZIZ("liveguestbeauty");
                if (liziz != null) {
                    for (final LiveEffect liveEffect : liziz) {
                        n.LIZIZ((Object)liveEffect, "");
                        composerManagerB.LIZLLL("liveguestbeauty", liveEffect);
                        final Gaz gaz = (Gaz)Qsi.LJIIJJI(liveEffect.composerConfigList);
                        int lji;
                        if (gaz != null) {
                            lji = gaz.LJI;
                        }
                        else {
                            lji = 0;
                        }
                        composerManagerB.LIZIZ("liveguestbeauty", liveEffect, lji);
                    }
                }
            }
        }
    }
}
