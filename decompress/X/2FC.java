// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.Objects;
import com.bytedance.covode.number.Covode;

public final class 2Fc extends 25H
{
    static {
        Covode.recordClassIndex(9312);
    }
    
    public 2Fc(final long n, final long n2, final boolean b) {
        super(n, n2, b);
    }
    
    @Override
    public final int LIZ() {
        return 2131560670;
    }
    
    @Override
    public final void LIZ(final Fld fld, final int n, final int n2) {
        public final class 0tM implements Runnable
        {
            public final /* synthetic */ 2Fc LIZ;
            public final /* synthetic */ Fld LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ int LIZLLL;
            
            static {
                Covode.recordClassIndex(9313);
            }
            
            public 0tM(final 2Fc liz, final Fld liziz, final int lizj, final int lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
            
            @Override
            public final void run() {
                final ViewGroup$LayoutParams layoutParams = this.LIZIZ.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)layoutParams;
                final ViewGroup lj = this.LIZ.LJ;
                int height;
                if (lj != null) {
                    height = lj.getHeight();
                }
                else {
                    height = 0;
                }
                layoutParams2.height = height;
                if (layoutParams2.height == 0) {
                    layoutParams2.height = (int)((0cB.LIZIZ() - 25H.LJIIJ - 25H.LJIIJJI) / 0.7560780122896072);
                }
                layoutParams2.width = (int)(this.LIZJ * (double)layoutParams2.height / this.LIZLLL);
                layoutParams2.gravity = 17;
                layoutParams2.bottomMargin = 0;
                this.LIZIZ.setScaleType(2);
                this.LIZIZ.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                final 2Fc liz = this.LIZ;
                final int width = layoutParams2.width;
                if (width > 0) {
                    final int lizlll = RjR.LIZLLL(0cB.LIZJ(), 0cB.LIZIZ());
                    if (width < lizlll) {
                        final int n = (lizlll - width) / 2;
                        final ViewGroup lj2 = liz.LJ;
                        if (lj2 != null) {
                            final View viewById = ((View)lj2).findViewById(2131367521);
                            if (viewById != null) {
                                GlD.LIZJ(viewById);
                            }
                        }
                        final ViewGroup lj3 = liz.LJ;
                        final ViewGroup$LayoutParams viewGroup$LayoutParams = null;
                        while (true) {
                            Label_0362: {
                                if (lj3 == null) {
                                    break Label_0362;
                                }
                                final View viewById2 = ((View)lj3).findViewById(2131367521);
                                if (viewById2 == null) {
                                    break Label_0362;
                                }
                                final ViewGroup$LayoutParams layoutParams3 = viewById2.getLayoutParams();
                                ViewGroup$LayoutParams layoutParams4;
                                if ((layoutParams4 = layoutParams3) != null) {
                                    layoutParams3.width = n;
                                    layoutParams4 = layoutParams3;
                                }
                                final ViewGroup lj4 = liz.LJ;
                                if (lj4 != null) {
                                    final View viewById3 = ((View)lj4).findViewById(2131367521);
                                    if (viewById3 != null) {
                                        viewById3.setLayoutParams(layoutParams4);
                                    }
                                }
                                final ViewGroup lj5 = liz.LJ;
                                if (lj5 != null) {
                                    final View viewById4 = ((View)lj5).findViewById(2131370496);
                                    if (viewById4 != null) {
                                        GlD.LIZJ(viewById4);
                                    }
                                }
                                final ViewGroup lj6 = liz.LJ;
                                ViewGroup$LayoutParams layoutParams5 = viewGroup$LayoutParams;
                                if (lj6 != null) {
                                    final View viewById5 = ((View)lj6).findViewById(2131370496);
                                    layoutParams5 = viewGroup$LayoutParams;
                                    if (viewById5 != null) {
                                        final ViewGroup$LayoutParams layoutParams6 = viewById5.getLayoutParams();
                                        if ((layoutParams5 = layoutParams6) != null) {
                                            layoutParams6.width = n;
                                            layoutParams5 = layoutParams6;
                                        }
                                    }
                                }
                                final ViewGroup lj7 = liz.LJ;
                                if (lj7 != null) {
                                    final View viewById6 = ((View)lj7).findViewById(2131370496);
                                    if (viewById6 != null) {
                                        viewById6.setLayoutParams(layoutParams5);
                                    }
                                }
                                return;
                            }
                            ViewGroup$LayoutParams layoutParams4 = null;
                            continue;
                        }
                    }
                    final ViewGroup lj8 = liz.LJ;
                    if (lj8 != null) {
                        final View viewById7 = ((View)lj8).findViewById(2131367521);
                        if (viewById7 != null) {
                            GlD.LIZ(viewById7);
                        }
                    }
                    final ViewGroup lj9 = liz.LJ;
                    if (lj9 != null) {
                        final View viewById8 = ((View)lj9).findViewById(2131370496);
                        if (viewById8 != null) {
                            GlD.LIZ(viewById8);
                        }
                    }
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
        //    11: aload_0        
        //    12: getfield        X/1m3.LJ:Landroid/view/ViewGroup;
        //    15: astore          4
        //    17: aload           4
        //    19: ifnull          39
        //    22: aload           4
        //    24: new             LX/0tM;
        //    27: dup            
        //    28: aload_0        
        //    29: aload_1        
        //    30: iload_2        
        //    31: iload_3        
        //    32: invokespecial   X/0tM.<init>:(LX/2Fc;LX/Fld;II)V
        //    35: invokevirtual   android/view/ViewGroup.post:(Ljava/lang/Runnable;)Z
        //    38: pop            
        //    39: return         
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
    
    @Override
    public final int LIZIZ() {
        return 17;
    }
    
    @Override
    public final boolean LIZIZ(final int n) {
        return n == 14;
    }
    
    @Override
    public final 0k8 LIZJ() {
        return 0k8.GRID_FIX;
    }
}
