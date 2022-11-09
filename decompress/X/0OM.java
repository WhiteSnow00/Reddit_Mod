// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup;
import java.util.Objects;
import kotlin.jvm.internal.n;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;
import android.text.SpannableStringBuilder;
import android.animation.Animator$AnimatorListener;

public final class 0oM implements Animator$AnimatorListener
{
    public final /* synthetic */ 1Rc LIZ;
    public final /* synthetic */ 1Rc.b LIZIZ;
    public final /* synthetic */ SpannableStringBuilder LIZJ;
    
    static {
        Covode.recordClassIndex(7987);
    }
    
    public 0oM(final 1Rc liz, final 1Rc.b liziz, final SpannableStringBuilder lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onAnimationCancel(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationEnd(final Animator animator) {
        public final class 0oJ implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 0oM LIZ;
            
            static {
                Covode.recordClassIndex(7988);
            }
            
            public 0oJ(final 0oM liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                n.LIZIZ((Object)valueAnimator, "");
                if (valueAnimator.getAnimatedValue() instanceof Integer && this.LIZ.LIZ.LIZ) {
                    final ViewGroup lizlll = this.LIZ.LIZIZ.LIZLLL;
                    final Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                    0p0.LIZ((View)lizlll, (int)animatedValue);
                }
            }
        }
        public final class 0oL implements ValueAnimator$AnimatorUpdateListener
        {
            public final /* synthetic */ 0oM LIZ;
            
            static {
                Covode.recordClassIndex(7990);
            }
            
            public 0oL(final 0oM liz) {
                this.LIZ = liz;
            }
            
            public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final 1xz ljiiliil = this.LIZ.LIZ.LJIILIIL;
                if (ljiiliil != null) {
                    n.LIZIZ((Object)valueAnimator, "");
                    final Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    ljiiliil.setScaleX((float)animatedValue);
                }
                final 1xz ljiiliil2 = this.LIZ.LIZ.LJIILIIL;
                if (ljiiliil2 != null) {
                    n.LIZIZ((Object)valueAnimator, "");
                    final Object animatedValue2 = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                    ljiiliil2.setScaleY((float)animatedValue2);
                }
            }
        }
        public final class 0oK implements Animator$AnimatorListener
        {
            public final /* synthetic */ boolean LIZ;
            public final /* synthetic */ 2w5 LIZIZ;
            public final /* synthetic */ 0oM LIZJ;
            
            static {
                Covode.recordClassIndex(7989);
            }
            
            public 0oK(final boolean liz, final 2w5 liziz, final 0oM lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            public final void onAnimationCancel(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationEnd(final Animator animator) {
                CTM.LIZ((Object)animator);
                if (this.LIZJ.LIZ.LIZ && this.LIZJ.LIZ.LJIILIIL != null) {
                    final 1xz ljiiliil = this.LIZJ.LIZ.LJIILIIL;
                    if (ljiiliil != null) {
                        ljiiliil.setText((CharSequence)0nW.LIZ(ljiiliil, this.LIZJ.LIZJ, this.LIZ));
                        this.LIZJ.LIZ.LIZ(null, this.LIZIZ.element);
                    }
                }
            }
            
            public final void onAnimationRepeat(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
            
            public final void onAnimationStart(final Animator animator) {
                CTM.LIZ((Object)animator);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: invokestatic    X/0cB.LIZJ:()I
        //     7: ldc             24.0
        //     9: invokestatic    X/0cB.LIZ:(F)I
        //    12: isub           
        //    13: istore_2       
        //    14: ldc             100.0
        //    16: invokestatic    X/0cB.LIZ:(F)I
        //    19: i2f            
        //    20: fconst_1       
        //    21: fmul           
        //    22: fstore_3       
        //    23: aload_0        
        //    24: getfield        X/0oM.LIZIZ:LX/0oI;
        //    27: getfield        X/0oI.LIZLLL:Landroid/view/ViewGroup;
        //    30: invokevirtual   android/view/ViewGroup.getMeasuredWidth:()I
        //    33: ifne            355
        //    36: fload_3        
        //    37: fstore          4
        //    39: aload_0        
        //    40: getfield        X/0oM.LIZ:LX/1Rc;
        //    43: getfield        X/1Rc.LJIILJJIL:LX/1ib;
        //    46: astore_1       
        //    47: aload_1        
        //    48: ifnull          56
        //    51: aload_1        
        //    52: fconst_1       
        //    53: invokevirtual   X/1ib.setAlpha:(F)V
        //    56: aload_0        
        //    57: getfield        X/0oM.LIZ:LX/1Rc;
        //    60: getfield        X/1Rc.LJIILL:Landroid/view/View;
        //    63: astore_1       
        //    64: aload_1        
        //    65: ifnull          73
        //    68: aload_1        
        //    69: fconst_1       
        //    70: invokevirtual   android/view/View.setAlpha:(F)V
        //    73: aload_0        
        //    74: getfield        X/0oM.LIZ:LX/1Rc;
        //    77: getfield        X/1Rc.LJIILJJIL:LX/1ib;
        //    80: astore_1       
        //    81: aload_1        
        //    82: ifnull          91
        //    85: aload_1        
        //    86: bipush          8
        //    88: invokevirtual   X/1ib.setVisibility:(I)V
        //    91: aload_0        
        //    92: getfield        X/0oM.LIZ:LX/1Rc;
        //    95: getfield        X/1Rc.LJIILL:Landroid/view/View;
        //    98: astore_1       
        //    99: aload_1        
        //   100: ifnull          109
        //   103: aload_1        
        //   104: bipush          8
        //   106: invokevirtual   android/view/View.setVisibility:(I)V
        //   109: aload_0        
        //   110: getfield        X/0oM.LIZ:LX/1Rc;
        //   113: getfield        X/1Rc.LJIILIIL:LX/1xz;
        //   116: astore_1       
        //   117: aload_1        
        //   118: ifnull          129
        //   121: aload_1        
        //   122: aload_0        
        //   123: getfield        X/0oM.LIZJ:Landroid/text/SpannableStringBuilder;
        //   126: invokevirtual   X/1xz.setText:(Ljava/lang/CharSequence;)V
        //   129: aload_0        
        //   130: getfield        X/0oM.LIZIZ:LX/0oI;
        //   133: getfield        X/0oI.LIZ:LX/1si;
        //   136: astore_1       
        //   137: aload_1        
        //   138: ifnull          147
        //   141: aload_1        
        //   142: bipush          8
        //   144: invokevirtual   X/1si.setVisibility:(I)V
        //   147: aload_0        
        //   148: getfield        X/0oM.LIZ:LX/1Rc;
        //   151: aload_0        
        //   152: getfield        X/0oM.LIZIZ:LX/0oI;
        //   155: getfield        X/0oI.LIZLLL:Landroid/view/ViewGroup;
        //   158: invokevirtual   X/1Rc.LIZ:(Landroid/view/View;)V
        //   161: new             LX/2w5;
        //   164: dup            
        //   165: invokespecial   X/2w5.<init>:()V
        //   168: astore          5
        //   170: aload_0        
        //   171: getfield        X/0oM.LIZIZ:LX/0oI;
        //   174: getfield        X/0oI.LIZLLL:Landroid/view/ViewGroup;
        //   177: aload_0        
        //   178: getfield        X/0oM.LIZ:LX/1Rc;
        //   181: getfield        X/1Rc.LIZJ:Landroid/view/ViewGroup;
        //   184: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   187: ifeq            340
        //   190: invokestatic    X/0cB.LIZJ:()I
        //   193: istore          6
        //   195: ldc             156.0
        //   197: invokestatic    X/0cB.LIZ:(F)I
        //   200: istore          7
        //   202: aload_0        
        //   203: getfield        X/0oM.LIZIZ:LX/0oI;
        //   206: getfield        X/0oI.LIZLLL:Landroid/view/ViewGroup;
        //   209: invokevirtual   android/view/ViewGroup.getMeasuredWidth:()I
        //   212: iload           6
        //   214: iload           7
        //   216: isub           
        //   217: invokestatic    X/RjR.LIZJ:(II)I
        //   220: istore          7
        //   222: aload           5
        //   224: iload           7
        //   226: putfield        X/2w5.element:I
        //   229: aload           5
        //   231: aload           5
        //   233: getfield        X/2w5.element:I
        //   236: i2f            
        //   237: ldc             1.2
        //   239: fmul           
        //   240: f2i            
        //   241: putfield        X/2w5.element:I
        //   244: iload_2        
        //   245: aload           5
        //   247: getfield        X/2w5.element:I
        //   250: if_icmpgt       334
        //   253: iconst_1       
        //   254: istore          8
        //   256: aload_0        
        //   257: getfield        X/0oM.LIZ:LX/1Rc;
        //   260: getfield        X/1Rc.LJIILIIL:LX/1xz;
        //   263: astore_1       
        //   264: aload_1        
        //   265: ifnull          286
        //   268: aload_1        
        //   269: invokevirtual   androidx/appcompat/widget/AppCompatTextView.getText:()Ljava/lang/CharSequence;
        //   272: astore_1       
        //   273: aload_1        
        //   274: ifnull          286
        //   277: aload_1        
        //   278: invokeinterface java/lang/CharSequence.length:()I
        //   283: ifne            373
        //   286: aload_0        
        //   287: getfield        X/0oM.LIZ:LX/1Rc;
        //   290: getfield        X/1Rc.LJIILIIL:LX/1xz;
        //   293: astore_1       
        //   294: aload_1        
        //   295: ifnull          318
        //   298: aload_1        
        //   299: aload_0        
        //   300: getfield        X/0oM.LIZIZ:LX/0oI;
        //   303: getfield        X/0oI.LIZIZ:LX/1xz;
        //   306: aload_0        
        //   307: getfield        X/0oM.LIZJ:Landroid/text/SpannableStringBuilder;
        //   310: iload           8
        //   312: invokestatic    X/0nW.LIZ:(LX/1xz;Landroid/text/SpannableStringBuilder;Z)Landroid/text/SpannableStringBuilder;
        //   315: invokevirtual   X/1xz.setText:(Ljava/lang/CharSequence;)V
        //   318: aload_0        
        //   319: getfield        X/0oM.LIZ:LX/1Rc;
        //   322: aload_0        
        //   323: getfield        X/0oM.LIZIZ:LX/0oI;
        //   326: getfield        X/0oI.LIZLLL:Landroid/view/ViewGroup;
        //   329: iconst_0       
        //   330: invokevirtual   X/1Rc.LIZ:(Landroid/view/View;I)V
        //   333: return         
        //   334: iconst_0       
        //   335: istore          8
        //   337: goto            256
        //   340: aload_0        
        //   341: getfield        X/0oM.LIZIZ:LX/0oI;
        //   344: getfield        X/0oI.LIZLLL:Landroid/view/ViewGroup;
        //   347: invokevirtual   android/view/ViewGroup.getMeasuredWidth:()I
        //   350: istore          7
        //   352: goto            222
        //   355: aload_0        
        //   356: getfield        X/0oM.LIZIZ:LX/0oI;
        //   359: getfield        X/0oI.LIZLLL:Landroid/view/ViewGroup;
        //   362: invokevirtual   android/view/ViewGroup.getMeasuredWidth:()I
        //   365: i2f            
        //   366: fconst_1       
        //   367: fmul           
        //   368: fstore          4
        //   370: goto            39
        //   373: aload           5
        //   375: getfield        X/2w5.element:I
        //   378: i2f            
        //   379: fload_3        
        //   380: fcmpg          
        //   381: ifge            631
        //   384: fload_3        
        //   385: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   388: astore_1       
        //   389: fload           4
        //   391: f2i            
        //   392: istore          6
        //   394: iload_2        
        //   395: istore          7
        //   397: iload           8
        //   399: ifne            411
        //   402: aload_1        
        //   403: checkcast       Ljava/lang/Number;
        //   406: invokevirtual   java/lang/Number.intValue:()I
        //   409: istore          7
        //   411: iconst_2       
        //   412: newarray        I
        //   414: dup            
        //   415: iconst_0       
        //   416: iload           6
        //   418: iastore        
        //   419: dup            
        //   420: iconst_1       
        //   421: iload           7
        //   423: iastore        
        //   424: invokestatic    android/animation/ValueAnimator.ofInt:([I)Landroid/animation/ValueAnimator;
        //   427: astore_1       
        //   428: aload_1        
        //   429: ldc             ""
        //   431: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   434: aload_1        
        //   435: ldc2_w          150
        //   438: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   441: pop            
        //   442: aload_1        
        //   443: new             LX/0oJ;
        //   446: dup            
        //   447: aload_0        
        //   448: invokespecial   X/0oJ.<init>:(LX/0oM;)V
        //   451: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   454: aload_1        
        //   455: ldc             ""
        //   457: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   460: aload_1        
        //   461: new             LX/0oK;
        //   464: dup            
        //   465: iload           8
        //   467: aload           5
        //   469: aload_0        
        //   470: invokespecial   X/0oK.<init>:(ZLX/2w5;LX/0oM;)V
        //   473: invokevirtual   android/animation/Animator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
        //   476: aload_0        
        //   477: getfield        X/0oM.LIZ:LX/1Rc;
        //   480: getfield        X/1Rc.LJIILIIL:LX/1xz;
        //   483: astore          5
        //   485: aload           5
        //   487: ifnull          496
        //   490: aload           5
        //   492: fconst_0       
        //   493: invokevirtual   X/1xz.setAlpha:(F)V
        //   496: aload_0        
        //   497: getfield        X/0oM.LIZ:LX/1Rc;
        //   500: getfield        X/1Rc.LJIILIIL:LX/1xz;
        //   503: getstatic       android/view/View.ALPHA:Landroid/util/Property;
        //   506: iconst_2       
        //   507: newarray        F
        //   509: dup            
        //   510: iconst_0       
        //   511: fconst_0       
        //   512: fastore        
        //   513: dup            
        //   514: iconst_1       
        //   515: fconst_1       
        //   516: fastore        
        //   517: invokestatic    android/animation/ObjectAnimator.ofFloat:(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;
        //   520: astore          9
        //   522: aload           9
        //   524: ldc             ""
        //   526: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   529: aload           9
        //   531: ldc2_w          150
        //   534: invokevirtual   android/animation/ObjectAnimator.setDuration:(J)Landroid/animation/ObjectAnimator;
        //   537: pop            
        //   538: iconst_4       
        //   539: newarray        F
        //   541: dup            
        //   542: iconst_0       
        //   543: fconst_1       
        //   544: fastore        
        //   545: dup            
        //   546: iconst_1       
        //   547: ldc             1.3
        //   549: fastore        
        //   550: dup            
        //   551: iconst_2       
        //   552: ldc             0.9
        //   554: fastore        
        //   555: dup            
        //   556: iconst_3       
        //   557: fconst_1       
        //   558: fastore        
        //   559: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
        //   562: astore          5
        //   564: aload           5
        //   566: ldc             ""
        //   568: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   571: aload           5
        //   573: ldc2_w          400
        //   576: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
        //   579: pop            
        //   580: aload           5
        //   582: new             LX/0oL;
        //   585: dup            
        //   586: aload_0        
        //   587: invokespecial   X/0oL.<init>:(LX/0oM;)V
        //   590: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
        //   593: new             Landroid/animation/AnimatorSet;
        //   596: dup            
        //   597: invokespecial   android/animation/AnimatorSet.<init>:()V
        //   600: astore          10
        //   602: aload           10
        //   604: iconst_3       
        //   605: anewarray       Landroid/animation/Animator;
        //   608: dup            
        //   609: iconst_0       
        //   610: aload_1        
        //   611: aastore        
        //   612: dup            
        //   613: iconst_1       
        //   614: aload           9
        //   616: aastore        
        //   617: dup            
        //   618: iconst_2       
        //   619: aload           5
        //   621: aastore        
        //   622: invokevirtual   android/animation/AnimatorSet.playSequentially:([Landroid/animation/Animator;)V
        //   625: aload           10
        //   627: invokevirtual   android/animation/AnimatorSet.start:()V
        //   630: return         
        //   631: aload           5
        //   633: getfield        X/2w5.element:I
        //   636: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   639: astore_1       
        //   640: goto            389
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
    
    public final void onAnimationRepeat(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
    
    public final void onAnimationStart(final Animator animator) {
        CTM.LIZ((Object)animator);
    }
}
