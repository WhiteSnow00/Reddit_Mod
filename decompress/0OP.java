// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.live.base.model.ImageModel;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import android.animation.TimeInterpolator;
import android.view.animation.PathInterpolator;
import android.animation.ObjectAnimator;
import kotlin.jvm.internal.n;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.io.PrintStream;
import android.util.Log;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public final class 0op extends FrameLayout
{
    public AnimatorSet LIZ;
    public HashMap LIZIZ;
    
    static {
        Covode.recordClassIndex(8033);
    }
    
    public 0op(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0op(final Context context, final AttributeSet set, final char c) {
        CTM.LIZ((Object)context);
        super(context, set, 0);
        MethodCollector.i(9317);
        0II.LIZ(LayoutInflater.from(context), 2131562189, (ViewGroup)this, true);
        MethodCollector.o(9317);
    }
    
    private final void LIZ() {
        final AnimatorSet liz = this.LIZ;
        if (liz != null && liz.isRunning()) {
            final AnimatorSet liz2 = this.LIZ;
            if (liz2 != null) {
                LIZ(liz2);
            }
            final AnimatorSet liz3 = this.LIZ;
            if (liz3 != null) {
                liz3.end();
            }
            this.LIZ = null;
        }
    }
    
    public static void LIZ(final AnimatorSet set) {
        if (!7rv.LIZ.LIZ()) {
            set.removeAllListeners();
            return;
        }
        final PrintStream err = System.err;
        final StringBuilder sb = new StringBuilder("AnimatorLancet:::");
        sb.append(Log.getStackTraceString((Throwable)new Exception()));
        err.println(sb.toString());
        set.removeAllListeners();
    }
    
    public final View LIZ(final int n) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZIZ.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LIZIZ.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ(final QgG<2P9> qgG, final QgG<2P9> qgG2) {
        public final class 0oo implements Animator$AnimatorListener
        {
            public final /* synthetic */ QgG LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(8037);
            }
            
            public 0oo(final QgG liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onAnimationCancel(final Animator animator) {
            }
            
            public final void onAnimationEnd(final Animator animator) {
                final QgG liz = this.LIZ;
                if (liz != null) {
                    liz.invoke();
                }
            }
            
            public final void onAnimationRepeat(final Animator animator) {
            }
            
            public final void onAnimationStart(final Animator animator) {
                final QgG liziz = this.LIZIZ;
                if (liziz != null) {
                    liziz.invoke();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/0op.LIZ:()V
        //     4: new             LX/1xv;
        //     7: dup            
        //     8: aload_0        
        //     9: invokespecial   X/1xv.<init>:(LX/0op;)V
        //    12: astore_3       
        //    13: new             LX/1xw;
        //    16: dup            
        //    17: aload_0        
        //    18: invokespecial   X/1xw.<init>:(LX/0op;)V
        //    21: astore          4
        //    23: new             LX/1xx;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   X/1xx.<init>:(LX/0op;)V
        //    31: astore          5
        //    33: aload_0        
        //    34: ldc             2131367367
        //    36: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //    39: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //    42: astore          6
        //    44: aload           6
        //    46: ldc             ""
        //    48: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    51: aload_0        
        //    52: ldc             2131367368
        //    54: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //    57: checkcast       LX/1si;
        //    60: astore          7
        //    62: aload           7
        //    64: ldc             ""
        //    66: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    69: aload_3        
        //    70: aload           6
        //    72: aload           7
        //    74: invokevirtual   X/1xv.LIZ:(Landroidx/constraintlayout/widget/ConstraintLayout;LX/1si;)V
        //    77: aload_0        
        //    78: ldc             2131367426
        //    80: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //    83: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //    86: astore          6
        //    88: aload           6
        //    90: ldc             ""
        //    92: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    95: aload_0        
        //    96: ldc             2131367427
        //    98: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   101: checkcast       LX/1si;
        //   104: astore          7
        //   106: aload           7
        //   108: ldc             ""
        //   110: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   113: aload_3        
        //   114: aload           6
        //   116: aload           7
        //   118: invokevirtual   X/1xv.LIZ:(Landroidx/constraintlayout/widget/ConstraintLayout;LX/1si;)V
        //   121: aload_0        
        //   122: ldc             2131373266
        //   124: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   127: checkcast       LX/1ib;
        //   130: astore_3       
        //   131: aload_3        
        //   132: ldc             ""
        //   134: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   137: aload           4
        //   139: aload_3        
        //   140: invokevirtual   X/1xw.LIZ:(LX/1ib;)V
        //   143: aload_0        
        //   144: ldc             2131373484
        //   146: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   149: checkcast       LX/1ib;
        //   152: astore_3       
        //   153: aload_3        
        //   154: ldc             ""
        //   156: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   159: aload           4
        //   161: aload_3        
        //   162: invokevirtual   X/1xw.LIZ:(LX/1ib;)V
        //   165: aload_0        
        //   166: ldc             2131366982
        //   168: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   171: checkcast       LX/7wT;
        //   174: astore          4
        //   176: aload           4
        //   178: ldc             ""
        //   180: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   183: aload           5
        //   185: aload           4
        //   187: invokevirtual   X/1xx.LIZ:(LX/7wT;)V
        //   190: aload_0        
        //   191: ldc             2131367094
        //   193: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   196: checkcast       LX/7wT;
        //   199: astore          4
        //   201: aload           4
        //   203: ldc             ""
        //   205: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   208: aload           5
        //   210: aload           4
        //   212: invokevirtual   X/1xx.LIZ:(LX/7wT;)V
        //   215: new             Landroid/animation/AnimatorSet;
        //   218: dup            
        //   219: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   222: astore          5
        //   224: aload_0        
        //   225: aload           5
        //   227: putfield        X/0op.LIZ:Landroid/animation/AnimatorSet;
        //   230: aload_0        
        //   231: ldc             2131367367
        //   233: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   236: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //   239: astore          4
        //   241: aload           4
        //   243: ldc             ""
        //   245: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   248: aload           4
        //   250: fconst_1       
        //   251: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setAlpha:(F)V
        //   254: aload_0        
        //   255: ldc             2131367426
        //   257: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   260: checkcast       Landroidx/constraintlayout/widget/ConstraintLayout;
        //   263: astore          4
        //   265: aload           4
        //   267: ldc             ""
        //   269: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   272: aload           4
        //   274: fconst_1       
        //   275: invokevirtual   androidx/constraintlayout/widget/ConstraintLayout.setAlpha:(F)V
        //   278: new             Landroid/animation/AnimatorSet;
        //   281: dup            
        //   282: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   285: astore          4
        //   287: aload_0        
        //   288: ldc             2131367367
        //   290: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   293: getstatic       android/view/View.TRANSLATION_X:Landroid/util/Property;
        //   296: iconst_2       
        //   297: newarray        F
        //   299: dup            
        //   300: iconst_0       
        //   301: ldc             -200.0
        //   303: fastore        
        //   304: dup            
        //   305: iconst_1       
        //   306: fconst_0       
        //   307: fastore        
        //   308: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   311: astore          6
        //   313: aload           6
        //   315: ldc             ""
        //   317: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   320: aload_0        
        //   321: ldc             2131367426
        //   323: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   326: getstatic       android/view/View.TRANSLATION_X:Landroid/util/Property;
        //   329: iconst_2       
        //   330: newarray        F
        //   332: dup            
        //   333: iconst_0       
        //   334: ldc             200.0
        //   336: fastore        
        //   337: dup            
        //   338: iconst_1       
        //   339: fconst_0       
        //   340: fastore        
        //   341: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   344: astore_3       
        //   345: aload_3        
        //   346: ldc             ""
        //   348: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   351: aload           4
        //   353: iconst_2       
        //   354: anewarray       Landroid/animation/Animator;
        //   357: dup            
        //   358: iconst_0       
        //   359: aload           6
        //   361: aastore        
        //   362: dup            
        //   363: iconst_1       
        //   364: aload_3        
        //   365: aastore        
        //   366: invokevirtual   android/animation/AnimatorSet.playTogether:([Landroid/animation/Animator;)V
        //   369: aload           4
        //   371: ldc2_w          640
        //   374: invokevirtual   android/animation/AnimatorSet.setDuration:(J)Landroid/animation/AnimatorSet;
        //   377: pop            
        //   378: aload           4
        //   380: new             Landroid/view/animation/PathInterpolator;
        //   383: dup            
        //   384: ldc             0.32
        //   386: ldc             0.94
        //   388: fconst_0       
        //   389: fconst_1       
        //   390: invokespecial   android/view/animation/PathInterpolator.<init>:(FFFF)V
        //   393: invokevirtual   android/animation/AnimatorSet.setInterpolator:(Landroid/animation/TimeInterpolator;)V
        //   396: aload           4
        //   398: invokevirtual   android/animation/AnimatorSet.start:()V
        //   401: new             Landroid/animation/AnimatorSet;
        //   404: dup            
        //   405: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   408: astore_3       
        //   409: aload_0        
        //   410: ldc             2131367367
        //   412: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   415: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   418: iconst_2       
        //   419: newarray        F
        //   421: dup            
        //   422: iconst_0       
        //   423: fconst_1       
        //   424: fastore        
        //   425: dup            
        //   426: iconst_1       
        //   427: fconst_1       
        //   428: fastore        
        //   429: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   432: astore          7
        //   434: aload           7
        //   436: ldc             ""
        //   438: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   441: aload_0        
        //   442: ldc             2131367426
        //   444: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   447: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   450: iconst_2       
        //   451: newarray        F
        //   453: dup            
        //   454: iconst_0       
        //   455: fconst_1       
        //   456: fastore        
        //   457: dup            
        //   458: iconst_1       
        //   459: fconst_1       
        //   460: fastore        
        //   461: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   464: astore          6
        //   466: aload           6
        //   468: ldc             ""
        //   470: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   473: aload_3        
        //   474: iconst_2       
        //   475: anewarray       Landroid/animation/Animator;
        //   478: dup            
        //   479: iconst_0       
        //   480: aload           7
        //   482: aastore        
        //   483: dup            
        //   484: iconst_1       
        //   485: aload           6
        //   487: aastore        
        //   488: invokevirtual   android/animation/AnimatorSet.playTogether:([Landroid/animation/Animator;)V
        //   491: aload_3        
        //   492: ldc2_w          1480
        //   495: invokevirtual   android/animation/AnimatorSet.setDuration:(J)Landroid/animation/AnimatorSet;
        //   498: pop            
        //   499: new             Landroid/animation/AnimatorSet;
        //   502: dup            
        //   503: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   506: astore          7
        //   508: aload_0        
        //   509: ldc             2131367367
        //   511: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   514: getstatic       android/view/View.TRANSLATION_X:Landroid/util/Property;
        //   517: iconst_2       
        //   518: newarray        F
        //   520: dup            
        //   521: iconst_0       
        //   522: fconst_0       
        //   523: fastore        
        //   524: dup            
        //   525: iconst_1       
        //   526: ldc             -200.0
        //   528: fastore        
        //   529: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   532: astore          8
        //   534: aload           8
        //   536: ldc             ""
        //   538: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   541: aload_0        
        //   542: ldc             2131367367
        //   544: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   547: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   550: iconst_2       
        //   551: newarray        F
        //   553: dup            
        //   554: iconst_0       
        //   555: fconst_1       
        //   556: fastore        
        //   557: dup            
        //   558: iconst_1       
        //   559: fconst_0       
        //   560: fastore        
        //   561: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   564: astore          9
        //   566: aload           9
        //   568: ldc             ""
        //   570: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   573: aload_0        
        //   574: ldc             2131367426
        //   576: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   579: getstatic       android/view/View.TRANSLATION_X:Landroid/util/Property;
        //   582: iconst_2       
        //   583: newarray        F
        //   585: dup            
        //   586: iconst_0       
        //   587: fconst_0       
        //   588: fastore        
        //   589: dup            
        //   590: iconst_1       
        //   591: ldc             200.0
        //   593: fastore        
        //   594: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   597: astore          6
        //   599: aload           6
        //   601: ldc             ""
        //   603: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   606: aload_0        
        //   607: ldc             2131367426
        //   609: invokevirtual   X/0op.LIZ:(I)Landroid/view/View;
        //   612: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   615: iconst_2       
        //   616: newarray        F
        //   618: dup            
        //   619: iconst_0       
        //   620: fconst_1       
        //   621: fastore        
        //   622: dup            
        //   623: iconst_1       
        //   624: fconst_0       
        //   625: fastore        
        //   626: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   629: astore          10
        //   631: aload           10
        //   633: ldc             ""
        //   635: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   638: aload           7
        //   640: iconst_4       
        //   641: anewarray       Landroid/animation/Animator;
        //   644: dup            
        //   645: iconst_0       
        //   646: aload           8
        //   648: aastore        
        //   649: dup            
        //   650: iconst_1       
        //   651: aload           9
        //   653: aastore        
        //   654: dup            
        //   655: iconst_2       
        //   656: aload           6
        //   658: aastore        
        //   659: dup            
        //   660: iconst_3       
        //   661: aload           10
        //   663: aastore        
        //   664: invokevirtual   android/animation/AnimatorSet.playTogether:([Landroid/animation/Animator;)V
        //   667: aload           7
        //   669: ldc2_w          320
        //   672: invokevirtual   android/animation/AnimatorSet.setDuration:(J)Landroid/animation/AnimatorSet;
        //   675: pop            
        //   676: aload           5
        //   678: iconst_3       
        //   679: anewarray       Landroid/animation/Animator;
        //   682: dup            
        //   683: iconst_0       
        //   684: aload           4
        //   686: aastore        
        //   687: dup            
        //   688: iconst_1       
        //   689: aload_3        
        //   690: aastore        
        //   691: dup            
        //   692: iconst_2       
        //   693: aload           7
        //   695: aastore        
        //   696: invokevirtual   android/animation/AnimatorSet.playSequentially:([Landroid/animation/Animator;)V
        //   699: aload_0        
        //   700: getfield        X/0op.LIZ:Landroid/animation/AnimatorSet;
        //   703: astore          5
        //   705: aload           5
        //   707: ifnonnull       713
        //   710: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   713: aload           5
        //   715: new             LX/0oo;
        //   718: dup            
        //   719: aload_2        
        //   720: aload_1        
        //   721: invokespecial   X/0oo.<init>:(LX/QgG;LX/QgG;)V
        //   724: invokevirtual   android/animation/AnimatorSet.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   727: aload_0        
        //   728: getfield        X/0op.LIZ:Landroid/animation/AnimatorSet;
        //   731: astore_1       
        //   732: aload_1        
        //   733: ifnonnull       739
        //   736: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   739: aload_1        
        //   740: invokevirtual   android/animation/AnimatorSet.start:()V
        //   743: return         
        //    Signature:
        //  (LX/QgG<LX/2P9;>;LX/QgG<LX/2P9;>;)V
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
    
    public final void LIZ(final BattleUserInfo battleUserInfo, final BattleUserInfo battleUserInfo2) {
        final ImageModel imageModel = null;
        if (battleUserInfo != null) {
            final BattleBaseUserInfo liz = battleUserInfo.LIZ;
            String lizj;
            if (liz == null || (lizj = liz.LIZJ) == null) {
                lizj = "";
            }
            final BattleBaseUserInfo liz2 = battleUserInfo.LIZ;
            String liziz;
            if (liz2 == null || (liziz = liz2.LIZIZ) == null) {
                liziz = "";
            }
            final String liz3 = 0W3.LIZ(lizj, liziz);
            final 1ib 1ib = (1ib)this.LIZ(2131373266);
            n.LIZIZ((Object)1ib, "");
            1ib.setText((CharSequence)liz3);
            final ImageView imageView = (ImageView)this.LIZ(2131366982);
            final BattleBaseUserInfo liz4 = battleUserInfo.LIZ;
            ImageModel lizlll;
            if (liz4 != null) {
                lizlll = liz4.LIZLLL;
            }
            else {
                lizlll = null;
            }
            HFv.LIZ(imageView, lizlll, 2131234398);
        }
        if (battleUserInfo2 != null) {
            final BattleBaseUserInfo liz5 = battleUserInfo2.LIZ;
            String lizj2;
            if (liz5 == null || (lizj2 = liz5.LIZJ) == null) {
                lizj2 = "";
            }
            final BattleBaseUserInfo liz6 = battleUserInfo2.LIZ;
            String liziz2;
            if (liz6 == null || (liziz2 = liz6.LIZIZ) == null) {
                liziz2 = "";
            }
            final String liz7 = 0W3.LIZ(lizj2, liziz2);
            final 1ib 1ib2 = (1ib)this.LIZ(2131373484);
            n.LIZIZ((Object)1ib2, "");
            1ib2.setText((CharSequence)liz7);
            final ImageView imageView2 = (ImageView)this.LIZ(2131367094);
            final BattleBaseUserInfo liz8 = battleUserInfo2.LIZ;
            ImageModel lizlll2 = imageModel;
            if (liz8 != null) {
                lizlll2 = liz8.LIZLLL;
            }
            HFv.LIZ(imageView2, lizlll2, 2131234398);
        }
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LIZ();
    }
}
