// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;

public final class 0Bo
{
    static {
        Covode.recordClassIndex(1237);
    }
    
    public static <X, Y> LiveData<Y> LIZ(final LiveData<X> liveData, final 01c<X, Y> 01c) {
        public final class 15l implements 0Bf<X>
        {
            public final /* synthetic */ 1gA LIZ;
            public final /* synthetic */ 01c LIZIZ;
            
            static {
                Covode.recordClassIndex(1238);
            }
            
            public 15l(final 1gA liz, final 01c liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void onChanged(final X x) {
                this.LIZ.setValue(this.LIZIZ.LIZ(x));
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   X/1gA.<init>:()V
        //     7: astore_2       
        //     8: aload_2        
        //     9: aload_0        
        //    10: new             LX/15l;
        //    13: dup            
        //    14: aload_2        
        //    15: aload_1        
        //    16: invokespecial   X/15l.<init>:(LX/1gA;LX/01c;)V
        //    19: invokevirtual   X/1gA.LIZ:(Landroidx/lifecycle/LiveData;LX/0Bf;)V
        //    22: aload_2        
        //    23: areturn        
        //    Signature:
        //  <X:Ljava/lang/Object;Y:Ljava/lang/Object;>(Landroidx/lifecycle/LiveData<TX;>;LX/01c<TX;TY;>;)Landroidx/lifecycle/LiveData<TY;>;
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
}
