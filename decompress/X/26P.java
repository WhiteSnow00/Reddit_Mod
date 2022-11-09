// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.Resources;
import android.content.Context;
import java.util.Iterator;
import java.util.ArrayList;
import android.view.ViewGroup;
import kotlin.jvm.internal.n;
import android.widget.FrameLayout;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 26P extends 1mT
{
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LIZ;
    
    static {
        Covode.recordClassIndex(9617);
    }
    
    public 26P(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        super(dataChannel);
        1jw.LIZ.LIZ(this);
    }
    
    @Override
    public final int LIZ() {
        return 2131562257;
    }
    
    @Override
    public final int LIZ(final View view, final int n) {
        CTM.LIZ((Object)view);
        this.LJIIIZ();
        return super.LIZ(view, n);
    }
    
    @Override
    public final void LIZ(final View view) {
        CTM.LIZ((Object)view);
        super.LIZ(view);
        final ViewGroup lizj = super.LIZJ;
        if (lizj != null) {
            final ArrayList<View> lizj2 = this.LIZJ(lizj);
            int n = 0;
            for (final View next : lizj2) {
                final int n2 = n + 1;
                if (n < 0) {
                    Ey9.LIZ();
                }
                final View view2 = next;
                FrameLayout frameLayout = null;
                Label_0130: {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 == 3) {
                                final ViewGroup lizj3 = super.LIZJ;
                                if (lizj3 != null) {
                                    frameLayout = (FrameLayout)((View)lizj3).findViewById(2131369362);
                                    break Label_0130;
                                }
                            }
                        }
                        else {
                            final ViewGroup lizj4 = super.LIZJ;
                            if (lizj4 != null) {
                                frameLayout = (FrameLayout)((View)lizj4).findViewById(2131369361);
                                break Label_0130;
                            }
                        }
                    }
                    else {
                        final ViewGroup lizj5 = super.LIZJ;
                        if (lizj5 != null) {
                            frameLayout = (FrameLayout)((View)lizj5).findViewById(2131369360);
                            break Label_0130;
                        }
                    }
                    frameLayout = null;
                }
                this.LIZ(view2, frameLayout);
                n = n2;
            }
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
    }
    
    @Override
    public final void LIZ(final ViewGroup lizj) {
        public final class 26O extends F5g implements SRS<8si<? extends Boolean, ? extends Integer>, 2P9>
        {
            public final /* synthetic */ 26P LIZ;
            
            static {
                Covode.recordClassIndex(9619);
            }
            
            public 26O(final 26P liz) {
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
        //    10: invokevirtual   X/26P.LJIIIZ:()V
        //    13: aload_0        
        //    14: getfield        X/1ZI.LIZJ:Landroid/view/ViewGroup;
        //    17: astore_1       
        //    18: aload_1        
        //    19: ifnull          35
        //    22: aload_1        
        //    23: new             LX/0v8;
        //    26: dup            
        //    27: aload_0        
        //    28: invokespecial   X/0v8.<init>:(LX/26P;)V
        //    31: invokevirtual   android/view/ViewGroup.post:(Ljava/lang/Runnable;)Z
        //    34: pop            
        //    35: aload_0        
        //    36: getfield        X/1ZI.LJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    39: aload_0        
        //    40: ldc             LX/GsA;.class
        //    42: new             LX/26O;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   X/26O.<init>:(LX/26P;)V
        //    50: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    53: pop            
        //    54: return         
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
    
    @Override
    public final int LIZIZ() {
        final ViewGroup lizj = super.LIZJ;
        if (lizj != null) {
            final Context context = lizj.getContext();
            if (context != null) {
                final Resources resources = context.getResources();
                if (resources != null) {
                    return resources.getDimensionPixelSize(2131166159);
                }
            }
        }
        return 0;
    }
    
    @Override
    public final 0k8 LIZLLL() {
        return 0k8.FLOATING;
    }
    
    @Override
    public final boolean LJ() {
        return false;
    }
    
    public final void LJIIIZ() {
        public final class 0v9 implements Runnable
        {
            public final /* synthetic */ 26P LIZ;
            
            static {
                Covode.recordClassIndex(9620);
            }
            
            public 0v9(final 26P liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                final DataChannel lji = this.LIZ.LJI;
                final 0k8 floating = 0k8.FLOATING;
                final ViewGroup lizj = this.LIZ.LIZJ;
                FrameLayout frameLayout;
                if (lizj != null) {
                    frameLayout = (FrameLayout)((View)lizj).findViewById(2131369359);
                }
                else {
                    frameLayout = null;
                }
                lji.LIZJ((Class)2ET.class, (Object)new 1NR(floating, frameLayout, this.LIZ.LIZLLL, false, 0, 0, 0, 0, false, this.LIZ.LIZIZ(), 2032));
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
        //    10: new             LX/0v9;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/0v9.<init>:(LX/26P;)V
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
    
    public final int LJIIJ() {
        final ViewGroup lizj = super.LIZJ;
        while (true) {
            Label_0054: {
                if (lizj == null) {
                    break Label_0054;
                }
                final FrameLayout frameLayout = (FrameLayout)((View)lizj).findViewById(2131369359);
                if (frameLayout == null) {
                    break Label_0054;
                }
                final Integer value = frameLayout.getHeight();
                final int n = 0cB.LIZIZ() - 0cB.LIZLLL();
                if (value == null) {
                    return n;
                }
                final int intValue = value.intValue();
                if (intValue == 0) {
                    return n;
                }
                return intValue;
            }
            final Integer value = null;
            continue;
        }
    }
    
    public final double LJIIJJI() {
        final 8si 8si = (8si)super.LJI.LIZIZ((Class)2EW.class);
        final int n = 0;
        if (8si != null) {
            final Integer n2 = (Integer)8si.getFirst();
            int n3 = 0;
            int intValue2 = 0;
            Label_0066: {
                int intValue;
                if (n2 != null) {
                    intValue = n2;
                }
                else {
                    n3 = 0;
                    intValue = 0;
                    intValue2 = n;
                    if (8si == null) {
                        break Label_0066;
                    }
                }
                final Integer n4 = (Integer)8si.getSecond();
                n3 = intValue;
                intValue2 = n;
                if (n4 != null) {
                    intValue2 = n4;
                    n3 = intValue;
                }
            }
            if (n3 != 0) {
                final int n5 = n3;
                final int n6;
                if ((n6 = intValue2) != 0) {
                    return this.LJIIJ() * n5 * 1.0 / n6;
                }
            }
        }
        final int n5 = 480;
        int n6 = 864;
        return this.LJIIJ() * n5 * 1.0 / n6;
    }
}
