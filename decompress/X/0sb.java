// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.animation.ObjectAnimator;
import java.util.List;

public final class 0sb
{
    public static boolean LJIIIZ;
    public List<ObjectAnimator> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final SRT<VzU, 1Wh<1Wj>, 2P9> LJ;
    public final DataChannel LJFF;
    public final 1Uo LJI;
    public final 0CH LJII;
    public final Room LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(8938);
    }
    
    public 0sb(final DataChannel ljff, final 1Uo lji, final 0CH ljii, final Room ljiiiizz) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_3        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: aload_1        
        //    11: putfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    14: aload_0        
        //    15: aload_2        
        //    16: putfield        X/0sb.LJI:LX/1Uo;
        //    19: aload_0        
        //    20: aload_3        
        //    21: putfield        X/0sb.LJII:LX/0CH;
        //    24: aload_0        
        //    25: aload           4
        //    27: putfield        X/0sb.LJIIIIZZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    30: aload_0        
        //    31: new             Ljava/util/ArrayList;
        //    34: dup            
        //    35: invokespecial   java/util/ArrayList.<init>:()V
        //    38: putfield        X/0sb.LIZ:Ljava/util/List;
        //    41: aload_0        
        //    42: new             LX/220;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   X/220.<init>:(LX/0sb;)V
        //    50: putfield        X/0sb.LJ:LX/SRT;
        //    53: return         
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
    
    private final void LIZ(final GOH goh) {
        public final class 0sS implements Animator$AnimatorListener
        {
            public final /* synthetic */ View LIZ;
            public final /* synthetic */ 0sb LIZIZ;
            public final /* synthetic */ GOH LIZJ;
            
            static {
                Covode.recordClassIndex(8939);
            }
            
            public 0sS(final View liz, final 0sb liziz, final GOH lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            public final void onAnimationCancel(final Animator animator) {
                this.LIZ.setAlpha(1.0f);
            }
            
            public final void onAnimationEnd(final Animator animator) {
            }
            
            public final void onAnimationRepeat(final Animator animator) {
            }
            
            public final void onAnimationStart(final Animator animator) {
                if (this.LIZJ == GOH.MULTIGUEST) {
                    0tO.LIZIZ(this.LIZIZ.LJIIIIZZ, this.LIZIZ.LJFF);
                }
                else {
                    this.LIZJ.show(this.LIZIZ.LJFF);
                }
                this.LIZ.setAlpha(0.0f);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     5: invokevirtual   X/GOH.getView:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Landroid/view/View;
        //     8: astore_2       
        //     9: aload_2        
        //    10: ifnull          115
        //    13: aload_0        
        //    14: getfield        X/0sb.LIZ:Ljava/util/List;
        //    17: astore_3       
        //    18: aload_2        
        //    19: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //    22: iconst_2       
        //    23: newarray        F
        //    25: dup            
        //    26: iconst_0       
        //    27: fconst_0       
        //    28: fastore        
        //    29: dup            
        //    30: iconst_1       
        //    31: fconst_1       
        //    32: fastore        
        //    33: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //    36: astore          4
        //    38: aload_0        
        //    39: getfield        X/0sb.LIZIZ:Z
        //    42: ifeq            116
        //    45: fconst_0       
        //    46: fconst_0       
        //    47: ldc             0.58
        //    49: fconst_1       
        //    50: invokestatic    X/07s.LIZ:(FFFF)Landroid/view/animation/Interpolator;
        //    53: astore          5
        //    55: aload           4
        //    57: aload           5
        //    59: invokevirtual   android/animation/ObjectAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //    62: aload           4
        //    64: ldc2_w          400
        //    67: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    70: pop            
        //    71: aload           4
        //    73: new             LX/0sS;
        //    76: dup            
        //    77: aload_2        
        //    78: aload_0        
        //    79: aload_1        
        //    80: invokespecial   X/0sS.<init>:(Landroid/view/View;LX/0sb;LX/GOH;)V
        //    83: invokevirtual   android/animation/ObjectAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    86: aload           4
        //    88: ldc2_w          100
        //    91: invokevirtual   android/animation/ObjectAnimator.setStartDelay:(J)V
        //    94: aload           4
        //    96: invokevirtual   android/animation/ObjectAnimator.start:()V
        //    99: aload           4
        //   101: ldc             ""
        //   103: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   106: aload_3        
        //   107: aload           4
        //   109: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   114: pop            
        //   115: return         
        //   116: ldc             0.25
        //   118: ldc             0.1
        //   120: ldc             0.25
        //   122: fconst_1       
        //   123: invokestatic    X/07s.LIZ:(FFFF)Landroid/view/animation/Interpolator;
        //   126: astore          5
        //   128: goto            55
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
    
    public final void LIZ() {
        public final class 0sa implements Runnable
        {
            public final /* synthetic */ 0sb LIZ;
            
            static {
                Covode.recordClassIndex(8949);
            }
            
            public 0sa(final 0sb liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                GOH.MULTI_GUEST_MANAGE.unload(this.LIZ.LJFF);
            }
        }
        public final class 0sZ implements Runnable
        {
            public final /* synthetic */ 0sb LIZ;
            
            static {
                Covode.recordClassIndex(8948);
            }
            
            public 0sZ(final 0sb liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                GOH.MULTI_GUEST_MIC.unload(this.LIZ.LJFF);
            }
        }
        public final class 0sY implements Runnable
        {
            public final /* synthetic */ 0sb LIZ;
            
            static {
                Covode.recordClassIndex(8947);
            }
            
            public 0sY(final 0sb liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                GOH.MULTI_GUEST_VIDEO.unload(this.LIZ.LJFF);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: putstatic       X/0sb.LJIIIZ:Z
        //     4: aload_0        
        //     5: getstatic       X/GOH.MULTI_GUEST_VIDEO:LX/GOH;
        //     8: new             LX/0sY;
        //    11: dup            
        //    12: aload_0        
        //    13: invokespecial   X/0sY.<init>:(LX/0sb;)V
        //    16: invokevirtual   X/0sb.LIZ:(LX/GOH;Ljava/lang/Runnable;)V
        //    19: aload_0        
        //    20: getstatic       X/GOH.MULTI_GUEST_MIC:LX/GOH;
        //    23: new             LX/0sZ;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   X/0sZ.<init>:(LX/0sb;)V
        //    31: invokevirtual   X/0sb.LIZ:(LX/GOH;Ljava/lang/Runnable;)V
        //    34: aload_0        
        //    35: getstatic       X/GOH.MULTI_GUEST_MANAGE:LX/GOH;
        //    38: new             LX/0sa;
        //    41: dup            
        //    42: aload_0        
        //    43: invokespecial   X/0sa.<init>:(LX/0sb;)V
        //    46: invokevirtual   X/0sb.LIZ:(LX/GOH;Ljava/lang/Runnable;)V
        //    49: aload_0        
        //    50: getfield        X/0sb.LIZJ:Z
        //    53: ifne            184
        //    56: aload_0        
        //    57: getstatic       X/GOH.MULTIGUEST:LX/GOH;
        //    60: invokespecial   X/0sb.LIZ:(LX/GOH;)V
        //    63: aload_0        
        //    64: getfield        X/0sb.LIZLLL:Z
        //    67: ifeq            77
        //    70: aload_0        
        //    71: getstatic       X/GOH.QUESTION:LX/GOH;
        //    74: invokespecial   X/0sb.LIZ:(LX/GOH;)V
        //    77: aload_0        
        //    78: getfield        X/0sb.LJIIIIZZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    81: ifnull          169
        //    84: ldc             Lcom/bytedance/android/live/function/IRoomFunctionService;.class
        //    86: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //    89: checkcast       Lcom/bytedance/android/live/function/IRoomFunctionService;
        //    92: invokeinterface com/bytedance/android/live/function/IRoomFunctionService.getCustomPollManager:()LX/0is;
        //    97: astore_1       
        //    98: aload_1        
        //    99: ifnull          169
        //   102: aload_1        
        //   103: aload_0        
        //   104: getfield        X/0sb.LJIIIIZZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   107: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //   110: invokeinterface X/0is.LIZ:(J)Z
        //   115: iconst_1       
        //   116: if_icmpne       169
        //   119: getstatic       X/GOH.CUSTOM_POLL:LX/GOH;
        //   122: aload_0        
        //   123: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   126: invokevirtual   X/GOH.isShowing:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Z
        //   129: ifne            169
        //   132: getstatic       X/GOH.CUSTOM_POLL:LX/GOH;
        //   135: aload_0        
        //   136: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   139: invokevirtual   X/GOH.isShowingInInteractionDialog:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Z
        //   142: ifne            169
        //   145: ldc             Lcom/bytedance/android/live/function/IRoomFunctionService;.class
        //   147: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   150: checkcast       Lcom/bytedance/android/live/function/IRoomFunctionService;
        //   153: aload_0        
        //   154: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   157: invokeinterface com/bytedance/android/live/function/IRoomFunctionService.loadCustomPollBehavior:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //   162: aload_0        
        //   163: getstatic       X/GOH.CUSTOM_POLL:LX/GOH;
        //   166: invokespecial   X/0sb.LIZ:(LX/GOH;)V
        //   169: aload_0        
        //   170: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   173: ldc             LX/2B8;.class
        //   175: iconst_0       
        //   176: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   179: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   182: pop            
        //   183: return         
        //   184: getstatic       X/GOH.MULTIGUEST:LX/GOH;
        //   187: aload_0        
        //   188: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   191: invokevirtual   X/GOH.getView:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Landroid/view/View;
        //   194: astore_1       
        //   195: aload_1        
        //   196: ifnull          63
        //   199: aload_1        
        //   200: fconst_1       
        //   201: invokevirtual   android/view/View.setAlpha:(F)V
        //   204: aload_0        
        //   205: getfield        X/0sb.LJIIIIZZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   208: aload_0        
        //   209: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   212: invokestatic    X/0tO.LIZIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //   215: goto            63
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
    
    public final void LIZ(final GOH goh, final GOM gom) {
        goh.load(this.LJFF, gom);
        goh.hide(this.LJFF);
        this.LIZ(goh);
    }
    
    public final void LIZ(final GOH goh, final Runnable runnable) {
        public final class 0sT implements Animator$AnimatorListener
        {
            public final /* synthetic */ View LIZ;
            public final /* synthetic */ Runnable LIZIZ;
            
            static {
                Covode.recordClassIndex(8940);
            }
            
            public 0sT(final View liz, final Runnable liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
                this.LIZ.setAlpha(0.0f);
                this.LIZIZ.run();
            }
            
            public final void onAnimationEnd(final Animator animator) {
                this.LIZIZ.run();
            }
            
            public final void onAnimationRepeat(final Animator animator) {
            }
            
            public final void onAnimationStart(final Animator animator) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        X/0sb.LJFF:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //     5: invokevirtual   X/GOH.getView:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Landroid/view/View;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnull          106
        //    13: aload_0        
        //    14: getfield        X/0sb.LIZ:Ljava/util/List;
        //    17: astore          4
        //    19: aload_3        
        //    20: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //    23: iconst_2       
        //    24: newarray        F
        //    26: dup            
        //    27: iconst_0       
        //    28: fconst_1       
        //    29: fastore        
        //    30: dup            
        //    31: iconst_1       
        //    32: fconst_0       
        //    33: fastore        
        //    34: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //    37: astore          5
        //    39: aload_0        
        //    40: getfield        X/0sb.LIZIZ:Z
        //    43: ifeq            107
        //    46: fconst_0       
        //    47: fconst_0       
        //    48: ldc             0.58
        //    50: fconst_1       
        //    51: invokestatic    X/07s.LIZ:(FFFF)Landroid/view/animation/Interpolator;
        //    54: astore_1       
        //    55: aload           5
        //    57: aload_1        
        //    58: invokevirtual   android/animation/ObjectAnimator.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //    61: aload           5
        //    63: ldc2_w          250
        //    66: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //    69: pop            
        //    70: aload           5
        //    72: new             LX/0sT;
        //    75: dup            
        //    76: aload_3        
        //    77: aload_2        
        //    78: invokespecial   X/0sT.<init>:(Landroid/view/View;Ljava/lang/Runnable;)V
        //    81: invokevirtual   android/animation/ObjectAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //    84: aload           5
        //    86: invokevirtual   android/animation/ObjectAnimator.start:()V
        //    89: aload           5
        //    91: ldc             ""
        //    93: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    96: aload           4
        //    98: aload           5
        //   100: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   105: pop            
        //   106: return         
        //   107: ldc             0.25
        //   109: ldc             0.1
        //   111: ldc             0.25
        //   113: fconst_1       
        //   114: invokestatic    X/07s.LIZ:(FFFF)Landroid/view/animation/Interpolator;
        //   117: astore_1       
        //   118: goto            55
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
}
