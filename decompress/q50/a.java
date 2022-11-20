// 
// Decompiled by Procyon v0.6.0
// 

package q50;

import fk2.e;
import okhttp3.MediaType;
import java.io.IOException;
import sa.m;
import java.io.File;
import okhttp3.RequestBody;

public final class a extends RequestBody
{
    public final File a;
    public final String b;
    public final String c;
    public final m d;
    
    public a(final File a, final String b, final m d) {
        this.a = a;
        this.c = "video/mp4";
        this.b = b;
        this.d = d;
    }
    
    public final long contentLength() throws IOException {
        return this.a.length();
    }
    
    public final MediaType contentType() {
        return MediaType.parse(this.c);
    }
    
    public final void writeTo(final e p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        q50/a.a:Ljava/io/File;
        //     4: invokevirtual   java/io/File.length:()J
        //     7: lstore          7
        //     9: ldc             65536
        //    11: newarray        B
        //    13: astore          10
        //    15: new             Ljava/io/BufferedInputStream;
        //    18: astore          9
        //    20: new             Ljava/io/FileInputStream;
        //    23: astore          11
        //    25: aload           11
        //    27: aload_0        
        //    28: getfield        q50/a.a:Ljava/io/File;
        //    31: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    34: aload           9
        //    36: aload           11
        //    38: ldc             65536
        //    40: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;I)V
        //    43: iconst_0       
        //    44: istore          5
        //    46: iconst_m1      
        //    47: istore_3       
        //    48: aload           9
        //    50: aload           10
        //    52: invokevirtual   java/io/InputStream.read:([B)I
        //    55: istore          4
        //    57: iload           4
        //    59: iconst_m1      
        //    60: if_icmpeq       170
        //    63: aload_1        
        //    64: iconst_0       
        //    65: iload           4
        //    67: aload           10
        //    69: invokeinterface fk2/e.q2:(II[B)Lfk2/e;
        //    74: pop            
        //    75: aload_0        
        //    76: getfield        q50/a.d:Lsa/m;
        //    79: ifnull          48
        //    82: iload           5
        //    84: iload           4
        //    86: iadd           
        //    87: istore          5
        //    89: iload           5
        //    91: i2f            
        //    92: lload           7
        //    94: l2f            
        //    95: fdiv           
        //    96: ldc             100.0
        //    98: fmul           
        //    99: ldc             0.5
        //   101: fadd           
        //   102: f2i            
        //   103: istore          6
        //   105: iload_3        
        //   106: istore          4
        //   108: iload           6
        //   110: iload_3        
        //   111: if_icmple       158
        //   114: aload_0        
        //   115: getfield        q50/a.b:Ljava/lang/String;
        //   118: astore          11
        //   120: iload           6
        //   122: i2f            
        //   123: ldc             100.0
        //   125: fdiv           
        //   126: fstore_2       
        //   127: getstatic       com/reddit/data/postsubmit/VideoUploadService.H:Lio/reactivex/subjects/PublishSubject;
        //   130: astore          13
        //   132: new             Lcom/reddit/data/postsubmit/VideoUploadService$i;
        //   135: astore          12
        //   137: aload           12
        //   139: aload           11
        //   141: fload_2        
        //   142: invokespecial   com/reddit/data/postsubmit/VideoUploadService$i.<init>:(Ljava/lang/String;F)V
        //   145: aload           13
        //   147: aload           12
        //   149: invokeinterface af2/a0.onNext:(Ljava/lang/Object;)V
        //   154: iload           6
        //   156: istore          4
        //   158: aload_1        
        //   159: invokeinterface fk2/e.flush:()V
        //   164: iload           4
        //   166: istore_3       
        //   167: goto            48
        //   170: aload           9
        //   172: invokevirtual   java/io/InputStream.close:()V
        //   175: return         
        //   176: astore_1       
        //   177: goto            184
        //   180: astore_1       
        //   181: aconst_null    
        //   182: astore          9
        //   184: aload           9
        //   186: ifnull          194
        //   189: aload           9
        //   191: invokevirtual   java/io/InputStream.close:()V
        //   194: aload_1        
        //   195: athrow         
        //   196: astore_1       
        //   197: goto            175
        //   200: astore          9
        //   202: goto            194
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  15     43     180    184    Any
        //  48     57     176    180    Any
        //  63     82     176    180    Any
        //  114    120    176    180    Any
        //  127    154    176    180    Any
        //  158    164    176    180    Any
        //  170    175    196    200    Ljava/lang/Exception;
        //  189    194    200    205    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0170:
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
}
