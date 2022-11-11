// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPreviewSmallGiftSetting;
import com.bytedance.common.utility.Logger;
import android.util.Property;
import java.util.Collection;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPreviewDelayDismissTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MatchAccelerationUESetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.message.battle.ExemptStrategy;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import kotlin.jvm.internal.n;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.Objects;
import android.view.LayoutInflater$Factory;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.model.Gift;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public final class 0nk extends FrameLayout
{
    public float LIZ;
    public AnimatorSet LIZIZ;
    public float LIZJ;
    public a LIZLLL;
    public boolean LJ;
    public 0nC LJFF;
    public Gift LJI;
    public boolean LJII;
    public final Runnable LJIIIIZZ;
    public boolean LJIIIZ;
    public ValueAnimator LJIIJ;
    public ValueAnimator LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public DataChannel LJIILL;
    public HashMap LJIILLIIL;
    
    static {
        Covode.recordClassIndex(7912);
    }
    
    public 0nk(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0nk(final Context context, final AttributeSet set, final char c) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: iconst_0       
        //     8: invokespecial   android/widget/FrameLayout.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: sipush          12083
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: ldc             0.5
        //    20: putfield        X/0nk.LIZ:F
        //    23: aload_0        
        //    24: ldc             50.0
        //    26: putfield        X/0nk.LIZJ:F
        //    29: aload_0        
        //    30: iconst_1       
        //    31: putfield        X/0nk.LJIILJJIL:Z
        //    34: aload_0        
        //    35: getstatic       X/0na.MIDDLE:LX/0na;
        //    38: putfield        X/0nk.LIZLLL:LX/0na;
        //    41: aload_0        
        //    42: getstatic       X/0nC.NORMAL:LX/0nC;
        //    45: putfield        X/0nk.LJFF:LX/0nC;
        //    48: aload_0        
        //    49: new             LX/0nb;
        //    52: dup            
        //    53: aload_0        
        //    54: invokespecial   X/0nb.<init>:(LX/0nk;)V
        //    57: putfield        X/0nk.LJIIIIZZ:Ljava/lang/Runnable;
        //    60: aload_1        
        //    61: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //    64: ldc             2131562273
        //    66: aload_0        
        //    67: invokestatic    X/0nk.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;)Landroid/view/View;
        //    70: pop            
        //    71: aload_0        
        //    72: ldc             2131368247
        //    74: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //    77: ldc             "tiktok_live_interaction_resource"
        //    79: ldc             "live_battle_score_initial_animation.webp"
        //    81: invokestatic    X/0cb.LIZ:(Landroid/view/View;Ljava/lang/String;Ljava/lang/String;)V
        //    84: sipush          12083
        //    87: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //    90: return         
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
    
    public static View LIZ(final LayoutInflater layoutInflater, final int n, final ViewGroup viewGroup) {
        MethodCollector.i(12077);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(n, viewGroup);
                MethodCollector.o(12077);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(n, viewGroup);
        MethodCollector.o(12077);
        return inflate2;
    }
    
    private final void LIZ(final float n, final float n2, final float n3, final float n4) {
        final 1si 1si = (1si)this.LIZ(2131369314);
        ViewGroup$LayoutParams layoutParams;
        if (1si != null) {
            layoutParams = 1si.getLayoutParams();
        }
        else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = 0cB.LIZ(n3);
        layoutParams2.topMargin = 0cB.LIZ(n4);
        layoutParams2.width = 0cB.LIZ(n);
        layoutParams2.height = 0cB.LIZ(n2);
        final 1si 1si2 = (1si)this.LIZ(2131369314);
        if (1si2 != null) {
            1si2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
        }
    }
    
    private final void LIZ(final int ljiil, final int ljiiliil) {
        if (ljiil == 0 && ljiiliil == 0) {
            return;
        }
        final 1si 1si = (1si)this.LIZ(2131368247);
        n.LIZIZ((Object)1si, "");
        1si.setVisibility(8);
        final 1si 1si2 = (1si)this.LIZ(2131369314);
        n.LIZIZ((Object)1si2, "");
        1si2.setVisibility(0);
        if (this.LIZLLL == a.EMOJI) {
            return;
        }
        final int ljiil2 = this.LJIIL;
        final int n = ljiil - ljiil2;
        if (n >= 1000) {
            if (this.LIZLLL != a.STRONG) {
                this.LJFF();
            }
        }
        else if (n > 0) {
            if (this.LIZLLL != a.WEAK) {
                this.LJ();
            }
        }
        else if (ljiil2 == 0 && this.LJIILIIL == 0 && this.LIZLLL != a.WEAK) {
            this.LJ();
        }
        this.LJIIL = ljiil;
        this.LJIILIIL = ljiiliil;
        this.LJIILJJIL = true;
        final 0on 0on = (0on)this.LIZ(2131374217);
        if (0on != null) {
            0on.setMIsAnimationToRight(this.LJIILJJIL);
        }
        this.LIZLLL();
    }
    
    private final void LIZ(final boolean b, final int n) {
        public final class 0nd implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7925);
            }
            
            public 0nd(final 0nk liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                CTM.LIZ((Object)valueAnimator);
                final 1ib 1ib = (1ib)this.LIZ.LIZ(2131370518);
                n.LIZIZ((Object)1ib, "");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                1ib.setScaleX((float)animatedValue);
                final 1ib 1ib2 = (1ib)this.LIZ.LIZ(2131370518);
                n.LIZIZ((Object)1ib2, "");
                final Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                1ib2.setScaleY((float)animatedValue2);
            }
        }
        public final class 0nc implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7924);
            }
            
            public 0nc(final 0nk liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                CTM.LIZ((Object)valueAnimator);
                final 1xy 1xy = (1xy)this.LIZ.LIZ(2131367537);
                n.LIZIZ((Object)1xy, "");
                final Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                1xy.setScaleX((float)animatedValue);
                final 1xy 1xy2 = (1xy)this.LIZ.LIZ(2131367537);
                n.LIZIZ((Object)1xy2, "");
                final Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                1xy2.setScaleY((float)animatedValue2);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //     4: astore_3       
        //     5: iload_1        
        //     6: ifeq            175
        //     9: aload_0        
        //    10: ldc_w           2131367537
        //    13: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //    16: checkcast       LX/1xy;
        //    19: astore          4
        //    21: aload           4
        //    23: ldc             ""
        //    25: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    28: aload           4
        //    30: aload_3        
        //    31: invokevirtual   X/1xy.setText:(Ljava/lang/CharSequence;)V
        //    34: aload_0        
        //    35: getfield        X/0nk.LJIIJ:Landroid/animation/ValueAnimator;
        //    38: astore_3       
        //    39: aload_3        
        //    40: ifnull          51
        //    43: aload_3        
        //    44: invokevirtual   android/animation/ValueAnimator.isRunning:()Z
        //    47: iconst_1       
        //    48: if_icmpeq       77
        //    51: aload_0        
        //    52: ldc_w           2131367537
        //    55: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //    58: checkcast       LX/1xy;
        //    61: astore_3       
        //    62: aload_3        
        //    63: ldc             ""
        //    65: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    68: aload_3        
        //    69: invokevirtual   X/1xy.getVisibility:()I
        //    72: bipush          8
        //    74: if_icmpne       78
        //    77: return         
        //    78: iconst_2       
        //    79: newarray        F
        //    81: dup            
        //    82: iconst_0       
        //    83: fconst_1       
        //    84: fastore        
        //    85: dup            
        //    86: iconst_1       
        //    87: ldc_w           1.3
        //    90: fastore        
        //    91: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //    94: astore_3       
        //    95: aload_0        
        //    96: aload_3        
        //    97: putfield        X/0nk.LJIIJ:Landroid/animation/ValueAnimator;
        //   100: aload_3        
        //   101: ifnull          112
        //   104: aload_3        
        //   105: ldc2_w          200
        //   108: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   111: pop            
        //   112: aload_0        
        //   113: getfield        X/0nk.LJIIJ:Landroid/animation/ValueAnimator;
        //   116: astore_3       
        //   117: aload_3        
        //   118: ifnull          126
        //   121: aload_3        
        //   122: iconst_1       
        //   123: invokevirtual   android/animation/ValueAnimator.setRepeatCount:(I)V
        //   126: aload_0        
        //   127: getfield        X/0nk.LJIIJ:Landroid/animation/ValueAnimator;
        //   130: astore_3       
        //   131: aload_3        
        //   132: ifnull          140
        //   135: aload_3        
        //   136: iconst_2       
        //   137: invokevirtual   android/animation/ValueAnimator.setRepeatMode:(I)V
        //   140: aload_0        
        //   141: getfield        X/0nk.LJIIJ:Landroid/animation/ValueAnimator;
        //   144: astore_3       
        //   145: aload_3        
        //   146: ifnull          161
        //   149: aload_3        
        //   150: new             LX/0nc;
        //   153: dup            
        //   154: aload_0        
        //   155: invokespecial   X/0nc.<init>:(LX/0nk;)V
        //   158: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   161: aload_0        
        //   162: getfield        X/0nk.LJIIJ:Landroid/animation/ValueAnimator;
        //   165: astore_3       
        //   166: aload_3        
        //   167: ifnull          174
        //   170: aload_3        
        //   171: invokevirtual   android/animation/ValueAnimator.start:()V
        //   174: return         
        //   175: aload_0        
        //   176: ldc_w           2131370518
        //   179: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //   182: checkcast       LX/1ib;
        //   185: astore          4
        //   187: aload           4
        //   189: ldc             ""
        //   191: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   194: aload           4
        //   196: aload_3        
        //   197: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   200: aload_0        
        //   201: getfield        X/0nk.LJIIJJI:Landroid/animation/ValueAnimator;
        //   204: astore_3       
        //   205: aload_3        
        //   206: ifnull          217
        //   209: aload_3        
        //   210: invokevirtual   android/animation/ValueAnimator.isRunning:()Z
        //   213: iconst_1       
        //   214: if_icmpeq       243
        //   217: aload_0        
        //   218: ldc_w           2131370518
        //   221: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //   224: checkcast       LX/1ib;
        //   227: astore_3       
        //   228: aload_3        
        //   229: ldc             ""
        //   231: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   234: aload_3        
        //   235: invokevirtual   X/1ib.getVisibility:()I
        //   238: bipush          8
        //   240: if_icmpne       244
        //   243: return         
        //   244: iconst_2       
        //   245: newarray        F
        //   247: dup            
        //   248: iconst_0       
        //   249: fconst_1       
        //   250: fastore        
        //   251: dup            
        //   252: iconst_1       
        //   253: ldc_w           1.3
        //   256: fastore        
        //   257: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //   260: astore_3       
        //   261: aload_0        
        //   262: aload_3        
        //   263: putfield        X/0nk.LJIIJJI:Landroid/animation/ValueAnimator;
        //   266: aload_3        
        //   267: ifnull          278
        //   270: aload_3        
        //   271: ldc2_w          200
        //   274: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   277: pop            
        //   278: aload_0        
        //   279: getfield        X/0nk.LJIIJJI:Landroid/animation/ValueAnimator;
        //   282: astore_3       
        //   283: aload_3        
        //   284: ifnull          292
        //   287: aload_3        
        //   288: iconst_1       
        //   289: invokevirtual   android/animation/ValueAnimator.setRepeatCount:(I)V
        //   292: aload_0        
        //   293: getfield        X/0nk.LJIIJJI:Landroid/animation/ValueAnimator;
        //   296: astore_3       
        //   297: aload_3        
        //   298: ifnull          306
        //   301: aload_3        
        //   302: iconst_2       
        //   303: invokevirtual   android/animation/ValueAnimator.setRepeatMode:(I)V
        //   306: aload_0        
        //   307: getfield        X/0nk.LJIIJJI:Landroid/animation/ValueAnimator;
        //   310: astore_3       
        //   311: aload_3        
        //   312: ifnull          327
        //   315: aload_3        
        //   316: new             LX/0nd;
        //   319: dup            
        //   320: aload_0        
        //   321: invokespecial   X/0nd.<init>:(LX/0nk;)V
        //   324: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   327: aload_0        
        //   328: getfield        X/0nk.LJIIJJI:Landroid/animation/ValueAnimator;
        //   331: astore_3       
        //   332: aload_3        
        //   333: ifnull          340
        //   336: aload_3        
        //   337: invokevirtual   android/animation/ValueAnimator.start:()V
        //   340: return         
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
    
    private final void LIZIZ(final float n) {
        public final class 0ng implements Runnable
        {
            public final /* synthetic */ 0nk LIZ;
            public final /* synthetic */ float LIZIZ;
            
            static {
                Covode.recordClassIndex(7928);
            }
            
            public 0ng(final 0nk liz, final float liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                if (this.LIZ.LIZ(2131374217) == null) {
                    return;
                }
                this.LIZ.LIZJ = this.LIZIZ;
                ((0on)this.LIZ.LIZ(2131374217)).setCoverWidth(this.LIZIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: new             LX/0ng;
        //     4: dup            
        //     5: aload_0        
        //     6: fload_1        
        //     7: invokespecial   X/0ng.<init>:(LX/0nk;F)V
        //    10: invokevirtual   X/0nk.post:(Ljava/lang/Runnable;)Z
        //    13: pop            
        //    14: return         
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
    
    private final boolean LIZJ() {
        if (0n9.LIZ.LJIJI == null) {
            return false;
        }
        final BattleDisplayConfig ljiji = 0n9.LIZ.LJIJI;
        if (ljiji != null) {
            final int liz = ljiji.LIZ;
            if (liz > 0) {
                final BattleDisplayConfig ljiji2 = 0n9.LIZ.LJIJI;
                if (ljiji2 != null) {
                    final ExemptStrategy lizlll = ljiji2.LIZLLL;
                    if (lizlll != null) {
                        boolean b;
                        if (lizlll.LIZ && this.LJ) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        return (this.LJIIL >= liz || this.LJIILIIL >= liz) && !b && !0n9.LIZ.LJIJJ;
                    }
                }
                return this.LJIIL >= liz || this.LJIILIIL >= liz;
            }
        }
        return false;
    }
    
    private final void LIZLLL() {
        if (0n9.LIZ.LJIJI == null) {
            return;
        }
        if (!this.LIZJ()) {
            final 1ib 1ib = (1ib)this.LIZ(2131364343);
            n.LIZIZ((Object)1ib, "");
            1ib.setVisibility(8);
            final 1ib 1ib2 = (1ib)this.LIZ(2131364342);
            n.LIZIZ((Object)1ib2, "");
            1ib2.setVisibility(8);
            final 1xy 1xy = (1xy)this.LIZ(2131367537);
            n.LIZIZ((Object)1xy, "");
            1xy.setVisibility(0);
            final 1ib 1ib3 = (1ib)this.LIZ(2131370518);
            n.LIZIZ((Object)1ib3, "");
            1ib3.setVisibility(0);
            return;
        }
        if (this.LJIIL == this.LJIILIIL) {
            final 1ib 1ib4 = (1ib)this.LIZ(2131364343);
            n.LIZIZ((Object)1ib4, "");
            1ib4.setVisibility(8);
            final 1ib 1ib5 = (1ib)this.LIZ(2131364342);
            n.LIZIZ((Object)1ib5, "");
            1ib5.setVisibility(8);
            final 1xy 1xy2 = (1xy)this.LIZ(2131367537);
            n.LIZIZ((Object)1xy2, "");
            1xy2.setVisibility(8);
            final 1ib 1ib6 = (1ib)this.LIZ(2131370518);
            n.LIZIZ((Object)1ib6, "");
            1ib6.setVisibility(8);
            return;
        }
        final BattleDisplayConfig ljiji = 0n9.LIZ.LJIJI;
        int liziz;
        if (ljiji != null) {
            liziz = ljiji.LIZIZ;
        }
        else {
            liziz = 0;
        }
        final BattleDisplayConfig ljiji2 = 0n9.LIZ.LJIJI;
        String lizj;
        if (ljiji2 == null || (lizj = ljiji2.LIZJ) == null) {
            lizj = "";
        }
        final int ljiil = this.LJIIL;
        final int ljiiliil = this.LJIILIIL;
        if (ljiil < ljiiliil) {
            final 1ib 1ib7 = (1ib)this.LIZ(2131364343);
            n.LIZIZ((Object)1ib7, "");
            1ib7.setVisibility(0);
            if (this.getAbsDiffScore() >= liziz) {
                final 1ib 1ib8 = (1ib)this.LIZ(2131364343);
                n.LIZIZ((Object)1ib8, "");
                1ib8.setText((CharSequence)0cB.LIZ(2131830980, lizj));
            }
            else {
                final 1ib 1ib9 = (1ib)this.LIZ(2131364343);
                n.LIZIZ((Object)1ib9, "");
                1ib9.setText((CharSequence)0cB.LIZ(2131830980, String.valueOf(this.getAbsDiffScore())));
            }
            final 1ib 1ib10 = (1ib)this.LIZ(2131364342);
            n.LIZIZ((Object)1ib10, "");
            1ib10.setVisibility(8);
        }
        else {
            if (ljiil <= ljiiliil) {
                return;
            }
            final 1ib 1ib11 = (1ib)this.LIZ(2131364343);
            n.LIZIZ((Object)1ib11, "");
            1ib11.setVisibility(8);
            final 1ib 1ib12 = (1ib)this.LIZ(2131364342);
            n.LIZIZ((Object)1ib12, "");
            1ib12.setVisibility(0);
            if (this.getAbsDiffScore() >= liziz) {
                final 1ib 1ib13 = (1ib)this.LIZ(2131364342);
                n.LIZIZ((Object)1ib13, "");
                1ib13.setText((CharSequence)0cB.LIZ(2131830979, lizj));
            }
            else {
                final 1ib 1ib14 = (1ib)this.LIZ(2131364342);
                n.LIZIZ((Object)1ib14, "");
                1ib14.setText((CharSequence)0cB.LIZ(2131830979, String.valueOf(this.getAbsDiffScore())));
            }
        }
        final 1xy 1xy3 = (1xy)this.LIZ(2131367537);
        n.LIZIZ((Object)1xy3, "");
        1xy3.setVisibility(8);
        final 1ib 1ib15 = (1ib)this.LIZ(2131370518);
        n.LIZIZ((Object)1ib15, "");
        1ib15.setVisibility(8);
    }
    
    private final void LJ() {
        0cb.LIZ(this.LIZ(2131369314), "tiktok_live_interaction_resource", "live_battle_score_weak_animation.webp");
        this.LIZ(50.0f, 33.0f, 0.5f, 4.0f);
        this.LIZIZ(50.0f);
        this.LIZLLL = a.WEAK;
    }
    
    private final void LJFF() {
        0cb.LIZ(this.LIZ(2131369314), "tiktok_live_interaction_resource", "live_battle_score_strong_animation.webp");
        this.LIZ(50.0f, 28.0f, 3.0f, 0.0f);
        this.LIZIZ(50.0f);
        this.LIZLLL = a.STRONG;
    }
    
    private final int getAbsDiffScore() {
        return Math.abs(this.LJIIL - this.LJIILIIL);
    }
    
    public final View LIZ(final int n) {
        if (this.LJIILLIIL == null) {
            this.LJIILLIIL = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIILLIIL.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LJIILLIIL.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ() {
        final float liz = this.LIZ;
        String s = "live_battle_score_strive_animation.webp";
        if (liz < 0.25f) {
            s = "live_battle_score_cry_animation.webp";
        }
        else if (liz >= 0.5f) {
            if (liz != 0.5f) {
                if (liz < 0.75f) {
                    s = "live_battle_score_clap_animation.webp";
                }
                else {
                    s = "live_battle_score_tongue_animation.webp";
                }
            }
        }
        0cb.LIZ(this.LIZ(2131369314), "tiktok_live_interaction_resource", s);
        this.LIZ(28.0f, 28.0f, 0.0f, 0.0f);
        this.LIZIZ(28.0f);
        this.LIZLLL = a.EMOJI;
        this.LIZ(this.LIZ);
        final 1si 1si = (1si)this.LIZ(2131369314);
        n.LIZIZ((Object)1si, "");
        1si.setScaleX(1.0f);
        final 1si 1si2 = (1si)this.LIZ(2131369314);
        n.LIZIZ((Object)1si2, "");
        1si2.setVisibility(0);
        final 1si 1si3 = (1si)this.LIZ(2131368247);
        n.LIZIZ((Object)1si3, "");
        1si3.setVisibility(8);
    }
    
    public final void LIZ(final float n) {
        public final class 0nj implements Runnable
        {
            public final /* synthetic */ 0nk LIZ;
            public final /* synthetic */ float LIZIZ;
            
            static {
                Covode.recordClassIndex(7931);
            }
            
            public 0nj(final 0nk liz, final float liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void run() {
                if (this.LIZ.LIZ(2131369314) == null) {
                    return;
                }
                final 1si 1si = (1si)this.LIZ.LIZ(2131369314);
                ViewGroup$LayoutParams layoutParams;
                if (1si != null) {
                    layoutParams = 1si.getLayoutParams();
                }
                else {
                    layoutParams = null;
                }
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)layoutParams;
                final float n = this.LIZIZ * (this.LIZ.getWidth() - ((0on)this.LIZ.LIZ(2131374217)).getStartSpacing() * 2.0f) + ((0on)this.LIZ.LIZ(2131374217)).getStartSpacing();
                layoutParams2.gravity = 83;
                layoutParams2.leftMargin = (int)(n - 0cB.LIZ(this.LIZ.LIZJ) / 2);
                final 1si 1si2 = (1si)this.LIZ.LIZ(2131369314);
                if (1si2 != null) {
                    1si2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                }
                final FrameLayout frameLayout = (FrameLayout)this.LIZ.LIZ(2131370479);
                if (frameLayout != null) {
                    0p0.LIZ((View)frameLayout, (int)(n - 0cB.LIZ(this.LIZ.LIZJ) / 2));
                }
                final 0nk liz = this.LIZ;
                final 1ib 1ib = (1ib)liz.LIZ(2131364342);
                kotlin.jvm.internal.n.LIZIZ((Object)1ib, "");
                if (1ib.getVisibility() == 0) {
                    ((1ib)liz.LIZ(2131364342)).post((Runnable)new 0nh(liz, layoutParams2));
                    return;
                }
                final 1ib 1ib2 = (1ib)liz.LIZ(2131364343);
                kotlin.jvm.internal.n.LIZIZ((Object)1ib2, "");
                if (1ib2.getVisibility() == 0) {
                    ((1ib)liz.LIZ(2131364343)).post((Runnable)new 0ni(liz, layoutParams2));
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: new             LX/0nj;
        //     4: dup            
        //     5: aload_0        
        //     6: fload_1        
        //     7: invokespecial   X/0nj.<init>:(LX/0nk;F)V
        //    10: invokevirtual   X/0nk.post:(Ljava/lang/Runnable;)Z
        //    13: pop            
        //    14: return         
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
    
    public final void LIZ(final Gift lji) {
        if (0jR.LIZ(IGiftService.class).isFirstRechargeGift(lji.LIZLLL)) {
            ((0on)this.LIZ(2131374217)).LIZ();
            return;
        }
        this.LJII = false;
        this.LJI = lji;
        ((0on)this.LIZ(2131374217)).setPreviewValue(lji.LJFF);
    }
    
    public final void LIZ(final DataChannel ljiill, final boolean lj) {
        public final class 1xU extends F5g implements SRS<Gift, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7922);
            }
            
            public 1xU(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1xT extends F5g implements SRS<Gift, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7921);
            }
            
            public 1xT(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1xS extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7920);
            }
            
            public 1xS(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1xR extends F5g implements SRS<0nE, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7919);
            }
            
            public 1xR(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1xQ extends F5g implements SRS<0nC, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7918);
            }
            
            public 1xQ(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1xP extends F5g implements SRS<Long, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7917);
            }
            
            public 1xP(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_2        
        //     2: putfield        X/0nk.LJ:Z
        //     5: aload_0        
        //     6: aload_1        
        //     7: putfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    10: aconst_null    
        //    11: astore_3       
        //    12: aload_1        
        //    13: ifnull          216
        //    16: aload_1        
        //    17: aload_1        
        //    18: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:()LX/0CH;
        //    21: ldc_w           LX/2FE;.class
        //    24: new             LX/1xP;
        //    27: dup            
        //    28: aload_0        
        //    29: invokespecial   X/1xP.<init>:(LX/0nk;)V
        //    32: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    35: pop            
        //    36: aload_0        
        //    37: getfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    40: astore          4
        //    42: aload           4
        //    44: ifnull          274
        //    47: aload           4
        //    49: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:()LX/0CH;
        //    52: astore          4
        //    54: aload_1        
        //    55: aload           4
        //    57: ldc_w           LX/2FD;.class
        //    60: new             LX/1xQ;
        //    63: dup            
        //    64: aload_0        
        //    65: invokespecial   X/1xQ.<init>:(LX/0nk;)V
        //    68: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    71: pop            
        //    72: aload_0        
        //    73: getfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    76: astore          4
        //    78: aload           4
        //    80: ifnull          268
        //    83: aload           4
        //    85: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:()LX/0CH;
        //    88: astore          4
        //    90: aload_1        
        //    91: aload           4
        //    93: ldc_w           LX/2F0;.class
        //    96: new             LX/1xR;
        //    99: dup            
        //   100: aload_0        
        //   101: invokespecial   X/1xR.<init>:(LX/0nk;)V
        //   104: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   107: pop            
        //   108: aload_0        
        //   109: getfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   112: astore          4
        //   114: aload           4
        //   116: ifnull          262
        //   119: aload           4
        //   121: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:()LX/0CH;
        //   124: astore          4
        //   126: aload_1        
        //   127: aload           4
        //   129: ldc_w           LX/2DV;.class
        //   132: new             LX/1xS;
        //   135: dup            
        //   136: aload_0        
        //   137: invokespecial   X/1xS.<init>:(LX/0nk;)V
        //   140: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   143: pop            
        //   144: aload_0        
        //   145: getfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   148: astore          4
        //   150: aload           4
        //   152: ifnull          256
        //   155: aload           4
        //   157: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:()LX/0CH;
        //   160: astore          4
        //   162: aload_1        
        //   163: aload           4
        //   165: ldc_w           LX/2DX;.class
        //   168: new             LX/1xT;
        //   171: dup            
        //   172: aload_0        
        //   173: invokespecial   X/1xT.<init>:(LX/0nk;)V
        //   176: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   179: pop            
        //   180: aload_0        
        //   181: getfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   184: astore          4
        //   186: aload           4
        //   188: ifnull          250
        //   191: aload           4
        //   193: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:()LX/0CH;
        //   196: astore          4
        //   198: aload_1        
        //   199: aload           4
        //   201: ldc_w           LX/2DY;.class
        //   204: new             LX/1xU;
        //   207: dup            
        //   208: aload_0        
        //   209: invokespecial   X/1xU.<init>:(LX/0nk;)V
        //   212: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   215: pop            
        //   216: aload_0        
        //   217: getfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   220: astore          4
        //   222: aload_3        
        //   223: astore_1       
        //   224: aload           4
        //   226: ifnull          238
        //   229: aload           4
        //   231: ldc_w           LX/2FD;.class
        //   234: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   237: astore_1       
        //   238: aload_1        
        //   239: getstatic       X/0nC.PUNISH:LX/0nC;
        //   242: if_acmpne       280
        //   245: aload_0        
        //   246: invokevirtual   X/0nk.LIZ:()V
        //   249: return         
        //   250: aconst_null    
        //   251: astore          4
        //   253: goto            198
        //   256: aconst_null    
        //   257: astore          4
        //   259: goto            162
        //   262: aconst_null    
        //   263: astore          4
        //   265: goto            126
        //   268: aconst_null    
        //   269: astore          4
        //   271: goto            90
        //   274: aconst_null    
        //   275: astore          4
        //   277: goto            54
        //   280: aload_0        
        //   281: getfield        X/0nk.LJIILL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   284: astore_1       
        //   285: aload_1        
        //   286: ifnull          333
        //   289: aload_1        
        //   290: ldc_w           LX/2FE;.class
        //   293: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   296: checkcast       Ljava/lang/Long;
        //   299: astore_1       
        //   300: aload_1        
        //   301: ifnull          333
        //   304: aload_1        
        //   305: invokevirtual   java/lang/Number.longValue:()J
        //   308: lstore          5
        //   310: lload           5
        //   312: lconst_0       
        //   313: lcmp           
        //   314: ifeq            333
        //   317: lload           5
        //   319: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveBattleScoreAnimationTimeThresholdSetting;
        //   322: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveBattleScoreAnimationTimeThresholdSetting.getValue:()J
        //   325: lcmp           
        //   326: ifge            333
        //   329: aload_0        
        //   330: invokevirtual   X/0nk.LIZ:()V
        //   333: return         
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
    
    public final void LIZ(final boolean b) {
        final 1si 1si = (1si)this.LIZ(2131368247);
        n.LIZIZ((Object)1si, "");
        final int n = 0;
        1si.setVisibility(0);
        final 1si 1si2 = (1si)this.LIZ(2131369314);
        kotlin.jvm.internal.n.LIZIZ((Object)1si2, "");
        1si2.setVisibility(8);
        final 1ib 1ib = (1ib)this.LIZ(2131364342);
        kotlin.jvm.internal.n.LIZIZ((Object)1ib, "");
        1ib.setVisibility(8);
        final 1ib 1ib2 = (1ib)this.LIZ(2131364343);
        kotlin.jvm.internal.n.LIZIZ((Object)1ib2, "");
        1ib2.setVisibility(8);
        this.LJIILJJIL = true;
        this.LIZLLL = a.MIDDLE;
        final 1xy 1xy = (1xy)this.LIZ(2131367537);
        kotlin.jvm.internal.n.LIZIZ((Object)1xy, "");
        1xy.setText((CharSequence)"0");
        final 1ib 1ib3 = (1ib)this.LIZ(2131370518);
        kotlin.jvm.internal.n.LIZIZ((Object)1ib3, "");
        1ib3.setText((CharSequence)"0");
        this.LJIIL = 0;
        this.LJIILIIL = 0;
        this.LIZ = 0.5f;
        this.LIZIZ(50.0f);
        final 0on 0on = (0on)this.LIZ(2131374217);
        if (0on != null) {
            0on.LIZJ = 0;
            0on.LIZLLL = 0;
            0on.LIZ = 0.5f;
            0on.LIZIZ = 0on.LIZ;
            0on.LJFF = true;
            0on.LIZ();
            0on.invalidate();
        }
        Gift gift = null;
        if (b) {
            final DataChannel ljiill = this.LJIILL;
            if (ljiill != null) {
                gift = (Gift)ljiill.LIZIZ((Class)2DX.class);
            }
            final DataChannel ljiill2 = this.LJIILL;
            int booleanValue = n;
            if (ljiill2 != null) {
                final Boolean b2 = (Boolean)ljiill2.LIZIZ((Class)2DV.class);
                booleanValue = n;
                if (b2 != null) {
                    booleanValue = (((boolean)b2) ? 1 : 0);
                }
            }
            if (gift != null && booleanValue != 0) {
                this.LIZ(gift);
            }
            return;
        }
        this.LJI = null;
        this.LJII = false;
        this.removeCallbacks(this.LJIIIIZZ);
    }
    
    public final void LIZIZ() {
        final ArrayList list = new ArrayList();
        this.LIZIZ = new AnimatorSet();
        final FrameLayout frameLayout = (FrameLayout)this.LIZ(2131370479);
        n.LIZIZ((Object)frameLayout, "");
        for (int childCount = frameLayout.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = ((FrameLayout)this.LIZ(2131370479)).getChildAt(i);
            final Property translation_X = View.TRANSLATION_X;
            final 0on 0on = (0on)this.LIZ(2131374217);
            n.LIZIZ((Object)0on, "");
            final float n = (float)0on.getWidth();
            final 0on 0on2 = (0on)this.LIZ(2131374217);
            kotlin.jvm.internal.n.LIZIZ((Object)0on2, "");
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)child, translation_X, new float[] { n * -1.0f, 0on2.getWidth() * 1.0f });
            kotlin.jvm.internal.n.LIZIZ((Object)ofFloat, "");
            ofFloat.setStartDelay(i * 500L);
            ofFloat.setDuration(3500L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            list.add(ofFloat);
        }
        final AnimatorSet liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.playTogether((Collection)list);
        }
        final AnimatorSet liziz2 = this.LIZIZ;
        if (liziz2 != null) {
            liziz2.setDuration(4000L);
        }
        final AnimatorSet liziz3 = this.LIZIZ;
        if (liziz3 != null) {
            liziz3.start();
        }
    }
    
    public final DataChannel getDataChannel() {
        return this.LJIILL;
    }
    
    public final View getLeftTextView() {
        final 1xy 1xy = (1xy)this.LIZ(2131367537);
        n.LIZIZ((Object)1xy, "");
        return (View)1xy;
    }
    
    public final int getLeftValue() {
        final 0on 0on = (0on)this.LIZ(2131374217);
        if (0on != null) {
            return 0on.getLeftValue();
        }
        return 0;
    }
    
    public final View getRightTextView() {
        final 1ib 1ib = (1ib)this.LIZ(2131370518);
        n.LIZIZ((Object)1ib, "");
        return (View)1ib;
    }
    
    public final int getRightValue() {
        final 0on 0on = (0on)this.LIZ(2131374217);
        if (0on != null) {
            return 0on.getRightValue();
        }
        return 0;
    }
    
    public final void onAttachedToWindow() {
        public final class 1xO extends F5g implements SRS<Float, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7916);
            }
            
            public 1xO(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 1xN extends F5g implements SRS<Float, 2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            
            static {
                Covode.recordClassIndex(7915);
            }
            
            public 1xN(final 0nk liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   android/widget/FrameLayout.onAttachedToWindow:()V
        //     4: aload_0        
        //     5: ldc             2131374217
        //     7: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //    10: checkcast       LX/0on;
        //    13: astore_1       
        //    14: new             LX/1xN;
        //    17: dup            
        //    18: aload_0        
        //    19: invokespecial   X/1xN.<init>:(LX/0nk;)V
        //    22: astore_2       
        //    23: new             LX/1xO;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   X/1xO.<init>:(LX/0nk;)V
        //    31: astore_3       
        //    32: aload_1        
        //    33: aload_2        
        //    34: putfield        X/0on.LJI:LX/SRS;
        //    37: aload_1        
        //    38: aload_3        
        //    39: putfield        X/0on.LJII:LX/SRS;
        //    42: aload_0        
        //    43: ldc             50.0
        //    45: invokespecial   X/0nk.LIZIZ:(F)V
        //    48: return         
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
    
    public final void setAnchor(final boolean lj) {
        this.LJ = lj;
    }
    
    public final void setDataChannel(final DataChannel ljiill) {
        this.LJIILL = ljiill;
    }
    
    public final void setLeftData(final 1Ql 1Ql) {
        public final class 1xV extends F5g implements QgG<2P9>
        {
            public final /* synthetic */ 0nk LIZ;
            public final /* synthetic */ 2w5 LIZIZ;
            
            static {
                Covode.recordClassIndex(7923);
            }
            
            public 1xV(final 0nk liz, final 2w5 liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                super(0);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_1        
        //     5: getfield        X/1Ql.LIZ:I
        //     8: istore_2       
        //     9: aload_0        
        //    10: invokespecial   X/0nk.LIZJ:()Z
        //    13: istore_3       
        //    14: iconst_0       
        //    15: istore          4
        //    17: iload_3        
        //    18: ifne            393
        //    21: aload_0        
        //    22: ldc_w           2131367537
        //    25: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //    28: checkcast       LX/1xy;
        //    31: astore          5
        //    33: aload           5
        //    35: ldc             ""
        //    37: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    40: aload           5
        //    42: iconst_0       
        //    43: invokevirtual   X/1xy.setVisibility:(I)V
        //    46: new             LX/2w5;
        //    49: dup            
        //    50: invokespecial   X/2w5.<init>:()V
        //    53: astore          5
        //    55: aload           5
        //    57: iconst_0       
        //    58: putfield        X/2w5.element:I
        //    61: invokestatic    X/Fk2.LIZ:()LX/Fk2;
        //    64: invokevirtual   X/Fk2.LIZIZ:()LX/GIK;
        //    67: astore          6
        //    69: aload           6
        //    71: ifnull          387
        //    74: aload           6
        //    76: invokeinterface X/GIK.LIZJ:()J
        //    81: lstore          7
        //    83: aload_0        
        //    84: getfield        X/0nk.LJI:Lcom/bytedance/android/livesdk/model/Gift;
        //    87: astore          6
        //    89: aload           6
        //    91: ifnull          381
        //    94: aload           6
        //    96: getfield        com/bytedance/android/livesdk/model/Gift.LIZLLL:J
        //    99: lstore          9
        //   101: aload_1        
        //   102: getfield        X/1Ql.LIZIZ:J
        //   105: lconst_0       
        //   106: lcmp           
        //   107: ifle            375
        //   110: aload_1        
        //   111: getfield        X/1Ql.LIZJ:J
        //   114: lconst_0       
        //   115: lcmp           
        //   116: ifle            375
        //   119: aload_1        
        //   120: getfield        X/1Ql.LIZIZ:J
        //   123: lload           7
        //   125: lcmp           
        //   126: ifne            375
        //   129: aload_1        
        //   130: getfield        X/1Ql.LIZJ:J
        //   133: lload           9
        //   135: lcmp           
        //   136: ifne            375
        //   139: iconst_1       
        //   140: istore          11
        //   142: aload_0        
        //   143: getfield        X/0nk.LJI:Lcom/bytedance/android/livesdk/model/Gift;
        //   146: astore_1       
        //   147: aload_1        
        //   148: ifnull          366
        //   151: aload_1        
        //   152: getfield        com/bytedance/android/livesdk/model/Gift.LJFF:I
        //   155: istore          12
        //   157: iload           12
        //   159: istore          13
        //   161: iload           12
        //   163: ifle            369
        //   166: iload           12
        //   168: istore          13
        //   170: iload           12
        //   172: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/match/LiveMatchPreviewSmallGiftSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/match/LiveMatchPreviewSmallGiftSetting;
        //   175: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/match/LiveMatchPreviewSmallGiftSetting.getValue:()I
        //   178: if_icmpge       369
        //   181: iconst_1       
        //   182: istore          14
        //   184: iload           12
        //   186: istore          13
        //   188: iload           14
        //   190: istore          12
        //   192: iload           11
        //   194: ifne            202
        //   197: iload           12
        //   199: ifeq            209
        //   202: aload           5
        //   204: iload           13
        //   206: putfield        X/2w5.element:I
        //   209: aload_0        
        //   210: iload_2        
        //   211: aload_0        
        //   212: ldc             2131374217
        //   214: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //   217: checkcast       LX/0on;
        //   220: invokevirtual   X/0on.getRightValue:()I
        //   223: invokespecial   X/0nk.LIZ:(II)V
        //   226: aload_0        
        //   227: iconst_1       
        //   228: iload_2        
        //   229: invokespecial   X/0nk.LIZ:(ZI)V
        //   232: aload_0        
        //   233: ldc             2131374217
        //   235: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //   238: checkcast       LX/0on;
        //   241: astore_1       
        //   242: aload_1        
        //   243: ifnull          340
        //   246: aload           5
        //   248: getfield        X/2w5.element:I
        //   251: istore          13
        //   253: new             LX/1xV;
        //   256: dup            
        //   257: aload_0        
        //   258: aload           5
        //   260: invokespecial   X/1xV.<init>:(LX/0nk;LX/2w5;)V
        //   263: astore          5
        //   265: aload           5
        //   267: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //   270: aload_1        
        //   271: iconst_0       
        //   272: putfield        X/0on.LJFF:Z
        //   275: aload_1        
        //   276: iload_2        
        //   277: putfield        X/0on.LIZJ:I
        //   280: aload_1        
        //   281: getfield        X/0on.LIZLLL:I
        //   284: aload_1        
        //   285: getfield        X/0on.LIZJ:I
        //   288: iadd           
        //   289: ifne            341
        //   292: aload_1        
        //   293: iconst_1       
        //   294: putfield        X/0on.LJFF:Z
        //   297: aload_1        
        //   298: ldc             0.5
        //   300: invokestatic    X/0on.LIZ:(LX/0on;F)V
        //   303: iload           13
        //   305: ifle            334
        //   308: aload_1        
        //   309: aload_1        
        //   310: getfield        X/0on.LJ:I
        //   313: iload           13
        //   315: isub           
        //   316: putfield        X/0on.LJ:I
        //   319: aload_1        
        //   320: getfield        X/0on.LJ:I
        //   323: ifgt            331
        //   326: aload_1        
        //   327: iconst_0       
        //   328: putfield        X/0on.LJ:I
        //   331: iconst_1       
        //   332: istore          4
        //   334: aload_1        
        //   335: iload           4
        //   337: invokevirtual   X/0on.LIZ:(Z)V
        //   340: return         
        //   341: aload_1        
        //   342: aload_1        
        //   343: getfield        X/0on.LIZJ:I
        //   346: i2f            
        //   347: aload_1        
        //   348: getfield        X/0on.LIZJ:I
        //   351: aload_1        
        //   352: getfield        X/0on.LIZLLL:I
        //   355: iadd           
        //   356: i2f            
        //   357: fdiv           
        //   358: aload           5
        //   360: invokevirtual   X/0on.LIZ:(FLX/QgG;)V
        //   363: goto            303
        //   366: iconst_0       
        //   367: istore          13
        //   369: iconst_0       
        //   370: istore          12
        //   372: goto            192
        //   375: iconst_0       
        //   376: istore          11
        //   378: goto            142
        //   381: lconst_0       
        //   382: lstore          9
        //   384: goto            101
        //   387: lconst_0       
        //   388: lstore          7
        //   390: goto            83
        //   393: aload_0        
        //   394: ldc_w           2131367537
        //   397: invokevirtual   X/0nk.LIZ:(I)Landroid/view/View;
        //   400: checkcast       LX/1xy;
        //   403: astore          5
        //   405: aload           5
        //   407: ldc             ""
        //   409: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   412: aload           5
        //   414: bipush          8
        //   416: invokevirtual   X/1xy.setVisibility:(I)V
        //   419: goto            46
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
    
    public final void setRightValue(final int rightValue) {
        if (!this.LIZJ()) {
            final 1ib 1ib = (1ib)this.LIZ(2131370518);
            n.LIZIZ((Object)1ib, "");
            1ib.setVisibility(0);
        }
        else {
            final 1ib 1ib2 = (1ib)this.LIZ(2131370518);
            n.LIZIZ((Object)1ib2, "");
            1ib2.setVisibility(8);
        }
        this.LIZ(((0on)this.LIZ(2131374217)).getLeftValue(), rightValue);
        this.LIZ(false, rightValue);
        final 0on 0on = (0on)this.LIZ(2131374217);
        if (0on != null) {
            0on.setRightValue(rightValue);
        }
    }
    
    public enum a
    {
        EMOJI, 
        MIDDLE, 
        STRONG, 
        WEAK;
        
        static {
            Covode.recordClassIndex(7913);
        }
    }
}
