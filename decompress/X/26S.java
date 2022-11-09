// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.n;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 26S extends 1mT
{
    static {
        Covode.recordClassIndex(9621);
    }
    
    public 26S(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        super(dataChannel);
    }
    
    private final void LIZ(final ViewGroup viewGroup, final ViewGroup viewGroup2, final View view) {
        MethodCollector.i(8414);
        if (viewGroup.getChildCount() == 0) {
            viewGroup.addView(view, (ViewGroup$LayoutParams)this.LJIJ());
            GlD.LIZ((View)viewGroup2);
        }
        MethodCollector.o(8414);
    }
    
    @Override
    public final int LIZ() {
        return 2131562260;
    }
    
    @Override
    public final int LIZ(final View view, int liz) {
        CTM.LIZ((Object)view);
        final ViewGroup lizj = super.LIZJ;
        if (lizj == null) {
            return -1;
        }
        this.LJIIIZ();
        final int lizj2 = this.LIZJ(liz);
        final int n = 3;
        if (lizj2 != 1) {
            if (lizj2 != 2) {
                if (lizj2 != 3) {
                    liz = super.LIZ(view, liz);
                }
                else {
                    final FrameLayout frameLayout = (FrameLayout)((View)lizj).findViewById(2131369362);
                    kotlin.jvm.internal.n.LIZIZ((Object)frameLayout, "");
                    final FrameLayout frameLayout2 = (FrameLayout)((View)lizj).findViewById(2131364843);
                    kotlin.jvm.internal.n.LIZIZ((Object)frameLayout2, "");
                    this.LIZ((ViewGroup)frameLayout, (ViewGroup)frameLayout2, view);
                    liz = n;
                }
            }
            else {
                final FrameLayout frameLayout3 = (FrameLayout)((View)lizj).findViewById(2131369361);
                kotlin.jvm.internal.n.LIZIZ((Object)frameLayout3, "");
                final FrameLayout frameLayout4 = (FrameLayout)((View)lizj).findViewById(2131364842);
                kotlin.jvm.internal.n.LIZIZ((Object)frameLayout4, "");
                this.LIZ((ViewGroup)frameLayout3, (ViewGroup)frameLayout4, view);
                liz = 2;
            }
        }
        else {
            final FrameLayout frameLayout5 = (FrameLayout)((View)lizj).findViewById(2131369360);
            kotlin.jvm.internal.n.LIZIZ((Object)frameLayout5, "");
            final FrameLayout frameLayout6 = (FrameLayout)((View)lizj).findViewById(2131364841);
            kotlin.jvm.internal.n.LIZIZ((Object)frameLayout6, "");
            this.LIZ((ViewGroup)frameLayout5, (ViewGroup)frameLayout6, view);
            liz = 1;
        }
        this.LJIJI();
        return liz;
    }
    
    @Override
    public final void LIZ(final ViewGroup viewGroup) {
        public final class 26Q extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ 26S LIZ;
            
            static {
                Covode.recordClassIndex(9625);
            }
            
            public 26Q(final 26S liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 26R extends F5g implements SRS<8si<? extends Boolean, ? extends Integer>, 2P9>
        {
            public final /* synthetic */ 26S LIZ;
            
            static {
                Covode.recordClassIndex(9626);
            }
            
            public 26R(final 26S liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 0vC implements View$OnClickListener
        {
            public final /* synthetic */ 26S LIZ;
            
            static {
                Covode.recordClassIndex(9624);
            }
            
            public 0vC(final 26S liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.LIZ(3);
            }
        }
        public final class 0vB implements View$OnClickListener
        {
            public final /* synthetic */ 26S LIZ;
            
            static {
                Covode.recordClassIndex(9623);
            }
            
            public 0vB(final 26S liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.LIZ(2);
            }
        }
        public final class 0vA implements View$OnClickListener
        {
            public final /* synthetic */ 26S LIZ;
            
            static {
                Covode.recordClassIndex(9622);
            }
            
            public 0vA(final 26S liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                this.LIZ.LIZ(1);
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
        //     6: invokespecial   X/1mT.LIZ:(Landroid/view/ViewGroup;)V
        //     9: aload_0        
        //    10: invokevirtual   X/26S.LJIIIZ:()V
        //    13: aload_0        
        //    14: getfield        X/1ZI.LIZJ:Landroid/view/ViewGroup;
        //    17: astore_1       
        //    18: aload_1        
        //    19: ifnull          48
        //    22: aload_1        
        //    23: ldc             2131364841
        //    25: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    28: checkcast       Landroid/widget/FrameLayout;
        //    31: astore_1       
        //    32: aload_1        
        //    33: ifnull          48
        //    36: aload_1        
        //    37: new             LX/0vA;
        //    40: dup            
        //    41: aload_0        
        //    42: invokespecial   X/0vA.<init>:(LX/26S;)V
        //    45: invokevirtual   android/widget/FrameLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    48: aload_0        
        //    49: getfield        X/1ZI.LIZJ:Landroid/view/ViewGroup;
        //    52: astore_1       
        //    53: aload_1        
        //    54: ifnull          83
        //    57: aload_1        
        //    58: ldc             2131364842
        //    60: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    63: checkcast       Landroid/widget/FrameLayout;
        //    66: astore_1       
        //    67: aload_1        
        //    68: ifnull          83
        //    71: aload_1        
        //    72: new             LX/0vB;
        //    75: dup            
        //    76: aload_0        
        //    77: invokespecial   X/0vB.<init>:(LX/26S;)V
        //    80: invokevirtual   android/widget/FrameLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    83: aload_0        
        //    84: getfield        X/1ZI.LIZJ:Landroid/view/ViewGroup;
        //    87: astore_1       
        //    88: aload_1        
        //    89: ifnull          118
        //    92: aload_1        
        //    93: ldc             2131364843
        //    95: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    98: checkcast       Landroid/widget/FrameLayout;
        //   101: astore_1       
        //   102: aload_1        
        //   103: ifnull          118
        //   106: aload_1        
        //   107: new             LX/0vC;
        //   110: dup            
        //   111: aload_0        
        //   112: invokespecial   X/0vC.<init>:(LX/26S;)V
        //   115: invokevirtual   android/widget/FrameLayout.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   118: aload_0        
        //   119: getfield        X/1ZI.LJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   122: astore_1       
        //   123: aload_1        
        //   124: aload_0        
        //   125: ldc             LX/2EK;.class
        //   127: new             LX/26Q;
        //   130: dup            
        //   131: aload_0        
        //   132: invokespecial   X/26Q.<init>:(LX/26S;)V
        //   135: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   138: pop            
        //   139: aload_1        
        //   140: aload_0        
        //   141: ldc             LX/GsA;.class
        //   143: new             LX/26R;
        //   146: dup            
        //   147: aload_0        
        //   148: invokespecial   X/26R.<init>:(LX/26S;)V
        //   151: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   154: pop            
        //   155: return         
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
    
    public final void LIZIZ(int n) {
        if (n <= 0) {
            return;
        }
        if (n.LIZ(super.LJI.LIZIZ((Class)G5i.class), (Object)true)) {
            return;
        }
        final int lizlll = RjR.LIZLLL(0cB.LIZJ(), 0cB.LIZIZ());
        if (n < lizlll) {
            n = (lizlll - n) / 2;
            final ViewGroup lizj = super.LIZJ;
            if (lizj != null) {
                final View viewById = ((View)lizj).findViewById(2131367521);
                if (viewById != null) {
                    GlD.LIZJ(viewById);
                }
            }
            final ViewGroup lizj2 = super.LIZJ;
            final ConstraintLayout.a a = null;
            while (true) {
                Label_0256: {
                    if (lizj2 == null) {
                        break Label_0256;
                    }
                    final View viewById2 = ((View)lizj2).findViewById(2131367521);
                    if (viewById2 == null) {
                        break Label_0256;
                    }
                    final ViewGroup$LayoutParams layoutParams = viewById2.getLayoutParams();
                    Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)layoutParams;
                    layoutParams2.width = n;
                    final ViewGroup lizj3 = super.LIZJ;
                    if (lizj3 != null) {
                        final View viewById3 = ((View)lizj3).findViewById(2131367521);
                        if (viewById3 != null) {
                            viewById3.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        }
                    }
                    final ViewGroup lizj4 = super.LIZJ;
                    if (lizj4 != null) {
                        final View viewById4 = ((View)lizj4).findViewById(2131370496);
                        if (viewById4 != null) {
                            GlD.LIZJ(viewById4);
                        }
                    }
                    final ViewGroup lizj5 = super.LIZJ;
                    Object layoutParams3 = a;
                    if (lizj5 != null) {
                        final View viewById5 = ((View)lizj5).findViewById(2131370496);
                        layoutParams3 = a;
                        if (viewById5 != null) {
                            layoutParams3 = viewById5.getLayoutParams();
                        }
                    }
                    Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    final ConstraintLayout.a layoutParams4 = (ConstraintLayout.a)layoutParams3;
                    layoutParams4.width = n;
                    final ViewGroup lizj6 = super.LIZJ;
                    if (lizj6 != null) {
                        final View viewById6 = ((View)lizj6).findViewById(2131370496);
                        if (viewById6 != null) {
                            viewById6.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
                        }
                    }
                    return;
                }
                final ViewGroup$LayoutParams layoutParams = null;
                continue;
            }
        }
        final ViewGroup lizj7 = super.LIZJ;
        if (lizj7 != null) {
            final View viewById7 = ((View)lizj7).findViewById(2131367521);
            if (viewById7 != null) {
                GlD.LIZ(viewById7);
            }
        }
        final ViewGroup lizj8 = super.LIZJ;
        if (lizj8 != null) {
            final View viewById8 = ((View)lizj8).findViewById(2131370496);
            if (viewById8 != null) {
                GlD.LIZ(viewById8);
            }
        }
    }
    
    @Override
    public final int LIZJ() {
        return 2131562250;
    }
    
    @Override
    public final 0k8 LIZLLL() {
        return 0k8.GRID_FIX;
    }
    
    @Override
    public final boolean LJ() {
        return true;
    }
    
    public final void LJIIIZ() {
        public final class 0vD implements Runnable
        {
            public final /* synthetic */ 26S LIZ;
            
            static {
                Covode.recordClassIndex(9627);
            }
            
            public 0vD(final 26S liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                final 0k8 grid_FIX = 0k8.GRID_FIX;
                final ViewGroup lizj = this.LIZ.LIZJ;
                FrameLayout frameLayout;
                if (lizj != null) {
                    frameLayout = (FrameLayout)((View)lizj).findViewById(2131369359);
                }
                else {
                    frameLayout = null;
                }
                this.LIZ.LJI.LIZJ((Class)2ET.class, (Object)new 1NR(grid_FIX, frameLayout, this.LIZ.LIZLLL, false, 0, 0, 0, 0, false, 0, 4088));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1ZI.LIZJ:Landroid/view/ViewGroup;
        //     4: astore_1       
        //     5: aload_1        
        //     6: ifnull          22
        //     9: aload_1        
        //    10: new             LX/0vD;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/0vD.<init>:(LX/26S;)V
        //    18: invokevirtual   android/view/ViewGroup.post:(Ljava/lang/Runnable;)Z
        //    21: pop            
        //    22: return         
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
