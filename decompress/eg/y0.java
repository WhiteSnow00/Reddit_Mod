// 
// Decompiled by Procyon v0.6.0
// 

package eg;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import o8.l;

public final class y0 implements u
{
    public static final l g;
    
    public static String b(final List p0) throws NoSuchAlgorithmException, IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    java/security/MessageDigest.getInstance:(Ljava/lang/String;)Ljava/security/MessageDigest;
        //     5: astore_1       
        //     6: sipush          8192
        //     9: newarray        B
        //    11: astore_2       
        //    12: aload_0        
        //    13: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    18: astore_3       
        //    19: aload_3        
        //    20: invokeinterface java/util/Iterator.hasNext:()Z
        //    25: ifeq            85
        //    28: new             Ljava/io/FileInputStream;
        //    31: dup            
        //    32: aload_3        
        //    33: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    38: checkcast       Ljava/io/File;
        //    41: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    44: astore_0       
        //    45: aload_0        
        //    46: aload_2        
        //    47: invokevirtual   java/io/InputStream.read:([B)I
        //    50: istore          4
        //    52: iload           4
        //    54: ifle            65
        //    57: aload_1        
        //    58: aload_2        
        //    59: iconst_0       
        //    60: iload           4
        //    62: invokevirtual   java/security/MessageDigest.update:([BII)V
        //    65: iload           4
        //    67: iconst_m1      
        //    68: if_icmpne       45
        //    71: aload_0        
        //    72: invokevirtual   java/io/InputStream.close:()V
        //    75: goto            19
        //    78: astore_2       
        //    79: aload_0        
        //    80: invokevirtual   java/io/InputStream.close:()V
        //    83: aload_2        
        //    84: athrow         
        //    85: aload_1        
        //    86: invokevirtual   java/security/MessageDigest.digest:()[B
        //    89: bipush          11
        //    91: invokestatic    android/util/Base64.encodeToString:([BI)Ljava/lang/String;
        //    94: areturn        
        //    95: astore_0       
        //    96: goto            83
        //    Exceptions:
        //  throws java.security.NoSuchAlgorithmException
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  45     52     78     85     Any
        //  57     65     78     85     Any
        //  79     83     95     99     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    public static boolean c(final int n) {
        return n == 2 || n == 7 || n == 3;
    }
    
    public static boolean d(int n, final int n2) {
        int n3 = n;
        if (n == 5) {
            if (n2 != 5) {
                return true;
            }
            n3 = 5;
        }
        if ((n = n3) == 6) {
            if (n2 != 6 && n2 != 5) {
                return true;
            }
            n = 6;
        }
        return (n == 4 && n2 != 4) || (n == 3 && (n2 == 2 || n2 == 7 || n2 == 1 || n2 == 8)) || (n == 2 && (n2 == 1 || n2 == 8));
    }
    
    public int a(final int n) {
        return n;
    }
}
