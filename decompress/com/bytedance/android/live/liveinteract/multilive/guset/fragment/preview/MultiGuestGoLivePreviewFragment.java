// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.fragment.preview;

import androidx.fragment.app.DialogFragment;
import X.HPe;
import androidx.lifecycle.LiveData;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import X.HP3;
import X.0vm;
import X.0uW;
import X.KN6;
import android.app.Dialog;
import X.0tA;
import X.1aC;
import X.1aB;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import X.0gY;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import X.2G1;
import X.GCe;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelPauseMaxTime;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.Hf4;
import X.0W3;
import android.content.res.Resources;
import android.content.Context;
import X.H0H;
import X.0cB;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import X.0Bf;
import android.view.View$OnClickListener;
import X.HPJ;
import X.1NO;
import X.0ba;
import X.SSb;
import X.GTi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0Bp;
import X.CnW;
import X.0Bu;
import androidx.fragment.app.Fragment;
import X.0Bv;
import X.0rF;
import android.view.ViewGroup;
import android.animation.Animator;
import android.animation.AnimatorSet;
import X.0vq;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import X.0vp;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import X.1Uo;
import X.0xj;
import X.CTM;
import X.HPI;
import android.view.View;
import X.GlD;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.view.View$OnTouchListener;
import com.bytedance.android.live.design.app.LiveDialog;
import android.widget.FrameLayout;
import X.1YG;
import X.1so;

public final class MultiGuestGoLivePreviewFragment extends AbsMultiGuestNewPreviewFragment
{
    public static final a LJIJJ;
    public MultiGuestGoLivePreviewViewModel LJIILL;
    public int LJIILLIIL;
    public 1so LJIIZILJ;
    public 1YG LJIJ;
    public String LJIJI;
    public FrameLayout LJJII;
    public LiveDialog LJJIII;
    public final View$OnTouchListener LJJIIJ;
    public String LJJIIJZLJL;
    public long LJJIIZ;
    public HashMap LJJIIZI;
    
    static {
        Covode.recordClassIndex(9730);
        LJIJJ = (a)new a((byte)0);
    }
    
    public MultiGuestGoLivePreviewFragment() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/AbsMultiGuestNewPreviewFragment.<init>:()V
        //     4: aload_0        
        //     5: iconst_1       
        //     6: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILLIIL:I
        //     9: aload_0        
        //    10: new             LX/0vj;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/0vj.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //    18: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJJIIJ:Landroid/view/View$OnTouchListener;
        //    21: aload_0        
        //    22: ldc             "outside"
        //    24: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJJIIJZLJL:Ljava/lang/String;
        //    27: aload_0        
        //    28: ldc             "is_cancel"
        //    30: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIJI:Ljava/lang/String;
        //    33: return         
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
    
    private final void LJIL() {
        final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
        if (ljiill != null) {
            final HPI<Integer> ljiiiizz = ljiill.LJIIIIZZ();
            if (ljiiiizz != null) {
                final Integer n = ((LiveData<Integer>)ljiiiizz).getValue();
                if (n != null && MultiGuestGoLivePreviewViewModel.a.LIZ.LIZ(n)) {
                    final MultiGuestGoLivePreviewViewModel ljiill2 = this.LJIILL;
                    if (ljiill2 != null) {
                        ljiill2.LJIILLIIL();
                    }
                    final MultiGuestGoLivePreviewViewModel ljiill3 = this.LJIILL;
                    if (ljiill3 != null) {
                        ljiill3.LJIIZILJ();
                    }
                    final 1so ljiizilj = this.LJIIZILJ;
                    if (ljiizilj != null) {
                        GlD.LIZJ((View)ljiizilj);
                    }
                    final 1YG ljij = this.LJIJ;
                    if (ljij != null) {
                        if (!ljij.LIZLLL) {
                            return;
                        }
                        final 1so ljiij = super.LJIIJ;
                        if (ljiij != null) {
                            GlD.LIZJ((View)ljiij);
                        }
                    }
                    return;
                }
            }
        }
        final 1so ljiij2 = super.LJIIJ;
        if (ljiij2 != null) {
            GlD.LIZ((View)ljiij2);
        }
        final 1so ljiizilj2 = this.LJIIZILJ;
        if (ljiizilj2 != null) {
            GlD.LIZ((View)ljiizilj2);
        }
    }
    
    public final boolean D_() {
        this.LJJIIJZLJL = "return";
        return super.D_();
    }
    
    @Override
    public final View LIZ(final int n) {
        if (this.LJJIIZI == null) {
            this.LJJIIZI = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJJIIZI.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJJIIZI.put(n, viewById);
        }
        return viewById;
    }
    
    @Override
    public final void LIZ(final View view) {
        CTM.LIZ((Object)view);
        super.LIZ(view);
        this.LJIIZILJ = (1so)view.findViewById(2131365790);
        this.LJJII = (FrameLayout)view.findViewById(2131364314);
    }
    
    public final void LIZ(final String s) {
        0xj.LIZ(s, this.LJI());
    }
    
    @Override
    public final void LIZ(final boolean b) {
        super.LIZ(b);
        final 1Uo ljff = this.LJFF();
        if (ljff != null) {
            ljff.LIZIZ = true;
        }
        final 1Uo ljff2 = this.LJFF();
        if (ljff2 != null) {
            ljff2.LJJI = 1;
        }
    }
    
    public final boolean LIZ(@MultiGuestGoLivePreviewViewModel.a final int ljiilliil, final 1YG 1yg) {
        if (this.LJIILLIIL == 1 && ((Fragment)this).isAdded()) {
            this.LJIILLIIL = ljiilliil;
            this.LJIJ = 1yg;
            final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
            if (ljiill != null) {
                ljiill.LJFF = 1yg;
                ((LiveData<Integer>)ljiill.LJIIIIZZ()).setValue(Integer.valueOf(ljiilliil));
            }
            this.LJIL();
            this.LJIIL();
            this.LJII();
            final ViewGroup ljiijji = super.LJIIJJI;
            final View ljiiiz = super.LJIIIZ;
            if (ljiijji != null && ljiiiz != null) {
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
                n.LIZIZ((Object)ofFloat, "");
                ofFloat.setInterpolator((TimeInterpolator)new LinearInterpolator());
                ofFloat.setDuration(500L);
                ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0vp(ljiiiz));
                final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { -50.0f, 0.0f });
                n.LIZIZ((Object)ofFloat2, "");
                ofFloat2.setInterpolator((TimeInterpolator)new LinearInterpolator());
                ofFloat2.setDuration(500L);
                ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0vq(ljiijji));
                final AnimatorSet set = new AnimatorSet();
                set.playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
                set.start();
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final void LIZIZ() {
        final HashMap ljjiizi = this.LJJIIZI;
        if (ljjiizi != null) {
            ljjiizi.clear();
        }
    }
    
    @Override
    public final void LIZIZ(final boolean b) {
        super.LIZIZ(b);
        final 1Uo ljff = this.LJFF();
        if (ljff != null) {
            ljff.LIZIZ = false;
        }
        final 1Uo ljff2 = this.LJFF();
        if (ljff2 != null) {
            ljff2.LJJI = 2;
        }
    }
    
    public final boolean LIZIZ(final View view) {
        if (view == null || (view.getId() != 2131364399 && view.getId() != 2131365790)) {
            final 1Uo ljff = this.LJFF();
            if (ljff != null && 0rF.LIZ(ljff.LJJIFFI)) {
                final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
                if (ljiill != null) {
                    final HPI<Integer> ljiiiizz = ljiill.LJIIIIZZ();
                    if (ljiiiizz != null) {
                        final Integer n = ((LiveData<Integer>)ljiiiizz).getValue();
                        if (n != null && MultiGuestGoLivePreviewViewModel.a.LIZ.LIZ(n)) {
                            final 1YG ljij = this.LJIJ;
                            if (ljij != null && ljij.LJI) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final boolean LJIIIZ() {
        return false;
    }
    
    @Override
    public final AbsMultiGuestNewPreviewViewModel LJIIJ() {
        return this.LJIILL;
    }
    
    @Override
    public final void LJIIJJI() {
        final 0Bu liz = 0Bv.LIZ((Fragment)this, null);
        if (CnW.LIZ) {
            0Bp.LIZ(liz, (Fragment)this);
        }
        final MultiGuestGoLivePreviewViewModel ljiill = liz.LIZ(MultiGuestGoLivePreviewViewModel.class);
        if ((this.LJIILL = ljiill) != null) {
            final DataChannel ljil = super.LJIL;
            final 1YG ljij = this.LJIJ;
            final int ljiilliil = this.LJIILLIIL;
            ljiill.LIZIZ = ljil;
            ljiill.LJFF = ljij;
            ((LiveData<Integer>)ljiill.LJIIIIZZ()).setValue(Integer.valueOf(ljiilliil));
        }
    }
    
    @Override
    public final void LJIIL() {
        super.LJIIL();
        final 1so ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            GlD.LIZJ((View)ljiizilj);
        }
        if (!MultiGuestGoLivePreviewViewModel.a.LIZ.LIZ(this.LJIILLIIL)) {
            final View ljiiiz = super.LJIIIZ;
            if (ljiiiz != null) {
                ljiiiz.setAlpha(0.0f);
            }
            GTi.LIZIZ((View)super.LJIIIIZZ, -50);
        }
        final 1YG ljij = this.LJIJ;
        if (ljij != null && ljij.LIZ) {
            final SSb ljff = super.LJFF;
            if (ljff != null) {
                GTi.LIZIZ((View)ljff);
            }
        }
        else {
            final SSb ljff2 = super.LJFF;
            if (ljff2 != null) {
                GlD.LIZ((View)ljff2);
            }
        }
        final 1YG ljij2 = this.LJIJ;
        if (ljij2 != null && ljij2.LIZLLL) {
            final 1so ljiij = super.LJIIJ;
            if (ljiij != null) {
                GTi.LIZIZ((View)ljiij);
            }
            return;
        }
        final 1so ljiij2 = super.LJIIJ;
        if (ljiij2 != null) {
            GTi.LIZ((View)ljiij2);
        }
    }
    
    @Override
    public final void LJIILIIL() {
        super.LJIILIIL();
        if (this.LJFF() == null) {
            return;
        }
        final 1Uo ljff = this.LJFF();
        if (ljff != null) {
            ljff.LJFF("apply");
        }
        final 1Uo ljff2 = this.LJFF();
        int ljji;
        if (ljff2 != null) {
            ljji = ljff2.LJJI;
        }
        else {
            ljji = 0;
        }
        final 1Uo ljff3 = this.LJFF();
        final int n = 2;
        int n2 = ljji;
        if (ljff3 != null) {
            n2 = ljji;
            if (ljff3.LJJIFFI == 2) {
                final 1Uo ljff4 = this.LJFF();
                if (ljff4 != null) {
                    ljff4.LJJI = 2;
                }
                n2 = 2;
            }
        }
        if (n2 != 1) {
            if (n2 == 2) {
                final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
                if (ljiill != null) {
                    final HPI<Integer> liziz = ljiill.LIZIZ();
                    if (liziz != null) {
                        ((LiveData<Integer>)liziz).setValue(Integer.valueOf(1));
                    }
                }
            }
        }
        else {
            final MultiGuestGoLivePreviewViewModel ljiill2 = this.LJIILL;
            if (ljiill2 != null) {
                final HPI<Integer> liziz2 = ljiill2.LIZIZ();
                if (liziz2 != null) {
                    ((LiveData<Integer>)liziz2).setValue(Integer.valueOf(2));
                }
            }
        }
        final MultiGuestGoLivePreviewViewModel ljiill3 = this.LJIILL;
        int intValue = n;
        if (ljiill3 != null) {
            final HPI<Integer> liziz3 = ljiill3.LIZIZ();
            intValue = n;
            if (liziz3 != null) {
                final Integer n3 = ((LiveData<Integer>)liziz3).getValue();
                intValue = n;
                if (n3 != null) {
                    intValue = n3;
                }
            }
        }
        super.LJIILJJIL = intValue;
        final StringBuilder sb = new StringBuilder("initPreviewModeAtFirst originPreviewMode=");
        sb.append(super.LJIILJJIL);
        sb.append(" goLiveSource=");
        sb.append(this.LJIILLIIL);
        0ba.LIZ(3, "MultiGuestGoLivePreviewFragment", sb.toString());
    }
    
    @Override
    public final void LJIILJJIL() {
        final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
        final Object o = null;
        if (ljiill != null) {
            final HPI<Integer> liziz = ljiill.LIZIZ();
            Integer n;
            if (liziz != null) {
                n = ((LiveData<Integer>)liziz).getValue();
            }
            else {
                n = null;
            }
            final boolean b = n != null && n == 2;
            this.LJFF();
            ljiill.LIZ(b, false, 1NO.LIZ().LIZIZ, 1NO.LIZ().LIZJ);
        }
        final StringBuilder sb = new StringBuilder("updatePreviewStateDataIntoViewModel = ");
        final MultiGuestGoLivePreviewViewModel ljiill2 = this.LJIILL;
        Object value = o;
        if (ljiill2 != null) {
            final HPJ<AbsMultiGuestNewPreviewViewModel.b> lizj = ljiill2.LIZJ();
            value = o;
            if (lizj != null) {
                value = ((HPe)lizj).getValue();
            }
        }
        sb.append(value);
        0ba.LIZ(3, "MultiGuestGoLivePreviewFragment", sb.toString());
    }
    
    @Override
    public final void LJIILLIIL() {
        super.LJIILLIIL();
        final 1so ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            GTi.LIZ((View)ljiizilj, (View$OnClickListener)this);
        }
        final 1so ljiizilj2 = this.LJIIZILJ;
        if (ljiizilj2 != null) {
            GlD.LIZ((View)ljiizilj2);
        }
        final 1so ljiij = super.LJIIJ;
        if (ljiij != null) {
            GTi.LIZ((View)ljiij, (View$OnClickListener)this);
        }
        final 1so ljiij2 = super.LJIIJ;
        if (ljiij2 != null) {
            GlD.LIZ((View)ljiij2);
        }
        final ViewGroup ljiiiizz = super.LJIIIIZZ;
        if (ljiiiizz != null) {
            GTi.LIZ((View)ljiiiizz, (View$OnClickListener)this);
        }
        final FrameLayout ljjii = this.LJJII;
        if (ljjii != null) {
            ljjii.setOnTouchListener(this.LJJIIJ);
        }
    }
    
    @Override
    public final void LJIIZILJ() {
        public final class 1aA<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestGoLivePreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9740);
            }
            
            public 1aA(final MultiGuestGoLivePreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        public final class 1a9<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestGoLivePreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9739);
            }
            
            public 1a9(final MultiGuestGoLivePreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        public final class 1a8<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestGoLivePreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9738);
            }
            
            public 1a8(final MultiGuestGoLivePreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        public final class 1a7<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestGoLivePreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9737);
            }
            
            public 1a7(final MultiGuestGoLivePreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        public final class 1a6<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestGoLivePreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9736);
            }
            
            public 1a6(final MultiGuestGoLivePreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        public final class 1a5<T> implements 0Bf
        {
            static {
                Covode.recordClassIndex(9735);
            }
            
            public 1a5(final MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment) {
            }
        }
        public final class 1a4<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestGoLivePreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9734);
            }
            
            public 1a4(final MultiGuestGoLivePreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        public final class 1a3<T> implements 0Bf
        {
            public final /* synthetic */ MultiGuestGoLivePreviewFragment LIZ;
            
            static {
                Covode.recordClassIndex(9733);
            }
            
            public 1a3(final MultiGuestGoLivePreviewFragment liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/AbsMultiGuestNewPreviewFragment.LJIIZILJ:()V
        //     4: aload_0        
        //     5: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          35
        //    13: aload_1        
        //    14: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel.LJIIL:()LX/HP3;
        //    17: astore_1       
        //    18: aload_1        
        //    19: ifnull          35
        //    22: aload_1        
        //    23: aload_0        
        //    24: new             LX/1a3;
        //    27: dup            
        //    28: aload_0        
        //    29: invokespecial   X/1a3.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //    32: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //    35: aload_0        
        //    36: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          66
        //    44: aload_1        
        //    45: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel.LJIIJ:()LX/HP3;
        //    48: astore_1       
        //    49: aload_1        
        //    50: ifnull          66
        //    53: aload_1        
        //    54: aload_0        
        //    55: new             LX/1a4;
        //    58: dup            
        //    59: aload_0        
        //    60: invokespecial   X/1a4.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //    63: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //    66: aload_0        
        //    67: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //    70: astore_1       
        //    71: aload_1        
        //    72: ifnull          97
        //    75: aload_1        
        //    76: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel.LJIIIZ:()LX/HP3;
        //    79: astore_1       
        //    80: aload_1        
        //    81: ifnull          97
        //    84: aload_1        
        //    85: aload_0        
        //    86: new             LX/1a5;
        //    89: dup            
        //    90: aload_0        
        //    91: invokespecial   X/1a5.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //    94: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //    97: aload_0        
        //    98: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //   101: astore_1       
        //   102: aload_1        
        //   103: ifnull          128
        //   106: aload_1        
        //   107: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel.LJIIJJI:()LX/HP3;
        //   110: astore_1       
        //   111: aload_1        
        //   112: ifnull          128
        //   115: aload_1        
        //   116: aload_0        
        //   117: new             LX/1a6;
        //   120: dup            
        //   121: aload_0        
        //   122: invokespecial   X/1a6.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //   125: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   128: aload_0        
        //   129: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //   132: astore_1       
        //   133: aload_1        
        //   134: ifnull          159
        //   137: aload_1        
        //   138: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/AbsMultiGuestNewPreviewViewModel.LJFF:()LX/HP3;
        //   141: astore_1       
        //   142: aload_1        
        //   143: ifnull          159
        //   146: aload_1        
        //   147: aload_0        
        //   148: new             LX/1a7;
        //   151: dup            
        //   152: aload_0        
        //   153: invokespecial   X/1a7.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //   156: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   159: aload_0        
        //   160: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //   163: astore_1       
        //   164: aload_1        
        //   165: ifnull          190
        //   168: aload_1        
        //   169: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/AbsMultiGuestNewPreviewViewModel.LJ:()LX/HP3;
        //   172: astore_1       
        //   173: aload_1        
        //   174: ifnull          190
        //   177: aload_1        
        //   178: aload_0        
        //   179: new             LX/1a8;
        //   182: dup            
        //   183: aload_0        
        //   184: invokespecial   X/1a8.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //   187: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   190: aload_0        
        //   191: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //   194: astore_1       
        //   195: aload_1        
        //   196: ifnull          221
        //   199: aload_1        
        //   200: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/AbsMultiGuestNewPreviewViewModel.LIZLLL:()LX/HP3;
        //   203: astore_1       
        //   204: aload_1        
        //   205: ifnull          221
        //   208: aload_1        
        //   209: aload_0        
        //   210: new             LX/1a9;
        //   213: dup            
        //   214: aload_0        
        //   215: invokespecial   X/1a9.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //   218: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   221: aload_0        
        //   222: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment.LJIILL:Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel;
        //   225: astore_1       
        //   226: aload_1        
        //   227: ifnull          252
        //   230: aload_1        
        //   231: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewViewModel.LJIIIIZZ:()LX/HPI;
        //   234: astore_1       
        //   235: aload_1        
        //   236: ifnull          252
        //   239: aload_1        
        //   240: aload_0        
        //   241: new             LX/1aA;
        //   244: dup            
        //   245: aload_0        
        //   246: invokespecial   X/1aA.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/preview/MultiGuestGoLivePreviewFragment;)V
        //   249: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   252: return         
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
    
    @Override
    public final void LJIJ() {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room != null && room.getOwner() != null) {
            final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
            String s = null;
            Label_0066: {
                if (ljiill != null) {
                    final HPI<Integer> liziz = ljiill.LIZIZ();
                    if (liziz != null) {
                        final Integer n = ((LiveData<Integer>)liziz).getValue();
                        if (n != null && n == 2) {
                            s = "video";
                            break Label_0066;
                        }
                    }
                }
                s = "voice";
            }
            0xj.LIZ(s, "click", "cancel");
            final LiveDialog.a a = new LiveDialog.a(((Fragment)this).getContext());
            a.LIZ(2131831191, (LiveDialog.b)new 1aB(this));
            a.LIZIZ(2131831189, (LiveDialog.b)1aC.LIZ);
            a.LIZIZ(2131831192);
            a.LIZJ(2131831190);
            this.LJJIII = a.LIZIZ();
            0xj.LIZ(s, "show", "0");
            final LiveDialog ljjiii = this.LJJIII;
            if (ljjiii != null) {
                0tA.LIZ(ljjiii, 5, true, true, 56);
            }
            final LiveDialog ljjiii2 = this.LJJIII;
            if (ljjiii2 != null) {
                ljjiii2.show();
                KN6.LIZ.LIZ((Dialog)ljjiii2);
            }
        }
        this.LIZ("cancel_link");
    }
    
    @Override
    public final void LJIJI() {
        final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
        if (ljiill != null) {
            final HPI<Integer> ljiiiizz = ljiill.LJIIIIZZ();
            if (ljiiiizz != null) {
                final Integer n = ((LiveData<Integer>)ljiiiizz).getValue();
                if (n != null && MultiGuestGoLivePreviewViewModel.a.LIZ.LIZ(n)) {
                    return;
                }
            }
        }
        this.LJJIIJZLJL = "outside";
        ((DialogFragment)this).dismiss();
    }
    
    @Override
    public final boolean LJIJJ() {
        this.LIZ("switch_camera");
        final boolean ljijj = super.LJIJJ();
        final 0uW lizj = 0uW.LIZJ;
        final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
        while (true) {
            Label_0063: {
                if (ljiill == null) {
                    break Label_0063;
                }
                final HPJ<AbsMultiGuestNewPreviewViewModel.b> lizj2 = ljiill.LIZJ();
                if (lizj2 == null) {
                    break Label_0063;
                }
                final AbsMultiGuestNewPreviewViewModel.b b = (AbsMultiGuestNewPreviewViewModel.b)((HPe)lizj2).getValue();
                if (b == null) {
                    break Label_0063;
                }
                final boolean liz = b.LIZ;
                0uW.LIZ(lizj, liz, "preview_page");
                return ljijj;
            }
            final boolean liz = false;
            continue;
        }
    }
    
    @Override
    public final boolean LJIJJLI() {
        this.LIZ("switch_mute_setting");
        final 1Uo ljff = this.LJFF();
        if (ljff != null) {
            0uW.LIZJ.LIZ(ljff.LJJIIZI, ljff.LJIJI, ljff.LIZ ^ true, "preview_page");
        }
        return super.LJIJJLI();
    }
    
    public final void dismiss() {
        final DataChannel ljil = super.LJIL;
        final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
        boolean liziz = false;
        while (true) {
            Label_0069: {
                if (ljiill == null) {
                    break Label_0069;
                }
                final HP3<Boolean> ljiijji = ljiill.LJIIJJI();
                if (ljiijji == null) {
                    break Label_0069;
                }
                final Boolean b = ((LiveData<Boolean>)ljiijji).getValue();
                if (b == null) {
                    break Label_0069;
                }
                final boolean booleanValue = b;
                final 1Uo ljff = this.LJFF();
                if (ljff != null) {
                    liziz = ljff.LIZIZ;
                }
                0vm.LIZ(ljil, booleanValue, liziz);
                super.dismiss();
                return;
            }
            final boolean booleanValue = false;
            continue;
        }
    }
    
    @Override
    public final void onClick(final View view) {
        if (this.LIZIZ(view)) {
            final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
            if (ljiill != null) {
                ljiill.LJIILL();
            }
        }
        super.onClick(view);
        if (view != null) {
            final Integer value = view.getId();
            if (value != null) {
                if (value == 2131365790) {
                    this.LJJIIJZLJL = "confirm_icon";
                    this.LJIJI = "connection";
                    final MultiGuestGoLivePreviewViewModel ljiill2 = this.LJIILL;
                    if (ljiill2 != null) {
                        ljiill2.LJIILJJIL();
                    }
                    this.LIZ("go_live");
                }
            }
        }
    }
    
    @Override
    public final void onDestroy() {
        super.onDestroy();
        final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
        if (ljiill != null) {
            ljiill.LJII();
        }
        final 0uW lizj = 0uW.LIZJ;
        final 1Uo ljff = this.LJFF();
        String ljjiizi;
        if (ljff != null) {
            ljjiizi = ljff.LJJIIZI;
        }
        else {
            ljjiizi = null;
        }
        final LiveEffect lizj2 = 1NO.LIZ().LIZJ;
        final long n = 1NO.LIZ().LIZIZ;
        final 1Uo ljff2 = this.LJFF();
        final boolean b = ljff2 != null && ljff2.LIZ;
        final 1Uo ljff3 = this.LJFF();
        final boolean b2 = ljff3 != null && ljff3.LIZIZ;
        final 1Uo ljff4 = this.LJFF();
        lizj.LIZ(ljjiizi, lizj2, n, b ^ true, b2 ^ true, ljff4 != null && ljff4.LIZLLL, this.LJJIIJZLJL, this.LJIJI, System.currentTimeMillis() - this.LJJIIZ);
    }
    
    @Override
    public final void onPause() {
        super.onPause();
        final MultiGuestGoLivePreviewViewModel ljiill = this.LJIILL;
        final Object o = null;
        if (ljiill != null) {
            final HPI<Integer> liziz = ljiill.LIZIZ();
            if (liziz != null) {
                final Integer n = ((LiveData<Integer>)liziz).getValue();
                if (n != null) {
                    if (n == 2) {
                        final MultiGuestGoLivePreviewViewModel ljiill2 = this.LJIILL;
                        Object value = o;
                        if (ljiill2 != null) {
                            final HP3<Boolean> ljiijji = ljiill2.LJIIJJI();
                            value = o;
                            if (ljiijji != null) {
                                value = ((LiveData<Object>)ljiijji).getValue();
                            }
                        }
                        if (kotlin.jvm.internal.n.LIZ(value, (Object)false)) {
                            this.LIZ(false, (Cert)TokenCert.Companion.with("bpea-multiguest_new_preview_close_camera"));
                        }
                    }
                }
            }
        }
    }
    
    public final void onStart() {
        super.onStart();
        this.LJJIIZ = System.currentTimeMillis();
    }
    
    @Override
    public final void onViewCreated(final View view, final Bundle bundle) {
        CTM.LIZ((Object)view);
        super.onViewCreated(view, bundle);
        this.LJIL();
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(9731);
        }
        
        public final MultiGuestGoLivePreviewFragment LIZ(@MultiGuestGoLivePreviewViewModel.a final int ljiilliil, final 1YG ljij) {
            final MultiGuestGoLivePreviewFragment multiGuestGoLivePreviewFragment = new MultiGuestGoLivePreviewFragment((byte)0);
            multiGuestGoLivePreviewFragment.LJIJ = ljij;
            multiGuestGoLivePreviewFragment.LJIILLIIL = ljiilliil;
            return multiGuestGoLivePreviewFragment;
        }
    }
}
