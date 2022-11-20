// 
// Decompiled by Procyon v0.6.0
// 

package p8;

import java.io.IOException;
import com.bumptech.glide.load.ImageHeaderParser;
import s8.b;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

public final class c
{
    public final ParcelFileDescriptorRewinder a;
    public final b b;
    
    public c(final ParcelFileDescriptorRewinder a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final ImageHeaderParser p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3       
        //     4: new             Ljava/io/FileInputStream;
        //     7: astore          4
        //     9: aload           4
        //    11: aload_0        
        //    12: getfield        p8/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    15: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    18: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    21: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //    24: aload_3        
        //    25: aload           4
        //    27: aload_0        
        //    28: getfield        p8/c.b:Ls8/b;
        //    31: invokespecial   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.<init>:(Ljava/io/InputStream;Ls8/b;)V
        //    34: aload_1        
        //    35: aload_3        
        //    36: aload_0        
        //    37: getfield        p8/c.b:Ls8/b;
        //    40: invokeinterface com/bumptech/glide/load/ImageHeaderParser.b:(Ljava/io/InputStream;Ls8/b;)I
        //    45: istore_2       
        //    46: aload_3        
        //    47: invokevirtual   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.close:()V
        //    50: aload_0        
        //    51: getfield        p8/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    54: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    57: pop            
        //    58: iload_2        
        //    59: ireturn        
        //    60: astore_1       
        //    61: goto            67
        //    64: astore_1       
        //    65: aconst_null    
        //    66: astore_3       
        //    67: aload_3        
        //    68: ifnull          75
        //    71: aload_3        
        //    72: invokevirtual   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.close:()V
        //    75: aload_0        
        //    76: getfield        p8/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    79: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    82: pop            
        //    83: aload_1        
        //    84: athrow         
        //    85: astore_1       
        //    86: goto            50
        //    89: astore_3       
        //    90: goto            75
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      34     64     67     Any
        //  34     46     60     64     Any
        //  46     50     85     89     Ljava/io/IOException;
        //  71     75     89     93     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
