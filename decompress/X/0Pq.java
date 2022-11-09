// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public final class 0pq
{
    public final String LIZ;
    public boolean LIZIZ;
    public DataChannel LIZJ;
    public FrameLayout LIZLLL;
    public final 1NN LJ;
    public FrameLayout LJFF;
    public final SRT<VzU, 1Wh<1T0>, 2P9> LJI;
    public final SRT<VzU, 1Wh<1Sz>, 2P9> LJII;
    public final SRT<VzU, 1Wh<1Sv>, 2P9> LJIIIIZZ;
    public final SRT<VzU, 1Wh<1Sy>, 2P9> LJIIIZ;
    
    static {
        Covode.recordClassIndex(8254);
    }
    
    public 0pq() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: ldc             "MultiCoHostWindowManager"
        //     7: putfield        X/0pq.LIZ:Ljava/lang/String;
        //    10: aload_0        
        //    11: getstatic       X/1NN.LLFF:LX/0k5;
        //    14: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    17: putfield        X/0pq.LJ:LX/1NN;
        //    20: aload_0        
        //    21: new             LX/1z1;
        //    24: dup            
        //    25: aload_0        
        //    26: invokespecial   X/1z1.<init>:(LX/0pq;)V
        //    29: putfield        X/0pq.LJI:LX/SRT;
        //    32: aload_0        
        //    33: new             LX/1z0;
        //    36: dup            
        //    37: aload_0        
        //    38: invokespecial   X/1z0.<init>:(LX/0pq;)V
        //    41: putfield        X/0pq.LJII:LX/SRT;
        //    44: aload_0        
        //    45: new             LX/1yy;
        //    48: dup            
        //    49: aload_0        
        //    50: invokespecial   X/1yy.<init>:(LX/0pq;)V
        //    53: putfield        X/0pq.LJIIIIZZ:LX/SRT;
        //    56: aload_0        
        //    57: new             LX/1yz;
        //    60: dup            
        //    61: aload_0        
        //    62: invokespecial   X/1yz.<init>:(LX/0pq;)V
        //    65: putfield        X/0pq.LJIIIZ:LX/SRT;
        //    68: return         
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
    
    public final 1Sk LIZ(final String s) {
        CTM.LIZ((Object)s);
        final FrameLayout lizlll = this.LIZLLL;
        if (lizlll != null) {
            return (1Sk)lizlll.findViewWithTag((Object)s);
        }
        return null;
    }
    
    public final void LIZ() {
        MethodCollector.i(8706);
        final FrameLayout ljff = this.LJFF;
        if (ljff != null) {
            ljff.removeAllViews();
            MethodCollector.o(8706);
            return;
        }
        MethodCollector.o(8706);
    }
}
