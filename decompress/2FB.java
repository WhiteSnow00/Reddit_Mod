// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import java.util.Objects;
import android.view.View;
import kotlin.jvm.internal.n;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public final class 2Fb extends 25I
{
    public boolean LJIIJ;
    
    static {
        Covode.recordClassIndex(9310);
    }
    
    public 2Fb(final long n, final long n2, final boolean b) {
        super(n, n2, b);
        this.LJIIJ = true;
    }
    
    @Override
    public final int LIZ() {
        return 2131560672;
    }
    
    @Override
    public final ViewGroup LIZ(final Integer n) {
        final ViewGroup lj = super.LJ;
        Object o;
        if (lj != null) {
            o = ((View)lj).findViewById(2131365290);
        }
        else {
            o = null;
        }
        return (ViewGroup)o;
    }
    
    @Override
    public final void LIZ(final 0xa 0xa) {
        super.LIZ(0xa);
        if (0xa != null) {
            if (0xa.LJ.size() == 1) {
                this.LJIIJ = true;
                final ViewGroup lj = super.LJ;
                if (lj != null) {
                    final FrameLayout frameLayout = (FrameLayout)((View)lj).findViewById(2131369360);
                    n.LIZIZ((Object)frameLayout, "");
                    frameLayout.setVisibility(4);
                    final FrameLayout frameLayout2 = (FrameLayout)((View)lj).findViewById(2131369361);
                    n.LIZIZ((Object)frameLayout2, "");
                    frameLayout2.setVisibility(4);
                    final FrameLayout frameLayout3 = (FrameLayout)((View)lj).findViewById(2131369362);
                    n.LIZIZ((Object)frameLayout3, "");
                    frameLayout3.setVisibility(4);
                    final View viewById = ((View)lj).findViewById(2131372473);
                    n.LIZIZ((Object)viewById, "");
                    viewById.setVisibility(4);
                    final View viewById2 = ((View)lj).findViewById(2131363034);
                    n.LIZIZ((Object)viewById2, "");
                    viewById2.setVisibility(4);
                    final FrameLayout frameLayout4 = (FrameLayout)((View)lj).findViewById(2131369364);
                    n.LIZIZ((Object)frameLayout4, "");
                    frameLayout4.setVisibility(0);
                    final Fld ljff = super.LJFF;
                    if (ljff != null) {
                        this.LIZ(ljff, super.LJI, super.LJII);
                    }
                }
            }
            else {
                this.LJIIJ = false;
                final ViewGroup lj2 = super.LJ;
                if (lj2 != null) {
                    final View viewById3 = ((View)lj2).findViewById(2131372473);
                    n.LIZIZ((Object)viewById3, "");
                    viewById3.setVisibility(0);
                    final View viewById4 = ((View)lj2).findViewById(2131363034);
                    n.LIZIZ((Object)viewById4, "");
                    viewById4.setVisibility(0);
                    final FrameLayout frameLayout5 = (FrameLayout)((View)lj2).findViewById(2131369360);
                    n.LIZIZ((Object)frameLayout5, "");
                    frameLayout5.setVisibility(0);
                    final FrameLayout frameLayout6 = (FrameLayout)((View)lj2).findViewById(2131369361);
                    n.LIZIZ((Object)frameLayout6, "");
                    frameLayout6.setVisibility(0);
                    final FrameLayout frameLayout7 = (FrameLayout)((View)lj2).findViewById(2131369362);
                    n.LIZIZ((Object)frameLayout7, "");
                    frameLayout7.setVisibility(0);
                    final FrameLayout frameLayout8 = (FrameLayout)((View)lj2).findViewById(2131369364);
                    n.LIZIZ((Object)frameLayout8, "");
                    frameLayout8.setVisibility(8);
                    final Fld ljff2 = super.LJFF;
                    if (ljff2 != null) {
                        this.LIZ(ljff2, super.LJI, super.LJII);
                    }
                }
            }
            this.LJ();
            final int size = super.LJIIIIZZ.size();
            if (size != 1) {
                if (size == 2) {
                    final ViewGroup lj3 = super.LJ;
                    if (lj3 != null) {
                        final View viewById5 = ((View)lj3).findViewById(2131369067);
                        if (viewById5 != null) {
                            viewById5.setVisibility(0);
                        }
                    }
                    final ViewGroup lj4 = super.LJ;
                    if (lj4 != null) {
                        final View viewById6 = ((View)lj4).findViewById(2131369070);
                        if (viewById6 != null) {
                            viewById6.setVisibility(4);
                        }
                    }
                    final ViewGroup lj5 = super.LJ;
                    if (lj5 != null) {
                        final View viewById7 = ((View)lj5).findViewById(2131369071);
                        if (viewById7 != null) {
                            viewById7.setVisibility(4);
                        }
                    }
                    return;
                }
                if (size != 3) {
                    if (size == 4) {
                        final ViewGroup lj6 = super.LJ;
                        if (lj6 != null) {
                            final View viewById8 = ((View)lj6).findViewById(2131369067);
                            if (viewById8 != null) {
                                viewById8.setVisibility(0);
                            }
                        }
                        final ViewGroup lj7 = super.LJ;
                        if (lj7 != null) {
                            final View viewById9 = ((View)lj7).findViewById(2131369070);
                            if (viewById9 != null) {
                                viewById9.setVisibility(0);
                            }
                        }
                        final ViewGroup lj8 = super.LJ;
                        if (lj8 != null) {
                            final View viewById10 = ((View)lj8).findViewById(2131369071);
                            if (viewById10 != null) {
                                viewById10.setVisibility(0);
                            }
                        }
                    }
                    return;
                }
                final ViewGroup lj9 = super.LJ;
                if (lj9 != null) {
                    final View viewById11 = ((View)lj9).findViewById(2131369067);
                    if (viewById11 != null) {
                        viewById11.setVisibility(0);
                    }
                }
                final ViewGroup lj10 = super.LJ;
                if (lj10 != null) {
                    final View viewById12 = ((View)lj10).findViewById(2131369070);
                    if (viewById12 != null) {
                        viewById12.setVisibility(4);
                    }
                }
                final ViewGroup lj11 = super.LJ;
                if (lj11 != null) {
                    final View viewById13 = ((View)lj11).findViewById(2131369071);
                    if (viewById13 != null) {
                        viewById13.setVisibility(0);
                    }
                }
            }
            else {
                final ViewGroup lj12 = super.LJ;
                if (lj12 != null) {
                    final View viewById14 = ((View)lj12).findViewById(2131369067);
                    if (viewById14 != null) {
                        viewById14.setVisibility(4);
                    }
                }
                final ViewGroup lj13 = super.LJ;
                if (lj13 != null) {
                    final View viewById15 = ((View)lj13).findViewById(2131369070);
                    if (viewById15 != null) {
                        viewById15.setVisibility(4);
                    }
                }
                final ViewGroup lj14 = super.LJ;
                if (lj14 != null) {
                    final View viewById16 = ((View)lj14).findViewById(2131369071);
                    if (viewById16 != null) {
                        viewById16.setVisibility(4);
                    }
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final Fld fld, final int n, final int n2) {
        public final class 0tL implements Runnable
        {
            public final /* synthetic */ 2Fb LIZ;
            public final /* synthetic */ Fld LIZIZ;
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ int LIZLLL;
            
            static {
                Covode.recordClassIndex(9311);
            }
            
            public 0tL(final 2Fb liz, final Fld liziz, final int lizj, final int lizlll) {
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
                final boolean ljiij = this.LIZ.LJIIJ;
                int height = 0;
                Label_0107: {
                    if (ljiij) {
                        layoutParams2.height = -1;
                        layoutParams2.width = -1;
                        layoutParams2.topMargin = 0;
                        layoutParams2.bottomMargin = 0;
                        layoutParams2.gravity = 17;
                        final ViewGroup lj = this.LIZ.LJ;
                        if (lj != null) {
                            final View viewById = ((View)lj).findViewById(2131367521);
                            if (viewById != null) {
                                GlD.LIZ(viewById);
                            }
                            final View viewById2 = ((View)lj).findViewById(2131370496);
                            if (viewById2 != null) {
                                GlD.LIZ(viewById2);
                            }
                        }
                    }
                    else {
                        final ViewGroup lj2 = this.LIZ.LJ;
                        if (lj2 != null) {
                            height = lj2.getHeight();
                        }
                        layoutParams2.height = height;
                        if (layoutParams2.height == 0) {
                            layoutParams2.height = (int)((0cB.LIZIZ() - 25H.LJIIJ * 2) / 0.7560780122896072);
                        }
                        layoutParams2.width = (int)(this.LIZJ * (double)layoutParams2.height / this.LIZLLL);
                        layoutParams2.gravity = 49;
                        final ViewGroup lj3 = this.LIZ.LJ;
                        if (lj3 != null) {
                            final FrameLayout frameLayout = (FrameLayout)((View)lj3).findViewById(2131369359);
                            n.LIZIZ((Object)frameLayout, "");
                            final int top = frameLayout.getTop();
                            final FrameLayout frameLayout2 = (FrameLayout)((View)lj3).findViewById(2131369359);
                            n.LIZIZ((Object)frameLayout2, "");
                            layoutParams2.topMargin = (int)(top + frameLayout2.getHeight() - layoutParams2.height * 0.5);
                        }
                        final 2Fb liz = this.LIZ;
                        final int width = layoutParams2.width;
                        if (width > 0) {
                            final int lizlll = RjR.LIZLLL(0cB.LIZJ(), 0cB.LIZIZ());
                            if (width < lizlll) {
                                final int n = (lizlll - width) / 2;
                                final ViewGroup lj4 = liz.LJ;
                                if (lj4 != null) {
                                    final View viewById3 = ((View)lj4).findViewById(2131367521);
                                    if (viewById3 != null) {
                                        GlD.LIZJ(viewById3);
                                    }
                                }
                                final ViewGroup lj5 = liz.LJ;
                                final ViewGroup$LayoutParams viewGroup$LayoutParams = null;
                                while (true) {
                                    Label_0536: {
                                        if (lj5 == null) {
                                            break Label_0536;
                                        }
                                        final View viewById4 = ((View)lj5).findViewById(2131367521);
                                        if (viewById4 == null) {
                                            break Label_0536;
                                        }
                                        final ViewGroup$LayoutParams layoutParams3 = viewById4.getLayoutParams();
                                        ViewGroup$LayoutParams layoutParams4;
                                        if ((layoutParams4 = layoutParams3) != null) {
                                            layoutParams3.width = n;
                                            layoutParams4 = layoutParams3;
                                        }
                                        final ViewGroup lj6 = liz.LJ;
                                        if (lj6 != null) {
                                            final View viewById5 = ((View)lj6).findViewById(2131367521);
                                            if (viewById5 != null) {
                                                viewById5.setLayoutParams(layoutParams4);
                                            }
                                        }
                                        final ViewGroup lj7 = liz.LJ;
                                        if (lj7 != null) {
                                            final View viewById6 = ((View)lj7).findViewById(2131370496);
                                            if (viewById6 != null) {
                                                GlD.LIZJ(viewById6);
                                            }
                                        }
                                        final ViewGroup lj8 = liz.LJ;
                                        ViewGroup$LayoutParams layoutParams5 = viewGroup$LayoutParams;
                                        if (lj8 != null) {
                                            final View viewById7 = ((View)lj8).findViewById(2131370496);
                                            layoutParams5 = viewGroup$LayoutParams;
                                            if (viewById7 != null) {
                                                final ViewGroup$LayoutParams layoutParams6 = viewById7.getLayoutParams();
                                                if ((layoutParams5 = layoutParams6) != null) {
                                                    layoutParams6.width = n;
                                                    layoutParams5 = layoutParams6;
                                                }
                                            }
                                        }
                                        final ViewGroup lj9 = liz.LJ;
                                        if (lj9 == null) {
                                            break Label_0107;
                                        }
                                        final View viewById8 = ((View)lj9).findViewById(2131370496);
                                        if (viewById8 != null) {
                                            viewById8.setLayoutParams(layoutParams5);
                                        }
                                        break Label_0107;
                                    }
                                    ViewGroup$LayoutParams layoutParams4 = null;
                                    continue;
                                }
                            }
                            final ViewGroup lj10 = liz.LJ;
                            if (lj10 != null) {
                                final View viewById9 = ((View)lj10).findViewById(2131367521);
                                if (viewById9 != null) {
                                    GlD.LIZ(viewById9);
                                }
                            }
                            final ViewGroup lj11 = liz.LJ;
                            if (lj11 != null) {
                                final View viewById10 = ((View)lj11).findViewById(2131370496);
                                if (viewById10 != null) {
                                    GlD.LIZ(viewById10);
                                }
                            }
                        }
                    }
                }
                this.LIZIZ.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
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
        //    24: new             LX/0tL;
        //    27: dup            
        //    28: aload_0        
        //    29: aload_1        
        //    30: iload_2        
        //    31: iload_3        
        //    32: invokespecial   X/0tL.<init>:(LX/2Fb;LX/Fld;II)V
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
    public final void LIZ(final Integer n, final ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        final FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -1);
        final ViewGroup lj = super.LJ;
        if (lj != null) {
            final int size = super.LJIIIZ.size();
            if (size != 2) {
                if (size != 3) {
                    if (size == 4) {
                        if (n != null) {
                            if (n == 0) {
                                final FrameLayout frameLayout = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout, "");
                                layoutParams.height = frameLayout.getHeight();
                                final FrameLayout frameLayout2 = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout2, "");
                                layoutParams.width = frameLayout2.getWidth();
                                layoutParams.gravity = 8388659;
                            }
                            else if (n == 1) {
                                final FrameLayout frameLayout3 = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout3, "");
                                layoutParams.height = frameLayout3.getHeight();
                                final FrameLayout frameLayout4 = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout4, "");
                                layoutParams.width = frameLayout4.getWidth();
                                layoutParams.gravity = 8388661;
                            }
                            else if (n == 2) {
                                final FrameLayout frameLayout5 = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout5, "");
                                layoutParams.height = frameLayout5.getHeight();
                                final FrameLayout frameLayout6 = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout6, "");
                                layoutParams.width = frameLayout6.getWidth();
                                layoutParams.gravity = 8388691;
                            }
                            else if (n == 3) {
                                final FrameLayout frameLayout7 = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout7, "");
                                layoutParams.height = frameLayout7.getHeight();
                                final FrameLayout frameLayout8 = (FrameLayout)((View)lj).findViewById(2131369359);
                                n.LIZIZ((Object)frameLayout8, "");
                                layoutParams.width = frameLayout8.getWidth();
                                layoutParams.gravity = 8388693;
                            }
                        }
                    }
                }
                else if (n != null) {
                    if (n == 0) {
                        final FrameLayout frameLayout9 = (FrameLayout)((View)lj).findViewById(2131369359);
                        n.LIZIZ((Object)frameLayout9, "");
                        layoutParams.height = frameLayout9.getHeight();
                        layoutParams.width = 0cB.LIZJ();
                        layoutParams.gravity = 48;
                    }
                    else if (n == 1) {
                        final FrameLayout frameLayout10 = (FrameLayout)((View)lj).findViewById(2131369359);
                        n.LIZIZ((Object)frameLayout10, "");
                        layoutParams.height = frameLayout10.getHeight();
                        final FrameLayout frameLayout11 = (FrameLayout)((View)lj).findViewById(2131369359);
                        n.LIZIZ((Object)frameLayout11, "");
                        layoutParams.width = frameLayout11.getWidth();
                        layoutParams.gravity = 8388691;
                    }
                    else if (n == 2) {
                        final FrameLayout frameLayout12 = (FrameLayout)((View)lj).findViewById(2131369359);
                        n.LIZIZ((Object)frameLayout12, "");
                        layoutParams.height = frameLayout12.getHeight();
                        final FrameLayout frameLayout13 = (FrameLayout)((View)lj).findViewById(2131369359);
                        n.LIZIZ((Object)frameLayout13, "");
                        layoutParams.width = frameLayout13.getWidth();
                        layoutParams.gravity = 8388693;
                    }
                }
            }
            else if (n != null) {
                if (n == 0) {
                    final FrameLayout frameLayout14 = (FrameLayout)((View)lj).findViewById(2131369359);
                    n.LIZIZ((Object)frameLayout14, "");
                    layoutParams.height = frameLayout14.getHeight();
                    layoutParams.width = 0cB.LIZJ();
                    layoutParams.gravity = 48;
                }
                else if (n == 1) {
                    final FrameLayout frameLayout15 = (FrameLayout)((View)lj).findViewById(2131369359);
                    n.LIZIZ((Object)frameLayout15, "");
                    layoutParams.height = frameLayout15.getHeight();
                    layoutParams.width = 0cB.LIZJ();
                    layoutParams.gravity = 80;
                }
            }
        }
        viewGroup.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    @Override
    public final int LIZIZ() {
        return 17;
    }
    
    @Override
    public final boolean LIZIZ(final int n) {
        return n == 13;
    }
    
    @Override
    public final 0k8 LIZJ() {
        return 0k8.GRID;
    }
    
    @Override
    public final void LIZJ(ViewGroup lj) {
        CTM.LIZ((Object)lj);
        final ViewGroup lj2 = super.LJ;
        if (lj2 != null) {
            final View viewById = ((View)lj2).findViewById(2131372473);
            if (viewById != null) {
                viewById.setVisibility(4);
            }
        }
        final ViewGroup lj3 = super.LJ;
        if (lj3 != null) {
            final View viewById2 = ((View)lj3).findViewById(2131363034);
            if (viewById2 != null) {
                viewById2.setVisibility(4);
            }
        }
        final ViewGroup lj4 = super.LJ;
        if (lj4 != null) {
            final View viewById3 = ((View)lj4).findViewById(2131372473);
            if (viewById3 != null) {
                final ViewGroup$LayoutParams layoutParams = viewById3.getLayoutParams();
                if (layoutParams != null) {
                    int height;
                    if (super.LIZLLL) {
                        height = 25H.LJIIJ;
                    }
                    else {
                        height = 25H.LJIIJJI;
                    }
                    layoutParams.height = height;
                }
            }
        }
        final ViewGroup lj5 = super.LJ;
        if (lj5 != null) {
            final View viewById4 = ((View)lj5).findViewById(2131363034);
            if (viewById4 != null) {
                final ViewGroup$LayoutParams layoutParams2 = viewById4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = 25H.LJIIJ;
                }
            }
        }
        final ViewGroup$LayoutParams layoutParams3 = lj.getLayoutParams();
        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        final ViewGroup$MarginLayoutParams layoutParams4 = (ViewGroup$MarginLayoutParams)layoutParams3;
        layoutParams4.height = -1;
        layoutParams4.topMargin = 0;
        lj.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
        lj = super.LJ;
        if (lj != null) {
            final FrameLayout frameLayout = (FrameLayout)((View)lj).findViewById(2131365290);
            n.LIZIZ((Object)frameLayout, "");
            frameLayout.setVisibility(0);
        }
    }
}
