// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;
import java.util.regex.Pattern;

public final class p
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");
    }
    
    public static ArrayList a(final File p0, final File p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/ArrayList.<init>:()V
        //     7: astore_2       
        //     8: aload_1        
        //     9: getstatic       eg/j1.a:Leg/j1;
        //    12: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ifnonnull       28
        //    20: iconst_0       
        //    21: anewarray       Ljava/io/File;
        //    24: astore_1       
        //    25: goto            107
        //    28: aload_3        
        //    29: arraylength    
        //    30: istore          4
        //    32: iload           4
        //    34: anewarray       Ljava/io/File;
        //    37: astore_1       
        //    38: iconst_0       
        //    39: istore          5
        //    41: iload           5
        //    43: iload           4
        //    45: if_icmpge       107
        //    48: aload_3        
        //    49: iload           5
        //    51: aaload         
        //    52: astore          6
        //    54: aload           6
        //    56: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    59: ldc             "-"
        //    61: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //    64: iconst_0       
        //    65: aaload         
        //    66: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //    69: istore          7
        //    71: iload           7
        //    73: aload_3        
        //    74: arraylength    
        //    75: if_icmpgt       97
        //    78: aload_1        
        //    79: iload           7
        //    81: aaload         
        //    82: ifnonnull       97
        //    85: aload_1        
        //    86: iload           7
        //    88: aload           6
        //    90: aastore        
        //    91: iinc            5, 1
        //    94: goto            41
        //    97: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   100: dup            
        //   101: ldc             "Metadata folder ordering corrupt."
        //   103: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;)V
        //   106: athrow         
        //   107: aload_1        
        //   108: arraylength    
        //   109: istore          4
        //   111: iconst_0       
        //   112: istore          5
        //   114: iload           5
        //   116: iload           4
        //   118: if_icmpge       269
        //   121: aload_1        
        //   122: iload           5
        //   124: aaload         
        //   125: astore          6
        //   127: aload_2        
        //   128: aload           6
        //   130: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   133: pop            
        //   134: aload           6
        //   136: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   139: ldc             "LFH"
        //   141: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   144: ifeq            263
        //   147: new             Ljava/io/FileInputStream;
        //   150: dup            
        //   151: aload           6
        //   153: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   156: astore          6
        //   158: new             Lcom/google/android/play/core/assetpacks/f;
        //   161: astore_3       
        //   162: aload_3        
        //   163: aload           6
        //   165: invokespecial   com/google/android/play/core/assetpacks/f.<init>:(Ljava/io/InputStream;)V
        //   168: aload_3        
        //   169: invokevirtual   com/google/android/play/core/assetpacks/f.b:()Leg/a0;
        //   172: astore          8
        //   174: aload           8
        //   176: getfield        eg/a0.a:Ljava/lang/String;
        //   179: ifnull          243
        //   182: new             Ljava/io/File;
        //   185: astore_3       
        //   186: aload_3        
        //   187: aload_0        
        //   188: aload           8
        //   190: getfield        eg/a0.a:Ljava/lang/String;
        //   193: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   196: aload_3        
        //   197: invokevirtual   java/io/File.exists:()Z
        //   200: ifeq            217
        //   203: aload_2        
        //   204: aload_3        
        //   205: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   208: pop            
        //   209: aload           6
        //   211: invokevirtual   java/io/InputStream.close:()V
        //   214: goto            263
        //   217: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   220: astore_0       
        //   221: aload_0        
        //   222: ldc             "Missing asset file %s during slice reconstruction."
        //   224: iconst_1       
        //   225: anewarray       Ljava/lang/Object;
        //   228: dup            
        //   229: iconst_0       
        //   230: aload_3        
        //   231: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //   234: aastore        
        //   235: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   238: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;)V
        //   241: aload_0        
        //   242: athrow         
        //   243: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   246: astore_0       
        //   247: aload_0        
        //   248: ldc             "Metadata files corrupt. Could not read local file header."
        //   250: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;)V
        //   253: aload_0        
        //   254: athrow         
        //   255: astore_0       
        //   256: aload           6
        //   258: invokevirtual   java/io/InputStream.close:()V
        //   261: aload_0        
        //   262: athrow         
        //   263: iinc            5, 1
        //   266: goto            114
        //   269: aload_2        
        //   270: areturn        
        //   271: astore_1       
        //   272: goto            261
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  158    209    255    263    Any
        //  217    243    255    263    Any
        //  243    255    255    263    Any
        //  256    261    271    275    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
