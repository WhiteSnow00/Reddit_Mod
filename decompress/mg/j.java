// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.io.IOException;
import java.io.File;
import java.util.HashSet;
import java.util.zip.ZipFile;
import java.util.Set;

public final class j implements l
{
    public final /* synthetic */ Set a;
    public final /* synthetic */ q b;
    public final /* synthetic */ ZipFile c;
    
    public j(final HashSet a, final q b, final ZipFile c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final m p0, final File p1, final boolean p2) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        mg/j.a:Ljava/util/Set;
        //     4: aload_2        
        //     5: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //    10: pop            
        //    11: iload_3        
        //    12: ifne            194
        //    15: ldc             "SplitCompat"
        //    17: ldc             "NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'"
        //    19: iconst_5       
        //    20: anewarray       Ljava/lang/Object;
        //    23: dup            
        //    24: iconst_0       
        //    25: aload_0        
        //    26: getfield        mg/j.b:Lmg/q;
        //    29: invokevirtual   mg/q.b:()Ljava/lang/String;
        //    32: aastore        
        //    33: dup            
        //    34: iconst_1       
        //    35: aload_1        
        //    36: getfield        mg/m.a:Ljava/lang/String;
        //    39: aastore        
        //    40: dup            
        //    41: iconst_2       
        //    42: aload_0        
        //    43: getfield        mg/j.b:Lmg/q;
        //    46: invokevirtual   mg/q.a:()Ljava/io/File;
        //    49: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    52: aastore        
        //    53: dup            
        //    54: iconst_3       
        //    55: aload_1        
        //    56: getfield        mg/m.b:Ljava/util/zip/ZipEntry;
        //    59: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //    62: aastore        
        //    63: dup            
        //    64: iconst_4       
        //    65: aload_2        
        //    66: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    69: aastore        
        //    70: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //    73: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //    76: pop            
        //    77: aload_0        
        //    78: getfield        mg/j.c:Ljava/util/zip/ZipFile;
        //    81: astore          4
        //    83: aload_1        
        //    84: getfield        mg/m.b:Ljava/util/zip/ZipEntry;
        //    87: astore_1       
        //    88: sipush          4096
        //    91: newarray        B
        //    93: astore          5
        //    95: aload_2        
        //    96: invokevirtual   java/io/File.exists:()Z
        //    99: ifeq            107
        //   102: aload_2        
        //   103: invokevirtual   java/io/File.delete:()Z
        //   106: pop            
        //   107: aload           4
        //   109: aload_1        
        //   110: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //   113: astore_1       
        //   114: new             Ljava/io/FileOutputStream;
        //   117: astore          4
        //   119: aload           4
        //   121: aload_2        
        //   122: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   125: aload_2        
        //   126: iconst_0       
        //   127: iconst_1       
        //   128: invokevirtual   java/io/File.setWritable:(ZZ)Z
        //   131: pop            
        //   132: aload_2        
        //   133: iconst_0       
        //   134: iconst_0       
        //   135: invokevirtual   java/io/File.setWritable:(ZZ)Z
        //   138: pop            
        //   139: aload_1        
        //   140: aload           5
        //   142: invokevirtual   java/io/InputStream.read:([B)I
        //   145: istore          6
        //   147: iload           6
        //   149: ifle            165
        //   152: aload           4
        //   154: aload           5
        //   156: iconst_0       
        //   157: iload           6
        //   159: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //   162: goto            139
        //   165: aload           4
        //   167: invokevirtual   java/io/FileOutputStream.close:()V
        //   170: aload_1        
        //   171: invokevirtual   java/io/InputStream.close:()V
        //   174: return         
        //   175: astore_2       
        //   176: aload           4
        //   178: invokevirtual   java/io/FileOutputStream.close:()V
        //   181: aload_2        
        //   182: athrow         
        //   183: astore_2       
        //   184: aload_1        
        //   185: ifnull          192
        //   188: aload_1        
        //   189: invokevirtual   java/io/InputStream.close:()V
        //   192: aload_2        
        //   193: athrow         
        //   194: return         
        //   195: astore          5
        //   197: goto            181
        //   200: astore_1       
        //   201: goto            192
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  114    125    183    194    Any
        //  125    139    175    183    Any
        //  139    147    175    183    Any
        //  152    162    175    183    Any
        //  165    170    183    194    Any
        //  176    181    195    200    Any
        //  181    183    183    194    Any
        //  188    192    200    204    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 111, Size: 111
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
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
