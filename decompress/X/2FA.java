// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.Objects;
import android.widget.FrameLayout;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.bytedance.covode.number.Covode;

public final class 2Fa extends 25H
{
    static {
        Covode.recordClassIndex(9308);
    }
    
    public 2Fa(final long n, final long n2, final boolean b) {
        super(n, n2, b);
    }
    
    @Override
    public final int LIZ() {
        return 2131560669;
    }
    
    @Override
    public final void LIZ(final Fld fld, final int n, final int n2) {
        public final class 0tK implements ViewTreeObserver$OnGlobalLayoutListener
        {
            public final /* synthetic */ 2Fa LIZ;
            
            static {
                Covode.recordClassIndex(9309);
            }
            
            public 0tK(final 2Fa liz) {
                this.LIZ = liz;
            }
            
            public final void onGlobalLayout() {
                final ViewGroup lj = this.LIZ.LJ;
                if (lj != null) {
                    final FrameLayout frameLayout = (FrameLayout)((View)lj).findViewById(2131365352);
                    if (frameLayout != null) {
                        final ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                        }
                    }
                }
                this.LIZ.LJ();
                final 2Fa liz = this.LIZ;
                final ViewGroup lj2 = liz.LJ;
                if (lj2 != null) {
                    final FrameLayout frameLayout2 = (FrameLayout)((View)lj2).findViewById(2131365353);
                    if (frameLayout2 != null) {
                        final ViewGroup$LayoutParams layoutParams = frameLayout2.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = LIK.LIZ(liz.LJFF() * 0.24044241404183697);
                        }
                    }
                }
                final 2Fa liz2 = this.LIZ;
                Label_0159: {
                    if (liz2.LJII() != 0) {
                        final ViewGroup lj3 = liz2.LJ;
                        if (lj3 != null) {
                            final View viewById = ((View)lj3).findViewById(2131367521);
                            if (viewById != null) {
                                GlD.LIZJ(viewById);
                            }
                        }
                        final ViewGroup lj4 = liz2.LJ;
                        final ViewGroup$LayoutParams viewGroup$LayoutParams = null;
                        while (true) {
                            Label_0449: {
                                if (lj4 == null) {
                                    break Label_0449;
                                }
                                final View viewById2 = ((View)lj4).findViewById(2131367521);
                                if (viewById2 == null) {
                                    break Label_0449;
                                }
                                final ViewGroup$LayoutParams layoutParams2 = viewById2.getLayoutParams();
                                ViewGroup$LayoutParams layoutParams3;
                                if ((layoutParams3 = layoutParams2) != null) {
                                    layoutParams2.width = liz2.LJII();
                                    layoutParams3 = layoutParams2;
                                }
                                final ViewGroup lj5 = liz2.LJ;
                                if (lj5 != null) {
                                    final View viewById3 = ((View)lj5).findViewById(2131367521);
                                    if (viewById3 != null) {
                                        viewById3.setLayoutParams(layoutParams3);
                                    }
                                }
                                final ViewGroup lj6 = liz2.LJ;
                                if (lj6 != null) {
                                    final View viewById4 = ((View)lj6).findViewById(2131370496);
                                    if (viewById4 != null) {
                                        GlD.LIZJ(viewById4);
                                    }
                                }
                                final ViewGroup lj7 = liz2.LJ;
                                ViewGroup$LayoutParams layoutParams4 = viewGroup$LayoutParams;
                                if (lj7 != null) {
                                    final View viewById5 = ((View)lj7).findViewById(2131370496);
                                    layoutParams4 = viewGroup$LayoutParams;
                                    if (viewById5 != null) {
                                        final ViewGroup$LayoutParams layoutParams5 = viewById5.getLayoutParams();
                                        if ((layoutParams4 = layoutParams5) != null) {
                                            layoutParams5.width = liz2.LJII();
                                            layoutParams4 = layoutParams5;
                                        }
                                    }
                                }
                                final ViewGroup lj8 = liz2.LJ;
                                if (lj8 == null) {
                                    break Label_0159;
                                }
                                final View viewById6 = ((View)lj8).findViewById(2131370496);
                                if (viewById6 != null) {
                                    viewById6.setLayoutParams(layoutParams4);
                                }
                                break Label_0159;
                            }
                            ViewGroup$LayoutParams layoutParams3 = null;
                            continue;
                        }
                    }
                    final ViewGroup lj9 = liz2.LJ;
                    if (lj9 != null) {
                        final View viewById7 = ((View)lj9).findViewById(2131367521);
                        if (viewById7 != null) {
                            GlD.LIZ(viewById7);
                        }
                    }
                    final ViewGroup lj10 = liz2.LJ;
                    if (lj10 != null) {
                        final View viewById8 = ((View)lj10).findViewById(2131370496);
                        if (viewById8 != null) {
                            GlD.LIZ(viewById8);
                        }
                    }
                }
                final Fld ljff = this.LIZ.LJFF;
                if (ljff != null) {
                    final 2Fa liz3 = this.LIZ;
                    final ViewGroup$LayoutParams layoutParams6 = ljff.getLayoutParams();
                    Objects.requireNonNull(layoutParams6, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    final FrameLayout$LayoutParams layoutParams7 = (FrameLayout$LayoutParams)layoutParams6;
                    layoutParams7.height = LIK.LIZ(liz3.LJI());
                    layoutParams7.width = LIK.LIZ(liz3.LJFF());
                    layoutParams7.bottomMargin = 25H.LJIIJ;
                    layoutParams7.gravity = 85;
                    ljff.setLayoutParams((ViewGroup$LayoutParams)layoutParams7);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: iload_2        
        //     7: iload_3        
        //     8: invokespecial   X/1m3.LIZ:(LX/Fld;II)V
        //    11: iload_2        
        //    12: ifeq            19
        //    15: iload_3        
        //    16: ifne            20
        //    19: return         
        //    20: aload_0        
        //    21: getfield        X/1m3.LJ:Landroid/view/ViewGroup;
        //    24: astore_1       
        //    25: aload_1        
        //    26: ifnull          19
        //    29: aload_1        
        //    30: ldc             2131365352
        //    32: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    35: checkcast       Landroid/widget/FrameLayout;
        //    38: astore_1       
        //    39: aload_1        
        //    40: ifnull          19
        //    43: aload_1        
        //    44: invokevirtual   android/widget/FrameLayout.getViewTreeObserver:()Landroid/view/ViewTreeObserver;
        //    47: astore_1       
        //    48: aload_1        
        //    49: ifnull          19
        //    52: aload_1        
        //    53: new             LX/0tK;
        //    56: dup            
        //    57: aload_0        
        //    58: invokespecial   X/0tK.<init>:(LX/2Fa;)V
        //    61: invokevirtual   android/view/ViewTreeObserver.addOnGlobalLayoutListener:(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
        //    64: goto            19
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
    
    @Override
    public final int LIZIZ() {
        return 85;
    }
    
    @Override
    public final boolean LIZIZ(final int n) {
        return n == 12;
    }
    
    @Override
    public final 0k8 LIZJ() {
        return 0k8.GRID_FIX;
    }
    
    @Override
    public final void LJ() {
        final ViewGroup lj = super.LJ;
        if (lj != null) {
            final FrameLayout frameLayout = (FrameLayout)((View)lj).findViewById(2131365352);
            if (frameLayout != null) {
                final int height = frameLayout.getHeight();
                final ViewGroup lj2 = super.LJ;
                if (lj2 != null) {
                    final View viewById = ((View)lj2).findViewById(2131364437);
                    if (viewById != null) {
                        final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = (int)(height * 0.004424778761061947);
                        }
                    }
                }
                final ViewGroup lj3 = super.LJ;
                if (lj3 != null) {
                    final View viewById2 = ((View)lj3).findViewById(2131364437);
                    if (viewById2 != null) {
                        viewById2.requestLayout();
                    }
                }
                final ViewGroup lj4 = super.LJ;
                if (lj4 != null) {
                    final View viewById3 = ((View)lj4).findViewById(2131364426);
                    if (viewById3 != null) {
                        final ViewGroup$LayoutParams layoutParams2 = viewById3.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = (int)(height * 0.004424778761061947);
                        }
                    }
                }
                final ViewGroup lj5 = super.LJ;
                if (lj5 != null) {
                    final View viewById4 = ((View)lj5).findViewById(2131364426);
                    if (viewById4 != null) {
                        viewById4.requestLayout();
                    }
                }
                final ViewGroup lj6 = super.LJ;
                if (lj6 != null) {
                    final View viewById5 = ((View)lj6).findViewById(2131364427);
                    if (viewById5 != null) {
                        final ViewGroup$LayoutParams layoutParams3 = viewById5.getLayoutParams();
                        if (layoutParams3 != null) {
                            layoutParams3.height = (int)(height * 0.004424778761061947);
                        }
                    }
                }
                final ViewGroup lj7 = super.LJ;
                if (lj7 != null) {
                    final View viewById6 = ((View)lj7).findViewById(2131364427);
                    if (viewById6 != null) {
                        viewById6.requestLayout();
                    }
                }
            }
        }
    }
    
    public final double LJFF() {
        double n;
        if (super.LJI == 0) {
            n = 480.0;
        }
        else {
            n = super.LJI;
        }
        double n2;
        if (super.LJII == 0) {
            n2 = 864.0;
        }
        else {
            n2 = super.LJII;
        }
        return this.LJI() * n / n2;
    }
    
    public final double LJI() {
        final ViewGroup lj = super.LJ;
        while (true) {
            Label_0052: {
                if (lj == null) {
                    break Label_0052;
                }
                final FrameLayout frameLayout = (FrameLayout)((View)lj).findViewById(2131365352);
                if (frameLayout == null) {
                    break Label_0052;
                }
                final double n = frameLayout.getHeight();
                if (n == 0.0) {
                    return (0cB.LIZIZ() - 25H.LJIIJJI - 25H.LJIIJ) / 0.7560780122896072;
                }
                return n / 0.7560780122896072;
            }
            final double n = 0.0;
            continue;
        }
    }
    
    public final int LJII() {
        final double n = RjR.LIZLLL(0cB.LIZJ(), 0cB.LIZIZ());
        if (n <= this.LJFF()) {
            return 0;
        }
        return (int)((n - this.LJFF()) / 2.0);
    }
}
