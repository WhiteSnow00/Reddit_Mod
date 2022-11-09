// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import java.util.ArrayList;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.n;
import android.widget.FrameLayout;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 26V extends 1mT
{
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LIZ;
    
    static {
        Covode.recordClassIndex(9628);
    }
    
    public 26V(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        super(dataChannel);
        1jw.LIZ.LIZ(this);
    }
    
    @Override
    public final int LIZ() {
        return 2131562259;
    }
    
    @Override
    public final int LIZ(View view, int liz) {
        MethodCollector.i(9796);
        CTM.LIZ((Object)view);
        final ViewGroup lizj = super.LIZJ;
        if (lizj == null) {
            MethodCollector.o(9796);
            return -1;
        }
        final View viewById = ((View)lizj).findViewById(2131372473);
        if (viewById != null) {
            viewById.setVisibility(0);
        }
        final View viewById2 = ((View)lizj).findViewById(2131363034);
        if (viewById2 != null) {
            viewById2.setVisibility(0);
        }
        this.LJIIIZ();
        final FrameLayout frameLayout = (FrameLayout)((View)lizj).findViewById(2131369360);
        if (frameLayout != null && frameLayout.getChildCount() == 0) {
            final FrameLayout frameLayout2 = (FrameLayout)((View)lizj).findViewById(2131369361);
            if (frameLayout2 != null && frameLayout2.getChildCount() == 0) {
                final FrameLayout frameLayout3 = (FrameLayout)((View)lizj).findViewById(2131369360);
                n.LIZIZ((Object)frameLayout3, "");
                frameLayout3.setVisibility(8);
                final FrameLayout frameLayout4 = (FrameLayout)((View)lizj).findViewById(2131369362);
                n.LIZIZ((Object)frameLayout4, "");
                frameLayout4.setVisibility(8);
                final FrameLayout frameLayout5 = (FrameLayout)((View)lizj).findViewById(2131369361);
                n.LIZIZ((Object)frameLayout5, "");
                frameLayout5.setVisibility(0);
                ((FrameLayout)((View)lizj).findViewById(2131369361)).addView(view, (ViewGroup$LayoutParams)this.LJIJ());
                view = ((View)lizj).findViewById(2131369067);
                if (view != null) {
                    view.setVisibility(0);
                }
                MethodCollector.o(9796);
                return 1;
            }
        }
        final FrameLayout frameLayout6 = (FrameLayout)((View)lizj).findViewById(2131369360);
        if (frameLayout6 != null && frameLayout6.getChildCount() == 0) {
            final FrameLayout frameLayout7 = (FrameLayout)((View)lizj).findViewById(2131369361);
            if (frameLayout7 != null && frameLayout7.getChildCount() > 0) {
                final FrameLayout frameLayout8 = (FrameLayout)((View)lizj).findViewById(2131369362);
                if (frameLayout8 != null && frameLayout8.getChildCount() == 0) {
                    final FrameLayout frameLayout9 = (FrameLayout)((View)lizj).findViewById(2131369360);
                    n.LIZIZ((Object)frameLayout9, "");
                    frameLayout9.setVisibility(8);
                    final FrameLayout frameLayout10 = (FrameLayout)((View)lizj).findViewById(2131369361);
                    n.LIZIZ((Object)frameLayout10, "");
                    frameLayout10.setVisibility(0);
                    final FrameLayout frameLayout11 = (FrameLayout)((View)lizj).findViewById(2131369362);
                    if (frameLayout11 != null) {
                        frameLayout11.setVisibility(0);
                    }
                    final FrameLayout frameLayout12 = (FrameLayout)((View)lizj).findViewById(2131369362);
                    if (frameLayout12 != null) {
                        frameLayout12.addView(view, (ViewGroup$LayoutParams)this.LJIJ());
                    }
                    view = ((View)lizj).findViewById(2131369071);
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    MethodCollector.o(9796);
                    return 2;
                }
            }
        }
        final FrameLayout frameLayout13 = (FrameLayout)((View)lizj).findViewById(2131369360);
        if (frameLayout13 != null && frameLayout13.getChildCount() == 0) {
            final FrameLayout frameLayout14 = (FrameLayout)((View)lizj).findViewById(2131369361);
            if (frameLayout14 != null && frameLayout14.getChildCount() > 0) {
                final FrameLayout frameLayout15 = (FrameLayout)((View)lizj).findViewById(2131369362);
                if (frameLayout15 != null && frameLayout15.getChildCount() > 0) {
                    final FrameLayout frameLayout16 = (FrameLayout)((View)lizj).findViewById(2131369361);
                    if (frameLayout16 != null) {
                        final View child = frameLayout16.getChildAt(0);
                        if (child != null) {
                            this.LIZ(child, (FrameLayout)((View)lizj).findViewById(2131369360));
                        }
                    }
                    final FrameLayout frameLayout17 = (FrameLayout)((View)lizj).findViewById(2131369362);
                    if (frameLayout17 != null) {
                        final View child2 = frameLayout17.getChildAt(0);
                        if (child2 != null) {
                            this.LIZ(child2, (FrameLayout)((View)lizj).findViewById(2131369361));
                        }
                    }
                    final FrameLayout frameLayout18 = (FrameLayout)((View)lizj).findViewById(2131369362);
                    if (frameLayout18 != null) {
                        frameLayout18.setVisibility(0);
                    }
                    final FrameLayout frameLayout19 = (FrameLayout)((View)lizj).findViewById(2131369362);
                    if (frameLayout19 != null) {
                        frameLayout19.addView(view, (ViewGroup$LayoutParams)this.LJIJ());
                    }
                    view = ((View)lizj).findViewById(2131369070);
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    MethodCollector.o(9796);
                    return 3;
                }
            }
        }
        liz = super.LIZ(view, liz);
        MethodCollector.o(9796);
        return liz;
    }
    
    @Override
    public final void LIZ(View view) {
        MethodCollector.i(9801);
        CTM.LIZ((Object)view);
        final ViewGroup lizj = super.LIZJ;
        if (lizj == null) {
            MethodCollector.o(9801);
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent != null) {
            if (n.LIZ((Object)parent, (Object)((View)lizj).findViewById(2131369360))) {
                ((FrameLayout)((View)lizj).findViewById(2131369360)).removeView(view);
            }
            else if (n.LIZ((Object)parent, (Object)((View)lizj).findViewById(2131369361))) {
                ((FrameLayout)((View)lizj).findViewById(2131369361)).removeView(view);
            }
            else if (n.LIZ((Object)parent, (Object)((View)lizj).findViewById(2131369362))) {
                ((FrameLayout)((View)lizj).findViewById(2131369362)).removeView(view);
            }
        }
        final ViewGroup lizj2 = super.LIZJ;
        if (lizj2 != null) {
            final ArrayList<View> lizj3 = this.LIZJ(lizj2);
            final int size = lizj3.size();
            if (size != 0) {
                if (size != 1) {
                    if (size == 2) {
                        final FrameLayout frameLayout = (FrameLayout)((View)lizj2).findViewById(2131369360);
                        n.LIZIZ((Object)frameLayout, "");
                        frameLayout.setVisibility(8);
                        final FrameLayout frameLayout2 = (FrameLayout)((View)lizj2).findViewById(2131369361);
                        n.LIZIZ((Object)frameLayout2, "");
                        frameLayout2.setVisibility(0);
                        final FrameLayout frameLayout3 = (FrameLayout)((View)lizj2).findViewById(2131369362);
                        if (frameLayout3 != null) {
                            frameLayout3.setVisibility(0);
                        }
                        final Object value = lizj3.get(0);
                        n.LIZIZ(value, "");
                        this.LIZ((View)value, (FrameLayout)((View)lizj2).findViewById(2131369361));
                        final Object value2 = lizj3.get(1);
                        n.LIZIZ(value2, "");
                        this.LIZ((View)value2, (FrameLayout)((View)lizj2).findViewById(2131369362));
                        final View viewById = ((View)lizj2).findViewById(2131369070);
                        if (viewById != null) {
                            viewById.setVisibility(8);
                        }
                        final View viewById2 = ((View)lizj2).findViewById(2131369071);
                        if (viewById2 != null) {
                            viewById2.setVisibility(0);
                        }
                        view = ((View)lizj2).findViewById(2131369067);
                        if (view != null) {
                            view.setVisibility(0);
                        }
                    }
                }
                else {
                    final FrameLayout frameLayout4 = (FrameLayout)((View)lizj2).findViewById(2131369360);
                    n.LIZIZ((Object)frameLayout4, "");
                    frameLayout4.setVisibility(8);
                    final FrameLayout frameLayout5 = (FrameLayout)((View)lizj2).findViewById(2131369362);
                    n.LIZIZ((Object)frameLayout5, "");
                    frameLayout5.setVisibility(8);
                    final FrameLayout frameLayout6 = (FrameLayout)((View)lizj2).findViewById(2131369361);
                    n.LIZIZ((Object)frameLayout6, "");
                    frameLayout6.setVisibility(0);
                    final Object value3 = lizj3.get(0);
                    n.LIZIZ(value3, "");
                    this.LIZ((View)value3, (FrameLayout)((View)lizj2).findViewById(2131369361));
                    final View viewById3 = ((View)lizj2).findViewById(2131369070);
                    if (viewById3 != null) {
                        viewById3.setVisibility(8);
                    }
                    final View viewById4 = ((View)lizj2).findViewById(2131369071);
                    if (viewById4 != null) {
                        viewById4.setVisibility(8);
                    }
                    view = ((View)lizj2).findViewById(2131369067);
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
            }
            else {
                final FrameLayout frameLayout7 = (FrameLayout)((View)lizj2).findViewById(2131369360);
                n.LIZIZ((Object)frameLayout7, "");
                frameLayout7.setVisibility(8);
                final FrameLayout frameLayout8 = (FrameLayout)((View)lizj2).findViewById(2131369361);
                n.LIZIZ((Object)frameLayout8, "");
                frameLayout8.setVisibility(8);
                final FrameLayout frameLayout9 = (FrameLayout)((View)lizj2).findViewById(2131369362);
                n.LIZIZ((Object)frameLayout9, "");
                frameLayout9.setVisibility(8);
                final View viewById5 = ((View)lizj2).findViewById(2131372473);
                if (viewById5 != null) {
                    viewById5.setVisibility(8);
                }
                final View viewById6 = ((View)lizj2).findViewById(2131363034);
                if (viewById6 != null) {
                    viewById6.setVisibility(8);
                }
                final View viewById7 = ((View)lizj2).findViewById(2131369070);
                if (viewById7 != null) {
                    viewById7.setVisibility(8);
                }
                final View viewById8 = ((View)lizj2).findViewById(2131369071);
                if (viewById8 != null) {
                    viewById8.setVisibility(8);
                }
                view = ((View)lizj2).findViewById(2131369067);
                if (view != null) {
                    view.setVisibility(8);
                }
            }
            this.LJIIIZ();
        }
        final 1Uo liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        if (liz.LJII == 0) {
            final 1Uo liz2 = this.LIZ;
            if (liz2 == null) {
                n.LIZ("");
            }
            liz2.LIZIZ(0k8.NORMAL);
        }
        MethodCollector.o(9801);
    }
    
    @Override
    public final void LIZ(final ViewGroup viewGroup) {
        public final class 26T extends F5g implements SRS<Integer, 2P9>
        {
            public final /* synthetic */ 26V LIZ;
            
            static {
                Covode.recordClassIndex(9629);
            }
            
            public 26T(final 26V liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 26U extends F5g implements SRS<8si<? extends Boolean, ? extends Integer>, 2P9>
        {
            public final /* synthetic */ 26V LIZ;
            
            static {
                Covode.recordClassIndex(9630);
            }
            
            public 26U(final 26V liz) {
                this.LIZ = liz;
                super(1);
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
        //    10: getfield        X/1ZI.LIZJ:Landroid/view/ViewGroup;
        //    13: astore_1       
        //    14: aload_1        
        //    15: ifnull          35
        //    18: aload_1        
        //    19: ldc             2131372473
        //    21: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    24: astore_1       
        //    25: aload_1        
        //    26: ifnull          35
        //    29: aload_1        
        //    30: bipush          8
        //    32: invokevirtual   android/view/View.setVisibility:(I)V
        //    35: aload_0        
        //    36: getfield        X/1ZI.LIZJ:Landroid/view/ViewGroup;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          61
        //    44: aload_1        
        //    45: ldc             2131363034
        //    47: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    50: astore_1       
        //    51: aload_1        
        //    52: ifnull          61
        //    55: aload_1        
        //    56: bipush          8
        //    58: invokevirtual   android/view/View.setVisibility:(I)V
        //    61: aload_0        
        //    62: invokevirtual   X/26V.LJIIIZ:()V
        //    65: aload_0        
        //    66: getfield        X/1ZI.LJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    69: astore_1       
        //    70: aload_1        
        //    71: aload_0        
        //    72: ldc             LX/2EK;.class
        //    74: new             LX/26T;
        //    77: dup            
        //    78: aload_0        
        //    79: invokespecial   X/26T.<init>:(LX/26V;)V
        //    82: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    85: pop            
        //    86: aload_1        
        //    87: aload_0        
        //    88: ldc             LX/GsA;.class
        //    90: new             LX/26U;
        //    93: dup            
        //    94: aload_0        
        //    95: invokespecial   X/26U.<init>:(LX/26V;)V
        //    98: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   101: pop            
        //   102: return         
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
    public final 0k8 LIZLLL() {
        return 0k8.GRID;
    }
    
    @Override
    public final boolean LJ() {
        return false;
    }
    
    public final void LJIIIZ() {
        public final class 0vE implements Runnable
        {
            public final /* synthetic */ 26V LIZ;
            
            static {
                Covode.recordClassIndex(9631);
            }
            
            public 0vE(final 26V liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                final DataChannel lji = this.LIZ.LJI;
                final 0k8 grid = 0k8.GRID;
                final ViewGroup lizj = this.LIZ.LIZJ;
                FrameLayout frameLayout;
                if (lizj != null) {
                    frameLayout = (FrameLayout)((View)lizj).findViewById(2131369359);
                }
                else {
                    frameLayout = null;
                }
                final boolean lizlll = this.LIZ.LIZLLL;
                final ViewGroup lizj2 = this.LIZ.LIZJ;
                while (true) {
                    Label_0112: {
                        if (lizj2 == null) {
                            break Label_0112;
                        }
                        final View viewById = ((View)lizj2).findViewById(2131372473);
                        if (viewById == null || viewById.getVisibility() != 0) {
                            break Label_0112;
                        }
                        final boolean b = true;
                        lji.LIZJ((Class)2ET.class, (Object)new 1NR(grid, frameLayout, lizlll, false, 0, 0, 0, 0, b, 0, 3824));
                        return;
                    }
                    final boolean b = false;
                    continue;
                }
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
        //    10: new             LX/0vE;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/0vE.<init>:(LX/26V;)V
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
