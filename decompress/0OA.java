// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;

public final class 0Oa
{
    public static int LIZ;
    
    static {
        Covode.recordClassIndex(3989);
        0Oa.LIZ = -1;
    }
    
    public static ArrayList<Long> LIZ(final String s) {
        public final class 0OZ implements FilenameFilter
        {
            static {
                Covode.recordClassIndex(3990);
            }
            
            @Override
            public final boolean accept(final File file, final String s) {
                try {
                    Long.parseLong(s);
                    return true;
                }
                catch (final NumberFormatException ex) {
                    return false;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_1       
        //     8: new             Ljava/io/File;
        //    11: dup            
        //    12: aload_0        
        //    13: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    16: new             LX/0OZ;
        //    19: dup            
        //    20: invokespecial   X/0OZ.<init>:()V
        //    23: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //    26: astore_0       
        //    27: aload_0        
        //    28: arraylength    
        //    29: istore_2       
        //    30: iconst_0       
        //    31: istore_3       
        //    32: iload_3        
        //    33: iload_2        
        //    34: if_icmpge       60
        //    37: aload_1        
        //    38: aload_0        
        //    39: iload_3        
        //    40: aaload         
        //    41: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    44: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    47: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    50: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    53: pop            
        //    54: iinc            3, 1
        //    57: goto            32
        //    60: aload_1        
        //    61: areturn        
        //    Signature:
        //  (Ljava/lang/String;)Ljava/util/ArrayList<Ljava/lang/Long;>;
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
