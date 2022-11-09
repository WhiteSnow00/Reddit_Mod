// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewParent;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View;
import java.util.List;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.ViewGroup;

@0kX(LIZ = "LAYOUT_MANAGER")
public final class 0tc
{
    public ViewGroup LIZ;
    public 0uh LIZIZ;
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LIZJ;
    public final DataChannel LIZLLL;
    public final 5DO LJ;
    
    static {
        Covode.recordClassIndex(9371);
    }
    
    public 0tc(final DataChannel lizlll) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokespecial   java/lang/Object.<init>:()V
        //     8: aload_0        
        //     9: aload_1        
        //    10: putfield        X/0tc.LIZLLL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    13: getstatic       X/1jw.LIZ:LX/1jw;
        //    16: aload_0        
        //    17: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;)V
        //    20: aload_0        
        //    21: getstatic       X/25S.LIZ:LX/25S;
        //    24: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    27: putfield        X/0tc.LJ:LX/5DO;
        //    30: aload_1        
        //    31: aload_0        
        //    32: ldc             LX/2GE;.class
        //    34: new             LX/25Q;
        //    37: dup            
        //    38: aload_0        
        //    39: invokespecial   X/25Q.<init>:(LX/0tc;)V
        //    42: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    45: pop            
        //    46: getstatic       X/1jw.LIZ:LX/1jw;
        //    49: aload_0        
        //    50: invokestatic    X/0kS.LIZ:(LX/0kT;Ljava/lang/Object;)V
        //    53: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //    56: aload_0        
        //    57: ldc             LX/2DM;.class
        //    59: new             LX/25R;
        //    62: dup            
        //    63: aload_0        
        //    64: invokespecial   X/25R.<init>:(LX/0tc;)V
        //    67: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)V
        //    70: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
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
    
    public final List<View> LIZ() {
        return (List)this.LJ.getValue();
    }
    
    public final void LIZ(final 0k8 0k8) {
        MethodCollector.i(8378);
        CTM.LIZ((Object)0k8);
        final 0uh liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LJIILLIIL();
        }
        final 0uh liziz2 = this.LIZIZ;
        0k8 lizlll;
        if (liziz2 != null) {
            lizlll = liziz2.LIZLLL();
        }
        else {
            lizlll = null;
        }
        if (lizlll == 0k8) {
            final 1Uo lizj = this.LIZJ;
            if (lizj == null) {
                n.LIZ("");
            }
            lizj.LIZIZ(0k8);
            MethodCollector.o(8378);
            return;
        }
        for (final View view : this.LIZ()) {
            if (view instanceof 1ln) {
                ((1ln)view).setAdjustParent(true);
            }
        }
        final 0uh liziz3 = this.LIZIZ;
        if (liziz3 != null) {
            final ViewGroup liz = this.LIZ;
            if (liz == null) {
                n.LIZ("");
            }
            liziz3.LIZIZ(liz);
        }
        final int n = 0td.LIZ[0k8.ordinal()];
        1ZI liziz4;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            MethodCollector.o(8378);
                            return;
                        }
                        liziz4 = new 1mD(this.LIZLLL);
                    }
                    else {
                        liziz4 = new 25O(this.LIZLLL);
                    }
                }
                else {
                    liziz4 = new 25P(this.LIZLLL);
                }
            }
            else {
                liziz4 = new 25M(this.LIZLLL);
            }
        }
        else {
            liziz4 = new 25N(this.LIZLLL);
        }
        final ViewGroup liz2 = this.LIZ;
        if (liz2 == null) {
            kotlin.jvm.internal.n.LIZ("");
        }
        liziz4.LIZ(liz2);
        for (final View view2 : this.LIZ()) {
            final ViewParent parent = view2.getParent();
            if (parent != null) {
                ((ViewGroup)parent).removeView(view2);
            }
            final boolean b = view2 instanceof 1ln;
            int lizlll2;
            if (b) {
                lizlll2 = 5ob.LIZ.LIZLLL(((1ln)view2).getInteractId());
            }
            else {
                lizlll2 = 0;
            }
            liziz4.LIZ(view2, lizlll2);
            if (b) {
                final 1ln 1ln = (1ln)view2;
                1ln.setPosInMultiLive(lizlll2);
                final String simpleName = 0tc.class.getSimpleName();
                kotlin.jvm.internal.n.LIZIZ((Object)simpleName, "");
                final StringBuilder sb = new StringBuilder("set ");
                sb.append(1ln.getPosInMultiLive());
                0xo.LIZ(simpleName, sb.toString());
                ((1ln)view2).setAdjustParent(false);
            }
        }
        this.LIZIZ = liziz4;
        if (this.LIZ().isEmpty()) {
            final 0uh liziz5 = this.LIZIZ;
            if (liziz5 != null) {
                liziz5.LJIJI();
            }
        }
        final 1Uo lizj2 = this.LIZJ;
        if (lizj2 == null) {
            kotlin.jvm.internal.n.LIZ("");
        }
        lizj2.LIZIZ(0k8);
        this.LIZLLL.LIZJ((Class)2G4.class, (Object)0k8);
        MethodCollector.o(8378);
    }
    
    public final void LIZ(final View view) {
        CTM.LIZ((Object)view);
        final 0uh liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(view);
        }
        this.LIZ().remove(view);
    }
    
    public final 0k8 LIZIZ() {
        final 0uh liziz = this.LIZIZ;
        0k8 0k8;
        if (liziz == null || (0k8 = liziz.LIZLLL()) == null) {
            0k8 = X.0k8.NORMAL;
        }
        return 0k8;
    }
}
