// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;

public final class 10A
{
    public static final a LIZ;
    
    static {
        Covode.recordClassIndex(10675);
        LIZ = new a((byte)0);
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(10676);
        }
        
        public final void LIZ(final ImageModel imageModel, final 0zx 0zx) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ifnull          22
            //     4: aload_1        
            //     5: invokevirtual   com/bytedance/android/live/base/model/ImageModel.getUrls:()Ljava/util/List;
            //     8: astore_3       
            //     9: aload_3        
            //    10: ifnull          22
            //    13: aload_3        
            //    14: invokeinterface java/util/Collection.isEmpty:()Z
            //    19: ifeq            37
            //    22: new             Ljava/lang/IllegalArgumentException;
            //    25: dup            
            //    26: invokespecial   java/lang/IllegalArgumentException.<init>:()V
            //    29: pop            
            //    30: aload_2        
            //    31: invokeinterface X/0zx.LIZ:()V
            //    36: return         
            //    37: aload_1        
            //    38: invokevirtual   com/bytedance/android/live/base/model/ImageModel.getUrls:()Ljava/util/List;
            //    41: iconst_0       
            //    42: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
            //    47: checkcast       Ljava/lang/String;
            //    50: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
            //    53: invokestatic    X/S8f.LIZ:(Landroid/net/Uri;)LX/S8f;
            //    56: invokevirtual   X/S8f.LIZ:()LX/S8e;
            //    59: astore_1       
            //    60: invokestatic    X/S7y.LIZIZ:()LX/S7y;
            //    63: invokevirtual   X/S7y.LJIIIIZZ:()LX/S85;
            //    66: aload_1        
            //    67: aconst_null    
            //    68: invokevirtual   X/S85.LIZJ:(LX/S8e;Ljava/lang/Object;)LX/Qom;
            //    71: new             LX/1mv;
            //    74: dup            
            //    75: aload_2        
            //    76: invokespecial   X/1mv.<init>:(LX/0zx;)V
            //    79: invokestatic    X/6up.LIZIZ:()LX/6up;
            //    82: invokeinterface X/Qom.LIZ:(LX/SAV;Ljava/util/concurrent/Executor;)V
            //    87: return         
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
