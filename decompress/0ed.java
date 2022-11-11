// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.HashMap;
import java.util.ArrayList;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import java.util.Objects;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Collections;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation$Bounds;
import android.view.WindowInsetsAnimation;
import android.os.Build$VERSION;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;

public final class 0ed
{
    public c LIZ;
    
    static {
        Covode.recordClassIndex(5967);
    }
    
    public 0ed(final int n, final Interpolator interpolator, final long n2) {
        if (Build$VERSION.SDK_INT >= 30) {
            this.LIZ = (c)new e(n, interpolator, n2);
            return;
        }
        this.LIZ = (c)new d(n, interpolator, n2);
    }
    
    public 0ed(final WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build$VERSION.SDK_INT >= 30) {
            this.LIZ = (c)new e(windowInsetsAnimation);
        }
    }
    
    public final void LIZ(final float n) {
        this.LIZ.LIZ(n);
    }
    
    public static final class a
    {
        public final 0eP LIZ;
        public final 0eP LIZIZ;
        
        static {
            Covode.recordClassIndex(5968);
        }
        
        public a(final 0eP liz, final 0eP liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        public a(final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            this.LIZ = 0eP.LIZ(windowInsetsAnimation$Bounds.getLowerBound());
            this.LIZIZ = 0eP.LIZ(windowInsetsAnimation$Bounds.getUpperBound());
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("Bounds{lower=");
            sb.append(this.LIZ);
            sb.append(" upper=");
            sb.append(this.LIZIZ);
            sb.append("}");
            return sb.toString();
        }
    }
    
    public abstract static class b
    {
        public WindowInsets LIZIZ;
        public final int LIZJ;
        
        static {
            Covode.recordClassIndex(5969);
        }
        
        public b() {
            this.LIZJ = 0;
        }
        
        public 0ed.a LIZ(final 0ed 0ed, final 0ed.a a) {
            return a;
        }
        
        public abstract 0el LIZ(final 0el p0, final List<0ed> p1);
        
        public void LIZ(final 0ed 0ed) {
        }
        
        public void LIZIZ(final 0ed 0ed) {
        }
    }
    
    public static class c
    {
        public final int LIZ;
        public float LIZIZ;
        public final Interpolator LIZJ;
        public final long LIZLLL;
        
        static {
            Covode.recordClassIndex(5970);
        }
        
        public c(final int liz, final Interpolator lizj, final long lizlll) {
            this.LIZ = liz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
        }
        
        public int LIZ() {
            return this.LIZ;
        }
        
        public void LIZ(final float liziz) {
            this.LIZIZ = liziz;
        }
        
        public float LIZIZ() {
            final Interpolator lizj = this.LIZJ;
            if (lizj != null) {
                return lizj.getInterpolation(this.LIZIZ);
            }
            return this.LIZIZ;
        }
        
        public long LIZJ() {
            return this.LIZLLL;
        }
    }
    
    public static final class d extends c
    {
        static {
            Covode.recordClassIndex(5971);
        }
        
        public d(final int n, final Interpolator interpolator, final long n2) {
            super(n, interpolator, n2);
        }
        
        public static b LIZ(final View view) {
            final Object tag = view.getTag(2131372105);
            b liz;
            if (tag instanceof a) {
                liz = ((a)tag).LIZ;
            }
            else {
                liz = null;
            }
            return liz;
        }
        
        public static WindowInsets LIZ(final View view, final WindowInsets windowInsets) {
            if (view.getTag(2131372093) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        
        public static void LIZ(final View view, final 0ed 0ed) {
            final b liz = LIZ(view);
            if (liz != null) {
                liz.LIZIZ(0ed);
                if (liz.LIZJ == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    LIZ(viewGroup.getChildAt(i), 0ed);
                }
            }
        }
        
        public static void LIZ(final View view, final 0ed 0ed, final 0ed.a a) {
            final b liz = LIZ(view);
            if (liz != null) {
                liz.LIZ(0ed, a);
                if (liz.LIZJ == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    LIZ(viewGroup.getChildAt(i), 0ed, a);
                }
            }
        }
        
        public static void LIZ(final View view, final 0ed 0ed, final WindowInsets liziz, final boolean b) {
            final b liz = LIZ(view);
            int i = 0;
            boolean b2 = b;
            if (liz != null) {
                liz.LIZIZ = liziz;
                if (!(b2 = b)) {
                    liz.LIZ(0ed);
                    b2 = (liz.LIZJ == 0);
                }
            }
            if (view instanceof ViewGroup) {
                for (ViewGroup viewGroup = (ViewGroup)view; i < viewGroup.getChildCount(); ++i) {
                    LIZ(viewGroup.getChildAt(i), 0ed, liziz, b2);
                }
            }
        }
        
        public static void LIZ(final View view, final 0el 0el, final List<0ed> list) {
            final b liz = LIZ(view);
            if (liz != null) {
                liz.LIZ(0el, list);
                if (liz.LIZJ == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    LIZ(viewGroup.getChildAt(i), 0el, list);
                }
            }
        }
        
        public static final class a implements View$OnApplyWindowInsetsListener
        {
            public final b LIZ;
            public 0el LIZIZ;
            
            static {
                Covode.recordClassIndex(5972);
            }
            
            public a(final View view, final b liz) {
                this.LIZ = liz;
                final 0el liz2 = 0eT.LIZ(view);
                0el liziz;
                if (liz2 != null) {
                    liziz = new 0el.b(liz2).LIZ.LIZIZ();
                }
                else {
                    liziz = null;
                }
                this.LIZIZ = liziz;
            }
            
            public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
                public final class 0ea implements Runnable
                {
                    public final /* synthetic */ View LIZ;
                    public final /* synthetic */ 0ed LIZIZ;
                    public final /* synthetic */ 0ed.a LIZJ;
                    public final /* synthetic */ ValueAnimator LIZLLL;
                    
                    static {
                        Covode.recordClassIndex(5975);
                    }
                    
                    public 0ea(final View liz, final 0ed liziz, final 0ed.a lizj, final ValueAnimator lizlll) {
                        this.LIZ = liz;
                        this.LIZIZ = liziz;
                        this.LIZJ = lizj;
                        this.LIZLLL = lizlll;
                    }
                    
                    @Override
                    public final void run() {
                        d.LIZ(this.LIZ, this.LIZIZ, this.LIZJ);
                        this.LIZLLL.start();
                    }
                }
                public final class 0eZ extends AnimatorListenerAdapter
                {
                    public final /* synthetic */ 0ed LIZ;
                    public final /* synthetic */ View LIZIZ;
                    
                    static {
                        Covode.recordClassIndex(5974);
                    }
                    
                    public 0eZ(final 0ed liz, final View liziz) {
                        this.LIZ = liz;
                        this.LIZIZ = liziz;
                    }
                    
                    public final void onAnimationEnd(final Animator animator) {
                        this.LIZ.LIZ(1.0f);
                        d.LIZ(this.LIZIZ, this.LIZ);
                    }
                }
                public final class 0eY implements ValueAnimator$AnimatorUpdateListener
                {
                    public final /* synthetic */ 0ed LIZ;
                    public final /* synthetic */ 0el LIZIZ;
                    public final /* synthetic */ 0el LIZJ;
                    public final /* synthetic */ int LIZLLL;
                    public final /* synthetic */ View LJ;
                    
                    static {
                        Covode.recordClassIndex(5973);
                    }
                    
                    public 0eY(final 0ed liz, final 0el liziz, final 0el lizj, final int lizlll, final View lj) {
                        this.LIZ = liz;
                        this.LIZIZ = liziz;
                        this.LIZJ = lizj;
                        this.LIZLLL = lizlll;
                        this.LJ = lj;
                    }
                    
                    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                        this.LIZ.LIZ(valueAnimator.getAnimatedFraction());
                        final 0el liziz = this.LIZIZ;
                        final 0el lizj = this.LIZJ;
                        final float liziz2 = this.LIZ.LIZ.LIZIZ();
                        final int lizlll = this.LIZLLL;
                        final 0el.b b = new 0el.b(liziz);
                        int n = 1;
                        do {
                            if ((lizlll & n) == 0x0) {
                                b.LIZ(n, liziz.LIZ(n));
                            }
                            else {
                                0eP 0eP = liziz.LIZ(n);
                                final 0eP liz = lizj.LIZ(n);
                                final float n2 = (float)(0eP.LIZIZ - liz.LIZIZ);
                                final float n3 = 1.0f - liziz2;
                                final int n4 = (int)(n2 * n3 + 0.5);
                                final int n5 = (int)((0eP.LIZJ - liz.LIZJ) * n3 + 0.5);
                                final int n6 = (int)((0eP.LIZLLL - liz.LIZLLL) * n3 + 0.5);
                                final int n7 = (int)((0eP.LJ - liz.LJ) * n3 + 0.5);
                                final int max = Math.max(0, 0eP.LIZIZ - n4);
                                final int max2 = Math.max(0, 0eP.LIZJ - n5);
                                final int max3 = Math.max(0, 0eP.LIZLLL - n6);
                                final int max4 = Math.max(0, 0eP.LJ - n7);
                                if (max != n4 || max2 != n5 || max3 != n6 || max4 != n7) {
                                    0eP = X.0eP.LIZ(max, max2, max3, max4);
                                }
                                b.LIZ(n, 0eP);
                            }
                            n <<= 1;
                        } while (n <= 256);
                        d.LIZ(this.LJ, b.LIZ.LIZIZ(), Collections.singletonList(this.LIZ));
                    }
                }
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: invokevirtual   android/view/View.isLaidOut:()Z
                //     4: ifne            22
                //     7: aload_0        
                //     8: aload_2        
                //     9: aload_1        
                //    10: invokestatic    X/0el.LIZ:(Landroid/view/WindowInsets;Landroid/view/View;)LX/0el;
                //    13: putfield        X/0eb.LIZIZ:LX/0el;
                //    16: aload_1        
                //    17: aload_2        
                //    18: invokestatic    X/1IY.LIZ:(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
                //    21: areturn        
                //    22: aload_2        
                //    23: aload_1        
                //    24: invokestatic    X/0el.LIZ:(Landroid/view/WindowInsets;Landroid/view/View;)LX/0el;
                //    27: astore_3       
                //    28: aload_0        
                //    29: getfield        X/0eb.LIZIZ:LX/0el;
                //    32: ifnonnull       43
                //    35: aload_0        
                //    36: aload_1        
                //    37: invokestatic    X/0eT.LIZ:(Landroid/view/View;)LX/0el;
                //    40: putfield        X/0eb.LIZIZ:LX/0el;
                //    43: aload_0        
                //    44: getfield        X/0eb.LIZIZ:LX/0el;
                //    47: ifnonnull       61
                //    50: aload_0        
                //    51: aload_3        
                //    52: putfield        X/0eb.LIZIZ:LX/0el;
                //    55: aload_1        
                //    56: aload_2        
                //    57: invokestatic    X/1IY.LIZ:(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
                //    60: areturn        
                //    61: aload_1        
                //    62: invokestatic    X/1IY.LIZ:(Landroid/view/View;)LX/0eW;
                //    65: astore          4
                //    67: aload           4
                //    69: ifnull          90
                //    72: aload           4
                //    74: getfield        X/0eW.LIZIZ:Landroid/view/WindowInsets;
                //    77: aload_2        
                //    78: invokestatic    java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //    81: ifeq            90
                //    84: aload_1        
                //    85: aload_2        
                //    86: invokestatic    X/1IY.LIZ:(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
                //    89: areturn        
                //    90: aload_0        
                //    91: getfield        X/0eb.LIZIZ:LX/0el;
                //    94: astore          5
                //    96: iconst_1       
                //    97: istore          6
                //    99: iconst_0       
                //   100: istore          7
                //   102: aload_3        
                //   103: iload           6
                //   105: invokevirtual   X/0el.LIZ:(I)LX/0eP;
                //   108: astore          4
                //   110: iload           7
                //   112: istore          8
                //   114: aload           4
                //   116: ifnull          145
                //   119: iload           7
                //   121: istore          8
                //   123: aload           4
                //   125: aload           5
                //   127: iload           6
                //   129: invokevirtual   X/0el.LIZ:(I)LX/0eP;
                //   132: invokevirtual   X/0eP.equals:(Ljava/lang/Object;)Z
                //   135: ifne            145
                //   138: iload           7
                //   140: iload           6
                //   142: ior            
                //   143: istore          8
                //   145: iload           6
                //   147: iconst_1       
                //   148: ishl           
                //   149: istore          6
                //   151: iload           6
                //   153: sipush          256
                //   156: if_icmpgt       166
                //   159: iload           8
                //   161: istore          7
                //   163: goto            102
                //   166: iload           8
                //   168: ifne            177
                //   171: aload_1        
                //   172: aload_2        
                //   173: invokestatic    X/1IY.LIZ:(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
                //   176: areturn        
                //   177: aload_0        
                //   178: getfield        X/0eb.LIZIZ:LX/0el;
                //   181: astore          5
                //   183: aload_3        
                //   184: iload           8
                //   186: invokevirtual   X/0el.LIZ:(I)LX/0eP;
                //   189: getfield        X/0eP.LJ:I
                //   192: ifne            462
                //   195: new             Landroid/view/animation/AccelerateInterpolator;
                //   198: dup            
                //   199: invokespecial   android/view/animation/AccelerateInterpolator.<init>:()V
                //   202: astore          4
                //   204: new             LX/0ed;
                //   207: dup            
                //   208: iload           8
                //   210: aload           4
                //   212: ldc2_w          160
                //   215: invokespecial   X/0ed.<init>:(ILandroid/view/animation/Interpolator;J)V
                //   218: astore          4
                //   220: aload           4
                //   222: fconst_0       
                //   223: invokevirtual   X/0ed.LIZ:(F)V
                //   226: iconst_2       
                //   227: newarray        F
                //   229: dup            
                //   230: iconst_0       
                //   231: fconst_0       
                //   232: fastore        
                //   233: dup            
                //   234: iconst_1       
                //   235: fconst_1       
                //   236: fastore        
                //   237: invokestatic    android/animation/ValueAnimator.ofFloat:([F)Landroid/animation/ValueAnimator;
                //   240: aload           4
                //   242: getfield        X/0ed.LIZ:LX/0eX;
                //   245: invokevirtual   X/0eX.LIZJ:()J
                //   248: invokevirtual   android/animation/ValueAnimator.setDuration:(J)Landroid/animation/ValueAnimator;
                //   251: astore          9
                //   253: aload_3        
                //   254: iload           8
                //   256: invokevirtual   X/0el.LIZ:(I)LX/0eP;
                //   259: astore          10
                //   261: aload           5
                //   263: iload           8
                //   265: invokevirtual   X/0el.LIZ:(I)LX/0eP;
                //   268: astore          11
                //   270: new             LX/0eV;
                //   273: dup            
                //   274: aload           10
                //   276: getfield        X/0eP.LIZIZ:I
                //   279: aload           11
                //   281: getfield        X/0eP.LIZIZ:I
                //   284: invokestatic    java/lang/Math.min:(II)I
                //   287: aload           10
                //   289: getfield        X/0eP.LIZJ:I
                //   292: aload           11
                //   294: getfield        X/0eP.LIZJ:I
                //   297: invokestatic    java/lang/Math.min:(II)I
                //   300: aload           10
                //   302: getfield        X/0eP.LIZLLL:I
                //   305: aload           11
                //   307: getfield        X/0eP.LIZLLL:I
                //   310: invokestatic    java/lang/Math.min:(II)I
                //   313: aload           10
                //   315: getfield        X/0eP.LJ:I
                //   318: aload           11
                //   320: getfield        X/0eP.LJ:I
                //   323: invokestatic    java/lang/Math.min:(II)I
                //   326: invokestatic    X/0eP.LIZ:(IIII)LX/0eP;
                //   329: aload           10
                //   331: getfield        X/0eP.LIZIZ:I
                //   334: aload           11
                //   336: getfield        X/0eP.LIZIZ:I
                //   339: invokestatic    java/lang/Math.max:(II)I
                //   342: aload           10
                //   344: getfield        X/0eP.LIZJ:I
                //   347: aload           11
                //   349: getfield        X/0eP.LIZJ:I
                //   352: invokestatic    java/lang/Math.max:(II)I
                //   355: aload           10
                //   357: getfield        X/0eP.LIZLLL:I
                //   360: aload           11
                //   362: getfield        X/0eP.LIZLLL:I
                //   365: invokestatic    java/lang/Math.max:(II)I
                //   368: aload           10
                //   370: getfield        X/0eP.LJ:I
                //   373: aload           11
                //   375: getfield        X/0eP.LJ:I
                //   378: invokestatic    java/lang/Math.max:(II)I
                //   381: invokestatic    X/0eP.LIZ:(IIII)LX/0eP;
                //   384: invokespecial   X/0eV.<init>:(LX/0eP;LX/0eP;)V
                //   387: astore          11
                //   389: aload_1        
                //   390: aload           4
                //   392: aload_2        
                //   393: iconst_0       
                //   394: invokestatic    X/1IY.LIZ:(Landroid/view/View;LX/0ed;Landroid/view/WindowInsets;Z)V
                //   397: aload           9
                //   399: new             LX/0eY;
                //   402: dup            
                //   403: aload           4
                //   405: aload_3        
                //   406: aload           5
                //   408: iload           8
                //   410: aload_1        
                //   411: invokespecial   X/0eY.<init>:(LX/0ed;LX/0el;LX/0el;ILandroid/view/View;)V
                //   414: invokevirtual   android/animation/ValueAnimator.addUpdateListener:(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V
                //   417: aload           9
                //   419: new             LX/0eZ;
                //   422: dup            
                //   423: aload           4
                //   425: aload_1        
                //   426: invokespecial   X/0eZ.<init>:(LX/0ed;Landroid/view/View;)V
                //   429: invokevirtual   android/animation/ValueAnimator.addListener:(Landroid/animation/Animator$AnimatorListener;)V
                //   432: aload_1        
                //   433: new             LX/0ea;
                //   436: dup            
                //   437: aload_1        
                //   438: aload           4
                //   440: aload           11
                //   442: aload           9
                //   444: invokespecial   X/0ea.<init>:(Landroid/view/View;LX/0ed;LX/0eV;Landroid/animation/ValueAnimator;)V
                //   447: invokestatic    X/0eQ.LIZ:(Landroid/view/View;Ljava/lang/Runnable;)LX/0eQ;
                //   450: pop            
                //   451: aload_0        
                //   452: aload_3        
                //   453: putfield        X/0eb.LIZIZ:LX/0el;
                //   456: aload_1        
                //   457: aload_2        
                //   458: invokestatic    X/1IY.LIZ:(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
                //   461: areturn        
                //   462: new             Landroid/view/animation/DecelerateInterpolator;
                //   465: dup            
                //   466: invokespecial   android/view/animation/DecelerateInterpolator.<init>:()V
                //   469: astore          4
                //   471: goto            204
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
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
                //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    }
    
    public static final class e extends c
    {
        public final WindowInsetsAnimation LIZ;
        
        static {
            Covode.recordClassIndex(5976);
        }
        
        public e(final int n, final Interpolator interpolator, final long n2) {
            this(new WindowInsetsAnimation(n, interpolator, n2));
        }
        
        public e(final WindowInsetsAnimation liz) {
            super(0, null, 0L);
            this.LIZ = liz;
        }
        
        @Override
        public final int LIZ() {
            return this.LIZ.getTypeMask();
        }
        
        @Override
        public final void LIZ(final float fraction) {
            this.LIZ.setFraction(fraction);
        }
        
        @Override
        public final float LIZIZ() {
            return this.LIZ.getInterpolatedFraction();
        }
        
        @Override
        public final long LIZJ() {
            return this.LIZ.getDurationMillis();
        }
        
        public static final class a extends WindowInsetsAnimation$Callback
        {
            public final b LIZ;
            public List<0ed> LIZIZ;
            public ArrayList<0ed> LIZJ;
            public final HashMap<WindowInsetsAnimation, 0ed> LIZLLL;
            
            static {
                Covode.recordClassIndex(5977);
            }
            
            public a(final b liz) {
                super(liz.LIZJ);
                this.LIZLLL = new HashMap<WindowInsetsAnimation, 0ed>();
                this.LIZ = liz;
            }
            
            private 0ed LIZ(final WindowInsetsAnimation windowInsetsAnimation) {
                0ed 0ed;
                if ((0ed = this.LIZLLL.get(windowInsetsAnimation)) == null) {
                    0ed = new 0ed(windowInsetsAnimation);
                    this.LIZLLL.put(windowInsetsAnimation, 0ed);
                }
                return 0ed;
            }
            
            public final void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
                this.LIZ.LIZIZ(this.LIZ(windowInsetsAnimation));
                this.LIZLLL.remove(windowInsetsAnimation);
            }
            
            public final void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
                this.LIZ.LIZ(this.LIZ(windowInsetsAnimation));
            }
            
            public final WindowInsets onProgress(final WindowInsets windowInsets, final List<WindowInsetsAnimation> list) {
                final ArrayList<0ed> lizj = this.LIZJ;
                if (lizj == null) {
                    final ArrayList lizj2 = new ArrayList(list.size());
                    this.LIZJ = lizj2;
                    this.LIZIZ = (List<0ed>)Collections.unmodifiableList((List<?>)lizj2);
                }
                else {
                    lizj.clear();
                }
                for (int i = list.size() - 1; i >= 0; --i) {
                    final WindowInsetsAnimation windowInsetsAnimation = list.get(i);
                    final 0ed liz = this.LIZ(windowInsetsAnimation);
                    liz.LIZ(windowInsetsAnimation.getFraction());
                    this.LIZJ.add(liz);
                }
                final b liz2 = this.LIZ;
                final 0el liz3 = 0el.LIZ(windowInsets, null);
                liz2.LIZ(liz3, this.LIZIZ);
                return liz3.LIZ();
            }
            
            public final WindowInsetsAnimation$Bounds onStart(final WindowInsetsAnimation windowInsetsAnimation, final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
                final b liz = this.LIZ;
                final 0ed liz2 = this.LIZ(windowInsetsAnimation);
                final 0ed.a a = new 0ed.a(windowInsetsAnimation$Bounds);
                liz.LIZ(liz2, a);
                return new WindowInsetsAnimation$Bounds(a.LIZ.LIZ(), a.LIZIZ.LIZ());
            }
        }
    }
}
