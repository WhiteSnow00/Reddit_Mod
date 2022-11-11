// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import java.io.IOException;
import com.bumptech.glide.load.ImageHeaderParser;
import r8.b;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

public final class c
{
    public final /* synthetic */ ParcelFileDescriptorRewinder a;
    public final /* synthetic */ b b;
    
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
        //     3: astore_2       
        //     4: new             Ljava/io/FileInputStream;
        //     7: astore_3       
        //     8: aload_3        
        //     9: aload_0        
        //    10: getfield        o8/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    13: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    16: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //    19: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //    22: aload_2        
        //    23: aload_3        
        //    24: aload_0        
        //    25: getfield        o8/c.b:Lr8/b;
        //    28: invokespecial   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.<init>:(Ljava/io/InputStream;Lr8/b;)V
        //    31: aload_1        
        //    32: aload_2        
        //    33: aload_0        
        //    34: getfield        o8/c.b:Lr8/b;
        //    37: invokeinterface com/bumptech/glide/load/ImageHeaderParser.c:(Ljava/io/InputStream;Lr8/b;)I
        //    42: istore          4
        //    44: aload_2        
        //    45: invokevirtual   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.close:()V
        //    48: aload_0        
        //    49: getfield        o8/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    52: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    55: pop            
        //    56: iload           4
        //    58: ireturn        
        //    59: astore_1       
        //    60: goto            66
        //    63: astore_1       
        //    64: aconst_null    
        //    65: astore_2       
        //    66: aload_2        
        //    67: ifnull          74
        //    70: aload_2        
        //    71: invokevirtual   com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream.close:()V
        //    74: aload_0        
        //    75: getfield        o8/c.a:Lcom/bumptech/glide/load/data/ParcelFileDescriptorRewinder;
        //    78: invokevirtual   com/bumptech/glide/load/data/ParcelFileDescriptorRewinder.c:()Landroid/os/ParcelFileDescriptor;
        //    81: pop            
        //    82: aload_1        
        //    83: athrow         
        //    84: astore_1       
        //    85: goto            48
        //    88: astore_2       
        //    89: goto            74
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  0      31     63     66     Any
        //  31     44     59     63     Any
        //  44     48     84     88     Ljava/io/IOException;
        //  70     74     88     92     Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
